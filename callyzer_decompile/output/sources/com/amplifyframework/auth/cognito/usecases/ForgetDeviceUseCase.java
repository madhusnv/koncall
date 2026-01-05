package com.amplifyframework.auth.cognito.usecases;

import ab.InterfaceC0086d;
import com.amplifyframework.auth.AuthDevice;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.asn1.BERTags;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ForgetDeviceUseCase {
    private final InterfaceC0086d client;
    private final AuthEnvironment environment;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final AuthStateMachine stateMachine;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.ForgetDeviceUseCase", m15344f = "ForgetDeviceUseCase.kt", m15345l = {32, BERTags.OBJECT_IDENTIFIER_IRI, 37, 46}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.ForgetDeviceUseCase$execute$1 */
    public static final class C11631 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C11631(InterfaceC7559c<? super C11631> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ForgetDeviceUseCase.this.execute(null, this);
        }
    }

    public ForgetDeviceUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine, AuthEnvironment environment) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        AbstractC4154l.m8923f(environment, "environment");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
        this.environment = environment;
    }

    public static /* synthetic */ Object execute$default(ForgetDeviceUseCase forgetDeviceUseCase, AuthDevice authDevice, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authDevice = AuthDevice.fromId("");
            AbstractC4154l.m8922e(authDevice, "fromId(...)");
        }
        return forgetDeviceUseCase.execute(authDevice, interfaceC7559c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        if (r1 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01c6, code lost:
    
        if (og.kf.m10740e(r7, r6.f332c, r1, r2) != r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[PHI: r1 r4
      0x00d5: PHI (r1v16 java.lang.Object) = (r1v11 java.lang.Object), (r1v1 java.lang.Object) binds: [B:35:0x00d1, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r4v7 java.lang.String) = (r4v4 java.lang.String), (r4v25 java.lang.String) binds: [B:35:0x00d1, B:17:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(com.amplifyframework.auth.AuthDevice r17, uw.InterfaceC7559c<? super qw.a0> r18) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.ForgetDeviceUseCase.execute(com.amplifyframework.auth.AuthDevice, uw.c):java.lang.Object");
    }
}
