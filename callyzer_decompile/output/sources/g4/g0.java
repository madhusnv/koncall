package g4;

import com.sun.mail.util.AbstractC1452a;
import d3.AbstractC1561o;
import d3.C1565s;
import f3.AbstractC2199e;
import k4.AbstractC3988i;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import n4.C4953b;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import r4.C6446a;
import r4.C6448c;
import r4.C6457l;
import r4.C6459n;
import r4.C6462q;
import r4.InterfaceC6461p;
import s4.C6759o;
import s4.C6760p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 implements InterfaceC2487c {

    /* renamed from: a */
    public final InterfaceC6461p f13603a;

    /* renamed from: b */
    public final long f13604b;

    /* renamed from: c */
    public final C3998s f13605c;

    /* renamed from: d */
    public final C3994o f13606d;

    /* renamed from: e */
    public final C3995p f13607e;

    /* renamed from: f */
    public final AbstractC3988i f13608f;

    /* renamed from: g */
    public final String f13609g;

    /* renamed from: h */
    public final long f13610h;

    /* renamed from: i */
    public final C6446a f13611i;

    /* renamed from: j */
    public final C6462q f13612j;

    /* renamed from: k */
    public final C4953b f13613k;

    /* renamed from: l */
    public final long f13614l;

    /* renamed from: m */
    public final C6457l f13615m;

    /* renamed from: n */
    public final d3.k0 f13616n;

    /* renamed from: o */
    public final C2509y f13617o;

    /* renamed from: p */
    public final AbstractC2199e f13618p;

    public g0(long j6, long j10, C3998s c3998s, C3994o c3994o, C3995p c3995p, AbstractC3988i abstractC3988i, String str, long j11, C6446a c6446a, C6462q c6462q, C4953b c4953b, long j12, C6457l c6457l, d3.k0 k0Var, C2509y c2509y) {
        this(j6 != 16 ? new C6448c(j6) : C6459n.f31121a, j10, c3998s, c3994o, c3995p, abstractC3988i, str, j11, c6446a, c6462q, c4953b, j12, c6457l, k0Var, c2509y, null);
    }

    /* renamed from: a */
    public final boolean m6431a(g0 g0Var) {
        if (this == g0Var) {
            return true;
        }
        return C6759o.m12952a(this.f13604b, g0Var.f13604b) && AbstractC4154l.m8918a(this.f13605c, g0Var.f13605c) && AbstractC4154l.m8918a(this.f13606d, g0Var.f13606d) && AbstractC4154l.m8918a(this.f13607e, g0Var.f13607e) && AbstractC4154l.m8918a(this.f13608f, g0Var.f13608f) && AbstractC4154l.m8918a(this.f13609g, g0Var.f13609g) && C6759o.m12952a(this.f13610h, g0Var.f13610h) && AbstractC4154l.m8918a(this.f13611i, g0Var.f13611i) && AbstractC4154l.m8918a(this.f13612j, g0Var.f13612j) && AbstractC4154l.m8918a(this.f13613k, g0Var.f13613k) && C1565s.m5187c(this.f13614l, g0Var.f13614l) && AbstractC4154l.m8918a(this.f13617o, g0Var.f13617o);
    }

    /* renamed from: b */
    public final boolean m6432b(g0 g0Var) {
        return AbstractC4154l.m8918a(this.f13603a, g0Var.f13603a) && AbstractC4154l.m8918a(this.f13615m, g0Var.f13615m) && AbstractC4154l.m8918a(this.f13616n, g0Var.f13616n) && AbstractC4154l.m8918a(this.f13618p, g0Var.f13618p);
    }

    /* renamed from: c */
    public final g0 m6433c(g0 g0Var) {
        if (g0Var == null) {
            return this;
        }
        InterfaceC6461p interfaceC6461p = g0Var.f13603a;
        return h0.m6438a(this, interfaceC6461p.mo12438b(), interfaceC6461p.mo12439c(), interfaceC6461p.mo12437a(), g0Var.f13604b, g0Var.f13605c, g0Var.f13606d, g0Var.f13607e, g0Var.f13608f, g0Var.f13609g, g0Var.f13610h, g0Var.f13611i, g0Var.f13612j, g0Var.f13613k, g0Var.f13614l, g0Var.f13615m, g0Var.f13616n, g0Var.f13617o, g0Var.f13618p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return m6431a(g0Var) && m6432b(g0Var);
    }

    public final int hashCode() {
        InterfaceC6461p interfaceC6461p = this.f13603a;
        long jMo12438b = interfaceC6461p.mo12438b();
        int i10 = C1565s.f7818k;
        int iHashCode = Long.hashCode(jMo12438b) * 31;
        AbstractC1561o abstractC1561oMo12439c = interfaceC6461p.mo12439c();
        int iHashCode2 = (Float.hashCode(interfaceC6461p.mo12437a()) + ((iHashCode + (abstractC1561oMo12439c != null ? abstractC1561oMo12439c.hashCode() : 0)) * 31)) * 31;
        C6760p[] c6760pArr = C6759o.f32212b;
        int iM4557d = AbstractC1452a.m4557d(iHashCode2, 31, this.f13604b);
        C3998s c3998s = this.f13605c;
        int i11 = (iM4557d + (c3998s != null ? c3998s.f20701a : 0)) * 31;
        C3994o c3994o = this.f13606d;
        int iHashCode3 = (i11 + (c3994o != null ? Integer.hashCode(c3994o.f20689a) : 0)) * 31;
        C3995p c3995p = this.f13607e;
        int iHashCode4 = (iHashCode3 + (c3995p != null ? Integer.hashCode(c3995p.f20690a) : 0)) * 31;
        AbstractC3988i abstractC3988i = this.f13608f;
        int iHashCode5 = (iHashCode4 + (abstractC3988i != null ? abstractC3988i.hashCode() : 0)) * 31;
        String str = this.f13609g;
        int iM4557d2 = AbstractC1452a.m4557d((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f13610h);
        C6446a c6446a = this.f13611i;
        int iHashCode6 = (iM4557d2 + (c6446a != null ? Float.hashCode(c6446a.f31100a) : 0)) * 31;
        C6462q c6462q = this.f13612j;
        int iHashCode7 = (iHashCode6 + (c6462q != null ? c6462q.hashCode() : 0)) * 31;
        C4953b c4953b = this.f13613k;
        int iM4557d3 = AbstractC1452a.m4557d((iHashCode7 + (c4953b != null ? c4953b.f24639a.hashCode() : 0)) * 31, 31, this.f13614l);
        C6457l c6457l = this.f13615m;
        int i12 = (iM4557d3 + (c6457l != null ? c6457l.f31119a : 0)) * 31;
        d3.k0 k0Var = this.f13616n;
        int iHashCode8 = (i12 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        C2509y c2509y = this.f13617o;
        int iHashCode9 = (iHashCode8 + (c2509y != null ? c2509y.hashCode() : 0)) * 31;
        AbstractC2199e abstractC2199e = this.f13618p;
        return iHashCode9 + (abstractC2199e != null ? abstractC2199e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        InterfaceC6461p interfaceC6461p = this.f13603a;
        sb2.append((Object) C1565s.m5193i(interfaceC6461p.mo12438b()));
        sb2.append(", brush=");
        sb2.append(interfaceC6461p.mo12439c());
        sb2.append(", alpha=");
        sb2.append(interfaceC6461p.mo12437a());
        sb2.append(", fontSize=");
        sb2.append((Object) C6759o.m12955d(this.f13604b));
        sb2.append(", fontWeight=");
        sb2.append(this.f13605c);
        sb2.append(", fontStyle=");
        sb2.append(this.f13606d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f13607e);
        sb2.append(", fontFamily=");
        sb2.append(this.f13608f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f13609g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) C6759o.m12955d(this.f13610h));
        sb2.append(", baselineShift=");
        sb2.append(this.f13611i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f13612j);
        sb2.append(", localeList=");
        sb2.append(this.f13613k);
        sb2.append(", background=");
        i0.m0.m7391x(this.f13614l, ", textDecoration=", sb2);
        sb2.append(this.f13615m);
        sb2.append(", shadow=");
        sb2.append(this.f13616n);
        sb2.append(", platformStyle=");
        sb2.append(this.f13617o);
        sb2.append(", drawStyle=");
        sb2.append(this.f13618p);
        sb2.append(')');
        return sb2.toString();
    }

    public g0(InterfaceC6461p interfaceC6461p, long j6, C3998s c3998s, C3994o c3994o, C3995p c3995p, AbstractC3988i abstractC3988i, String str, long j10, C6446a c6446a, C6462q c6462q, C4953b c4953b, long j11, C6457l c6457l, d3.k0 k0Var, C2509y c2509y, AbstractC2199e abstractC2199e) {
        this.f13603a = interfaceC6461p;
        this.f13604b = j6;
        this.f13605c = c3998s;
        this.f13606d = c3994o;
        this.f13607e = c3995p;
        this.f13608f = abstractC3988i;
        this.f13609g = str;
        this.f13610h = j10;
        this.f13611i = c6446a;
        this.f13612j = c6462q;
        this.f13613k = c4953b;
        this.f13614l = j11;
        this.f13615m = c6457l;
        this.f13616n = k0Var;
        this.f13617o = c2509y;
        this.f13618p = abstractC2199e;
    }

    public g0(long j6, long j10, C3998s c3998s, C3994o c3994o, C3995p c3995p, AbstractC3988i abstractC3988i, String str, long j11, C6446a c6446a, C6462q c6462q, C4953b c4953b, long j12, C6457l c6457l, d3.k0 k0Var, int i10) {
        this((i10 & 1) != 0 ? C1565s.f7817j : j6, (i10 & 2) != 0 ? C6759o.f32213c : j10, (i10 & 4) != 0 ? null : c3998s, (i10 & 8) != 0 ? null : c3994o, (i10 & 16) != 0 ? null : c3995p, (i10 & 32) != 0 ? null : abstractC3988i, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? C6759o.f32213c : j11, (i10 & 256) != 0 ? null : c6446a, (i10 & 512) != 0 ? null : c6462q, (i10 & 1024) != 0 ? null : c4953b, (i10 & NewHope.SENDB_BYTES) != 0 ? C1565s.f7817j : j12, (i10 & 4096) != 0 ? null : c6457l, (i10 & 8192) != 0 ? null : k0Var, (C2509y) null);
    }
}
