package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ResendSignupCodeUseCase {
    private final InterfaceC0086d client;
    private final AuthEnvironment environment;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCase", m15344f = "ResendSignupCodeUseCase.kt", m15345l = {41, 45, 77}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCase$execute$1 */
    public static final class C11671 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C11671(InterfaceC7559c<? super C11671> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResendSignupCodeUseCase.this.execute(null, null, this);
        }
    }

    public ResendSignupCodeUseCase(InterfaceC0086d client, AuthEnvironment environment, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(environment, "environment");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.environment = environment;
        this.stateMachine = stateMachine;
    }

    public static /* synthetic */ Object execute$default(ResendSignupCodeUseCase resendSignupCodeUseCase, String str, AuthResendSignUpCodeOptions authResendSignUpCodeOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            authResendSignUpCodeOptions = AuthResendSignUpCodeOptions.defaults();
            AbstractC4154l.m8922e(authResendSignUpCodeOptions, "defaults(...)");
        }
        return resendSignupCodeUseCase.execute(str, authResendSignUpCodeOptions, interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x020f, code lost:
    
        if (r1 != r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r20, com.amplifyframework.auth.options.AuthResendSignUpCodeOptions r21, uw.InterfaceC7559c<? super com.amplifyframework.auth.AuthCodeDeliveryDetails> r22) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ResendSignupCodeUseCase.execute(java.lang.String, com.amplifyframework.auth.options.AuthResendSignUpCodeOptions, uw.c):java.lang.Object");
    }

    public final InterfaceC0086d getClient() {
        return this.client;
    }

    public final AuthEnvironment getEnvironment() {
        return this.environment;
    }

    public final AuthStateMachine getStateMachine() {
        return this.stateMachine;
    }
}
