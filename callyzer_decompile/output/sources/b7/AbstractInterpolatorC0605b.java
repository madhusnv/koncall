package b7;

import android.view.animation.Interpolator;
import com.skydoves.balloon.internals.DefinitionKt;
import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b7.b */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0605b implements Interpolator {

    /* renamed from: a */
    public final float[] f3994a;

    /* renamed from: b */
    public final float f3995b;

    public AbstractInterpolatorC0605b(float[] fArr) {
        this.f3994a = fArr;
        this.f3995b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= DefinitionKt.NO_Float_VALUE) {
            return DefinitionKt.NO_Float_VALUE;
        }
        float[] fArr = this.f3994a;
        int iMin = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f10 = this.f3995b;
        float f11 = (f6 - (iMin * f10)) / f10;
        float f12 = fArr[iMin];
        return m0.m7368a(fArr[iMin + 1], f12, f11, f12);
    }
}
