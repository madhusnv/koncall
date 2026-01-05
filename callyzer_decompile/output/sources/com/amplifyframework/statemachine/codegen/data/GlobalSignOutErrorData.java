package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GlobalSignOutErrorData {
    private final String accessToken;
    private final Exception error;

    public GlobalSignOutErrorData(String str, Exception error) {
        AbstractC4154l.m8923f(error, "error");
        this.accessToken = str;
        this.error = error;
    }

    public static /* synthetic */ GlobalSignOutErrorData copy$default(GlobalSignOutErrorData globalSignOutErrorData, String str, Exception exc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = globalSignOutErrorData.accessToken;
        }
        if ((i10 & 2) != 0) {
            exc = globalSignOutErrorData.error;
        }
        return globalSignOutErrorData.copy(str, exc);
    }

    public final String component1() {
        return this.accessToken;
    }

    public final Exception component2() {
        return this.error;
    }

    public final GlobalSignOutErrorData copy(String str, Exception error) {
        AbstractC4154l.m8923f(error, "error");
        return new GlobalSignOutErrorData(str, error);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSignOutErrorData)) {
            return false;
        }
        GlobalSignOutErrorData globalSignOutErrorData = (GlobalSignOutErrorData) obj;
        return AbstractC4154l.m8918a(this.accessToken, globalSignOutErrorData.accessToken) && AbstractC4154l.m8918a(this.error, globalSignOutErrorData.error);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Exception getError() {
        return this.error;
    }

    public int hashCode() {
        String str = this.accessToken;
        return this.error.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "GlobalSignOutErrorData(accessToken=" + this.accessToken + ", error=" + this.error + ")";
    }
}
