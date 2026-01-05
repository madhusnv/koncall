package org.apache.http.impl.execchain;

import java.io.IOException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class RetryExec implements ClientExecChain {
    private final sia log;
    private final ClientExecChain requestExecutor;
    private final HttpRequestRetryHandler retryHandler;

    public RetryExec(ClientExecChain clientExecChain, HttpRequestRetryHandler httpRequestRetryHandler) {
        eja.m25143k(getClass());
        Args.notNull(clientExecChain, "HTTP request executor");
        Args.notNull(httpRequestRetryHandler, "HTTP request retry handler");
        this.requestExecutor = clientExecChain;
        this.retryHandler = httpRequestRetryHandler;
    }

    @Override // org.apache.http.impl.execchain.ClientExecChain
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException {
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        httpRequestWrapper.getAllHeaders();
        try {
            return this.requestExecutor.execute(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
        } catch (IOException e) {
            if ((httpExecutionAware != null && httpExecutionAware.isAborted()) || this.retryHandler.retryRequest(e, 1, httpClientContext)) {
                throw null;
            }
            if (!(e instanceof NoHttpResponseException)) {
                throw e;
            }
            NoHttpResponseException noHttpResponseException = new NoHttpResponseException(httpRoute.getTargetHost().toHostString() + " failed to respond");
            noHttpResponseException.setStackTrace(e.getStackTrace());
            throw noHttpResponseException;
        }
    }
}
