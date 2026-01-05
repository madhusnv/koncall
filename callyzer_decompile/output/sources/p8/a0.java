package p8;

import android.view.View;
import og.lb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a0 extends lb {

    /* renamed from: c */
    public static boolean f28544c = true;

    /* renamed from: c */
    public float mo11415c(View view) {
        if (f28544c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f28544c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo11416d(View view, float f6) {
        if (f28544c) {
            try {
                view.setTransitionAlpha(f6);
                return;
            } catch (NoSuchMethodError unused) {
                f28544c = false;
            }
        }
        view.setAlpha(f6);
    }
}
