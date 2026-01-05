package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import p001o.rf1;
import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public abstract class ht5 {

    /* renamed from: a */
    public static rf1.C16598a f27513a = new rf1.C16598a();

    /* renamed from: b */
    public static int f27514b = 0;

    /* renamed from: c */
    public static int f27515c = 0;

    /* renamed from: a */
    public static boolean m31100a(int i, zt3 zt3Var) {
        zt3.EnumC18702b enumC18702b;
        zt3.EnumC18702b enumC18702b2;
        zt3.EnumC18702b enumC18702bM59825C = zt3Var.m59825C();
        zt3.EnumC18702b enumC18702bM59843V = zt3Var.m59843V();
        au3 au3Var = zt3Var.m59835M() != null ? (au3) zt3Var.m59835M() : null;
        if (au3Var != null) {
            au3Var.m59825C();
            zt3.EnumC18702b enumC18702b3 = zt3.EnumC18702b.FIXED;
        }
        if (au3Var != null) {
            au3Var.m59843V();
            zt3.EnumC18702b enumC18702b4 = zt3.EnumC18702b.FIXED;
        }
        zt3.EnumC18702b enumC18702b5 = zt3.EnumC18702b.FIXED;
        boolean z = enumC18702bM59825C == enumC18702b5 || zt3Var.p0() || enumC18702bM59825C == zt3.EnumC18702b.WRAP_CONTENT || (enumC18702bM59825C == (enumC18702b2 = zt3.EnumC18702b.MATCH_CONSTRAINT) && zt3Var.f57663w == 0 && zt3Var.f0 == 0.0f && zt3Var.c0(0)) || (enumC18702bM59825C == enumC18702b2 && zt3Var.f57663w == 1 && zt3Var.f0(0, zt3Var.m59846Y()));
        boolean z2 = enumC18702bM59843V == enumC18702b5 || zt3Var.q0() || enumC18702bM59843V == zt3.EnumC18702b.WRAP_CONTENT || (enumC18702bM59843V == (enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT) && zt3Var.f57664x == 0 && zt3Var.f0 == 0.0f && zt3Var.c0(1)) || (enumC18702bM59843V == enumC18702b && zt3Var.f57664x == 1 && zt3Var.f0(1, zt3Var.m59866z()));
        if (zt3Var.f0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* renamed from: b */
    public static void m31101b(int i, zt3 zt3Var, rf1.InterfaceC16599b interfaceC16599b, boolean z) {
        tt3 tt3Var;
        tt3 tt3Var2;
        tt3 tt3Var3;
        tt3 tt3Var4;
        if (zt3Var.i0()) {
            return;
        }
        boolean z2 = true;
        f27514b++;
        if (!(zt3Var instanceof au3) && zt3Var.o0()) {
            int i2 = i + 1;
            if (m31100a(i2, zt3Var)) {
                au3.Y1(i2, zt3Var, interfaceC16599b, new rf1.C16598a(), rf1.C16598a.f43467k);
            }
        }
        tt3 tt3VarMo47185q = zt3Var.mo47185q(tt3.EnumC17197a.LEFT);
        tt3 tt3VarMo47185q2 = zt3Var.mo47185q(tt3.EnumC17197a.RIGHT);
        int iM50472e = tt3VarMo47185q.m50472e();
        int iM50472e2 = tt3VarMo47185q2.m50472e();
        if (tt3VarMo47185q.m50471d() != null && tt3VarMo47185q.m50481n()) {
            Iterator it = tt3VarMo47185q.m50471d().iterator();
            while (it.hasNext()) {
                tt3 tt3Var5 = (tt3) it.next();
                zt3 zt3Var2 = tt3Var5.f47685d;
                int i3 = i + 1;
                boolean zM31100a = m31100a(i3, zt3Var2);
                if (zt3Var2.o0() && zM31100a) {
                    au3.Y1(i3, zt3Var2, interfaceC16599b, new rf1.C16598a(), rf1.C16598a.f43467k);
                }
                boolean z3 = ((tt3Var5 == zt3Var2.f57631Q && (tt3Var4 = zt3Var2.f57633S.f47687f) != null && tt3Var4.m50481n()) || (tt3Var5 == zt3Var2.f57633S && (tt3Var3 = zt3Var2.f57631Q.f47687f) != null && tt3Var3.m50481n())) ? z2 : false;
                zt3.EnumC18702b enumC18702bM59825C = zt3Var2.m59825C();
                zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (enumC18702bM59825C != enumC18702b || zM31100a) {
                    if (!zt3Var2.o0()) {
                        tt3 tt3Var6 = zt3Var2.f57631Q;
                        if (tt3Var5 == tt3Var6 && zt3Var2.f57633S.f47687f == null) {
                            int iM50473f = tt3Var6.m50473f() + iM50472e;
                            zt3Var2.K0(iM50473f, zt3Var2.m59846Y() + iM50473f);
                            m31101b(i3, zt3Var2, interfaceC16599b, z);
                        } else {
                            tt3 tt3Var7 = zt3Var2.f57633S;
                            if (tt3Var5 == tt3Var7 && tt3Var6.f47687f == null) {
                                int iM50473f2 = iM50472e - tt3Var7.m50473f();
                                zt3Var2.K0(iM50473f2 - zt3Var2.m59846Y(), iM50473f2);
                                m31101b(i3, zt3Var2, interfaceC16599b, z);
                            } else if (z3 && !zt3Var2.k0()) {
                                m31103d(i3, interfaceC16599b, zt3Var2, z);
                            }
                        }
                    }
                } else if (zt3Var2.m59825C() == enumC18702b && zt3Var2.f57615A >= 0 && zt3Var2.f57666z >= 0 && ((zt3Var2.m59845X() == 8 || (zt3Var2.f57663w == 0 && zt3Var2.m59864x() == 0.0f)) && !zt3Var2.k0() && !zt3Var2.n0() && z3 && !zt3Var2.k0())) {
                    m31104e(i3, zt3Var, interfaceC16599b, zt3Var2, z);
                }
                z2 = true;
            }
        }
        if (zt3Var instanceof rv7) {
            return;
        }
        if (tt3VarMo47185q2.m50471d() != null && tt3VarMo47185q2.m50481n()) {
            Iterator it2 = tt3VarMo47185q2.m50471d().iterator();
            while (it2.hasNext()) {
                tt3 tt3Var8 = (tt3) it2.next();
                zt3 zt3Var3 = tt3Var8.f47685d;
                int i4 = i + 1;
                boolean zM31100a2 = m31100a(i4, zt3Var3);
                if (zt3Var3.o0() && zM31100a2) {
                    au3.Y1(i4, zt3Var3, interfaceC16599b, new rf1.C16598a(), rf1.C16598a.f43467k);
                }
                boolean z4 = (tt3Var8 == zt3Var3.f57631Q && (tt3Var2 = zt3Var3.f57633S.f47687f) != null && tt3Var2.m50481n()) || (tt3Var8 == zt3Var3.f57633S && (tt3Var = zt3Var3.f57631Q.f47687f) != null && tt3Var.m50481n());
                zt3.EnumC18702b enumC18702bM59825C2 = zt3Var3.m59825C();
                zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (enumC18702bM59825C2 != enumC18702b2 || zM31100a2) {
                    if (!zt3Var3.o0()) {
                        tt3 tt3Var9 = zt3Var3.f57631Q;
                        if (tt3Var8 == tt3Var9 && zt3Var3.f57633S.f47687f == null) {
                            int iM50473f3 = tt3Var9.m50473f() + iM50472e2;
                            zt3Var3.K0(iM50473f3, zt3Var3.m59846Y() + iM50473f3);
                            m31101b(i4, zt3Var3, interfaceC16599b, z);
                        } else {
                            tt3 tt3Var10 = zt3Var3.f57633S;
                            if (tt3Var8 == tt3Var10 && tt3Var9.f47687f == null) {
                                int iM50473f4 = iM50472e2 - tt3Var10.m50473f();
                                zt3Var3.K0(iM50473f4 - zt3Var3.m59846Y(), iM50473f4);
                                m31101b(i4, zt3Var3, interfaceC16599b, z);
                            } else if (z4 && !zt3Var3.k0()) {
                                m31103d(i4, interfaceC16599b, zt3Var3, z);
                            }
                        }
                    }
                } else if (zt3Var3.m59825C() == enumC18702b2 && zt3Var3.f57615A >= 0 && zt3Var3.f57666z >= 0 && (zt3Var3.m59845X() == 8 || (zt3Var3.f57663w == 0 && zt3Var3.m59864x() == 0.0f))) {
                    if (!zt3Var3.k0() && !zt3Var3.n0() && z4 && !zt3Var3.k0()) {
                        m31104e(i4, zt3Var, interfaceC16599b, zt3Var3, z);
                    }
                }
            }
        }
        zt3Var.s0();
    }

    /* renamed from: c */
    public static void m31102c(int i, ya1 ya1Var, rf1.InterfaceC16599b interfaceC16599b, int i2, boolean z) {
        if (ya1Var.y1()) {
            if (i2 == 0) {
                m31101b(i + 1, ya1Var, interfaceC16599b, z);
            } else {
                m31108i(i + 1, ya1Var, interfaceC16599b);
            }
        }
    }

    /* renamed from: d */
    public static void m31103d(int i, rf1.InterfaceC16599b interfaceC16599b, zt3 zt3Var, boolean z) {
        float fM59823A = zt3Var.m59823A();
        int iM50472e = zt3Var.f57631Q.f47687f.m50472e();
        int iM50472e2 = zt3Var.f57633S.f47687f.m50472e();
        int iM50473f = zt3Var.f57631Q.m50473f() + iM50472e;
        int iM50473f2 = iM50472e2 - zt3Var.f57633S.m50473f();
        if (iM50472e == iM50472e2) {
            fM59823A = 0.5f;
        } else {
            iM50472e = iM50473f;
            iM50472e2 = iM50473f2;
        }
        int iM59846Y = zt3Var.m59846Y();
        int i2 = (iM50472e2 - iM50472e) - iM59846Y;
        if (iM50472e > iM50472e2) {
            i2 = (iM50472e - iM50472e2) - iM59846Y;
        }
        int i3 = ((int) (i2 > 0 ? (fM59823A * i2) + 0.5f : fM59823A * i2)) + iM50472e;
        int i4 = i3 + iM59846Y;
        if (iM50472e > iM50472e2) {
            i4 = i3 - iM59846Y;
        }
        zt3Var.K0(i3, i4);
        m31101b(i + 1, zt3Var, interfaceC16599b, z);
    }

    /* renamed from: e */
    public static void m31104e(int i, zt3 zt3Var, rf1.InterfaceC16599b interfaceC16599b, zt3 zt3Var2, boolean z) {
        float fM59823A = zt3Var2.m59823A();
        int iM50472e = zt3Var2.f57631Q.f47687f.m50472e() + zt3Var2.f57631Q.m50473f();
        int iM50472e2 = zt3Var2.f57633S.f47687f.m50472e() - zt3Var2.f57633S.m50473f();
        if (iM50472e2 >= iM50472e) {
            int iM59846Y = zt3Var2.m59846Y();
            if (zt3Var2.m59845X() != 8) {
                int i2 = zt3Var2.f57663w;
                if (i2 == 2) {
                    iM59846Y = (int) (zt3Var2.m59823A() * 0.5f * (zt3Var instanceof au3 ? zt3Var.m59846Y() : zt3Var.m59835M().m59846Y()));
                } else if (i2 == 0) {
                    iM59846Y = iM50472e2 - iM50472e;
                }
                iM59846Y = Math.max(zt3Var2.f57666z, iM59846Y);
                int i3 = zt3Var2.f57615A;
                if (i3 > 0) {
                    iM59846Y = Math.min(i3, iM59846Y);
                }
            }
            int i4 = iM50472e + ((int) ((fM59823A * ((iM50472e2 - iM50472e) - iM59846Y)) + 0.5f));
            zt3Var2.K0(i4, iM59846Y + i4);
            m31101b(i + 1, zt3Var2, interfaceC16599b, z);
        }
    }

    /* renamed from: f */
    public static void m31105f(int i, rf1.InterfaceC16599b interfaceC16599b, zt3 zt3Var) {
        float fM59841T = zt3Var.m59841T();
        int iM50472e = zt3Var.f57632R.f47687f.m50472e();
        int iM50472e2 = zt3Var.f57634T.f47687f.m50472e();
        int iM50473f = zt3Var.f57632R.m50473f() + iM50472e;
        int iM50473f2 = iM50472e2 - zt3Var.f57634T.m50473f();
        if (iM50472e == iM50472e2) {
            fM59841T = 0.5f;
        } else {
            iM50472e = iM50473f;
            iM50472e2 = iM50473f2;
        }
        int iM59866z = zt3Var.m59866z();
        int i2 = (iM50472e2 - iM50472e) - iM59866z;
        if (iM50472e > iM50472e2) {
            i2 = (iM50472e - iM50472e2) - iM59866z;
        }
        int i3 = (int) (i2 > 0 ? (fM59841T * i2) + 0.5f : fM59841T * i2);
        int i4 = iM50472e + i3;
        int i5 = i4 + iM59866z;
        if (iM50472e > iM50472e2) {
            i4 = iM50472e - i3;
            i5 = i4 - iM59866z;
        }
        zt3Var.N0(i4, i5);
        m31108i(i + 1, zt3Var, interfaceC16599b);
    }

    /* renamed from: g */
    public static void m31106g(int i, zt3 zt3Var, rf1.InterfaceC16599b interfaceC16599b, zt3 zt3Var2) {
        float fM59841T = zt3Var2.m59841T();
        int iM50472e = zt3Var2.f57632R.f47687f.m50472e() + zt3Var2.f57632R.m50473f();
        int iM50472e2 = zt3Var2.f57634T.f47687f.m50472e() - zt3Var2.f57634T.m50473f();
        if (iM50472e2 >= iM50472e) {
            int iM59866z = zt3Var2.m59866z();
            if (zt3Var2.m59845X() != 8) {
                int i2 = zt3Var2.f57664x;
                if (i2 == 2) {
                    iM59866z = (int) (fM59841T * 0.5f * (zt3Var instanceof au3 ? zt3Var.m59866z() : zt3Var.m59835M().m59866z()));
                } else if (i2 == 0) {
                    iM59866z = iM50472e2 - iM50472e;
                }
                iM59866z = Math.max(zt3Var2.f57617C, iM59866z);
                int i3 = zt3Var2.f57618D;
                if (i3 > 0) {
                    iM59866z = Math.min(i3, iM59866z);
                }
            }
            int i4 = iM50472e + ((int) ((fM59841T * ((iM50472e2 - iM50472e) - iM59866z)) + 0.5f));
            zt3Var2.N0(i4, iM59866z + i4);
            m31108i(i + 1, zt3Var2, interfaceC16599b);
        }
    }

    /* renamed from: h */
    public static void m31107h(au3 au3Var, rf1.InterfaceC16599b interfaceC16599b) {
        zt3.EnumC18702b enumC18702bM59825C = au3Var.m59825C();
        zt3.EnumC18702b enumC18702bM59843V = au3Var.m59843V();
        f27514b = 0;
        f27515c = 0;
        au3Var.y0();
        ArrayList arrayListW1 = au3Var.w1();
        int size = arrayListW1.size();
        for (int i = 0; i < size; i++) {
            ((zt3) arrayListW1.get(i)).y0();
        }
        boolean zV1 = au3Var.V1();
        if (enumC18702bM59825C == zt3.EnumC18702b.FIXED) {
            au3Var.K0(0, au3Var.m59846Y());
        } else {
            au3Var.L0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            zt3 zt3Var = (zt3) arrayListW1.get(i2);
            if (zt3Var instanceof rv7) {
                rv7 rv7Var = (rv7) zt3Var;
                if (rv7Var.x1() == 1) {
                    if (rv7Var.y1() != -1) {
                        rv7Var.B1(rv7Var.y1());
                    } else if (rv7Var.z1() != -1 && au3Var.p0()) {
                        rv7Var.B1(au3Var.m59846Y() - rv7Var.z1());
                    } else if (au3Var.p0()) {
                        rv7Var.B1((int) ((rv7Var.A1() * au3Var.m59846Y()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((zt3Var instanceof ya1) && ((ya1) zt3Var).C1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                zt3 zt3Var2 = (zt3) arrayListW1.get(i3);
                if (zt3Var2 instanceof rv7) {
                    rv7 rv7Var2 = (rv7) zt3Var2;
                    if (rv7Var2.x1() == 1) {
                        m31101b(0, rv7Var2, interfaceC16599b, zV1);
                    }
                }
            }
        }
        m31101b(0, au3Var, interfaceC16599b, zV1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                zt3 zt3Var3 = (zt3) arrayListW1.get(i4);
                if (zt3Var3 instanceof ya1) {
                    ya1 ya1Var = (ya1) zt3Var3;
                    if (ya1Var.C1() == 0) {
                        m31102c(0, ya1Var, interfaceC16599b, 0, zV1);
                    }
                }
            }
        }
        if (enumC18702bM59843V == zt3.EnumC18702b.FIXED) {
            au3Var.N0(0, au3Var.m59866z());
        } else {
            au3Var.M0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            zt3 zt3Var4 = (zt3) arrayListW1.get(i5);
            if (zt3Var4 instanceof rv7) {
                rv7 rv7Var3 = (rv7) zt3Var4;
                if (rv7Var3.x1() == 0) {
                    if (rv7Var3.y1() != -1) {
                        rv7Var3.B1(rv7Var3.y1());
                    } else if (rv7Var3.z1() != -1 && au3Var.q0()) {
                        rv7Var3.B1(au3Var.m59866z() - rv7Var3.z1());
                    } else if (au3Var.q0()) {
                        rv7Var3.B1((int) ((rv7Var3.A1() * au3Var.m59866z()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((zt3Var4 instanceof ya1) && ((ya1) zt3Var4).C1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                zt3 zt3Var5 = (zt3) arrayListW1.get(i6);
                if (zt3Var5 instanceof rv7) {
                    rv7 rv7Var4 = (rv7) zt3Var5;
                    if (rv7Var4.x1() == 0) {
                        m31108i(1, rv7Var4, interfaceC16599b);
                    }
                }
            }
        }
        m31108i(0, au3Var, interfaceC16599b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                zt3 zt3Var6 = (zt3) arrayListW1.get(i7);
                if (zt3Var6 instanceof ya1) {
                    ya1 ya1Var2 = (ya1) zt3Var6;
                    if (ya1Var2.C1() == 1) {
                        m31102c(0, ya1Var2, interfaceC16599b, 1, zV1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            zt3 zt3Var7 = (zt3) arrayListW1.get(i8);
            if (zt3Var7.o0() && m31100a(0, zt3Var7)) {
                au3.Y1(0, zt3Var7, interfaceC16599b, f27513a, rf1.C16598a.f43467k);
                if (!(zt3Var7 instanceof rv7)) {
                    m31101b(0, zt3Var7, interfaceC16599b, zV1);
                    m31108i(0, zt3Var7, interfaceC16599b);
                } else if (((rv7) zt3Var7).x1() == 0) {
                    m31108i(0, zt3Var7, interfaceC16599b);
                } else {
                    m31101b(0, zt3Var7, interfaceC16599b, zV1);
                }
            }
        }
    }

    /* renamed from: i */
    public static void m31108i(int i, zt3 zt3Var, rf1.InterfaceC16599b interfaceC16599b) {
        tt3 tt3Var;
        tt3 tt3Var2;
        tt3 tt3Var3;
        tt3 tt3Var4;
        if (zt3Var.r0()) {
            return;
        }
        f27515c++;
        if (!(zt3Var instanceof au3) && zt3Var.o0()) {
            int i2 = i + 1;
            if (m31100a(i2, zt3Var)) {
                au3.Y1(i2, zt3Var, interfaceC16599b, new rf1.C16598a(), rf1.C16598a.f43467k);
            }
        }
        tt3 tt3VarMo47185q = zt3Var.mo47185q(tt3.EnumC17197a.TOP);
        tt3 tt3VarMo47185q2 = zt3Var.mo47185q(tt3.EnumC17197a.BOTTOM);
        int iM50472e = tt3VarMo47185q.m50472e();
        int iM50472e2 = tt3VarMo47185q2.m50472e();
        if (tt3VarMo47185q.m50471d() != null && tt3VarMo47185q.m50481n()) {
            Iterator it = tt3VarMo47185q.m50471d().iterator();
            while (it.hasNext()) {
                tt3 tt3Var5 = (tt3) it.next();
                zt3 zt3Var2 = tt3Var5.f47685d;
                int i3 = i + 1;
                boolean zM31100a = m31100a(i3, zt3Var2);
                if (zt3Var2.o0() && zM31100a) {
                    au3.Y1(i3, zt3Var2, interfaceC16599b, new rf1.C16598a(), rf1.C16598a.f43467k);
                }
                boolean z = (tt3Var5 == zt3Var2.f57632R && (tt3Var4 = zt3Var2.f57634T.f47687f) != null && tt3Var4.m50481n()) || (tt3Var5 == zt3Var2.f57634T && (tt3Var3 = zt3Var2.f57632R.f47687f) != null && tt3Var3.m50481n());
                zt3.EnumC18702b enumC18702bM59843V = zt3Var2.m59843V();
                zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (enumC18702bM59843V != enumC18702b || zM31100a) {
                    if (!zt3Var2.o0()) {
                        tt3 tt3Var6 = zt3Var2.f57632R;
                        if (tt3Var5 == tt3Var6 && zt3Var2.f57634T.f47687f == null) {
                            int iM50473f = tt3Var6.m50473f() + iM50472e;
                            zt3Var2.N0(iM50473f, zt3Var2.m59866z() + iM50473f);
                            m31108i(i3, zt3Var2, interfaceC16599b);
                        } else {
                            tt3 tt3Var7 = zt3Var2.f57634T;
                            if (tt3Var5 == tt3Var7 && tt3Var6.f47687f == null) {
                                int iM50473f2 = iM50472e - tt3Var7.m50473f();
                                zt3Var2.N0(iM50473f2 - zt3Var2.m59866z(), iM50473f2);
                                m31108i(i3, zt3Var2, interfaceC16599b);
                            } else if (z && !zt3Var2.m0()) {
                                m31105f(i3, interfaceC16599b, zt3Var2);
                            }
                        }
                    }
                } else if (zt3Var2.m59843V() == enumC18702b && zt3Var2.f57618D >= 0 && zt3Var2.f57617C >= 0 && (zt3Var2.m59845X() == 8 || (zt3Var2.f57664x == 0 && zt3Var2.m59864x() == 0.0f))) {
                    if (!zt3Var2.m0() && !zt3Var2.n0() && z && !zt3Var2.m0()) {
                        m31106g(i3, zt3Var, interfaceC16599b, zt3Var2);
                    }
                }
            }
        }
        if (zt3Var instanceof rv7) {
            return;
        }
        if (tt3VarMo47185q2.m50471d() != null && tt3VarMo47185q2.m50481n()) {
            Iterator it2 = tt3VarMo47185q2.m50471d().iterator();
            while (it2.hasNext()) {
                tt3 tt3Var8 = (tt3) it2.next();
                zt3 zt3Var3 = tt3Var8.f47685d;
                int i4 = i + 1;
                boolean zM31100a2 = m31100a(i4, zt3Var3);
                if (zt3Var3.o0() && zM31100a2) {
                    au3.Y1(i4, zt3Var3, interfaceC16599b, new rf1.C16598a(), rf1.C16598a.f43467k);
                }
                boolean z2 = (tt3Var8 == zt3Var3.f57632R && (tt3Var2 = zt3Var3.f57634T.f47687f) != null && tt3Var2.m50481n()) || (tt3Var8 == zt3Var3.f57634T && (tt3Var = zt3Var3.f57632R.f47687f) != null && tt3Var.m50481n());
                zt3.EnumC18702b enumC18702bM59843V2 = zt3Var3.m59843V();
                zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.MATCH_CONSTRAINT;
                if (enumC18702bM59843V2 != enumC18702b2 || zM31100a2) {
                    if (!zt3Var3.o0()) {
                        tt3 tt3Var9 = zt3Var3.f57632R;
                        if (tt3Var8 == tt3Var9 && zt3Var3.f57634T.f47687f == null) {
                            int iM50473f3 = tt3Var9.m50473f() + iM50472e2;
                            zt3Var3.N0(iM50473f3, zt3Var3.m59866z() + iM50473f3);
                            m31108i(i4, zt3Var3, interfaceC16599b);
                        } else {
                            tt3 tt3Var10 = zt3Var3.f57634T;
                            if (tt3Var8 == tt3Var10 && tt3Var9.f47687f == null) {
                                int iM50473f4 = iM50472e2 - tt3Var10.m50473f();
                                zt3Var3.N0(iM50473f4 - zt3Var3.m59866z(), iM50473f4);
                                m31108i(i4, zt3Var3, interfaceC16599b);
                            } else if (z2 && !zt3Var3.m0()) {
                                m31105f(i4, interfaceC16599b, zt3Var3);
                            }
                        }
                    }
                } else if (zt3Var3.m59843V() == enumC18702b2 && zt3Var3.f57618D >= 0 && zt3Var3.f57617C >= 0 && (zt3Var3.m59845X() == 8 || (zt3Var3.f57664x == 0 && zt3Var3.m59864x() == 0.0f))) {
                    if (!zt3Var3.m0() && !zt3Var3.n0() && z2 && !zt3Var3.m0()) {
                        m31106g(i4, zt3Var, interfaceC16599b, zt3Var3);
                    }
                }
            }
        }
        tt3 tt3VarMo47185q3 = zt3Var.mo47185q(tt3.EnumC17197a.BASELINE);
        if (tt3VarMo47185q3.m50471d() != null && tt3VarMo47185q3.m50481n()) {
            int iM50472e3 = tt3VarMo47185q3.m50472e();
            Iterator it3 = tt3VarMo47185q3.m50471d().iterator();
            while (it3.hasNext()) {
                tt3 tt3Var11 = (tt3) it3.next();
                zt3 zt3Var4 = tt3Var11.f47685d;
                int i5 = i + 1;
                boolean zM31100a3 = m31100a(i5, zt3Var4);
                if (zt3Var4.o0() && zM31100a3) {
                    au3.Y1(i5, zt3Var4, interfaceC16599b, new rf1.C16598a(), rf1.C16598a.f43467k);
                }
                if (zt3Var4.m59843V() != zt3.EnumC18702b.MATCH_CONSTRAINT || zM31100a3) {
                    if (!zt3Var4.o0() && tt3Var11 == zt3Var4.f57635U) {
                        zt3Var4.J0(tt3Var11.m50473f() + iM50472e3);
                        m31108i(i5, zt3Var4, interfaceC16599b);
                    }
                }
            }
        }
        zt3Var.t0();
    }
}
