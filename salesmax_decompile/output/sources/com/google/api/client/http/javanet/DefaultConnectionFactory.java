package com.google.api.client.http.javanet;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public class DefaultConnectionFactory implements ConnectionFactory {
    private final Proxy proxy;

    public DefaultConnectionFactory() {
        this(null);
    }

    @Override // com.google.api.client.http.javanet.ConnectionFactory
    public HttpURLConnection openConnection(URL url) {
        Proxy proxy = this.proxy;
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(proxy == null ? url.openConnection() : url.openConnection(proxy)));
    }

    public DefaultConnectionFactory(Proxy proxy) {
        this.proxy = proxy;
    }
}
