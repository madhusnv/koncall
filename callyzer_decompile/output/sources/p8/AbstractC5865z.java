package p8;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.z */
/* loaded from: classes.dex */
public abstract class AbstractC5865z {

    /* renamed from: a */
    public static final b0 f28643a;

    /* renamed from: b */
    public static final C5842c f28644b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f28643a = new c0();
        } else {
            f28643a = new b0();
        }
        f28644b = new C5842c(Float.class, "translationAlpha", 5);
        new C5842c(Rect.class, "clipBounds", 6);
    }

    /* renamed from: a */
    public static void m11467a(View view, int i10, int i11, int i12, int i13) {
        f28643a.mo11417e(view, i10, i11, i12, i13);
    }
}
