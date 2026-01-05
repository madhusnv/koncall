package x1;

import c3.C0848c;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import og.gg;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: g */
    public static final C0917l f39634g = gg.m10675b(o1.f39629a, C8259i.f39530p);

    /* renamed from: a */
    public final k2.a1 f39635a;

    /* renamed from: b */
    public final k2.a1 f39636b = new k2.a1(DefinitionKt.NO_Float_VALUE);

    /* renamed from: c */
    public final k2.b1 f39637c = new k2.b1(0);

    /* renamed from: d */
    public C0848c f39638d = C0848c.f5353e;

    /* renamed from: e */
    public long f39639e = g4.n0.f13684b;

    /* renamed from: f */
    public final k2.e1 f39640f;

    public p1(k1.x0 x0Var, float f6) {
        this.f39635a = new k2.a1(f6);
        this.f39640f = new k2.e1(x0Var, k2.s0.f20547f);
    }

    /* renamed from: a */
    public final void m15440a(k1.x0 x0Var, C0848c c0848c, int i10, int i11) {
        float f6 = i11 - i10;
        this.f39636b.m8491g(f6);
        float f10 = c0848c.f5354a;
        float f11 = c0848c.f5355b;
        C0848c c0848c2 = this.f39638d;
        float f12 = c0848c2.f5354a;
        k2.a1 a1Var = this.f39635a;
        if (f10 != f12 || f11 != c0848c2.f5355b) {
            boolean z6 = x0Var == k1.x0.Vertical;
            if (z6) {
                f10 = f11;
            }
            float f13 = z6 ? c0848c.f5357d : c0848c.f5356c;
            float fM8490f = a1Var.m8490f();
            float f14 = i10;
            float f15 = fM8490f + f14;
            a1Var.m8491g(a1Var.m8490f() + ((f13 <= f15 && (f10 >= fM8490f || f13 - f10 <= f14)) ? (f10 >= fM8490f || f13 - f10 > f14) ? 0.0f : f10 - fM8490f : f13 - f15));
            this.f39638d = c0848c;
        }
        a1Var.m8491g(w9.m11911b(a1Var.m8490f(), DefinitionKt.NO_Float_VALUE, f6));
        this.f39637c.m8527g(i10);
    }
}
