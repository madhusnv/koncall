package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthEnvironmentKt;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin;
import com.amplifyframework.auth.cognito.helpers.WebAuthnHelper;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthUseCaseFactory {
    private final AuthEnvironment authEnvironment;
    private final RealAWSCognitoAuthPlugin plugin;
    private final AuthStateMachine stateMachine;

    public AuthUseCaseFactory(RealAWSCognitoAuthPlugin plugin, AuthEnvironment authEnvironment, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(plugin, "plugin");
        AbstractC4154l.m8923f(authEnvironment, "authEnvironment");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.plugin = plugin;
        this.authEnvironment = authEnvironment;
        this.stateMachine = stateMachine;
    }

    public final AssociateWebAuthnCredentialUseCase associateWebAuthnCredential() {
        return new AssociateWebAuthnCredentialUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine, new WebAuthnHelper(this.authEnvironment.getContext(), null, 2, null));
    }

    public final AutoSignInUseCase autoSignIn() {
        return new AutoSignInUseCase(this.stateMachine, null, 2, null);
    }

    public final ConfirmResetPasswordUseCase confirmResetPassword() {
        return new ConfirmResetPasswordUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), this.authEnvironment, this.stateMachine);
    }

    public final ConfirmSignUpUseCase confirmSignUp() {
        return new ConfirmSignUpUseCase(this.stateMachine);
    }

    public final ConfirmUserAttributeUseCase confirmUserAttribute() {
        return new ConfirmUserAttributeUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final DeleteUserUseCase deleteUser() {
        return new DeleteUserUseCase(fetchAuthSession(), this.stateMachine, null, 4, null);
    }

    public final DeleteWebAuthnCredentialUseCase deleteWebAuthnCredential() {
        return new DeleteWebAuthnCredentialUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final FetchAuthSessionUseCase fetchAuthSession() {
        return new FetchAuthSessionUseCase(this.plugin);
    }

    public final FetchDevicesUseCase fetchDevices() {
        return new FetchDevicesUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final FetchMfaPreferenceUseCase fetchMfaPreference() {
        return new FetchMfaPreferenceUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final FetchUserAttributesUseCase fetchUserAttributes() {
        return new FetchUserAttributesUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final ForgetDeviceUseCase forgetDevice() {
        return new ForgetDeviceUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine, this.authEnvironment);
    }

    public final GetCurrentUserUseCase getCurrentUser() {
        return new GetCurrentUserUseCase(fetchAuthSession(), this.stateMachine);
    }

    public final ListWebAuthnCredentialsUseCase listWebAuthnCredentials() {
        return new ListWebAuthnCredentialsUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final RememberDeviceUseCase rememberDevice() {
        return new RememberDeviceUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine, this.authEnvironment);
    }

    public final ResendSignupCodeUseCase resendSignupCode() {
        return new ResendSignupCodeUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), this.authEnvironment, this.stateMachine);
    }

    public final ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmation() {
        return new ResendUserAttributeConfirmationUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final ResetPasswordUseCase resetPassword() {
        return new ResetPasswordUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), this.authEnvironment);
    }

    public final SetupTotpUseCase setupTotp() {
        return new SetupTotpUseCase(fetchAuthSession(), AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), this.stateMachine);
    }

    public final SignUpUseCase signUp() {
        return new SignUpUseCase(this.stateMachine);
    }

    public final UpdateMfaPreferenceUseCase updateMfaPreference() {
        return new UpdateMfaPreferenceUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), fetchMfaPreference(), this.stateMachine);
    }

    public final UpdatePasswordUseCase updatePassword() {
        return new UpdatePasswordUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final UpdateUserAttributesUseCase updateUserAttributes() {
        return new UpdateUserAttributesUseCase(AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), fetchAuthSession(), this.stateMachine);
    }

    public final VerifyTotpSetupUseCase verifyTotpSetup() {
        return new VerifyTotpSetupUseCase(fetchAuthSession(), AuthEnvironmentKt.requireIdentityProviderClient(this.authEnvironment), this.stateMachine);
    }
}
