package g2;

import android.view.View;
import android.view.ViewTreeObserver;
import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n5 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public boolean f12189a;

    /* renamed from: b */
    public final /* synthetic */ View f12190b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f12191c;

    public n5(View view, InterfaceC2137a interfaceC2137a) {
        this.f12190b = view;
        this.f12191c = interfaceC2137a;
        view.addOnAttachStateChangeListener(this);
        if (this.f12189a || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f12189a = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f12191c.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f12189a) {
            return;
        }
        View view2 = this.f12190b;
        if (view2.isAttachedToWindow()) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f12189a = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f12189a) {
            this.f12190b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f12189a = false;
        }
    }
}
