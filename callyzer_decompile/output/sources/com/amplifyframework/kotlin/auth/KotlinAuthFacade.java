package com.amplifyframework.kotlin.auth;

import android.app.Activity;
import android.content.Intent;
import com.amplifyframework.auth.AuthCategoryBehavior;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.AuthException;
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
import com.amplifyframework.auth.result.AuthResetPasswordResult;
import com.amplifyframework.auth.result.AuthSignInResult;
import com.amplifyframework.auth.result.AuthSignOutResult;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.auth.result.AuthUpdateAttributeResult;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import pg.n6;
import qw.a0;
import uw.C7566j;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KotlinAuthFacade implements Auth {
    private final AuthCategoryBehavior delegate;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.auth.KotlinAuthFacade", m15344f = "KotlinAuthFacade.kt", m15345l = {324}, m15346m = "listWebAuthnCredentials")
    /* renamed from: com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$1 */
    public static final class C12011 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12011(InterfaceC7559c<? super C12011> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinAuthFacade.this.listWebAuthnCredentials(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinAuthFacade() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object associateWebAuthnCredential(Activity activity, AuthAssociateWebAuthnCredentialsOptions authAssociateWebAuthnCredentialsOptions, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.associateWebAuthnCredential(activity, authAssociateWebAuthnCredentialsOptions, new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$associateWebAuthnCredential$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$associateWebAuthnCredential$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object autoSignIn(InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.autoSignIn(new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$autoSignIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$autoSignIn$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object confirmResetPassword(String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.confirmResetPassword(str, str2, str3, authConfirmResetPasswordOptions, new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmResetPassword$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmResetPassword$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object confirmSignIn(String str, AuthConfirmSignInOptions authConfirmSignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.confirmSignIn(str, authConfirmSignInOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmSignIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmSignIn$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object confirmSignUp(String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, InterfaceC7559c<? super AuthSignUpResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.confirmSignUp(str, str2, authConfirmSignUpOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmSignUp$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignUpResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmSignUp$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object confirmUserAttribute(AuthUserAttributeKey authUserAttributeKey, String str, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.confirmUserAttribute(authUserAttributeKey, str, new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmUserAttribute$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$confirmUserAttribute$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object deleteUser(InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.deleteUser(new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$deleteUser$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$deleteUser$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object deleteWebAuthnCredential(String str, AuthDeleteWebAuthnCredentialOptions authDeleteWebAuthnCredentialOptions, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.deleteWebAuthnCredential(str, authDeleteWebAuthnCredentialOptions, new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$deleteWebAuthnCredential$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$deleteWebAuthnCredential$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object fetchAuthSession(AuthFetchSessionOptions authFetchSessionOptions, InterfaceC7559c<? super AuthSession> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.fetchAuthSession(authFetchSessionOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$fetchAuthSession$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSession it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$fetchAuthSession$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object fetchDevices(InterfaceC7559c<? super List<AuthDevice>> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.fetchDevices(new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$fetchDevices$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(List<AuthDevice> it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$fetchDevices$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object fetchUserAttributes(InterfaceC7559c<? super List<AuthUserAttribute>> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.fetchUserAttributes(new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$fetchUserAttributes$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(List<AuthUserAttribute> it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$fetchUserAttributes$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object forgetDevice(AuthDevice authDevice, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        if (authDevice == null) {
            this.delegate.forgetDevice(new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$forgetDevice$2$1
                @Override // com.amplifyframework.core.Action
                public final void call() {
                    c7566j.resumeWith(a0.f30746a);
                }
            }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$forgetDevice$2$2
                @Override // com.amplifyframework.core.Consumer
                public final void accept(AuthException it) {
                    AbstractC4154l.m8923f(it, "it");
                    c7566j.resumeWith(od.m10796a(it));
                }
            });
        } else {
            this.delegate.forgetDevice(authDevice, new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$forgetDevice$2$3
                @Override // com.amplifyframework.core.Action
                public final void call() {
                    c7566j.resumeWith(a0.f30746a);
                }
            }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$forgetDevice$2$4
                @Override // com.amplifyframework.core.Consumer
                public final void accept(AuthException it) {
                    AbstractC4154l.m8923f(it, "it");
                    c7566j.resumeWith(od.m10796a(it));
                }
            });
        }
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object getCurrentUser(InterfaceC7559c<? super AuthUser> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.getCurrentUser(new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$getCurrentUser$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthUser it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$getCurrentUser$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public void handleWebUISignInResponse(Intent intent) {
        AbstractC4154l.m8923f(intent, "intent");
        this.delegate.handleWebUISignInResponse(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.kotlin.auth.Auth
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object listWebAuthnCredentials(com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions r5, uw.InterfaceC7559c<? super com.amplifyframework.auth.result.AuthListWebAuthnCredentialsResult> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amplifyframework.kotlin.auth.KotlinAuthFacade.C12011
            if (r0 == 0) goto L13
            r0 = r6
            com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$1 r0 = (com.amplifyframework.kotlin.auth.KotlinAuthFacade.C12011) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$1 r0 = new com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions r5 = (com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions) r5
            og.od.m10798c(r6)
            goto L59
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r6)
            r0.L$0 = r5
            r0.label = r3
            uw.j r6 = new uw.j
            uw.c r0 = pg.n6.m11797c(r0)
            r6.<init>(r0)
            com.amplifyframework.auth.AuthCategoryBehavior r0 = r4.delegate
            com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$2$1 r2 = new com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$2$1
            r2.<init>()
            com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$2$2 r3 = new com.amplifyframework.kotlin.auth.KotlinAuthFacade$listWebAuthnCredentials$2$2
            r3.<init>()
            r0.listWebAuthnCredentials(r5, r2, r3)
            java.lang.Object r6 = r6.m14303a()
            if (r6 != r1) goto L59
            return r1
        L59:
            java.lang.String r5 = "suspendCoroutine(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.kotlin.auth.KotlinAuthFacade.listWebAuthnCredentials(com.amplifyframework.auth.options.AuthListWebAuthnCredentialsOptions, uw.c):java.lang.Object");
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object rememberDevice(InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.rememberDevice(new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$rememberDevice$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$rememberDevice$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object resendSignUpCode(String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.resendSignUpCode(str, authResendSignUpCodeOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$resendSignUpCode$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthCodeDeliveryDetails it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$resendSignUpCode$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object resendUserAttributeConfirmationCode(AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, InterfaceC7559c<? super AuthCodeDeliveryDetails> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.resendUserAttributeConfirmationCode(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$resendUserAttributeConfirmationCode$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthCodeDeliveryDetails it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$resendUserAttributeConfirmationCode$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object resetPassword(String str, AuthResetPasswordOptions authResetPasswordOptions, InterfaceC7559c<? super AuthResetPasswordResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.resetPassword(str, authResetPasswordOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$resetPassword$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthResetPasswordResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$resetPassword$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object setUpTOTP(InterfaceC7559c<? super TOTPSetupDetails> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.setUpTOTP(new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$setUpTOTP$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(TOTPSetupDetails it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$setUpTOTP$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object signIn(String str, String str2, AuthSignInOptions authSignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signIn(str, str2, authSignInOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signIn$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signIn$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object signInWithSocialWebUI(AuthProvider authProvider, Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signInWithSocialWebUI(authProvider, activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signInWithSocialWebUI$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signInWithSocialWebUI$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object signInWithWebUI(Activity activity, AuthWebUISignInOptions authWebUISignInOptions, InterfaceC7559c<? super AuthSignInResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signInWithWebUI(activity, authWebUISignInOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signInWithWebUI$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignInResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signInWithWebUI$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object signOut(AuthSignOutOptions authSignOutOptions, InterfaceC7559c<? super AuthSignOutResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signOut(authSignOutOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signOut$2$1
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object signUp(String str, String str2, AuthSignUpOptions authSignUpOptions, InterfaceC7559c<? super AuthSignUpResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.signUp(str, str2, authSignUpOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signUp$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthSignUpResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$signUp$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object updatePassword(String str, String str2, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.updatePassword(str, str2, new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$updatePassword$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$updatePassword$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object updateUserAttribute(AuthUserAttribute authUserAttribute, AuthUpdateUserAttributeOptions authUpdateUserAttributeOptions, InterfaceC7559c<? super AuthUpdateAttributeResult> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.updateUserAttribute(authUserAttribute, authUpdateUserAttributeOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$updateUserAttribute$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthUpdateAttributeResult it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$updateUserAttribute$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object updateUserAttributes(List<AuthUserAttribute> list, AuthUpdateUserAttributesOptions authUpdateUserAttributesOptions, InterfaceC7559c<? super Map<AuthUserAttributeKey, AuthUpdateAttributeResult>> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.updateUserAttributes(list, authUpdateUserAttributesOptions, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$updateUserAttributes$2$1
            @Override // com.amplifyframework.core.Consumer
            public final void accept(Map<AuthUserAttributeKey, AuthUpdateAttributeResult> it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(it);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$updateUserAttributes$2$2
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

    @Override // com.amplifyframework.kotlin.auth.Auth
    public Object verifyTOTPSetup(String str, AuthVerifyTOTPSetupOptions authVerifyTOTPSetupOptions, InterfaceC7559c<? super a0> interfaceC7559c) {
        final C7566j c7566j = new C7566j(n6.m11797c(interfaceC7559c));
        this.delegate.verifyTOTPSetup(str, authVerifyTOTPSetupOptions, new Action() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$verifyTOTPSetup$2$1
            @Override // com.amplifyframework.core.Action
            public final void call() {
                c7566j.resumeWith(a0.f30746a);
            }
        }, new Consumer() { // from class: com.amplifyframework.kotlin.auth.KotlinAuthFacade$verifyTOTPSetup$2$2
            @Override // com.amplifyframework.core.Consumer
            public final void accept(AuthException it) {
                AbstractC4154l.m8923f(it, "it");
                c7566j.resumeWith(od.m10796a(it));
            }
        });
        Object objM14303a = c7566j.m14303a();
        return objM14303a == EnumC7794a.COROUTINE_SUSPENDED ? objM14303a : a0.f30746a;
    }

    public KotlinAuthFacade(AuthCategoryBehavior delegate) {
        AbstractC4154l.m8923f(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KotlinAuthFacade(AuthCategoryBehavior Auth, int i10, AbstractC4148f abstractC4148f) {
        if ((i10 & 1) != 0) {
            Auth = Amplify.Auth;
            AbstractC4154l.m8922e(Auth, "Auth");
        }
        this(Auth);
    }
}
