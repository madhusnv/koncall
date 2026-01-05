package p001o;

/* loaded from: classes2.dex */
public final class xe9 extends ei3 {

    /* renamed from: e */
    public static final C18126a f53642e = new C18126a(null);

    /* renamed from: o.xe9$a */
    public static final class C18126a {
        public C18126a() {
        }

        public /* synthetic */ C18126a(id5 id5Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe9(String str, int i) {
        super(str, th3.f47123a.m49877a(), i, null);
        sq8.m48649h(str, "name");
    }

    @Override // p001o.ei3
    /* renamed from: c */
    public float mo17011c(int i) {
        return i == 0 ? 100.0f : 128.0f;
    }

    @Override // p001o.ei3
    /* renamed from: d */
    public float mo17012d(int i) {
        return i == 0 ? 0.0f : -128.0f;
    }

    @Override // p001o.ei3
    /* renamed from: h */
    public long mo17013h(float f, float f2, float f3) {
        float fM18607j = (bce.m18607j(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fM18607j2 = (bce.m18607j(f, -128.0f, 128.0f) * 0.002f) + fM18607j;
        float f4 = fM18607j2 > 0.20689656f ? fM18607j2 * fM18607j2 * fM18607j2 : (fM18607j2 - 0.13793103f) * 0.12841855f;
        float f5 = fM18607j > 0.20689656f ? fM18607j * fM18607j * fM18607j : (fM18607j - 0.13793103f) * 0.12841855f;
        ec8 ec8Var = ec8.f21384a;
        return (Float.floatToIntBits(f4 * ec8Var.m24772c()[0]) << 32) | (Float.floatToIntBits(f5 * ec8Var.m24772c()[1]) & 4294967295L);
    }

    @Override // p001o.ei3
    /* renamed from: i */
    public float mo17014i(float f, float f2, float f3) {
        float fM18607j = ((bce.m18607j(f, 0.0f, 100.0f) + 16.0f) / 116.0f) - (bce.m18607j(f3, -128.0f, 128.0f) * 0.005f);
        return (fM18607j > 0.20689656f ? fM18607j * fM18607j * fM18607j : 0.12841855f * (fM18607j - 0.13793103f)) * ec8.f21384a.m24772c()[2];
    }

    @Override // p001o.ei3
    /* renamed from: j */
    public long mo17015j(float f, float f2, float f3, float f4, ei3 ei3Var) {
        sq8.m48649h(ei3Var, "colorSpace");
        ec8 ec8Var = ec8.f21384a;
        float f5 = f / ec8Var.m24772c()[0];
        float f6 = f2 / ec8Var.m24772c()[1];
        float f7 = f3 / ec8Var.m24772c()[2];
        float fPow = f5 > 0.008856452f ? (float) Math.pow(f5, 0.33333334f) : (f5 * 7.787037f) + 0.13793103f;
        float fPow2 = f6 > 0.008856452f ? (float) Math.pow(f6, 0.33333334f) : (f6 * 7.787037f) + 0.13793103f;
        return rh3.m46766a(bce.m18607j((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), bce.m18607j((fPow - fPow2) * 500.0f, -128.0f, 128.0f), bce.m18607j((fPow2 - (f7 > 0.008856452f ? (float) Math.pow(f7, 0.33333334f) : (f7 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f4, ei3Var);
    }
}
