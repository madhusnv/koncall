package org.apache.http.impl.client;

import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes6.dex */
public class AutoRetryHttpClient implements HttpClient {
    private final HttpClient backend;
    private final sia log;
    private final ServiceUnavailableRetryStrategy retryStrategy;

    public AutoRetryHttpClient(HttpClient httpClient, ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        eja.m25143k(getClass());
        Args.notNull(httpClient, "HttpClient");
        Args.notNull(serviceUnavailableRetryStrategy, "ServiceUnavailableRetryStrategy");
        this.backend = httpClient;
        this.retryStrategy = serviceUnavailableRetryStrategy;
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return FirebasePerfHttpClient.execute(this, httpHost, httpRequest, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.backend.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.backend.getParams();
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) FirebasePerfHttpClient.execute(this, httpHost, httpRequest, responseHandler, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return responseHandler.handleResponse(FirebasePerfHttpClient.execute(this, httpHost, httpRequest, httpContext));
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return FirebasePerfHttpClient.execute(this, httpUriRequest, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        URI uri = httpUriRequest.getURI();
        return FirebasePerfHttpClient.execute(this, new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme()), httpUriRequest, httpContext);
    }

    public AutoRetryHttpClient() {
        this(new DefaultHttpClient(), new DefaultServiceUnavailableRetryStrategy());
    }

    public AutoRetryHttpClient(ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        this(new DefaultHttpClient(), serviceUnavailableRetryStrategy);
    }

    public AutoRetryHttpClient(HttpClient httpClient) {
        this(httpClient, new DefaultServiceUnavailableRetryStrategy());
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) FirebasePerfHttpClient.execute(this, httpUriRequest, responseHandler, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return responseHandler.handleResponse(FirebasePerfHttpClient.execute(this, httpUriRequest, httpContext));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.client.HttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws InterruptedIOException {
        HttpResponse httpResponseExecute = FirebasePerfHttpClient.execute(this.backend, httpHost, httpRequest, httpContext);
        try {
            if (!this.retryStrategy.retryRequest(httpResponseExecute, 1, httpContext)) {
                return httpResponseExecute;
            }
            EntityUtils.consume(httpResponseExecute.getEntity());
            long retryInterval = this.retryStrategy.getRetryInterval();
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Wait for ");
                sb.append(retryInterval);
                throw null;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } catch (RuntimeException e) {
            try {
                EntityUtils.consume(httpResponseExecute.getEntity());
                throw e;
            } catch (IOException unused2) {
                throw null;
            }
        }
    }
}
