package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter;
import com.amplifyframework.auth.result.AuthSignUpResult;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.SignUpState;
import ex.InterfaceC2142f;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ConfirmSignUpUseCase$execute$result$2", m15344f = "ConfirmSignUpUseCase.kt", m15345l = {62}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ConfirmSignUpUseCase$execute$result$2 extends AbstractC8199i implements InterfaceC2142f {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    public ConfirmSignUpUseCase$execute$result$2(InterfaceC7559c<? super ConfirmSignUpUseCase$execute$result$2> interfaceC7559c) {
        super(3, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws AuthException {
        InterfaceC8210k interfaceC8210k = (InterfaceC8210k) this.L$0;
        AuthState authState = (AuthState) this.L$1;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.label;
        boolean z6 = true;
        if (i10 == 0) {
            od.m10798c(obj);
            SignUpState authSignUpState = authState.getAuthSignUpState();
            if (authSignUpState instanceof SignUpState.Error) {
                throw CognitoAuthExceptionConverter.Companion.lookup(((SignUpState.Error) authSignUpState).getException(), "Sign up failed.");
            }
            if (authSignUpState instanceof SignUpState.SignedUp) {
                AuthSignUpResult signUpResult = ((SignUpState.SignedUp) authSignUpState).getSignUpResult();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (interfaceC8210k.emit(signUpResult, this) == enumC7794a) {
                    return enumC7794a;
                }
            }
            return Boolean.valueOf(z6);
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        z6 = false;
        return Boolean.valueOf(z6);
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(InterfaceC8210k interfaceC8210k, AuthState authState, InterfaceC7559c<? super Boolean> interfaceC7559c) {
        ConfirmSignUpUseCase$execute$result$2 confirmSignUpUseCase$execute$result$2 = new ConfirmSignUpUseCase$execute$result$2(interfaceC7559c);
        confirmSignUpUseCase$execute$result$2.L$0 = interfaceC8210k;
        confirmSignUpUseCase$execute$result$2.L$1 = authState;
        return confirmSignUpUseCase$execute$result$2.invokeSuspend(a0.f30746a);
    }
}
