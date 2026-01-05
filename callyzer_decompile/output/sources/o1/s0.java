package o1;

import com.sun.mail.util.AbstractC1452a;
import e1.AbstractC1911m;
import e1.C1908j;
import e1.C1921w;
import e1.C1922x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import m2.C4640e;
import og.te;
import rw.AbstractC6663m;
import rw.C6668r;
import rw.C6669s;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.C6750f;
import s4.EnumC6757m;
import t3.InterfaceC7028o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 implements t3.o0, k1 {

    /* renamed from: a */
    public final boolean f25838a;

    /* renamed from: b */
    public final InterfaceC5247f f25839b;

    /* renamed from: c */
    public final InterfaceC5249h f25840c;

    /* renamed from: d */
    public final float f25841d;

    /* renamed from: e */
    public final AbstractC5244c f25842e;

    /* renamed from: f */
    public final float f25843f;

    /* renamed from: g */
    public final int f25844g;

    /* renamed from: h */
    public final q0 f25845h;

    public s0(boolean z6, InterfaceC5247f interfaceC5247f, InterfaceC5249h interfaceC5249h, float f6, AbstractC5244c abstractC5244c, float f10, int i10, q0 q0Var) {
        this.f25838a = z6;
        this.f25839b = interfaceC5247f;
        this.f25840c = interfaceC5249h;
        this.f25841d = f6;
        this.f25842e = abstractC5244c;
        this.f25843f = f10;
        this.f25844g = i10;
        this.f25845h = q0Var;
    }

    @Override // o1.k1
    /* renamed from: a */
    public final int mo10352a(t3.w0 w0Var) {
        return this.f25838a ? w0Var.f0() : w0Var.h0();
    }

    @Override // o1.k1
    /* renamed from: b */
    public final long mo10353b(int i10, int i11, int i12, boolean z6) {
        if (this.f25838a) {
            n1 n1Var = m1.f25791a;
            return !z6 ? AbstractC6746b.m12923a(i10, i11, 0, i12) : te.m10936b(i10, i11, 0, i12);
        }
        C5261t c5261t = AbstractC5260s.f25837a;
        return !z6 ? AbstractC6746b.m12923a(0, i12, i10, i11) : te.m10935a(0, i12, i10, i11);
    }

    @Override // o1.k1
    /* renamed from: c */
    public final t3.k0 mo10354c(t3.w0[] w0VarArr, t3.l0 l0Var, int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13, int i14) {
        int i15;
        int i16;
        boolean z6 = this.f25838a;
        if (z6) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
        }
        return l0Var.g0(i16, i15, C6669s.f31944a, new r0(iArr2, i12, i13, i14, w0VarArr, this, i11, z6 ? EnumC6757m.Ltr : l0Var.getLayoutDirection(), iArr));
    }

    @Override // o1.k1
    /* renamed from: d */
    public final void mo10355d(int i10, int[] iArr, int[] iArr2, t3.l0 l0Var) {
        if (this.f25838a) {
            this.f25839b.mo10316c(l0Var, i10, iArr, l0Var.getLayoutDirection(), iArr2);
        } else {
            this.f25840c.mo10335b(l0Var, i10, iArr, iArr2);
        }
    }

    @Override // o1.k1
    /* renamed from: e */
    public final int mo10356e(t3.w0 w0Var) {
        return this.f25838a ? w0Var.h0() : w0Var.f0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f25838a == s0Var.f25838a && this.f25839b.equals(s0Var.f25839b) && this.f25840c.equals(s0Var.f25840c) && C6750f.m12935a(this.f25841d, s0Var.f25841d) && this.f25842e.equals(s0Var.f25842e) && C6750f.m12935a(this.f25843f, s0Var.f25843f) && this.f25844g == s0Var.f25844g && AbstractC4154l.m8918a(this.f25845h, s0Var.f25845h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public final int m10368f(List list, int i10, int i11, int i12, int i13, q0 q0Var) {
        long jM5567a;
        int iMo13312x;
        List list2 = list;
        int i14 = 0;
        if (list2.isEmpty()) {
            jM5567a = C1908j.m5567a(0, 0);
        } else {
            int i15 = Integer.MAX_VALUE;
            h0 h0Var = new h0(i13, q0Var, AbstractC6746b.m12923a(0, i10, 0, Integer.MAX_VALUE), i11, i12);
            t3.i0 i0Var = (t3.i0) AbstractC6663m.m12744H(list2, 0);
            boolean z6 = this.f25838a;
            int iA0 = i0Var != null ? z6 ? i0Var.a0(i10) : i0Var.mo13312x(i10) : 0;
            int iMo13312x2 = i0Var != null ? z6 ? i0Var.mo13312x(iA0) : i0Var.a0(iA0) : 0;
            int i16 = 0;
            if (h0Var.m10340b(list2.size() > 1, 0, C1908j.m5567a(i10, Integer.MAX_VALUE), i0Var == null ? null : new C1908j(C1908j.m5567a(iMo13312x2, iA0)), 0, 0, 0, false, false).f25734b) {
                C1908j c1908jM10365a = q0Var.m10365a(0, 0, i0Var != null);
                jM5567a = C1908j.m5567a(c1908jM10365a != null ? (int) (c1908jM10365a.f8997a & 4294967295L) : 0, 0);
            } else {
                int size = list2.size();
                int i17 = i10;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i18 >= size) {
                        break;
                    }
                    int i23 = i17 - iMo13312x2;
                    int i24 = i18 + 1;
                    int iMax = Math.max(i22, iA0);
                    t3.i0 i0Var2 = (t3.i0) AbstractC6663m.m12744H(list2, i24);
                    int iA02 = i0Var2 != null ? z6 ? i0Var2.a0(i10) : i0Var2.mo13312x(i10) : i14;
                    if (i0Var2 != null) {
                        iMo13312x = (z6 ? i0Var2.mo13312x(iA02) : i0Var2.a0(iA02)) + i11;
                    } else {
                        iMo13312x = i14;
                    }
                    int i25 = i24 - i20;
                    boolean z10 = i18 + 2 < list2.size() ? 1 : i14;
                    int i26 = i21;
                    int i27 = iA02;
                    int i28 = iMo13312x;
                    g0 g0VarM10340b = h0Var.m10340b(z10, i25, C1908j.m5567a(i23, i15), i0Var2 == null ? null : new C1908j(C1908j.m5567a(iMo13312x, iA02)), i26, i16, iMax, false, false);
                    if (g0VarM10340b.f25733a) {
                        int i29 = iMax + i12 + i16;
                        f0 f0VarM10339a = h0Var.m10339a(g0VarM10340b, i0Var2 != null, i26, i29, i23, i25);
                        int i30 = i28 - i11;
                        i21 = i26 + 1;
                        if (g0VarM10340b.f25734b) {
                            if (f0VarM10339a != null) {
                                long j6 = f0VarM10339a.f25724c;
                                if (!f0VarM10339a.f25725d) {
                                    i29 += ((int) (j6 & 4294967295L)) + i12;
                                }
                            }
                            i16 = i29;
                            i19 = i24;
                        } else {
                            i20 = i24;
                            i16 = i29;
                            iMo13312x2 = i30;
                            i22 = 0;
                            i17 = i10;
                        }
                    } else {
                        iMo13312x2 = i28;
                        i17 = i23;
                        i21 = i26;
                        i22 = iMax;
                    }
                    list2 = list;
                    i18 = i24;
                    i19 = i18;
                    iA0 = i27;
                    i15 = Integer.MAX_VALUE;
                    i14 = 0;
                }
                jM5567a = C1908j.m5567a(i16 - i12, i19);
            }
        }
        return (int) (jM5567a >> 32);
    }

    /* renamed from: g */
    public final int m10369g(List list, int i10, int i11) {
        int size = list.size();
        int i12 = 0;
        int iMax = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < size) {
            t3.i0 i0Var = (t3.i0) list.get(i12);
            int iMo13313y = (this.f25838a ? i0Var.mo13313y(i10) : i0Var.mo13311b(i10)) + i11;
            int i15 = i12 + 1;
            if (i15 - i13 == this.f25844g || i15 == list.size()) {
                iMax = Math.max(iMax, (i14 + iMo13313y) - i11);
                i14 = 0;
                i13 = i12;
            } else {
                i14 += iMo13313y;
            }
            i12 = i15;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m10370h(java.util.List r34, int r35, int r36, int r37, int r38, o1.q0 r39) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.s0.m10370h(java.util.List, int, int, int, int, o1.q0):int");
    }

    public final int hashCode() {
        return this.f25845h.hashCode() + AbstractC1452a.m4556c(Integer.MAX_VALUE, AbstractC1452a.m4556c(this.f25844g, AbstractC1452a.m4555b(this.f25843f, (this.f25842e.hashCode() + AbstractC1452a.m4555b(this.f25841d, (this.f25840c.hashCode() + ((this.f25839b.hashCode() + (Boolean.hashCode(this.f25838a) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // t3.o0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        List list2 = (List) AbstractC6663m.m12744H(list, 1);
        t3.i0 i0Var = list2 != null ? (t3.i0) AbstractC6663m.m12743G(list2) : null;
        List list3 = (List) AbstractC6663m.m12744H(list, 2);
        this.f25845h.m10366b(i0Var, list3 != null ? (t3.i0) AbstractC6663m.m12743G(list3) : null, this.f25838a, AbstractC6746b.m12924b(i10, 0, 13));
        boolean z6 = this.f25838a;
        float f6 = this.f25841d;
        List list4 = C6668r.f31943a;
        if (z6) {
            List list5 = (List) AbstractC6663m.m12743G(list);
            return m10368f(list5 == null ? list4 : list5, i10, interfaceC7028o.e0(f6), interfaceC7028o.e0(this.f25843f), this.f25844g, this.f25845h);
        }
        List list6 = (List) AbstractC6663m.m12743G(list);
        if (list6 != null) {
            list4 = list6;
        }
        return m10369g(list4, i10, interfaceC7028o.e0(f6));
    }

    @Override // t3.o0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        List list2 = (List) AbstractC6663m.m12744H(list, 1);
        t3.i0 i0Var = list2 != null ? (t3.i0) AbstractC6663m.m12743G(list2) : null;
        List list3 = (List) AbstractC6663m.m12744H(list, 2);
        this.f25845h.m10366b(i0Var, list3 != null ? (t3.i0) AbstractC6663m.m12743G(list3) : null, this.f25838a, AbstractC6746b.m12924b(0, i10, 7));
        boolean z6 = this.f25838a;
        float f6 = this.f25841d;
        List list4 = C6668r.f31943a;
        if (!z6) {
            List list5 = (List) AbstractC6663m.m12743G(list);
            return m10368f(list5 == null ? list4 : list5, i10, interfaceC7028o.e0(f6), interfaceC7028o.e0(this.f25843f), this.f25844g, this.f25845h);
        }
        List list6 = (List) AbstractC6663m.m12743G(list);
        if (list6 != null) {
            list4 = list6;
        }
        return m10369g(list4, i10, interfaceC7028o.e0(f6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t3.o0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16690measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        t3.i0 i0Var;
        long j10;
        t3.i0 i0Var2;
        t3.i0 i0Var3;
        C4640e c4640e;
        C1908j c1908j;
        g0 g0Var;
        f0 f0VarM10339a;
        C1922x c1922x;
        ArrayList arrayList;
        int i10;
        t3.l0 l0Var2;
        int iM12917h;
        int height;
        int iMo12108b;
        t3.i0 i0Var4;
        C1922x c1922x2;
        ArrayList arrayList2;
        C1908j c1908j2;
        Integer num;
        int i11;
        C1908j c1908j3;
        s0 s0Var = this;
        int i12 = s0Var.f25844g;
        C6669s c6669s = C6669s.f31944a;
        if (i12 != 0 && !((ArrayList) list).isEmpty()) {
            int iM12917h2 = C6745a.m12917h(j6);
            q0 q0Var = s0Var.f25845h;
            if (iM12917h2 != 0 || q0Var.f25814a == m0.Visible) {
                List list2 = (List) AbstractC6663m.m12742F(list);
                if (list2.isEmpty()) {
                    return l0Var.g0(0, 0, c6669s, C5254m.f25788e);
                }
                List list3 = (List) AbstractC6663m.m12744H(list, 1);
                t3.i0 i0Var5 = list3 != null ? (t3.i0) AbstractC6663m.m12743G(list3) : null;
                List list4 = (List) AbstractC6663m.m12744H(list, 2);
                t3.i0 i0Var6 = list4 != null ? (t3.i0) AbstractC6663m.m12743G(list4) : null;
                list2.size();
                q0Var.getClass();
                boolean z6 = s0Var.f25838a;
                c1 c1Var = z6 ? c1.Horizontal : c1.Vertical;
                long jM10331p = AbstractC5244c.m10331p(AbstractC5244c.m10325j(10, AbstractC5244c.m10324i(j6, c1Var)), c1Var);
                if (i0Var5 != null) {
                    AbstractC5244c.m10329n(i0Var5, s0Var, jM10331p, new p0(q0Var, s0Var, 0));
                    q0Var.f25815b = i0Var5;
                }
                if (i0Var6 != null) {
                    AbstractC5244c.m10329n(i0Var6, s0Var, jM10331p, new p0(q0Var, s0Var, 1));
                    q0Var.f25817d = i0Var6;
                }
                Iterator it = list2.iterator();
                long jM10324i = AbstractC5244c.m10324i(j6, z6 ? c1.Horizontal : c1.Vertical);
                C4640e c4640e2 = new C4640e(new t3.k0[16]);
                int iM12918i = C6745a.m12918i(jM10324i);
                int iM12920k = C6745a.m12920k(jM10324i);
                int iM12917h3 = C6745a.m12917h(jM10324i);
                C1922x c1922x3 = AbstractC1911m.f9027a;
                C1922x c1922x4 = new C1922x();
                ArrayList arrayList3 = new ArrayList();
                int iCeil = (int) Math.ceil(l0Var.mo8435T(s0Var.f25841d));
                int iCeil2 = (int) Math.ceil(l0Var.mo8435T(s0Var.f25843f));
                long jM12923a = AbstractC6746b.m12923a(0, iM12918i, 0, iM12917h3);
                long jM10331p2 = AbstractC5244c.m10331p(AbstractC5244c.m10325j(14, jM12923a), z6 ? c1.Horizontal : c1.Vertical);
                C4168z c4168z = new C4168z();
                if (it.hasNext()) {
                    try {
                        i0Var = (t3.i0) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        i0Var = null;
                    }
                    j10 = jM12923a;
                    i0Var2 = i0Var;
                } else {
                    j10 = jM12923a;
                    i0Var2 = null;
                }
                if (i0Var2 != null) {
                    c4640e = c4640e2;
                    i0Var3 = i0Var2;
                    c1908j = new C1908j(AbstractC5244c.m10329n(i0Var2, s0Var, jM10331p2, new k0(c4168z, 1)));
                } else {
                    i0Var3 = i0Var2;
                    c4640e = c4640e2;
                    c1908j = null;
                }
                Integer numValueOf = c1908j != null ? Integer.valueOf((int) (c1908j.f8997a >> 32)) : null;
                Integer numValueOf2 = c1908j != null ? Integer.valueOf((int) (c1908j.f8997a & 4294967295L)) : null;
                C1921w c1921w = new C1921w();
                C1921w c1921w2 = new C1921w();
                C1908j c1908j4 = c1908j;
                int i13 = s0Var.f25844g;
                q0 q0Var2 = s0Var.f25845h;
                h0 h0Var = new h0(i13, q0Var2, jM10324i, iCeil, iCeil2);
                g0 g0VarM10340b = h0Var.m10340b(it.hasNext(), 0, C1908j.m5567a(iM12918i, iM12917h3), c1908j4, 0, 0, 0, false, false);
                if (g0VarM10340b.f25734b) {
                    g0Var = g0VarM10340b;
                    f0VarM10339a = h0Var.m10339a(g0Var, c1908j4 != null, -1, 0, iM12918i, 0);
                } else {
                    g0Var = g0VarM10340b;
                    f0VarM10339a = null;
                }
                Integer num2 = numValueOf2;
                int i14 = iCeil;
                int i15 = iM12917h3;
                int i16 = iM12920k;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                f0 f0Var = f0VarM10339a;
                int i22 = iM12918i;
                g0 g0Var2 = g0Var;
                t3.i0 i0Var7 = i0Var3;
                int i23 = 0;
                while (!g0Var2.f25734b && i0Var7 != null) {
                    AbstractC4154l.m8920c(numValueOf);
                    int iIntValue = numValueOf.intValue();
                    AbstractC4154l.m8920c(num2);
                    int iIntValue2 = num2.intValue();
                    f0 f0Var2 = f0Var;
                    int i24 = i19 + iIntValue;
                    int iMax = Math.max(i17, iIntValue2);
                    int i25 = i22 - iIntValue;
                    int i26 = i18 + 1;
                    q0Var2.getClass();
                    arrayList3.add(i0Var7);
                    c1922x4.m5663h(i18, c4168z.f21164a);
                    int i27 = i26 - i23;
                    if (it.hasNext()) {
                        try {
                            i0Var4 = (t3.i0) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                    } else {
                        i0Var4 = null;
                    }
                    c4168z.f21164a = null;
                    if (i0Var4 != null) {
                        c1922x2 = c1922x4;
                        arrayList2 = arrayList3;
                        c1908j2 = new C1908j(AbstractC5244c.m10329n(i0Var4, s0Var, jM10331p2, new k0(c4168z, 0)));
                    } else {
                        c1922x2 = c1922x4;
                        arrayList2 = arrayList3;
                        c1908j2 = null;
                    }
                    Integer numValueOf3 = c1908j2 != null ? Integer.valueOf(((int) (c1908j2.f8997a >> 32)) + i14) : null;
                    t3.i0 i0Var8 = i0Var4;
                    Integer numValueOf4 = c1908j2 != null ? Integer.valueOf((int) (c1908j2.f8997a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jM5567a = C1908j.m5567a(i25, i15);
                    if (c1908j2 == null) {
                        num = numValueOf4;
                        i11 = i25;
                        c1908j3 = null;
                    } else {
                        AbstractC4154l.m8920c(numValueOf3);
                        int iIntValue3 = numValueOf3.intValue();
                        AbstractC4154l.m8920c(numValueOf4);
                        num = numValueOf4;
                        i11 = i25;
                        c1908j3 = new C1908j(C1908j.m5567a(iIntValue3, num.intValue()));
                    }
                    g0 g0VarM10340b2 = h0Var.m10340b(zHasNext, i27, jM5567a, c1908j3, i20, i21, iMax, false, false);
                    int i28 = iMax;
                    if (g0VarM10340b2.f25733a) {
                        int iMin = Math.min(Math.max(i16, i24), iM12918i);
                        int i29 = i21 + i28;
                        h0 h0Var2 = h0Var;
                        int i30 = i20;
                        f0 f0VarM10339a2 = h0Var2.m10339a(g0VarM10340b2, c1908j2 != null, i30, i29, i11, i27);
                        h0Var = h0Var2;
                        g0Var2 = g0VarM10340b2;
                        c1921w2.m5651a(i28);
                        i15 = (i15 - i29) - iCeil2;
                        c1921w.m5651a(i26);
                        i20 = i30 + 1;
                        i21 = i29 + iCeil2;
                        numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i14) : null;
                        i16 = iMin;
                        i11 = iM12918i;
                        i23 = i26;
                        i28 = 0;
                        i19 = 0;
                        f0Var = f0VarM10339a2;
                    } else {
                        g0Var2 = g0VarM10340b2;
                        i19 = i24;
                        f0Var = f0Var2;
                    }
                    s0Var = this;
                    i18 = i26;
                    num2 = num;
                    i17 = i28;
                    i0Var7 = i0Var8;
                    arrayList3 = arrayList2;
                    numValueOf = numValueOf3;
                    c1922x4 = c1922x2;
                    i22 = i11;
                }
                f0 f0Var3 = f0Var;
                C1922x c1922x5 = c1922x4;
                ArrayList arrayList4 = arrayList3;
                if (f0Var3 != null) {
                    long j11 = f0Var3.f25724c;
                    arrayList = arrayList4;
                    arrayList.add(f0Var3.f25722a);
                    c1922x = c1922x5;
                    c1922x.m5663h(arrayList.size() - 1, f0Var3.f25723b);
                    int i31 = c1921w.f9077b - 1;
                    if (f0Var3.f25725d) {
                        c1921w2.m5657g(i31, Math.max(c1921w2.m5653c(i31), (int) (j11 & 4294967295L)));
                        c1921w.m5657g(i31, c1921w.m5654d() + 1);
                    } else {
                        c1921w2.m5651a((int) (j11 & 4294967295L));
                        c1921w.m5651a(c1921w.m5654d() + 1);
                    }
                } else {
                    c1922x = c1922x5;
                    arrayList = arrayList4;
                }
                int size = arrayList.size();
                t3.w0[] w0VarArr = new t3.w0[size];
                for (int i32 = 0; i32 < size; i32++) {
                    w0VarArr[i32] = c1922x.m5595b(i32);
                }
                int i33 = c1921w.f9077b;
                int[] iArr = new int[i33];
                int[] iArr2 = new int[i33];
                int[] iArr3 = c1921w.f9076a;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                t3.w0[] w0VarArr2 = w0VarArr;
                while (i35 < i33) {
                    int i37 = iArr3[i35];
                    int iM5653c = c1921w2.m5653c(i35);
                    ArrayList arrayList5 = arrayList;
                    int[] iArr4 = iArr3;
                    t3.w0[] w0VarArr3 = w0VarArr2;
                    int i38 = i16;
                    C1921w c1921w3 = c1921w2;
                    int i39 = i14;
                    C4640e c4640e3 = c4640e;
                    long j12 = j10;
                    t3.k0 k0VarM10328m = AbstractC5244c.m10328m(this, i38, C6745a.m12919j(j10), C6745a.m12918i(j10), iM5653c, i39, l0Var, arrayList5, w0VarArr3, i34, i37, iArr, i35);
                    if (z6) {
                        height = k0VarM10328m.mo12108b();
                        iMo12108b = k0VarM10328m.getHeight();
                    } else {
                        height = k0VarM10328m.getHeight();
                        iMo12108b = k0VarM10328m.mo12108b();
                    }
                    iArr2[i35] = iMo12108b;
                    i36 += iMo12108b;
                    int iMax2 = Math.max(i38, height);
                    c4640e3.m9506b(k0VarM10328m);
                    i35++;
                    i34 = i37;
                    c4640e = c4640e3;
                    j10 = j12;
                    iArr3 = iArr4;
                    arrayList = arrayList5;
                    c1921w2 = c1921w3;
                    i14 = i39;
                    i16 = iMax2;
                    w0VarArr2 = w0VarArr3;
                }
                int i40 = i16;
                C4640e c4640e4 = c4640e;
                if (c4640e4.f22886c == 0) {
                    i10 = 0;
                    i36 = 0;
                } else {
                    i10 = i40;
                }
                if (z6) {
                    InterfaceC5249h interfaceC5249h = this.f25840c;
                    int iE0 = ((c4640e4.f22886c - 1) * l0Var.e0(interfaceC5249h.mo10336a())) + i36;
                    int iM12919j = C6745a.m12919j(jM10324i);
                    iM12917h = C6745a.m12917h(jM10324i);
                    if (iE0 < iM12919j) {
                        iE0 = iM12919j;
                    }
                    if (iE0 <= iM12917h) {
                        iM12917h = iE0;
                    }
                    interfaceC5249h.mo10335b(l0Var, iM12917h, iArr2, iArr);
                    l0Var2 = l0Var;
                } else {
                    InterfaceC5247f interfaceC5247f = this.f25839b;
                    int iE02 = ((c4640e4.f22886c - 1) * l0Var.e0(interfaceC5247f.mo10336a())) + i36;
                    int iM12919j2 = C6745a.m12919j(jM10324i);
                    int iM12917h4 = C6745a.m12917h(jM10324i);
                    if (iE02 < iM12919j2) {
                        iE02 = iM12919j2;
                    }
                    int i41 = iE02 > iM12917h4 ? iM12917h4 : iE02;
                    l0Var2 = l0Var;
                    interfaceC5247f.mo10316c(l0Var2, i41, iArr2, l0Var.getLayoutDirection(), iArr);
                    iM12917h = i41;
                }
                int iM12920k2 = C6745a.m12920k(jM10324i);
                int iM12918i2 = C6745a.m12918i(jM10324i);
                if (i10 < iM12920k2) {
                    i10 = iM12920k2;
                }
                if (i10 <= iM12918i2) {
                    iM12918i2 = i10;
                }
                if (z6) {
                    int i42 = iM12917h;
                    iM12917h = iM12918i2;
                    iM12918i2 = i42;
                }
                return l0Var2.g0(iM12917h, iM12918i2, c6669s, new l0(0, c4640e4));
            }
        }
        return l0Var.g0(0, 0, c6669s, C5254m.f25787d);
    }

    @Override // t3.o0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        List list2 = (List) AbstractC6663m.m12744H(list, 1);
        t3.i0 i0Var = list2 != null ? (t3.i0) AbstractC6663m.m12743G(list2) : null;
        List list3 = (List) AbstractC6663m.m12744H(list, 2);
        this.f25845h.m10366b(i0Var, list3 != null ? (t3.i0) AbstractC6663m.m12743G(list3) : null, this.f25838a, AbstractC6746b.m12924b(i10, 0, 13));
        boolean z6 = this.f25838a;
        float f6 = this.f25843f;
        float f10 = this.f25841d;
        List list4 = C6668r.f31943a;
        if (z6) {
            List list5 = (List) AbstractC6663m.m12743G(list);
            return m10368f(list5 == null ? list4 : list5, i10, interfaceC7028o.e0(f10), interfaceC7028o.e0(f6), this.f25844g, this.f25845h);
        }
        List list6 = (List) AbstractC6663m.m12743G(list);
        if (list6 != null) {
            list4 = list6;
        }
        return m10370h(list4, i10, interfaceC7028o.e0(f10), interfaceC7028o.e0(f6), this.f25844g, this.f25845h);
    }

    @Override // t3.o0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        List list2 = (List) AbstractC6663m.m12744H(list, 1);
        t3.i0 i0Var = list2 != null ? (t3.i0) AbstractC6663m.m12743G(list2) : null;
        List list3 = (List) AbstractC6663m.m12744H(list, 2);
        this.f25845h.m10366b(i0Var, list3 != null ? (t3.i0) AbstractC6663m.m12743G(list3) : null, this.f25838a, AbstractC6746b.m12924b(0, i10, 7));
        boolean z6 = this.f25838a;
        float f6 = this.f25843f;
        float f10 = this.f25841d;
        List list4 = C6668r.f31943a;
        if (z6) {
            List list5 = (List) AbstractC6663m.m12743G(list);
            return m10370h(list5 == null ? list4 : list5, i10, interfaceC7028o.e0(f10), interfaceC7028o.e0(f6), this.f25844g, this.f25845h);
        }
        List list6 = (List) AbstractC6663m.m12743G(list);
        if (list6 != null) {
            list4 = list6;
        }
        return m10368f(list4, i10, interfaceC7028o.e0(f10), interfaceC7028o.e0(f6), this.f25844g, this.f25845h);
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.f25838a + ", horizontalArrangement=" + this.f25839b + ", verticalArrangement=" + this.f25840c + ", mainAxisSpacing=" + ((Object) C6750f.m12936b(this.f25841d)) + ", crossAxisAlignment=" + this.f25842e + ", crossAxisArrangementSpacing=" + ((Object) C6750f.m12936b(this.f25843f)) + ", maxItemsInMainAxis=" + this.f25844g + ", maxLines=2147483647, overflow=" + this.f25845h + ')';
    }
}
