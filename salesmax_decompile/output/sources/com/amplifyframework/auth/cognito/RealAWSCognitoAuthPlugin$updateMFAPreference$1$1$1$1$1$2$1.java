package com.amplifyframework.auth.cognito;

import p001o.czf;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$2$1 extends kf9 implements xk7 {
    final /* synthetic */ MFAPreference $it;
    final /* synthetic */ boolean $preferredMFASetting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$2$1(MFAPreference mFAPreference, boolean z) {
        super(1);
        this.$it = mFAPreference;
        this.$preferredMFASetting = z;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((czf.C12773a) obj);
        return y3i.f54824a;
    }

    public final void invoke(czf.C12773a c12773a) {
        sq8.m48649h(c12773a, "$this$invoke");
        c12773a.m22136d(this.$it.getMfaEnabled$aws_auth_cognito_release());
        c12773a.m22137e(this.$preferredMFASetting);
    }
}
