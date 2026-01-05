package w3;

import android.view.ViewParent;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h3 {
    /* renamed from: a */
    public static void m14957a(C7904v c7904v) {
        ViewParent parent = c7904v.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c7904v, c7904v);
        }
    }
}
