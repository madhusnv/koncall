package p001o;

/* loaded from: classes2.dex */
public final class afj extends ei3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afj(String str, int i) {
        super(str, th3.f47123a.m49879c(), i, null);
        sq8.m48649h(str, "name");
    }

    @Override // p001o.ei3
    /* renamed from: c */
    public float mo17011c(int i) {
        return 2.0f;
    }

    @Override // p001o.ei3
    /* renamed from: d */
    public float mo17012d(int i) {
        return -2.0f;
    }

    @Override // p001o.ei3
    /* renamed from: h */
    public long mo17013h(float f, float f2, float f3) {
        float fM17016k = m17016k(f);
        float fM17016k2 = m17016k(f2);
        return (Float.floatToIntBits(fM17016k2) & 4294967295L) | (Float.floatToIntBits(fM17016k) << 32);
    }

    @Override // p001o.ei3
    /* renamed from: i */
    public float mo17014i(float f, float f2, float f3) {
        return m17016k(f3);
    }

    @Override // p001o.ei3
    /* renamed from: j */
    public long mo17015j(float f, float f2, float f3, float f4, ei3 ei3Var) {
        sq8.m48649h(ei3Var, "colorSpace");
        return rh3.m46766a(m17016k(f), m17016k(f2), m17016k(f3), f4, ei3Var);
    }

    /* renamed from: k */
    public final float m17016k(float f) {
        return bce.m18607j(f, -2.0f, 2.0f);
    }
}
