package k5;

import b00.C0531p;
import c9.C0919n;
import j5.C3588e;
import j5.C3592i;
import java.util.ArrayList;
import java.util.Arrays;
import l4.C4367l;
import l5.AbstractC4398q;
import l5.C4383b;
import l5.C4384c;
import l5.C4392k;
import l5.C4395n;
import m5.C4654h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k5.i */
/* loaded from: classes.dex */
public final class C4014i extends C4013h {

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f44389d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final C4367l f44390e0 = new C4367l(this);

    /* renamed from: f0, reason: collision with root package name */
    public final C0531p f44391f0;

    /* renamed from: g0, reason: collision with root package name */
    public C4654h f44392g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f44393h0;

    /* renamed from: i0, reason: collision with root package name */
    public final C3588e f44394i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f44395j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f44396k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f44397l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f44398m0;

    /* renamed from: n0, reason: collision with root package name */
    public C4007b[] f44399n0;

    /* renamed from: o0, reason: collision with root package name */
    public C4007b[] f44400o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f44401p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f44402q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f44403r0;

    public C4014i() {
        C0531p c0531p = new C0531p(2);
        c0531p.f3655b = true;
        c0531p.f3656c = true;
        c0531p.f3659f = new ArrayList();
        new ArrayList();
        c0531p.f3660g = null;
        c0531p.f3661h = new C4383b();
        c0531p.f3662i = new ArrayList();
        c0531p.f3657d = this;
        c0531p.f3658e = this;
        this.f44391f0 = c0531p;
        this.f44392g0 = null;
        this.f44393h0 = false;
        this.f44394i0 = new C3588e();
        this.f44397l0 = 0;
        this.f44398m0 = 0;
        this.f44399n0 = new C4007b[4];
        this.f44400o0 = new C4007b[4];
        this.f44401p0 = 263;
        this.f44402q0 = false;
        this.f44403r0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public final boolean m8815A(int i10, boolean z6) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        EnumC4012g enumC4012g;
        boolean z12;
        C0531p c0531p = this.f44391f0;
        ArrayList arrayList = (ArrayList) c0531p.f3659f;
        C4014i c4014i = (C4014i) c0531p.f3657d;
        EnumC4012g enumC4012gM8796f = c4014i.m8796f(0);
        EnumC4012g[] enumC4012gArr = c4014i.f20741I;
        C4395n c4395n = c4014i.f20763e;
        C4392k c4392k = c4014i.f20762d;
        EnumC4012g enumC4012gM8796f2 = c4014i.m8796f(1);
        int iM8801k = c4014i.m8801k();
        int iM8802l = c4014i.m8802l();
        if (z6 && (enumC4012gM8796f == (enumC4012g = EnumC4012g.WRAP_CONTENT) || enumC4012gM8796f2 == enumC4012g)) {
            int size = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z12 = z6;
                    break;
                }
                Object obj = arrayList.get(i13);
                i13++;
                AbstractC4398q abstractC4398q = (AbstractC4398q) obj;
                if (abstractC4398q.f21986f == i10 && !abstractC4398q.mo9160k()) {
                    z12 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z12 && enumC4012gM8796f == EnumC4012g.WRAP_CONTENT) {
                    c4014i.m8810t(EnumC4012g.FIXED);
                    c4014i.m8812v(c0531p.m1617d(c4014i, 0));
                    c4392k.f21985e.mo9165d(c4014i.m8800j());
                }
            } else if (z12 && enumC4012gM8796f2 == EnumC4012g.WRAP_CONTENT) {
                c4014i.m8811u(EnumC4012g.FIXED);
                c4014i.m8809s(c0531p.m1617d(c4014i, 1));
                c4395n.f21985e.mo9165d(c4014i.m8797g());
            }
        }
        if (i10 == 0) {
            i11 = 0;
            EnumC4012g enumC4012g2 = enumC4012gArr[0];
            if (enumC4012g2 == EnumC4012g.FIXED || enumC4012g2 == EnumC4012g.MATCH_PARENT) {
                int iM8800j = c4014i.m8800j() + iM8801k;
                c4392k.f21989i.mo9165d(iM8800j);
                c4392k.f21985e.mo9165d(iM8800j - iM8801k);
                i12 = 1;
                z10 = true;
            } else {
                z10 = true;
                i12 = i11;
            }
        } else {
            i11 = 0;
            z10 = true;
            EnumC4012g enumC4012g3 = enumC4012gArr[1];
            if (enumC4012g3 == EnumC4012g.FIXED || enumC4012g3 == EnumC4012g.MATCH_PARENT) {
                int iM8797g = c4014i.m8797g() + iM8802l;
                c4395n.f21989i.mo9165d(iM8797g);
                c4395n.f21985e.mo9165d(iM8797g - iM8802l);
                i12 = 1;
            } else {
                i12 = i11;
            }
        }
        c0531p.m1620g();
        int size2 = arrayList.size();
        int i14 = i11;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            AbstractC4398q abstractC4398q2 = (AbstractC4398q) obj2;
            if (abstractC4398q2.f21986f == i10 && (abstractC4398q2.f21982b != c4014i || abstractC4398q2.f21987g)) {
                abstractC4398q2.mo9157e();
            }
        }
        int size3 = arrayList.size();
        int i15 = i11;
        while (i15 < size3) {
            Object obj3 = arrayList.get(i15);
            i15++;
            AbstractC4398q abstractC4398q3 = (AbstractC4398q) obj3;
            if (abstractC4398q3.f21986f == i10 && (i12 != 0 || abstractC4398q3.f21982b != c4014i)) {
                if (!abstractC4398q3.f21988h.f21969j || !abstractC4398q3.f21989i.f21969j || (!(abstractC4398q3 instanceof C4384c) && !abstractC4398q3.f21985e.f21969j)) {
                    z11 = i11;
                    break;
                }
            }
        }
        z11 = z10;
        c4014i.m8810t(enumC4012gM8796f);
        c4014i.m8811u(enumC4012gM8796f2);
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fa A[PHI: r0 r14
      0x01fa: PHI (r0v17 boolean) = (r0v16 boolean), (r0v19 boolean), (r0v19 boolean), (r0v19 boolean) binds: [B:89:0x01c2, B:98:0x01e4, B:99:0x01e6, B:101:0x01ec] A[DONT_GENERATE, DONT_INLINE]
      0x01fa: PHI (r14v5 boolean) = (r14v4 boolean), (r14v7 boolean), (r14v7 boolean), (r14v7 boolean) binds: [B:89:0x01c2, B:98:0x01e4, B:99:0x01e6, B:101:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8816B() {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.C4014i.m8816B():void");
    }

    @Override // k5.C4013h
    /* renamed from: q */
    public final void mo8807q() {
        this.f44394i0.m8148r();
        this.f44395j0 = 0;
        this.f44396k0 = 0;
        this.f44389d0.clear();
        super.mo8807q();
    }

    @Override // k5.C4013h
    /* renamed from: r */
    public final void mo8808r(C0919n c0919n) {
        super.mo8808r(c0919n);
        int size = this.f44389d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C4013h) this.f44389d0.get(i10)).mo8808r(c0919n);
        }
    }

    @Override // k5.C4013h
    /* renamed from: w */
    public final void mo8813w(boolean z6, boolean z10) {
        super.mo8813w(z6, z10);
        int size = this.f44389d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C4013h) this.f44389d0.get(i10)).mo8813w(z6, z10);
        }
    }

    /* renamed from: y */
    public final void m8817y(C4013h c4013h, int i10) {
        if (i10 == 0) {
            int i11 = this.f44397l0 + 1;
            C4007b[] c4007bArr = this.f44400o0;
            if (i11 >= c4007bArr.length) {
                this.f44400o0 = (C4007b[]) Arrays.copyOf(c4007bArr, c4007bArr.length * 2);
            }
            C4007b[] c4007bArr2 = this.f44400o0;
            int i12 = this.f44397l0;
            c4007bArr2[i12] = new C4007b(c4013h, 0, this.f44393h0);
            this.f44397l0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f44398m0 + 1;
            C4007b[] c4007bArr3 = this.f44399n0;
            if (i13 >= c4007bArr3.length) {
                this.f44399n0 = (C4007b[]) Arrays.copyOf(c4007bArr3, c4007bArr3.length * 2);
            }
            C4007b[] c4007bArr4 = this.f44399n0;
            int i14 = this.f44398m0;
            c4007bArr4[i14] = new C4007b(c4013h, 1, this.f44393h0);
            this.f44398m0 = i14 + 1;
        }
    }

    /* renamed from: z */
    public final void m8818z(C3588e c3588e) {
        int i10;
        int i11;
        char c2;
        mo8785a(c3588e);
        int size = this.f44389d0.size();
        char c10 = 0;
        int i12 = 0;
        boolean z6 = false;
        while (true) {
            i10 = 1;
            if (i12 >= size) {
                break;
            }
            C4013h c4013h = (C4013h) this.f44389d0.get(i12);
            boolean[] zArr = c4013h.f20740H;
            zArr[0] = false;
            zArr[1] = false;
            if (c4013h instanceof C4006a) {
                z6 = true;
            }
            i12++;
        }
        char c11 = 2;
        if (z6) {
            for (int i13 = 0; i13 < size; i13++) {
                C4013h c4013h2 = (C4013h) this.f44389d0.get(i13);
                if (c4013h2 instanceof C4006a) {
                    C4006a c4006a = (C4006a) c4013h2;
                    for (int i14 = 0; i14 < c4006a.f44382e0; i14++) {
                        C4013h c4013h3 = c4006a.f44381d0[i14];
                        int i15 = c4006a.f44383f0;
                        if (i15 == 0 || i15 == 1) {
                            c4013h3.f20740H[0] = true;
                        } else if (i15 == 2 || i15 == 3) {
                            c4013h3.f20740H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < size; i16++) {
            C4013h c4013h4 = (C4013h) this.f44389d0.get(i16);
            c4013h4.getClass();
            if (c4013h4 instanceof C4016k) {
                c4013h4.mo8785a(c3588e);
            }
        }
        int i17 = 0;
        while (i17 < size) {
            C4013h c4013h5 = (C4013h) this.f44389d0.get(i17);
            if (c4013h5 instanceof C4014i) {
                EnumC4012g[] enumC4012gArr = c4013h5.f20741I;
                EnumC4012g enumC4012g = enumC4012gArr[c10];
                EnumC4012g enumC4012g2 = enumC4012gArr[i10];
                EnumC4012g enumC4012g3 = EnumC4012g.WRAP_CONTENT;
                if (enumC4012g == enumC4012g3) {
                    c4013h5.m8810t(EnumC4012g.FIXED);
                }
                if (enumC4012g2 == enumC4012g3) {
                    c4013h5.m8811u(EnumC4012g.FIXED);
                }
                c4013h5.mo8785a(c3588e);
                if (enumC4012g == enumC4012g3) {
                    c4013h5.m8810t(enumC4012g);
                }
                if (enumC4012g2 == enumC4012g3) {
                    c4013h5.m8811u(enumC4012g2);
                }
                i11 = i10;
                c2 = c11;
            } else {
                c4013h5.f20766h = -1;
                C4010e c4010e = c4013h5.f20734B;
                EnumC4012g[] enumC4012gArr2 = c4013h5.f20741I;
                C4010e c4010e2 = c4013h5.f20733A;
                C4010e c4010e3 = c4013h5.f20783y;
                C4010e c4010e4 = c4013h5.f20784z;
                C4010e c4010e5 = c4013h5.f20782x;
                c4013h5.f20767i = -1;
                EnumC4012g[] enumC4012gArr3 = this.f20741I;
                EnumC4012g enumC4012g4 = enumC4012gArr3[c10];
                i11 = i10;
                EnumC4012g enumC4012g5 = EnumC4012g.WRAP_CONTENT;
                if (enumC4012g4 != enumC4012g5 && enumC4012gArr2[c10] == EnumC4012g.MATCH_PARENT) {
                    int i18 = c4010e5.f20728e;
                    int iM8800j = m8800j() - c4010e4.f20728e;
                    c4010e5.f20730g = c3588e.m8141j(c4010e5);
                    c4010e4.f20730g = c3588e.m8141j(c4010e4);
                    c3588e.m8135d(c4010e5.f20730g, i18);
                    c3588e.m8135d(c4010e4.f20730g, iM8800j);
                    c4013h5.f20766h = 2;
                    c4013h5.f20747O = i18;
                    int i19 = iM8800j - i18;
                    c4013h5.f20743K = i19;
                    int i20 = c4013h5.f20750R;
                    if (i19 < i20) {
                        c4013h5.f20743K = i20;
                    }
                }
                if (enumC4012gArr3[i11] == enumC4012g5 || enumC4012gArr2[i11] != EnumC4012g.MATCH_PARENT) {
                    c2 = 2;
                } else {
                    int i21 = c4010e3.f20728e;
                    int iM8797g = m8797g() - c4010e2.f20728e;
                    c4010e3.f20730g = c3588e.m8141j(c4010e3);
                    c4010e2.f20730g = c3588e.m8141j(c4010e2);
                    c3588e.m8135d(c4010e3.f20730g, i21);
                    c3588e.m8135d(c4010e2.f20730g, iM8797g);
                    if (c4013h5.f20749Q > 0 || c4013h5.f20755W == 8) {
                        C3592i c3592iM8141j = c3588e.m8141j(c4010e);
                        c4010e.f20730g = c3592iM8141j;
                        c3588e.m8135d(c3592iM8141j, c4013h5.f20749Q + i21);
                    }
                    c2 = 2;
                    c4013h5.f20767i = 2;
                    c4013h5.f20748P = i21;
                    int i22 = iM8797g - i21;
                    c4013h5.f20744L = i22;
                    int i23 = c4013h5.f20751S;
                    if (i22 < i23) {
                        c4013h5.f20744L = i23;
                    }
                }
                if (!(c4013h5 instanceof C4016k)) {
                    c4013h5.mo8785a(c3588e);
                }
            }
            i17++;
            c11 = c2;
            i10 = i11;
            c10 = 0;
        }
        int i24 = i10;
        if (this.f44397l0 > 0) {
            AbstractC4017l.m8820a(this, c3588e, 0);
        }
        if (this.f44398m0 > 0) {
            AbstractC4017l.m8820a(this, c3588e, i24);
        }
    }
}
