package g2;

import h1.C2772c;
import java.util.List;
import rw.C6669s;
import s4.C6745a;
import s4.C6750f;
import s4.EnumC6757m;
import v3.InterfaceC7652x;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class kb extends AbstractC7878q implements InterfaceC7652x {

    /* renamed from: q */
    public k2.h2 f11948q;

    /* renamed from: r */
    public int f11949r;

    /* renamed from: s */
    public boolean f11950s;

    /* renamed from: t */
    public C2772c f11951t;

    /* renamed from: v */
    public C2772c f11952v;

    /* renamed from: w */
    public C6750f f11953w;

    /* renamed from: x */
    public C6750f f11954x;

    @Override // v3.InterfaceC7652x
    /* renamed from: b */
    public final t3.k0 mo148b(t3.l0 l0Var, t3.i0 i0Var, long j6) {
        boolean zIsEmpty = ((List) this.f11948q.getValue()).isEmpty();
        C6669s c6669s = C6669s.f31944a;
        if (zIsEmpty) {
            return l0Var.g0(0, 0, c6669s, p0.f12349F);
        }
        float f6 = this.f11950s ? ((sb) ((List) this.f11948q.getValue()).get(this.f11949r)).f12720c : ((sb) ((List) this.f11948q.getValue()).get(this.f11949r)).f12719b;
        C6750f c6750f = this.f11954x;
        if (c6750f != null) {
            C2772c c2772c = this.f11952v;
            if (c2772c == null) {
                c2772c = new C2772c(c6750f, h1.y1.f15666c, null, 12);
                this.f11952v = c2772c;
            }
            if (!C6750f.m12935a(f6, ((C6750f) c2772c.f15362e.getValue()).f32201a)) {
                tx.c0.m13502y(z0(), null, null, new ib(c2772c, f6, null, 0), 3);
            }
        } else {
            this.f11954x = new C6750f(f6);
        }
        float f10 = ((sb) ((List) this.f11948q.getValue()).get(this.f11949r)).f12718a;
        C6750f c6750f2 = this.f11953w;
        if (c6750f2 != null) {
            C2772c c2772c2 = this.f11951t;
            if (c2772c2 == null) {
                c2772c2 = new C2772c(c6750f2, h1.y1.f15666c, null, 12);
                this.f11951t = c2772c2;
            }
            if (!C6750f.m12935a(f10, ((C6750f) c2772c2.f15362e.getValue()).f32201a)) {
                tx.c0.m13502y(z0(), null, null, new ib(c2772c2, f10, null, 1), 3);
            }
        } else {
            this.f11953w = new C6750f(f10);
        }
        if (l0Var.getLayoutDirection() == EnumC6757m.Ltr) {
            C2772c c2772c3 = this.f11951t;
            if (c2772c3 != null) {
                f10 = ((C6750f) c2772c3.m6775d()).f32201a;
            }
        } else {
            C2772c c2772c4 = this.f11951t;
            if (c2772c4 != null) {
                f10 = ((C6750f) c2772c4.m6775d()).f32201a;
            }
            f10 = -f10;
        }
        C2772c c2772c5 = this.f11952v;
        if (c2772c5 != null) {
            f6 = ((C6750f) c2772c5.m6775d()).f32201a;
        }
        t3.w0 w0VarMo13314z = i0Var.mo13314z(C6745a.m12911b(j6, l0Var.e0(f6), l0Var.e0(f6), 0, 0, 12));
        return l0Var.g0(w0VarMo13314z.f34030a, w0VarMo13314z.f34031b, c6669s, new jb(w0VarMo13314z, l0Var, f10, 0));
    }
}
