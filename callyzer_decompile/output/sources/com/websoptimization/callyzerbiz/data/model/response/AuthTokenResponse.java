package com.websoptimization.callyzerbiz.data.model.response;

import kotlin.jvm.internal.AbstractC4154l;
import lk.InterfaceC4485b;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class AuthTokenResponse {

    @InterfaceC4485b("access_token")
    private final String accessToken;

    public AuthTokenResponse(String accessToken) {
        AbstractC4154l.m8923f(accessToken, "accessToken");
        this.accessToken = accessToken;
    }

    /* renamed from: a */
    public final String m4731a() {
        return this.accessToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthTokenResponse) && AbstractC4154l.m8918a(this.accessToken, ((AuthTokenResponse) obj).accessToken);
    }

    public final int hashCode() {
        return this.accessToken.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("AuthTokenResponse(accessToken=", this.accessToken, ")");
    }
}
