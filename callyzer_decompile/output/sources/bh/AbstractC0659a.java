package bh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import b7.C0604a;
import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bh.a */
/* loaded from: classes.dex */
public abstract class AbstractC0659a {

    /* renamed from: a */
    public static final LinearInterpolator f4203a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0604a f4204b = new C0604a(C0604a.f3992d);

    /* renamed from: c */
    public static final C0604a f4205c = new C0604a();

    /* renamed from: d */
    public static final C0604a f4206d = new C0604a(C0604a.f3993e);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static float m1929a(float f6, float f10, float f11) {
        return m0.m7368a(f10, f6, f11, f6);
    }
}
