package com.amplifyframework.statemachine.codegen.data;

import com.google.firebase.messaging.Constants;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class GlobalSignOutErrorData {
    private final String accessToken;
    private final Exception error;

    public GlobalSignOutErrorData(String str, Exception exc) {
        sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.accessToken = str;
        this.error = exc;
    }

    public static /* synthetic */ GlobalSignOutErrorData copy$default(GlobalSignOutErrorData globalSignOutErrorData, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = globalSignOutErrorData.accessToken;
        }
        if ((i & 2) != 0) {
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

    public final GlobalSignOutErrorData copy(String str, Exception exc) {
        sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return new GlobalSignOutErrorData(str, exc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSignOutErrorData)) {
            return false;
        }
        GlobalSignOutErrorData globalSignOutErrorData = (GlobalSignOutErrorData) obj;
        return sq8.m48644c(this.accessToken, globalSignOutErrorData.accessToken) && sq8.m48644c(this.error, globalSignOutErrorData.error);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final Exception getError() {
        return this.error;
    }

    public int hashCode() {
        String str = this.accessToken;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.error.hashCode();
    }

    public String toString() {
        return "GlobalSignOutErrorData(accessToken=" + this.accessToken + ", error=" + this.error + ")";
    }
}
