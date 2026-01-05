package o5;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o5.e */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC5296e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f25996a;

    public ViewTreeObserverOnPreDrawListenerC5296e(CoordinatorLayout coordinatorLayout) {
        this.f25996a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f25996a.m746o(0);
        return true;
    }
}
