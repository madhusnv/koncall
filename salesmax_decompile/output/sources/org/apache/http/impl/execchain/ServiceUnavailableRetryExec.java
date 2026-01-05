package org.apache.http.impl.execchain;

import java.io.IOException;
import java.io.InterruptedIOException;
import org.apache.http.Header;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.ServiceUnavailableRetryStrategy;
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
public class ServiceUnavailableRetryExec implements ClientExecChain {
    private final sia log;
    private final ClientExecChain requestExecutor;
    private final ServiceUnavailableRetryStrategy retryStrategy;

    public ServiceUnavailableRetryExec(ClientExecChain clientExecChain, ServiceUnavailableRetryStrategy serviceUnavailableRetryStrategy) {
        eja.m25143k(getClass());
        Args.notNull(clientExecChain, "HTTP request executor");
        Args.notNull(serviceUnavailableRetryStrategy, "Retry strategy");
        this.requestExecutor = clientExecChain;
        this.retryStrategy = serviceUnavailableRetryStrategy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r2;
     */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException {
        Header[] allHeaders = httpRequestWrapper.getAllHeaders();
        int i = 1;
        while (true) {
            CloseableHttpResponse closeableHttpResponseExecute = this.requestExecutor.execute(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
            try {
                if (!this.retryStrategy.retryRequest(closeableHttpResponseExecute, i, httpClientContext) || !RequestEntityProxy.isRepeatable(httpRequestWrapper)) {
                    break;
                }
                closeableHttpResponseExecute.close();
                long retryInterval = this.retryStrategy.getRetryInterval();
                if (retryInterval > 0) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Wait for ");
                        sb.append(retryInterval);
                        throw null;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                httpRequestWrapper.setHeaders(allHeaders);
                i++;
            } catch (RuntimeException e) {
                closeableHttpResponseExecute.close();
                throw e;
            }
        }
    }
}
