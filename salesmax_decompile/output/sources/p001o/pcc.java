package p001o;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class pcc implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f39810a;

    /* renamed from: b */
    public ViewTreeObserver f39811b;

    /* renamed from: c */
    public final Runnable f39812c;

    public pcc(View view, Runnable runnable) {
        this.f39810a = view;
        this.f39811b = view.getViewTreeObserver();
        this.f39812c = runnable;
    }

    /* renamed from: a */
    public static pcc m43344a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        pcc pccVar = new pcc(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pccVar);
        view.addOnAttachStateChangeListener(pccVar);
        return pccVar;
    }

    /* renamed from: b */
    public void m43345b() {
        if (this.f39811b.isAlive()) {
            this.f39811b.removeOnPreDrawListener(this);
        } else {
            this.f39810a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f39810a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m43345b();
        this.f39812c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f39811b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m43345b();
    }
}
