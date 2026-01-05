package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.Intent;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.cognito.options.FederateToIdentityPoolOptions;
import com.amplifyframework.auth.cognito.result.FederateToIdentityPoolResult;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import com.amplifyframework.auth.options.AuthFetchSessionOptions;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import qw.a0;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinAuthFacadeInternal {
    private final RealAWSCognitoAuthPlugin delegate;

    public KotlinAuthFacadeInternal(RealAWSCognitoAuthPlugin delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    public final Object clearFederationToIdentityPool(InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.clearFederationToIdentityPool(new Action() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$clearFederationToIdentityPool$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$clearFederationToIdentityPool$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    public final Object confirmSignIn(String str, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.confirmSignIn(str, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object federateToIdentityPool(String str, AuthProvider authProvider, FederateToIdentityPoolOptions federateToIdentityPoolOptions, InterfaceC7559c<? super FederateToIdentityPoolResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.federateToIdentityPool(str, authProvider, federateToIdentityPoolOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$federateToIdentityPool$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(FederateToIdentityPoolResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$federateToIdentityPool$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object fetchAuthSession(InterfaceC7559c<? super AuthSession> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.fetchAuthSession(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final void handleWebUISignInResponse(Intent intent) {
        this.delegate.handleWebUISignInResponse(intent);
    }

    public final Object signIn(String str, String str2, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signIn(str, str2, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object signInWithSocialWebUI(AuthProvider authProvider, Activity activity, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signInWithSocialWebUI(authProvider, activity, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object signInWithWebUI(Activity activity, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signInWithWebUI(activity, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object signOut(InterfaceC7559c<? super AuthSignOutResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signOut(new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signOut$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignOutResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.confirmSignIn(str, authConfirmSignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$confirmSignIn$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object fetchAuthSession(AuthFetchSessionOptions authFetchSessionOptions, InterfaceC7559c<? super AuthSession> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.fetchAuthSession(authFetchSessionOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$fetchAuthSession$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object signIn(String str, String str2, AuthSignInOptions authSignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signIn(str, str2, authSignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signIn$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithSocialWebUI$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signInWithWebUI(activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signInWithWebUI$4$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }

    public final Object signOut(AuthSignOutOptions authSignOutOptions, InterfaceC7559c<? super AuthSignOutResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signOut(authSignOutOptions, new Consumer() { // from class: com.amplifyframework.auth.cognito.KotlinAuthFacadeInternal$signOut$4$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignOutResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        });
        Object objM14303a = c7566j.m14303a();
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14303a;
    }
}
