package lh;

import android.view.View;
import c6.l0;
import c6.v0;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lh.l */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4476l implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Field field = v0.f5527a;
        l0.m2444c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
