package p001o;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public abstract class zla implements Interpolator {

    /* renamed from: a */
    public final float[] f57363a;

    /* renamed from: b */
    public final float f57364b;

    public zla(float[] fArr) {
        this.f57363a = fArr;
        this.f57364b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f57363a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f57364b;
        float f3 = (f - (iMin * f2)) / f2;
        float[] fArr2 = this.f57363a;
        float f4 = fArr2[iMin];
        return f4 + (f3 * (fArr2[iMin + 1] - f4));
    }
}
