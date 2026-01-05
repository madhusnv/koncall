package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import x6.AbstractC8310a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 extends FrameLayout {

    /* renamed from: a */
    public final ArrayList f2690a;

    /* renamed from: b */
    public final ArrayList f2691b;

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f2692c;

    /* renamed from: d */
    public boolean f2693d;

    public s0(Context context) {
        super(context);
        this.f2690a = new ArrayList();
        this.f2691b = new ArrayList();
        this.f2693d = true;
    }

    /* renamed from: a */
    public final void m1245a(View view) {
        if (this.f2691b.contains(view)) {
            this.f2690a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i10, ViewGroup.LayoutParams layoutParams) {
        AbstractC4154l.m8923f(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof j0 ? (j0) tag : null) != null) {
            super.addView(child, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        c6.y1 y1VarM2537d;
        AbstractC4154l.m8923f(insets, "insets");
        c6.y1 y1VarM2537d2 = c6.y1.m2537d(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2692c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            AbstractC4154l.m8922e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            y1VarM2537d = c6.y1.m2537d(null, windowInsetsOnApplyWindowInsets);
        } else {
            Field field = c6.v0.f5527a;
            WindowInsets windowInsetsM2539c = y1VarM2537d2.m2539c();
            if (windowInsetsM2539c != null) {
                WindowInsets windowInsetsM2443b = c6.l0.m2443b(this, windowInsetsM2539c);
                if (!windowInsetsM2443b.equals(windowInsetsM2539c)) {
                    y1VarM2537d2 = c6.y1.m2537d(this, windowInsetsM2443b);
                }
            }
            y1VarM2537d = y1VarM2537d2;
        }
        if (!y1VarM2537d.f5541a.mo2496o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                c6.v0.m2519a(getChildAt(i10), y1VarM2537d);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC4154l.m8923f(canvas, "canvas");
        if (this.f2693d) {
            ArrayList arrayList = this.f2690a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j6) {
        AbstractC4154l.m8923f(canvas, "canvas");
        AbstractC4154l.m8923f(child, "child");
        if (this.f2693d) {
            ArrayList arrayList = this.f2690a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j6);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC4154l.m8923f(view, "view");
        this.f2691b.remove(view);
        if (this.f2690a.remove(view)) {
            this.f2693d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends j0> F getFragment() {
        o0 o0Var;
        j1 supportFragmentManager;
        j0 j0VarM1150E = j1.m1150E(this);
        if (j0VarM1150E == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    o0Var = null;
                    break;
                }
                if (context instanceof o0) {
                    o0Var = (o0) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (o0Var == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = o0Var.getSupportFragmentManager();
        } else {
            if (!j0VarM1150E.isAdded()) {
                throw new IllegalStateException("The Fragment " + j0VarM1150E + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = j0VarM1150E.getChildFragmentManager();
        }
        return (F) supportFragmentManager.m1157C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        AbstractC4154l.m8923f(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                AbstractC4154l.m8922e(view, "view");
                m1245a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC4154l.m8923f(view, "view");
        m1245a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View view = getChildAt(i10);
        AbstractC4154l.m8922e(view, "view");
        m1245a(view);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC4154l.m8923f(view, "view");
        m1245a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            AbstractC4154l.m8922e(view, "view");
            m1245a(view);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View view = getChildAt(i13);
            AbstractC4154l.m8922e(view, "view");
            m1245a(view);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f2693d = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.f2692c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC4154l.m8923f(view, "view");
        if (view.getParent() == this) {
            this.f2691b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, AttributeSet attrs, j1 j1Var) {
        View view;
        super(context, attrs);
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(attrs, "attrs");
        this.f2690a = new ArrayList();
        this.f2691b = new ArrayList();
        this.f2693d = true;
        String classAttribute = attrs.getClassAttribute();
        int i10 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC8310a.f39859b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        j0 j0VarM1157C = j1Var.m1157C(id2);
        if (classAttribute != null && j0VarM1157C == null) {
            if (id2 == -1) {
                throw new IllegalStateException(AbstractC5601a.m11238i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            b1 b1VarM1161I = j1Var.m1161I();
            context.getClassLoader();
            j0 j0VarM1119a = b1VarM1161I.m1119a(classAttribute);
            AbstractC4154l.m8922e(j0VarM1119a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            j0VarM1119a.mFragmentId = id2;
            j0VarM1119a.mContainerId = id2;
            j0VarM1119a.mTag = string;
            j0VarM1119a.mFragmentManager = j1Var;
            j0VarM1119a.mHost = j1Var.f2601w;
            j0VarM1119a.onInflate(context, attrs, (Bundle) null);
            C0336a c0336a = new C0336a(j1Var);
            c0336a.f2449p = true;
            j0VarM1119a.mContainer = this;
            j0VarM1119a.mInDynamicContainer = true;
            c0336a.m1092g(getId(), j0VarM1119a, string, 1);
            if (!c0336a.f2440g) {
                c0336a.f2441h = false;
                j1 j1Var2 = c0336a.f2451r;
                t1 t1Var = j1Var2.f2581c;
                if (j1Var2.f2601w != null && !j1Var2.f2572J) {
                    j1Var2.m1200y(true);
                    C0336a c0336a2 = j1Var2.f2586h;
                    if (c0336a2 != null) {
                        c0336a2.f2452s = false;
                        c0336a2.m1089d();
                        if (j1.m1152K(3)) {
                            Objects.toString(j1Var2.f2586h);
                            Objects.toString(c0336a);
                        }
                        j1Var2.f2586h.m1091f(false, false);
                        j1Var2.f2586h.mo1086a(j1Var2.f2574L, j1Var2.f2575M);
                        ArrayList arrayList = j1Var2.f2586h.f2434a;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            j0 j0Var = ((u1) obj).f2712b;
                            if (j0Var != null) {
                                j0Var.mTransitioning = false;
                            }
                        }
                        j1Var2.f2586h = null;
                    }
                    c0336a.mo1086a(j1Var2.f2574L, j1Var2.f2575M);
                    j1Var2.f2580b = true;
                    try {
                        j1Var2.m1171V(j1Var2.f2574L, j1Var2.f2575M);
                        j1Var2.m1179d();
                        j1Var2.e0();
                        if (j1Var2.f2573K) {
                            j1Var2.f2573K = false;
                            ArrayList arrayListM1263d = t1Var.m1263d();
                            int size2 = arrayListM1263d.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                Object obj2 = arrayListM1263d.get(i12);
                                i12++;
                                s1 s1Var = (s1) obj2;
                                j0 j0Var2 = s1Var.f2696c;
                                if (j0Var2.mDeferStart) {
                                    if (j1Var2.f2580b) {
                                        j1Var2.f2573K = true;
                                    } else {
                                        j0Var2.mDeferStart = false;
                                        s1Var.m1254i();
                                    }
                                }
                            }
                        }
                        t1Var.f2703b.values().removeAll(Collections.singleton(null));
                    } catch (Throwable th2) {
                        j1Var2.m1179d();
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListM1263d2 = j1Var.f2581c.m1263d();
        int size3 = arrayListM1263d2.size();
        while (i10 < size3) {
            Object obj3 = arrayListM1263d2.get(i10);
            i10++;
            s1 s1Var2 = (s1) obj3;
            j0 j0Var3 = s1Var2.f2696c;
            if (j0Var3.mContainerId == getId() && (view = j0Var3.mView) != null && view.getParent() == null) {
                j0Var3.mContainer = this;
                s1Var2.m1246a();
                s1Var2.m1254i();
            }
        }
    }
}
