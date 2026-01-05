package p001o;

import android.opengl.Matrix;

/* loaded from: classes2.dex */
public final class wj7 {

    /* renamed from: a */
    public final float[] f52229a = new float[16];

    /* renamed from: b */
    public final float[] f52230b = new float[16];

    /* renamed from: c */
    public final kmh f52231c = new kmh();

    /* renamed from: d */
    public boolean f52232d;

    /* renamed from: a */
    public static void m54622a(float[] fArr, float[] fArr2) {
        vs7.m53378k(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    /* renamed from: b */
    public static void m54623b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            vs7.m53378k(fArr);
        }
    }

    /* renamed from: c */
    public boolean m54624c(float[] fArr, long j) {
        float[] fArr2 = (float[]) this.f52231c.m35941j(j);
        if (fArr2 == null) {
            return false;
        }
        m54623b(this.f52230b, fArr2);
        if (!this.f52232d) {
            m54622a(this.f52229a, this.f52230b);
            this.f52232d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f52229a, 0, this.f52230b, 0);
        return true;
    }

    /* renamed from: d */
    public void m54625d() {
        this.f52231c.m35935c();
        this.f52232d = false;
    }

    /* renamed from: e */
    public void m54626e(long j, float[] fArr) {
        this.f52231c.m35933a(j, fArr);
    }
}
