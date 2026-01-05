package p001o;

/* loaded from: classes2.dex */
public abstract class qza {

    /* renamed from: a */
    public static final C16494a f42650a = new C16494a(null);

    /* renamed from: o.qza$a */
    public static final class C16494a {
        public C16494a() {
        }

        public /* synthetic */ C16494a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: a */
    public static float[] m45992a(float[] fArr) {
        sq8.m48649h(fArr, "values");
        return fArr;
    }

    /* renamed from: b */
    public static /* synthetic */ float[] m45993b(float[] fArr, int i, id5 id5Var) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m45992a(fArr);
    }

    /* renamed from: c */
    public static final long m45994c(float[] fArr, long j) {
        float fM48052k = s9c.m48052k(j);
        float fM48053l = s9c.m48053l(j);
        float f = 1 / (((fArr[3] * fM48052k) + (fArr[7] * fM48053l)) + fArr[15]);
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            f = 0.0f;
        }
        return v9c.m52474a(((fArr[0] * fM48052k) + (fArr[4] * fM48053l) + fArr[12]) * f, f * ((fArr[1] * fM48052k) + (fArr[5] * fM48053l) + fArr[13]));
    }

    /* renamed from: d */
    public static final void m45995d(float[] fArr, vpb vpbVar) {
        sq8.m48649h(vpbVar, "rect");
        long jM45994c = m45994c(fArr, v9c.m52474a(vpbVar.m53181b(), vpbVar.m53183d()));
        long jM45994c2 = m45994c(fArr, v9c.m52474a(vpbVar.m53181b(), vpbVar.m53180a()));
        long jM45994c3 = m45994c(fArr, v9c.m52474a(vpbVar.m53182c(), vpbVar.m53183d()));
        long jM45994c4 = m45994c(fArr, v9c.m52474a(vpbVar.m53182c(), vpbVar.m53180a()));
        vpbVar.m53188i(Math.min(Math.min(s9c.m48052k(jM45994c), s9c.m48052k(jM45994c2)), Math.min(s9c.m48052k(jM45994c3), s9c.m48052k(jM45994c4))));
        vpbVar.m53190k(Math.min(Math.min(s9c.m48053l(jM45994c), s9c.m48053l(jM45994c2)), Math.min(s9c.m48053l(jM45994c3), s9c.m48053l(jM45994c4))));
        vpbVar.m53189j(Math.max(Math.max(s9c.m48052k(jM45994c), s9c.m48052k(jM45994c2)), Math.max(s9c.m48052k(jM45994c3), s9c.m48052k(jM45994c4))));
        vpbVar.m53187h(Math.max(Math.max(s9c.m48053l(jM45994c), s9c.m48053l(jM45994c2)), Math.max(s9c.m48053l(jM45994c3), s9c.m48053l(jM45994c4))));
    }

    /* renamed from: e */
    public static final void m45996e(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* renamed from: f */
    public static final void m45997f(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    /* renamed from: g */
    public static /* synthetic */ void m45998g(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m45997f(fArr, f, f2, f3);
    }
}
