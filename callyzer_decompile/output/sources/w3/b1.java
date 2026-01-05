package w3;

import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b1 {
    /* renamed from: a */
    public static int m14891a(AccessibilityManager accessibilityManager, int i10, int i11) {
        return accessibilityManager.getRecommendedTimeoutMillis(i10, i11);
    }

    /* renamed from: b */
    public static final long m14892b(View view) {
        return view.getUniqueDrawingId();
    }
}
