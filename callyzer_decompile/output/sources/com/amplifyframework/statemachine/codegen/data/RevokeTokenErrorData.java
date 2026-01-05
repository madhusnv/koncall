package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RevokeTokenErrorData {
    private final Exception error;
    private final String refreshToken;

    public RevokeTokenErrorData(String str, Exception error) {
        AbstractC4154l.m8923f(error, "error");
        this.refreshToken = str;
        this.error = error;
    }

    public static /* synthetic */ RevokeTokenErrorData copy$default(RevokeTokenErrorData revokeTokenErrorData, String str, Exception exc, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = revokeTokenErrorData.refreshToken;
        }
        if ((i10 & 2) != 0) {
            exc = revokeTokenErrorData.error;
        }
        return revokeTokenErrorData.copy(str, exc);
    }

    public final String component1() {
        return this.refreshToken;
    }

    public final Exception component2() {
        return this.error;
    }

    public final RevokeTokenErrorData copy(String str, Exception error) {
        AbstractC4154l.m8923f(error, "error");
        return new RevokeTokenErrorData(str, error);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevokeTokenErrorData)) {
            return false;
        }
        RevokeTokenErrorData revokeTokenErrorData = (RevokeTokenErrorData) obj;
        return AbstractC4154l.m8918a(this.refreshToken, revokeTokenErrorData.refreshToken) && AbstractC4154l.m8918a(this.error, revokeTokenErrorData.error);
    }

    public final Exception getError() {
        return this.error;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        String str = this.refreshToken;
        return this.error.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "RevokeTokenErrorData(refreshToken=" + this.refreshToken + ", error=" + this.error + ")";
    }
}
