package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Intent;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.TOTPSetupDetails;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import p001o.a0f;
import p001o.n64;
import p001o.n75;
import p001o.sq8;
import p001o.tq8;
import p001o.uq8;
import p001o.vre;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class KotlinAuthFacadeInternal {
    private final RealAWSCognitoAuthPlugin delegate;

    public KotlinAuthFacadeInternal(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin) {
        sq8.m48649h(realAWSCognitoAuthPlugin, "delegate");
        this.delegate = realAWSCognitoAuthPlugin;
    }

    public final Object autoSignIn(n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.autoSignIn(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$autoSignIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$autoSignIn$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object clearFederationToIdentityPool(n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.clearFederationToIdentityPool(new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$clearFederationToIdentityPool$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$clearFederationToIdentityPool$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Object confirmResetPassword(String str, String str2, String str3, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.confirmResetPassword(str, str2, str3, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Object confirmSignIn(String str, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.confirmSignIn(str, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object confirmSignUp(String str, String str2, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.confirmSignUp(str, str2, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignUpResult authSignUpResult) {
                sq8.m48649h(authSignUpResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignUpResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object deleteUser(n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.deleteUser(new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$deleteUser$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$deleteUser$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Object federateToIdentityPool(String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$federateToIdentityPool$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(FederateToIdentityPoolResult federateToIdentityPoolResult) {
                sq8.m48649h(federateToIdentityPoolResult, "it");
                a0fVar.resumeWith(vre.m53351b(federateToIdentityPoolResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$federateToIdentityPool$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object fetchAuthSession(n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                sq8.m48649h(authSession, "it");
                a0fVar.resumeWith(vre.m53351b(authSession));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object fetchMFAPreference(n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.fetchMFAPreference(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchMFAPreference$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(UserMFAPreference userMFAPreference) {
                sq8.m48649h(userMFAPreference, "it");
                a0fVar.resumeWith(vre.m53351b(userMFAPreference));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchMFAPreference$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final void handleWebUISignInResponse(Intent intent) {
        this.delegate.handleWebUISignInResponse(intent);
    }

    public final Object resendSignUpCode(String str, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.resendSignUpCode(str, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthCodeDeliveryDetails authCodeDeliveryDetails) {
                sq8.m48649h(authCodeDeliveryDetails, "it");
                a0fVar.resumeWith(vre.m53351b(authCodeDeliveryDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object resetPassword(String str, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.resetPassword(str, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthResetPasswordResult authResetPasswordResult) {
                sq8.m48649h(authResetPasswordResult, "it");
                a0fVar.resumeWith(vre.m53351b(authResetPasswordResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object setUpTOTP(n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.setUpTOTP(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$setUpTOTP$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(TOTPSetupDetails tOTPSetupDetails) {
                sq8.m48649h(tOTPSetupDetails, "it");
                a0fVar.resumeWith(vre.m53351b(tOTPSetupDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$setUpTOTP$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signIn(String str, String str2, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signIn(str, str2, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signInWithSocialWebUI(AuthProvider authProvider, Activity activity, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signInWithSocialWebUI(authProvider, activity, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signInWithWebUI(Activity activity, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signInWithWebUI(activity, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signOut(n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signOut(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signOut$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignOutResult authSignOutResult) {
                sq8.m48649h(authSignOutResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignOutResult));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signUp(String str, String str2, AuthSignUpOptions authSignUpOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signUp(str, str2, authSignUpOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signUp$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignUpResult authSignUpResult) {
                sq8.m48649h(authSignUpResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignUpResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signUp$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object updateMFAPreference(MFAPreference mFAPreference, MFAPreference mFAPreference2, MFAPreference mFAPreference3, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.updateMFAPreference(mFAPreference, mFAPreference2, mFAPreference3, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateMFAPreference$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updateMFAPreference$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Object updatePassword(String str, String str2, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.updatePassword(str, str2, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updatePassword$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$updatePassword$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Object verifyTOTPSetup(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.verifyTOTPSetup(str, authVerifyTOTPSetupOptions, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$verifyTOTPSetup$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$verifyTOTPSetup$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Object confirmResetPassword(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, n64 n64Var) throws Throwable {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.confirmResetPassword(str, str2, str3, authConfirmResetPasswordOptions, new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$4$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(y3i.f54824a));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmResetPassword$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b == uq8.m51918f() ? objM16313b : y3i.f54824a;
    }

    public final Object confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.confirmSignIn(str, authConfirmSignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object confirmSignUp(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.confirmSignUp(str, str2, authConfirmSignUpOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignUpResult authSignUpResult) {
                sq8.m48649h(authSignUpResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignUpResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignUp$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object fetchAuthSession(AuthFetchSessionOptions authFetchSessionOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.fetchAuthSession(authFetchSessionOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession authSession) {
                sq8.m48649h(authSession, "it");
                a0fVar.resumeWith(vre.m53351b(authSession));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.resendSignUpCode(str, authResendSignUpCodeOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthCodeDeliveryDetails authCodeDeliveryDetails) {
                sq8.m48649h(authCodeDeliveryDetails, "it");
                a0fVar.resumeWith(vre.m53351b(authCodeDeliveryDetails));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resendSignUpCode$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object resetPassword(String str, AuthResetPasswordOptions authResetPasswordOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.resetPassword(str, authResetPasswordOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthResetPasswordResult authResetPasswordResult) {
                sq8.m48649h(authResetPasswordResult, "it");
                a0fVar.resumeWith(vre.m53351b(authResetPasswordResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$resetPassword$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signIn(String str, String str2, AuthSignInOptions authSignInOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signIn(str, str2, authSignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signInWithWebUI(activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult authSignInResult) {
                sq8.m48649h(authSignInResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignInResult));
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException authException) {
                sq8.m48649h(authException, "it");
                n64 n64Var2 = a0fVar;
                vre.C17665a c17665a = vre.f50797b;
                n64Var2.resumeWith(vre.m53351b(wre.m54933a(authException)));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }

    public final Object signOut(AuthSignOutOptions authSignOutOptions, n64 n64Var) {
        final a0f a0fVar = new a0f(tq8.m50336c(n64Var));
        this.delegate.signOut(authSignOutOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signOut$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignOutResult authSignOutResult) {
                sq8.m48649h(authSignOutResult, "it");
                a0fVar.resumeWith(vre.m53351b(authSignOutResult));
            }
        });
        Object objM16313b = a0fVar.m16313b();
        if (objM16313b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM16313b;
    }
}
