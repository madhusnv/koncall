package org.apache.http.impl.execchain;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class ProtocolExec implements ClientExecChain {
    private final HttpProcessor httpProcessor;
    private final sia log;
    private final ClientExecChain requestExecutor;

    public ProtocolExec(ClientExecChain clientExecChain, HttpProcessor httpProcessor) {
        eja.m25143k(getClass());
        Args.notNull(clientExecChain, "HTTP client request executor");
        Args.notNull(httpProcessor, "HTTP protocol processor");
        this.requestExecutor = clientExecChain;
        this.httpProcessor = httpProcessor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws HttpException, IOException {
        URI uriCreate;
        String userInfo;
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        HttpRequest original = httpRequestWrapper.getOriginal();
        HttpHost httpHost = null;
        if (original instanceof HttpUriRequest) {
            uriCreate = ((HttpUriRequest) original).getURI();
        } else {
            try {
                uriCreate = URI.create(original.getRequestLine().getUri());
            } catch (IllegalArgumentException unused) {
                throw null;
            }
        }
        httpRequestWrapper.setURI(uriCreate);
        rewriteRequestURI(httpRequestWrapper, httpRoute, httpClientContext.getRequestConfig().isNormalizeUri());
        HttpHost httpHost2 = (HttpHost) httpRequestWrapper.getParams().getParameter(ClientPNames.VIRTUAL_HOST);
        if (httpHost2 != null && httpHost2.getPort() == -1) {
            int port = httpRoute.getTargetHost().getPort();
            if (port == -1) {
                throw null;
            }
            new HttpHost(httpHost2.getHostName(), port, httpHost2.getSchemeName());
            throw null;
        }
        if (httpHost2 != null) {
            httpHost = httpHost2;
        } else if (uriCreate != null && uriCreate.isAbsolute() && uriCreate.getHost() != null) {
            httpHost = new HttpHost(uriCreate.getHost(), uriCreate.getPort(), uriCreate.getScheme());
        }
        if (httpHost == null) {
            httpHost = httpRequestWrapper.getTarget();
        }
        if (httpHost == null) {
            httpHost = httpRoute.getTargetHost();
        }
        if (uriCreate != null && (userInfo = uriCreate.getUserInfo()) != null) {
            CredentialsProvider credentialsProvider = httpClientContext.getCredentialsProvider();
            if (credentialsProvider == null) {
                credentialsProvider = new BasicCredentialsProvider();
                httpClientContext.setCredentialsProvider(credentialsProvider);
            }
            credentialsProvider.setCredentials(new AuthScope(httpHost), new UsernamePasswordCredentials(userInfo));
        }
        httpClientContext.setAttribute("http.target_host", httpHost);
        httpClientContext.setAttribute("http.route", httpRoute);
        httpClientContext.setAttribute("http.request", httpRequestWrapper);
        this.httpProcessor.process(httpRequestWrapper, httpClientContext);
        CloseableHttpResponse closeableHttpResponseExecute = this.requestExecutor.execute(httpRoute, httpRequestWrapper, httpClientContext, httpExecutionAware);
        try {
            httpClientContext.setAttribute("http.response", closeableHttpResponseExecute);
            this.httpProcessor.process(closeableHttpResponseExecute, httpClientContext);
            return closeableHttpResponseExecute;
        } catch (IOException e) {
            closeableHttpResponseExecute.close();
            throw e;
        } catch (RuntimeException e2) {
            closeableHttpResponseExecute.close();
            throw e2;
        } catch (HttpException e3) {
            closeableHttpResponseExecute.close();
            throw e3;
        }
    }

    public void rewriteRequestURI(HttpRequestWrapper httpRequestWrapper, HttpRoute httpRoute, boolean z) throws ProtocolException {
        URI uri = httpRequestWrapper.getURI();
        if (uri != null) {
            try {
                httpRequestWrapper.setURI(URIUtils.rewriteURIForRoute(uri, httpRoute, z));
            } catch (URISyntaxException e) {
                throw new ProtocolException("Invalid URI: " + uri, e);
            }
        }
    }
}
