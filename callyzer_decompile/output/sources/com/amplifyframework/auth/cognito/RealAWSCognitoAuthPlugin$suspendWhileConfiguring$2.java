package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.states.AuthState;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2", m15344f = "RealAWSCognitoAuthPlugin.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2 extends AbstractC8199i implements InterfaceC2141e {
    /* synthetic */ Object L$0;
    int label;

    public RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2(InterfaceC7559c<? super RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2> interfaceC7559c) {
        super(2, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2 realAWSCognitoAuthPlugin$suspendWhileConfiguring$2 = new RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2(interfaceC7559c);
        realAWSCognitoAuthPlugin$suspendWhileConfiguring$2.L$0 = obj;
        return realAWSCognitoAuthPlugin$suspendWhileConfiguring$2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(AuthState authState, InterfaceC7559c<? super Boolean> interfaceC7559c) {
        return ((RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2) create(authState, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        AuthState authState = (AuthState) this.L$0;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        return Boolean.valueOf(((authState instanceof AuthState.Configured) || (authState instanceof AuthState.Error)) ? false : true);
    }
}
