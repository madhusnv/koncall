package com.amplifyframework.rx;

import android.app.Activity;
import android.content.Intent;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.AuthUserAttributeKey;
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
import java.util.List;
import p001o.wtf;
import p001o.xk3;

/* loaded from: classes5.dex */
public interface RxAuthCategoryBehavior {
    xk3 associateWebAuthnCredential(Activity activity);

    xk3 associateWebAuthnCredential(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions);

    wtf autoSignIn();

    xk3 confirmResetPassword(String str, String str2, String str3);

    xk3 confirmResetPassword(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions);

    wtf confirmSignIn(String str);

    wtf confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions);

    wtf confirmSignUp(String str, String str2);

    wtf confirmSignUp(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions);

    xk3 confirmUserAttribute(AuthUserAttributeKey authUserAttributeKey, String str);

    xk3 deleteUser();

    xk3 deleteWebAuthnCredential(String str);

    xk3 deleteWebAuthnCredential(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions);

    wtf fetchAuthSession();

    wtf fetchAuthSession(AuthFetchSessionOptions authFetchSessionOptions);

    wtf fetchDevices();

    wtf fetchUserAttributes();

    xk3 forgetDevice();

    xk3 forgetDevice(AuthDevice authDevice);

    wtf getCurrentUser();

    void handleWebUISignInResponse(Intent intent);

    wtf listWebAuthnCredentials();

    wtf listWebAuthnCredentials(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions);

    xk3 rememberDevice();

    wtf resendSignUpCode(String str);

    wtf resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions);

    wtf resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey);

    wtf resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions);

    wtf resetPassword(String str);

    wtf resetPassword(String str, AuthResetPasswordOptions authResetPasswordOptions);

    wtf setUpTOTP();

    wtf signIn(String str, String str2);

    wtf signIn(String str, String str2, AuthSignInOptions authSignInOptions);

    wtf signInWithSocialWebUI(AuthProvider authProvider, Activity activity);

    wtf signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions);

    wtf signInWithWebUI(Activity activity);

    wtf signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions);

    wtf signOut();

    wtf signOut(AuthSignOutOptions authSignOutOptions);

    wtf signUp(String str, String str2, AuthSignUpOptions authSignUpOptions);

    xk3 updatePassword(String str, String str2);

    wtf updateUserAttribute(AuthUserAttribute authUserAttribute);

    wtf updateUserAttribute(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions);

    wtf updateUserAttributes(List<AuthUserAttribute> list);

    wtf updateUserAttributes(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions);

    xk3 verifyTOTPSetup(String str);

    xk3 verifyTOTPSetup(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions);
}
