package p012n;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import c6.y0;
import com.websoptimization.callyzerbiz.R;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;
import mx.AbstractC4913i;
import tx.s1;
import w3.AbstractC7883a;
import w3.b0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.d */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC4924d implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f24496a;

    /* renamed from: b */
    public final /* synthetic */ Object f24497b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC4924d(int i10, Object obj) {
        this.f24496a = i10;
        this.f24497b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f24496a) {
            case 2:
                b0 b0Var = (b0) this.f24497b;
                AccessibilityManager accessibilityManager = b0Var.f37714g;
                accessibilityManager.addAccessibilityStateChangeListener(b0Var.f37716i);
                accessibilityManager.addTouchExplorationStateChangeListener(b0Var.f37717j);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z6;
        switch (this.f24496a) {
            case 0:
                ViewOnKeyListenerC4926f viewOnKeyListenerC4926f = (ViewOnKeyListenerC4926f) this.f24497b;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC4926f.f24501B;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC4926f.f24501B = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4926f.f24501B.removeGlobalOnLayoutListener(viewOnKeyListenerC4926f.f24511j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                ViewOnKeyListenerC4938r viewOnKeyListenerC4938r = (ViewOnKeyListenerC4938r) this.f24497b;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC4938r.f24607q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC4938r.f24607q = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC4938r.f24607q.removeGlobalOnLayoutListener(viewOnKeyListenerC4938r.f24601j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                b0 b0Var = (b0) this.f24497b;
                b0Var.f37719l.removeCallbacks(b0Var.f37708M);
                AccessibilityManager accessibilityManager = b0Var.f37714g;
                accessibilityManager.removeAccessibilityStateChangeListener(b0Var.f37716i);
                accessibilityManager.removeTouchExplorationStateChangeListener(b0Var.f37717j);
                break;
            case 3:
                AbstractC7883a abstractC7883a = (AbstractC7883a) this.f24497b;
                Iterator it = AbstractC4913i.m9809e(y0.f5539a, abstractC7883a.getParent()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            AbstractC4154l.m8923f(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z6 = true;
                            }
                        }
                    }
                }
                if (!z6) {
                    abstractC7883a.disposeComposition();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((s1) this.f24497b).mo13510j(null);
                break;
        }
    }

    /* renamed from: a */
    private final void m9829a(View view) {
    }

    /* renamed from: b */
    private final void m9830b(View view) {
    }

    /* renamed from: c */
    private final void m9831c(View view) {
    }

    /* renamed from: d */
    private final void m9832d(View view) {
    }
}
