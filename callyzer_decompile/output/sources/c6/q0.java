package c6;

import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class q0 {
    /* renamed from: a */
    public static CharSequence m2488a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: b */
    public static boolean m2489b(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: c */
    public static boolean m2490c(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: d */
    public static void m2491d(View view, boolean z6) {
        view.setAccessibilityHeading(z6);
    }

    /* renamed from: e */
    public static void m2492e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }
}
