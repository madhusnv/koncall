package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.statemachine.codegen.states.AuthState;
import ex.InterfaceC2142f;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$result$2", m15344f = "SignUpUseCase.kt", m15345l = {46, 50}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SignUpUseCase$execute$result$2 extends AbstractC8199i implements InterfaceC2142f {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    public SignUpUseCase$execute$result$2(InterfaceC7559c<? super SignUpUseCase$execute$result$2> interfaceC7559c) {
        super(3, interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return r2;
     */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.amplifyframework.auth.AuthException {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            wx.k r0 = (wx.InterfaceC8210k) r0
            java.lang.Object r1 = r7.L$1
            com.amplifyframework.statemachine.codegen.states.AuthState r1 = (com.amplifyframework.statemachine.codegen.states.AuthState) r1
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r7.label
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L26
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r0 = r7.L$2
            com.amplifyframework.statemachine.codegen.states.SignUpState r0 = (com.amplifyframework.statemachine.codegen.states.SignUpState) r0
            og.od.m10798c(r8)
            goto L65
        L26:
            og.od.m10798c(r8)
            com.amplifyframework.statemachine.codegen.states.SignUpState r8 = r1.getAuthSignUpState()
            boolean r1 = r8 instanceof com.amplifyframework.statemachine.codegen.states.SignUpState.AwaitingUserConfirmation
            r3 = 0
            if (r1 == 0) goto L47
            com.amplifyframework.statemachine.codegen.states.SignUpState$AwaitingUserConfirmation r8 = (com.amplifyframework.statemachine.codegen.states.SignUpState.AwaitingUserConfirmation) r8
            com.amplifyframework.auth.result.AuthSignUpResult r8 = r8.getSignUpResult()
            r7.L$0 = r3
            r7.L$1 = r3
            r7.L$2 = r3
            r7.label = r6
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r2) goto L65
            goto L5f
        L47:
            boolean r1 = r8 instanceof com.amplifyframework.statemachine.codegen.states.SignUpState.SignedUp
            if (r1 == 0) goto L60
            com.amplifyframework.statemachine.codegen.states.SignUpState$SignedUp r8 = (com.amplifyframework.statemachine.codegen.states.SignUpState.SignedUp) r8
            com.amplifyframework.auth.result.AuthSignUpResult r8 = r8.getSignUpResult()
            r7.L$0 = r3
            r7.L$1 = r3
            r7.L$2 = r3
            r7.label = r5
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r2) goto L65
        L5f:
            return r2
        L60:
            boolean r0 = r8 instanceof com.amplifyframework.statemachine.codegen.states.SignUpState.Error
            if (r0 != 0) goto L6a
            r4 = r6
        L65:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        L6a:
            com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter$Companion r0 = com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter.Companion
            com.amplifyframework.statemachine.codegen.states.SignUpState$Error r8 = (com.amplifyframework.statemachine.codegen.states.SignUpState.Error) r8
            java.lang.Exception r8 = r8.getException()
            java.lang.String r1 = "Sign up failed."
            com.amplifyframework.auth.AuthException r8 = r0.lookup(r8, r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$result$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(InterfaceC8210k interfaceC8210k, AuthState authState, InterfaceC7559c<? super Boolean> interfaceC7559c) {
        SignUpUseCase$execute$result$2 signUpUseCase$execute$result$2 = new SignUpUseCase$execute$result$2(interfaceC7559c);
        signUpUseCase$execute$result$2.L$0 = interfaceC8210k;
        signUpUseCase$execute$result$2.L$1 = authState;
        return signUpUseCase$execute$result$2.invokeSuspend(a0.f30746a);
    }
}
