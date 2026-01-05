package p013o;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p004e.C1890y;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class z1 {
    /* renamed from: a */
    public static OnBackInvokedDispatcher m10307a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: b */
    public static OnBackInvokedCallback m10308b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C1890y(1, runnable);
    }

    /* renamed from: c */
    public static void m10309c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    public static void m10310d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
