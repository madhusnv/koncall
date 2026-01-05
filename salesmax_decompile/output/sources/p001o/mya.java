package p001o;

import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class mya {

    /* renamed from: a */
    public final boolean f36098a = false;

    public static /* synthetic */ Double A1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 30.0d : 90.0d);
    }

    public static /* synthetic */ Double A2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh B1(i26 i26Var) {
        return new grh(f1(), e1(), 10.0d, hrh.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh B2(i26 i26Var) {
        return new grh(D3(), C3(), 10.0d, hrh.NEARER, false);
    }

    public static /* synthetic */ Double D1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double D2(i26 i26Var) {
        double d = i26Var.f27954d ? 30.0d : 90.0d;
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 30.0d : 85.0d);
        }
        return !l1(i26Var) ? Double.valueOf(d) : Double.valueOf(g1(i26Var.f27957g.m27405e(), i26Var.f27957g.m27403c(), d, !i26Var.f27954d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 E1(i26 i26Var) {
        return k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh E2(i26 i26Var) {
        return new grh(D3(), C3(), 10.0d, hrh.NEARER, false);
    }

    public static /* synthetic */ Double G1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 40.0d : 80.0d);
    }

    public static /* synthetic */ Double G2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 H1(i26 i26Var) {
        return k1();
    }

    public static /* synthetic */ Double I2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? new t64(24.0d, 24.0d, 29.0d, 34.0d).m49426a(i26Var.f27955e) : 98.0d);
    }

    public static /* synthetic */ Double J1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 90.0d : 20.0d);
    }

    public static /* synthetic */ Double K2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? new t64(12.0d, 12.0d, 16.0d, 20.0d).m49426a(i26Var.f27955e) : new t64(94.0d, 94.0d, 92.0d, 90.0d).m49426a(i26Var.f27955e));
    }

    public static /* synthetic */ Double L1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 M1(i26 i26Var) {
        return a1();
    }

    public static /* synthetic */ Double M2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? new t64(17.0d, 17.0d, 21.0d, 25.0d).m49426a(i26Var.f27955e) : new t64(92.0d, 92.0d, 88.0d, 85.0d).m49426a(i26Var.f27955e));
    }

    public static /* synthetic */ Double O1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 20.0d : 100.0d);
    }

    public static /* synthetic */ Double O2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? new t64(22.0d, 22.0d, 26.0d, 30.0d).m49426a(i26Var.f27955e) : new t64(90.0d, 90.0d, 84.0d, 80.0d).m49426a(i26Var.f27955e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 P1(i26 i26Var) {
        return e1();
    }

    public static /* synthetic */ Double Q2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? new t64(10.0d, 10.0d, 11.0d, 12.0d).m49426a(i26Var.f27955e) : new t64(96.0d, 96.0d, 96.0d, 95.0d).m49426a(i26Var.f27955e));
    }

    public static /* synthetic */ Double R1(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 90.0d : 10.0d);
        }
        return Double.valueOf(i26Var.f27954d ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 S1(i26 i26Var) {
        return f1();
    }

    public static /* synthetic */ Double S2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? new t64(4.0d, 4.0d, 2.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE).m49426a(i26Var.f27955e) : 100.0d);
    }

    public static /* synthetic */ Double U1(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 10.0d : 90.0d);
        }
        return Double.valueOf(i26Var.f27954d ? 20.0d : 100.0d);
    }

    public static /* synthetic */ Double U2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 6.0d : new t64(87.0d, 87.0d, 80.0d, 75.0d).m49426a(i26Var.f27955e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 V1(i26 i26Var) {
        return A3();
    }

    public static /* synthetic */ Double W2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double X1(i26 i26Var) {
        if (l1(i26Var)) {
            return Double.valueOf(u16.m50840a(((Double) B3().f48167c.apply(i26Var)).doubleValue(), 4.5d));
        }
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 100.0d);
        }
        return Double.valueOf(i26Var.f27954d ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 Y1(i26 i26Var) {
        return B3();
    }

    public static /* synthetic */ Double Y2(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 90.0d : 25.0d);
        }
        return Double.valueOf(i26Var.f27954d ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh Z2(i26 i26Var) {
        return new grh(O3(), N3(), 10.0d, hrh.NEARER, false);
    }

    public static /* synthetic */ Double a2(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 10.0d : 100.0d);
        }
        return Double.valueOf(i26Var.f27954d ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 b2(i26 i26Var) {
        return C3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double b3(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 60.0d : 49.0d);
        }
        if (l1(i26Var)) {
            return Double.valueOf(wt5.m54955a(i26Var.f27958h.m27404d(i26Var.f27952b.m34655e())).m34655e());
        }
        return Double.valueOf(i26Var.f27954d ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh c3(i26 i26Var) {
        return new grh(O3(), N3(), 10.0d, hrh.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double d2(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 90.0d : 10.0d);
        }
        if (l1(i26Var)) {
            return Double.valueOf(u16.m50840a(((Double) D3().f48167c.apply(i26Var)).doubleValue(), 4.5d));
        }
        return Double.valueOf(i26Var.f27954d ? 90.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 e2(i26 i26Var) {
        return D3();
    }

    public static /* synthetic */ Double e3(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 10.0d : 90.0d);
    }

    public static double g1(double d, double d2, double d3, boolean z) {
        jx7 jx7VarM34651a = jx7.m34651a(d, d2, d3);
        if (jx7VarM34651a.m34653c() >= d2) {
            return d3;
        }
        jx7 jx7Var = jx7VarM34651a;
        double dM34653c = jx7VarM34651a.m34653c();
        double d4 = d3;
        while (jx7Var.m34653c() < d2) {
            double d5 = d4 + (z ? -1.0d : 1.0d);
            jx7 jx7VarM34651a2 = jx7.m34651a(d, d2, d5);
            if (dM34653c > jx7VarM34651a2.m34653c() || Math.abs(jx7VarM34651a2.m34653c() - d2) < 0.4d) {
                return d5;
            }
            if (Math.abs(jx7VarM34651a2.m34653c() - d2) < Math.abs(jx7Var.m34653c() - d2)) {
                jx7Var = jx7VarM34651a2;
            }
            dM34653c = Math.max(dM34653c, jx7VarM34651a2.m34653c());
            d4 = d5;
        }
        return d4;
    }

    public static /* synthetic */ Double g2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 90.0d : 10.0d);
    }

    public static /* synthetic */ Double g3(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 10.0d : 90.0d);
    }

    public static /* synthetic */ Double i2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 80.0d : 30.0d);
    }

    public static /* synthetic */ Double i3(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 10.0d : 90.0d);
    }

    public static /* synthetic */ Double k2(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 10.0d : 90.0d);
        }
        return Double.valueOf(i26Var.f27954d ? 20.0d : 100.0d);
    }

    public static /* synthetic */ Double k3(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 l2(i26 i26Var) {
        return N3();
    }

    public static boolean m1(i26 i26Var) {
        return i26Var.f27953c == csi.MONOCHROME;
    }

    public static /* synthetic */ Double m3(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double n2(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 100.0d);
        }
        if (l1(i26Var)) {
            return Double.valueOf(u16.m50840a(((Double) O3().f48167c.apply(i26Var)).doubleValue(), 4.5d));
        }
        return Double.valueOf(i26Var.f27954d ? 90.0d : 30.0d);
    }

    public static /* synthetic */ Double o1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u16 o2(i26 i26Var) {
        return O3();
    }

    public static /* synthetic */ Double q1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 30.0d : 90.0d);
    }

    public static /* synthetic */ Double q2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 60.0d : 50.0d);
    }

    public static /* synthetic */ Double s1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 100.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
    }

    public static /* synthetic */ Double s2(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 30.0d : 80.0d);
    }

    public static /* synthetic */ Double t1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 0.2d : 0.12d);
    }

    public static /* synthetic */ Double u2(i26 i26Var) {
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 100.0d : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        return Double.valueOf(i26Var.f27954d ? 80.0d : 40.0d);
    }

    public static /* synthetic */ Double v1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh v2(i26 i26Var) {
        return new grh(B3(), A3(), 10.0d, hrh.NEARER, false);
    }

    public static /* synthetic */ Double x1(i26 i26Var) {
        return Double.valueOf(i26Var.f27954d ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double x2(i26 i26Var) {
        if (l1(i26Var)) {
            return Double.valueOf(i26Var.f27952b.m34655e());
        }
        if (m1(i26Var)) {
            return Double.valueOf(i26Var.f27954d ? 85.0d : 25.0d);
        }
        return Double.valueOf(i26Var.f27954d ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh y1(i26 i26Var) {
        return new grh(f1(), e1(), 10.0d, hrh.NEARER, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ grh y2(i26 i26Var) {
        return new grh(B3(), A3(), 10.0d, hrh.NEARER, false);
    }

    public u16 A3() {
        return new u16("primary", new Function() { // from class: o.gva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27956f;
            }
        }, new Function() { // from class: o.hva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.u2((i26) obj);
            }
        }, true, new mva(this), null, new t64(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: o.iva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f29266a.v2((i26) obj);
            }
        });
    }

    public u16 B3() {
        return new u16("primary_container", new Function() { // from class: o.lua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27956f;
            }
        }, new Function() { // from class: o.bva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f16857a.x2((i26) obj);
            }
        }, true, new mva(this), null, new t64(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: o.xva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f54358a.y2((i26) obj);
            }
        });
    }

    public u16 C3() {
        return new u16("secondary", new Function() { // from class: o.exa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27957g;
            }
        }, new Function() { // from class: o.pxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.A2((i26) obj);
            }
        }, true, new mva(this), null, new t64(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: o.aya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f15368a.B2((i26) obj);
            }
        });
    }

    public u16 D3() {
        return new u16("secondary_container", new Function() { // from class: o.dxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27957g;
            }
        }, new Function() { // from class: o.fxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f24239a.D2((i26) obj);
            }
        }, true, new mva(this), null, new t64(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: o.gxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f25916a.E2((i26) obj);
            }
        });
    }

    public u16 E3() {
        return new u16("surface", new Function() { // from class: o.qxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.rxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.G2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 F3() {
        return new u16("surface_bright", new Function() { // from class: o.hxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.ixa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.I2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 G3() {
        return new u16("surface_container", new Function() { // from class: o.vva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.wva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.K2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 H3() {
        return new u16("surface_container_high", new Function() { // from class: o.jxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.kxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.M2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 I3() {
        return new u16("surface_container_highest", new Function() { // from class: o.nxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.oxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.O2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 J3() {
        return new u16("surface_container_low", new Function() { // from class: o.tva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.uva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.Q2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 K3() {
        return new u16("surface_container_lowest", new Function() { // from class: o.nva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.ova
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.S2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 L3() {
        return new u16("surface_dim", new Function() { // from class: o.sxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.txa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.U2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 M3() {
        return new u16("surface_variant", new Function() { // from class: o.mua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27960j;
            }
        }, new Function() { // from class: o.nua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.W2((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 N3() {
        return new u16("tertiary", new Function() { // from class: o.wwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27958h;
            }
        }, new Function() { // from class: o.xwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.Y2((i26) obj);
            }
        }, true, new mva(this), null, new t64(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: o.ywa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f56205a.Z2((i26) obj);
            }
        });
    }

    public u16 O3() {
        return new u16("tertiary_container", new Function() { // from class: o.pwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27958h;
            }
        }, new Function() { // from class: o.qwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f42491a.b3((i26) obj);
            }
        }, true, new mva(this), null, new t64(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: o.rwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f44150a.c3((i26) obj);
            }
        });
    }

    public u16 P3() {
        return u16.m50841b("text_hint_inverse", new Function() { // from class: o.bxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.cxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.e3((i26) obj);
            }
        });
    }

    public u16 Q3() {
        return u16.m50841b("text_primary_inverse", new Function() { // from class: o.pva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.qva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.g3((i26) obj);
            }
        });
    }

    public u16 R3() {
        return u16.m50841b("text_primary_inverse_disable_only", new Function() { // from class: o.zxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.bya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.i3((i26) obj);
            }
        });
    }

    public u16 S3() {
        return u16.m50841b("text_secondary_and_tertiary_inverse", new Function() { // from class: o.iwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27960j;
            }
        }, new Function() { // from class: o.twa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.k3((i26) obj);
            }
        });
    }

    public u16 T3() {
        return u16.m50841b("text_secondary_and_tertiary_inverse_disabled", new Function() { // from class: o.kwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.lwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.m3((i26) obj);
            }
        });
    }

    public u16 a1() {
        return new u16("background", new Function() { // from class: o.lxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.mxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.o1((i26) obj);
            }
        }, true, null, null, null, null);
    }

    public u16 b1() {
        return u16.m50841b("control_activated", new Function() { // from class: o.eva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27956f;
            }
        }, new Function() { // from class: o.fva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.q1((i26) obj);
            }
        });
    }

    public u16 c1() {
        return new u16("control_highlight", new Function() { // from class: o.mwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.nwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.s1((i26) obj);
            }
        }, false, null, null, null, null, new Function() { // from class: o.owa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.t1((i26) obj);
            }
        });
    }

    public u16 d1() {
        return u16.m50841b("control_normal", new Function() { // from class: o.zwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27960j;
            }
        }, new Function() { // from class: o.axa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.v1((i26) obj);
            }
        });
    }

    public u16 e1() {
        return new u16(Constants.IPC_BUNDLE_KEY_SEND_ERROR, new Function() { // from class: o.vua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27961k;
            }
        }, new Function() { // from class: o.wua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.x1((i26) obj);
            }
        }, true, new mva(this), null, new t64(3.0d, 4.5d, 7.0d, 7.0d), new Function() { // from class: o.xua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f54301a.y1((i26) obj);
            }
        });
    }

    public u16 f1() {
        return new u16("error_container", new Function() { // from class: o.cya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27961k;
            }
        }, new Function() { // from class: o.dya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.A1((i26) obj);
            }
        }, true, new mva(this), null, new t64(1.0d, 1.0d, 3.0d, 4.5d), new Function() { // from class: o.eya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f22395a.B1((i26) obj);
            }
        });
    }

    public u16 h1(i26 i26Var) {
        return i26Var.f27954d ? F3() : L3();
    }

    public u16 i1() {
        return new u16("inverse_on_surface", new Function() { // from class: o.wxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.xxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.D1((i26) obj);
            }
        }, false, new Function() { // from class: o.yxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f56228a.E1((i26) obj);
            }
        }, null, new t64(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public u16 j1() {
        return new u16("inverse_primary", new Function() { // from class: o.yua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27956f;
            }
        }, new Function() { // from class: o.zua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.G1((i26) obj);
            }
        }, false, new Function() { // from class: o.ava
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f15281a.H1((i26) obj);
            }
        }, null, new t64(3.0d, 4.5d, 7.0d, 7.0d), null);
    }

    public u16 k1() {
        return new u16("inverse_surface", new Function() { // from class: o.tua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.uua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.J1((i26) obj);
            }
        }, false, null, null, null, null);
    }

    public final boolean l1(i26 i26Var) {
        csi csiVar;
        csi csiVar2;
        return !(!this.f36098a || (csiVar2 = i26Var.f27953c) == csi.MONOCHROME || csiVar2 == csi.NEUTRAL) || (csiVar = i26Var.f27953c) == csi.FIDELITY || csiVar == csi.CONTENT;
    }

    public u16 n3() {
        return new u16("on_background", new Function() { // from class: o.iya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.jya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.L1((i26) obj);
            }
        }, false, new Function() { // from class: o.kya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f32808a.M1((i26) obj);
            }
        }, null, new t64(3.0d, 3.0d, 4.5d, 7.0d), null);
    }

    public u16 o3() {
        return new u16("on_error", new Function() { // from class: o.yva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27961k;
            }
        }, new Function() { // from class: o.zva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.O1((i26) obj);
            }
        }, false, new Function() { // from class: o.awa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f15310a.P1((i26) obj);
            }
        }, null, new t64(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public u16 p3() {
        return new u16("on_error_container", new Function() { // from class: o.lya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27961k;
            }
        }, new Function() { // from class: o.rua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.R1((i26) obj);
            }
        }, false, new Function() { // from class: o.sua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f45955a.S1((i26) obj);
            }
        }, null, new t64(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public u16 q3() {
        return new u16("on_primary", new Function() { // from class: o.jva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27956f;
            }
        }, new Function() { // from class: o.kva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.U1((i26) obj);
            }
        }, false, new Function() { // from class: o.lva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f34421a.V1((i26) obj);
            }
        }, null, new t64(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public u16 r3() {
        return new u16("on_primary_container", new Function() { // from class: o.fya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27956f;
            }
        }, new Function() { // from class: o.gya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f25942a.X1((i26) obj);
            }
        }, false, new Function() { // from class: o.hya
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f27791a.Y1((i26) obj);
            }
        }, null, new t64(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public u16 s3() {
        return new u16("on_secondary", new Function() { // from class: o.dwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27957g;
            }
        }, new Function() { // from class: o.ewa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.a2((i26) obj);
            }
        }, false, new Function() { // from class: o.fwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f24178a.b2((i26) obj);
            }
        }, null, new t64(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public u16 t3() {
        return new u16("on_secondary_container", new Function() { // from class: o.oua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27957g;
            }
        }, new Function() { // from class: o.pua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f40605a.d2((i26) obj);
            }
        }, false, new Function() { // from class: o.qua
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f42451a.e2((i26) obj);
            }
        }, null, new t64(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public u16 u3() {
        return new u16("on_surface", new Function() { // from class: o.cva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27959i;
            }
        }, new Function() { // from class: o.dva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.g2((i26) obj);
            }
        }, false, new mva(this), null, new t64(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public u16 v3() {
        return new u16("on_surface_variant", new Function() { // from class: o.bwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27960j;
            }
        }, new Function() { // from class: o.cwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.i2((i26) obj);
            }
        }, false, new mva(this), null, new t64(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public u16 w3() {
        return new u16("on_tertiary", new Function() { // from class: o.gwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27958h;
            }
        }, new Function() { // from class: o.hwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.k2((i26) obj);
            }
        }, false, new Function() { // from class: o.jwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f31171a.l2((i26) obj);
            }
        }, null, new t64(4.5d, 7.0d, 11.0d, 21.0d), null);
    }

    public u16 x3() {
        return new u16("on_tertiary_container", new Function() { // from class: o.swa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27958h;
            }
        }, new Function() { // from class: o.uwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f49572a.n2((i26) obj);
            }
        }, false, new Function() { // from class: o.vwa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f50959a.o2((i26) obj);
            }
        }, null, new t64(3.0d, 4.5d, 7.0d, 11.0d), null);
    }

    public u16 y3() {
        return new u16("outline", new Function() { // from class: o.uxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27960j;
            }
        }, new Function() { // from class: o.vxa
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.q2((i26) obj);
            }
        }, false, new mva(this), null, new t64(1.5d, 3.0d, 4.5d, 7.0d), null);
    }

    public u16 z3() {
        return new u16("outline_variant", new Function() { // from class: o.rva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((i26) obj).f27960j;
            }
        }, new Function() { // from class: o.sva
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return mya.s2((i26) obj);
            }
        }, false, new mva(this), null, new t64(1.0d, 1.0d, 3.0d, 4.5d), null);
    }
}
