package com.amplifyframework.auth.cognito;

import an.j2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import aw.C0465e;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCognitoAuthMetadataType;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthPlugin;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.C0989b;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.auth.cognito.asf.UserContextDataProvider;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException;
import com.amplifyframework.auth.cognito.helpers.AuthLogger;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase;
import com.amplifyframework.auth.cognito.usecases.AuthUseCaseFactory;
import com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase;
import com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase;
import com.amplifyframework.auth.cognito.usecases.ConfirmSignUpUseCase;
import com.amplifyframework.auth.cognito.usecases.ConfirmUserAttributeUseCase;
import com.amplifyframework.auth.cognito.usecases.DeleteUserUseCase;
import com.amplifyframework.auth.cognito.usecases.DeleteWebAuthnCredentialUseCase;
import com.amplifyframework.auth.cognito.usecases.FetchDevicesUseCase;
import com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase;
import com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase;
import com.amplifyframework.auth.cognito.usecases.ForgetDeviceUseCase;
import com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase;
import com.amplifyframework.auth.cognito.usecases.ListWebAuthnCredentialsUseCase;
import com.amplifyframework.auth.cognito.usecases.RememberDeviceUseCase;
import com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCase;
import com.amplifyframework.auth.cognito.usecases.ResendUserAttributeConfirmationUseCase;
import com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase;
import com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase;
import com.amplifyframework.auth.cognito.usecases.SignUpUseCase;
import com.amplifyframework.auth.cognito.usecases.UpdateMfaPreferenceUseCase;
import com.amplifyframework.auth.cognito.usecases.UpdatePasswordUseCase;
import com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase;
import com.amplifyframework.auth.cognito.usecases.VerifyTotpSetupUseCase;
import com.amplifyframework.auth.exceptions.ConfigurationException;
import com.amplifyframework.auth.options.AuthAssociateWebAuthnCredentialsOptions;
import com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.auth.options.AuthDeleteWebAuthnCredentialOptions;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions;
import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributeOptions;
import com.amplifyframework.auth.options.AuthUpdateUserAttributesOptions;
import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthListWebAuthnCredentialsResult;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.configuration.AmplifyOutputsData;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4152j;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import og.od;
import org.bouncycastle.asn1.x509.DisplayText;
import org.json.JSONObject;
import pg.o6;
import pg.x5;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;
import qw.a0;
import tx.InterfaceC7266z;
import tx.b0;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import vx.InterfaceC7810l;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AWSCognitoAuthPlugin extends AuthPlugin<AWSCognitoAuthService> {
    public static final String AWS_COGNITO_AUTH_LOG_NAMESPACE = "amplify:aws-cognito-auth:%s";
    private static final String AWS_COGNITO_AUTH_PLUGIN_KEY = "awsCognitoAuthPlugin";
    public static final Companion Companion = new Companion(null);
    private final Logger logger = AuthLogger.authLogger(this);
    private final InterfaceC7266z pluginScope;
    private final InterfaceC7810l queueChannel;
    private final InterfaceC6357g queueFacade$delegate;
    public RealAWSCognitoAuthPlugin realPlugin;
    public AuthUseCaseFactory useCaseFactory;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$associateWebAuthnCredential$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {448}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$associateWebAuthnCredential$1 */
    public static final class C09901 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthAssociateWebAuthnCredentialsOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09901(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, InterfaceC7559c<? super C09901> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$callingActivity = activity;
            this.$options = authAssociateWebAuthnCredentialsOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09901(this.$callingActivity, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                AssociateWebAuthnCredentialUseCase associateWebAuthnCredentialUseCaseAssociateWebAuthnCredential = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().associateWebAuthnCredential();
                Activity activity = this.$callingActivity;
                AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions = this.$options;
                this.label = 1;
                if (associateWebAuthnCredentialUseCaseAssociateWebAuthnCredential.execute(activity, authAssociateWebAuthnCredentialsOptions, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C09901) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$autoSignIn$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {462}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$autoSignIn$1 */
    public static final class C09911 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C09911(InterfaceC7559c<? super C09911> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09911(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            AutoSignInUseCase autoSignInUseCaseAutoSignIn = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().autoSignIn();
            this.label = 1;
            Object objExecute = autoSignInUseCaseAutoSignIn.execute(this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C09911) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$blockQueueChannelWhileConfiguring$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {189}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$blockQueueChannelWhileConfiguring$1 */
    public static final class C09921 extends AbstractC8199i implements InterfaceC2141e {
        int label;

        public C09921(InterfaceC7559c<? super C09921> interfaceC7559c) {
            super(2, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09921(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                RealAWSCognitoAuthPlugin realPlugin$aws_auth_cognito_release = AWSCognitoAuthPlugin.this.getRealPlugin$aws_auth_cognito_release();
                this.label = 1;
                if (realPlugin$aws_auth_cognito_release.suspendWhileConfiguring$aws_auth_cognito_release(this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C09921) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$clearFederationToIdentityPool$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {526}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$clearFederationToIdentityPool$1 */
    public static final class C09931 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C09931(InterfaceC7559c<? super C09931> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09931(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                if (queueFacade.clearFederationToIdentityPool(this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C09931) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {332}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$1 */
    public static final class C09941 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $newPassword;
        final /* synthetic */ AuthConfirmResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09941(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, InterfaceC7559c<? super C09941> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$newPassword = str2;
            this.$confirmationCode = str3;
            this.$options = authConfirmResetPasswordOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09941(this.$username, this.$newPassword, this.$confirmationCode, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                ConfirmResetPasswordUseCase confirmResetPasswordUseCaseConfirmResetPassword = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().confirmResetPassword();
                String str = this.$username;
                String str2 = this.$newPassword;
                String str3 = this.$confirmationCode;
                AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions = this.$options;
                this.label = 1;
                if (confirmResetPasswordUseCaseConfirmResetPassword.execute(str, str2, str3, authConfirmResetPasswordOptions, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C09941) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {342}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$2 */
    public static final class C09952 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09952(String str, String str2, String str3, InterfaceC7559c<? super C09952> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$newPassword = str2;
            this.$confirmationCode = str3;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09952(this.$username, this.$newPassword, this.$confirmationCode, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                ConfirmResetPasswordUseCase confirmResetPasswordUseCaseConfirmResetPassword = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().confirmResetPassword();
                String str = this.$username;
                String str2 = this.$newPassword;
                String str3 = this.$confirmationCode;
                this.label = 1;
                if (ConfirmResetPasswordUseCase.execute$default(confirmResetPasswordUseCaseConfirmResetPassword, str, str2, str3, null, this, 8, null) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C09952) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {249}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$1 */
    public static final class C09961 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $challengeResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09961(String str, InterfaceC7559c<? super C09961> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$challengeResponse = str;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09961(this.$challengeResponse, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            String str = this.$challengeResponse;
            this.label = 1;
            Object objConfirmSignIn = queueFacade.confirmSignIn(str, this);
            return objConfirmSignIn == enumC7794a ? enumC7794a : objConfirmSignIn;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C09961) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {256}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$2 */
    public static final class C09972 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $challengeResponse;
        final /* synthetic */ AuthConfirmSignInOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09972(String str, AuthConfirmSignInOptions authConfirmSignInOptions, InterfaceC7559c<? super C09972> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$challengeResponse = str;
            this.$options = authConfirmSignInOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09972(this.$challengeResponse, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            String str = this.$challengeResponse;
            AuthConfirmSignInOptions authConfirmSignInOptions = this.$options;
            this.label = 1;
            Object objConfirmSignIn = queueFacade.confirmSignIn(str, authConfirmSignInOptions, this);
            return objConfirmSignIn == enumC7794a ? enumC7794a : objConfirmSignIn;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C09972) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {207}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$1 */
    public static final class C09981 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09981(String str, String str2, InterfaceC7559c<? super C09981> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$confirmationCode = str2;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09981(this.$username, this.$confirmationCode, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ConfirmSignUpUseCase confirmSignUpUseCaseConfirmSignUp = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().confirmSignUp();
            String str = this.$username;
            String str2 = this.$confirmationCode;
            this.label = 1;
            Object objExecute$default = ConfirmSignUpUseCase.execute$default(confirmSignUpUseCaseConfirmSignUp, str, str2, null, this, 4, null);
            return objExecute$default == enumC7794a ? enumC7794a : objExecute$default;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignUpResult> interfaceC7559c) {
            return ((C09981) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {215}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$2 */
    public static final class C09992 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ AuthConfirmSignUpOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C09992(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, InterfaceC7559c<? super C09992> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$confirmationCode = str2;
            this.$options = authConfirmSignUpOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C09992(this.$username, this.$confirmationCode, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ConfirmSignUpUseCase confirmSignUpUseCaseConfirmSignUp = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().confirmSignUp();
            String str = this.$username;
            String str2 = this.$confirmationCode;
            AuthConfirmSignUpOptions authConfirmSignUpOptions = this.$options;
            this.label = 1;
            Object objExecute = confirmSignUpUseCaseConfirmSignUp.execute(str, str2, authConfirmSignUpOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignUpResult> interfaceC7559c) {
            return ((C09992) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmUserAttribute$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {399}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmUserAttribute$1 */
    public static final class C10001 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        final /* synthetic */ String $confirmationCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10001(AuthUserAttributeKey authUserAttributeKey, String str, InterfaceC7559c<? super C10001> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$attributeKey = authUserAttributeKey;
            this.$confirmationCode = str;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10001(this.$attributeKey, this.$confirmationCode, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                ConfirmUserAttributeUseCase confirmUserAttributeUseCaseConfirmUserAttribute = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().confirmUserAttribute();
                AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                String str = this.$confirmationCode;
                this.label = 1;
                if (confirmUserAttributeUseCaseConfirmUserAttribute.execute(authUserAttributeKey, str, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10001) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteUser$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {415}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteUser$1 */
    public static final class C10011 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10011(InterfaceC7559c<? super C10011> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10011(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                DeleteUserUseCase deleteUserUseCaseDeleteUser = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().deleteUser();
                this.label = 1;
                if (deleteUserUseCaseDeleteUser.execute(this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10011) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteWebAuthnCredential$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {472}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteWebAuthnCredential$1 */
    public static final class C10021 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $credentialId;
        final /* synthetic */ AuthDeleteWebAuthnCredentialOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10021(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, InterfaceC7559c<? super C10021> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$credentialId = str;
            this.$options = authDeleteWebAuthnCredentialOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10021(this.$credentialId, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                DeleteWebAuthnCredentialUseCase deleteWebAuthnCredentialUseCaseDeleteWebAuthnCredential = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().deleteWebAuthnCredential();
                String str = this.$credentialId;
                AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions = this.$options;
                this.label = 1;
                if (deleteWebAuthnCredentialUseCaseDeleteWebAuthnCredential.execute(str, authDeleteWebAuthnCredentialOptions, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10021) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$2 */
    public static final /* synthetic */ class C10032 extends AbstractC4152j implements InterfaceC2139c {
        public C10032(Object obj) {
            super(1, 0, Consumer.class, obj, "accept", "accept(Ljava/lang/Object;)V");
        }

        @Override // ex.InterfaceC2139c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthException) obj);
            return a0.f30746a;
        }

        public final void invoke(AuthException p02) {
            AbstractC4154l.m8923f(p02, "p0");
            ((Consumer) this.receiver).accept(p02);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$3 */
    public static final /* synthetic */ class C10043 extends AbstractC4152j implements InterfaceC2139c {
        public C10043(Object obj) {
            super(1, 0, Consumer.class, obj, "accept", "accept(Ljava/lang/Object;)V");
        }

        @Override // ex.InterfaceC2139c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m16555invoke((C10043) obj);
            return a0.f30746a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m16555invoke(T p02) {
            AbstractC4154l.m8923f(p02, "p0");
            ((Consumer) this.receiver).accept(p02);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$4 */
    public static final /* synthetic */ class C10054 extends AbstractC4152j implements InterfaceC2139c {
        public C10054(Object obj) {
            super(1, 0, Consumer.class, obj, "accept", "accept(Ljava/lang/Object;)V");
        }

        @Override // ex.InterfaceC2139c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthException) obj);
            return a0.f30746a;
        }

        public final void invoke(AuthException p02) {
            AbstractC4154l.m8923f(p02, "p0");
            ((Consumer) this.receiver).accept(p02);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {573}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5 */
    public static final class C10065 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ InterfaceC2139c $block;
        final /* synthetic */ InterfaceC2139c $onError;
        final /* synthetic */ InterfaceC2139c $onSuccess;
        int label;
        final /* synthetic */ AWSCognitoAuthPlugin this$0;

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {}, m15346m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends AbstractC8199i implements InterfaceC2141e {
            final /* synthetic */ InterfaceC2139c $onSuccess;
            final /* synthetic */ T $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC2139c interfaceC2139c, T t7, InterfaceC7559c<? super AnonymousClass1> interfaceC7559c) {
                super(2, interfaceC7559c);
                this.$onSuccess = interfaceC2139c;
                this.$result = t7;
            }

            @Override // ww.AbstractC8191a
            public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
                return new AnonymousClass1(this.$onSuccess, this.$result, interfaceC7559c);
            }

            @Override // ww.AbstractC8191a
            public final Object invokeSuspend(Object obj) {
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                this.$onSuccess.invoke(this.$result);
                return a0.f30746a;
            }

            @Override // ex.InterfaceC2141e
            public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
                return ((AnonymousClass1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
            }
        }

        /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
        @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {}, m15346m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC8199i implements InterfaceC2141e {
            final /* synthetic */ Exception $e;
            final /* synthetic */ InterfaceC2139c $onError;
            int label;
            final /* synthetic */ AWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC2139c interfaceC2139c, AWSCognitoAuthPlugin aWSCognitoAuthPlugin, Exception exc, InterfaceC7559c<? super AnonymousClass2> interfaceC7559c) {
                super(2, interfaceC7559c);
                this.$onError = interfaceC2139c;
                this.this$0 = aWSCognitoAuthPlugin;
                this.$e = exc;
            }

            @Override // ww.AbstractC8191a
            public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
                return new AnonymousClass2(this.$onError, this.this$0, this.$e, interfaceC7559c);
            }

            @Override // ww.AbstractC8191a
            public final Object invokeSuspend(Object obj) {
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                this.$onError.invoke(this.this$0.toAuthException(this.$e));
                return a0.f30746a;
            }

            @Override // ex.InterfaceC2141e
            public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
                return ((AnonymousClass2) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10065(InterfaceC2139c interfaceC2139c, AWSCognitoAuthPlugin aWSCognitoAuthPlugin, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3, InterfaceC7559c<? super C10065> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$block = interfaceC2139c;
            this.this$0 = aWSCognitoAuthPlugin;
            this.$onSuccess = interfaceC2139c2;
            this.$onError = interfaceC2139c3;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            return new C10065(this.$block, this.this$0, this.$onSuccess, this.$onError, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    od.m10798c(obj);
                    InterfaceC2139c interfaceC2139c = this.$block;
                    this.label = 1;
                    obj = interfaceC2139c.invoke(this);
                    if (obj == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                c0.m13502y(this.this$0.pluginScope, null, null, new AnonymousClass1(this.$onSuccess, obj, null), 3);
            } catch (Exception e2) {
                c0.m13502y(this.this$0.pluginScope, null, null, new AnonymousClass2(this.$onError, this.this$0, e2, null), 3);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2141e
        public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10065) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {492}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$1 */
    public static final class C10071 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthProvider $authProvider;
        final /* synthetic */ String $providerToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10071(String str, AuthProvider authProvider, InterfaceC7559c<? super C10071> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$providerToken = str;
            this.$authProvider = authProvider;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10071(this.$providerToken, this.$authProvider, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            String str = this.$providerToken;
            AuthProvider authProvider = this.$authProvider;
            FederateToIdentityPoolOptions federateToIdentityPoolOptionsBuild = FederateToIdentityPoolOptions.Companion.builder().build();
            this.label = 1;
            Object objFederateToIdentityPool = queueFacade.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptionsBuild, this);
            return objFederateToIdentityPool == enumC7794a ? enumC7794a : objFederateToIdentityPool;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super FederateToIdentityPoolResult> interfaceC7559c) {
            return ((C10071) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {513}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$2 */
    public static final class C10082 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthProvider $authProvider;
        final /* synthetic */ FederateToIdentityPoolOptions $options;
        final /* synthetic */ String $providerToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10082(String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, InterfaceC7559c<? super C10082> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$providerToken = str;
            this.$authProvider = authProvider;
            this.$options = federateToIdentityPoolOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10082(this.$providerToken, this.$authProvider, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            String str = this.$providerToken;
            AuthProvider authProvider = this.$authProvider;
            FederateToIdentityPoolOptions federateToIdentityPoolOptions = this.$options;
            this.label = 1;
            Object objFederateToIdentityPool = queueFacade.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptions, this);
            return objFederateToIdentityPool == enumC7794a ? enumC7794a : objFederateToIdentityPool;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super FederateToIdentityPoolResult> interfaceC7559c) {
            return ((C10082) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {294}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$1 */
    public static final class C10091 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthFetchSessionOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10091(AuthFetchSessionOptions authFetchSessionOptions, InterfaceC7559c<? super C10091> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$options = authFetchSessionOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10091(this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            AuthFetchSessionOptions authFetchSessionOptions = this.$options;
            this.label = 1;
            Object objFetchAuthSession = queueFacade.fetchAuthSession(authFetchSessionOptions, this);
            return objFetchAuthSession == enumC7794a ? enumC7794a : objFetchAuthSession;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSession> interfaceC7559c) {
            return ((C10091) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {297}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$2 */
    public static final class C10102 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10102(InterfaceC7559c<? super C10102> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10102(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            this.label = 1;
            Object objFetchAuthSession = queueFacade.fetchAuthSession(this);
            return objFetchAuthSession == enumC7794a ? enumC7794a : objFetchAuthSession;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSession> interfaceC7559c) {
            return ((C10102) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchDevices$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {309}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchDevices$1 */
    public static final class C10111 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10111(InterfaceC7559c<? super C10111> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10111(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            FetchDevicesUseCase fetchDevicesUseCaseFetchDevices = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().fetchDevices();
            this.label = 1;
            Object objExecute = fetchDevicesUseCaseFetchDevices.execute(this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super List<AuthDevice>> interfaceC7559c) {
            return ((C10111) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchMFAPreference$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {529}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchMFAPreference$1 */
    public static final class C10121 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10121(InterfaceC7559c<? super C10121> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10121(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            FetchMfaPreferenceUseCase fetchMfaPreferenceUseCaseFetchMfaPreference = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().fetchMfaPreference();
            this.label = 1;
            Object objExecute = fetchMfaPreferenceUseCaseFetchMfaPreference.execute(this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super UserMFAPreference> interfaceC7559c) {
            return ((C10121) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchUserAttributes$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {353}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchUserAttributes$1 */
    public static final class C10131 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10131(InterfaceC7559c<? super C10131> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10131(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            FetchUserAttributesUseCase fetchUserAttributesUseCaseFetchUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().fetchUserAttributes();
            this.label = 1;
            Object objExecute = fetchUserAttributesUseCaseFetchUserAttributes.execute(this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super List<AuthUserAttribute>> interfaceC7559c) {
            return ((C10131) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {303}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$1 */
    public static final class C10141 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10141(InterfaceC7559c<? super C10141> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10141(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                ForgetDeviceUseCase forgetDeviceUseCaseForgetDevice = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().forgetDevice();
                this.label = 1;
                if (ForgetDeviceUseCase.execute$default(forgetDeviceUseCaseForgetDevice, null, this, 1, null) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10141) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {306}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$2 */
    public static final class C10152 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthDevice $device;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10152(AuthDevice authDevice, InterfaceC7559c<? super C10152> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$device = authDevice;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10152(this.$device, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                ForgetDeviceUseCase forgetDeviceUseCaseForgetDevice = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().forgetDevice();
                AuthDevice authDevice = this.$device;
                this.label = 1;
                if (forgetDeviceUseCaseForgetDevice.execute(authDevice, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10152) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$getCurrentUser$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {402}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$getCurrentUser$1 */
    public static final class C10161 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10161(InterfaceC7559c<? super C10161> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10161(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            GetCurrentUserUseCase currentUser = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().getCurrentUser();
            this.label = 1;
            Object objExecute = currentUser.execute(this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthUser> interfaceC7559c) {
            return ((C10161) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$listWebAuthnCredentials$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {459}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$listWebAuthnCredentials$1 */
    public static final class C10171 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthListWebAuthnCredentialsOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10171(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions, InterfaceC7559c<? super C10171> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$options = authListWebAuthnCredentialsOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10171(this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ListWebAuthnCredentialsUseCase listWebAuthnCredentialsUseCaseListWebAuthnCredentials = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().listWebAuthnCredentials();
            AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions = this.$options;
            this.label = 1;
            Object objExecute = listWebAuthnCredentialsUseCaseListWebAuthnCredentials.execute(authListWebAuthnCredentialsOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthListWebAuthnCredentialsResult> interfaceC7559c) {
            return ((C10171) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$rememberDevice$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {300}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$rememberDevice$1 */
    public static final class C10181 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10181(InterfaceC7559c<? super C10181> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10181(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                RememberDeviceUseCase rememberDeviceUseCaseRememberDevice = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().rememberDevice();
                this.label = 1;
                if (rememberDeviceUseCaseRememberDevice.execute(this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10181) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {221}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$1 */
    public static final class C10191 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10191(String str, InterfaceC7559c<? super C10191> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10191(this.$username, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ResendSignupCodeUseCase resendSignupCodeUseCaseResendSignupCode = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resendSignupCode();
            String str = this.$username;
            this.label = 1;
            Object objExecute$default = ResendSignupCodeUseCase.execute$default(resendSignupCodeUseCaseResendSignupCode, str, null, this, 2, null);
            return objExecute$default == enumC7794a ? enumC7794a : objExecute$default;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c) {
            return ((C10191) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {228}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$2 */
    public static final class C10202 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthResendSignUpCodeOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10202(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, InterfaceC7559c<? super C10202> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$options = authResendSignUpCodeOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10202(this.$username, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ResendSignupCodeUseCase resendSignupCodeUseCaseResendSignupCode = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resendSignupCode();
            String str = this.$username;
            AuthResendSignUpCodeOptions authResendSignUpCodeOptions = this.$options;
            this.label = 1;
            Object objExecute = resendSignupCodeUseCaseResendSignupCode.execute(str, authResendSignUpCodeOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c) {
            return ((C10202) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {386}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1 */
    public static final class C10211 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        final /* synthetic */ AuthResendUserAttributeConfirmationCodeOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10211(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, InterfaceC7559c<? super C10211> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$attributeKey = authUserAttributeKey;
            this.$options = authResendUserAttributeConfirmationCodeOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10211(this.$attributeKey, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) throws CodeDeliveryFailureException, InvalidUserPoolConfigurationException {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resendUserAttributeConfirmation();
            AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
            AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions = this.$options;
            this.label = 1;
            Object objExecute = resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation.execute(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c) {
            return ((C10211) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {392}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$2 */
    public static final class C10222 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10222(AuthUserAttributeKey authUserAttributeKey, InterfaceC7559c<? super C10222> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$attributeKey = authUserAttributeKey;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10222(this.$attributeKey, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resendUserAttributeConfirmation();
            AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
            this.label = 1;
            Object objExecute$default = ResendUserAttributeConfirmationUseCase.execute$default(resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation, authUserAttributeKey, null, this, 2, null);
            return objExecute$default == enumC7794a ? enumC7794a : objExecute$default;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c) {
            return ((C10222) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {316}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$1 */
    public static final class C10231 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10231(String str, AuthResetPasswordOptions authResetPasswordOptions, InterfaceC7559c<? super C10231> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$options = authResetPasswordOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10231(this.$username, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ResetPasswordUseCase resetPasswordUseCaseResetPassword = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resetPassword();
            String str = this.$username;
            AuthResetPasswordOptions authResetPasswordOptions = this.$options;
            this.label = 1;
            Object objExecute = resetPasswordUseCaseResetPassword.execute(str, authResetPasswordOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthResetPasswordResult> interfaceC7559c) {
            return ((C10231) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {322}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$2 */
    public static final class C10242 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10242(String str, InterfaceC7559c<? super C10242> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10242(this.$username, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            ResetPasswordUseCase resetPasswordUseCaseResetPassword = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resetPassword();
            String str = this.$username;
            this.label = 1;
            Object objExecute$default = ResetPasswordUseCase.execute$default(resetPasswordUseCaseResetPassword, str, null, this, 2, null);
            return objExecute$default == enumC7794a ? enumC7794a : objExecute$default;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthResetPasswordResult> interfaceC7559c) {
            return ((C10242) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$setUpTOTP$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {419}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$setUpTOTP$1 */
    public static final class C10251 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10251(InterfaceC7559c<? super C10251> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10251(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            SetupTotpUseCase setupTotpUseCase = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().setupTotp();
            this.label = 1;
            Object objExecute = setupTotpUseCase.execute(this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super TOTPSetupDetails> interfaceC7559c) {
            return ((C10251) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {235}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$1 */
    public static final class C10261 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10261(String str, String str2, InterfaceC7559c<? super C10261> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$password = str2;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10261(this.$username, this.$password, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            String str = this.$username;
            String str2 = this.$password;
            this.label = 1;
            Object objSignIn = queueFacade.signIn(str, str2, this);
            return objSignIn == enumC7794a ? enumC7794a : objSignIn;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C10261) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {243}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$2 */
    public static final class C10272 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthSignInOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10272(String str, String str2, AuthSignInOptions authSignInOptions, InterfaceC7559c<? super C10272> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$password = str2;
            this.$options = authSignInOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10272(this.$username, this.$password, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            String str = this.$username;
            String str2 = this.$password;
            AuthSignInOptions authSignInOptions = this.$options;
            this.label = 1;
            Object objSignIn = queueFacade.signIn(str, str2, authSignInOptions, this);
            return objSignIn == enumC7794a ? enumC7794a : objSignIn;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C10272) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {263}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$1 */
    public static final class C10281 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthProvider $provider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10281(AuthProvider authProvider, Activity activity, InterfaceC7559c<? super C10281> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$provider = authProvider;
            this.$callingActivity = activity;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10281(this.$provider, this.$callingActivity, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            AuthProvider authProvider = this.$provider;
            Activity activity = this.$callingActivity;
            this.label = 1;
            Object objSignInWithSocialWebUI = queueFacade.signInWithSocialWebUI(authProvider, activity, this);
            return objSignInWithSocialWebUI == enumC7794a ? enumC7794a : objSignInWithSocialWebUI;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C10281) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {271}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$2 */
    public static final class C10292 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthWebUISignInOptions $options;
        final /* synthetic */ AuthProvider $provider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10292(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super C10292> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$provider = authProvider;
            this.$callingActivity = activity;
            this.$options = authWebUISignInOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10292(this.$provider, this.$callingActivity, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            AuthProvider authProvider = this.$provider;
            Activity activity = this.$callingActivity;
            AuthWebUISignInOptions authWebUISignInOptions = this.$options;
            this.label = 1;
            Object objSignInWithSocialWebUI = queueFacade.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, this);
            return objSignInWithSocialWebUI == enumC7794a ? enumC7794a : objSignInWithSocialWebUI;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C10292) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {277}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$1 */
    public static final class C10301 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ Activity $callingActivity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10301(Activity activity, InterfaceC7559c<? super C10301> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$callingActivity = activity;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10301(this.$callingActivity, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            Activity activity = this.$callingActivity;
            this.label = 1;
            Object objSignInWithWebUI = queueFacade.signInWithWebUI(activity, this);
            return objSignInWithWebUI == enumC7794a ? enumC7794a : objSignInWithWebUI;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C10301) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {284}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$2 */
    public static final class C10312 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthWebUISignInOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10312(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super C10312> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$callingActivity = activity;
            this.$options = authWebUISignInOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10312(this.$callingActivity, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            Activity activity = this.$callingActivity;
            AuthWebUISignInOptions authWebUISignInOptions = this.$options;
            this.label = 1;
            Object objSignInWithWebUI = queueFacade.signInWithWebUI(activity, authWebUISignInOptions, this);
            return objSignInWithWebUI == enumC7794a ? enumC7794a : objSignInWithWebUI;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
            return ((C10312) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {407}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$2 */
    public static final class C10322 extends AbstractC8199i implements InterfaceC2139c {
        int label;

        public C10322(InterfaceC7559c<? super C10322> interfaceC7559c) {
            super(1, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10322(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            this.label = 1;
            Object objSignOut = queueFacade.signOut(this);
            return objSignOut == enumC7794a ? enumC7794a : objSignOut;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignOutResult> interfaceC7559c) {
            return ((C10322) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$4", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {412}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$4 */
    public static final class C10334 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthSignOutOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10334(AuthSignOutOptions authSignOutOptions, InterfaceC7559c<? super C10334> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$options = authSignOutOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10334(this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
            AuthSignOutOptions authSignOutOptions = this.$options;
            this.label = 1;
            Object objSignOut = queueFacade.signOut(authSignOutOptions, this);
            return objSignOut == enumC7794a ? enumC7794a : objSignOut;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignOutResult> interfaceC7559c) {
            return ((C10334) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signUp$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signUp$1 */
    public static final class C10341 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthSignUpOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10341(String str, String str2, AuthSignUpOptions authSignUpOptions, InterfaceC7559c<? super C10341> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$username = str;
            this.$password = str2;
            this.$options = authSignUpOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10341(this.$username, this.$password, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            SignUpUseCase signUpUseCaseSignUp = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().signUp();
            String str = this.$username;
            String str2 = this.$password;
            AuthSignUpOptions authSignUpOptions = this.$options;
            this.label = 1;
            Object objExecute = signUpUseCaseSignUp.execute(str, str2, authSignUpOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthSignUpResult> interfaceC7559c) {
            return ((C10341) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {538}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$1 */
    public static final class C10351 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ MFAPreference $sms;
        final /* synthetic */ MFAPreference $totp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10351(MFAPreference mFAPreference, MFAPreference mFAPreference2, InterfaceC7559c<? super C10351> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$sms = mFAPreference;
            this.$totp = mFAPreference2;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10351(this.$sms, this.$totp, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                UpdateMfaPreferenceUseCase updateMfaPreferenceUseCaseUpdateMfaPreference = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateMfaPreference();
                MFAPreference mFAPreference = this.$sms;
                MFAPreference mFAPreference2 = this.$totp;
                this.label = 1;
                if (updateMfaPreferenceUseCaseUpdateMfaPreference.execute(mFAPreference, mFAPreference2, null, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10351) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {552}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$2 */
    public static final class C10362 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ MFAPreference $email;
        final /* synthetic */ MFAPreference $sms;
        final /* synthetic */ MFAPreference $totp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10362(MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, InterfaceC7559c<? super C10362> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$sms = mFAPreference;
            this.$totp = mFAPreference2;
            this.$email = mFAPreference3;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10362(this.$sms, this.$totp, this.$email, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                UpdateMfaPreferenceUseCase updateMfaPreferenceUseCaseUpdateMfaPreference = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateMfaPreference();
                MFAPreference mFAPreference = this.$sms;
                MFAPreference mFAPreference2 = this.$totp;
                MFAPreference mFAPreference3 = this.$email;
                this.label = 1;
                if (updateMfaPreferenceUseCaseUpdateMfaPreference.execute(mFAPreference, mFAPreference2, mFAPreference3, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10362) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updatePassword$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {350}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updatePassword$1 */
    public static final class C10371 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $oldPassword;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10371(String str, String str2, InterfaceC7559c<? super C10371> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$oldPassword = str;
            this.$newPassword = str2;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10371(this.$oldPassword, this.$newPassword, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                UpdatePasswordUseCase updatePasswordUseCaseUpdatePassword = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updatePassword();
                String str = this.$oldPassword;
                String str2 = this.$newPassword;
                this.label = 1;
                if (updatePasswordUseCaseUpdatePassword.execute(str, str2, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10371) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {360}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$1 */
    public static final class C10381 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthUserAttribute $attribute;
        final /* synthetic */ AuthUpdateUserAttributeOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10381(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, InterfaceC7559c<? super C10381> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$attribute = authUserAttribute;
            this.$options = authUpdateUserAttributeOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10381(this.$attribute, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) throws InvalidUserPoolConfigurationException {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
            AuthUserAttribute authUserAttribute = this.$attribute;
            AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions = this.$options;
            this.label = 1;
            Object objExecute = updateUserAttributesUseCaseUpdateUserAttributes.execute(authUserAttribute, authUpdateUserAttributeOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthUpdateAttributeResult> interfaceC7559c) {
            return ((C10381) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {366}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$2 */
    public static final class C10392 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ AuthUserAttribute $attribute;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10392(AuthUserAttribute authUserAttribute, InterfaceC7559c<? super C10392> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$attribute = authUserAttribute;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10392(this.$attribute, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
            AuthUserAttribute authUserAttribute = this.$attribute;
            this.label = 1;
            Object objExecute$default = UpdateUserAttributesUseCase.execute$default(updateUserAttributesUseCaseUpdateUserAttributes, authUserAttribute, (AuthUpdateUserAttributeOptions) null, this, 2, (Object) null);
            return objExecute$default == enumC7794a ? enumC7794a : objExecute$default;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super AuthUpdateAttributeResult> interfaceC7559c) {
            return ((C10392) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {373}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$1 */
    public static final class C10401 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ List<AuthUserAttribute> $attributes;
        final /* synthetic */ AuthUpdateUserAttributesOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10401(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, InterfaceC7559c<? super C10401> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$attributes = list;
            this.$options = authUpdateUserAttributesOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10401(this.$attributes, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
            List<AuthUserAttribute> list = this.$attributes;
            AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions = this.$options;
            this.label = 1;
            Object objExecute = updateUserAttributesUseCaseUpdateUserAttributes.execute(list, authUpdateUserAttributesOptions, this);
            return objExecute == enumC7794a ? enumC7794a : objExecute;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> interfaceC7559c) {
            return ((C10401) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$2", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {379}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$2 */
    public static final class C10412 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ List<AuthUserAttribute> $attributes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10412(List<AuthUserAttribute> list, InterfaceC7559c<? super C10412> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$attributes = list;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10412(this.$attributes, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return obj;
            }
            od.m10798c(obj);
            UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
            List<AuthUserAttribute> list = this.$attributes;
            this.label = 1;
            Object objExecute$default = UpdateUserAttributesUseCase.execute$default(updateUserAttributesUseCaseUpdateUserAttributes, list, (AuthUpdateUserAttributesOptions) null, this, 2, (Object) null);
            return objExecute$default == enumC7794a ? enumC7794a : objExecute$default;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> interfaceC7559c) {
            return ((C10412) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$verifyTOTPSetup$1", m15344f = "AWSCognitoAuthPlugin.kt", m15345l = {430}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$verifyTOTPSetup$1 */
    public static final class C10421 extends AbstractC8199i implements InterfaceC2139c {
        final /* synthetic */ String $code;
        final /* synthetic */ AuthVerifyTOTPSetupOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10421(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, InterfaceC7559c<? super C10421> interfaceC7559c) {
            super(1, interfaceC7559c);
            this.$code = str;
            this.$options = authVerifyTOTPSetupOptions;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(InterfaceC7559c<?> interfaceC7559c) {
            return AWSCognitoAuthPlugin.this.new C10421(this.$code, this.$options, interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            int i10 = this.label;
            if (i10 == 0) {
                od.m10798c(obj);
                VerifyTotpSetupUseCase verifyTotpSetupUseCaseVerifyTotpSetup = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().verifyTotpSetup();
                String str = this.$code;
                AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions = this.$options;
                this.label = 1;
                if (verifyTotpSetupUseCaseVerifyTotpSetup.execute(str, authVerifyTOTPSetupOptions, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            return a0.f30746a;
        }

        @Override // ex.InterfaceC2139c
        public final Object invoke(InterfaceC7559c<? super a0> interfaceC7559c) {
            return ((C10421) create(interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    public AWSCognitoAuthPlugin() {
        C8810d c8810dM13479b = c0.m13479b(x5.m11928d(c0.m13480c(), m0.f34659a));
        this.pluginScope = c8810dM13479b;
        this.queueFacade$delegate = nd.m10782c(new C0465e(3, this));
        C7806h c7806hM11805a = o6.m11805a(Integer.MAX_VALUE, null, null, 6);
        c0.m13502y(c8810dM13479b, null, null, new AWSCognitoAuthPlugin$queueChannel$1$1(c7806hM11805a, null), 3);
        this.queueChannel = c7806hM11805a;
    }

    private final void blockQueueChannelWhileConfiguring() {
        this.queueChannel.mo14776i(c0.m13502y(this.pluginScope, null, b0.LAZY, new C09921(null), 1));
    }

    private final void enqueue(Action action, Consumer<AuthException> consumer, InterfaceC2139c interfaceC2139c) {
        enqueue(new j2(4, action), new C10032(consumer), interfaceC2139c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 enqueue$lambda$3(Action action, a0 it) {
        AbstractC4154l.m8923f(it, "it");
        action.call();
        return a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinAuthFacadeInternal getQueueFacade() {
        return (KotlinAuthFacadeInternal) this.queueFacade$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinAuthFacadeInternal queueFacade_delegate$lambda$0(AWSCognitoAuthPlugin aWSCognitoAuthPlugin) {
        return new KotlinAuthFacadeInternal(aWSCognitoAuthPlugin.getRealPlugin$aws_auth_cognito_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthException toAuthException(Exception exc) {
        return exc instanceof AuthException ? (AuthException) exc : CognitoAuthExceptionConverter.Companion.lookup(exc, "An unclassified error prevented this operation.");
    }

    public static /* synthetic */ void updateMFAPreference$default(AWSCognitoAuthPlugin aWSCognitoAuthPlugin, MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, Action action, Consumer consumer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mFAPreference = null;
        }
        if ((i10 & 2) != 0) {
            mFAPreference2 = null;
        }
        if ((i10 & 4) != 0) {
            mFAPreference3 = null;
        }
        aWSCognitoAuthPlugin.updateMFAPreference(mFAPreference, mFAPreference2, mFAPreference3, action, consumer);
    }

    @InternalAmplifyApi
    public final void addToUserAgent(AWSCognitoAuthMetadataType type, String value) {
        AbstractC4154l.m8923f(type, "type");
        AbstractC4154l.m8923f(value, "value");
        getRealPlugin$aws_auth_cognito_release().addToUserAgent(type, value);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void associateWebAuthnCredential(Activity callingActivity, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        associateWebAuthnCredential(callingActivity, AuthAssociateWebAuthnCredentialsOptions.Companion.defaults(), onSuccess, onError);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void autoSignIn(Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09911(null));
    }

    public final void clearFederationToIdentityPool(Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09931(null));
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject pluginConfiguration, Context context) throws ConfigurationException {
        AbstractC4154l.m8923f(pluginConfiguration, "pluginConfiguration");
        AbstractC4154l.m8923f(context, "context");
        try {
            configure(AuthConfiguration.Companion.fromJson$default(AuthConfiguration.Companion, pluginConfiguration, null, 2, null), context);
        } catch (Exception e2) {
            throw new ConfigurationException("Failed to configure AWSCognitoAuthPlugin.", "Make sure your amplifyconfiguration.json is valid.", e2);
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(String username, String newPassword, String confirmationCode, AuthConfirmResetPasswordOptions options, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(newPassword, "newPassword");
        AbstractC4154l.m8923f(confirmationCode, "confirmationCode");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09941(username, newPassword, confirmationCode, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(String challengeResponse, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(challengeResponse, "challengeResponse");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09961(challengeResponse, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(String username, String confirmationCode, Consumer<AuthSignUpResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(confirmationCode, "confirmationCode");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09981(username, confirmationCode, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmUserAttribute(AuthUserAttributeKey attributeKey, String confirmationCode, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(attributeKey, "attributeKey");
        AbstractC4154l.m8923f(confirmationCode, "confirmationCode");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10001(attributeKey, confirmationCode, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteUser(Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10011(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteWebAuthnCredential(String credentialId, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(credentialId, "credentialId");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        deleteWebAuthnCredential(credentialId, AuthDeleteWebAuthnCredentialOptions.Companion.defaults(), onSuccess, onError);
    }

    public final void federateToIdentityPool(String providerToken, AuthProvider authProvider, Consumer<FederateToIdentityPoolResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(providerToken, "providerToken");
        AbstractC4154l.m8923f(authProvider, "authProvider");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10071(providerToken, authProvider, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(AuthFetchSessionOptions options, Consumer<AuthSession> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10091(options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchDevices(Consumer<List<AuthDevice>> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10111(null));
    }

    public final void fetchMFAPreference(Consumer<UserMFAPreference> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10121(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchUserAttributes(Consumer<List<AuthUserAttribute>> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10131(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10141(null));
    }

    @InternalAmplifyApi
    public final AuthConfiguration getAuthConfiguration() {
        return getRealPlugin$aws_auth_cognito_release().getConfiguration();
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void getCurrentUser(Consumer<AuthUser> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10161(null));
    }

    @InterfaceC6353c
    @InternalAmplifyApi
    public final JSONObject getPluginConfiguration() {
        return AuthConfiguration.toGen1Json$aws_auth_cognito_release$default(getAuthConfiguration(), null, 1, null);
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getPluginKey() {
        return AWS_COGNITO_AUTH_PLUGIN_KEY;
    }

    public final RealAWSCognitoAuthPlugin getRealPlugin$aws_auth_cognito_release() {
        RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin = this.realPlugin;
        if (realAWSCognitoAuthPlugin != null) {
            return realAWSCognitoAuthPlugin;
        }
        AbstractC4154l.m8928k("realPlugin");
        throw null;
    }

    public final AuthUseCaseFactory getUseCaseFactory$aws_auth_cognito_release() {
        AuthUseCaseFactory authUseCaseFactory = this.useCaseFactory;
        if (authUseCaseFactory != null) {
            return authUseCaseFactory;
        }
        AbstractC4154l.m8928k("useCaseFactory");
        throw null;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.29.2";
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void handleWebUISignInResponse(Intent intent) {
        getQueueFacade().handleWebUISignInResponse(intent);
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) throws AmplifyException, InterruptedException {
        AbstractC4154l.m8923f(context, "context");
        getRealPlugin$aws_auth_cognito_release().initialize();
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void listWebAuthnCredentials(Consumer<AuthListWebAuthnCredentialsResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        listWebAuthnCredentials(AuthListWebAuthnCredentialsOptions.Companion.defaults(), onSuccess, onError);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void rememberDevice(Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10181(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(String username, Consumer<AuthCodeDeliveryDetails> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10191(username, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(AuthUserAttributeKey attributeKey, AuthResendUserAttributeConfirmationCodeOptions options, Consumer<AuthCodeDeliveryDetails> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(attributeKey, "attributeKey");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10211(attributeKey, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(String username, AuthResetPasswordOptions options, Consumer<AuthResetPasswordResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10231(username, options, null));
    }

    public final void setRealPlugin$aws_auth_cognito_release(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        AbstractC4154l.m8923f(realAWSCognitoAuthPlugin, "<set-?>");
        this.realPlugin = realAWSCognitoAuthPlugin;
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void setUpTOTP(Consumer<TOTPSetupDetails> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10251(null));
    }

    public final void setUseCaseFactory$aws_auth_cognito_release(AuthUseCaseFactory authUseCaseFactory) {
        AbstractC4154l.m8923f(authUseCaseFactory, "<set-?>");
        this.useCaseFactory = authUseCaseFactory;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10261(str, str2, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(AuthProvider provider, Activity callingActivity, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(provider, "provider");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10281(provider, callingActivity, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(Activity callingActivity, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10301(callingActivity, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(Consumer<AuthSignOutResult> onComplete) {
        AbstractC4154l.m8923f(onComplete, "onComplete");
        enqueue(onComplete, new C0989b(1, this), new C10322(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signUp(String username, String str, AuthSignUpOptions options, Consumer<AuthSignUpResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10341(username, str, options, null));
    }

    @InterfaceC6353c
    public final void updateMFAPreference(MFAPreference mFAPreference, MFAPreference mFAPreference2, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10351(mFAPreference, mFAPreference2, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updatePassword(String oldPassword, String newPassword, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(oldPassword, "oldPassword");
        AbstractC4154l.m8923f(newPassword, "newPassword");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10371(oldPassword, newPassword, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(AuthUserAttribute attribute, AuthUpdateUserAttributeOptions options, Consumer<AuthUpdateAttributeResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(attribute, "attribute");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10381(attribute, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(List<AuthUserAttribute> attributes, AuthUpdateUserAttributesOptions options, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(attributes, "attributes");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10401(attributes, options, null));
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(String code, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(code, "code");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        verifyTOTPSetup(code, new AWSCognitoAuthVerifyTOTPSetupOptions.CognitoBuilder().build(), onSuccess, onError);
    }

    private final <T> void enqueue(Consumer<T> consumer, Consumer<AuthException> consumer2, InterfaceC2139c interfaceC2139c) {
        enqueue(new C10043(consumer), new C10054(consumer2), interfaceC2139c);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(String username, String newPassword, String confirmationCode, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(newPassword, "newPassword");
        AbstractC4154l.m8923f(confirmationCode, "confirmationCode");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09952(username, newPassword, confirmationCode, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(String challengeResponse, AuthConfirmSignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(challengeResponse, "challengeResponse");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09972(challengeResponse, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(String username, String confirmationCode, AuthConfirmSignUpOptions options, Consumer<AuthSignUpResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(confirmationCode, "confirmationCode");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09992(username, confirmationCode, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteWebAuthnCredential(String credentialId, AuthDeleteWebAuthnCredentialOptions options, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(credentialId, "credentialId");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10021(credentialId, options, null));
    }

    public final void federateToIdentityPool(String providerToken, AuthProvider authProvider, FederateToIdentityPoolOptions options, Consumer<FederateToIdentityPoolResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(providerToken, "providerToken");
        AbstractC4154l.m8923f(authProvider, "authProvider");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10082(providerToken, authProvider, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(Consumer<AuthSession> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10102(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(AuthDevice device, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(device, "device");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10152(device, null));
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public AWSCognitoAuthService getEscapeHatch() {
        return getRealPlugin$aws_auth_cognito_release().escapeHatch();
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void listWebAuthnCredentials(AuthListWebAuthnCredentialsOptions options, Consumer<AuthListWebAuthnCredentialsResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10171(options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(String username, AuthResendSignUpCodeOptions options, Consumer<AuthCodeDeliveryDetails> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10202(username, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(AuthUserAttributeKey attributeKey, Consumer<AuthCodeDeliveryDetails> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(attributeKey, "attributeKey");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10222(attributeKey, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(String username, Consumer<AuthResetPasswordResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(username, "username");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10242(username, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, AuthSignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10272(str, str2, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(AuthProvider provider, Activity callingActivity, AuthWebUISignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(provider, "provider");
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10292(provider, callingActivity, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(Activity callingActivity, AuthWebUISignInOptions options, Consumer<AuthSignInResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10312(callingActivity, options, null));
    }

    public final void updateMFAPreference(MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10362(mFAPreference, mFAPreference2, mFAPreference3, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(AuthUserAttribute attribute, Consumer<AuthUpdateAttributeResult> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(attribute, "attribute");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10392(attribute, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(List<AuthUserAttribute> attributes, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(attributes, "attributes");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10412(attributes, null));
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(String code, AuthVerifyTOTPSetupOptions options, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(code, "code");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C10421(code, options, null));
    }

    private final <T> void enqueue(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, InterfaceC2139c interfaceC2139c3) {
        this.queueChannel.mo14776i(c0.m13502y(this.pluginScope, null, b0.LAZY, new C10065(interfaceC2139c3, this, interfaceC2139c, interfaceC2139c2, null), 1));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void associateWebAuthnCredential(Activity callingActivity, AuthAssociateWebAuthnCredentialsOptions options, Action onSuccess, Consumer<AuthException> onError) {
        AbstractC4154l.m8923f(callingActivity, "callingActivity");
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onSuccess, "onSuccess");
        AbstractC4154l.m8923f(onError, "onError");
        enqueue(onSuccess, onError, new C09901(callingActivity, options, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(AuthSignOutOptions options, Consumer<AuthSignOutResult> onComplete) {
        AbstractC4154l.m8923f(options, "options");
        AbstractC4154l.m8923f(onComplete, "onComplete");
        enqueue(onComplete, new C0989b(1, this), new C10334(options, null));
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    @InternalAmplifyApi
    public void configure(AmplifyOutputsData amplifyOutputs, Context context) throws ConfigurationException {
        AbstractC4154l.m8923f(amplifyOutputs, "amplifyOutputs");
        AbstractC4154l.m8923f(context, "context");
        try {
            configure(AuthConfiguration.Companion.from(amplifyOutputs), context);
        } catch (Exception e2) {
            throw new ConfigurationException("Failed to configure AWSCognitoAuthPlugin.", "Make sure your amplify_outputs.json is valid.", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void configure(AuthConfiguration authConfiguration, Context context) {
        UserContextDataProvider userContextDataProvider;
        CredentialStoreClient credentialStoreClient = new CredentialStoreClient(authConfiguration, context, this.logger);
        AWSCognitoAuthService aWSCognitoAuthServiceFromConfiguration$aws_auth_cognito_release = AWSCognitoAuthService.Companion.fromConfiguration$aws_auth_cognito_release(authConfiguration);
        UserPoolConfiguration userPool = authConfiguration.getUserPool();
        AuthState authState = null;
        Object[] objArr = 0;
        if (userPool != null) {
            String poolId = userPool.getPoolId();
            AbstractC4154l.m8920c(poolId);
            String appClient = userPool.getAppClient();
            AbstractC4154l.m8920c(appClient);
            userContextDataProvider = new UserContextDataProvider(context, poolId, appClient);
        } else {
            userContextDataProvider = null;
        }
        AuthEnvironment authEnvironment = new AuthEnvironment(context, authConfiguration, aWSCognitoAuthServiceFromConfiguration$aws_auth_cognito_release, credentialStoreClient, userContextDataProvider, HostedUIClient.Companion.create(context, authConfiguration.getOauth(), this.logger), this.logger);
        AuthStateMachine authStateMachine = new AuthStateMachine(authEnvironment, authState, 2, objArr == true ? 1 : 0);
        setRealPlugin$aws_auth_cognito_release(new RealAWSCognitoAuthPlugin(authConfiguration, authEnvironment, authStateMachine, this.logger));
        setUseCaseFactory$aws_auth_cognito_release(new AuthUseCaseFactory(getRealPlugin$aws_auth_cognito_release(), authEnvironment, authStateMachine));
        blockQueueChannelWhileConfiguring();
    }

    public static /* synthetic */ void getRealPlugin$aws_auth_cognito_release$annotations() {
    }

    public static /* synthetic */ void getUseCaseFactory$aws_auth_cognito_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIt(Throwable th2) throws Throwable {
        throw th2;
    }
}
