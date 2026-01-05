package com.amplifyframework.kotlin.auth;

import android.app.Activity;
import android.content.Intent;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.AuthUser;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.TOTPSetupDetails;
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
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Auth {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object associateWebAuthnCredential$default(Auth auth, Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: associateWebAuthnCredential");
        }
        if ((i10 & 2) != 0) {
            authAssociateWebAuthnCredentialsOptions = AuthAssociateWebAuthnCredentialsOptions.Companion.defaults();
        }
        return auth.associateWebAuthnCredential(activity, authAssociateWebAuthnCredentialsOptions, interfaceC7559c);
    }

    static /* synthetic */ Object confirmResetPassword$default(Auth auth, String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmResetPassword");
        }
        if ((i10 & 8) != 0) {
            authConfirmResetPasswordOptions = AuthConfirmResetPasswordOptions.defaults();
            AbstractC4154l.m8922e(authConfirmResetPasswordOptions, "defaults(...)");
        }
        return auth.confirmResetPassword(str, str2, str3, authConfirmResetPasswordOptions, interfaceC7559c);
    }

    static /* synthetic */ Object confirmSignIn$default(Auth auth, String str, AuthConfirmSignInOptions authConfirmSignInOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmSignIn");
        }
        if ((i10 & 2) != 0) {
            authConfirmSignInOptions = AuthConfirmSignInOptions.defaults();
            AbstractC4154l.m8922e(authConfirmSignInOptions, "defaults(...)");
        }
        return auth.confirmSignIn(str, authConfirmSignInOptions, interfaceC7559c);
    }

    static /* synthetic */ Object confirmSignUp$default(Auth auth, String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: confirmSignUp");
        }
        if ((i10 & 4) != 0) {
            authConfirmSignUpOptions = AuthConfirmSignUpOptions.defaults();
            AbstractC4154l.m8922e(authConfirmSignUpOptions, "defaults(...)");
        }
        return auth.confirmSignUp(str, str2, authConfirmSignUpOptions, interfaceC7559c);
    }

    static /* synthetic */ Object deleteWebAuthnCredential$default(Auth auth, String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteWebAuthnCredential");
        }
        if ((i10 & 2) != 0) {
            authDeleteWebAuthnCredentialOptions = AuthDeleteWebAuthnCredentialOptions.Companion.defaults();
        }
        return auth.deleteWebAuthnCredential(str, authDeleteWebAuthnCredentialOptions, interfaceC7559c);
    }

    static /* synthetic */ Object fetchAuthSession$default(Auth auth, AuthFetchSessionOptions authFetchSessionOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchAuthSession");
        }
        if ((i10 & 1) != 0) {
            authFetchSessionOptions = AuthFetchSessionOptions.Companion.defaults();
        }
        return auth.fetchAuthSession(authFetchSessionOptions, interfaceC7559c);
    }

    static /* synthetic */ Object forgetDevice$default(Auth auth, AuthDevice authDevice, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forgetDevice");
        }
        if ((i10 & 1) != 0) {
            authDevice = null;
        }
        return auth.forgetDevice(authDevice, interfaceC7559c);
    }

    static /* synthetic */ Object listWebAuthnCredentials$default(Auth auth, AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listWebAuthnCredentials");
        }
        if ((i10 & 1) != 0) {
            authListWebAuthnCredentialsOptions = AuthListWebAuthnCredentialsOptions.Companion.defaults();
        }
        return auth.listWebAuthnCredentials(authListWebAuthnCredentialsOptions, interfaceC7559c);
    }

    static /* synthetic */ Object resendSignUpCode$default(Auth auth, String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resendSignUpCode");
        }
        if ((i10 & 2) != 0) {
            authResendSignUpCodeOptions = AuthResendSignUpCodeOptions.defaults();
            AbstractC4154l.m8922e(authResendSignUpCodeOptions, "defaults(...)");
        }
        return auth.resendSignUpCode(str, authResendSignUpCodeOptions, interfaceC7559c);
    }

    static /* synthetic */ Object resendUserAttributeConfirmationCode$default(Auth auth, AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resendUserAttributeConfirmationCode");
        }
        if ((i10 & 2) != 0) {
            authResendUserAttributeConfirmationCodeOptions = AuthResendUserAttributeConfirmationCodeOptions.defaults();
            AbstractC4154l.m8922e(authResendUserAttributeConfirmationCodeOptions, "defaults(...)");
        }
        return auth.resendUserAttributeConfirmationCode(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, interfaceC7559c);
    }

    static /* synthetic */ Object resetPassword$default(Auth auth, String str, AuthResetPasswordOptions authResetPasswordOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetPassword");
        }
        if ((i10 & 2) != 0) {
            authResetPasswordOptions = AuthResetPasswordOptions.defaults();
            AbstractC4154l.m8922e(authResetPasswordOptions, "defaults(...)");
        }
        return auth.resetPassword(str, authResetPasswordOptions, interfaceC7559c);
    }

    static /* synthetic */ Object signIn$default(Auth auth, String str, String str2, AuthSignInOptions authSignInOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signIn");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            authSignInOptions = AuthSignInOptions.defaults();
            AbstractC4154l.m8922e(authSignInOptions, "defaults(...)");
        }
        return auth.signIn(str, str2, authSignInOptions, interfaceC7559c);
    }

    static /* synthetic */ Object signInWithSocialWebUI$default(Auth auth, AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInWithSocialWebUI");
        }
        if ((i10 & 4) != 0) {
            authWebUISignInOptions = AuthWebUISignInOptions.builder().build();
            AbstractC4154l.m8922e(authWebUISignInOptions, "build(...)");
        }
        return auth.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, interfaceC7559c);
    }

    static /* synthetic */ Object signInWithWebUI$default(Auth auth, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signInWithWebUI");
        }
        if ((i10 & 2) != 0) {
            authWebUISignInOptions = AuthWebUISignInOptions.builder().build();
            AbstractC4154l.m8922e(authWebUISignInOptions, "build(...)");
        }
        return auth.signInWithWebUI(activity, authWebUISignInOptions, interfaceC7559c);
    }

    static /* synthetic */ Object signOut$default(Auth auth, AuthSignOutOptions authSignOutOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signOut");
        }
        if ((i10 & 1) != 0) {
            authSignOutOptions = AuthSignOutOptions.builder().build();
            AbstractC4154l.m8922e(authSignOutOptions, "build(...)");
        }
        return auth.signOut(authSignOutOptions, interfaceC7559c);
    }

    static /* synthetic */ Object signUp$default(Auth auth, String str, String str2, AuthSignUpOptions authSignUpOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUp");
        }
        if ((i10 & 4) != 0) {
            authSignUpOptions = AuthSignUpOptions.builder().build();
            AbstractC4154l.m8922e(authSignUpOptions, "build(...)");
        }
        return auth.signUp(str, str2, authSignUpOptions, interfaceC7559c);
    }

    static /* synthetic */ Object updateUserAttribute$default(Auth auth, AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserAttribute");
        }
        if ((i10 & 2) != 0) {
            authUpdateUserAttributeOptions = AuthUpdateUserAttributeOptions.defaults();
            AbstractC4154l.m8922e(authUpdateUserAttributeOptions, "defaults(...)");
        }
        return auth.updateUserAttribute(authUserAttribute, authUpdateUserAttributeOptions, interfaceC7559c);
    }

    static /* synthetic */ Object updateUserAttributes$default(Auth auth, List list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserAttributes");
        }
        if ((i10 & 2) != 0) {
            authUpdateUserAttributesOptions = AuthUpdateUserAttributesOptions.defaults();
            AbstractC4154l.m8922e(authUpdateUserAttributesOptions, "defaults(...)");
        }
        return auth.updateUserAttributes(list, authUpdateUserAttributesOptions, interfaceC7559c);
    }

    static /* synthetic */ Object verifyTOTPSetup$default(Auth auth, String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyTOTPSetup");
        }
        if ((i10 & 2) != 0) {
            authVerifyTOTPSetupOptions = AuthVerifyTOTPSetupOptions.defaults();
            AbstractC4154l.m8922e(authVerifyTOTPSetupOptions, "defaults(...)");
        }
        return auth.verifyTOTPSetup(str, authVerifyTOTPSetupOptions, interfaceC7559c);
    }

    Object associateWebAuthnCredential(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, InterfaceC7559c<? super a0> interfaceC7559c);

    Object autoSignIn(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c);

    Object confirmResetPassword(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, InterfaceC7559c<? super a0> interfaceC7559c);

    Object confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c);

    Object confirmSignUp(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, InterfaceC7559c<? super AuthSignUpResult> interfaceC7559c);

    Object confirmUserAttribute(AuthUserAttributeKey authUserAttributeKey, String str, InterfaceC7559c<? super a0> interfaceC7559c);

    Object deleteUser(InterfaceC7559c<? super a0> interfaceC7559c);

    Object deleteWebAuthnCredential(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, InterfaceC7559c<? super a0> interfaceC7559c);

    Object fetchAuthSession(AuthFetchSessionOptions authFetchSessionOptions, InterfaceC7559c<? super AuthSession> interfaceC7559c);

    Object fetchDevices(InterfaceC7559c<? super List<AuthDevice>> interfaceC7559c);

    Object fetchUserAttributes(InterfaceC7559c<? super List<AuthUserAttribute>> interfaceC7559c);

    Object forgetDevice(AuthDevice authDevice, InterfaceC7559c<? super a0> interfaceC7559c);

    Object getCurrentUser(InterfaceC7559c<? super AuthUser> interfaceC7559c);

    void handleWebUISignInResponse(Intent intent);

    Object listWebAuthnCredentials(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions, InterfaceC7559c<? super AuthListWebAuthnCredentialsResult> interfaceC7559c);

    Object rememberDevice(InterfaceC7559c<? super a0> interfaceC7559c);

    Object resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c);

    Object resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c);

    Object resetPassword(String str, AuthResetPasswordOptions authResetPasswordOptions, InterfaceC7559c<? super AuthResetPasswordResult> interfaceC7559c);

    Object setUpTOTP(InterfaceC7559c<? super TOTPSetupDetails> interfaceC7559c);

    Object signIn(String str, String str2, AuthSignInOptions authSignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c);

    Object signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c);

    Object signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c);

    Object signOut(AuthSignOutOptions authSignOutOptions, InterfaceC7559c<? super AuthSignOutResult> interfaceC7559c);

    Object signUp(String str, String str2, AuthSignUpOptions authSignUpOptions, InterfaceC7559c<? super AuthSignUpResult> interfaceC7559c);

    Object updatePassword(String str, String str2, InterfaceC7559c<? super a0> interfaceC7559c);

    Object updateUserAttribute(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, InterfaceC7559c<? super AuthUpdateAttributeResult> interfaceC7559c);

    Object updateUserAttributes(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, InterfaceC7559c<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> interfaceC7559c);

    Object verifyTOTPSetup(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, InterfaceC7559c<? super a0> interfaceC7559c);
}
