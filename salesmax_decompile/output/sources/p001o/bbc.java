package p001o;

/* loaded from: classes2.dex */
public final class bbc extends ei3 {

    /* renamed from: e */
    public static final C12344a f15870e = new C12344a(null);

    /* renamed from: f */
    public static final float[] f15871f;

    /* renamed from: g */
    public static final float[] f15872g;

    /* renamed from: h */
    public static final float[] f15873h;

    /* renamed from: i */
    public static final float[] f15874i;

    /* renamed from: o.bbc$a */
    public static final class C12344a {
        public C12344a() {
        }

        public /* synthetic */ C12344a(id5 id5Var) {
            this();
        }
    }

    static {
        float[] fArrM48953b = sv.f45989b.m48954a().m48953b();
        ec8 ec8Var = ec8.f21384a;
        float[] fArrM26723k = fi3.m26723k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, fi3.m26717e(fArrM48953b, ec8Var.m24771b().m38579c(), ec8Var.m24774e().m38579c()));
        f15871f = fArrM26723k;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f15872g = fArr;
        f15873h = fi3.m26722j(fArrM26723k);
        f15874i = fi3.m26722j(fArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbc(String str, int i) {
        super(str, th3.f47123a.m49877a(), i, null);
        sq8.m48649h(str, "name");
    }

    @Override // p001o.ei3
    /* renamed from: c */
    public float mo17011c(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // p001o.ei3
    /* renamed from: d */
    public float mo17012d(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // p001o.ei3
    /* renamed from: h */
    public long mo17013h(float f, float f2, float f3) {
        float fM18607j = bce.m18607j(f, 0.0f, 1.0f);
        float fM18607j2 = bce.m18607j(f2, -0.5f, 0.5f);
        float fM18607j3 = bce.m18607j(f3, -0.5f, 0.5f);
        float[] fArr = f15874i;
        float fM26726n = fi3.m26726n(fArr, fM18607j, fM18607j2, fM18607j3);
        float fM26727o = fi3.m26727o(fArr, fM18607j, fM18607j2, fM18607j3);
        float fM26728p = fi3.m26728p(fArr, fM18607j, fM18607j2, fM18607j3);
        float f4 = fM26726n * fM26726n * fM26726n;
        float f5 = fM26727o * fM26727o * fM26727o;
        float f6 = fM26728p * fM26728p * fM26728p;
        float[] fArr2 = f15873h;
        float fM26726n2 = fi3.m26726n(fArr2, f4, f5, f6);
        float fM26727o2 = fi3.m26727o(fArr2, f4, f5, f6);
        return (Float.floatToIntBits(fM26726n2) << 32) | (Float.floatToIntBits(fM26727o2) & 4294967295L);
    }

    @Override // p001o.ei3
    /* renamed from: i */
    public float mo17014i(float f, float f2, float f3) {
        float fM18607j = bce.m18607j(f, 0.0f, 1.0f);
        float fM18607j2 = bce.m18607j(f2, -0.5f, 0.5f);
        float fM18607j3 = bce.m18607j(f3, -0.5f, 0.5f);
        float[] fArr = f15874i;
        float fM26726n = fi3.m26726n(fArr, fM18607j, fM18607j2, fM18607j3);
        float fM26727o = fi3.m26727o(fArr, fM18607j, fM18607j2, fM18607j3);
        float fM26728p = fi3.m26728p(fArr, fM18607j, fM18607j2, fM18607j3);
        float f4 = fM26728p * fM26728p * fM26728p;
        return fi3.m26728p(f15873h, fM26726n * fM26726n * fM26726n, fM26727o * fM26727o * fM26727o, f4);
    }

    @Override // p001o.ei3
    /* renamed from: j */
    public long mo17015j(float f, float f2, float f3, float f4, ei3 ei3Var) {
        sq8.m48649h(ei3Var, "colorSpace");
        float[] fArr = f15871f;
        float fM26726n = fi3.m26726n(fArr, f, f2, f3);
        float fM26727o = fi3.m26727o(fArr, f, f2, f3);
        float fM26728p = fi3.m26728p(fArr, f, f2, f3);
        double d = 0.33333334f;
        float fSignum = Math.signum(fM26726n) * ((float) Math.pow(Math.abs(fM26726n), d));
        float fSignum2 = Math.signum(fM26727o) * ((float) Math.pow(Math.abs(fM26727o), d));
        float fSignum3 = Math.signum(fM26728p) * ((float) Math.pow(Math.abs(fM26728p), d));
        float[] fArr2 = f15872g;
        return rh3.m46766a(fi3.m26726n(fArr2, fSignum, fSignum2, fSignum3), fi3.m26727o(fArr2, fSignum, fSignum2, fSignum3), fi3.m26728p(fArr2, fSignum, fSignum2, fSignum3), f4, ei3Var);
    }
}
