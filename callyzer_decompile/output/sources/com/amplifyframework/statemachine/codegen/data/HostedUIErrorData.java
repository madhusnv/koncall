package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class HostedUIErrorData {
    private final Exception error;
    private final String url;

    public HostedUIErrorData(String str, Exception error) {
        AbstractC4154l.m8923f(error, "error");
        this.url = str;
        this.error = error;
    }

    public static /* synthetic */ HostedUIErrorData copy$default(HostedUIErrorData hostedUIErrorData, String str, Exception exc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hostedUIErrorData.url;
        }
        if ((i10 & 2) != 0) {
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

    public final HostedUIErrorData copy(String str, Exception error) {
        AbstractC4154l.m8923f(error, "error");
        return new HostedUIErrorData(str, error);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIErrorData)) {
            return false;
        }
        HostedUIErrorData hostedUIErrorData = (HostedUIErrorData) obj;
        return AbstractC4154l.m8918a(this.url, hostedUIErrorData.url) && AbstractC4154l.m8918a(this.error, hostedUIErrorData.error);
    }

    public final Exception getError() {
        return this.error;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        return this.error.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "HostedUIErrorData(url=" + this.url + ", error=" + this.error + ")";
    }
}
