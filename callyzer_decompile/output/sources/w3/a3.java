package w3;

import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a3 implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ View f37689a;

    /* renamed from: b */
    public final /* synthetic */ k2.q1 f37690b;

    public a3(View view, k2.q1 q1Var) {
        this.f37689a = view;
        this.f37690b = q1Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f37689a.removeOnAttachStateChangeListener(this);
        this.f37690b.m8650t();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
