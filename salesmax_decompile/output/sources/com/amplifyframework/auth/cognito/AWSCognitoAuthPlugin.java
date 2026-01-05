package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.cognito.AuthConfiguration;
import com.amplifyframework.auth.cognito.asf.UserContextDataProvider;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException;
import com.amplifyframework.auth.cognito.helpers.AuthLogger;
import com.amplifyframework.auth.cognito.options.AWSCognitoAuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase;
import com.amplifyframework.auth.cognito.usecases.AuthUseCaseFactory;
import com.amplifyframework.auth.cognito.usecases.ConfirmUserAttributeUseCase;
import com.amplifyframework.auth.cognito.usecases.DeleteWebAuthnCredentialUseCase;
import com.amplifyframework.auth.cognito.usecases.FetchDevicesUseCase;
import com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase;
import com.amplifyframework.auth.cognito.usecases.ForgetDeviceUseCase;
import com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase;
import com.amplifyframework.auth.cognito.usecases.ListWebAuthnCredentialsUseCase;
import com.amplifyframework.auth.cognito.usecases.RememberDeviceUseCase;
import com.amplifyframework.auth.cognito.usecases.ResendUserAttributeConfirmationUseCase;
import com.amplifyframework.auth.cognito.usecases.UpdateUserAttributesUseCase;
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
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpStatus;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;
import p001o.a79;
import p001o.dm7;
import p001o.eu5;
import p001o.gi9;
import p001o.h84;
import p001o.i84;
import p001o.id5;
import p001o.jg2;
import p001o.jgg;
import p001o.kf9;
import p001o.l75;
import p001o.l84;
import p001o.n64;
import p001o.nl7;
import p001o.rm1;
import p001o.s1;
import p001o.si9;
import p001o.sq8;
import p001o.tg2;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AWSCognitoAuthPlugin extends AuthPlugin<AWSCognitoAuthService> {
    public static final String AWS_COGNITO_AUTH_LOG_NAMESPACE = "amplify:aws-cognito-auth:%s";
    private static final String AWS_COGNITO_AUTH_PLUGIN_KEY = "awsCognitoAuthPlugin";
    public static final Companion Companion = new Companion(null);
    private final Logger logger = AuthLogger.authLogger(this);
    private final h84 pluginScope;
    private final jg2 queueChannel;
    private final gi9 queueFacade$delegate;
    public RealAWSCognitoAuthPlugin realPlugin;
    public AuthUseCaseFactory useCaseFactory;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$associateWebAuthnCredential$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {446}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$associateWebAuthnCredential$1 */
    public static final class C103251 extends jgg implements xk7 {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthAssociateWebAuthnCredentialsOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103251(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, n64 n64Var) {
            super(1, n64Var);
            this.$callingActivity = activity;
            this.$options = authAssociateWebAuthnCredentialsOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103251(this.$callingActivity, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                AssociateWebAuthnCredentialUseCase associateWebAuthnCredentialUseCaseAssociateWebAuthnCredential = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().associateWebAuthnCredential();
                Activity activity = this.$callingActivity;
                AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions = this.$options;
                this.label = 1;
                if (associateWebAuthnCredentialUseCaseAssociateWebAuthnCredential.execute(activity, authAssociateWebAuthnCredentialsOptions, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103251) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$autoSignIn$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {460}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$autoSignIn$1 */
    public static final class C103261 extends jgg implements xk7 {
        int label;

        public C103261(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103261(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                obj = queueFacade.autoSignIn(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103261) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$blockQueueChannelWhileConfiguring$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {Opcodes.ANEWARRAY}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$blockQueueChannelWhileConfiguring$1 */
    public static final class C103271 extends jgg implements nl7 {
        int label;

        public C103271(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103271(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                RealAWSCognitoAuthPlugin realPlugin$aws_auth_cognito_release = AWSCognitoAuthPlugin.this.getRealPlugin$aws_auth_cognito_release();
                this.label = 1;
                if (realPlugin$aws_auth_cognito_release.suspendWhileConfiguring$aws_auth_cognito_release(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C103271) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$clearFederationToIdentityPool$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {524}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$clearFederationToIdentityPool$1 */
    public static final class C103281 extends jgg implements xk7 {
        int label;

        public C103281(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103281(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                if (queueFacade.clearFederationToIdentityPool(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103281) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {MediaError.DetailedErrorCode.SMOOTH_NO_MEDIA_DATA}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$1 */
    public static final class C103291 extends jgg implements xk7 {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $newPassword;
        final /* synthetic */ AuthConfirmResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103291(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$newPassword = str2;
            this.$confirmationCode = str3;
            this.$options = authConfirmResetPasswordOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103291(this.$username, this.$newPassword, this.$confirmationCode, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                String str2 = this.$newPassword;
                String str3 = this.$confirmationCode;
                AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions = this.$options;
                this.label = 1;
                if (queueFacade.confirmResetPassword(str, str2, str3, authConfirmResetPasswordOptions, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103291) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {341}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmResetPassword$2 */
    public static final class C103302 extends jgg implements xk7 {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103302(String str, String str2, String str3, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$newPassword = str2;
            this.$confirmationCode = str3;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103302(this.$username, this.$newPassword, this.$confirmationCode, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                String str2 = this.$newPassword;
                String str3 = this.$confirmationCode;
                this.label = 1;
                if (queueFacade.confirmResetPassword(str, str2, str3, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103302) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {249}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$1 */
    public static final class C103311 extends jgg implements xk7 {
        final /* synthetic */ String $challengeResponse;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103311(String str, n64 n64Var) {
            super(1, n64Var);
            this.$challengeResponse = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103311(this.$challengeResponse, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$challengeResponse;
                this.label = 1;
                obj = queueFacade.confirmSignIn(str, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103311) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {256}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignIn$2 */
    public static final class C103322 extends jgg implements xk7 {
        final /* synthetic */ String $challengeResponse;
        final /* synthetic */ AuthConfirmSignInOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103322(String str, AuthConfirmSignInOptions authConfirmSignInOptions, n64 n64Var) {
            super(1, n64Var);
            this.$challengeResponse = str;
            this.$options = authConfirmSignInOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103322(this.$challengeResponse, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$challengeResponse;
                AuthConfirmSignInOptions authConfirmSignInOptions = this.$options;
                this.label = 1;
                obj = queueFacade.confirmSignIn(str, authConfirmSignInOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103322) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {HttpStatus.SC_MULTI_STATUS}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$1 */
    public static final class C103331 extends jgg implements xk7 {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103331(String str, String str2, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$confirmationCode = str2;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103331(this.$username, this.$confirmationCode, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                String str2 = this.$confirmationCode;
                this.label = 1;
                obj = queueFacade.confirmSignUp(str, str2, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103331) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {215}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmSignUp$2 */
    public static final class C103342 extends jgg implements xk7 {
        final /* synthetic */ String $confirmationCode;
        final /* synthetic */ AuthConfirmSignUpOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103342(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$confirmationCode = str2;
            this.$options = authConfirmSignUpOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103342(this.$username, this.$confirmationCode, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                String str2 = this.$confirmationCode;
                AuthConfirmSignUpOptions authConfirmSignUpOptions = this.$options;
                this.label = 1;
                obj = queueFacade.confirmSignUp(str, str2, authConfirmSignUpOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103342) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmUserAttribute$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {397}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$confirmUserAttribute$1 */
    public static final class C103351 extends jgg implements xk7 {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        final /* synthetic */ String $confirmationCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103351(AuthUserAttributeKey authUserAttributeKey, String str, n64 n64Var) {
            super(1, n64Var);
            this.$attributeKey = authUserAttributeKey;
            this.$confirmationCode = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103351(this.$attributeKey, this.$confirmationCode, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ConfirmUserAttributeUseCase confirmUserAttributeUseCaseConfirmUserAttribute = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().confirmUserAttribute();
                AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                String str = this.$confirmationCode;
                this.label = 1;
                if (confirmUserAttributeUseCaseConfirmUserAttribute.execute(authUserAttributeKey, str, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103351) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteUser$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {413}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteUser$1 */
    public static final class C103361 extends jgg implements xk7 {
        int label;

        public C103361(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103361(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                if (queueFacade.deleteUser(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103361) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteWebAuthnCredential$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {470}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$deleteWebAuthnCredential$1 */
    public static final class C103371 extends jgg implements xk7 {
        final /* synthetic */ String $credentialId;
        final /* synthetic */ AuthDeleteWebAuthnCredentialOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103371(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, n64 n64Var) {
            super(1, n64Var);
            this.$credentialId = str;
            this.$options = authDeleteWebAuthnCredentialOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103371(this.$credentialId, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                DeleteWebAuthnCredentialUseCase deleteWebAuthnCredentialUseCaseDeleteWebAuthnCredential = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().deleteWebAuthnCredential();
                String str = this.$credentialId;
                AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions = this.$options;
                this.label = 1;
                if (deleteWebAuthnCredentialUseCaseDeleteWebAuthnCredential.execute(str, authDeleteWebAuthnCredentialOptions, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103371) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$1 */
    public static final class C103381 extends kf9 implements xk7 {
        final /* synthetic */ Action $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103381(Action action) {
            super(1);
            this.$onSuccess = action;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((y3i) obj);
            return y3i.f54824a;
        }

        public final void invoke(y3i y3iVar) {
            sq8.m48649h(y3iVar, "it");
            this.$onSuccess.call();
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$2 */
    public /* synthetic */ class C103392 extends dm7 implements xk7 {
        public C103392(Object obj) {
            super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthException) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthException authException) {
            sq8.m48649h(authException, "p0");
            ((Consumer) this.receiver).accept(authException);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$3 */
    public /* synthetic */ class C103403 extends dm7 implements xk7 {
        public C103403(Object obj) {
            super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m68711invoke((C103403) obj);
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68711invoke(T t) {
            sq8.m48649h(t, "p0");
            ((Consumer) this.receiver).accept(t);
        }
    }

    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$4 */
    public /* synthetic */ class C103414 extends dm7 implements xk7 {
        public C103414(Object obj) {
            super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AuthException) obj);
            return y3i.f54824a;
        }

        public final void invoke(AuthException authException) {
            sq8.m48649h(authException, "p0");
            ((Consumer) this.receiver).accept(authException);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {559}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5 */
    public static final class C103425 extends jgg implements nl7 {
        final /* synthetic */ xk7 $block;
        final /* synthetic */ xk7 $onError;
        final /* synthetic */ xk7 $onSuccess;
        int label;
        final /* synthetic */ AWSCognitoAuthPlugin this$0;

        @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$1, reason: invalid class name */
        public static final class AnonymousClass1 extends jgg implements nl7 {
            final /* synthetic */ xk7 $onSuccess;
            final /* synthetic */ T $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(xk7 xk7Var, T t, n64 n64Var) {
                super(2, n64Var);
                this.$onSuccess = xk7Var;
                this.$result = t;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass1(this.$onSuccess, this.$result, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                this.$onSuccess.invoke(this.$result);
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {}, m36650m = "invokeSuspend")
        /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$enqueue$5$2, reason: invalid class name */
        public static final class AnonymousClass2 extends jgg implements nl7 {
            final /* synthetic */ Exception $e;
            final /* synthetic */ xk7 $onError;
            int label;
            final /* synthetic */ AWSCognitoAuthPlugin this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(xk7 xk7Var, AWSCognitoAuthPlugin aWSCognitoAuthPlugin, Exception exc, n64 n64Var) {
                super(2, n64Var);
                this.$onError = xk7Var;
                this.this$0 = aWSCognitoAuthPlugin;
                this.$e = exc;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new AnonymousClass2(this.$onError, this.this$0, this.$e, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                this.$onError.invoke(this.this$0.toAuthException(this.$e));
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((AnonymousClass2) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103425(xk7 xk7Var, AWSCognitoAuthPlugin aWSCognitoAuthPlugin, xk7 xk7Var2, xk7 xk7Var3, n64 n64Var) {
            super(2, n64Var);
            this.$block = xk7Var;
            this.this$0 = aWSCognitoAuthPlugin;
            this.$onSuccess = xk7Var2;
            this.$onError = xk7Var3;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C103425(this.$block, this.this$0, this.$onSuccess, this.$onError, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    xk7 xk7Var = this.$block;
                    this.label = 1;
                    obj = xk7Var.invoke(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                rm1.m46952d(this.this$0.pluginScope, null, null, new AnonymousClass1(this.$onSuccess, obj, null), 3, null);
            } catch (Exception e) {
                rm1.m46952d(this.this$0.pluginScope, null, null, new AnonymousClass2(this.$onError, this.this$0, e, null), 3, null);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C103425) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {490}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$1 */
    public static final class C103431 extends jgg implements xk7 {
        final /* synthetic */ AuthProvider $authProvider;
        final /* synthetic */ String $providerToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103431(String str, AuthProvider authProvider, n64 n64Var) {
            super(1, n64Var);
            this.$providerToken = str;
            this.$authProvider = authProvider;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103431(this.$providerToken, this.$authProvider, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$providerToken;
                AuthProvider authProvider = this.$authProvider;
                FederateToIdentityPoolOptions federateToIdentityPoolOptionsBuild = FederateToIdentityPoolOptions.Companion.builder().build();
                this.label = 1;
                obj = queueFacade.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptionsBuild, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103431) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {511}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$federateToIdentityPool$2 */
    public static final class C103442 extends jgg implements xk7 {
        final /* synthetic */ AuthProvider $authProvider;
        final /* synthetic */ FederateToIdentityPoolOptions $options;
        final /* synthetic */ String $providerToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103442(String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, n64 n64Var) {
            super(1, n64Var);
            this.$providerToken = str;
            this.$authProvider = authProvider;
            this.$options = federateToIdentityPoolOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103442(this.$providerToken, this.$authProvider, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$providerToken;
                AuthProvider authProvider = this.$authProvider;
                FederateToIdentityPoolOptions federateToIdentityPoolOptions = this.$options;
                this.label = 1;
                obj = queueFacade.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103442) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {294}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$1 */
    public static final class C103451 extends jgg implements xk7 {
        final /* synthetic */ AuthFetchSessionOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103451(AuthFetchSessionOptions authFetchSessionOptions, n64 n64Var) {
            super(1, n64Var);
            this.$options = authFetchSessionOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103451(this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                AuthFetchSessionOptions authFetchSessionOptions = this.$options;
                this.label = 1;
                obj = queueFacade.fetchAuthSession(authFetchSessionOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103451) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {297}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchAuthSession$2 */
    public static final class C103462 extends jgg implements xk7 {
        int label;

        public C103462(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103462(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                obj = queueFacade.fetchAuthSession(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103462) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchDevices$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {309}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchDevices$1 */
    public static final class C103471 extends jgg implements xk7 {
        int label;

        public C103471(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103471(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                FetchDevicesUseCase fetchDevicesUseCaseFetchDevices = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().fetchDevices();
                this.label = 1;
                obj = fetchDevicesUseCaseFetchDevices.execute(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103471) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchMFAPreference$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {527}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchMFAPreference$1 */
    public static final class C103481 extends jgg implements xk7 {
        int label;

        public C103481(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103481(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                obj = queueFacade.fetchMFAPreference(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103481) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchUserAttributes$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {351}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$fetchUserAttributes$1 */
    public static final class C103491 extends jgg implements xk7 {
        int label;

        public C103491(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103491(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                FetchUserAttributesUseCase fetchUserAttributesUseCaseFetchUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().fetchUserAttributes();
                this.label = 1;
                obj = fetchUserAttributesUseCaseFetchUserAttributes.execute(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103491) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {303}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$1 */
    public static final class C103501 extends jgg implements xk7 {
        int label;

        public C103501(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103501(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ForgetDeviceUseCase forgetDeviceUseCaseForgetDevice = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().forgetDevice();
                this.label = 1;
                if (ForgetDeviceUseCase.execute$default(forgetDeviceUseCaseForgetDevice, null, this, 1, null) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103501) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {306}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$forgetDevice$2 */
    public static final class C103512 extends jgg implements xk7 {
        final /* synthetic */ AuthDevice $device;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103512(AuthDevice authDevice, n64 n64Var) {
            super(1, n64Var);
            this.$device = authDevice;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103512(this.$device, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ForgetDeviceUseCase forgetDeviceUseCaseForgetDevice = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().forgetDevice();
                AuthDevice authDevice = this.$device;
                this.label = 1;
                if (forgetDeviceUseCaseForgetDevice.execute(authDevice, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103512) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$getCurrentUser$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {400}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$getCurrentUser$1 */
    public static final class C103521 extends jgg implements xk7 {
        int label;

        public C103521(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103521(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                GetCurrentUserUseCase currentUser = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().getCurrentUser();
                this.label = 1;
                obj = currentUser.execute(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103521) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$listWebAuthnCredentials$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {457}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$listWebAuthnCredentials$1 */
    public static final class C103531 extends jgg implements xk7 {
        final /* synthetic */ AuthListWebAuthnCredentialsOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103531(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions, n64 n64Var) {
            super(1, n64Var);
            this.$options = authListWebAuthnCredentialsOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103531(this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ListWebAuthnCredentialsUseCase listWebAuthnCredentialsUseCaseListWebAuthnCredentials = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().listWebAuthnCredentials();
                AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions = this.$options;
                this.label = 1;
                obj = listWebAuthnCredentialsUseCaseListWebAuthnCredentials.execute(authListWebAuthnCredentialsOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103531) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$rememberDevice$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {300}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$rememberDevice$1 */
    public static final class C103541 extends jgg implements xk7 {
        int label;

        public C103541(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103541(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                RememberDeviceUseCase rememberDeviceUseCaseRememberDevice = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().rememberDevice();
                this.label = 1;
                if (rememberDeviceUseCaseRememberDevice.execute(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103541) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {221}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$1 */
    public static final class C103551 extends jgg implements xk7 {
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103551(String str, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103551(this.$username, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                this.label = 1;
                obj = queueFacade.resendSignUpCode(str, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103551) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {228}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendSignUpCode$2 */
    public static final class C103562 extends jgg implements xk7 {
        final /* synthetic */ AuthResendSignUpCodeOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103562(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$options = authResendSignUpCodeOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103562(this.$username, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                AuthResendSignUpCodeOptions authResendSignUpCodeOptions = this.$options;
                this.label = 1;
                obj = queueFacade.resendSignUpCode(str, authResendSignUpCodeOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103562) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {384}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$1 */
    public static final class C103571 extends jgg implements xk7 {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        final /* synthetic */ AuthResendUserAttributeConfirmationCodeOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103571(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, n64 n64Var) {
            super(1, n64Var);
            this.$attributeKey = authUserAttributeKey;
            this.$options = authResendUserAttributeConfirmationCodeOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103571(this.$attributeKey, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) throws CodeDeliveryFailureException {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resendUserAttributeConfirmation();
                AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions = this.$options;
                this.label = 1;
                obj = resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation.execute(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103571) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {390}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resendUserAttributeConfirmationCode$2 */
    public static final class C103582 extends jgg implements xk7 {
        final /* synthetic */ AuthUserAttributeKey $attributeKey;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103582(AuthUserAttributeKey authUserAttributeKey, n64 n64Var) {
            super(1, n64Var);
            this.$attributeKey = authUserAttributeKey;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103582(this.$attributeKey, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().resendUserAttributeConfirmation();
                AuthUserAttributeKey authUserAttributeKey = this.$attributeKey;
                this.label = 1;
                obj = ResendUserAttributeConfirmationUseCase.execute$default(resendUserAttributeConfirmationUseCaseResendUserAttributeConfirmation, authUserAttributeKey, null, this, 2, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103582) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {MediaError.DetailedErrorCode.HLS_SEGMENT_PARSING}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$1 */
    public static final class C103591 extends jgg implements xk7 {
        final /* synthetic */ AuthResetPasswordOptions $options;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103591(String str, AuthResetPasswordOptions authResetPasswordOptions, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$options = authResetPasswordOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103591(this.$username, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                AuthResetPasswordOptions authResetPasswordOptions = this.$options;
                this.label = 1;
                obj = queueFacade.resetPassword(str, authResetPasswordOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103591) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {MediaError.DetailedErrorCode.DASH_NO_INIT}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$resetPassword$2 */
    public static final class C103602 extends jgg implements xk7 {
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103602(String str, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103602(this.$username, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                this.label = 1;
                obj = queueFacade.resetPassword(str, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103602) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$setUpTOTP$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {HttpStatus.SC_EXPECTATION_FAILED}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$setUpTOTP$1 */
    public static final class C103611 extends jgg implements xk7 {
        int label;

        public C103611(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103611(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                obj = queueFacade.setUpTOTP(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103611) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {235}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$1 */
    public static final class C103621 extends jgg implements xk7 {
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103621(String str, String str2, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$password = str2;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103621(this.$username, this.$password, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                String str2 = this.$password;
                this.label = 1;
                obj = queueFacade.signIn(str, str2, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103621) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {243}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signIn$2 */
    public static final class C103632 extends jgg implements xk7 {
        final /* synthetic */ AuthSignInOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103632(String str, String str2, AuthSignInOptions authSignInOptions, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$password = str2;
            this.$options = authSignInOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103632(this.$username, this.$password, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                String str2 = this.$password;
                AuthSignInOptions authSignInOptions = this.$options;
                this.label = 1;
                obj = queueFacade.signIn(str, str2, authSignInOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103632) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {263}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$1 */
    public static final class C103641 extends jgg implements xk7 {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthProvider $provider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103641(AuthProvider authProvider, Activity activity, n64 n64Var) {
            super(1, n64Var);
            this.$provider = authProvider;
            this.$callingActivity = activity;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103641(this.$provider, this.$callingActivity, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                AuthProvider authProvider = this.$provider;
                Activity activity = this.$callingActivity;
                this.label = 1;
                obj = queueFacade.signInWithSocialWebUI(authProvider, activity, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103641) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {271}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithSocialWebUI$2 */
    public static final class C103652 extends jgg implements xk7 {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthWebUISignInOptions $options;
        final /* synthetic */ AuthProvider $provider;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103652(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, n64 n64Var) {
            super(1, n64Var);
            this.$provider = authProvider;
            this.$callingActivity = activity;
            this.$options = authWebUISignInOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103652(this.$provider, this.$callingActivity, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                AuthProvider authProvider = this.$provider;
                Activity activity = this.$callingActivity;
                AuthWebUISignInOptions authWebUISignInOptions = this.$options;
                this.label = 1;
                obj = queueFacade.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103652) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {277}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$1 */
    public static final class C103661 extends jgg implements xk7 {
        final /* synthetic */ Activity $callingActivity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103661(Activity activity, n64 n64Var) {
            super(1, n64Var);
            this.$callingActivity = activity;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103661(this.$callingActivity, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                Activity activity = this.$callingActivity;
                this.label = 1;
                obj = queueFacade.signInWithWebUI(activity, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103661) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {284}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signInWithWebUI$2 */
    public static final class C103672 extends jgg implements xk7 {
        final /* synthetic */ Activity $callingActivity;
        final /* synthetic */ AuthWebUISignInOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103672(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, n64 n64Var) {
            super(1, n64Var);
            this.$callingActivity = activity;
            this.$options = authWebUISignInOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103672(this.$callingActivity, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                Activity activity = this.$callingActivity;
                AuthWebUISignInOptions authWebUISignInOptions = this.$options;
                this.label = 1;
                obj = queueFacade.signInWithWebUI(activity, authWebUISignInOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103672) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {405}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$2 */
    public static final class C103682 extends jgg implements xk7 {
        int label;

        public C103682(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103682(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                this.label = 1;
                obj = queueFacade.signOut(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103682) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$4", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {410}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signOut$4 */
    public static final class C103694 extends jgg implements xk7 {
        final /* synthetic */ AuthSignOutOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103694(AuthSignOutOptions authSignOutOptions, n64 n64Var) {
            super(1, n64Var);
            this.$options = authSignOutOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103694(this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                AuthSignOutOptions authSignOutOptions = this.$options;
                this.label = 1;
                obj = queueFacade.signOut(authSignOutOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103694) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signUp$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {200}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$signUp$1 */
    public static final class C103701 extends jgg implements xk7 {
        final /* synthetic */ AuthSignUpOptions $options;
        final /* synthetic */ String $password;
        final /* synthetic */ String $username;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103701(String str, String str2, AuthSignUpOptions authSignUpOptions, n64 n64Var) {
            super(1, n64Var);
            this.$username = str;
            this.$password = str2;
            this.$options = authSignUpOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103701(this.$username, this.$password, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$username;
                String str2 = this.$password;
                AuthSignUpOptions authSignUpOptions = this.$options;
                this.label = 1;
                obj = queueFacade.signUp(str, str2, authSignUpOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103701) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {535}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$1 */
    public static final class C103711 extends jgg implements xk7 {
        final /* synthetic */ MFAPreference $sms;
        final /* synthetic */ MFAPreference $totp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103711(MFAPreference mFAPreference, MFAPreference mFAPreference2, n64 n64Var) {
            super(1, n64Var);
            this.$sms = mFAPreference;
            this.$totp = mFAPreference2;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103711(this.$sms, this.$totp, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                MFAPreference mFAPreference = this.$sms;
                MFAPreference mFAPreference2 = this.$totp;
                this.label = 1;
                if (queueFacade.updateMFAPreference(mFAPreference, mFAPreference2, null, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103711) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {543}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateMFAPreference$2 */
    public static final class C103722 extends jgg implements xk7 {
        final /* synthetic */ MFAPreference $email;
        final /* synthetic */ MFAPreference $sms;
        final /* synthetic */ MFAPreference $totp;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103722(MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, n64 n64Var) {
            super(1, n64Var);
            this.$sms = mFAPreference;
            this.$totp = mFAPreference2;
            this.$email = mFAPreference3;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103722(this.$sms, this.$totp, this.$email, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                MFAPreference mFAPreference = this.$sms;
                MFAPreference mFAPreference2 = this.$totp;
                MFAPreference mFAPreference3 = this.$email;
                this.label = 1;
                if (queueFacade.updateMFAPreference(mFAPreference, mFAPreference2, mFAPreference3, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103722) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updatePassword$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {348}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updatePassword$1 */
    public static final class C103731 extends jgg implements xk7 {
        final /* synthetic */ String $newPassword;
        final /* synthetic */ String $oldPassword;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103731(String str, String str2, n64 n64Var) {
            super(1, n64Var);
            this.$oldPassword = str;
            this.$newPassword = str2;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103731(this.$oldPassword, this.$newPassword, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$oldPassword;
                String str2 = this.$newPassword;
                this.label = 1;
                if (queueFacade.updatePassword(str, str2, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103731) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {358}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$1 */
    public static final class C103741 extends jgg implements xk7 {
        final /* synthetic */ AuthUserAttribute $attribute;
        final /* synthetic */ AuthUpdateUserAttributeOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103741(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, n64 n64Var) {
            super(1, n64Var);
            this.$attribute = authUserAttribute;
            this.$options = authUpdateUserAttributeOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103741(this.$attribute, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
                AuthUserAttribute authUserAttribute = this.$attribute;
                AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions = this.$options;
                this.label = 1;
                obj = updateUserAttributesUseCaseUpdateUserAttributes.execute(authUserAttribute, authUpdateUserAttributeOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103741) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {364}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttribute$2 */
    public static final class C103752 extends jgg implements xk7 {
        final /* synthetic */ AuthUserAttribute $attribute;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103752(AuthUserAttribute authUserAttribute, n64 n64Var) {
            super(1, n64Var);
            this.$attribute = authUserAttribute;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103752(this.$attribute, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
                AuthUserAttribute authUserAttribute = this.$attribute;
                this.label = 1;
                obj = UpdateUserAttributesUseCase.execute$default(updateUserAttributesUseCaseUpdateUserAttributes, authUserAttribute, (AuthUpdateUserAttributeOptions) null, this, 2, (Object) null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103752) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {371}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$1 */
    public static final class C103761 extends jgg implements xk7 {
        final /* synthetic */ List<AuthUserAttribute> $attributes;
        final /* synthetic */ AuthUpdateUserAttributesOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103761(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, n64 n64Var) {
            super(1, n64Var);
            this.$attributes = list;
            this.$options = authUpdateUserAttributesOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103761(this.$attributes, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
                List<AuthUserAttribute> list = this.$attributes;
                AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions = this.$options;
                this.label = 1;
                obj = updateUserAttributesUseCaseUpdateUserAttributes.execute(list, authUpdateUserAttributesOptions, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103761) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$2", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {377}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$updateUserAttributes$2 */
    public static final class C103772 extends jgg implements xk7 {
        final /* synthetic */ List<AuthUserAttribute> $attributes;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103772(List<AuthUserAttribute> list, n64 n64Var) {
            super(1, n64Var);
            this.$attributes = list;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103772(this.$attributes, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                UpdateUserAttributesUseCase updateUserAttributesUseCaseUpdateUserAttributes = AWSCognitoAuthPlugin.this.getUseCaseFactory$aws_auth_cognito_release().updateUserAttributes();
                List<AuthUserAttribute> list = this.$attributes;
                this.label = 1;
                obj = UpdateUserAttributesUseCase.execute$default(updateUserAttributesUseCaseUpdateUserAttributes, list, (AuthUpdateUserAttributesOptions) null, this, 2, (Object) null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103772) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$verifyTOTPSetup$1", m36648f = "AWSCognitoAuthPlugin.kt", m36649l = {428}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin$verifyTOTPSetup$1 */
    public static final class C103781 extends jgg implements xk7 {
        final /* synthetic */ String $code;
        final /* synthetic */ AuthVerifyTOTPSetupOptions $options;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C103781(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, n64 n64Var) {
            super(1, n64Var);
            this.$code = str;
            this.$options = authVerifyTOTPSetupOptions;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return AWSCognitoAuthPlugin.this.new C103781(this.$code, this.$options, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                KotlinAuthFacadeInternal queueFacade = AWSCognitoAuthPlugin.this.getQueueFacade();
                String str = this.$code;
                AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions = this.$options;
                this.label = 1;
                if (queueFacade.verifyTOTPSetup(str, authVerifyTOTPSetupOptions, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C103781) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public AWSCognitoAuthPlugin() {
        h84 h84VarM31707a = i84.m31707a(a79.m16544b(null, 1, null).plus(eu5.m25610a()));
        this.pluginScope = h84VarM31707a;
        this.queueFacade$delegate = si9.m48360a(new AWSCognitoAuthPlugin$queueFacade$2(this));
        jg2 jg2VarM49824b = tg2.m49824b(Api.BaseClientBuilder.API_PRIORITY_OTHER, null, null, 6, null);
        rm1.m46952d(h84VarM31707a, null, null, new AWSCognitoAuthPlugin$queueChannel$1$1(jg2VarM49824b, null), 3, null);
        this.queueChannel = jg2VarM49824b;
    }

    private final void blockQueueChannelWhileConfiguring() {
        this.queueChannel.mo23472g(rm1.m46952d(this.pluginScope, null, l84.LAZY, new C103271(null), 1, null));
    }

    private final void enqueue(Action action, Consumer<AuthException> consumer, xk7 xk7Var) {
        enqueue(new C103381(action), new C103392(consumer), xk7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinAuthFacadeInternal getQueueFacade() {
        return (KotlinAuthFacadeInternal) this.queueFacade$delegate.getValue();
    }

    public static /* synthetic */ void getRealPlugin$aws_auth_cognito_release$annotations() {
    }

    public static /* synthetic */ void getUseCaseFactory$aws_auth_cognito_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthException toAuthException(Exception exc) {
        return exc instanceof AuthException ? (AuthException) exc : CognitoAuthExceptionConverter.Companion.lookup(exc, "An unclassified error prevented this operation.");
    }

    @InternalAmplifyApi
    public final void addToUserAgent(AWSCognitoAuthMetadataType aWSCognitoAuthMetadataType, String str) {
        sq8.m48649h(aWSCognitoAuthMetadataType, "type");
        sq8.m48649h(str, "value");
        getRealPlugin$aws_auth_cognito_release().addToUserAgent(aWSCognitoAuthMetadataType, str);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void associateWebAuthnCredential(Activity activity, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        associateWebAuthnCredential(activity, AuthAssociateWebAuthnCredentialsOptions.Companion.defaults(), action, consumer);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void autoSignIn(Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103261(null));
    }

    public final void clearFederationToIdentityPool(Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103281(null));
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public void configure(JSONObject jSONObject, Context context) throws ConfigurationException {
        sq8.m48649h(jSONObject, "pluginConfiguration");
        sq8.m48649h(context, "context");
        try {
            configure(AuthConfiguration.Companion.fromJson$default(AuthConfiguration.Companion, jSONObject, null, 2, null), context);
        } catch (Exception e) {
            throw new ConfigurationException("Failed to configure AWSCognitoAuthPlugin.", "Make sure your amplifyconfiguration.json is valid.", e);
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "newPassword");
        sq8.m48649h(str3, "confirmationCode");
        sq8.m48649h(authConfirmResetPasswordOptions, "options");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103291(str, str2, str3, authConfirmResetPasswordOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(String str, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "challengeResponse");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103311(str, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(String str, String str2, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "confirmationCode");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103331(str, str2, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmUserAttribute(AuthUserAttributeKey authUserAttributeKey, String str, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(authUserAttributeKey, "attributeKey");
        sq8.m48649h(str, "confirmationCode");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103351(authUserAttributeKey, str, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteUser(Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103361(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteWebAuthnCredential(String str, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "credentialId");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        deleteWebAuthnCredential(str, AuthDeleteWebAuthnCredentialOptions.Companion.defaults(), action, consumer);
    }

    public final void federateToIdentityPool(String str, AuthProvider authProvider, Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "providerToken");
        sq8.m48649h(authProvider, "authProvider");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103431(str, authProvider, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(AuthFetchSessionOptions authFetchSessionOptions, Consumer<AuthSession> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authFetchSessionOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103451(authFetchSessionOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchDevices(Consumer<List<AuthDevice>> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103471(null));
    }

    public final void fetchMFAPreference(Consumer<UserMFAPreference> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103481(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchUserAttributes(Consumer<List<AuthUserAttribute>> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103491(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103501(null));
    }

    @InternalAmplifyApi
    public final AuthConfiguration getAuthConfiguration() {
        return getRealPlugin$aws_auth_cognito_release().getConfiguration();
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void getCurrentUser(Consumer<AuthUser> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103521(null));
    }

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
        sq8.m48667z("realPlugin");
        return null;
    }

    public final AuthUseCaseFactory getUseCaseFactory$aws_auth_cognito_release() {
        AuthUseCaseFactory authUseCaseFactory = this.useCaseFactory;
        if (authUseCaseFactory != null) {
            return authUseCaseFactory;
        }
        sq8.m48667z("useCaseFactory");
        return null;
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public String getVersion() {
        return "2.27.1";
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void handleWebUISignInResponse(Intent intent) {
        getQueueFacade().handleWebUISignInResponse(intent);
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.core.plugin.Plugin
    public void initialize(Context context) {
        sq8.m48649h(context, "context");
        getRealPlugin$aws_auth_cognito_release().initialize();
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void listWebAuthnCredentials(Consumer<AuthListWebAuthnCredentialsResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        listWebAuthnCredentials(AuthListWebAuthnCredentialsOptions.Companion.defaults(), consumer, consumer2);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void rememberDevice(Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103541(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(String str, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103551(str, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authUserAttributeKey, "attributeKey");
        sq8.m48649h(authResendUserAttributeConfirmationCodeOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103571(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(String str, AuthResetPasswordOptions authResetPasswordOptions, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(authResetPasswordOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103591(str, authResetPasswordOptions, null));
    }

    public final void setRealPlugin$aws_auth_cognito_release(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        sq8.m48649h(realAWSCognitoAuthPlugin, "<set-?>");
        this.realPlugin = realAWSCognitoAuthPlugin;
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void setUpTOTP(Consumer<TOTPSetupDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103611(null));
    }

    public final void setUseCaseFactory$aws_auth_cognito_release(AuthUseCaseFactory authUseCaseFactory) {
        sq8.m48649h(authUseCaseFactory, "<set-?>");
        this.useCaseFactory = authUseCaseFactory;
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103621(str, str2, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(AuthProvider authProvider, Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authProvider, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103641(authProvider, activity, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(Activity activity, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103661(activity, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(Consumer<AuthSignOutResult> consumer) {
        sq8.m48649h(consumer, "onComplete");
        enqueue(consumer, new s1(this), new C103682(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signUp(String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(authSignUpOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103701(str, str2, authSignUpOptions, null));
    }

    public final void updateMFAPreference(MFAPreference mFAPreference, MFAPreference mFAPreference2, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103711(mFAPreference, mFAPreference2, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updatePassword(String str, String str2, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "oldPassword");
        sq8.m48649h(str2, "newPassword");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103731(str, str2, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, Consumer<AuthUpdateAttributeResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authUserAttribute, "attribute");
        sq8.m48649h(authUpdateUserAttributeOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103741(authUserAttribute, authUpdateUserAttributeOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(list, "attributes");
        sq8.m48649h(authUpdateUserAttributesOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103761(list, authUpdateUserAttributesOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(String str, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "code");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        verifyTOTPSetup(str, new AWSCognitoAuthVerifyTOTPSetupOptions.CognitoBuilder().build(), action, consumer);
    }

    private final <T> void enqueue(Consumer<T> consumer, Consumer<AuthException> consumer2, xk7 xk7Var) {
        enqueue(new C103403(consumer), new C103414(consumer2), xk7Var);
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmResetPassword(String str, String str2, String str3, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "newPassword");
        sq8.m48649h(str3, "confirmationCode");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103302(str, str2, str3, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "challengeResponse");
        sq8.m48649h(authConfirmSignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103322(str, authConfirmSignInOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void confirmSignUp(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer<AuthSignUpResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(str2, "confirmationCode");
        sq8.m48649h(authConfirmSignUpOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103342(str, str2, authConfirmSignUpOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void deleteWebAuthnCredential(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "credentialId");
        sq8.m48649h(authDeleteWebAuthnCredentialOptions, "options");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103371(str, authDeleteWebAuthnCredentialOptions, null));
    }

    public final void federateToIdentityPool(String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, Consumer<FederateToIdentityPoolResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "providerToken");
        sq8.m48649h(authProvider, "authProvider");
        sq8.m48649h(federateToIdentityPoolOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103442(str, authProvider, federateToIdentityPoolOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void fetchAuthSession(Consumer<AuthSession> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103462(null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void forgetDevice(AuthDevice authDevice, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(authDevice, "device");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103512(authDevice, null));
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    public AWSCognitoAuthService getEscapeHatch() {
        return getRealPlugin$aws_auth_cognito_release().escapeHatch();
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void listWebAuthnCredentials(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions, Consumer<AuthListWebAuthnCredentialsResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authListWebAuthnCredentialsOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103531(authListWebAuthnCredentialsOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(authResendSignUpCodeOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103562(str, authResendSignUpCodeOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey, Consumer<AuthCodeDeliveryDetails> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authUserAttributeKey, "attributeKey");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103582(authUserAttributeKey, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void resetPassword(String str, Consumer<AuthResetPasswordResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(str, "username");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103602(str, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signIn(String str, String str2, AuthSignInOptions authSignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authSignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103632(str, str2, authSignInOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authProvider, AWSCognitoLegacyCredentialStore.PROVIDER_KEY);
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(authWebUISignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103652(authProvider, activity, authWebUISignInOptions, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer<AuthSignInResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(authWebUISignInOptions, "options");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103672(activity, authWebUISignInOptions, null));
    }

    public final void updateMFAPreference(MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103722(mFAPreference, mFAPreference2, mFAPreference3, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttribute(AuthUserAttribute authUserAttribute, Consumer<AuthUpdateAttributeResult> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(authUserAttribute, "attribute");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103752(authUserAttribute, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void updateUserAttributes(List<AuthUserAttribute> list, Consumer<Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> consumer, Consumer<AuthException> consumer2) {
        sq8.m48649h(list, "attributes");
        sq8.m48649h(consumer, "onSuccess");
        sq8.m48649h(consumer2, "onError");
        enqueue(consumer, consumer2, new C103772(list, null));
    }

    @Override // com.amplifyframework.auth.AuthPlugin, com.amplifyframework.auth.AuthCategoryBehavior
    public void verifyTOTPSetup(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(str, "code");
        sq8.m48649h(authVerifyTOTPSetupOptions, "options");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103781(str, authVerifyTOTPSetupOptions, null));
    }

    private final <T> void enqueue(xk7 xk7Var, xk7 xk7Var2, xk7 xk7Var3) {
        this.queueChannel.mo23472g(rm1.m46952d(this.pluginScope, null, l84.LAZY, new C103425(xk7Var3, this, xk7Var, xk7Var2, null), 1, null));
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void associateWebAuthnCredential(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, Action action, Consumer<AuthException> consumer) {
        sq8.m48649h(activity, "callingActivity");
        sq8.m48649h(authAssociateWebAuthnCredentialsOptions, "options");
        sq8.m48649h(action, "onSuccess");
        sq8.m48649h(consumer, "onError");
        enqueue(action, consumer, new C103251(activity, authAssociateWebAuthnCredentialsOptions, null));
    }

    @Override // com.amplifyframework.core.plugin.Plugin
    @InternalAmplifyApi
    public void configure(AmplifyOutputsData amplifyOutputsData, Context context) throws ConfigurationException {
        sq8.m48649h(amplifyOutputsData, "amplifyOutputs");
        sq8.m48649h(context, "context");
        try {
            configure(AuthConfiguration.Companion.from(amplifyOutputsData), context);
        } catch (Exception e) {
            throw new ConfigurationException("Failed to configure AWSCognitoAuthPlugin.", "Make sure your amplify_outputs.json is valid.", e);
        }
    }

    @Override // com.amplifyframework.auth.AuthCategoryBehavior
    public void signOut(AuthSignOutOptions authSignOutOptions, Consumer<AuthSignOutResult> consumer) {
        sq8.m48649h(authSignOutOptions, "options");
        sq8.m48649h(consumer, "onComplete");
        enqueue(consumer, new s1(this), new C103694(authSignOutOptions, null));
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
            sq8.m48646e(poolId);
            String appClient = userPool.getAppClient();
            sq8.m48646e(appClient);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void throwIt(Throwable th) throws Throwable {
        throw th;
    }
}
