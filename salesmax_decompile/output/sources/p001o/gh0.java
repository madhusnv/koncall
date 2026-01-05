package p001o;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
public abstract class gh0 {

    /* renamed from: a */
    public static final TimeInterpolator f25146a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f25147b = new at6();

    /* renamed from: c */
    public static final TimeInterpolator f25148c = new zs6();

    /* renamed from: d */
    public static final TimeInterpolator f25149d = new rda();

    /* renamed from: e */
    public static final TimeInterpolator f25150e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m28647a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m28648b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : m28647a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m28649c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
