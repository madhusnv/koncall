package com.amplifyframework.auth.plugins.core;

import java.util.Map;
import p001o.bp7;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSCognitoIdentityPoolOperations$getAWSCredentials$request$1 extends kf9 implements xk7 {
    final /* synthetic */ String $identityId;
    final /* synthetic */ Map<String, String> $loginsMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoIdentityPoolOperations$getAWSCredentials$request$1(String str, Map<String, String> map) {
        super(1);
        this.$identityId = str;
        this.$loginsMap = map;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((bp7.C12469a) obj);
        return y3i.f54824a;
    }

    public final void invoke(bp7.C12469a c12469a) {
        sq8.m48649h(c12469a, "$this$invoke");
        c12469a.m19544e(this.$identityId);
        c12469a.m19545f(this.$loginsMap);
    }
}
