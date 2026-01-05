package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.BERTags;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RememberDeviceUseCase {
    private final InterfaceC0086d client;
    private final AuthEnvironment environment;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.RememberDeviceUseCase", m15344f = "RememberDeviceUseCase.kt", m15345l = {32, BERTags.DATE_TIME, BERTags.DURATION, 44}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.RememberDeviceUseCase$execute$1 */
    public static final class C11661 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11661(InterfaceC7559c<? super C11661> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RememberDeviceUseCase.this.execute(this);
        }
    }

    public RememberDeviceUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine, AuthEnvironment environment) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        AbstractC4154l.m8923f(environment, "environment");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
        this.environment = environment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a0, code lost:
    
        if (og.kf.m10740e(r7, r6.f332c, r1, r2) != r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8 A[PHI: r1 r4
      0x00a8: PHI (r1v14 java.lang.Object) = (r1v12 java.lang.Object), (r1v1 java.lang.Object) binds: [B:31:0x00a4, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v19 java.lang.String) binds: [B:31:0x00a4, B:17:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(uw.InterfaceC7559c<? super qw.a0> r17) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.RememberDeviceUseCase.execute(uw.c):java.lang.Object");
    }
}
