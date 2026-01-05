package g4;

import d3.C1565s;
import f3.AbstractC2199e;
import h2.AbstractC2812q;
import k4.AbstractC3988i;
import k4.C3991l;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import n4.C4953b;
import r4.C6446a;
import r4.C6448c;
import r4.C6449d;
import r4.C6450e;
import r4.C6454i;
import r4.C6456k;
import r4.C6457l;
import r4.C6458m;
import r4.C6459n;
import r4.C6462q;
import r4.C6463r;
import s4.C6759o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: d */
    public static final o0 f13687d = new o0(0, 0, null, null, null, 0, 0, 0, 16777215);

    /* renamed from: a */
    public final g0 f13688a;

    /* renamed from: b */
    public final C2506v f13689b;

    /* renamed from: c */
    public final C2510z f13690c;

    public o0(g0 g0Var, C2506v c2506v, C2510z c2510z) {
        this.f13688a = g0Var;
        this.f13689b = c2506v;
        this.f13690c = c2510z;
    }

    /* renamed from: a */
    public static o0 m6461a(o0 o0Var, long j6, long j10, C3998s c3998s, C3994o c3994o, AbstractC3988i abstractC3988i, long j11, long j12, C6454i c6454i, int i10) {
        long jMo12438b = (i10 & 1) != 0 ? o0Var.f13688a.f13603a.mo12438b() : j6;
        long j13 = (i10 & 2) != 0 ? o0Var.f13688a.f13604b : j10;
        C3998s c3998s2 = (i10 & 4) != 0 ? o0Var.f13688a.f13605c : c3998s;
        C3994o c3994o2 = (i10 & 8) != 0 ? o0Var.f13688a.f13606d : c3994o;
        g0 g0Var = o0Var.f13688a;
        C3995p c3995p = g0Var.f13607e;
        AbstractC3988i abstractC3988i2 = (i10 & 32) != 0 ? g0Var.f13608f : abstractC3988i;
        String str = g0Var.f13609g;
        long j14 = (i10 & 128) != 0 ? g0Var.f13610h : j11;
        C6446a c6446a = g0Var.f13611i;
        C6462q c6462q = g0Var.f13612j;
        C4953b c4953b = g0Var.f13613k;
        long j15 = g0Var.f13614l;
        C6457l c6457l = g0Var.f13615m;
        d3.k0 k0Var = g0Var.f13616n;
        AbstractC2199e abstractC2199e = g0Var.f13618p;
        int i11 = (i10 & 32768) != 0 ? o0Var.f13689b.f13719a : 3;
        C2506v c2506v = o0Var.f13689b;
        int i12 = c2506v.f13720b;
        long j16 = (i10 & 131072) != 0 ? c2506v.f13721c : j12;
        C6463r c6463r = c2506v.f13722d;
        C2510z c2510z = (i10 & 524288) != 0 ? o0Var.f13690c : AbstractC2812q.f15764a;
        return new o0(new g0(C1565s.m5187c(jMo12438b, g0Var.f13603a.mo12438b()) ? g0Var.f13603a : jMo12438b != 16 ? new C6448c(jMo12438b) : C6459n.f31121a, j13, c3998s2, c3994o2, c3995p, abstractC3988i2, str, j14, c6446a, c6462q, c4953b, j15, c6457l, k0Var, c2510z != null ? c2510z.f13733a : null, abstractC2199e), new C2506v(i11, i12, j16, c6463r, c2510z != null ? c2510z.f13734b : null, (i10 & 1048576) != 0 ? c2506v.f13724f : c6454i, c2506v.f13725g, c2506v.f13726h, c2506v.f13727i), c2510z);
    }

    /* renamed from: e */
    public static o0 m6462e(o0 o0Var, long j6, long j10, C3998s c3998s, AbstractC3988i abstractC3988i, long j11, C6457l c6457l, int i10, long j12, int i11) {
        long j13 = (i11 & 2) != 0 ? C6759o.f32213c : j10;
        C3998s c3998s2 = (i11 & 4) != 0 ? null : c3998s;
        AbstractC3988i abstractC3988i2 = (i11 & 32) != 0 ? null : abstractC3988i;
        long j14 = (i11 & 128) != 0 ? C6759o.f32213c : j11;
        long j15 = C1565s.f7817j;
        C6457l c6457l2 = (i11 & 4096) != 0 ? null : c6457l;
        int i12 = (32768 & i11) != 0 ? Integer.MIN_VALUE : i10;
        long j16 = (i11 & 131072) != 0 ? C6759o.f32213c : j12;
        g0 g0VarM6438a = h0.m6438a(o0Var.f13688a, j6, null, Float.NaN, j13, c3998s2, null, null, abstractC3988i2, null, j14, null, null, null, j15, c6457l2, null, null, null);
        C2506v c2506vM6484a = AbstractC2507w.m6484a(o0Var.f13689b, i12, Integer.MIN_VALUE, j16, null, null, null, 0, Integer.MIN_VALUE, null);
        return (o0Var.f13688a == g0VarM6438a && o0Var.f13689b == c2506vM6484a) ? o0Var : new o0(g0VarM6438a, c2506vM6484a);
    }

    /* renamed from: b */
    public final long m6463b() {
        return this.f13688a.f13603a.mo12438b();
    }

    /* renamed from: c */
    public final boolean m6464c(o0 o0Var) {
        if (this != o0Var) {
            return AbstractC4154l.m8918a(this.f13689b, o0Var.f13689b) && this.f13688a.m6431a(o0Var.f13688a);
        }
        return true;
    }

    /* renamed from: d */
    public final o0 m6465d(o0 o0Var) {
        return (o0Var == null || o0Var.equals(f13687d)) ? this : new o0(this.f13688a.m6433c(o0Var.f13688a), this.f13689b.m6483a(o0Var.f13689b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return AbstractC4154l.m8918a(this.f13688a, o0Var.f13688a) && AbstractC4154l.m8918a(this.f13689b, o0Var.f13689b) && AbstractC4154l.m8918a(this.f13690c, o0Var.f13690c);
    }

    public final int hashCode() {
        int iHashCode = (this.f13689b.hashCode() + (this.f13688a.hashCode() * 31)) * 31;
        C2510z c2510z = this.f13690c;
        return iHashCode + (c2510z != null ? c2510z.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) C1565s.m5193i(m6463b()));
        sb2.append(", brush=");
        g0 g0Var = this.f13688a;
        sb2.append(g0Var.f13603a.mo12439c());
        sb2.append(", alpha=");
        sb2.append(g0Var.f13603a.mo12437a());
        sb2.append(", fontSize=");
        sb2.append((Object) C6759o.m12955d(g0Var.f13604b));
        sb2.append(", fontWeight=");
        sb2.append(g0Var.f13605c);
        sb2.append(", fontStyle=");
        sb2.append(g0Var.f13606d);
        sb2.append(", fontSynthesis=");
        sb2.append(g0Var.f13607e);
        sb2.append(", fontFamily=");
        sb2.append(g0Var.f13608f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(g0Var.f13609g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) C6759o.m12955d(g0Var.f13610h));
        sb2.append(", baselineShift=");
        sb2.append(g0Var.f13611i);
        sb2.append(", textGeometricTransform=");
        sb2.append(g0Var.f13612j);
        sb2.append(", localeList=");
        sb2.append(g0Var.f13613k);
        sb2.append(", background=");
        i0.m0.m7391x(g0Var.f13614l, ", textDecoration=", sb2);
        sb2.append(g0Var.f13615m);
        sb2.append(", shadow=");
        sb2.append(g0Var.f13616n);
        sb2.append(", drawStyle=");
        sb2.append(g0Var.f13618p);
        sb2.append(", textAlign=");
        C2506v c2506v = this.f13689b;
        sb2.append((Object) C6456k.m12444a(c2506v.f13719a));
        sb2.append(", textDirection=");
        sb2.append((Object) C6458m.m12445a(c2506v.f13720b));
        sb2.append(", lineHeight=");
        sb2.append((Object) C6759o.m12955d(c2506v.f13721c));
        sb2.append(", textIndent=");
        sb2.append(c2506v.f13722d);
        sb2.append(", platformStyle=");
        sb2.append(this.f13690c);
        sb2.append(", lineHeightStyle=");
        sb2.append(c2506v.f13724f);
        sb2.append(", lineBreak=");
        sb2.append((Object) C6450e.m12441a(c2506v.f13725g));
        sb2.append(", hyphens=");
        sb2.append((Object) C6449d.m12440a(c2506v.f13726h));
        sb2.append(", textMotion=");
        sb2.append(c2506v.f13727i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0(g0 g0Var, C2506v c2506v) {
        C2509y c2509y = g0Var.f13617o;
        C2508x c2508x = c2506v.f13723e;
        this(g0Var, c2506v, (c2509y == null && c2508x == null) ? null : new C2510z(c2509y, c2508x));
    }

    public o0(long j6, long j10, C3998s c3998s, C3994o c3994o, C3991l c3991l, long j11, int i10, long j12, int i11) {
        this(new g0((i11 & 1) != 0 ? C1565s.f7817j : j6, (i11 & 2) != 0 ? C6759o.f32213c : j10, (i11 & 4) != 0 ? null : c3998s, (i11 & 8) != 0 ? null : c3994o, (C3995p) null, (i11 & 32) != 0 ? null : c3991l, (String) null, (i11 & 128) != 0 ? C6759o.f32213c : j11, (C6446a) null, (C6462q) null, (C4953b) null, C1565s.f7817j, (C6457l) null, (d3.k0) null, (C2509y) null), new C2506v((32768 & i11) != 0 ? Integer.MIN_VALUE : i10, Integer.MIN_VALUE, (i11 & 131072) != 0 ? C6759o.f32213c : j12, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
