package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import p001o.iq7;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchIdentityAction$1$evt$request$1 */
/* loaded from: classes5.dex */
public final class C10471x4a94018e extends kf9 implements xk7 {
    final /* synthetic */ LoginsMapProvider $loginsMap;
    final /* synthetic */ AuthEnvironment $this_invoke;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10471x4a94018e(AuthEnvironment authEnvironment, LoginsMapProvider loginsMapProvider) {
        super(1);
        this.$this_invoke = authEnvironment;
        this.$loginsMap = loginsMapProvider;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((iq7.C14346a) obj);
        return y3i.f54824a;
    }

    public final void invoke(iq7.C14346a c14346a) {
        sq8.m48649h(c14346a, "$this$invoke");
        IdentityPoolConfiguration identityPool = this.$this_invoke.getConfiguration().getIdentityPool();
        c14346a.m32553e(identityPool != null ? identityPool.getPoolId() : null);
        c14346a.m32554f(this.$loginsMap.getLogins());
    }
}
