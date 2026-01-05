package com.amplifyframework.rx;

import android.app.Activity;
import android.content.Intent;
import com.amplifyframework.auth.AuthCategoryBehavior;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthException;
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
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.rx.RxAdapters;
import java.util.List;
import java.util.Objects;
import p001o.wtf;
import p001o.xk3;

/* loaded from: classes5.dex */
final class RxAuthBinding implements RxAuthCategoryBehavior {
    private final AuthCategoryBehavior delegate;

    public RxAuthBinding() {
        this(Amplify.Auth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$associateWebAuthnCredential$31(Activity activity, Action action, Consumer consumer) {
        this.delegate.associateWebAuthnCredential(activity, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$associateWebAuthnCredential$32(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, Action action, Consumer consumer) {
        this.delegate.associateWebAuthnCredential(activity, authAssociateWebAuthnCredentialsOptions, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmResetPassword$17(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, Action action, Consumer consumer) {
        this.delegate.confirmResetPassword(str, str2, str3, authConfirmResetPasswordOptions, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmResetPassword$18(String str, String str2, String str3, Action action, Consumer consumer) {
        this.delegate.confirmResetPassword(str, str2, str3, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmSignIn$7(String str, AuthConfirmSignInOptions authConfirmSignInOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.confirmSignIn(str, authConfirmSignInOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmSignIn$8(String str, Consumer consumer, Consumer consumer2) {
        this.delegate.confirmSignIn(str, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmSignUp$1(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.confirmSignUp(str, str2, authConfirmSignUpOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmSignUp$2(String str, String str2, Consumer consumer, Consumer consumer2) {
        this.delegate.confirmSignUp(str, str2, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmUserAttribute$26(AuthUserAttributeKey authUserAttributeKey, String str, Action action, Consumer consumer) {
        this.delegate.confirmUserAttribute(authUserAttributeKey, str, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteWebAuthnCredential$33(String str, Action action, Consumer consumer) {
        this.delegate.deleteWebAuthnCredential(str, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteWebAuthnCredential$34(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, Action action, Consumer consumer) {
        this.delegate.deleteWebAuthnCredential(str, authDeleteWebAuthnCredentialOptions, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchAuthSession$13(AuthFetchSessionOptions authFetchSessionOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.fetchAuthSession(authFetchSessionOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$forgetDevice$14(AuthDevice authDevice, Action action, Consumer consumer) {
        this.delegate.forgetDevice(authDevice, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resendSignUpCode$3(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.resendSignUpCode(str, authResendSignUpCodeOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resendSignUpCode$4(String str, Consumer consumer, Consumer consumer2) {
        this.delegate.resendSignUpCode(str, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resendUserAttributeConfirmationCode$24(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.resendUserAttributeConfirmationCode(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resendUserAttributeConfirmationCode$25(AuthUserAttributeKey authUserAttributeKey, Consumer consumer, Consumer consumer2) {
        this.delegate.resendUserAttributeConfirmationCode(authUserAttributeKey, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetPassword$15(String str, AuthResetPasswordOptions authResetPasswordOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.resetPassword(str, authResetPasswordOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetPassword$16(String str, Consumer consumer, Consumer consumer2) {
        this.delegate.resetPassword(str, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signIn$5(String str, String str2, AuthSignInOptions authSignInOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.signIn(str, str2, authSignInOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signIn$6(String str, String str2, Consumer consumer, Consumer consumer2) {
        this.delegate.signIn(str, str2, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithSocialWebUI$10(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithSocialWebUI$9(AuthProvider authProvider, Activity activity, Consumer consumer, Consumer consumer2) {
        this.delegate.signInWithSocialWebUI(authProvider, activity, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithWebUI$11(Activity activity, Consumer consumer, Consumer consumer2) {
        this.delegate.signInWithWebUI(activity, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithWebUI$12(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.signInWithWebUI(activity, authWebUISignInOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signOut$27(Consumer consumer, Consumer consumer2) {
        this.delegate.signOut(consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signOut$28(AuthSignOutOptions authSignOutOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.signOut(authSignOutOptions, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signUp$0(String str, String str2, AuthSignUpOptions authSignUpOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.signUp(str, str2, authSignUpOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePassword$19(String str, String str2, Action action, Consumer consumer) {
        this.delegate.updatePassword(str, str2, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateUserAttribute$20(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.updateUserAttribute(authUserAttribute, authUpdateUserAttributeOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateUserAttribute$21(AuthUserAttribute authUserAttribute, Consumer consumer, Consumer consumer2) {
        this.delegate.updateUserAttribute(authUserAttribute, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateUserAttributes$22(List list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, Consumer consumer, Consumer consumer2) {
        this.delegate.updateUserAttributes(list, authUpdateUserAttributesOptions, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateUserAttributes$23(List list, Consumer consumer, Consumer consumer2) {
        this.delegate.updateUserAttributes(list, consumer, consumer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyTOTPSetup$29(String str, Action action, Consumer consumer) {
        this.delegate.verifyTOTPSetup(str, action, consumer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyTOTPSetup$30(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, Action action, Consumer consumer) {
        this.delegate.verifyTOTPSetup(str, authVerifyTOTPSetupOptions, action, consumer);
    }

    private xk3 toCompletable(RxAdapters.VoidBehaviors.ActionEmitter<AuthException> actionEmitter) {
        return RxAdapters.VoidBehaviors.toCompletable(actionEmitter);
    }

    private <T> wtf toSingle(RxAdapters.VoidBehaviors.ResultEmitter<T, AuthException> resultEmitter) {
        return RxAdapters.VoidBehaviors.toSingle(resultEmitter);
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 associateWebAuthnCredential(final Activity activity) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.i0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10913a.lambda$associateWebAuthnCredential$31(activity, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf autoSignIn() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.o1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                authCategoryBehavior.autoSignIn(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 confirmResetPassword(final String str, final String str2, final String str3, final AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.y0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f11109a.lambda$confirmResetPassword$17(str, str2, str3, authConfirmResetPasswordOptions, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf confirmSignIn(final String str, final AuthConfirmSignInOptions authConfirmSignInOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.s0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11039a.lambda$confirmSignIn$7(str, authConfirmSignInOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf confirmSignUp(final String str, final String str2, final AuthConfirmSignUpOptions authConfirmSignUpOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.p1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11009a.lambda$confirmSignUp$1(str, str2, authConfirmSignUpOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 confirmUserAttribute(final AuthUserAttributeKey authUserAttributeKey, final String str) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.k0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10947a.lambda$confirmUserAttribute$26(authUserAttributeKey, str, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 deleteUser() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.g0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                authCategoryBehavior.deleteUser(action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 deleteWebAuthnCredential(final String str) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.g1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10884a.lambda$deleteWebAuthnCredential$33(str, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf fetchAuthSession() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.h1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                authCategoryBehavior.fetchAuthSession(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf fetchDevices() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.q1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                authCategoryBehavior.fetchDevices(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf fetchUserAttributes() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.d0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                authCategoryBehavior.fetchUserAttributes(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 forgetDevice() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.t0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                authCategoryBehavior.forgetDevice(action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf getCurrentUser() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.u0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                authCategoryBehavior.getCurrentUser(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public void handleWebUISignInResponse(Intent intent) {
        this.delegate.handleWebUISignInResponse(intent);
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf listWebAuthnCredentials() {
        AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new e0(authCategoryBehavior));
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 rememberDevice() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.h0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                authCategoryBehavior.rememberDevice(action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf resendSignUpCode(final String str, final AuthResendSignUpCodeOptions authResendSignUpCodeOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.m1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10979a.lambda$resendSignUpCode$3(str, authResendSignUpCodeOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf resendUserAttributeConfirmationCode(final AuthUserAttributeKey authUserAttributeKey, final AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.q0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11021a.lambda$resendUserAttributeConfirmationCode$24(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf resetPassword(final String str, final AuthResetPasswordOptions authResetPasswordOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.l1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10963a.lambda$resetPassword$15(str, authResetPasswordOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf setUpTOTP() {
        final AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.c0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                authCategoryBehavior.setUpTOTP(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signIn(final String str, final String str2, final AuthSignInOptions authSignInOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.j1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10931a.lambda$signIn$5(str, str2, authSignInOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signInWithSocialWebUI(final AuthProvider authProvider, final Activity activity) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.a0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10801a.lambda$signInWithSocialWebUI$9(authProvider, activity, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signInWithWebUI(final Activity activity) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.o0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10999a.lambda$signInWithWebUI$11(activity, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signOut() {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.z0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11124a.lambda$signOut$27(consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signUp(final String str, final String str2, final AuthSignUpOptions authSignUpOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.r1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11030a.lambda$signUp$0(str, str2, authSignUpOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 updatePassword(final String str, final String str2) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.d1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10838a.lambda$updatePassword$19(str, str2, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf updateUserAttribute(final AuthUserAttribute authUserAttribute, final AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.f1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10869a.lambda$updateUserAttribute$20(authUserAttribute, authUpdateUserAttributeOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf updateUserAttributes(final List<AuthUserAttribute> list, final AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.z
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11121a.lambda$updateUserAttributes$22(list, authUpdateUserAttributesOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 verifyTOTPSetup(final String str) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.f0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10867a.lambda$verifyTOTPSetup$29(str, action, consumer);
            }
        });
    }

    public RxAuthBinding(AuthCategoryBehavior authCategoryBehavior) {
        Objects.requireNonNull(authCategoryBehavior);
        this.delegate = authCategoryBehavior;
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 associateWebAuthnCredential(final Activity activity, final AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.x0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f11095a.lambda$associateWebAuthnCredential$32(activity, authAssociateWebAuthnCredentialsOptions, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 confirmResetPassword(final String str, final String str2, final String str3) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.e1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10855a.lambda$confirmResetPassword$18(str, str2, str3, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf confirmSignIn(final String str) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.c1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10829a.lambda$confirmSignIn$8(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf confirmSignUp(final String str, final String str2) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.w0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11082a.lambda$confirmSignUp$2(str, str2, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 deleteWebAuthnCredential(final String str, final AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.b0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10815a.lambda$deleteWebAuthnCredential$34(str, authDeleteWebAuthnCredentialOptions, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf fetchAuthSession(final AuthFetchSessionOptions authFetchSessionOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.b1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10818a.lambda$fetchAuthSession$13(authFetchSessionOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 forgetDevice(final AuthDevice authDevice) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.k1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10950a.lambda$forgetDevice$14(authDevice, action, consumer);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf listWebAuthnCredentials(AuthListWebAuthnCredentialsOptions authListWebAuthnCredentialsOptions) {
        AuthCategoryBehavior authCategoryBehavior = this.delegate;
        Objects.requireNonNull(authCategoryBehavior);
        return toSingle(new e0(authCategoryBehavior));
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf resendSignUpCode(final String str) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.v0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11071a.lambda$resendSignUpCode$4(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf resendUserAttributeConfirmationCode(final AuthUserAttributeKey authUserAttributeKey) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.n1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10991a.lambda$resendUserAttributeConfirmationCode$25(authUserAttributeKey, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf resetPassword(final String str) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.n0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10989a.lambda$resetPassword$16(str, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signIn(final String str, final String str2) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.m0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10976a.lambda$signIn$6(str, str2, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signInWithSocialWebUI(final AuthProvider authProvider, final Activity activity, final AuthWebUISignInOptions authWebUISignInOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.j0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10927a.lambda$signInWithSocialWebUI$10(authProvider, activity, authWebUISignInOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signInWithWebUI(final Activity activity, final AuthWebUISignInOptions authWebUISignInOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.a1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10804a.lambda$signInWithWebUI$12(activity, authWebUISignInOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf signOut(final AuthSignOutOptions authSignOutOptions) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.i1
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f10915a.lambda$signOut$28(authSignOutOptions, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf updateUserAttribute(final AuthUserAttribute authUserAttribute) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.r0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11028a.lambda$updateUserAttribute$21(authUserAttribute, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public wtf updateUserAttributes(final List<AuthUserAttribute> list) {
        return toSingle(new RxAdapters.VoidBehaviors.ResultEmitter() { // from class: com.amplifyframework.rx.p0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ResultEmitter
            public final void emitTo(Consumer consumer, Consumer consumer2) {
                this.f11007a.lambda$updateUserAttributes$23(list, consumer, consumer2);
            }
        });
    }

    @Override // com.amplifyframework.rx.RxAuthCategoryBehavior
    public xk3 verifyTOTPSetup(final String str, final AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions) {
        return toCompletable(new RxAdapters.VoidBehaviors.ActionEmitter() { // from class: com.amplifyframework.rx.l0
            @Override // com.amplifyframework.rx.RxAdapters.VoidBehaviors.ActionEmitter
            public final void emitTo(Action action, Consumer consumer) {
                this.f10960a.lambda$verifyTOTPSetup$30(str, authVerifyTOTPSetupOptions, action, consumer);
            }
        });
    }
}
