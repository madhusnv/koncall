package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.options.AuthResetPasswordOptions;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ResetPasswordUseCase {
    private final InterfaceC0086d client;
    private final AuthEnvironment environment;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase", m15344f = "ResetPasswordUseCase.kt", m15345l = {46, 75}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase$execute$1 */
    public static final class C11701 extends AbstractC8193c {
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

        public C11701(InterfaceC7559c<? super C11701> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResetPasswordUseCase.this.execute(null, null, this);
        }
    }

    public ResetPasswordUseCase(InterfaceC0086d client, AuthEnvironment environment) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(environment, "environment");
        this.client = client;
        this.environment = environment;
    }

    public static /* synthetic */ Object execute$default(ResetPasswordUseCase resetPasswordUseCase, String str, AuthResetPasswordOptions authResetPasswordOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            authResetPasswordOptions = AuthResetPasswordOptions.defaults();
            AbstractC4154l.m8922e(authResetPasswordOptions, "defaults(...)");
        }
        return resetPasswordUseCase.execute(str, authResetPasswordOptions, interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0202, code lost:
    
        if (r3 == r5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r23, com.amplifyframework.auth.options.AuthResetPasswordOptions r24, uw.InterfaceC7559c<? super com.amplifyframework.auth.result.AuthResetPasswordResult> r25) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ResetPasswordUseCase.execute(java.lang.String, com.amplifyframework.auth.options.AuthResetPasswordOptions, uw.c):java.lang.Object");
    }
}
