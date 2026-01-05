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
public final class FetchUserAttributesUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase", m15344f = "FetchUserAttributesUseCase.kt", m15345l = {BERTags.DATE, 32, 38}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase$execute$1 */
    public static final class C11621 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11621(InterfaceC7559c<? super C11621> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchUserAttributesUseCase.this.execute(this);
        }
    }

    public FetchUserAttributesUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super java.util.List<com.amplifyframework.auth.AuthUserAttribute>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase.C11621
            if (r0 == 0) goto L13
            r0 = r7
            com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase.C11621) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase$execute$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.L$1
            ab.d r1 = (ab.InterfaceC0086d) r1
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            og.od.m10798c(r7)
            goto L85
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            og.od.m10798c(r7)
            goto L5e
        L41:
            og.od.m10798c(r7)
            goto L53
        L45:
            og.od.m10798c(r7)
            com.amplifyframework.auth.cognito.AuthStateMachine r7 = r6.stateMachine
            r0.label = r5
            java.lang.Object r7 = com.amplifyframework.auth.cognito.AuthStateMachineKt.requireSignedInState(r7, r0)
            if (r7 != r1) goto L53
            goto L84
        L53:
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase r7 = r6.fetchAuthSession
            r0.label = r4
            java.lang.Object r7 = r7.execute(r0)
            if (r7 != r1) goto L5e
            goto L84
        L5e:
            com.amplifyframework.auth.cognito.AWSCognitoAuthSession r7 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r7
            java.lang.String r7 = r7.getAccessToken()
            ab.d r2 = r6.client
            eb.w0 r4 = new eb.w0
            r4.<init>()
            r4.f9503a = r7
            eb.y1 r7 = new eb.y1
            r7.<init>(r4)
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r4 = 0
            r0.I$0 = r4
            r0.label = r3
            ab.e r2 = (ab.C0087e) r2
            java.lang.Object r7 = r2.m259w(r7, r0)
            if (r7 != r1) goto L85
        L84:
            return r1
        L85:
            eb.z1 r7 = (eb.z1) r7
            java.lang.Object r7 = r7.f9528c
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = rw.AbstractC6664n.m12768r(r7, r1)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L98:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r7.next()
            eb.h r1 = (eb.C1984h) r1
            com.amplifyframework.auth.AuthUserAttribute r2 = new com.amplifyframework.auth.AuthUserAttribute
            java.lang.String r3 = r1.f9321a
            com.amplifyframework.auth.AuthUserAttributeKey r3 = com.amplifyframework.auth.AuthUserAttributeKey.custom(r3)
            java.lang.String r1 = r1.f9322b
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L98
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.FetchUserAttributesUseCase.execute(uw.c):java.lang.Object");
    }
}
