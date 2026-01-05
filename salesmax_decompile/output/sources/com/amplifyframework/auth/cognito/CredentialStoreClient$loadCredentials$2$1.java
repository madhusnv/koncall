package com.amplifyframework.auth.cognito;

import p001o.kf9;
import p001o.n64;
import p001o.vre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class CredentialStoreClient$loadCredentials$2$1 extends kf9 implements xk7 {
    final /* synthetic */ n64 $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialStoreClient$loadCredentials$2$1(n64 n64Var) {
        super(1);
        this.$continuation = n64Var;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m68717invoke(((vre) obj).m53359j());
        return y3i.f54824a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m68717invoke(Object obj) {
        this.$continuation.resumeWith(obj);
    }
}
