package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.crypto.agreement.jpake.JPAKEParticipant;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ResendUserAttributeConfirmationUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ResendUserAttributeConfirmationUseCase", m15344f = "ResendUserAttributeConfirmationUseCase.kt", m15345l = {JPAKEParticipant.STATE_ROUND_2_VALIDATED, 42, 55}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ResendUserAttributeConfirmationUseCase$execute$1 */
    public static final class C11691 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C11691(InterfaceC7559c<? super C11691> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResendUserAttributeConfirmationUseCase.this.execute(null, null, this);
        }
    }

    public ResendUserAttributeConfirmationUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
    }

    public static /* synthetic */ Object execute$default(ResendUserAttributeConfirmationUseCase resendUserAttributeConfirmationUseCase, AuthUserAttributeKey authUserAttributeKey, AuthResendUserAttributeConfirmationCodeOptions authResendUserAttributeConfirmationCodeOptions, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            authResendUserAttributeConfirmationCodeOptions = AuthResendUserAttributeConfirmationCodeOptions.defaults();
            AbstractC4154l.m8922e(authResendUserAttributeConfirmationCodeOptions, "defaults(...)");
        }
        return resendUserAttributeConfirmationUseCase.execute(authUserAttributeKey, authResendUserAttributeConfirmationCodeOptions, interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a4, code lost:
    
        if (r1 != r3) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.amplifyframework.auth.AuthUserAttributeKey r19, com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions r20, uw.InterfaceC7559c<? super com.amplifyframework.auth.AuthCodeDeliveryDetails> r21) throws com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException, com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ResendUserAttributeConfirmationUseCase.execute(com.amplifyframework.auth.AuthUserAttributeKey, com.amplifyframework.auth.options.AuthResendUserAttributeConfirmationCodeOptions, uw.c):java.lang.Object");
    }
}
