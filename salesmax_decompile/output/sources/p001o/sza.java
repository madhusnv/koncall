package p001o;

import android.opengl.Matrix;

/* loaded from: classes2.dex */
public abstract class sza {

    /* renamed from: a */
    public static final float[] f46162a = new float[16];

    /* renamed from: a */
    public static void m49101a(float[] fArr, float f, float f2) {
        Matrix.translateM(fArr, 0, -f, -f2, 0.0f);
    }

    /* renamed from: b */
    public static void m49102b(float[] fArr, float f, float f2) {
        Matrix.translateM(fArr, 0, f, f2, 0.0f);
    }

    /* renamed from: c */
    public static void m49103c(float[] fArr, float f, float f2, float f3) {
        m49102b(fArr, f2, f3);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        m49101a(fArr, f2, f3);
    }

    /* renamed from: d */
    public static void m49104d(float[] fArr, float f) {
        m49102b(fArr, 0.0f, f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        m49101a(fArr, 0.0f, f);
    }
}
