package c6;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class l0 {
    /* renamed from: a */
    public static WindowInsets m2442a(View view, WindowInsets windowInsets) {
        int i10 = x0.f5535a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m2443b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m2444c(View view) {
        view.requestApplyInsets();
    }
}
