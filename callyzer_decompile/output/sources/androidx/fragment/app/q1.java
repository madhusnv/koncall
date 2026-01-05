package androidx.fragment.app;

import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q1 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f2685a;

    public q1(View view) {
        this.f2685a = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.f2685a;
        view2.removeOnAttachStateChangeListener(this);
        Field field = c6.v0.f5527a;
        c6.l0.m2444c(view2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
