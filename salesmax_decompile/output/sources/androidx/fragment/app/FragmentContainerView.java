package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.TokenParser;
import p001o.id5;
import p001o.qbe;
import p001o.r9j;
import p001o.sq8;
import p001o.wvi;

/* loaded from: classes2.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public final List f7388a;

    /* renamed from: b */
    public final List f7389b;

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f7390c;

    /* renamed from: d */
    public boolean f7391d;

    /* renamed from: androidx.fragment.app.FragmentContainerView$a */
    public static final class C2092a {

        /* renamed from: a */
        public static final C2092a f7392a = new C2092a();

        /* renamed from: a */
        public final WindowInsets m6162a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            sq8.m48649h(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            sq8.m48649h(view, "v");
            sq8.m48649h(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            sq8.m48648g(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        sq8.m48649h(context, "context");
    }

    /* renamed from: a */
    public final void m6161a(View view) {
        if (this.f7389b.contains(view)) {
            this.f7388a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        sq8.m48649h(view, "child");
        if (FragmentManager.J0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        r9j r9jVarM55112Y;
        sq8.m48649h(windowInsets, "insets");
        r9j r9jVarM46384w = r9j.m46384w(windowInsets);
        sq8.m48648g(r9jVarM46384w, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f7390c;
        if (onApplyWindowInsetsListener != null) {
            C2092a c2092a = C2092a.f7392a;
            sq8.m48646e(onApplyWindowInsetsListener);
            r9jVarM55112Y = r9j.m46384w(c2092a.m6162a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            r9jVarM55112Y = wvi.m55112Y(this, r9jVarM46384w);
        }
        sq8.m48648g(r9jVarM55112Y, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!r9jVarM55112Y.m46400p()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                wvi.m55120g(getChildAt(i), r9jVarM55112Y);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        if (this.f7391d) {
            Iterator it = this.f7388a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        sq8.m48649h(canvas, "canvas");
        sq8.m48649h(view, "child");
        if (this.f7391d && (!this.f7388a.isEmpty()) && this.f7388a.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        sq8.m48649h(view, "view");
        this.f7389b.remove(view);
        if (this.f7388a.remove(view)) {
            this.f7391d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) FragmentManager.o0(this).l0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        sq8.m48649h(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                sq8.m48648g(childAt, "view");
                m6161a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        sq8.m48649h(view, "view");
        m6161a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        sq8.m48648g(childAt, "view");
        m6161a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        sq8.m48649h(view, "view");
        m6161a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            sq8.m48648g(childAt, "view");
            m6161a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            sq8.m48648g(childAt, "view");
            m6161a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f7391d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f7390c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        sq8.m48649h(view, "view");
        if (view.getParent() == this) {
            this.f7389b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        sq8.m48649h(context, "context");
        this.f7388a = new ArrayList();
        this.f7389b = new ArrayList();
        this.f7391d = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, id5 id5Var) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        this.f7388a = new ArrayList();
        this.f7389b = new ArrayList();
        this.f7391d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = qbe.FragmentContainerView;
            sq8.m48648g(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(qbe.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + TokenParser.DQUOTE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        sq8.m48649h(context, "context");
        sq8.m48649h(attributeSet, "attrs");
        sq8.m48649h(fragmentManager, "fm");
        this.f7388a = new ArrayList();
        this.f7389b = new ArrayList();
        this.f7391d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = qbe.FragmentContainerView;
        sq8.m48648g(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(qbe.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(qbe.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentL0 = fragmentManager.l0(id);
        if (classAttribute != null && fragmentL0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentMo6226a = fragmentManager.z0().mo6226a(context.getClassLoader(), classAttribute);
            sq8.m48648g(fragmentMo6226a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentMo6226a.mFragmentId = id;
            fragmentMo6226a.mContainerId = id;
            fragmentMo6226a.mTag = string;
            fragmentMo6226a.mFragmentManager = fragmentManager;
            fragmentMo6226a.mHost = fragmentManager.C0();
            fragmentMo6226a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m6205q().m6429v(true).m6420d(this, fragmentMo6226a, string).mo6263k();
        }
        fragmentManager.i1(this);
    }
}
