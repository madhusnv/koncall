package com.amplifyframework.auth.cognito;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C1140g implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f5863a;

    /* renamed from: b */
    public final /* synthetic */ RealAWSCognitoAuthPlugin f5864b;

    public /* synthetic */ C1140g(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, int i10) {
        this.f5863a = i10;
        this.f5864b = realAWSCognitoAuthPlugin;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f5863a) {
            case 0:
                return RealAWSCognitoAuthPlugin.signInWithHostedUI$lambda$14$lambda$13(this.f5864b);
            case 1:
                return RealAWSCognitoAuthPlugin.configureAuthStates$lambda$31(this.f5864b);
            default:
                return RealAWSCognitoAuthPlugin.signIn$lambda$4$lambda$3(this.f5864b);
        }
    }
}
