package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.skydoves.balloon.internals.DefinitionKt;
import o2.C5271d;
import ph.C5950e;
import qh.AbstractC6217d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: g */
    public final C5950e f6934g;

    public BaseTransientBottomBar$Behavior() {
        C5950e c5950e = new C5950e(25);
        this.f6730d = Math.min(Math.max(DefinitionKt.NO_Float_VALUE, 0.1f), 1.0f);
        this.f6731e = Math.min(Math.max(DefinitionKt.NO_Float_VALUE, 0.6f), 1.0f);
        this.f6729c = 0;
        this.f6934g = c5950e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, o5.AbstractC5292a
    /* renamed from: f */
    public final boolean mo4035f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f6934g.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C5271d.f25904b == null) {
                    C5271d.f25904b = new C5271d(1);
                }
                synchronized (C5271d.f25904b.f25905a) {
                }
            }
        } else if (coordinatorLayout.m745n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C5271d.f25904b == null) {
                C5271d.f25904b = new C5271d(1);
            }
            synchronized (C5271d.f25904b.f25905a) {
            }
        }
        return super.mo4035f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: r */
    public final boolean mo4048r(View view) {
        this.f6934g.getClass();
        return view instanceof AbstractC6217d;
    }
}
