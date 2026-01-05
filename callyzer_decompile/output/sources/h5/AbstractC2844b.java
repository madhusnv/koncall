package h5;

import com.skydoves.balloon.internals.DefinitionKt;
import g5.C2514d;
import g5.C2517g;
import g5.C2518h;
import g5.C2522l;
import g5.EnumC2513c;
import g5.EnumC2516f;
import java.util.HashSet;
import java.util.Iterator;
import y4.C8552m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h5.b */
/* loaded from: classes.dex */
public abstract class AbstractC2844b {

    /* renamed from: a */
    public static final C2843a f15856a = new C2843a();

    /* renamed from: a */
    public static boolean m6978a(C2517g c2517g) {
        EnumC2516f enumC2516f;
        EnumC2516f enumC2516f2;
        EnumC2516f[] enumC2516fArr = c2517g.f13772L;
        EnumC2516f enumC2516f3 = enumC2516fArr[0];
        EnumC2516f enumC2516f4 = enumC2516fArr[1];
        C2518h c2518h = c2517g.f13773M;
        if (c2518h == null) {
            c2518h = null;
        }
        if (c2518h != null) {
            EnumC2516f enumC2516f5 = c2518h.f13772L[0];
            EnumC2516f enumC2516f6 = EnumC2516f.FIXED;
        }
        if (c2518h != null) {
            EnumC2516f enumC2516f7 = c2518h.f13772L[1];
            EnumC2516f enumC2516f8 = EnumC2516f.FIXED;
        }
        EnumC2516f enumC2516f9 = EnumC2516f.FIXED;
        boolean z6 = enumC2516f3 == enumC2516f9 || c2517g.mo6488v() || enumC2516f3 == EnumC2516f.WRAP_CONTENT || (enumC2516f3 == (enumC2516f2 = EnumC2516f.MATCH_CONSTRAINT) && c2517g.f13799m == 0 && c2517g.f13776P == DefinitionKt.NO_Float_VALUE && c2517g.m6522o(0)) || (enumC2516f3 == enumC2516f2 && c2517g.f13799m == 1 && c2517g.m6523p(0, c2517g.m6519l()));
        boolean z10 = enumC2516f4 == enumC2516f9 || c2517g.mo6489w() || enumC2516f4 == EnumC2516f.WRAP_CONTENT || (enumC2516f4 == (enumC2516f = EnumC2516f.MATCH_CONSTRAINT) && c2517g.f13800n == 0 && c2517g.f13776P == DefinitionKt.NO_Float_VALUE && c2517g.m6522o(1)) || (enumC2516f4 == enumC2516f && c2517g.f13800n == 1 && c2517g.m6523p(1, c2517g.m6518k()));
        return (c2517g.f13776P > DefinitionKt.NO_Float_VALUE && (z6 || z10)) || (z6 && z10);
    }

    /* renamed from: b */
    public static void m6979b(int i10, C2517g c2517g, C8552m c8552m) {
        C2514d c2514d;
        C2514d c2514d2;
        float f6;
        C2514d c2514d3;
        C2514d c2514d4;
        if (c2517g.f13795i) {
            return;
        }
        if (!(c2517g instanceof C2518h) && c2517g.m6528u() && m6978a(c2517g)) {
            C2518h.m6532M(c2517g, c8552m, new C2843a());
        }
        C2514d c2514dMo6516i = c2517g.mo6516i(EnumC2513c.LEFT);
        C2514d c2514dMo6516i2 = c2517g.mo6516i(EnumC2513c.RIGHT);
        int iM6492c = c2514dMo6516i.m6492c();
        int iM6492c2 = c2514dMo6516i2.m6492c();
        HashSet hashSet = c2514dMo6516i.f13751a;
        if (hashSet != null && c2514dMo6516i.f13753c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C2514d c2514d5 = (C2514d) it.next();
                C2517g c2517g2 = c2514d5.f13754d;
                int i11 = i10 + 1;
                boolean zM6978a = m6978a(c2517g2);
                C2514d c2514d6 = c2517g2.f13761A;
                C2514d c2514d7 = c2517g2.f13763C;
                if (c2517g2.m6528u() && zM6978a) {
                    f6 = DefinitionKt.NO_Float_VALUE;
                    C2518h.m6532M(c2517g2, c8552m, new C2843a());
                } else {
                    f6 = DefinitionKt.NO_Float_VALUE;
                }
                boolean z6 = (c2514d5 == c2514d6 && (c2514d4 = c2514d7.f13756f) != null && c2514d4.f13753c) || (c2514d5 == c2514d7 && (c2514d3 = c2514d6.f13756f) != null && c2514d3.f13753c);
                EnumC2516f enumC2516f = c2517g2.f13772L[0];
                EnumC2516f enumC2516f2 = EnumC2516f.MATCH_CONSTRAINT;
                if (enumC2516f != enumC2516f2 || zM6978a) {
                    if (!c2517g2.m6528u()) {
                        if (c2514d5 == c2514d6 && c2514d7.f13756f == null) {
                            int iM6493d = c2514d6.m6493d() + iM6492c;
                            c2517g2.m6503C(iM6493d, c2517g2.m6519l() + iM6493d);
                            m6979b(i11, c2517g2, c8552m);
                        } else if (c2514d5 == c2514d7 && c2514d6.f13756f == null) {
                            int iM6493d2 = iM6492c - c2514d7.m6493d();
                            c2517g2.m6503C(iM6493d2 - c2517g2.m6519l(), iM6493d2);
                            m6979b(i11, c2517g2, c8552m);
                        } else if (z6 && !c2517g2.m6526s()) {
                            m6980c(i11, c2517g2, c8552m);
                        }
                    }
                } else if (enumC2516f == enumC2516f2 && c2517g2.f13803q >= 0 && c2517g2.f13802p >= 0 && (c2517g2.f13786Z == 8 || (c2517g2.f13799m == 0 && c2517g2.f13776P == f6))) {
                    if (!c2517g2.m6526s() && z6 && !c2517g2.m6526s()) {
                        m6981d(i11, c2517g, c8552m, c2517g2);
                    }
                }
            }
        }
        if (c2517g instanceof C2522l) {
            return;
        }
        HashSet hashSet2 = c2514dMo6516i2.f13751a;
        if (hashSet2 != null && c2514dMo6516i2.f13753c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C2514d c2514d8 = (C2514d) it2.next();
                C2517g c2517g3 = c2514d8.f13754d;
                int i12 = i10 + 1;
                boolean zM6978a2 = m6978a(c2517g3);
                C2514d c2514d9 = c2517g3.f13761A;
                C2514d c2514d10 = c2517g3.f13763C;
                if (c2517g3.m6528u() && zM6978a2) {
                    C2518h.m6532M(c2517g3, c8552m, new C2843a());
                }
                boolean z10 = (c2514d8 == c2514d9 && (c2514d2 = c2514d10.f13756f) != null && c2514d2.f13753c) || (c2514d8 == c2514d10 && (c2514d = c2514d9.f13756f) != null && c2514d.f13753c);
                EnumC2516f enumC2516f3 = c2517g3.f13772L[0];
                EnumC2516f enumC2516f4 = EnumC2516f.MATCH_CONSTRAINT;
                if (enumC2516f3 != enumC2516f4 || zM6978a2) {
                    if (!c2517g3.m6528u()) {
                        if (c2514d8 == c2514d9 && c2514d10.f13756f == null) {
                            int iM6493d3 = c2514d9.m6493d() + iM6492c2;
                            c2517g3.m6503C(iM6493d3, c2517g3.m6519l() + iM6493d3);
                            m6979b(i12, c2517g3, c8552m);
                        } else if (c2514d8 == c2514d10 && c2514d9.f13756f == null) {
                            int iM6493d4 = iM6492c2 - c2514d10.m6493d();
                            c2517g3.m6503C(iM6493d4 - c2517g3.m6519l(), iM6493d4);
                            m6979b(i12, c2517g3, c8552m);
                        } else if (z10 && !c2517g3.m6526s()) {
                            m6980c(i12, c2517g3, c8552m);
                        }
                    }
                } else if (enumC2516f3 == enumC2516f4 && c2517g3.f13803q >= 0 && c2517g3.f13802p >= 0 && (c2517g3.f13786Z == 8 || (c2517g3.f13799m == 0 && c2517g3.f13776P == DefinitionKt.NO_Float_VALUE))) {
                    if (!c2517g3.m6526s() && z10 && !c2517g3.m6526s()) {
                        m6981d(i12, c2517g, c8552m, c2517g3);
                    }
                }
            }
        }
        c2517g.f13795i = true;
    }

    /* renamed from: c */
    public static void m6980c(int i10, C2517g c2517g, C8552m c8552m) {
        float f6 = c2517g.f13783W;
        C2514d c2514d = c2517g.f13761A;
        int iM6492c = c2514d.f13756f.m6492c();
        C2514d c2514d2 = c2517g.f13763C;
        int iM6492c2 = c2514d2.f13756f.m6492c();
        int iM6493d = c2514d.m6493d() + iM6492c;
        int iM6493d2 = iM6492c2 - c2514d2.m6493d();
        if (iM6492c == iM6492c2) {
            f6 = 0.5f;
        } else {
            iM6492c = iM6493d;
            iM6492c2 = iM6493d2;
        }
        int iM6519l = c2517g.m6519l();
        int i11 = (iM6492c2 - iM6492c) - iM6519l;
        if (iM6492c > iM6492c2) {
            i11 = (iM6492c - iM6492c2) - iM6519l;
        }
        int i12 = ((int) (i11 > 0 ? (f6 * i11) + 0.5f : f6 * i11)) + iM6492c;
        int i13 = i12 + iM6519l;
        if (iM6492c > iM6492c2) {
            i13 = i12 - iM6519l;
        }
        c2517g.m6503C(i12, i13);
        m6979b(i10 + 1, c2517g, c8552m);
    }

    /* renamed from: d */
    public static void m6981d(int i10, C2517g c2517g, C8552m c8552m, C2517g c2517g2) {
        float f6 = c2517g2.f13783W;
        C2514d c2514d = c2517g2.f13761A;
        int iM6493d = c2514d.m6493d() + c2514d.f13756f.m6492c();
        C2514d c2514d2 = c2517g2.f13763C;
        int iM6492c = c2514d2.f13756f.m6492c() - c2514d2.m6493d();
        if (iM6492c >= iM6493d) {
            int iM6519l = c2517g2.m6519l();
            if (c2517g2.f13786Z != 8) {
                int i11 = c2517g2.f13799m;
                if (i11 == 2) {
                    iM6519l = (int) (c2517g2.f13783W * 0.5f * (c2517g instanceof C2518h ? c2517g.m6519l() : c2517g.f13773M.m6519l()));
                } else if (i11 == 0) {
                    iM6519l = iM6492c - iM6493d;
                }
                iM6519l = Math.max(c2517g2.f13802p, iM6519l);
                int i12 = c2517g2.f13803q;
                if (i12 > 0) {
                    iM6519l = Math.min(i12, iM6519l);
                }
            }
            int i13 = iM6493d + ((int) ((f6 * ((iM6492c - iM6493d) - iM6519l)) + 0.5f));
            c2517g2.m6503C(i13, iM6519l + i13);
            m6979b(i10 + 1, c2517g2, c8552m);
        }
    }

    /* renamed from: e */
    public static void m6982e(int i10, C2517g c2517g, C8552m c8552m) {
        float f6 = c2517g.f13784X;
        C2514d c2514d = c2517g.f13762B;
        int iM6492c = c2514d.f13756f.m6492c();
        C2514d c2514d2 = c2517g.f13764D;
        int iM6492c2 = c2514d2.f13756f.m6492c();
        int iM6493d = c2514d.m6493d() + iM6492c;
        int iM6493d2 = iM6492c2 - c2514d2.m6493d();
        if (iM6492c == iM6492c2) {
            f6 = 0.5f;
        } else {
            iM6492c = iM6493d;
            iM6492c2 = iM6493d2;
        }
        int iM6518k = c2517g.m6518k();
        int i11 = (iM6492c2 - iM6492c) - iM6518k;
        if (iM6492c > iM6492c2) {
            i11 = (iM6492c - iM6492c2) - iM6518k;
        }
        int i12 = (int) (i11 > 0 ? (f6 * i11) + 0.5f : f6 * i11);
        int i13 = iM6492c + i12;
        int i14 = i13 + iM6518k;
        if (iM6492c > iM6492c2) {
            i13 = iM6492c - i12;
            i14 = i13 - iM6518k;
        }
        c2517g.m6504D(i13, i14);
        m6984g(i10 + 1, c2517g, c8552m);
    }

    /* renamed from: f */
    public static void m6983f(int i10, C2517g c2517g, C8552m c8552m, C2517g c2517g2) {
        float f6 = c2517g2.f13784X;
        C2514d c2514d = c2517g2.f13762B;
        int iM6493d = c2514d.m6493d() + c2514d.f13756f.m6492c();
        C2514d c2514d2 = c2517g2.f13764D;
        int iM6492c = c2514d2.f13756f.m6492c() - c2514d2.m6493d();
        if (iM6492c >= iM6493d) {
            int iM6518k = c2517g2.m6518k();
            if (c2517g2.f13786Z != 8) {
                int i11 = c2517g2.f13800n;
                if (i11 == 2) {
                    iM6518k = (int) (f6 * 0.5f * (c2517g instanceof C2518h ? c2517g.m6518k() : c2517g.f13773M.m6518k()));
                } else if (i11 == 0) {
                    iM6518k = iM6492c - iM6493d;
                }
                iM6518k = Math.max(c2517g2.f13805s, iM6518k);
                int i12 = c2517g2.f13806t;
                if (i12 > 0) {
                    iM6518k = Math.min(i12, iM6518k);
                }
            }
            int i13 = iM6493d + ((int) ((f6 * ((iM6492c - iM6493d) - iM6518k)) + 0.5f));
            c2517g2.m6504D(i13, iM6518k + i13);
            m6984g(i10 + 1, c2517g2, c8552m);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m6984g(int i10, C2517g c2517g, C8552m c8552m) {
        char c2;
        char c10;
        C2514d c2514d;
        C2514d c2514d2;
        float f6;
        C2514d c2514d3;
        C2514d c2514d4;
        if (c2517g.f13796j) {
            return;
        }
        if (!(c2517g instanceof C2518h) && c2517g.m6528u() && m6978a(c2517g)) {
            C2518h.m6532M(c2517g, c8552m, new C2843a());
        }
        C2514d c2514dMo6516i = c2517g.mo6516i(EnumC2513c.TOP);
        C2514d c2514dMo6516i2 = c2517g.mo6516i(EnumC2513c.BOTTOM);
        int iM6492c = c2514dMo6516i.m6492c();
        int iM6492c2 = c2514dMo6516i2.m6492c();
        HashSet hashSet = c2514dMo6516i.f13751a;
        char c11 = 1;
        if (hashSet != null && c2514dMo6516i.f13753c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C2514d c2514d5 = (C2514d) it.next();
                C2517g c2517g2 = c2514d5.f13754d;
                int i11 = i10 + 1;
                boolean zM6978a = m6978a(c2517g2);
                C2514d c2514d6 = c2517g2.f13762B;
                C2514d c2514d7 = c2517g2.f13764D;
                if (c2517g2.m6528u() && zM6978a) {
                    f6 = DefinitionKt.NO_Float_VALUE;
                    C2518h.m6532M(c2517g2, c8552m, new C2843a());
                } else {
                    f6 = DefinitionKt.NO_Float_VALUE;
                }
                char c12 = ((c2514d5 == c2514d6 && (c2514d4 = c2514d7.f13756f) != null && c2514d4.f13753c) || (c2514d5 == c2514d7 && (c2514d3 = c2514d6.f13756f) != null && c2514d3.f13753c)) ? c11 : (char) 0;
                EnumC2516f enumC2516f = c2517g2.f13772L[c11];
                char c13 = c11;
                EnumC2516f enumC2516f2 = EnumC2516f.MATCH_CONSTRAINT;
                if (enumC2516f != enumC2516f2 || zM6978a) {
                    if (!c2517g2.m6528u()) {
                        if (c2514d5 == c2514d6 && c2514d7.f13756f == null) {
                            int iM6493d = c2514d6.m6493d() + iM6492c;
                            c2517g2.m6504D(iM6493d, c2517g2.m6518k() + iM6493d);
                            m6984g(i11, c2517g2, c8552m);
                        } else if (c2514d5 == c2514d7 && c2514d6.f13756f == null) {
                            int iM6493d2 = iM6492c - c2514d7.m6493d();
                            c2517g2.m6504D(iM6493d2 - c2517g2.m6518k(), iM6493d2);
                            m6984g(i11, c2517g2, c8552m);
                        } else if (c12 != 0 && !c2517g2.m6527t()) {
                            m6982e(i11, c2517g2, c8552m);
                        }
                    }
                } else if (enumC2516f == enumC2516f2 && c2517g2.f13806t >= 0 && c2517g2.f13805s >= 0 && ((c2517g2.f13786Z == 8 || (c2517g2.f13800n == 0 && c2517g2.f13776P == f6)) && !c2517g2.m6527t() && c12 != 0 && !c2517g2.m6527t())) {
                    m6983f(i11, c2517g, c8552m, c2517g2);
                }
                c11 = c13;
            }
        }
        char c14 = c11;
        if (c2517g instanceof C2522l) {
            return;
        }
        HashSet hashSet2 = c2514dMo6516i2.f13751a;
        if (hashSet2 != null && c2514dMo6516i2.f13753c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C2514d c2514d8 = (C2514d) it2.next();
                C2517g c2517g3 = c2514d8.f13754d;
                int i12 = i10 + 1;
                boolean zM6978a2 = m6978a(c2517g3);
                C2514d c2514d9 = c2517g3.f13762B;
                C2514d c2514d10 = c2517g3.f13764D;
                if (c2517g3.m6528u() && zM6978a2) {
                    C2518h.m6532M(c2517g3, c8552m, new C2843a());
                }
                boolean z6 = ((c2514d8 == c2514d9 && (c2514d2 = c2514d10.f13756f) != null && c2514d2.f13753c) || (c2514d8 == c2514d10 && (c2514d = c2514d9.f13756f) != null && c2514d.f13753c)) ? c14 == true ? 1 : 0 : false;
                EnumC2516f enumC2516f3 = c2517g3.f13772L[c14 == true ? 1 : 0];
                EnumC2516f enumC2516f4 = EnumC2516f.MATCH_CONSTRAINT;
                if (enumC2516f3 != enumC2516f4 || zM6978a2) {
                    if (!c2517g3.m6528u()) {
                        if (c2514d8 == c2514d9 && c2514d10.f13756f == null) {
                            int iM6493d3 = c2514d9.m6493d() + iM6492c2;
                            c2517g3.m6504D(iM6493d3, c2517g3.m6518k() + iM6493d3);
                            m6984g(i12, c2517g3, c8552m);
                        } else if (c2514d8 == c2514d10 && c2514d9.f13756f == null) {
                            int iM6493d4 = iM6492c2 - c2514d10.m6493d();
                            c2517g3.m6504D(iM6493d4 - c2517g3.m6518k(), iM6493d4);
                            m6984g(i12, c2517g3, c8552m);
                        } else if (z6 && !c2517g3.m6527t()) {
                            m6982e(i12, c2517g3, c8552m);
                        }
                    }
                } else if (enumC2516f3 == enumC2516f4 && c2517g3.f13806t >= 0 && c2517g3.f13805s >= 0 && (c2517g3.f13786Z == 8 || (c2517g3.f13800n == 0 && c2517g3.f13776P == DefinitionKt.NO_Float_VALUE))) {
                    if (!c2517g3.m6527t() && z6 && !c2517g3.m6527t()) {
                        m6983f(i12, c2517g, c8552m, c2517g3);
                    }
                }
            }
        }
        C2514d c2514dMo6516i3 = c2517g.mo6516i(EnumC2513c.BASELINE);
        if (c2514dMo6516i3.f13751a != null && c2514dMo6516i3.f13753c) {
            int iM6492c3 = c2514dMo6516i3.m6492c();
            Iterator it3 = c2514dMo6516i3.f13751a.iterator();
            while (it3.hasNext()) {
                C2514d c2514d11 = (C2514d) it3.next();
                C2517g c2517g4 = c2514d11.f13754d;
                int i13 = i10 + 1;
                boolean zM6978a3 = m6978a(c2517g4);
                C2514d c2514d12 = c2517g4.f13765E;
                if (c2517g4.m6528u() && zM6978a3) {
                    C2518h.m6532M(c2517g4, c8552m, new C2843a());
                }
                if (c2517g4.f13772L[c14 == true ? 1 : 0] != EnumC2516f.MATCH_CONSTRAINT || zM6978a3) {
                    if (!c2517g4.m6528u()) {
                        if (c2514d11 == c2514d12) {
                            int iM6493d5 = c2514d11.m6493d() + iM6492c3;
                            if (c2517g4.f13812z) {
                                int i14 = iM6493d5 - c2517g4.f13780T;
                                int i15 = c2517g4.f13775O + i14;
                                c2517g4.f13779S = i14;
                                c2517g4.f13762B.m6500k(i14);
                                c2517g4.f13764D.m6500k(i15);
                                c2514d12.m6500k(iM6493d5);
                                boolean z10 = c14 == true ? 1 : 0;
                                c2517g4.f13794h = z10;
                                c2 = z10;
                            } else {
                                c2 = c14 == true ? 1 : 0;
                            }
                            m6984g(i13, c2517g4, c8552m);
                            c10 = c2;
                        }
                        c14 = c10;
                    }
                }
                c10 = c14 == true ? 1 : 0;
                c14 = c10;
            }
        }
        c2517g.f13796j = c14;
    }
}
