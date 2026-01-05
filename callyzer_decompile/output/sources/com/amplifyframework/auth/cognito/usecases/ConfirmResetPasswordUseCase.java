package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ConfirmResetPasswordUseCase {
    private final InterfaceC0086d client;
    private final AuthEnvironment environment;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase", m15344f = "ConfirmResetPasswordUseCase.kt", m15345l = {41, 45, 77}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase$execute$1 */
    public static final class C11521 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C11521(InterfaceC7559c<? super C11521> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmResetPasswordUseCase.this.execute(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase", m15344f = "ConfirmResetPasswordUseCase.kt", m15345l = {68}, m15346m = "throwIfNotConfigured")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase$throwIfNotConfigured$1 */
    public static final class C11531 extends AbstractC8193c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11531(InterfaceC7559c<? super C11531> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmResetPasswordUseCase.this.throwIfNotConfigured(null, this);
        }
    }

    public ConfirmResetPasswordUseCase(InterfaceC0086d client, AuthEnvironment environment, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(environment, "environment");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.environment = environment;
        this.stateMachine = stateMachine;
    }

    public static /* synthetic */ Object execute$default(ConfirmResetPasswordUseCase confirmResetPasswordUseCase, String str, String str2, String str3, AuthConfirmResetPasswordOptions authConfirmResetPasswordOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            authConfirmResetPasswordOptions = AuthConfirmResetPasswordOptions.defaults();
            AbstractC4154l.m8922e(authConfirmResetPasswordOptions, "defaults(...)");
        }
        return confirmResetPasswordUseCase.execute(str, str2, str3, authConfirmResetPasswordOptions, interfaceC7559c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object throwIfNotConfigured(com.amplifyframework.auth.cognito.AuthStateMachine r7, uw.InterfaceC7559c<? super qw.a0> r8) throws com.amplifyframework.auth.exceptions.ConfigurationException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase.C11531
            if (r0 == 0) goto L13
            r0 = r8
            com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase$throwIfNotConfigured$1 r0 = (com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase.C11531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase$throwIfNotConfigured$1 r0 = new com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase$throwIfNotConfigured$1
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
            boolean r7 = r7 instanceof com.amplifyframework.statemachine.codegen.states.AuthenticationState.NotConfigured
            if (r7 != 0) goto L4f
            qw.a0 r7 = qw.a0.f30746a
            return r7
        L4f:
            com.amplifyframework.auth.exceptions.ConfigurationException r0 = new com.amplifyframework.auth.exceptions.ConfigurationException
            r4 = 4
            r5 = 0
            java.lang.String r1 = "Confirm Reset Password failed."
            java.lang.String r2 = "Cognito User Pool not configured. Please check your configuration file."
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase.throwIfNotConfigured(com.amplifyframework.auth.cognito.AuthStateMachine, uw.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0249, code lost:
    
        if (og.kf.m10740e(r12, r11.f332c, r1, r2) != r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r20, java.lang.String r21, java.lang.String r22, com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions r23, uw.InterfaceC7559c<? super qw.a0> r24) {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ConfirmResetPasswordUseCase.execute(java.lang.String, java.lang.String, java.lang.String, com.amplifyframework.auth.options.AuthConfirmResetPasswordOptions, uw.c):java.lang.Object");
    }
}
