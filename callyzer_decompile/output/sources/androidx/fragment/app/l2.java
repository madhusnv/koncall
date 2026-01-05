package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public enum l2 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static final j2 Companion = new j2();

    public static final l2 from(int i10) {
        Companion.getClass();
        return j2.m1203b(i10);
    }

    public final void applyState(View view, ViewGroup container) {
        AbstractC4154l.m8923f(view, "view");
        AbstractC4154l.m8923f(container, "container");
        int i10 = k2.f2608a[ordinal()];
        if (i10 == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (j1.m1152K(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (j1.m1152K(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (j1.m1152K(2)) {
                    view.toString();
                    container.toString();
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i10 == 3) {
            if (j1.m1152K(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (i10 != 4) {
                return;
            }
            if (j1.m1152K(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }
}
