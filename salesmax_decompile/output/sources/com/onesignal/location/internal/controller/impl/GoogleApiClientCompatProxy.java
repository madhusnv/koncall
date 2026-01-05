package com.onesignal.location.internal.controller.impl;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class GoogleApiClientCompatProxy {
    private final Class<?> googleApiClientListenerClass;
    private final GoogleApiClient realInstance;

    public GoogleApiClientCompatProxy(GoogleApiClient googleApiClient) {
        sq8.m48649h(googleApiClient, "realInstance");
        this.realInstance = googleApiClient;
        this.googleApiClientListenerClass = googleApiClient.getClass();
    }

    public final ConnectionResult blockingConnect() {
        try {
            Object objInvoke = this.googleApiClientListenerClass.getMethod("blockingConnect", new Class[0]).invoke(this.realInstance, new Object[0]);
            sq8.m48647f(objInvoke, "null cannot be cast to non-null type com.google.android.gms.common.ConnectionResult");
            return (ConnectionResult) objInvoke;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final void connect() {
        try {
            this.googleApiClientListenerClass.getMethod("connect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void disconnect() {
        try {
            this.googleApiClientListenerClass.getMethod("disconnect", new Class[0]).invoke(this.realInstance, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final GoogleApiClient getRealInstance() {
        return this.realInstance;
    }
}
