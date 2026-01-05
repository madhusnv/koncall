package com.amplifyframework.auth.cognito.usecases;

import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ResendSignupCodeUseCaseKt {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt", m15344f = "ResendSignupCodeUseCase.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED}, m15346m = "requireSignedInOrSignedOutState")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt$requireSignedInOrSignedOutState$1 */
    public static final class C11681 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11681(InterfaceC7559c<? super C11681> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResendSignupCodeUseCaseKt.requireSignedInOrSignedOutState(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requireSignedInOrSignedOutState(com.amplifyframework.auth.cognito.AuthStateMachine r6, uw.InterfaceC7559c<? super com.amplifyframework.statemachine.codegen.states.AuthenticationState> r7) throws com.amplifyframework.auth.exceptions.InvalidStateException, com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            boolean r0 = r7 instanceof com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt.C11681
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt$requireSignedInOrSignedOutState$1 r0 = (com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt.C11681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt$requireSignedInOrSignedOutState$1 r0 = new com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt$requireSignedInOrSignedOutState$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.L$0
            com.amplifyframework.auth.cognito.AuthStateMachine r6 = (com.amplifyframework.auth.cognito.AuthStateMachine) r6
            og.od.m10798c(r7)
            goto L42
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            og.od.m10798c(r7)
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r6.getCurrentState(r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            com.amplifyframework.statemachine.codegen.states.AuthState r7 = (com.amplifyframework.statemachine.codegen.states.AuthState) r7
            com.amplifyframework.statemachine.codegen.states.AuthenticationState r6 = r7.getAuthNState()
            boolean r7 = r6 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn
            if (r7 != 0) goto L66
            boolean r7 = r6 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedOut
            if (r7 == 0) goto L51
            goto L66
        L51:
            boolean r6 = r6 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.NotConfigured
            if (r6 == 0) goto L5b
            com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException r6 = new com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException
            r6.<init>()
            throw r6
        L5b:
            com.amplifyframework.auth.exceptions.InvalidStateException r0 = new com.amplifyframework.auth.exceptions.InvalidStateException
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCaseKt.requireSignedInOrSignedOutState(com.amplifyframework.auth.cognito.AuthStateMachine, uw.c):java.lang.Object");
    }
}
