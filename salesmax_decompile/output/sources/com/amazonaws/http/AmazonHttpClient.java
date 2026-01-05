package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.Signer;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.TimingInfo;
import com.amazonaws.util.URIBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public class AmazonHttpClient {
    private static final String HEADER_SDK_RETRY_INFO = "aws-sdk-retry";
    private static final String HEADER_SDK_TRANSACTION_ID = "aws-sdk-invocation-id";
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final int HTTP_STATUS_MULTIPLE_CHOICES = 300;
    private static final int HTTP_STATUS_OK = 200;
    private static final int HTTP_STATUS_REQ_TOO_LONG = 413;
    private static final int HTTP_STATUS_SERVICE_UNAVAILABLE = 503;
    private static final int HTTP_STATUS_TEMP_REDIRECT = 307;
    private static final long TIME_MILLISEC = 1000;
    final ClientConfiguration config;
    final HttpClient httpClient;
    private final HttpRequestFactory requestFactory;
    private final RequestMetricCollector requestMetricCollector;
    private static final Log REQUEST_LOG = LogFactory.getLog("com.amazonaws.request");
    static final Log log = LogFactory.getLog((Class<?>) AmazonHttpClient.class);

    public AmazonHttpClient(ClientConfiguration clientConfiguration) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration));
    }

    public static String createUserAgentString(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    private String getServerDateFromException(String str) {
        return str.substring(str.indexOf("(") + 1, str.contains(" + 15") ? str.indexOf(" + 15") : str.indexOf(" - 15"));
    }

    private <T extends Throwable> T handleUnexpectedFailure(T t, AWSRequestMetrics aWSRequestMetrics) {
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.Exception;
        aWSRequestMetrics.incrementCounter(field);
        aWSRequestMetrics.addProperty(field, t);
        return t;
    }

    private boolean isRequestSuccessful(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusCode();
        return statusCode >= 200 && statusCode < 300;
    }

    private static boolean isTemporaryRedirect(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusCode();
        String str = httpResponse.getHeaders().get("Location");
        return (statusCode != 307 || str == null || str.isEmpty()) ? false : true;
    }

    private long pauseBeforeNextRetry(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) throws InterruptedException {
        int i2 = (i - 1) - 1;
        long jDelayBeforeNextRetry = retryPolicy.getBackoffStrategy().delayBeforeNextRetry(amazonWebServiceRequest, amazonClientException, i2);
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Retriable error detected, will retry in " + jDelayBeforeNextRetry + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(jDelayBeforeNextRetry);
            return jDelayBeforeNextRetry;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    private boolean shouldRetry(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        int maxErrorRetry = this.config.getMaxErrorRetry();
        if (maxErrorRetry < 0 || !retryPolicy.isMaxErrorRetryInClientConfigHonored()) {
            maxErrorRetry = retryPolicy.getMaxErrorRetry();
        }
        if (i2 >= maxErrorRetry) {
            return false;
        }
        if (inputStream == null || inputStream.markSupported()) {
            return retryPolicy.getRetryCondition().shouldRetry(amazonWebServiceRequest, amazonClientException, i2);
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Content not repeatable");
        }
        return false;
    }

    public void afterError(Request<?> request, Response<?> response, List<RequestHandler2> list, AmazonClientException amazonClientException) {
        Iterator<RequestHandler2> it = list.iterator();
        while (it.hasNext()) {
            it.next().afterError(request, response, amazonClientException);
        }
    }

    public <T> void afterResponse(Request<?> request, List<RequestHandler2> list, Response<T> response, TimingInfo timingInfo) {
        Iterator<RequestHandler2> it = list.iterator();
        while (it.hasNext()) {
            it.next().afterResponse(request, response);
        }
    }

    public <T> Response<T> execute(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponseHandler<AmazonServiceException> httpResponseHandler2, ExecutionContext executionContext) throws Throwable {
        Response<T> responseExecuteHelper;
        if (request.getHostPrefix() != null) {
            try {
                URI endpoint = request.getEndpoint();
                request.setEndpoint(URIBuilder.builder(endpoint).host(request.getHostPrefix() + endpoint.getHost()).build());
            } catch (URISyntaxException e) {
                Log log2 = log;
                if (log2.isDebugEnabled()) {
                    log2.debug("Failed to prepend host prefix: " + e.getMessage(), e);
                }
            }
        }
        if (executionContext == null) {
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        }
        List<RequestHandler2> listRequestHandler2s = requestHandler2s(request, executionContext);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        try {
            responseExecuteHelper = executeHelper(request, httpResponseHandler, httpResponseHandler2, executionContext);
        } catch (AmazonClientException e2) {
            e = e2;
            responseExecuteHelper = null;
        }
        try {
            afterResponse(request, listRequestHandler2s, responseExecuteHelper, awsRequestMetrics.getTimingInfo().endTiming());
            return responseExecuteHelper;
        } catch (AmazonClientException e3) {
            e = e3;
            afterError(request, responseExecuteHelper, listRequestHandler2s, e);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d4 A[Catch: IOException -> 0x02dc, TRY_LEAVE, TryCatch #54 {IOException -> 0x02dc, blocks: (B:133:0x02ce, B:135:0x02d4), top: B:281:0x02ce }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03be A[Catch: all -> 0x0444, TRY_ENTER, TryCatch #16 {all -> 0x0444, blocks: (B:220:0x03b4, B:223:0x03be, B:224:0x03d4, B:226:0x0417, B:237:0x0443, B:186:0x0365, B:187:0x036a), top: B:256:0x03b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0417 A[Catch: all -> 0x0444, TRY_LEAVE, TryCatch #16 {all -> 0x0444, blocks: (B:220:0x03b4, B:223:0x03be, B:224:0x03d4, B:226:0x0417, B:237:0x0443, B:186:0x0365, B:187:0x036a), top: B:256:0x03b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0449 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0443 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d A[Catch: all -> 0x00e5, IOException -> 0x037e, Error -> 0x038d, RuntimeException -> 0x039a, TRY_ENTER, TRY_LEAVE, TryCatch #14 {IOException -> 0x037e, blocks: (B:46:0x0121, B:48:0x0129, B:50:0x012e, B:51:0x0134, B:52:0x0135, B:54:0x013d, B:55:0x0155), top: B:254:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d6  */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [long] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Response<T> executeHelper(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponseHandler<AmazonServiceException> httpResponseHandler2, ExecutionContext executionContext) throws Throwable {
        Throwable th;
        Object obj;
        HttpResponse httpResponse;
        boolean z;
        Object obj2;
        Object obj3;
        Signer signerByURI;
        long jPauseBeforeNextRetry;
        Object obj4;
        HttpResponse httpResponse2;
        Object obj5;
        Throwable th2;
        int i;
        LinkedHashMap linkedHashMap;
        Log log2;
        AmazonClientException amazonClientException;
        Object obj6;
        Log log3;
        HttpRequest httpRequestCreateHttpRequest;
        Object obj7;
        HttpRequest httpRequest;
        HttpResponse httpResponseExecute;
        Object obj8;
        HttpResponse httpResponse3;
        HttpResponse httpResponse4;
        HttpResponse httpResponse5;
        boolean zNeedsConnectionLeftOpen;
        Object obj9;
        Object obj10;
        AmazonClientException amazonClientException2;
        HttpResponse httpResponse6;
        ExecutionContext executionContext2 = executionContext;
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.ServiceName, request.getServiceName());
        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.ServiceEndpoint, request.getEndpoint());
        setUserAgent(request);
        request.addHeader(HEADER_SDK_TRANSACTION_ID, UUID.randomUUID().toString());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(request.getParameters());
        HashMap map = new HashMap(request.getHeaders());
        InputStream content = request.getContent();
        if (content != null && content.markSupported()) {
            content.mark(-1);
        }
        AWSCredentials credentials = executionContext.getCredentials();
        int i2 = 0;
        long j = 0;
        AmazonClientException amazonClientException3 = null;
        Signer signer = null;
        HttpResponse httpResponse7 = null;
        URI uriCreate = null;
        HttpRequest httpRequest2 = null;
        boolean z2 = false;
        while (true) {
            HttpResponse httpResponse8 = httpResponse7;
            int i3 = i2 + 1;
            boolean z3 = z2;
            long j2 = j;
            ?? authority = i3;
            awsRequestMetrics.setCounter(AWSRequestMetrics.Field.RequestCount, (long) authority);
            if (i3 > 1) {
                request.setParameters(linkedHashMap2);
                request.setHeaders(map);
                request.setContent(content);
            }
            if (uriCreate != null && request.getEndpoint() == null && request.getResourcePath() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(uriCreate.getScheme());
                sb.append("://");
                authority = uriCreate.getAuthority();
                sb.append((String) authority);
                request.setEndpoint(URI.create(sb.toString()));
                request.setResourcePath(uriCreate.getPath());
            }
            try {
                if (i3 > 1) {
                    try {
                        try {
                            try {
                                AWSRequestMetrics.Field field = AWSRequestMetrics.Field.RetryPauseTime;
                                awsRequestMetrics.startEvent(field);
                                try {
                                    jPauseBeforeNextRetry = pauseBeforeNextRetry(request.getOriginalRequest(), amazonClientException3, i3, this.config.getRetryPolicy());
                                    try {
                                        awsRequestMetrics.endEvent(field);
                                        InputStream content2 = request.getContent();
                                        if (content2 != null && content2.markSupported()) {
                                            content2.reset();
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        j2 = jPauseBeforeNextRetry;
                                        obj3 = "Cannot close the response content.";
                                        signerByURI = signer;
                                        i = i3;
                                        obj6 = obj3;
                                        linkedHashMap = linkedHashMap2;
                                        obj5 = obj6;
                                        try {
                                            log2 = log;
                                            if (log2.isDebugEnabled()) {
                                            }
                                            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.Exception;
                                            awsRequestMetrics.incrementCounter(field2);
                                            awsRequestMetrics.addProperty(field2, e);
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                            amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                            if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            th = th2;
                                            obj2 = obj5;
                                            httpResponse2 = httpResponse8;
                                            obj4 = obj2;
                                            z = z3;
                                            httpResponse = httpResponse2;
                                            obj = obj4;
                                            if (z) {
                                                throw th;
                                            }
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RetryPauseTime);
                                    throw th4;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj2 = "Cannot close the response content.";
                                httpResponse2 = httpResponse8;
                                obj4 = obj2;
                                z = z3;
                                httpResponse = httpResponse2;
                                obj = obj4;
                                if (z) {
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Error e3) {
                        e = e3;
                        throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                    } catch (RuntimeException e4) {
                        e = e4;
                        throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                    }
                } else {
                    jPauseBeforeNextRetry = j2;
                }
            } catch (Throwable th6) {
                th = th6;
                z = authority;
                httpResponse = i3;
                obj = executionContext2;
            }
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i3 - 1);
                    sb2.append("/");
                    sb2.append(jPauseBeforeNextRetry);
                    request.addHeader(HEADER_SDK_RETRY_INFO, sb2.toString());
                    signerByURI = signer == null ? executionContext2.getSignerByURI(request.getEndpoint()) : signer;
                } catch (IOException e5) {
                    e = e5;
                    j2 = jPauseBeforeNextRetry;
                    obj5 = "Cannot close the response content.";
                    i = i3;
                    linkedHashMap = linkedHashMap2;
                    signerByURI = signer;
                }
                if (signerByURI == null || credentials == null) {
                    log3 = REQUEST_LOG;
                    if (log3.isDebugEnabled()) {
                        log3.debug("Sending Request: " + request.toString());
                    }
                    httpRequestCreateHttpRequest = this.requestFactory.createHttpRequest(request, this.config, executionContext2);
                    try {
                        AWSRequestMetrics.Field field3 = AWSRequestMetrics.Field.HttpRequestTime;
                        awsRequestMetrics.startEvent(field3);
                    } catch (IOException e6) {
                        e = e6;
                        j2 = jPauseBeforeNextRetry;
                        obj7 = "Cannot close the response content.";
                        httpRequest = httpRequestCreateHttpRequest;
                        i = i3;
                        linkedHashMap = linkedHashMap2;
                    }
                    try {
                        httpResponseExecute = this.httpClient.execute(httpRequestCreateHttpRequest);
                        try {
                            try {
                                awsRequestMetrics.endEvent(field3);
                            } catch (IOException e7) {
                                e = e7;
                                j2 = jPauseBeforeNextRetry;
                            }
                            if (isRequestSuccessful(httpResponseExecute)) {
                                j2 = jPauseBeforeNextRetry;
                                try {
                                    if (isTemporaryRedirect(httpResponseExecute)) {
                                        try {
                                            String str = httpResponseExecute.getHeaders().get("Location");
                                            Log log4 = log;
                                            StringBuilder sb3 = new StringBuilder();
                                            obj9 = "Cannot close the response content.";
                                            try {
                                                sb3.append("Redirecting to: ");
                                                sb3.append(str);
                                                log4.debug(sb3.toString());
                                                uriCreate = URI.create(str);
                                                request.setEndpoint(null);
                                                request.setResourcePath(null);
                                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(httpResponseExecute.getStatusCode()));
                                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.RedirectLocation, str);
                                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                                httpRequest = httpRequestCreateHttpRequest;
                                                i = i3;
                                                z2 = z3;
                                                obj10 = obj9;
                                                amazonClientException2 = null;
                                                linkedHashMap = linkedHashMap2;
                                                httpResponse6 = httpResponseExecute;
                                                if (!z2 && httpResponse6 != null) {
                                                    try {
                                                        if (httpResponse6.getRawContent() != null) {
                                                            httpResponse6.getRawContent().close();
                                                        }
                                                    } catch (IOException e8) {
                                                        log.warn(obj10, e8);
                                                    }
                                                }
                                                amazonClientException3 = amazonClientException2;
                                                httpResponse7 = httpResponse6;
                                                signer = signerByURI;
                                                j = j2;
                                                httpRequest2 = httpRequest;
                                            } catch (IOException e9) {
                                                e = e9;
                                                httpResponse8 = httpResponseExecute;
                                                httpRequest2 = httpRequestCreateHttpRequest;
                                                i = i3;
                                                obj6 = obj9;
                                                linkedHashMap = linkedHashMap2;
                                                obj5 = obj6;
                                                log2 = log;
                                                if (log2.isDebugEnabled()) {
                                                }
                                                AWSRequestMetrics.Field field22 = AWSRequestMetrics.Field.Exception;
                                                awsRequestMetrics.incrementCounter(field22);
                                                awsRequestMetrics.addProperty(field22, e);
                                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                                amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                                if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                                }
                                            } catch (Error e10) {
                                                e = e10;
                                                throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                            } catch (RuntimeException e11) {
                                                e = e11;
                                                throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                            } catch (Throwable th7) {
                                                th = th7;
                                                th = th;
                                                httpResponse = httpResponseExecute;
                                                z = z3;
                                                obj = obj9;
                                                if (z) {
                                                }
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                            obj9 = "Cannot close the response content.";
                                        } catch (Error e13) {
                                            e = e13;
                                            obj9 = "Cannot close the response content.";
                                        } catch (RuntimeException e14) {
                                            e = e14;
                                            obj9 = "Cannot close the response content.";
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj9 = "Cannot close the response content.";
                                        }
                                    } else {
                                        try {
                                            boolean zNeedsConnectionLeftOpen2 = httpResponseHandler2.needsConnectionLeftOpen();
                                            try {
                                                AmazonServiceException amazonServiceExceptionHandleErrorResponse = handleErrorResponse(request, httpResponseHandler2, httpResponseExecute);
                                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, amazonServiceExceptionHandleErrorResponse.getRequestId());
                                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSErrorCode, amazonServiceExceptionHandleErrorResponse.getErrorCode());
                                                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(amazonServiceExceptionHandleErrorResponse.getStatusCode()));
                                                obj7 = "Cannot close the response content.";
                                                linkedHashMap = linkedHashMap2;
                                                httpResponse6 = httpResponseExecute;
                                                httpRequest = httpRequestCreateHttpRequest;
                                                i = i3;
                                                try {
                                                    if (!shouldRetry(request.getOriginalRequest(), httpRequestCreateHttpRequest.getContent(), amazonServiceExceptionHandleErrorResponse, i3, this.config.getRetryPolicy())) {
                                                        throw amazonServiceExceptionHandleErrorResponse;
                                                    }
                                                    if (RetryUtils.isClockSkewError(amazonServiceExceptionHandleErrorResponse)) {
                                                        SDKGlobalConfiguration.setGlobalTimeOffset(parseClockSkewOffset(httpResponse6, amazonServiceExceptionHandleErrorResponse));
                                                    }
                                                    resetRequestAfterError(request, amazonServiceExceptionHandleErrorResponse);
                                                    amazonClientException2 = amazonServiceExceptionHandleErrorResponse;
                                                    z2 = zNeedsConnectionLeftOpen2;
                                                    obj10 = obj7;
                                                    if (!z2) {
                                                        if (httpResponse6.getRawContent() != null) {
                                                        }
                                                    }
                                                    amazonClientException3 = amazonClientException2;
                                                    httpResponse7 = httpResponse6;
                                                    signer = signerByURI;
                                                    j = j2;
                                                    httpRequest2 = httpRequest;
                                                } catch (IOException e15) {
                                                    e = e15;
                                                    httpResponse8 = httpResponse6;
                                                    z3 = zNeedsConnectionLeftOpen2;
                                                    httpRequest2 = httpRequest;
                                                    obj5 = obj7;
                                                    log2 = log;
                                                    if (log2.isDebugEnabled()) {
                                                    }
                                                    AWSRequestMetrics.Field field222 = AWSRequestMetrics.Field.Exception;
                                                    awsRequestMetrics.incrementCounter(field222);
                                                    awsRequestMetrics.addProperty(field222, e);
                                                    awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                                    amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                                    if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                                    }
                                                } catch (Error e16) {
                                                    e = e16;
                                                    throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                                } catch (RuntimeException e17) {
                                                    e = e17;
                                                    throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    th = th;
                                                    httpResponse = httpResponse6;
                                                    z = zNeedsConnectionLeftOpen2;
                                                    obj = obj7;
                                                    if (z) {
                                                    }
                                                }
                                            } catch (IOException e18) {
                                                e = e18;
                                                httpRequest = httpRequestCreateHttpRequest;
                                                i = i3;
                                                obj7 = "Cannot close the response content.";
                                                linkedHashMap = linkedHashMap2;
                                                httpResponse6 = httpResponseExecute;
                                            } catch (Error e19) {
                                                e = e19;
                                                httpResponse6 = httpResponseExecute;
                                            } catch (RuntimeException e20) {
                                                e = e20;
                                                httpResponse6 = httpResponseExecute;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                httpResponse6 = httpResponseExecute;
                                                obj7 = "Cannot close the response content.";
                                            }
                                        } catch (IOException e21) {
                                            e = e21;
                                            httpRequest = httpRequestCreateHttpRequest;
                                            i = i3;
                                            obj7 = "Cannot close the response content.";
                                            linkedHashMap = linkedHashMap2;
                                            httpResponse8 = httpResponseExecute;
                                            httpRequest2 = httpRequest;
                                            obj5 = obj7;
                                            log2 = log;
                                            if (log2.isDebugEnabled()) {
                                            }
                                            AWSRequestMetrics.Field field2222 = AWSRequestMetrics.Field.Exception;
                                            awsRequestMetrics.incrementCounter(field2222);
                                            awsRequestMetrics.addProperty(field2222, e);
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                            amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                            if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                            }
                                        } catch (Error e22) {
                                            e = e22;
                                            httpResponse5 = httpResponseExecute;
                                            throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                        } catch (RuntimeException e23) {
                                            e = e23;
                                            httpResponse4 = httpResponseExecute;
                                            throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                        } catch (Throwable th11) {
                                            th = th11;
                                            httpResponse3 = httpResponseExecute;
                                            obj8 = "Cannot close the response content.";
                                            th = th;
                                            httpResponse2 = httpResponse3;
                                            obj4 = obj8;
                                            z = z3;
                                            httpResponse = httpResponse2;
                                            obj = obj4;
                                            if (z) {
                                            }
                                        }
                                    }
                                } catch (IOException e24) {
                                    e = e24;
                                    obj7 = "Cannot close the response content.";
                                    httpRequest = httpRequestCreateHttpRequest;
                                    i = i3;
                                    linkedHashMap = linkedHashMap2;
                                    httpResponse8 = httpResponseExecute;
                                    httpRequest2 = httpRequest;
                                    obj5 = obj7;
                                    log2 = log;
                                    if (log2.isDebugEnabled()) {
                                    }
                                    AWSRequestMetrics.Field field22222 = AWSRequestMetrics.Field.Exception;
                                    awsRequestMetrics.incrementCounter(field22222);
                                    awsRequestMetrics.addProperty(field22222, e);
                                    awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                    amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                    if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                    }
                                }
                                executionContext2 = executionContext;
                                linkedHashMap2 = linkedHashMap;
                                i2 = i;
                            } else {
                                try {
                                    try {
                                        j2 = jPauseBeforeNextRetry;
                                        try {
                                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.StatusCode, Integer.valueOf(httpResponseExecute.getStatusCode()));
                                            zNeedsConnectionLeftOpen = httpResponseHandler.needsConnectionLeftOpen();
                                        } catch (IOException e25) {
                                            e = e25;
                                        }
                                    } catch (IOException e26) {
                                        e = e26;
                                        j2 = jPauseBeforeNextRetry;
                                    }
                                } catch (Error e27) {
                                    e = e27;
                                    throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                } catch (RuntimeException e28) {
                                    e = e28;
                                    throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                } catch (Throwable th12) {
                                    th = th12;
                                    obj4 = "Cannot close the response content.";
                                    httpResponse2 = httpResponseExecute;
                                    z = z3;
                                    httpResponse = httpResponse2;
                                    obj = obj4;
                                    if (z) {
                                    }
                                }
                                try {
                                    Response<T> response = new Response<>(handleResponse(request, httpResponseHandler, httpResponseExecute, executionContext2), httpResponseExecute);
                                    if (!zNeedsConnectionLeftOpen) {
                                        try {
                                            if (httpResponseExecute.getRawContent() != null) {
                                                httpResponseExecute.getRawContent().close();
                                            }
                                        } catch (IOException e29) {
                                            log.warn("Cannot close the response content.", e29);
                                        }
                                    }
                                    return response;
                                } catch (IOException e30) {
                                    e = e30;
                                    z3 = zNeedsConnectionLeftOpen ? 1 : 0;
                                    obj3 = "Cannot close the response content.";
                                    httpResponse8 = httpResponseExecute;
                                    httpRequest2 = httpRequestCreateHttpRequest;
                                    i = i3;
                                    obj6 = obj3;
                                    linkedHashMap = linkedHashMap2;
                                    obj5 = obj6;
                                    log2 = log;
                                    if (log2.isDebugEnabled()) {
                                    }
                                    AWSRequestMetrics.Field field222222 = AWSRequestMetrics.Field.Exception;
                                    awsRequestMetrics.incrementCounter(field222222);
                                    awsRequestMetrics.addProperty(field222222, e);
                                    awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                                    amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                                    if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                                    }
                                } catch (Error e31) {
                                    e = e31;
                                    throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                                } catch (RuntimeException e32) {
                                    e = e32;
                                    throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                                } catch (Throwable th13) {
                                    th = th13;
                                    obj = "Cannot close the response content.";
                                    httpResponse = httpResponseExecute;
                                    z = zNeedsConnectionLeftOpen;
                                }
                            }
                        } catch (Error e33) {
                            e = e33;
                            httpResponse5 = httpResponseExecute;
                        } catch (RuntimeException e34) {
                            e = e34;
                            httpResponse4 = httpResponseExecute;
                        } catch (Throwable th14) {
                            th = th14;
                            obj8 = "Cannot close the response content.";
                            httpResponse3 = httpResponseExecute;
                        }
                    } catch (Throwable th15) {
                        j2 = jPauseBeforeNextRetry;
                        obj7 = "Cannot close the response content.";
                        httpRequest = httpRequestCreateHttpRequest;
                        i = i3;
                        linkedHashMap = linkedHashMap2;
                        try {
                            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.HttpRequestTime);
                            throw th15;
                        } catch (IOException e35) {
                            e = e35;
                            httpRequest2 = httpRequest;
                            obj5 = obj7;
                            log2 = log;
                            if (log2.isDebugEnabled()) {
                            }
                            AWSRequestMetrics.Field field2222222 = AWSRequestMetrics.Field.Exception;
                            awsRequestMetrics.incrementCounter(field2222222);
                            awsRequestMetrics.addProperty(field2222222, e);
                            awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                            amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                            if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                            }
                        } catch (Error e36) {
                            e = e36;
                            throw ((Error) handleUnexpectedFailure(e, awsRequestMetrics));
                        } catch (RuntimeException e37) {
                            e = e37;
                            throw ((RuntimeException) handleUnexpectedFailure(e, awsRequestMetrics));
                        }
                    }
                } else {
                    try {
                        AWSRequestMetrics.Field field4 = AWSRequestMetrics.Field.RequestSigningTime;
                        awsRequestMetrics.startEvent(field4);
                        try {
                            signerByURI.sign(request, credentials);
                            awsRequestMetrics.endEvent(field4);
                            log3 = REQUEST_LOG;
                            if (log3.isDebugEnabled()) {
                            }
                            httpRequestCreateHttpRequest = this.requestFactory.createHttpRequest(request, this.config, executionContext2);
                            AWSRequestMetrics.Field field32 = AWSRequestMetrics.Field.HttpRequestTime;
                            awsRequestMetrics.startEvent(field32);
                            httpResponseExecute = this.httpClient.execute(httpRequestCreateHttpRequest);
                            awsRequestMetrics.endEvent(field32);
                            if (isRequestSuccessful(httpResponseExecute)) {
                            }
                        } catch (Throwable th16) {
                            awsRequestMetrics.endEvent(AWSRequestMetrics.Field.RequestSigningTime);
                            throw th16;
                        }
                    } catch (IOException e38) {
                        e = e38;
                        j2 = jPauseBeforeNextRetry;
                        obj3 = "Cannot close the response content.";
                        i = i3;
                        obj6 = obj3;
                        linkedHashMap = linkedHashMap2;
                        obj5 = obj6;
                        log2 = log;
                        if (log2.isDebugEnabled()) {
                            log2.debug("Unable to execute HTTP request: " + e.getMessage(), e);
                        }
                        AWSRequestMetrics.Field field22222222 = AWSRequestMetrics.Field.Exception;
                        awsRequestMetrics.incrementCounter(field22222222);
                        awsRequestMetrics.addProperty(field22222222, e);
                        awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, (Object) null);
                        amazonClientException = new AmazonClientException("Unable to execute HTTP request: " + e.getMessage(), e);
                        if (shouldRetry(request.getOriginalRequest(), httpRequest2.getContent(), amazonClientException, i, this.config.getRetryPolicy())) {
                            throw amazonClientException;
                        }
                        resetRequestAfterError(request, e);
                        if (!z3 && httpResponse8 != null) {
                            try {
                                if (httpResponse8.getRawContent() != null) {
                                    httpResponse8.getRawContent().close();
                                }
                            } catch (IOException e39) {
                                log.warn(obj5, e39);
                            }
                        }
                        signer = signerByURI;
                        httpResponse7 = httpResponse8;
                        z2 = z3;
                        j = j2;
                        amazonClientException3 = amazonClientException;
                        executionContext2 = executionContext;
                        linkedHashMap2 = linkedHashMap;
                        i2 = i;
                    }
                }
            } catch (Throwable th17) {
                th2 = th17;
                obj5 = "Cannot close the response content.";
                th = th2;
                obj2 = obj5;
                httpResponse2 = httpResponse8;
                obj4 = obj2;
                z = z3;
                httpResponse = httpResponse2;
                obj = obj4;
                if (z) {
                }
            }
            if (z || httpResponse == 0) {
                throw th;
            }
            try {
                if (httpResponse.getRawContent() == null) {
                    throw th;
                }
                httpResponse.getRawContent().close();
                throw th;
            } catch (IOException e40) {
                log.warn(obj, e40);
                throw th;
            }
        }
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public RequestMetricCollector getRequestMetricCollector() {
        return this.requestMetricCollector;
    }

    @Deprecated
    public ResponseMetadata getResponseMetadataForRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        return null;
    }

    public AmazonServiceException handleErrorResponse(Request<?> request, HttpResponseHandler<AmazonServiceException> httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        int statusCode = httpResponse.getStatusCode();
        try {
            amazonServiceException = httpResponseHandler.handle(httpResponse);
            REQUEST_LOG.debug("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (statusCode == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.setServiceName(request.getServiceName());
                amazonServiceException.setStatusCode(413);
                amazonServiceException.setErrorType(AmazonServiceException.ErrorType.Client);
                amazonServiceException.setErrorCode("Request entity too large");
            } else {
                if (statusCode != 503 || !"Service Unavailable".equalsIgnoreCase(httpResponse.getStatusText())) {
                    if (e instanceof IOException) {
                        throw ((IOException) e);
                    }
                    throw new AmazonClientException("Unable to unmarshall error response (" + e.getMessage() + "). Response Code: " + statusCode + ", Response Text: " + httpResponse.getStatusText() + ", Response Headers: " + httpResponse.getHeaders(), e);
                }
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.setServiceName(request.getServiceName());
                amazonServiceException.setStatusCode(503);
                amazonServiceException.setErrorType(AmazonServiceException.ErrorType.Service);
                amazonServiceException.setErrorCode("Service unavailable");
            }
        }
        amazonServiceException.setStatusCode(statusCode);
        amazonServiceException.setServiceName(request.getServiceName());
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    public <T> T handleResponse(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponse httpResponse, ExecutionContext executionContext) throws IOException {
        try {
            AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            awsRequestMetrics.startEvent(field);
            try {
                AmazonWebServiceResponse<T> amazonWebServiceResponseHandle = httpResponseHandler.handle(httpResponse);
                awsRequestMetrics.endEvent(field);
                if (amazonWebServiceResponseHandle == null) {
                    throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText());
                }
                Log log2 = REQUEST_LOG;
                if (log2.isDebugEnabled()) {
                    log2.debug("Received successful response: " + httpResponse.getStatusCode() + ", AWS Request ID: " + amazonWebServiceResponseHandle.getRequestId());
                }
                awsRequestMetrics.addProperty(AWSRequestMetrics.Field.AWSRequestID, amazonWebServiceResponseHandle.getRequestId());
                return amazonWebServiceResponseHandle.getResult();
            } catch (Throwable th) {
                awsRequestMetrics.endEvent(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new AmazonClientException("Unable to unmarshall response (" + e3.getMessage() + "). Response Code: " + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText(), e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[Catch: RuntimeException -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x003b, blocks: (B:4:0x0014, B:9:0x0020), top: B:21:0x0014 }] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long parseClockSkewOffset(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date compressedISO8601Date;
        Date date = new Date();
        String str = httpResponse.getHeaders().get("Date");
        try {
            if (str != 0) {
                try {
                    compressedISO8601Date = str.isEmpty() ? DateUtils.parseCompressedISO8601Date(getServerDateFromException(amazonServiceException.getMessage())) : DateUtils.parseRFC822Date(str);
                } catch (RuntimeException e) {
                    e = e;
                    str = 0;
                    log.warn("Unable to parse clock skew offset from response: " + str, e);
                    return 0L;
                }
            }
            long time = date.getTime() - compressedISO8601Date.getTime();
            str = 1000;
            return time / TIME_MILLISEC;
        } catch (RuntimeException e2) {
            e = e2;
        }
    }

    public List<RequestHandler2> requestHandler2s(Request<?> request, ExecutionContext executionContext) {
        List<RequestHandler2> requestHandler2s = executionContext.getRequestHandler2s();
        if (requestHandler2s == null) {
            return Collections.emptyList();
        }
        for (RequestHandler2 requestHandler2 : requestHandler2s) {
            if (requestHandler2 instanceof CredentialsRequestHandler) {
                ((CredentialsRequestHandler) requestHandler2).setCredentials(executionContext.getCredentials());
            }
            requestHandler2.beforeRequest(request);
        }
        return requestHandler2s;
    }

    public void resetRequestAfterError(Request<?> request, Exception exc) throws IOException {
        if (request.getContent() == null) {
            return;
        }
        if (!request.getContent().markSupported()) {
            throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
        }
        try {
            request.getContent().reset();
        } catch (IOException unused) {
            throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
        }
    }

    public void setUserAgent(Request<?> request) {
        RequestClientOptions requestClientOptions;
        String clientMarker;
        String str = ClientConfiguration.DEFAULT_USER_AGENT;
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        String strCreateUserAgentString = (originalRequest == null || (requestClientOptions = originalRequest.getRequestClientOptions()) == null || (clientMarker = requestClientOptions.getClientMarker(RequestClientOptions.Marker.USER_AGENT)) == null) ? str : createUserAgentString(str, clientMarker);
        if (!str.equals(this.config.getUserAgent())) {
            strCreateUserAgentString = createUserAgentString(strCreateUserAgentString, this.config.getUserAgent());
        }
        if (this.config.getUserAgentOverride() != null) {
            strCreateUserAgentString = this.config.getUserAgentOverride();
        }
        request.addHeader("User-Agent", strCreateUserAgentString);
    }

    public void shutdown() {
        this.httpClient.shutdown();
    }

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration), requestMetricCollector);
    }

    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient) {
        this.requestFactory = new HttpRequestFactory();
        this.config = clientConfiguration;
        this.httpClient = httpClient;
        this.requestMetricCollector = null;
    }

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient, RequestMetricCollector requestMetricCollector) {
        this.requestFactory = new HttpRequestFactory();
        this.config = clientConfiguration;
        this.httpClient = httpClient;
        this.requestMetricCollector = requestMetricCollector;
    }
}
