package com.amplifyframework.auth.plugins.core;

import java.util.Map;
import p001o.iq7;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSCognitoIdentityPoolOperations$getIdentityId$request$1 extends kf9 implements xk7 {
    final /* synthetic */ Map<String, String> $loginsMap;
    final /* synthetic */ AWSCognitoIdentityPoolOperations this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoIdentityPoolOperations$getIdentityId$request$1(AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations, Map<String, String> map) {
        super(1);
        this.this$0 = aWSCognitoIdentityPoolOperations;
        this.$loginsMap = map;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((iq7.C14346a) obj);
        return y3i.f54824a;
    }

    public final void invoke(iq7.C14346a c14346a) {
        sq8.m48649h(c14346a, "$this$invoke");
        c14346a.m32553e(this.this$0.identityPool.getPoolId());
        c14346a.m32554f(this.$loginsMap);
    }
}
