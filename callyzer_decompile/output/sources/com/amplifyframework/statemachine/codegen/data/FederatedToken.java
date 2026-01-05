package com.amplifyframework.statemachine.codegen.data;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3365b;
import jy.n0;
import jy.w0;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import ly.C4597u;
import nx.AbstractC5178p;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FederatedToken {
    public static final Companion Companion = new Companion(null);
    private final String providerName;
    private final String token;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC2401a serializer() {
            return FederatedToken$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }
    }

    public /* synthetic */ FederatedToken(int i10, String str, String str2, w0 w0Var) {
        if (3 != (i10 & 3)) {
            n0.m8426g(i10, 3, FederatedToken$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.token = str;
        this.providerName = str2;
    }

    public static /* synthetic */ FederatedToken copy$default(FederatedToken federatedToken, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = federatedToken.token;
        }
        if ((i10 & 2) != 0) {
            str2 = federatedToken.providerName;
        }
        return federatedToken.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$aws_auth_cognito_release(FederatedToken federatedToken, InterfaceC3365b interfaceC3365b, InterfaceC3055f interfaceC3055f) {
        C4597u c4597u = (C4597u) interfaceC3365b;
        c4597u.m9444w(interfaceC3055f, 0, federatedToken.token);
        c4597u.m9444w(interfaceC3055f, 1, federatedToken.providerName);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.providerName;
    }

    public final FederatedToken copy(String token, String providerName) {
        AbstractC4154l.m8923f(token, "token");
        AbstractC4154l.m8923f(providerName, "providerName");
        return new FederatedToken(token, providerName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FederatedToken)) {
            return false;
        }
        FederatedToken federatedToken = (FederatedToken) obj;
        return AbstractC4154l.m8918a(this.token, federatedToken.token) && AbstractC4154l.m8918a(this.providerName, federatedToken.providerName);
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.providerName.hashCode() + (this.token.hashCode() * 31);
    }

    public String toString() {
        return a1.m14333m("FederatedToken(token = ", AbstractC5178p.m10114Y(this.token, new C4266h(0, 4, 1)), "***, providerName = ", this.providerName, ")");
    }

    public FederatedToken(String token, String providerName) {
        AbstractC4154l.m8923f(token, "token");
        AbstractC4154l.m8923f(providerName, "providerName");
        this.token = token;
        this.providerName = providerName;
    }
}
