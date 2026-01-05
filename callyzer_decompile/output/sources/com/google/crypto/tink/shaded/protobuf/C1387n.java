package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.n */
/* loaded from: classes.dex */
public final class C1387n {

    /* renamed from: b */
    public static final C1396w f7080b = new C1396w(1);

    /* renamed from: a */
    public final Object f7081a;

    public C1387n(C1386m c1386m) {
        g0.m4228a(c1386m, "output");
        this.f7081a = c1386m;
        c1386m.f7073a = this;
    }

    /* renamed from: a */
    public void m4332a(int i10, boolean z6) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.m4328Q(i10, 0);
        c1386m.m4321J(z6 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: b */
    public void m4333b(int i10, AbstractC1382i abstractC1382i) {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.m4328Q(i10, 2);
        c1386m.m4329R(abstractC1382i.size());
        C1381h c1381h = (C1381h) abstractC1382i;
        c1386m.m4322K(c1381h.f7043d, c1381h.mo4227j(), c1381h.size());
    }

    /* renamed from: c */
    public void m4334c(double d2, int i10) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.getClass();
        c1386m.m4325N(i10, Double.doubleToRawLongBits(d2));
    }

    /* renamed from: d */
    public void m4335d(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.m4328Q(i10, 0);
        c1386m.m4327P(i11);
    }

    /* renamed from: e */
    public void m4336e(int i10, int i11) {
        ((C1386m) this.f7081a).m4323L(i10, i11);
    }

    /* renamed from: f */
    public void m4337f(int i10, long j6) {
        ((C1386m) this.f7081a).m4325N(i10, j6);
    }

    /* renamed from: g */
    public void m4338g(float f6, int i10) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.getClass();
        c1386m.m4323L(i10, Float.floatToRawIntBits(f6));
    }

    /* renamed from: h */
    public void m4339h(int i10, Object obj, f1 f1Var) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.m4328Q(i10, 3);
        f1Var.mo4218e((AbstractC1374a) obj, c1386m.f7073a);
        c1386m.m4328Q(i10, 4);
    }

    /* renamed from: i */
    public void m4340i(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.m4328Q(i10, 0);
        c1386m.m4327P(i11);
    }

    /* renamed from: j */
    public void m4341j(int i10, long j6) {
        ((C1386m) this.f7081a).m4330S(i10, j6);
    }

    /* renamed from: k */
    public void m4342k(int i10, Object obj, f1 f1Var) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        AbstractC1374a abstractC1374a = (AbstractC1374a) obj;
        c1386m.m4328Q(i10, 2);
        abstractC1374a.getClass();
        a0 a0Var = (a0) abstractC1374a;
        int iMo4222i = a0Var.memoizedSerializedSize;
        if (iMo4222i == -1) {
            iMo4222i = f1Var.mo4222i(abstractC1374a);
            a0Var.memoizedSerializedSize = iMo4222i;
        }
        c1386m.m4329R(iMo4222i);
        f1Var.mo4218e(abstractC1374a, c1386m.f7073a);
    }

    /* renamed from: l */
    public void m4343l(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        ((C1386m) this.f7081a).m4323L(i10, i11);
    }

    /* renamed from: m */
    public void m4344m(int i10, long j6) throws CodedOutputStream$OutOfSpaceException {
        ((C1386m) this.f7081a).m4325N(i10, j6);
    }

    /* renamed from: n */
    public void m4345n(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.m4328Q(i10, 0);
        c1386m.m4329R((i11 >> 31) ^ (i11 << 1));
    }

    /* renamed from: o */
    public void m4346o(int i10, long j6) throws CodedOutputStream$OutOfSpaceException {
        ((C1386m) this.f7081a).m4330S(i10, (j6 >> 63) ^ (j6 << 1));
    }

    /* renamed from: p */
    public void m4347p(int i10, int i11) throws CodedOutputStream$OutOfSpaceException {
        C1386m c1386m = (C1386m) this.f7081a;
        c1386m.m4328Q(i10, 0);
        c1386m.m4329R(i11);
    }

    /* renamed from: q */
    public void m4348q(int i10, long j6) throws CodedOutputStream$OutOfSpaceException {
        ((C1386m) this.f7081a).m4330S(i10, j6);
    }

    public C1387n() {
        s0 s0Var;
        try {
            s0Var = (s0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            s0Var = f7080b;
        }
        s0[] s0VarArr = {C1396w.f7125b, s0Var};
        o0 o0Var = new o0();
        o0Var.f7082a = s0VarArr;
        Charset charset = g0.f7037a;
        this.f7081a = o0Var;
    }
}
