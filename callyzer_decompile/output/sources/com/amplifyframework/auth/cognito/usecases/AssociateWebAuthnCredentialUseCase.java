package com.amplifyframework.auth.cognito.usecases;

import a2.AbstractC0030c;
import a9.C0073l;
import ab.C0085c;
import ab.C0087e;
import ab.InterfaceC0086d;
import ba.C0631a;
import bb.C0640a;
import bd.C0645a;
import c9.C0917l;
import cd.C0959n;
import cj.C0979e;
import com.amplifyframework.auth.cognito.AuthStateMachine;
import com.amplifyframework.auth.cognito.helpers.AuthLogger;
import com.amplifyframework.auth.cognito.helpers.WebAuthnHelper;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.DocumentExtensionsKt;
import eb.m0;
import eb.n0;
import ec.C2005c;
import ec.C2011i;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4147e;
import l1.C4327p;
import l7.C4417q;
import ld.C4446f;
import ld.InterfaceC4447g;
import lv.C4535g;
import ng.C5070u;
import oa.C5331c;
import og.kf;
import og.ud;
import pa.EnumC5867a;
import qd.EnumC6183c;
import qw.a0;
import sc.C6797q;
import sc.C6801u;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.InterfaceC8195e;
import yb.AbstractC8610b;
import zb.AbstractC8923q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AssociateWebAuthnCredentialUseCase {
    private final InterfaceC0086d client;
    private final FetchAuthSessionUseCase fetchAuthSession;
    private final Logger logger;
    private final AuthStateMachine stateMachine;
    private final WebAuthnHelper webAuthnHelper;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase", m15344f = "AssociateWebAuthnCredentialUseCase.kt", m15345l = {42, 44, 47, 51, 55}, m15346m = "execute")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase$execute$1 */
    public static final class C11461 extends AbstractC8193c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C11461(InterfaceC7559c<? super C11461> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssociateWebAuthnCredentialUseCase.this.execute(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase", m15344f = "AssociateWebAuthnCredentialUseCase.kt", m15345l = {73}, m15346m = "getCredentialRequestJson")
    /* renamed from: com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase$getCredentialRequestJson$1 */
    public static final class C11471 extends AbstractC8193c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11471(InterfaceC7559c<? super C11471> interfaceC7559c) {
            super(interfaceC7559c);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssociateWebAuthnCredentialUseCase.this.getCredentialRequestJson(null, this);
        }
    }

    public AssociateWebAuthnCredentialUseCase(InterfaceC0086d client, FetchAuthSessionUseCase fetchAuthSession, AuthStateMachine stateMachine, WebAuthnHelper webAuthnHelper) {
        AbstractC4154l.m8923f(client, "client");
        AbstractC4154l.m8923f(fetchAuthSession, "fetchAuthSession");
        AbstractC4154l.m8923f(stateMachine, "stateMachine");
        AbstractC4154l.m8923f(webAuthnHelper, "webAuthnHelper");
        this.client = client;
        this.fetchAuthSession = fetchAuthSession;
        this.stateMachine = stateMachine;
        this.webAuthnHelper = webAuthnHelper;
        this.logger = AuthLogger.authLogger(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object associateCredential(String str, String str2, InterfaceC7559c<? super a0> interfaceC7559c) {
        InterfaceC0086d interfaceC0086d = this.client;
        C0917l c0917l = new C0917l(3, false);
        c0917l.f5595c = DocumentExtensionsKt.JsonDocument(str);
        c0917l.f5594b = str2;
        m0 m0Var = new m0(c0917l);
        C0087e c0087e = (C0087e) interfaceC0086d;
        c0087e.getClass();
        C4147e c4147eM8901a = kotlin.jvm.internal.a0.m8901a(m0.class);
        C4147e c4147eM8901a2 = kotlin.jvm.internal.a0.m8901a(n0.class);
        C0073l c0073l = new C0073l();
        InterfaceC4447g.f22179a.getClass();
        c0073l.f264a = C4446f.f22178b;
        c0073l.f265b = EnumC6183c.CLIENT;
        c0073l.f266c = C2011i.f9543a;
        c0073l.f267d = C6801u.f32317n;
        C4535g c4535g = new C4535g();
        C0645a c0645a = new C0645a();
        C5070u c5070u = new C5070u(9);
        C0631a c0631a = new C0631a(4);
        C0085c c0085c = c0087e.f330a;
        c0073l.m202L(c0085c.f325m);
        c0073l.f268e = c0087e.f336g;
        c0073l.m201K(c0087e.f337h);
        C2005c c2005cM10980f = ud.m10980f();
        i0.m0.m7365B("rpc.system", c2005cM10980f, "aws-api");
        c0073l.f266c = c2005cM10980f;
        c4535g.f22542f = new C6797q(c0087e.f335f, c0087e.f334e, c0087e.f333d);
        c4535g.f22543g = new C0640a(c0085c, 1);
        c4535g.m9393k((C0959n) c0085c.f315b.f36778a);
        c4535g.m9392j(c0085c.f324l);
        c0645a.mo1862b(AbstractC8923q.f42882a, "CompleteWebAuthnRegistration");
        C0979e c0979e = new C0979e(c4535g, c0645a, c5070u, c0631a, i0.m0.m7390w(c0645a, AbstractC8923q.f42883b, "Cognito Identity Provider", c4147eM8901a, c4147eM8901a2), c0073l);
        AbstractC0030c.m129t(c0087e, c0645a, c0979e);
        ArrayList arrayList = (ArrayList) c0979e.f5808g;
        i0.m0.m7366C(arrayList, C5331c.f26228a);
        if (c0085c.f319f instanceof i9.n0) {
            AbstractC8610b.m15956b(c0645a, EnumC5867a.a.CREDENTIALS_CODE);
        }
        new C4417q("AWSCognitoIdentityProviderService", 1).m9235c(c0979e);
        i0.m0.m7367D(new C4327p(c0087e.f338j), c0979e, c0979e);
        arrayList.addAll(c0085c.f322j);
        Object objM10740e = kf.m10740e(c0979e, c0087e.f332c, m0Var, interfaceC7559c);
        return objM10740e == EnumC7794a.COROUTINE_SUSPENDED ? objM10740e : a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCredentialRequestJson(java.lang.String r17, uw.InterfaceC7559c<? super java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase.getCredentialRequestJson(java.lang.String, uw.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x011b, code lost:
    
        if (associateCredential(r12, r10, r11) != r0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6 A[PHI: r1 r10 r12
      0x00c6: PHI (r1v2 android.app.Activity) = (r1v1 android.app.Activity), (r1v7 android.app.Activity) binds: [B:30:0x00c3, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v17 java.lang.String) binds: [B:30:0x00c3, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r12v9 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:30:0x00c3, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2 A[PHI: r10 r12
      0x00f2: PHI (r10v5 java.lang.String) = (r10v4 java.lang.String), (r10v21 java.lang.String) binds: [B:33:0x00ef, B:18:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r12v12 java.lang.Object) = (r12v11 java.lang.Object), (r12v1 java.lang.Object) binds: [B:33:0x00ef, B:18:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(android.app.Activity r10, com.amplifyframework.auth.options.AuthAssociateWebAuthnCredentialsOptions r11, uw.InterfaceC7559c<? super qw.a0> r12) throws com.amplifyframework.auth.AuthException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplifyframework.auth.cognito.usecases.AssociateWebAuthnCredentialUseCase.execute(android.app.Activity, com.amplifyframework.auth.options.AuthAssociateWebAuthnCredentialsOptions, uw.c):java.lang.Object");
    }
}
