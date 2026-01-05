package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import org.objectweb.asm.Opcodes;
import p001o.bj8;
import p001o.kge;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class AuthStateMachineKt {

    @l75(m36647c = "com.amplifyframework.auth.cognito.AuthStateMachineKt", m36648f = "AuthStateMachine.kt", m36649l = {Opcodes.D2F}, m36650m = "requireSignedInState")
    /* renamed from: com.amplifyframework.auth.cognito.AuthStateMachineKt$requireSignedInState$1 */
    public static final class C103841 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C103841(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthStateMachineKt.requireSignedInState(null, this);
        }
    }

    public static final /* synthetic */ <T extends AuthenticationState> Object requireAuthenticationState(AuthStateMachine authStateMachine, n64 n64Var) throws InvalidStateException {
        bj8.m19245c(0);
        Object currentState = authStateMachine.getCurrentState(n64Var);
        bj8.m19245c(1);
        AuthenticationState authNState = ((AuthState) currentState).getAuthNState();
        sq8.m48655n(3, "T");
        if (authNState instanceof AuthenticationState) {
            return y3i.f54824a;
        }
        sq8.m48655n(4, "T");
        throw new InvalidStateException("Auth State Machine is not in the required authentication state: " + kge.m35689b(AuthenticationState.class).mo26337d(), null, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object requireSignedInState(AuthStateMachine authStateMachine, n64 n64Var) {
        C103841 c103841;
        if (n64Var instanceof C103841) {
            c103841 = (C103841) n64Var;
            int i = c103841.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c103841.label = i - Integer.MIN_VALUE;
            } else {
                c103841 = new C103841(n64Var);
            }
        }
        Object currentState = c103841.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c103841.label;
        if (i2 == 0) {
            wre.m54934b(currentState);
            c103841.label = 1;
            currentState = authStateMachine.getCurrentState(c103841);
            if (currentState == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(currentState);
        }
        AuthenticationState authNState = ((AuthState) currentState).getAuthNState();
        if (authNState instanceof AuthenticationState.SignedIn) {
            return (AuthenticationState.SignedIn) authNState;
        }
        if (authNState instanceof AuthenticationState.SignedOut) {
            throw new SignedOutException(null, null, null, 7, null);
        }
        throw new InvalidStateException(null, null, null, 7, null);
    }
}
