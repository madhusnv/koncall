package e3;

import d3.C1565s;
import d3.h0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e3.f */
/* loaded from: classes.dex */
public final class C1930f extends C1931g {

    /* renamed from: e */
    public final C1941q f9128e;

    /* renamed from: f */
    public final C1941q f9129f;

    /* renamed from: g */
    public final float[] f9130g;

    public C1930f(C1941q c1941q, C1941q c1941q2) {
        float[] fArrM5690g;
        super(c1941q2, c1941q, c1941q2, null);
        this.f9128e = c1941q;
        this.f9129f = c1941q2;
        float[] fArr = C1925a.f9093b.f9094a;
        C1943s c1943s = c1941q.f9155d;
        float[] fArr2 = c1941q.f9160i;
        C1943s c1943s2 = c1941q2.f9155d;
        float[] fArr3 = c1941q2.f9161j;
        if (AbstractC1934j.m5687d(c1943s, c1943s2)) {
            fArrM5690g = AbstractC1934j.m5690g(fArr3, fArr2);
        } else {
            float[] fArrM5692a = c1943s.m5692a();
            float[] fArrM5692a2 = c1943s2.m5692a();
            C1943s c1943s3 = AbstractC1934j.f9137b;
            fArrM5690g = AbstractC1934j.m5690g(AbstractC1934j.m5687d(c1943s2, c1943s3) ? fArr3 : AbstractC1934j.m5689f(AbstractC1934j.m5690g(AbstractC1934j.m5686c(fArr, fArrM5692a2, new float[]{0.964212f, 1.0f, 0.825188f}), c1941q2.f9160i)), AbstractC1934j.m5687d(c1943s, c1943s3) ? fArr2 : AbstractC1934j.m5690g(AbstractC1934j.m5686c(fArr, fArrM5692a, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f9130g = fArrM5690g;
    }

    @Override // e3.C1931g
    /* renamed from: a */
    public final long mo5683a(long j6) {
        float fM5192h = C1565s.m5192h(j6);
        float fM5191g = C1565s.m5191g(j6);
        float fM5189e = C1565s.m5189e(j6);
        float fM5188d = C1565s.m5188d(j6);
        C1937m c1937m = this.f9128e.f9167p;
        float fMo5263a = (float) c1937m.mo5263a(fM5192h);
        float fMo5263a2 = (float) c1937m.mo5263a(fM5191g);
        float fMo5263a3 = (float) c1937m.mo5263a(fM5189e);
        float[] fArr = this.f9130g;
        float f6 = (fArr[6] * fMo5263a3) + (fArr[3] * fMo5263a2) + (fArr[0] * fMo5263a);
        float f10 = (fArr[7] * fMo5263a3) + (fArr[4] * fMo5263a2) + (fArr[1] * fMo5263a);
        float f11 = (fArr[8] * fMo5263a3) + (fArr[5] * fMo5263a2) + (fArr[2] * fMo5263a);
        C1941q c1941q = this.f9129f;
        float fMo5263a4 = (float) c1941q.f9164m.mo5263a(f6);
        C1937m c1937m2 = c1941q.f9164m;
        return h0.m5130b(fMo5263a4, (float) c1937m2.mo5263a(f10), (float) c1937m2.mo5263a(f11), fM5188d, c1941q);
    }
}
