package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin;
import kotlin.jvm.internal.AbstractC4154l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FetchAuthSessionUseCase {
    private final RealAWSCognitoAuthPlugin plugin;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase", m15344f = "FetchAuthSessionUseCase.kt", m15345l = {29}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$1 */
    public static final class C11591 extends AbstractC8193c {
        int label;
        /* synthetic */ Object result;

        public C11591(InterfaceC7559c<? super C11591> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchAuthSessionUseCase.this.execute(this);
        }
    }

    public FetchAuthSessionUseCase(RealAWSCognitoAuthPlugin plugin) {
        AbstractC4154l.m8923f(plugin, "plugin");
        this.plugin = plugin;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super com.amplifyframework.auth.cognito.AWSCognitoAuthSession> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase.C11591
            if (r0 == 0) goto L13
            r0 = r5
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$1 r0 = (com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase.C11591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$1 r0 = new com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r5)
            goto L53
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            og.od.m10798c(r5)
            r0.label = r3
            uw.j r5 = new uw.j
            uw.c r0 = pg.n6.m11797c(r0)
            r5.<init>(r0)
            com.amplifyframework.auth.cognito.RealAWSCognitoAuthPlugin r0 = r4.plugin
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$session$1$1 r2 = new com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$session$1$1
            r2.<init>()
            com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$session$1$2 r3 = new com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase$execute$session$1$2
            r3.<init>()
            r0.fetchAuthSession(r2, r3)
            java.lang.Object r5 = r5.m14303a()
            if (r5 != r1) goto L53
            return r1
        L53:
            java.lang.String r0 = "suspendCoroutine(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r5, r0)
            com.amplifyframework.auth.AuthSession r5 = (com.amplifyframework.auth.AuthSession) r5
            com.amplifyframework.auth.cognito.AWSCognitoAuthSession r5 = (com.amplifyframework.auth.cognito.AWSCognitoAuthSession) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.FetchAuthSessionUseCase.execute(uw.c):java.lang.Object");
    }
}
