package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.BERTags;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SetupTotpUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase", m15344f = "SetupTotpUseCase.kt", m15345l = {BERTags.DURATION, BERTags.RELATIVE_OID_IRI, 54}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase$execute$1 */
    public static final class C11711 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11711(InterfaceC7559c<? super C11711> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTotpUseCase.this.execute(this);
        }
    }

    public SetupTotpUseCase(FetchAuthSessionUseCase fetchAuthSession, InterfaceC0086d client, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.fetchAuthSession = fetchAuthSession;
        this.client = client;
        this.stateMachine = stateMachine;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super com.amplifyframework.auth.TOTPSetupDetails> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase.C11711
            if (r0 == 0) goto L13
            r0 = r10
            com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase.C11711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase$execute$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L49
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r1 = r0.L$2
            ab.d r1 = (ab.InterfaceC0086d) r1
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.amplifyframework.statemachine.codegen.states.AuthenticationState$SignedIn r0 = (com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn) r0
            og.od.m10798c(r10)
            goto L97
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L41:
            java.lang.Object r2 = r0.L$0
            com.amplifyframework.statemachine.codegen.states.AuthenticationState$SignedIn r2 = (com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn) r2
            og.od.m10798c(r10)
            goto L6d
        L49:
            og.od.m10798c(r10)
            goto L5b
        L4d:
            og.od.m10798c(r10)
            com.amplifyframework.auth.cognito.AuthStateMachine r10 = r9.stateMachine
            r0.label = r5
            java.lang.Object r10 = com.amplifyframework.auth.cognito.AuthStateMachineKt.requireSignedInState(r10, r0)
            if (r10 != r1) goto L5b
            goto L95
        L5b:
            com.amplifyframework.statemachine.codegen.states.AuthenticationState$SignedIn r10 = (com.amplifyframework.statemachine.codegen.states.AuthenticationState.SignedIn) r10
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase r2 = r9.fetchAuthSession
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r2 = r2.execute(r0)
            if (r2 != r1) goto L6a
            goto L95
        L6a:
            r8 = r2
            r2 = r10
            r10 = r8
        L6d:
            com.amplifyframework.auth.cognito.AWSCognitoAuthSession r10 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r10
            java.lang.String r10 = com.amplifyframework.auth.cognito.AWSCognitoAuthSessionKt.requireAccessToken(r10)
            ab.d r4 = r9.client
            eb.c r5 = new eb.c
            r5.<init>()
            r5.f9280a = r10
            eb.d r10 = new eb.d
            r10.<init>(r5)
            r0.L$0 = r2
            r5 = 0
            r0.L$1 = r5
            r0.L$2 = r5
            r5 = 0
            r0.I$0 = r5
            r0.label = r3
            ab.e r4 = (ab.C0087e) r4
            java.lang.Object r10 = r4.m255h(r10, r0)
            if (r10 != r1) goto L96
        L95:
            return r1
        L96:
            r0 = r2
        L97:
            eb.f r10 = (eb.C1982f) r10
            java.lang.String r10 = r10.f9307a
            if (r10 == 0) goto Lab
            com.amplifyframework.auth.TOTPSetupDetails r1 = new com.amplifyframework.auth.TOTPSetupDetails
            com.amplifyframework.statemachine.codegen.data.SignedInData r0 = r0.getSignedInData()
            java.lang.String r0 = r0.getUsername()
            r1.<init>(r10, r0)
            return r1
        Lab:
            com.amplifyframework.auth.AuthException r2 = new com.amplifyframework.auth.AuthException
            r6 = 4
            r7 = 0
            java.lang.String r3 = "Shared secret missing from response"
            java.lang.String r4 = "There is a possibility that there is a bug if this error persists. Please take a look at \nhttps://github.com/aws-amplify/amplify-android/issues to see if there are any existing issues that \nmatch your scenario, and file an issue with the details of the bug if there isn't."
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.SetupTotpUseCase.execute(uw.c):java.lang.Object");
    }
}
