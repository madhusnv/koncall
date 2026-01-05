package c6;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c6.y */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0895y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f5536a;

    /* renamed from: b */
    public ViewTreeObserver f5537b;

    /* renamed from: c */
    public final Runnable f5538c;

    public ViewTreeObserverOnPreDrawListenerC0895y(View view, Runnable runnable) {
        this.f5536a = view;
        this.f5537b = view.getViewTreeObserver();
        this.f5538c = runnable;
    }

    /* renamed from: a */
    public static void m2535a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0895y viewTreeObserverOnPreDrawListenerC0895y = new ViewTreeObserverOnPreDrawListenerC0895y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0895y);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0895y);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f5537b.isAlive();
        View view = this.f5536a;
        if (zIsAlive) {
            this.f5537b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f5538c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f5537b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f5537b.isAlive();
        View view2 = this.f5536a;
        if (zIsAlive) {
            this.f5537b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
