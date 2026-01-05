package com.amplifyframework.statemachine.codegen.data;

import com.google.firebase.messaging.Constants;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class HostedUIErrorData {
    private final Exception error;
    private final String url;

    public HostedUIErrorData(String str, Exception exc) {
        sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.url = str;
        this.error = exc;
    }

    public static /* synthetic */ HostedUIErrorData copy$default(HostedUIErrorData hostedUIErrorData, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hostedUIErrorData.url;
        }
        if ((i & 2) != 0) {
            exc = hostedUIErrorData.error;
        }
        return hostedUIErrorData.copy(str, exc);
    }

    public final String component1() {
        return this.url;
    }

    public final Exception component2() {
        return this.error;
    }

    public final HostedUIErrorData copy(String str, Exception exc) {
        sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return new HostedUIErrorData(str, exc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIErrorData)) {
            return false;
        }
        HostedUIErrorData hostedUIErrorData = (HostedUIErrorData) obj;
        return sq8.m48644c(this.url, hostedUIErrorData.url) && sq8.m48644c(this.error, hostedUIErrorData.error);
    }

    public final Exception getError() {
        return this.error;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.error.hashCode();
    }

    public String toString() {
        return "HostedUIErrorData(url=" + this.url + ", error=" + this.error + ")";
    }
}
