package c6;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o0 {
    /* renamed from: a */
    public static y1 m2463a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        y1 y1VarM2537d = y1.m2537d(null, rootWindowInsets);
        v1 v1Var = y1VarM2537d.f5541a;
        v1Var.mo2483t(y1VarM2537d);
        v1Var.mo2473d(view.getRootView());
        return y1VarM2537d;
    }
}
