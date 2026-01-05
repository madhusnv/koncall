package i9;

import nc.InterfaceC4991b;
import og.gf;
import sb.InterfaceC6775b;
import ud.InterfaceC7411o;
import wc.AbstractC7984r;
import zc.C8924a;
import zc.InterfaceC8929f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.h */
/* loaded from: classes.dex */
public final class C3190h implements InterfaceC6775b {

    /* renamed from: a */
    public final InterfaceC7411o f17173a;

    /* renamed from: b */
    public final C8924a f17174b;

    /* renamed from: c */
    public final boolean f17175c;

    /* renamed from: d */
    public final InterfaceC4991b f17176d;

    public C3190h(InterfaceC7411o interfaceC7411o, InterfaceC4991b interfaceC4991b) {
        InterfaceC8929f.f42893a.getClass();
        C8924a c8924a = C8924a.f42887b;
        this.f17173a = interfaceC7411o;
        this.f17174b = c8924a;
        this.f17175c = false;
        this.f17176d = interfaceC4991b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17175c) {
            AbstractC7984r.m15160d(this.f17176d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7542h(ww.AbstractC8193c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof i9.C3186d
            if (r0 == 0) goto L13
            r0 = r6
            i9.d r0 = (i9.C3186d) r0
            int r1 = r0.f17143c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17143c = r1
            goto L18
        L13:
            i9.d r0 = new i9.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17141a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17143c
            ud.o r3 = r5.f17173a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            og.od.m10798c(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            og.od.m10798c(r6)
            gc.b r6 = ea.AbstractC1976f.f9261t
            java.lang.Object r6 = gc.AbstractC2562f.m6572a(r6, r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4b
            r0.f17143c = r4
            java.lang.Object r6 = r5.m7543j(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L57
        L4b:
            gc.b r6 = ea.AbstractC1976f.f9260s
            java.lang.Object r6 = gc.AbstractC2562f.m6572a(r6, r3)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L57
            r6 = 0
            return r6
        L57:
            java.lang.String r0 = "\r\n"
            r1 = 0
            boolean r0 = nx.AbstractC5178p.m10116x(r6, r0, r1)
            if (r0 != 0) goto L61
            return r6
        L61:
            aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException r6 = new aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException
            java.lang.String r0 = "Token contains illegal line break sequence."
            r6.<init>(r0, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3190h.m7542h(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7543j(java.lang.String r5, ww.AbstractC8193c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof i9.C3187e
            if (r0 == 0) goto L13
            r0 = r6
            i9.e r0 = (i9.C3187e) r0
            int r1 = r0.f17155c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17155c = r1
            goto L18
        L13:
            i9.e r0 = new i9.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f17153a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17155c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            r0.f17155c = r3
            ud.o r6 = r4.f17173a
            ud.t r6 = (ud.C7416t) r6
            java.io.Serializable r6 = r6.m13808c(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            byte[] r6 = (byte[]) r6
            if (r6 == 0) goto L48
            java.lang.String r5 = nx.AbstractC5185w.m10126h(r6)
            return r5
        L48:
            aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException r5 = new aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException
            java.lang.String r6 = "Could not read token file."
            r0 = 0
            r5.<init>(r6, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3190h.m7543j(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7544n(java.lang.String r11, ww.AbstractC8193c r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3190h.m7544n(java.lang.String, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // vc.InterfaceC7700c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolve(ec.InterfaceC2004b r19, uw.InterfaceC7559c r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.C3190h.resolve(ec.b, uw.c):java.lang.Object");
    }

    public final String toString() {
        return gf.m10673a(this);
    }
}
