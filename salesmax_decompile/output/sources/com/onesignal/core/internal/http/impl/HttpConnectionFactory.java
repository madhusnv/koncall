package com.onesignal.core.internal.http.impl;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onesignal.core.internal.config.ConfigModelStore;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class HttpConnectionFactory implements IHttpConnectionFactory {
    private final ConfigModelStore _configModelStore;

    public HttpConnectionFactory(ConfigModelStore configModelStore) {
        sq8.m48649h(configModelStore, "_configModelStore");
        this._configModelStore = configModelStore;
    }

    @Override // com.onesignal.core.internal.http.impl.IHttpConnectionFactory
    public HttpURLConnection newHttpURLConnection(String str) {
        sq8.m48649h(str, ImagesContract.URL);
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this._configModelStore.getModel().getApiUrl() + str).openConnection());
        sq8.m48647f(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return (HttpURLConnection) uRLConnection;
    }
}
