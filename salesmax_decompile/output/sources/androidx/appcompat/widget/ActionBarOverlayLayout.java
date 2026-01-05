package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC1796i;
import com.google.android.gms.common.api.Api;
import p001o.d85;
import p001o.e85;
import p001o.ftb;
import p001o.gtb;
import p001o.htb;
import p001o.r8e;
import p001o.r9j;
import p001o.sj8;
import p001o.wvi;
import p001o.z5e;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements d85, ftb, gtb {
    public static final int[] x0 = {z5e.actionBarSize, R.attr.windowContentOverlay};
    public static final r9j y0 = new r9j.C16565b().m46411d(sj8.m48374b(0, 1, 0, 1)).m46408a();
    public static final Rect z0 = new Rect();

    /* renamed from: H */
    public final Rect f5712H;

    /* renamed from: L */
    public final Rect f5713L;

    /* renamed from: M */
    public final Rect f5714M;

    /* renamed from: Q */
    public final Rect f5715Q;

    /* renamed from: a */
    public int f5716a;

    /* renamed from: b */
    public int f5717b;

    /* renamed from: c */
    public ContentFrameLayout f5718c;

    /* renamed from: d */
    public ActionBarContainer f5719d;

    /* renamed from: e */
    public e85 f5720e;

    /* renamed from: f */
    public Drawable f5721f;

    /* renamed from: g */
    public boolean f5722g;

    /* renamed from: h */
    public boolean f5723h;
    public final Rect h0;
    public final Rect i0;
    public final Rect j0;
    public final Rect k0;
    public r9j l0;
    public r9j m0;
    public r9j n0;
    public r9j o0;
    public InterfaceC1805d p0;

    /* renamed from: q */
    public boolean f5724q;
    public OverScroller q0;
    public ViewPropertyAnimator r0;

    /* renamed from: s */
    public boolean f5725s;
    public final AnimatorListenerAdapter s0;
    public final Runnable t0;
    public final Runnable u0;
    public final htb v0;
    public final C1806e w0;

    /* renamed from: x */
    public int f5726x;

    /* renamed from: y */
    public int f5727y;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C1802a extends AnimatorListenerAdapter {
        public C1802a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.r0 = null;
            actionBarOverlayLayout.f5725s = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.r0 = null;
            actionBarOverlayLayout.f5725s = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class RunnableC1803b implements Runnable {
        public RunnableC1803b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m4140t();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.r0 = actionBarOverlayLayout.f5719d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.s0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class RunnableC1804c implements Runnable {
        public RunnableC1804c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m4140t();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.r0 = actionBarOverlayLayout.f5719d.animate().translationY(-ActionBarOverlayLayout.this.f5719d.getHeight()).setListener(ActionBarOverlayLayout.this.s0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC1805d {
        /* renamed from: a */
        void mo3923a();

        /* renamed from: b */
        void mo3924b(int i);

        /* renamed from: c */
        void mo3925c();

        /* renamed from: d */
        void mo3926d(boolean z);

        /* renamed from: e */
        void mo3927e();

        /* renamed from: f */
        void mo3928f();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static final class C1806e extends View {
        public C1806e(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public final boolean m4120A(float f) {
        this.q0.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return this.q0.getFinalY() > this.f5719d.getHeight();
    }

    @Override // p001o.d85
    /* renamed from: a */
    public boolean mo4121a() {
        m4145y();
        return this.f5720e.mo4452a();
    }

    @Override // p001o.d85
    /* renamed from: b */
    public boolean mo4122b() {
        m4145y();
        return this.f5720e.mo4453b();
    }

    @Override // p001o.d85
    /* renamed from: c */
    public boolean mo4123c() {
        m4145y();
        return this.f5720e.mo4454c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // p001o.d85
    /* renamed from: d */
    public boolean mo4124d() {
        m4145y();
        return this.f5720e.mo4455d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f5721f != null) {
            int bottom = this.f5719d.getVisibility() == 0 ? (int) (this.f5719d.getBottom() + this.f5719d.getTranslationY() + 0.5f) : 0;
            this.f5721f.setBounds(0, bottom, getWidth(), this.f5721f.getIntrinsicHeight() + bottom);
            this.f5721f.draw(canvas);
        }
    }

    @Override // p001o.d85
    /* renamed from: e */
    public boolean mo4125e() {
        m4145y();
        return this.f5720e.mo4456e();
    }

    @Override // p001o.d85
    /* renamed from: f */
    public void mo4126f(int i) {
        m4145y();
        if (i == 2) {
            this.f5720e.mo4465n();
        } else if (i == 5) {
            this.f5720e.mo4473v();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p001o.ftb
    /* renamed from: g */
    public void mo4127g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f5719d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.v0.m31120a();
    }

    public CharSequence getTitle() {
        m4145y();
        return this.f5720e.getTitle();
    }

    @Override // p001o.ftb
    /* renamed from: h */
    public void mo4128h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // p001o.ftb
    /* renamed from: i */
    public void mo4129i(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // p001o.d85
    /* renamed from: j */
    public void mo4130j() {
        m4145y();
        this.f5720e.mo4467p();
    }

    @Override // p001o.gtb
    /* renamed from: k */
    public void mo4131k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo4132l(view, i, i2, i3, i4, i5);
    }

    @Override // p001o.ftb
    /* renamed from: l */
    public void mo4132l(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // p001o.ftb
    /* renamed from: m */
    public boolean mo4133m(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: n */
    public final void m4134n() {
        m4140t();
        this.u0.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4135o(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z) {
            int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i2 = rect.left;
            if (i != i2) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
                z5 = true;
            } else {
                z5 = false;
            }
        }
        if (z2) {
            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i4 = rect.top;
            if (i3 != i4) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
                z5 = true;
            }
        }
        if (z4) {
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int i6 = rect.right;
            if (i5 != i6) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
                z5 = true;
            }
        }
        if (z3) {
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                return true;
            }
        }
        return z5;
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m4145y();
        r9j r9jVarM46385x = r9j.m46385x(windowInsets, this);
        boolean zM4135o = m4135o(this.f5719d, new Rect(r9jVarM46385x.m46395j(), r9jVarM46385x.m46397l(), r9jVarM46385x.m46396k(), r9jVarM46385x.m46394i()), true, true, false, true);
        wvi.m55119f(this, r9jVarM46385x, this.f5712H);
        Rect rect = this.f5712H;
        r9j r9jVarM46399n = r9jVarM46385x.m46399n(rect.left, rect.top, rect.right, rect.bottom);
        this.l0 = r9jVarM46399n;
        boolean z = true;
        if (!this.m0.equals(r9jVarM46399n)) {
            this.m0 = this.l0;
            zM4135o = true;
        }
        if (this.f5713L.equals(this.f5712H)) {
            z = zM4135o;
        } else {
            this.f5713L.set(this.f5712H);
        }
        if (z) {
            requestLayout();
        }
        return r9jVarM46385x.m46386a().m46388c().m46387b().m46406v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m4141u(getContext());
        wvi.j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4140t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        m4145y();
        measureChildWithMargins(this.f5719d, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f5719d.getLayoutParams();
        int iMax = Math.max(0, this.f5719d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.f5719d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f5719d.getMeasuredState());
        boolean z = (wvi.m55099L(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f5716a;
            if (this.f5723h && this.f5719d.getTabContainer() != null) {
                measuredHeight += this.f5716a;
            }
        } else {
            measuredHeight = this.f5719d.getVisibility() != 8 ? this.f5719d.getMeasuredHeight() : 0;
        }
        this.f5714M.set(this.f5712H);
        this.n0 = this.l0;
        if (this.f5722g || z || !m4136p()) {
            this.n0 = new r9j.C16565b(this.n0).m46411d(sj8.m48374b(this.n0.m46395j(), this.n0.m46397l() + measuredHeight, this.n0.m46396k(), this.n0.m46394i() + 0)).m46408a();
        } else {
            Rect rect = this.f5714M;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.n0 = this.n0.m46399n(0, measuredHeight, 0, 0);
        }
        m4135o(this.f5718c, this.f5714M, true, true, true, true);
        if (!this.o0.equals(this.n0)) {
            r9j r9jVar = this.n0;
            this.o0 = r9jVar;
            wvi.m55120g(this.f5718c, r9jVar);
        }
        measureChildWithMargins(this.f5718c, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f5718c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f5718c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f5718c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f5718c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f5724q || !z) {
            return false;
        }
        if (m4120A(f2)) {
            m4134n();
        } else {
            m4146z();
        }
        this.f5725s = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f5726x + i2;
        this.f5726x = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.v0.m31121b(view, view2, i);
        this.f5726x = getActionBarHideOffset();
        m4140t();
        InterfaceC1805d interfaceC1805d = this.p0;
        if (interfaceC1805d != null) {
            interfaceC1805d.mo3928f();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f5719d.getVisibility() != 0) {
            return false;
        }
        return this.f5724q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f5724q && !this.f5725s) {
            if (this.f5726x <= this.f5719d.getHeight()) {
                m4144x();
            } else {
                m4143w();
            }
        }
        InterfaceC1805d interfaceC1805d = this.p0;
        if (interfaceC1805d != null) {
            interfaceC1805d.mo3925c();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m4145y();
        int i2 = this.f5727y ^ i;
        this.f5727y = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC1805d interfaceC1805d = this.p0;
        if (interfaceC1805d != null) {
            interfaceC1805d.mo3926d(!z2);
            if (z || !z2) {
                this.p0.mo3923a();
            } else {
                this.p0.mo3927e();
            }
        }
        if ((i2 & 256) == 0 || this.p0 == null) {
            return;
        }
        wvi.j0(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f5717b = i;
        InterfaceC1805d interfaceC1805d = this.p0;
        if (interfaceC1805d != null) {
            interfaceC1805d.mo3924b(i);
        }
    }

    /* renamed from: p */
    public final boolean m4136p() {
        wvi.m55119f(this.w0, y0, this.f5715Q);
        return !this.f5715Q.equals(z0);
    }

    @Override // android.view.ViewGroup
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final e85 m4139s(View view) {
        if (view instanceof e85) {
            return (e85) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setActionBarHideOffset(int i) {
        m4140t();
        this.f5719d.setTranslationY(-Math.max(0, Math.min(i, this.f5719d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1805d interfaceC1805d) {
        this.p0 = interfaceC1805d;
        if (getWindowToken() != null) {
            this.p0.mo3924b(this.f5717b);
            int i = this.f5727y;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                wvi.j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f5723h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f5724q) {
            this.f5724q = z;
            if (z) {
                return;
            }
            m4140t();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m4145y();
        this.f5720e.setIcon(i);
    }

    public void setLogo(int i) {
        m4145y();
        this.f5720e.mo4469r(i);
    }

    @Override // p001o.d85
    public void setMenu(Menu menu, InterfaceC1796i.a aVar) {
        m4145y();
        this.f5720e.setMenu(menu, aVar);
    }

    @Override // p001o.d85
    public void setMenuPrepared() {
        m4145y();
        this.f5720e.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.f5722g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p001o.d85
    public void setWindowCallback(Window.Callback callback) {
        m4145y();
        this.f5720e.setWindowCallback(callback);
    }

    @Override // p001o.d85
    public void setWindowTitle(CharSequence charSequence) {
        m4145y();
        this.f5720e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void m4140t() {
        removeCallbacks(this.t0);
        removeCallbacks(this.u0);
        ViewPropertyAnimator viewPropertyAnimator = this.r0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: u */
    public final void m4141u(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(x0);
        this.f5716a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f5721f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.q0 = new OverScroller(context);
    }

    /* renamed from: v */
    public boolean m4142v() {
        return this.f5722g;
    }

    /* renamed from: w */
    public final void m4143w() {
        m4140t();
        postDelayed(this.u0, 600L);
    }

    /* renamed from: x */
    public final void m4144x() {
        m4140t();
        postDelayed(this.t0, 600L);
    }

    /* renamed from: y */
    public void m4145y() {
        if (this.f5718c == null) {
            this.f5718c = (ContentFrameLayout) findViewById(r8e.action_bar_activity_content);
            this.f5719d = (ActionBarContainer) findViewById(r8e.action_bar_container);
            this.f5720e = m4139s(findViewById(r8e.action_bar));
        }
    }

    /* renamed from: z */
    public final void m4146z() {
        m4140t();
        this.t0.run();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5717b = 0;
        this.f5712H = new Rect();
        this.f5713L = new Rect();
        this.f5714M = new Rect();
        this.f5715Q = new Rect();
        this.h0 = new Rect();
        this.i0 = new Rect();
        this.j0 = new Rect();
        this.k0 = new Rect();
        r9j r9jVar = r9j.f43261b;
        this.l0 = r9jVar;
        this.m0 = r9jVar;
        this.n0 = r9jVar;
        this.o0 = r9jVar;
        this.s0 = new C1802a();
        this.t0 = new RunnableC1803b();
        this.u0 = new RunnableC1804c();
        m4141u(context);
        this.v0 = new htb(this);
        C1806e c1806e = new C1806e(context);
        this.w0 = c1806e;
        addView(c1806e);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m4145y();
        this.f5720e.setIcon(drawable);
    }
}
