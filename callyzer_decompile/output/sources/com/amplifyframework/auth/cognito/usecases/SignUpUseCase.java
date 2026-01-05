package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AuthStateMachine;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.BERTags;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SignUpUseCase {
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.SignUpUseCase", m15344f = "SignUpUseCase.kt", m15345l = {BERTags.DATE_TIME, 58}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$1 */
    public static final class C11721 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11721(InterfaceC7559c<? super C11721> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SignUpUseCase.this.execute(null, null, null, this);
        }
    }

    public SignUpUseCase(AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.stateMachine = stateMachine;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r12, java.lang.String r13, com.amplifyframework.auth.options.AuthSignUpOptions r14, uw.InterfaceC7559c<? super com.amplifyframework.auth.result.AuthSignUpResult> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.amplifyframework.auth.cognito.usecases.SignUpUseCase.C11721
            if (r0 == 0) goto L13
            r0 = r15
            com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.SignUpUseCase.C11721) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$1
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            java.lang.Object r12 = r0.L$3
            com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions r12 = (com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions) r12
            java.lang.Object r12 = r0.L$2
            com.amplifyframework.auth.options.AuthSignUpOptions r12 = (com.amplifyframework.auth.options.AuthSignUpOptions) r12
            java.lang.Object r12 = r0.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            og.od.m10798c(r15)
            goto La9
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            java.lang.Object r12 = r0.L$2
            r14 = r12
            com.amplifyframework.auth.options.AuthSignUpOptions r14 = (com.amplifyframework.auth.options.AuthSignUpOptions) r14
            java.lang.Object r12 = r0.L$1
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r12 = r0.L$0
            java.lang.String r12 = (java.lang.String) r12
            og.od.m10798c(r15)
        L54:
            r6 = r12
            r7 = r13
            r8 = r14
            goto L6c
        L58:
            og.od.m10798c(r15)
            com.amplifyframework.auth.cognito.AuthStateMachine r15 = r11.stateMachine
            r0.L$0 = r12
            r0.L$1 = r13
            r0.L$2 = r14
            r0.label = r4
            java.lang.Object r15 = com.amplifyframework.auth.cognito.AuthStateMachineKt.throwIfNotConfigured(r15, r0)
            if (r15 != r1) goto L54
            goto La8
        L6c:
            boolean r12 = r8 instanceof com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions
            r13 = 0
            if (r12 == 0) goto L76
            r12 = r8
            com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions r12 = (com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions) r12
            r5 = r12
            goto L77
        L76:
            r5 = r13
        L77:
            com.amplifyframework.auth.cognito.AuthStateMachine r12 = r11.stateMachine
            wx.j r12 = r12.getStateTransitions()
            com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$result$1 r4 = new com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$result$1
            r10 = 0
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            wx.t r14 = new wx.t
            r14.<init>(r4, r12)
            com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$result$2 r12 = new com.amplifyframework.auth.cognito.usecases.SignUpUseCase$execute$result$2
            r12.<init>(r13)
            o6.s0 r15 = new o6.s0
            r15.<init>(r14, r12, r13)
            f9.e r12 = new f9.e
            r12.<init>(r15)
            r0.L$0 = r13
            r0.L$1 = r13
            r0.L$2 = r13
            r0.L$3 = r13
            r0.label = r3
            java.lang.Object r15 = wx.c1.m15385p(r12, r0)
            if (r15 != r1) goto La9
        La8:
            return r1
        La9:
            com.amplifyframework.auth.result.AuthSignUpResult r15 = (com.amplifyframework.auth.result.AuthSignUpResult) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.SignUpUseCase.execute(java.lang.String, java.lang.String, com.amplifyframework.auth.options.AuthSignUpOptions, uw.c):java.lang.Object");
    }
}
