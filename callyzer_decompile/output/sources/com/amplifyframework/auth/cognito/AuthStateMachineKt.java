package com.amplifyframework.auth.cognito;

import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.AuthenticationState;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthStateMachineKt {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AuthStateMachineKt", m15344f = "AuthStateMachine.kt", m15345l = {145}, m15346m = "requireSignedInState")
    /* renamed from: com.amplifyframework.auth.cognito.AuthStateMachineKt$requireSignedInState$1 */
    public static final class C10481 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C10481(InterfaceC7559c<? super C10481> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthStateMachineKt.requireSignedInState(null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.AuthStateMachineKt", m15344f = "AuthStateMachine.kt", m15345l = {153}, m15346m = "throwIfNotConfigured")
    /* renamed from: com.amplifyframework.auth.cognito.AuthStateMachineKt$throwIfNotConfigured$1 */
    public static final class C10491 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C10491(InterfaceC7559c<? super C10491> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthStateMachineKt.throwIfNotConfigured(null, this);
        }
    }

    public static final /* synthetic */ <T extends AuthenticationState> Object requireAuthenticationState(AuthStateMachine authStateMachine, InterfaceC7559c<? super a0> interfaceC7559c) {
        ((AuthState) authStateMachine.getCurrentState(interfaceC7559c)).getAuthNState();
        AbstractC4154l.m8926i();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object requireSignedInState(com.amplifyframework.auth.cognito.AuthStateMachine r7, uw.InterfaceC7559c<? super com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn> r8) {
        /*
            boolean r0 = r8 instanceof com.amplifyframework.auth.cognito.AuthStateMachineKt.C10481
            if (r0 == 0) goto L13
            r0 = r8
            com.amplifyframework.auth.cognito.AuthStateMachineKt$requireSignedInState$1 r0 = (com.amplifyframework.auth.cognito.AuthStateMachineKt.C10481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.AuthStateMachineKt$requireSignedInState$1 r0 = new com.amplifyframework.auth.cognito.AuthStateMachineKt$requireSignedInState$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            com.amplifyframework.auth.cognito.AuthStateMachine r7 = (com.amplifyframework.auth.cognito.AuthStateMachine) r7
            og.od.m10798c(r8)
            goto L42
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            og.od.m10798c(r8)
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = r7.getCurrentState(r0)
            if (r8 != r1) goto L42
            return r1
        L42:
            com.amplifyframework.statemachine.codegen.states.AuthState r8 = (com.amplifyframework.statemachine.codegen.states.AuthState) r8
            com.amplifyframework.statemachine.codegen.states.AuthenticationState r7 = r8.getAuthNState()
            boolean r8 = r7 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn
            if (r8 == 0) goto L4f
            com.amplifyframework.statemachine.codegen.states.AuthenticationState$SignedIn r7 = (com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn) r7
            return r7
        L4f:
            boolean r7 = r7 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedOut
            if (r7 == 0) goto L5e
            com.amplifyframework.auth.exceptions.SignedOutException r0 = new com.amplifyframework.auth.exceptions.SignedOutException
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        L5e:
            com.amplifyframework.auth.exceptions.InvalidStateException r1 = new com.amplifyframework.auth.exceptions.InvalidStateException
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.AuthStateMachineKt.requireSignedInState(com.amplifyframework.auth.cognito.AuthStateMachine, uw.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object throwIfNotConfigured(com.amplifyframework.auth.cognito.AuthStateMachine r4, uw.InterfaceC7559c<? super qw.a0> r5) throws com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            boolean r0 = r5 instanceof com.amplifyframework.auth.cognito.AuthStateMachineKt.C10491
            if (r0 == 0) goto L13
            r0 = r5
            com.amplifyframework.auth.cognito.AuthStateMachineKt$throwIfNotConfigured$1 r0 = (com.amplifyframework.auth.cognito.AuthStateMachineKt.C10491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.AuthStateMachineKt$throwIfNotConfigured$1 r0 = new com.amplifyframework.auth.cognito.AuthStateMachineKt$throwIfNotConfigured$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            com.amplifyframework.auth.cognito.AuthStateMachine r4 = (com.amplifyframework.auth.cognito.AuthStateMachine) r4
            og.od.m10798c(r5)
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            og.od.m10798c(r5)
            r5 = 0
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = r4.getCurrentState(r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            com.amplifyframework.statemachine.codegen.states.AuthState r5 = (com.amplifyframework.statemachine.codegen.states.AuthState) r5
            com.amplifyframework.statemachine.codegen.states.AuthenticationState r4 = r5.getAuthNState()
            boolean r4 = r4 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.NotConfigured
            if (r4 != 0) goto L4f
            qw.a0 r4 = qw.a0.f30746a
            return r4
        L4f:
            com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException r4 = new com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.AuthStateMachineKt.throwIfNotConfigured(com.amplifyframework.auth.cognito.AuthStateMachine, uw.c):java.lang.Object");
    }
}
