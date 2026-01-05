package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import p001o.bp7;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$fetchAWSCredentialsAction$1$evt$request$1 */
/* loaded from: classes5.dex */
public final class C10470xf6b5d4f extends kf9 implements xk7 {
    final /* synthetic */ String $identityId;
    final /* synthetic */ LoginsMapProvider $loginsMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10470xf6b5d4f(String str, LoginsMapProvider loginsMapProvider) {
        super(1);
        this.$identityId = str;
        this.$loginsMap = loginsMapProvider;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((bp7.C12469a) obj);
        return y3i.f54824a;
    }

    public final void invoke(bp7.C12469a c12469a) {
        sq8.m48649h(c12469a, "$this$invoke");
        c12469a.m19544e(this.$identityId);
        c12469a.m19545f(this.$loginsMap.getLogins());
    }
}
