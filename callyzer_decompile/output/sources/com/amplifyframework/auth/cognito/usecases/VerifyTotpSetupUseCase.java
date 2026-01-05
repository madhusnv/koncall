package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class VerifyTotpSetupUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.VerifyTotpSetupUseCase", m15344f = "VerifyTotpSetupUseCase.kt", m15345l = {39, 41, 58}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.VerifyTotpSetupUseCase$execute$1 */
    public static final class C11771 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C11771(InterfaceC7559c<? super C11771> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VerifyTotpSetupUseCase.this.execute(null, null, this);
        }
    }

    public VerifyTotpSetupUseCase(FetchAuthSessionUseCase fetchAuthSession, InterfaceC0086d client, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.fetchAuthSession = fetchAuthSession;
        this.client = client;
        this.stateMachine = stateMachine;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        if (r11 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r9, com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions r10, uw.InterfaceC7559c<? super qw.a0> r11) throws com.amplifyframework.auth.exceptions.ServiceException, com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.VerifyTotpSetupUseCase.execute(java.lang.String, com.amplifyframework.auth.options.AuthVerifyTOTPSetupOptions, uw.c):java.lang.Object");
    }
}
