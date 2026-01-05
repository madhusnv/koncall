package p001o;

/* loaded from: classes2.dex */
public final class bg0 implements e1b {

    /* renamed from: a */
    public final float f16106a;

    /* renamed from: b */
    public final float f16107b;

    public bg0(float f, float f2) {
        this.f16106a = f;
        this.f16107b = f2;
    }

    /* renamed from: d */
    public static final float m18839d(yc4 yc4Var, bg0 bg0Var, float f, float f2, float f3) {
        sq8.m48649h(yc4Var, "$c");
        sq8.m48649h(bg0Var, "this$0");
        long jM57502k = yc4Var.m57502k(f3);
        return Math.abs(gri.m29423j(gri.m29414a(gcd.m28436g(jM57502k) - bg0Var.f16106a, gcd.m28437h(jM57502k) - bg0Var.f16107b) - f, gri.m29421h()) - f2);
    }

    @Override // p001o.e1b
    /* renamed from: a */
    public float mo18840a(yc4 yc4Var) {
        sq8.m48649h(yc4Var, "c");
        float fM29423j = gri.m29423j(gri.m29414a(yc4Var.m57495d() - this.f16106a, yc4Var.m57496e() - this.f16107b) - gri.m29414a(yc4Var.m57493b() - this.f16106a, yc4Var.m57494c() - this.f16107b), gri.m29421h());
        if (fM29423j > gri.m29421h() - 1.0E-4f) {
            return 0.0f;
        }
        return fM29423j;
    }

    @Override // p001o.e1b
    /* renamed from: b */
    public float mo18841b(final yc4 yc4Var, final float f) {
        sq8.m48649h(yc4Var, "c");
        final float fM29414a = gri.m29414a(yc4Var.m57493b() - this.f16106a, yc4Var.m57494c() - this.f16107b);
        return gri.m29419f(0.0f, 1.0f, 1.0E-5f, new j07() { // from class: o.ag0
            @Override // p001o.j07
            /* renamed from: a */
            public final float mo17017a(float f2) {
                return bg0.m18839d(yc4Var, this, fM29414a, f, f2);
            }
        });
    }
}
