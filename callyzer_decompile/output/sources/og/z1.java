package og;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a */
    public static final /* synthetic */ int f26982a = 0;

    /* renamed from: a */
    public static final String m11079a(float f6) {
        if (Float.isNaN(f6)) {
            return "NaN";
        }
        if (Float.isInfinite(f6)) {
            return f6 < DefinitionKt.NO_Float_VALUE ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f10 = f6 * fPow;
        int i10 = (int) f10;
        if (f10 - i10 >= 0.5f) {
            i10++;
        }
        float f11 = i10 / fPow;
        return iMax > 0 ? String.valueOf(f11) : String.valueOf((int) f11);
    }
}
