package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.result.AuthSessionResult;
import p001o.hg2;
import p001o.kf9;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;

/* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$_updatePassword$1$changePasswordRequest$1 */
/* loaded from: classes5.dex */
public final class C10411x37d79dc6 extends kf9 implements xk7 {
    final /* synthetic */ String $newPassword;
    final /* synthetic */ String $oldPassword;
    final /* synthetic */ AuthSessionResult<AWSCognitoUserPoolTokens> $tokens;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10411x37d79dc6(String str, String str2, AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult) {
        super(1);
        this.$oldPassword = str;
        this.$newPassword = str2;
        this.$tokens = authSessionResult;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((hg2.C13934a) obj);
        return y3i.f54824a;
    }

    public final void invoke(hg2.C13934a c13934a) {
        sq8.m48649h(c13934a, "$this$invoke");
        c13934a.m30412f(this.$oldPassword);
        c13934a.m30413g(this.$newPassword);
        AWSCognitoUserPoolTokens value = this.$tokens.getValue();
        c13934a.m30411e(value != null ? value.getAccessToken() : null);
    }
}
