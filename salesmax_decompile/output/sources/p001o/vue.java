package p001o;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public abstract class vue extends Drawable {

    /* renamed from: a */
    public static final double f50896a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static float m53455a(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f50896a) * f2)) : f;
    }

    /* renamed from: b */
    public static float m53456b(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f50896a) * f2)) : f * 1.5f;
    }
}
