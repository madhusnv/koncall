package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ s1 f2722a;

    /* renamed from: b */
    public final /* synthetic */ w0 f2723b;

    public v0(w0 w0Var, s1 s1Var) {
        this.f2723b = w0Var;
        this.f2722a = s1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        s1 s1Var = this.f2722a;
        j0 j0Var = s1Var.f2696c;
        s1Var.m1254i();
        C0352q.m1232j((ViewGroup) j0Var.mView.getParent(), this.f2723b.f2742a).m1241i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
