package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ConfirmSignUpUseCase {
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ConfirmSignUpUseCase", m15344f = "ConfirmSignUpUseCase.kt", m15345l = {37, 39, 67}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ConfirmSignUpUseCase$execute$1 */
    public static final class C11541 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11541(InterfaceC7559c<? super C11541> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmSignUpUseCase.this.execute(null, null, null, this);
        }
    }

    public ConfirmSignUpUseCase(AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.stateMachine = stateMachine;
    }

    public static /* synthetic */ Object execute$default(ConfirmSignUpUseCase confirmSignUpUseCase, String str, String str2, AuthConfirmSignUpOptions authConfirmSignUpOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            authConfirmSignUpOptions = AuthConfirmSignUpOptions.defaults();
            AbstractC4154l.m8922e(authConfirmSignUpOptions, "defaults(...)");
        }
        return confirmSignUpUseCase.execute(str, str2, authConfirmSignUpOptions, interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r15 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r12, java.lang.String r13, com.amplifyframework.auth.options.AuthConfirmSignUpOptions r14, uw.InterfaceC7559c<? super com.amplifyframework.auth.result.AuthSignUpResult> r15) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ConfirmSignUpUseCase.execute(java.lang.String, java.lang.String, com.amplifyframework.auth.options.AuthConfirmSignUpOptions, uw.c):java.lang.Object");
    }
}
