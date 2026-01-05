package p001o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes3.dex */
public abstract class rza implements TypeEvaluator {

    /* renamed from: a */
    public final float[] f44333a = new float[9];

    /* renamed from: b */
    public final float[] f44334b = new float[9];

    /* renamed from: c */
    public final Matrix f44335c = new Matrix();

    /* renamed from: a */
    public Matrix mo14719a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f44333a);
        matrix2.getValues(this.f44334b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f44334b;
            float f2 = fArr[i];
            float f3 = this.f44333a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f44335c.setValues(this.f44334b);
        return this.f44335c;
    }
}
