package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.AWSCognitoUserPoolTokens;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import com.google.android.gms.cast.CastStatusCodes;
import p001o.czf;
import p001o.gif;
import p001o.h84;
import p001o.hif;
import p001o.jgg;
import p001o.kf9;
import p001o.kg3;
import p001o.kt7;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.rm1;
import p001o.sq8;
import p001o.swf;
import p001o.t46;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class RealAWSCognitoAuthPlugin$updateMFAPreference$1$1 extends kf9 implements xk7 {
    final /* synthetic */ MFAPreference $email;
    final /* synthetic */ Consumer<AuthException> $onError;
    final /* synthetic */ Action $onSuccess;
    final /* synthetic */ boolean $overridePreferredSetting;
    final /* synthetic */ MFAPreference $sms;
    final /* synthetic */ MFAPreference $totp;
    final /* synthetic */ UserMFAPreference $userPreference;
    final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

    @l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {2062, CastStatusCodes.ERROR_SERVICE_CREATION_FAILED}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1 */
    public static final class C104341 extends jgg implements nl7 {
        final /* synthetic */ MFAPreference $email;
        final /* synthetic */ Consumer<AuthException> $onError;
        final /* synthetic */ Action $onSuccess;
        final /* synthetic */ boolean $overridePreferredSetting;
        final /* synthetic */ MFAPreference $sms;
        final /* synthetic */ MFAPreference $totp;
        final /* synthetic */ UserMFAPreference $userPreference;
        Object L$0;
        int label;
        final /* synthetic */ RealAWSCognitoAuthPlugin this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104341(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, Consumer<AuthException> consumer, MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, boolean z, UserMFAPreference userMFAPreference, Action action, n64 n64Var) {
            super(2, n64Var);
            this.this$0 = realAWSCognitoAuthPlugin;
            this.$onError = consumer;
            this.$sms = mFAPreference;
            this.$totp = mFAPreference2;
            this.$email = mFAPreference3;
            this.$overridePreferredSetting = z;
            this.$userPreference = userMFAPreference;
            this.$onSuccess = action;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C104341(this.this$0, this.$onError, this.$sms, this.$totp, this.$email, this.$overridePreferredSetting, this.$userPreference, this.$onSuccess, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:86:0x0127 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:7:0x0015, B:84:0x0123, B:86:0x0127, B:88:0x012d, B:11:0x0024, B:19:0x003b, B:21:0x0049, B:24:0x0051, B:26:0x006d, B:28:0x0077, B:30:0x007d, B:38:0x0095, B:42:0x009e, B:44:0x00a7, B:46:0x00ac, B:48:0x00b2, B:56:0x00ca, B:60:0x00d3, B:62:0x00dc, B:64:0x00e1, B:66:0x00e7, B:74:0x00ff, B:78:0x0107, B:80:0x0110, B:68:0x00ee, B:70:0x00f6, B:50:0x00b9, B:52:0x00c1, B:32:0x0084, B:34:0x008c, B:16:0x0030), top: B:93:0x000b }] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object session;
            swf swfVarM49027a;
            czf czfVarM22138a;
            t46 t46VarM49279a;
            Object objMo35649z;
            Action action;
            hif hifVar;
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            hif hifVar2 = null;
            boolean z = true;
            try {
            } catch (Exception e) {
                this.$onError.accept(CognitoAuthExceptionConverter.Companion.lookup(e, "Amazon Cognito cannot update the MFA preferences"));
            }
            if (i == 0) {
                wre.m54934b(obj);
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.this$0;
                this.label = 1;
                session = realAWSCognitoAuthPlugin.getSession(this);
                if (session == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    action = (Action) this.L$0;
                    wre.m54934b(obj);
                    objMo35649z = obj;
                    hifVar = (hif) objMo35649z;
                    if (hifVar != null) {
                        action.call();
                        hifVar2 = hifVar;
                    }
                    if (hifVar2 == null) {
                        this.$onError.accept(new SignedOutException(null, null, null, 7, null));
                        y3i y3iVar = y3i.f54824a;
                    }
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
                session = obj;
            }
            AWSCognitoUserPoolTokens value = ((AWSCognitoAuthSession) session).getUserPoolTokensResult().getValue();
            String accessToken = value != null ? value.getAccessToken() : null;
            if (accessToken != null) {
                RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin2 = this.this$0;
                MFAPreference mFAPreference = this.$sms;
                MFAPreference mFAPreference2 = this.$totp;
                MFAPreference mFAPreference3 = this.$email;
                boolean z2 = this.$overridePreferredSetting;
                UserMFAPreference userMFAPreference = this.$userPreference;
                Action action2 = this.$onSuccess;
                kg3 cognitoIdentityProviderClient = realAWSCognitoAuthPlugin2.authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    gif.C13744a c13744a = new gif.C13744a();
                    c13744a.m28825f(accessToken);
                    if (mFAPreference != null) {
                        Boolean mfaPreferred$aws_auth_cognito_release = mFAPreference.getMfaPreferred$aws_auth_cognito_release();
                        swfVarM49027a = swf.f46038c.m49027a(new RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$1$1(mFAPreference, mfaPreferred$aws_auth_cognito_release != null ? mfaPreferred$aws_auth_cognito_release.booleanValue() : z2 && userMFAPreference.getPreferred() == MFAType.SMS && mFAPreference.getMfaEnabled$aws_auth_cognito_release()));
                    } else {
                        swfVarM49027a = null;
                    }
                    c13744a.m28827h(swfVarM49027a);
                    if (mFAPreference2 != null) {
                        Boolean mfaPreferred$aws_auth_cognito_release2 = mFAPreference2.getMfaPreferred$aws_auth_cognito_release();
                        czfVarM22138a = czf.f18881c.m22138a(new RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$2$1(mFAPreference2, mfaPreferred$aws_auth_cognito_release2 != null ? mfaPreferred$aws_auth_cognito_release2.booleanValue() : z2 && userMFAPreference.getPreferred() == MFAType.TOTP && mFAPreference2.getMfaEnabled$aws_auth_cognito_release()));
                    } else {
                        czfVarM22138a = null;
                    }
                    c13744a.m28828i(czfVarM22138a);
                    if (mFAPreference3 != null) {
                        Boolean mfaPreferred$aws_auth_cognito_release3 = mFAPreference3.getMfaPreferred$aws_auth_cognito_release();
                        boolean zBooleanValue = mfaPreferred$aws_auth_cognito_release3 != null ? mfaPreferred$aws_auth_cognito_release3.booleanValue() : z2 && userMFAPreference.getPreferred() == MFAType.EMAIL && mFAPreference3.getMfaEnabled$aws_auth_cognito_release();
                        t46.C16988b c16988b = t46.f46344c;
                        if (!zBooleanValue) {
                            z = false;
                        }
                        t46VarM49279a = c16988b.m49279a(new RealAWSCognitoAuthPlugin$updateMFAPreference$1$1$1$1$1$3$1(mFAPreference3, z));
                    } else {
                        t46VarM49279a = null;
                    }
                    c13744a.m28826g(t46VarM49279a);
                    gif gifVarM28820a = c13744a.m28820a();
                    this.L$0 = action2;
                    this.label = 2;
                    objMo35649z = cognitoIdentityProviderClient.mo35649z(gifVarM28820a, this);
                    if (objMo35649z == objM51918f) {
                        return objM51918f;
                    }
                    action = action2;
                    hifVar = (hif) objMo35649z;
                    if (hifVar != null) {
                    }
                }
                if (hifVar2 == null) {
                }
                return y3i.f54824a;
            }
            this.$onError.accept(new SignedOutException(null, null, null, 7, null));
            y3i y3iVar2 = y3i.f54824a;
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C104341) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAWSCognitoAuthPlugin$updateMFAPreference$1$1(Consumer<AuthException> consumer, RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, boolean z, UserMFAPreference userMFAPreference, Action action) {
        super(1);
        this.$onError = consumer;
        this.this$0 = realAWSCognitoAuthPlugin;
        this.$sms = mFAPreference;
        this.$totp = mFAPreference2;
        this.$email = mFAPreference3;
        this.$overridePreferredSetting = z;
        this.$userPreference = userMFAPreference;
        this.$onSuccess = action;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AuthState) obj);
        return y3i.f54824a;
    }

    public final void invoke(AuthState authState) {
        sq8.m48649h(authState, "authState");
        if (authState.getAuthNState() instanceof AuthenticationState.SignedIn) {
            rm1.m46952d(kt7.f32697a, null, null, new C104341(this.this$0, this.$onError, this.$sms, this.$totp, this.$email, this.$overridePreferredSetting, this.$userPreference, this.$onSuccess, null), 3, null);
        } else {
            this.$onError.accept(new InvalidStateException(null, null, null, 7, null));
        }
    }
}
