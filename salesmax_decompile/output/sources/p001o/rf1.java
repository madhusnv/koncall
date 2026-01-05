package p001o;

import java.util.ArrayList;
import p001o.tt3;
import p001o.zt3;

/* loaded from: classes2.dex */
public class rf1 {

    /* renamed from: a */
    public final ArrayList f43464a = new ArrayList();

    /* renamed from: b */
    public C16598a f43465b = new C16598a();

    /* renamed from: c */
    public au3 f43466c;

    /* renamed from: o.rf1$a */
    public static class C16598a {

        /* renamed from: k */
        public static int f43467k = 0;

        /* renamed from: l */
        public static int f43468l = 1;

        /* renamed from: m */
        public static int f43469m = 2;

        /* renamed from: a */
        public zt3.EnumC18702b f43470a;

        /* renamed from: b */
        public zt3.EnumC18702b f43471b;

        /* renamed from: c */
        public int f43472c;

        /* renamed from: d */
        public int f43473d;

        /* renamed from: e */
        public int f43474e;

        /* renamed from: f */
        public int f43475f;

        /* renamed from: g */
        public int f43476g;

        /* renamed from: h */
        public boolean f43477h;

        /* renamed from: i */
        public boolean f43478i;

        /* renamed from: j */
        public int f43479j;
    }

    /* renamed from: o.rf1$b */
    public interface InterfaceC16599b {
        /* renamed from: a */
        void mo5625a();

        /* renamed from: b */
        void mo5626b(zt3 zt3Var, C16598a c16598a);
    }

    public rf1(au3 au3Var) {
        this.f43466c = au3Var;
    }

    /* renamed from: a */
    public final boolean m46630a(InterfaceC16599b interfaceC16599b, zt3 zt3Var, int i) {
        this.f43465b.f43470a = zt3Var.m59825C();
        this.f43465b.f43471b = zt3Var.m59843V();
        this.f43465b.f43472c = zt3Var.m59846Y();
        this.f43465b.f43473d = zt3Var.m59866z();
        C16598a c16598a = this.f43465b;
        c16598a.f43478i = false;
        c16598a.f43479j = i;
        zt3.EnumC18702b enumC18702b = c16598a.f43470a;
        zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.MATCH_CONSTRAINT;
        boolean z = enumC18702b == enumC18702b2;
        boolean z2 = c16598a.f43471b == enumC18702b2;
        boolean z3 = z && zt3Var.f0 > 0.0f;
        boolean z4 = z2 && zt3Var.f0 > 0.0f;
        if (z3 && zt3Var.f57665y[0] == 4) {
            c16598a.f43470a = zt3.EnumC18702b.FIXED;
        }
        if (z4 && zt3Var.f57665y[1] == 4) {
            c16598a.f43471b = zt3.EnumC18702b.FIXED;
        }
        interfaceC16599b.mo5626b(zt3Var, c16598a);
        zt3Var.p1(this.f43465b.f43474e);
        zt3Var.Q0(this.f43465b.f43475f);
        zt3Var.P0(this.f43465b.f43477h);
        zt3Var.F0(this.f43465b.f43476g);
        C16598a c16598a2 = this.f43465b;
        c16598a2.f43479j = C16598a.f43467k;
        return c16598a2.f43478i;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r10
      0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a0 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m46631b(au3 au3Var) {
        x08 x08Var;
        bui buiVar;
        int size = au3Var.V0.size();
        boolean zZ1 = au3Var.Z1(64);
        InterfaceC16599b interfaceC16599bO1 = au3Var.O1();
        for (int i = 0; i < size; i++) {
            zt3 zt3Var = (zt3) au3Var.V0.get(i);
            if (!(zt3Var instanceof rv7) && !(zt3Var instanceof ya1) && !zt3Var.n0() && (!zZ1 || (x08Var = zt3Var.f57645e) == null || (buiVar = zt3Var.f57646f) == null || !x08Var.f43165e.f21869j || !buiVar.f43165e.f21869j)) {
                zt3.EnumC18702b enumC18702bM59863w = zt3Var.m59863w(0);
                boolean z = true;
                zt3.EnumC18702b enumC18702bM59863w2 = zt3Var.m59863w(1);
                zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT;
                boolean z2 = enumC18702bM59863w == enumC18702b && zt3Var.f57663w != 1 && enumC18702bM59863w2 == enumC18702b && zt3Var.f57664x != 1;
                if (z2 || !au3Var.Z1(1) || (zt3Var instanceof x0j)) {
                    z = z2;
                    if (z) {
                        m46630a(interfaceC16599bO1, zt3Var, C16598a.f43467k);
                    }
                } else {
                    if (enumC18702bM59863w == enumC18702b && zt3Var.f57663w == 0 && enumC18702bM59863w2 != enumC18702b && !zt3Var.k0()) {
                        z2 = true;
                    }
                    if (enumC18702bM59863w2 == enumC18702b && zt3Var.f57664x == 0 && enumC18702bM59863w != enumC18702b && !zt3Var.k0()) {
                        z2 = true;
                    }
                    if ((enumC18702bM59863w != enumC18702b && enumC18702bM59863w2 != enumC18702b) || zt3Var.f0 <= 0.0f) {
                    }
                    if (z) {
                    }
                }
            }
        }
        interfaceC16599bO1.mo5625a();
    }

    /* renamed from: c */
    public final void m46632c(au3 au3Var, String str, int i, int i2, int i3) {
        au3Var.getClass();
        int iM59833K = au3Var.m59833K();
        int iM59832J = au3Var.m59832J();
        au3Var.f1(0);
        au3Var.e1(0);
        au3Var.p1(i2);
        au3Var.Q0(i3);
        au3Var.f1(iM59833K);
        au3Var.e1(iM59832J);
        this.f43466c.d2(i);
        this.f43466c.x1();
    }

    /* renamed from: d */
    public long m46633d(au3 au3Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zM1;
        int i10;
        au3 au3Var2;
        int i11;
        boolean z;
        int i12;
        int i13;
        boolean z2;
        rf1 rf1Var = this;
        InterfaceC16599b interfaceC16599bO1 = au3Var.O1();
        int size = au3Var.V0.size();
        int iM59846Y = au3Var.m59846Y();
        int iM59866z = au3Var.m59866z();
        boolean zM37039b = lec.m37039b(i, 128);
        boolean z3 = zM37039b || lec.m37039b(i, 64);
        if (z3) {
            for (int i14 = 0; i14 < size; i14++) {
                zt3 zt3Var = (zt3) au3Var.V0.get(i14);
                zt3.EnumC18702b enumC18702bM59825C = zt3Var.m59825C();
                zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT;
                boolean z4 = (enumC18702bM59825C == enumC18702b) && (zt3Var.m59843V() == enumC18702b) && zt3Var.m59864x() > 0.0f;
                if ((zt3Var.k0() && z4) || ((zt3Var.m0() && z4) || (zt3Var instanceof x0j) || zt3Var.k0() || zt3Var.m0())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3) {
            boolean z5 = sda.f45258s;
        }
        boolean z6 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zM37039b);
        int i15 = 2;
        if (z6) {
            int iMin = Math.min(au3Var.m59831I(), i5);
            int iMin2 = Math.min(au3Var.m59830H(), i7);
            if (i4 == 1073741824 && au3Var.m59846Y() != iMin) {
                au3Var.p1(iMin);
                au3Var.S1();
            }
            if (i6 == 1073741824 && au3Var.m59866z() != iMin2) {
                au3Var.Q0(iMin2);
                au3Var.S1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zM1 = au3Var.K1(zM37039b);
                i10 = 2;
            } else {
                boolean zL1 = au3Var.L1(zM37039b);
                if (i4 == 1073741824) {
                    zL1 &= au3Var.M1(zM37039b, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zM1 = au3Var.M1(zM37039b, 1) & zL1;
                    i10++;
                } else {
                    zM1 = zL1;
                }
            }
            if (zM1) {
                au3Var.u1(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zM1 = false;
            i10 = 0;
        }
        if (zM1 && i10 == 2) {
            return 0L;
        }
        int iP1 = au3Var.P1();
        if (size > 0) {
            m46631b(au3Var);
        }
        m46634e(au3Var);
        int size2 = rf1Var.f43464a.size();
        if (size > 0) {
            m46632c(au3Var, "First pass", 0, iM59846Y, iM59866z);
        }
        if (size2 > 0) {
            zt3.EnumC18702b enumC18702bM59825C2 = au3Var.m59825C();
            zt3.EnumC18702b enumC18702b2 = zt3.EnumC18702b.WRAP_CONTENT;
            boolean z7 = enumC18702bM59825C2 == enumC18702b2;
            boolean z8 = au3Var.m59843V() == enumC18702b2;
            int iMax = Math.max(au3Var.m59846Y(), rf1Var.f43466c.m59833K());
            int iMax2 = Math.max(au3Var.m59866z(), rf1Var.f43466c.m59832J());
            int i16 = 0;
            boolean zK1 = false;
            while (i16 < size2) {
                zt3 zt3Var2 = (zt3) rf1Var.f43464a.get(i16);
                if (zt3Var2 instanceof x0j) {
                    int iM59846Y2 = zt3Var2.m59846Y();
                    int iM59866z2 = zt3Var2.m59866z();
                    i13 = iP1;
                    boolean zM46630a = rf1Var.m46630a(interfaceC16599bO1, zt3Var2, C16598a.f43468l) | zK1;
                    int iM59846Y3 = zt3Var2.m59846Y();
                    int iM59866z3 = zt3Var2.m59866z();
                    if (iM59846Y3 != iM59846Y2) {
                        zt3Var2.p1(iM59846Y3);
                        if (z7 && zt3Var2.m59837O() > iMax) {
                            iMax = Math.max(iMax, zt3Var2.m59837O() + zt3Var2.mo47185q(tt3.EnumC17197a.RIGHT).m50473f());
                        }
                        z2 = true;
                    } else {
                        z2 = zM46630a;
                    }
                    if (iM59866z3 != iM59866z2) {
                        zt3Var2.Q0(iM59866z3);
                        if (z8 && zt3Var2.m59860t() > iMax2) {
                            iMax2 = Math.max(iMax2, zt3Var2.m59860t() + zt3Var2.mo47185q(tt3.EnumC17197a.BOTTOM).m50473f());
                        }
                        z2 = true;
                    }
                    zK1 = z2 | ((x0j) zt3Var2).K1();
                } else {
                    i13 = iP1;
                }
                i16++;
                iP1 = i13;
                i15 = 2;
            }
            int i17 = iP1;
            int i18 = i15;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = 0;
                while (i20 < size2) {
                    zt3 zt3Var3 = (zt3) rf1Var.f43464a.get(i20);
                    if (((zt3Var3 instanceof by7) && !(zt3Var3 instanceof x0j)) || (zt3Var3 instanceof rv7) || zt3Var3.m59845X() == 8 || ((z6 && zt3Var3.f57645e.f43165e.f21869j && zt3Var3.f57646f.f43165e.f21869j) || (zt3Var3 instanceof x0j))) {
                        z = z6;
                        i12 = size2;
                    } else {
                        int iM59846Y4 = zt3Var3.m59846Y();
                        int iM59866z4 = zt3Var3.m59866z();
                        z = z6;
                        int iM59858r = zt3Var3.m59858r();
                        int i21 = C16598a.f43468l;
                        i12 = size2;
                        if (i19 == 1) {
                            i21 = C16598a.f43469m;
                        }
                        boolean zM46630a2 = rf1Var.m46630a(interfaceC16599bO1, zt3Var3, i21) | zK1;
                        int iM59846Y5 = zt3Var3.m59846Y();
                        int iM59866z5 = zt3Var3.m59866z();
                        if (iM59846Y5 != iM59846Y4) {
                            zt3Var3.p1(iM59846Y5);
                            if (z7 && zt3Var3.m59837O() > iMax) {
                                iMax = Math.max(iMax, zt3Var3.m59837O() + zt3Var3.mo47185q(tt3.EnumC17197a.RIGHT).m50473f());
                            }
                            zM46630a2 = true;
                        }
                        if (iM59866z5 != iM59866z4) {
                            zt3Var3.Q0(iM59866z5);
                            if (z8 && zt3Var3.m59860t() > iMax2) {
                                iMax2 = Math.max(iMax2, zt3Var3.m59860t() + zt3Var3.mo47185q(tt3.EnumC17197a.BOTTOM).m50473f());
                            }
                            zM46630a2 = true;
                        }
                        zK1 = (!zt3Var3.b0() || iM59858r == zt3Var3.m59858r()) ? zM46630a2 : true;
                    }
                    i20++;
                    rf1Var = this;
                    z6 = z;
                    size2 = i12;
                }
                boolean z9 = z6;
                int i22 = size2;
                if (!zK1) {
                    break;
                }
                i19++;
                m46632c(au3Var, "intermediate pass", i19, iM59846Y, iM59866z);
                rf1Var = this;
                z6 = z9;
                size2 = i22;
                i18 = 2;
                zK1 = false;
            }
            au3Var2 = au3Var;
            i11 = i17;
        } else {
            au3Var2 = au3Var;
            i11 = iP1;
        }
        au3Var2.c2(i11);
        return 0L;
    }

    /* renamed from: e */
    public void m46634e(au3 au3Var) {
        this.f43464a.clear();
        int size = au3Var.V0.size();
        for (int i = 0; i < size; i++) {
            zt3 zt3Var = (zt3) au3Var.V0.get(i);
            zt3.EnumC18702b enumC18702bM59825C = zt3Var.m59825C();
            zt3.EnumC18702b enumC18702b = zt3.EnumC18702b.MATCH_CONSTRAINT;
            if (enumC18702bM59825C == enumC18702b || zt3Var.m59843V() == enumC18702b) {
                this.f43464a.add(zt3Var);
            }
        }
        au3Var.S1();
    }
}
