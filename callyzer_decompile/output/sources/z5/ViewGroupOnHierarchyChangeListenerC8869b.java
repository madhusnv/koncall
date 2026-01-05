package z5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.websoptimization.callyzerbiz.MainActivity;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z5.b */
/* loaded from: classes.dex */
public final class ViewGroupOnHierarchyChangeListenerC8869b implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    public final /* synthetic */ MainActivity f42685a;

    public ViewGroupOnHierarchyChangeListenerC8869b(C8870c c8870c, MainActivity mainActivity) {
        this.f42685a = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (view2 instanceof SplashScreenView) {
            WindowInsets windowInsetsBuild = new WindowInsets.Builder().build();
            AbstractC4154l.m8922e(windowInsetsBuild, "build(...)");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (windowInsetsBuild == ((SplashScreenView) view2).getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            View decorView = this.f42685a.getWindow().getDecorView();
            AbstractC4154l.m8921d(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
