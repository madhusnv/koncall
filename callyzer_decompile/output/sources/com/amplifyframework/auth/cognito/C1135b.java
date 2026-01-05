package com.amplifyframework.auth.cognito;

import com.amplifyframework.core.Consumer;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import ex.InterfaceC2139c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.auth.cognito.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1135b implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f5830a;

    /* renamed from: b */
    public final /* synthetic */ RealAWSCognitoAuthPlugin f5831b;

    /* renamed from: c */
    public final /* synthetic */ StateChangeListenerToken f5832c;

    /* renamed from: d */
    public final /* synthetic */ Consumer f5833d;

    /* renamed from: e */
    public final /* synthetic */ Consumer f5834e;

    public /* synthetic */ C1135b(RealAWSCognitoAuthPlugin realAWSCognitoAuthPlugin, StateChangeListenerToken stateChangeListenerToken, Consumer consumer, Consumer consumer2, int i10) {
        this.f5830a = i10;
        this.f5831b = realAWSCognitoAuthPlugin;
        this.f5832c = stateChangeListenerToken;
        this.f5833d = consumer;
        this.f5834e = consumer2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f5830a) {
            case 0:
                return RealAWSCognitoAuthPlugin._signInWithHostedUI$lambda$15(this.f5831b, this.f5832c, this.f5833d, this.f5834e, (AuthState) obj);
            case 1:
                return RealAWSCognitoAuthPlugin._confirmSignIn$lambda$10(this.f5831b, this.f5832c, this.f5833d, this.f5834e, (AuthState) obj);
            case 2:
                return RealAWSCognitoAuthPlugin._signIn$lambda$5(this.f5831b, this.f5832c, this.f5833d, this.f5834e, (AuthState) obj);
            default:
                return RealAWSCognitoAuthPlugin._federateToIdentityPool$lambda$33(this.f5831b, this.f5832c, this.f5833d, this.f5834e, (AuthState) obj);
        }
    }
}
