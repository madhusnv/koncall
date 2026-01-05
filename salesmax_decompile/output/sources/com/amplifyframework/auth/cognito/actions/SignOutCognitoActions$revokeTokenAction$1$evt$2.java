package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import p001o.kf9;
import p001o.ote;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class SignOutCognitoActions$revokeTokenAction$1$evt$2 extends kf9 implements xk7 {
    final /* synthetic */ String $refreshToken;
    final /* synthetic */ AuthEnvironment $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignOutCognitoActions$revokeTokenAction$1$evt$2(AuthEnvironment authEnvironment, String str) {
        super(1);
        this.$this_invoke = authEnvironment;
        this.$refreshToken = str;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ote.C15891a) obj);
        return y3i.f54824a;
    }

    public final void invoke(ote.C15891a c15891a) {
        sq8.m48649h(c15891a, "$this$invoke");
        UserPoolConfiguration userPool = this.$this_invoke.getConfiguration().getUserPool();
        c15891a.m42670e(userPool != null ? userPool.getAppClient() : null);
        UserPoolConfiguration userPool2 = this.$this_invoke.getConfiguration().getUserPool();
        c15891a.m42671f(userPool2 != null ? userPool2.getAppClientSecret() : null);
        c15891a.m42672g(this.$refreshToken);
    }
}
