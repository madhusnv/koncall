package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AuthFailedResponse {

    @InterfaceC4485b("error")
    private final String error;

    @InterfaceC4485b("error_description")
    private final String errorDescription;

    public AuthFailedResponse(String error, String errorDescription) {
        AbstractC4154l.m8923f(error, "error");
        AbstractC4154l.m8923f(errorDescription, "errorDescription");
        this.error = error;
        this.errorDescription = errorDescription;
    }

    /* renamed from: a */
    public final String m4729a() {
        return this.error;
    }

    /* renamed from: b */
    public final String m4730b() {
        return this.errorDescription;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthFailedResponse)) {
            return false;
        }
        AuthFailedResponse authFailedResponse = (AuthFailedResponse) obj;
        return AbstractC4154l.m8918a(this.error, authFailedResponse.error) && AbstractC4154l.m8918a(this.errorDescription, authFailedResponse.errorDescription);
    }

    public final int hashCode() {
        return this.errorDescription.hashCode() + (this.error.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("AuthFailedResponse(error=", this.error, ", errorDescription=", this.errorDescription, ")");
    }
}
