package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.states.AuthState;
import p001o.jgg;
import p001o.l75;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2", m36648f = "RealAWSCognitoAuthPlugin.kt", m36649l = {}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2 extends jgg implements nl7 {
    /* synthetic */ Object L$0;
    int label;

    public RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2(n64 n64Var) {
        super(2, n64Var);
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2 realAWSCognitoAuthPlugin$suspendWhileConfiguring$2 = new RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2(n64Var);
        realAWSCognitoAuthPlugin$suspendWhileConfiguring$2.L$0 = obj;
        return realAWSCognitoAuthPlugin$suspendWhileConfiguring$2;
    }

    @Override // p001o.nl7
    public final Object invoke(AuthState authState, n64 n64Var) {
        return ((RealAWSCognitoAuthPlugin$suspendWhileConfiguring$2) create(authState, n64Var)).invokeSuspend(y3i.f54824a);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        uq8.m51918f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(obj);
        AuthState authState = (AuthState) this.L$0;
        return ml1.m39301a(((authState instanceof AuthState.Configured) || (authState instanceof AuthState.Error)) ? false : true);
    }
}
