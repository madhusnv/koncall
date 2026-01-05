package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.exceptions.InvalidStateException;
import com.amplifyframework.auth.plugins.core.AuthHubEventEmitter;
import com.amplifyframework.statemachine.codegen.data.SignUpData;
import com.amplifyframework.statemachine.codegen.states.AuthState;
import com.amplifyframework.statemachine.codegen.states.SignUpState;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AutoSignInUseCase {
    private final AuthHubEventEmitter hubEmitter;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase", m15344f = "AutoSignInUseCase.kt", m15345l = {123}, m15346m = "completeAutoSignIn")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$1 */
    public static final class C11491 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11491(InterfaceC7559c<? super C11491> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutoSignInUseCase.this.completeAutoSignIn(null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase", m15344f = "AutoSignInUseCase.kt", m15345l = {45, 47}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$execute$1 */
    public static final class C11501 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11501(InterfaceC7559c<? super C11501> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutoSignInUseCase.this.execute(this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase", m15344f = "AutoSignInUseCase.kt", m15345l = {JPAKEParticipant.STATE_ROUND_3_VALIDATED}, m15346m = "waitForSignedOutState")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$waitForSignedOutState$1 */
    public static final class C11511 extends AbstractC8193c {
        int label;
        /* synthetic */ Object result;

        public C11511(InterfaceC7559c<? super C11511> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AutoSignInUseCase.this.waitForSignedOutState(this);
        }
    }

    public AutoSignInUseCase(AuthStateMachine stateMachine, AuthHubEventEmitter hubEmitter) {
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        AbstractC4154l.m8923f(hubEmitter, "hubEmitter");
        this.stateMachine = stateMachine;
        this.hubEmitter = hubEmitter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object completeAutoSignIn(com.amplifyframework.statemachine.codegen.data.SignUpData r7, uw.InterfaceC7559c<? super com.amplifyframework.auth.result.AuthSignInResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.C11491
            if (r0 == 0) goto L13
            r0 = r8
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$1 r0 = (com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.C11491) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$1 r0 = new com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.L$1
            com.amplifyframework.statemachine.codegen.data.SignInData$AutoSignInData r7 = (com.amplifyframework.statemachine.codegen.data.SignInData.AutoSignInData) r7
            java.lang.Object r7 = r0.L$0
            com.amplifyframework.statemachine.codegen.data.SignUpData r7 = (com.amplifyframework.statemachine.codegen.data.SignUpData) r7
            og.od.m10798c(r8)
            goto L76
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            og.od.m10798c(r8)
            com.amplifyframework.statemachine.codegen.data.SignInData$AutoSignInData r8 = new com.amplifyframework.statemachine.codegen.data.SignInData$AutoSignInData
            java.lang.String r2 = r7.getUsername()
            java.lang.String r4 = r7.getSession()
            java.util.Map r5 = r7.getClientMetadata()
            if (r5 != 0) goto L4c
            rw.s r5 = rw.C6669s.f31944a
        L4c:
            java.lang.String r7 = r7.getUserId()
            r8.<init>(r2, r4, r5, r7)
            com.amplifyframework.auth.cognito.AuthStateMachine r7 = r6.stateMachine
            wx.j r7 = r7.getStateTransitions()
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$result$1 r2 = new com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$result$1
            r4 = 0
            r2.<init>(r8, r6, r4)
            wx.t r8 = new wx.t
            r8.<init>(r2, r7)
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$$inlined$mapNotNull$1 r7 = new com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$completeAutoSignIn$$inlined$mapNotNull$1
            r7.<init>()
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r8 = wx.c1.m15385p(r7, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            com.amplifyframework.auth.result.AuthSignInResult r8 = (com.amplifyframework.auth.result.AuthSignInResult) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.completeAutoSignIn(com.amplifyframework.statemachine.codegen.data.SignUpData, uw.c):java.lang.Object");
    }

    private final SignUpData getSignUpData(AuthState authState) throws InvalidStateException {
        SignUpState authSignUpState = authState.getAuthSignUpState();
        if (authSignUpState instanceof SignUpState.SignedUp) {
            return ((SignUpState.SignedUp) authSignUpState).getSignUpData();
        }
        throw new InvalidStateException(null, null, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForSignedOutState(uw.InterfaceC7559c<? super com.amplifyframework.statemachine.codegen.states.AuthState> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.C11511
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$waitForSignedOutState$1 r0 = (com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.C11511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$waitForSignedOutState$1 r0 = new com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$waitForSignedOutState$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)
            goto L51
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            og.od.m10798c(r7)
            com.amplifyframework.auth.cognito.AuthStateMachine r7 = r6.stateMachine
            wx.k1 r7 = r7.getState()
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$waitForSignedOutState$authState$1 r2 = new com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$waitForSignedOutState$authState$1
            r4 = 0
            r2.<init>(r6, r4)
            o6.s0 r5 = new o6.s0
            r5.<init>(r7, r2, r4)
            f9.e r7 = new f9.e
            r7.<init>(r5)
            r0.label = r3
            java.lang.Object r7 = wx.c1.m15385p(r7, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            com.amplifyframework.statemachine.codegen.states.AuthState r7 = (com.amplifyframework.statemachine.codegen.states.AuthState) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.waitForSignedOutState(uw.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super com.amplifyframework.auth.result.AuthSignInResult> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.C11501
            if (r0 == 0) goto L13
            r0 = r6
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.C11501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase$execute$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            com.amplifyframework.statemachine.codegen.data.SignUpData r1 = (com.amplifyframework.statemachine.codegen.data.SignUpData) r1
            java.lang.Object r0 = r0.L$0
            com.amplifyframework.statemachine.codegen.states.AuthState r0 = (com.amplifyframework.statemachine.codegen.states.AuthState) r0
            og.od.m10798c(r6)
            goto L5e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            og.od.m10798c(r6)
            goto L4a
        L3e:
            og.od.m10798c(r6)
            r0.label = r4
            java.lang.Object r6 = r5.waitForSignedOutState(r0)
            if (r6 != r1) goto L4a
            goto L5d
        L4a:
            com.amplifyframework.statemachine.codegen.states.AuthState r6 = (com.amplifyframework.statemachine.codegen.states.AuthState) r6
            com.amplifyframework.statemachine.codegen.data.SignUpData r6 = r5.getSignUpData(r6)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r5.completeAutoSignIn(r6, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            com.amplifyframework.auth.result.AuthSignInResult r6 = (com.amplifyframework.auth.result.AuthSignInResult) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.AutoSignInUseCase.execute(uw.c):java.lang.Object");
    }

    public /* synthetic */ AutoSignInUseCase(AuthStateMachine authStateMachine, AuthHubEventEmitter authHubEventEmitter, int i10, AbstractC4148f abstractC4148f) {
        this(authStateMachine, (i10 & 2) != 0 ? new AuthHubEventEmitter() : authHubEventEmitter);
    }
}
