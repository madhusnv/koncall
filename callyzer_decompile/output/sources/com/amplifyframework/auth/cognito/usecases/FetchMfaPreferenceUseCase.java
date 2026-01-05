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
public final class FetchMfaPreferenceUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase", m15344f = "FetchMfaPreferenceUseCase.kt", m15345l = {32, BERTags.DATE_TIME, 44}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase$execute$1 */
    public static final class C11611 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11611(InterfaceC7559c<? super C11611> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchMfaPreferenceUseCase.this.execute(this);
        }
    }

    public FetchMfaPreferenceUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super com.amplifyframework.auth.cognito.UserMFAPreference> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase.C11611
            if (r0 == 0) goto L13
            r0 = r9
            com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase.C11611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase$execute$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r6) goto L43
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r1 = r0.L$1
            ab.d r1 = (ab.InterfaceC0086d) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            og.od.m10798c(r9)
            goto L85
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3f:
            og.od.m10798c(r9)
            goto L60
        L43:
            og.od.m10798c(r9)
            goto L55
        L47:
            og.od.m10798c(r9)
            com.amplifyframework.auth.cognito.AuthStateMachine r9 = r8.stateMachine
            r0.label = r6
            java.lang.Object r9 = com.amplifyframework.auth.cognito.AuthStateMachineKt.requireSignedInState(r9, r0)
            if (r9 != r1) goto L55
            goto L84
        L55:
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase r9 = r8.fetchAuthSession
            r0.label = r5
            java.lang.Object r9 = r9.execute(r0)
            if (r9 != r1) goto L60
            goto L84
        L60:
            com.amplifyframework.auth.cognito.AWSCognitoAuthSession r9 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r9
            java.lang.String r9 = com.amplifyframework.auth.cognito.AWSCognitoAuthSessionKt.requireAccessToken(r9)
            ab.d r2 = r8.client
            eb.w0 r5 = new eb.w0
            r5.<init>()
            r5.f9503a = r9
            eb.y1 r9 = new eb.y1
            r9.<init>(r5)
            r0.L$0 = r7
            r0.L$1 = r7
            r0.I$0 = r3
            r0.label = r4
            ab.e r2 = (ab.C0087e) r2
            java.lang.Object r9 = r2.m259w(r9, r0)
            if (r9 != r1) goto L85
        L84:
            return r1
        L85:
            eb.z1 r9 = (eb.z1) r9
            java.util.ArrayList r0 = r9.f9529d
            if (r0 == 0) goto Lb1
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = rw.AbstractC6664n.m12768r(r0, r2)
            r1.<init>(r2)
            int r2 = r0.size()
        L9a:
            if (r3 >= r2) goto Lac
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            java.lang.String r4 = (java.lang.String) r4
            com.amplifyframework.auth.MFAType r4 = com.amplifyframework.auth.cognito.helpers.MFAHelperKt.getMFAType(r4)
            r1.add(r4)
            goto L9a
        Lac:
            java.util.Set r0 = rw.AbstractC6663m.g0(r1)
            goto Lb2
        Lb1:
            r0 = r7
        Lb2:
            java.lang.String r9 = r9.f9527b
            if (r9 == 0) goto Lba
            com.amplifyframework.auth.MFAType r7 = com.amplifyframework.auth.cognito.helpers.MFAHelperKt.getMFAType(r9)
        Lba:
            com.amplifyframework.auth.cognito.UserMFAPreference r9 = new com.amplifyframework.auth.cognito.UserMFAPreference
            r9.<init>(r0, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.FetchMfaPreferenceUseCase.execute(uw.c):java.lang.Object");
    }
}
