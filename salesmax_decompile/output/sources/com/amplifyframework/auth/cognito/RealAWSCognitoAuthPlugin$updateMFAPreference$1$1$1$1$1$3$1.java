package com.amplifyframework.auth.cognito;

import p001o.kf9;
import p001o.sq8;
import p001o.t46;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$3$1 extends kf9 implements xk7 {
    final /* synthetic */ MFAPreference $it;
    final /* synthetic */ boolean $preferredMFASetting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$3$1(MFAPreference mFAPreference, boolean z) {
        super(1);
        this.$it = mFAPreference;
        this.$preferredMFASetting = z;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((t46.C16987a) obj);
        return y3i.f54824a;
    }

    public final void invoke(t46.C16987a c16987a) {
        sq8.m48649h(c16987a, "$this$invoke");
        c16987a.m49277d(this.$it.getMfaEnabled$aws_auth_cognito_release());
        c16987a.m49278e(this.$preferredMFASetting);
    }
}
