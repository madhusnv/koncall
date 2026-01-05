package com.google.api.client.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.LoggingStreamingContent;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.api.client.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import p001o.e6f;
import p001o.ith;
import p001o.lkh;
import p001o.ox0;
import p001o.pzf;

/* loaded from: classes3.dex */
public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 10;
    public static final String USER_AGENT_SUFFIX;
    public static final String VERSION;

    @Beta
    @Deprecated
    private BackOffPolicy backOffPolicy;
    private HttpContent content;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;

    @Beta
    private HttpIOExceptionHandler ioExceptionHandler;
    private ObjectParser objectParser;
    private String requestMethod;
    private HttpResponseInterceptor responseInterceptor;
    private boolean suppressUserAgentSuffix;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;
    private HttpHeaders headers = new HttpHeaders();
    private HttpHeaders responseHeaders = new HttpHeaders();
    private int numRetries = 10;
    private int contentLoggingLimit = Opcodes.ACC_ENUM;
    private boolean loggingEnabled = true;
    private boolean curlLoggingEnabled = true;
    private int connectTimeout = 20000;
    private int readTimeout = 20000;
    private int writeTimeout = 0;
    private boolean followRedirects = true;
    private boolean useRawRedirectUrls = false;
    private boolean throwExceptionOnExecuteError = true;

    @Beta
    @Deprecated
    private boolean retryOnExecuteIOException = false;
    private Sleeper sleeper = Sleeper.DEFAULT;
    private final ith tracer = OpenCensusUtils.getTracer();
    private boolean responseReturnRawInputStream = false;

    static {
        String version = getVersion();
        VERSION = version;
        USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/" + version + " (gzip)";
    }

    public HttpRequest(HttpTransport httpTransport, String str) {
        this.transport = httpTransport;
        setRequestMethod(str);
    }

    private static void addSpanAttribute(pzf pzfVar, String str, String str2) {
        if (str2 != null) {
            pzfVar.mo44567g(str, ox0.m42751a(str2));
        }
    }

    private static String getVersion() throws IOException {
        String property = "unknown-version";
        try {
            InputStream resourceAsStream = HttpRequest.class.getResourceAsStream("/google-http-client.properties");
            if (resourceAsStream != null) {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    property = properties.getProperty("google-http-client.version");
                } finally {
                }
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return property;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(22:23|(2:25|(1:27))|30|(2:32|(1:34)(1:35))|36|(1:38)|39|(1:45)(1:44)|46|(8:48|(1:50)|51|(1:53)(1:54)|55|(5:57|(2:59|(1:61))(1:62)|(2:64|(1:66))|67|(1:69))(1:70)|(1:72)|73)(1:74)|(2:76|(3:78|(1:80)|81))|(1:85)(1:84)|86|177|87|(1:89)|173|90|91|(3:175|114|(5:116|(1:118)(1:119)|(2:121|(1:(3:129|130|(3:179|132|123)))(1:123))|134|(1:136))(2:(1:142)(1:143)|144))(0)|145|(4:185|(1:149)|150|(4:152|(1:154)|155|(1:165)(3:171|160|161))(1:166))(1:167))(1:28)|177|87|(0)|173|90|91|(0)(0)|145|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0285, code lost:
    
        if (r1.retryOnExecuteIOException == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0292, code lost:
    
        r3.mo44565e(com.google.api.client.http.OpenCensusUtils.getEndSpanOptions(null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x029a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029b, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x029c, code lost:
    
        if (r9 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x029e, code lost:
    
        r8.log(java.util.logging.Level.WARNING, "exception thrown while executing request", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a5, code lost:
    
        r4.close();
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0282, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0338 A[LOOP:0: B:10:0x0035->B:167:0x0338, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0261 A[Catch: all -> 0x027f, IOException -> 0x0282, TRY_LEAVE, TryCatch #3 {IOException -> 0x0282, blocks: (B:87:0x025b, B:89:0x0261, B:93:0x0275, B:95:0x027b, B:96:0x027e), top: B:177:0x025b, outer: #5 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.google.api.client.http.HttpEncodingStreamingContent] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.api.client.util.LoggingStreamingContent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpResponse execute() throws IOException {
        StringBuilder sb;
        StringBuilder sb2;
        HttpContent httpEncodingStreamingContent;
        pzf pzfVar;
        int i;
        e6f e6fVarM32782d;
        HttpResponse httpResponse;
        boolean z;
        BackOffPolicy backOffPolicy;
        LowLevelHttpResponse lowLevelHttpResponseExecute;
        String name;
        long length;
        HttpRequest httpRequest = this;
        Preconditions.checkArgument(httpRequest.numRetries >= 0);
        int i2 = httpRequest.numRetries;
        BackOffPolicy backOffPolicy2 = httpRequest.backOffPolicy;
        if (backOffPolicy2 != null) {
            backOffPolicy2.reset();
        }
        Preconditions.checkNotNull(httpRequest.requestMethod);
        Preconditions.checkNotNull(httpRequest.url);
        pzf pzfVarMo46003b = httpRequest.tracer.m32780b(OpenCensusUtils.SPAN_NAME_HTTP_REQUEST_EXECUTE).mo46002a(OpenCensusUtils.isRecordEvent()).mo46003b();
        int i3 = i2;
        HttpResponse httpResponse2 = null;
        while (true) {
            pzfVarMo46003b.m44561a("retry #" + (httpRequest.numRetries - i3));
            if (httpResponse2 != null) {
                httpResponse2.ignore();
            }
            HttpExecuteInterceptor httpExecuteInterceptor = httpRequest.executeInterceptor;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(httpRequest);
            }
            String strBuild = httpRequest.url.build();
            addSpanAttribute(pzfVarMo46003b, "http.method", httpRequest.requestMethod);
            addSpanAttribute(pzfVarMo46003b, "http.host", httpRequest.url.getHost());
            addSpanAttribute(pzfVarMo46003b, "http.path", httpRequest.url.getRawPath());
            addSpanAttribute(pzfVarMo46003b, "http.url", strBuild);
            LowLevelHttpRequest lowLevelHttpRequestBuildRequest = httpRequest.transport.buildRequest(httpRequest.requestMethod, strBuild);
            Logger logger = HttpTransport.LOGGER;
            boolean z2 = httpRequest.loggingEnabled && logger.isLoggable(Level.CONFIG);
            try {
                try {
                    if (z2) {
                        sb = new StringBuilder();
                        sb.append("-------------- REQUEST  --------------");
                        String str = StringUtils.LINE_SEPARATOR;
                        sb.append(str);
                        sb.append(httpRequest.requestMethod);
                        sb.append(TokenParser.SP);
                        sb.append(strBuild);
                        sb.append(str);
                        if (httpRequest.curlLoggingEnabled) {
                            sb2 = new StringBuilder("curl -v --compressed");
                            if (!httpRequest.requestMethod.equals("GET")) {
                                sb2.append(" -X ");
                                sb2.append(httpRequest.requestMethod);
                            }
                        }
                        String userAgent = httpRequest.headers.getUserAgent();
                        if (!httpRequest.suppressUserAgentSuffix) {
                            if (userAgent == null) {
                                HttpHeaders httpHeaders = httpRequest.headers;
                                String str2 = USER_AGENT_SUFFIX;
                                httpHeaders.setUserAgent(str2);
                                addSpanAttribute(pzfVarMo46003b, "http.user_agent", str2);
                            } else {
                                String str3 = userAgent + " " + USER_AGENT_SUFFIX;
                                httpRequest.headers.setUserAgent(str3);
                                addSpanAttribute(pzfVarMo46003b, "http.user_agent", str3);
                            }
                        }
                        OpenCensusUtils.propagateTracingContext(pzfVarMo46003b, httpRequest.headers);
                        HttpHeaders.serializeHeaders(httpRequest.headers, sb, sb2, logger, lowLevelHttpRequestBuildRequest);
                        if (!httpRequest.suppressUserAgentSuffix) {
                            httpRequest.headers.setUserAgent(userAgent);
                        }
                        httpEncodingStreamingContent = httpRequest.content;
                        boolean z3 = httpEncodingStreamingContent != null || httpEncodingStreamingContent.retrySupported();
                        if (httpEncodingStreamingContent == null) {
                            String type2 = httpRequest.content.getType();
                            if (z2) {
                                httpEncodingStreamingContent = new LoggingStreamingContent(httpEncodingStreamingContent, logger, Level.CONFIG, httpRequest.contentLoggingLimit);
                            }
                            HttpEncoding httpEncoding = httpRequest.encoding;
                            if (httpEncoding == null) {
                                length = httpRequest.content.getLength();
                                name = null;
                            } else {
                                name = httpEncoding.getName();
                                httpEncodingStreamingContent = new HttpEncodingStreamingContent(httpEncodingStreamingContent, httpRequest.encoding);
                                length = -1;
                            }
                            pzfVar = pzfVarMo46003b;
                            if (z2) {
                                if (type2 != null) {
                                    StringBuilder sb3 = new StringBuilder();
                                    i = i3;
                                    sb3.append("Content-Type: ");
                                    sb3.append(type2);
                                    String string = sb3.toString();
                                    sb.append(string);
                                    sb.append(StringUtils.LINE_SEPARATOR);
                                    if (sb2 != null) {
                                        sb2.append(" -H '" + string + "'");
                                    }
                                } else {
                                    i = i3;
                                }
                                if (name != null) {
                                    String str4 = "Content-Encoding: " + name;
                                    sb.append(str4);
                                    sb.append(StringUtils.LINE_SEPARATOR);
                                    if (sb2 != null) {
                                        sb2.append(" -H '" + str4 + "'");
                                    }
                                }
                                if (length >= 0) {
                                    sb.append("Content-Length: " + length);
                                    sb.append(StringUtils.LINE_SEPARATOR);
                                }
                            } else {
                                i = i3;
                            }
                            if (sb2 != null) {
                                sb2.append(" -d '@-'");
                            }
                            lowLevelHttpRequestBuildRequest.setContentType(type2);
                            lowLevelHttpRequestBuildRequest.setContentEncoding(name);
                            lowLevelHttpRequestBuildRequest.setContentLength(length);
                            lowLevelHttpRequestBuildRequest.setStreamingContent(httpEncodingStreamingContent);
                        } else {
                            pzfVar = pzfVarMo46003b;
                            i = i3;
                        }
                        if (z2) {
                            logger.config(sb.toString());
                            if (sb2 != null) {
                                sb2.append(" -- '");
                                sb2.append(strBuild.replaceAll("'", "'\"'\"'"));
                                sb2.append("'");
                                if (httpEncodingStreamingContent != null) {
                                    sb2.append(" << $$$");
                                }
                                logger.config(sb2.toString());
                            }
                        }
                        boolean z4 = !z3 && i > 0;
                        httpRequest = this;
                        lowLevelHttpRequestBuildRequest.setTimeout(httpRequest.connectTimeout, httpRequest.readTimeout);
                        lowLevelHttpRequestBuildRequest.setWriteTimeout(httpRequest.writeTimeout);
                        pzf pzfVar2 = pzfVar;
                        e6fVarM32782d = httpRequest.tracer.m32782d(pzfVar2);
                        OpenCensusUtils.recordSentMessageEvent(pzfVar2, lowLevelHttpRequestBuildRequest.getContentLength());
                        lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                        if (lowLevelHttpResponseExecute != null) {
                            OpenCensusUtils.recordReceivedMessageEvent(pzfVar2, lowLevelHttpResponseExecute.getContentLength());
                        }
                        HttpResponse httpResponse3 = new HttpResponse(httpRequest, lowLevelHttpResponseExecute);
                        e6fVarM32782d.close();
                        httpResponse = httpResponse3;
                        e = null;
                        Integer numValueOf = null;
                        if (httpResponse == null) {
                            try {
                                if (httpResponse.isSuccessStatusCode()) {
                                    z = z4 & (httpResponse == null);
                                } else {
                                    HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = httpRequest.unsuccessfulResponseHandler;
                                    boolean zHandleResponse = httpUnsuccessfulResponseHandler != null ? httpUnsuccessfulResponseHandler.handleResponse(httpRequest, httpResponse, z4) : false;
                                    if (!zHandleResponse) {
                                        if (httpRequest.handleRedirect(httpResponse.getStatusCode(), httpResponse.getHeaders())) {
                                            zHandleResponse = true;
                                        } else if (z4 && (backOffPolicy = httpRequest.backOffPolicy) != null && backOffPolicy.isBackOffRequired(httpResponse.getStatusCode())) {
                                            long nextBackOffMillis = httpRequest.backOffPolicy.getNextBackOffMillis();
                                            if (nextBackOffMillis != -1) {
                                                try {
                                                    httpRequest.sleeper.sleep(nextBackOffMillis);
                                                } catch (InterruptedException unused) {
                                                }
                                                zHandleResponse = true;
                                            }
                                        }
                                    }
                                    z = z4 & zHandleResponse;
                                    if (z) {
                                        httpResponse.ignore();
                                    }
                                }
                            } finally {
                            }
                        }
                        i3 = i - 1;
                        if (z) {
                            if (httpResponse != null) {
                                numValueOf = Integer.valueOf(httpResponse.getStatusCode());
                            }
                            pzfVar2.mo44565e(OpenCensusUtils.getEndSpanOptions(numValueOf));
                            if (httpResponse == null) {
                                throw e;
                            }
                            HttpResponseInterceptor httpResponseInterceptor = httpRequest.responseInterceptor;
                            if (httpResponseInterceptor != null) {
                                httpResponseInterceptor.interceptResponse(httpResponse);
                            }
                            if (!httpRequest.throwExceptionOnExecuteError || httpResponse.isSuccessStatusCode()) {
                                return httpResponse;
                            }
                            try {
                                throw new HttpResponseException(httpResponse);
                            } finally {
                            }
                        }
                        httpResponse2 = httpResponse;
                        pzfVarMo46003b = pzfVar2;
                    } else {
                        sb = null;
                    }
                    HttpResponse httpResponse32 = new HttpResponse(httpRequest, lowLevelHttpResponseExecute);
                    e6fVarM32782d.close();
                    httpResponse = httpResponse32;
                    e = null;
                    Integer numValueOf2 = null;
                    if (httpResponse == null) {
                    }
                    i3 = i - 1;
                    if (z) {
                    }
                } catch (Throwable th) {
                    InputStream content = lowLevelHttpResponseExecute.getContent();
                    if (content != null) {
                        content.close();
                    }
                    throw th;
                }
                lowLevelHttpResponseExecute = lowLevelHttpRequestBuildRequest.execute();
                if (lowLevelHttpResponseExecute != null) {
                }
            } catch (Throwable th2) {
                e6fVarM32782d.close();
                throw th2;
            }
            sb2 = null;
            String userAgent2 = httpRequest.headers.getUserAgent();
            if (!httpRequest.suppressUserAgentSuffix) {
            }
            OpenCensusUtils.propagateTracingContext(pzfVarMo46003b, httpRequest.headers);
            HttpHeaders.serializeHeaders(httpRequest.headers, sb, sb2, logger, lowLevelHttpRequestBuildRequest);
            if (!httpRequest.suppressUserAgentSuffix) {
            }
            httpEncodingStreamingContent = httpRequest.content;
            if (httpEncodingStreamingContent != null) {
            }
            if (httpEncodingStreamingContent == null) {
            }
            if (z2) {
            }
            if (z3) {
            }
            httpRequest = this;
            lowLevelHttpRequestBuildRequest.setTimeout(httpRequest.connectTimeout, httpRequest.readTimeout);
            lowLevelHttpRequestBuildRequest.setWriteTimeout(httpRequest.writeTimeout);
            pzf pzfVar22 = pzfVar;
            e6fVarM32782d = httpRequest.tracer.m32782d(pzfVar22);
            OpenCensusUtils.recordSentMessageEvent(pzfVar22, lowLevelHttpRequestBuildRequest.getContentLength());
        }
    }

    @Beta
    public Future<HttpResponse> executeAsync(Executor executor) {
        FutureTask futureTask = new FutureTask(new Callable<HttpResponse>() { // from class: com.google.api.client.http.HttpRequest.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HttpResponse call() {
                return HttpRequest.this.execute();
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    @Beta
    @Deprecated
    public BackOffPolicy getBackOffPolicy() {
        return this.backOffPolicy;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public HttpContent getContent() {
        return this.content;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    @Beta
    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.ioExceptionHandler;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.executeInterceptor;
    }

    public int getNumberOfRetries() {
        return this.numRetries;
    }

    public final ObjectParser getParser() {
        return this.objectParser;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public boolean getResponseReturnRawInputStream() {
        return this.responseReturnRawInputStream;
    }

    @Beta
    @Deprecated
    public boolean getRetryOnExecuteIOException() {
        return this.retryOnExecuteIOException;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public boolean getSuppressUserAgentSuffix() {
        return this.suppressUserAgentSuffix;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.throwExceptionOnExecuteError;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.unsuccessfulResponseHandler;
    }

    public GenericUrl getUrl() {
        return this.url;
    }

    public boolean getUseRawRedirectUrls() {
        return this.useRawRedirectUrls;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public boolean handleRedirect(int i, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (!getFollowRedirects() || !HttpStatusCodes.isRedirect(i) || location == null) {
            return false;
        }
        setUrl(new GenericUrl(this.url.toURL(location), this.useRawRedirectUrls));
        if (i == 303) {
            setRequestMethod("GET");
            setContent(null);
        }
        this.headers.setAuthorization((String) null);
        this.headers.setIfMatch(null);
        this.headers.setIfNoneMatch(null);
        this.headers.setIfModifiedSince(null);
        this.headers.setIfUnmodifiedSince(null);
        this.headers.setIfRange(null);
        return true;
    }

    public boolean isCurlLoggingEnabled() {
        return this.curlLoggingEnabled;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Beta
    @Deprecated
    public HttpRequest setBackOffPolicy(BackOffPolicy backOffPolicy) {
        this.backOffPolicy = backOffPolicy;
        return this;
    }

    public HttpRequest setConnectTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.connectTimeout = i;
        return this;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.content = httpContent;
        return this;
    }

    public HttpRequest setContentLoggingLimit(int i) {
        Preconditions.checkArgument(i >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i;
        return this;
    }

    public HttpRequest setCurlLoggingEnabled(boolean z) {
        this.curlLoggingEnabled = z;
        return this;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.encoding = httpEncoding;
        return this;
    }

    public HttpRequest setFollowRedirects(boolean z) {
        this.followRedirects = z;
        return this;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    @Beta
    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.ioExceptionHandler = httpIOExceptionHandler;
        return this;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.executeInterceptor = httpExecuteInterceptor;
        return this;
    }

    public HttpRequest setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
        return this;
    }

    public HttpRequest setNumberOfRetries(int i) {
        Preconditions.checkArgument(i >= 0);
        this.numRetries = i;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectParser) {
        this.objectParser = objectParser;
        return this;
    }

    public HttpRequest setReadTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.readTimeout = i;
        return this;
    }

    public HttpRequest setRequestMethod(String str) {
        Preconditions.checkArgument(str == null || HttpMediaType.matchesToken(str));
        this.requestMethod = str;
        return this;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.responseInterceptor = httpResponseInterceptor;
        return this;
    }

    public HttpRequest setResponseReturnRawInputStream(boolean z) {
        this.responseReturnRawInputStream = z;
        return this;
    }

    @Beta
    @Deprecated
    public HttpRequest setRetryOnExecuteIOException(boolean z) {
        this.retryOnExecuteIOException = z;
        return this;
    }

    public HttpRequest setSleeper(Sleeper sleeper) {
        this.sleeper = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean z) {
        this.suppressUserAgentSuffix = z;
        return this;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z) {
        this.throwExceptionOnExecuteError = z;
        return this;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.unsuccessfulResponseHandler = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.url = (GenericUrl) Preconditions.checkNotNull(genericUrl);
        return this;
    }

    public HttpRequest setUseRawRedirectUrls(boolean z) {
        this.useRawRedirectUrls = z;
        return this;
    }

    public HttpRequest setWriteTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.writeTimeout = i;
        return this;
    }

    @Beta
    public Future<HttpResponse> executeAsync() {
        return executeAsync(Executors.newFixedThreadPool(1, new lkh().m37395e(true).m37394b()));
    }
}
