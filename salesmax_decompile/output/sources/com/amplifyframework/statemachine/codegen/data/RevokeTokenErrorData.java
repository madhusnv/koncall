package com.amplifyframework.statemachine.codegen.data;

import com.google.firebase.messaging.Constants;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class RevokeTokenErrorData {
    private final Exception error;
    private final String refreshToken;

    public RevokeTokenErrorData(String str, Exception exc) {
        sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.refreshToken = str;
        this.error = exc;
    }

    public static /* synthetic */ RevokeTokenErrorData copy$default(RevokeTokenErrorData revokeTokenErrorData, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = revokeTokenErrorData.refreshToken;
        }
        if ((i & 2) != 0) {
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

    public final RevokeTokenErrorData copy(String str, Exception exc) {
        sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return new RevokeTokenErrorData(str, exc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevokeTokenErrorData)) {
            return false;
        }
        RevokeTokenErrorData revokeTokenErrorData = (RevokeTokenErrorData) obj;
        return sq8.m48644c(this.refreshToken, revokeTokenErrorData.refreshToken) && sq8.m48644c(this.error, revokeTokenErrorData.error);
    }

    public final Exception getError() {
        return this.error;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public int hashCode() {
        String str = this.refreshToken;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.error.hashCode();
    }

    public String toString() {
        return "RevokeTokenErrorData(refreshToken=" + this.refreshToken + ", error=" + this.error + ")";
    }
}
