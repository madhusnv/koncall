package com.amplifyframework.auth.cognito;

import p001o.kf9;
import p001o.n64;
import p001o.sq8;
import p001o.vre;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class CredentialStoreClient$loadCredentials$2$2 extends kf9 implements xk7 {
    final /* synthetic */ n64 $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialStoreClient$loadCredentials$2$2(n64 n64Var) {
        super(1);
        this.$continuation = n64Var;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return y3i.f54824a;
    }

    public final void invoke(Exception exc) {
        sq8.m48649h(exc, "it");
        n64 n64Var = this.$continuation;
        vre.C17665a c17665a = vre.f50797b;
        n64Var.resumeWith(vre.m53351b(wre.m54933a(exc)));
    }
}
