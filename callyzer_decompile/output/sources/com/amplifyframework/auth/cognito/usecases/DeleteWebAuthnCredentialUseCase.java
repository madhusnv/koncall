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
public final class DeleteWebAuthnCredentialUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.DeleteWebAuthnCredentialUseCase", m15344f = "DeleteWebAuthnCredentialUseCase.kt", m15345l = {32, BERTags.DURATION, 42}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.DeleteWebAuthnCredentialUseCase$execute$1 */
    public static final class C11581 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11581(InterfaceC7559c<? super C11581> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeleteWebAuthnCredentialUseCase.this.execute(null, null, this);
        }
    }

    public DeleteWebAuthnCredentialUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0179, code lost:
    
        if (og.kf.m10740e(r7, r6.f332c, r1, r2) != r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(java.lang.String r17, com.amplifyframework.auth.options.AuthDeleteWebAuthnCredentialOptions r18, uw.InterfaceC7559c<? super qw.a0> r19) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.DeleteWebAuthnCredentialUseCase.execute(java.lang.String, com.amplifyframework.auth.options.AuthDeleteWebAuthnCredentialOptions, uw.c):java.lang.Object");
    }
}
