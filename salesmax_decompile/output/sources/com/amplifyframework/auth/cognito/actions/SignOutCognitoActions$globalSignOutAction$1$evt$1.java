package com.amplifyframework.auth.cognito.actions;

import p001o.kf9;
import p001o.pt7;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignOutCognitoActions$globalSignOutAction$1$evt$1 extends kf9 implements xk7 {
    final /* synthetic */ String $accessToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignOutCognitoActions$globalSignOutAction$1$evt$1(String str) {
        super(1);
        this.$accessToken = str;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((pt7.C16184a) obj);
        return y3i.f54824a;
    }

    public final void invoke(pt7.C16184a c16184a) {
        sq8.m48649h(c16184a, "$this$invoke");
        c16184a.m44143c(this.$accessToken);
    }
}
