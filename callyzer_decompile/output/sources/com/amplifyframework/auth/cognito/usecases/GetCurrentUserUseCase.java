package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AuthStateMachine;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GetCurrentUserUseCase {
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase", m15344f = "GetCurrentUserUseCase.kt", m15345l = {29, 32}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase$execute$1 */
    public static final class C11641 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11641(InterfaceC7559c<? super C11641> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetCurrentUserUseCase.this.execute(this);
        }
    }

    public GetCurrentUserUseCase(FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super com.amplifyframework.auth.AuthUser> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase.C11641
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase.C11641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase$execute$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            com.amplifyframework.statemachine.codegen.states.AuthenticationState$SignedIn r0 = (com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn) r0
            og.od.m10798c(r7)
            goto L5a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            og.od.m10798c(r7)
            goto L48
        L3a:
            og.od.m10798c(r7)
            com.amplifyframework.auth.cognito.AuthStateMachine r7 = r6.stateMachine
            r0.label = r4
            java.lang.Object r7 = com.amplifyframework.auth.cognito.AuthStateMachineKt.requireSignedInState(r7, r0)
            if (r7 != r1) goto L48
            goto L56
        L48:
            com.amplifyframework.statemachine.codegen.states.AuthenticationState$SignedIn r7 = (com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn) r7
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase r2 = r6.fetchAuthSession
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r0 = r2.execute(r0)
            if (r0 != r1) goto L57
        L56:
            return r1
        L57:
            r5 = r0
            r0 = r7
            r7 = r5
        L5a:
            com.amplifyframework.auth.cognito.AWSCognitoAuthSession r7 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r7
            com.amplifyframework.auth.result.AuthSessionResult r7 = r7.getUserPoolTokensResult()
            com.amplifyframework.auth.AuthException r7 = r7.getError()
            boolean r1 = r7 instanceof com.amplifyframework.auth.exceptions.SessionExpiredException
            if (r1 != 0) goto L7e
            com.amplifyframework.auth.AuthUser r7 = new com.amplifyframework.auth.AuthUser
            com.amplifyframework.statemachine.codegen.data.SignedInData r1 = r0.getSignedInData()
            java.lang.String r1 = r1.getUserId()
            com.amplifyframework.statemachine.codegen.data.SignedInData r0 = r0.getSignedInData()
            java.lang.String r0 = r0.getUsername()
            r7.<init>(r1, r0)
            return r7
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.GetCurrentUserUseCase.execute(uw.c):java.lang.Object");
    }
}
