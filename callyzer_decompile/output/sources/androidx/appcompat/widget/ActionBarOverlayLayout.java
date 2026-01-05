package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import c6.C0892v;
import c6.InterfaceC0890t;
import c6.InterfaceC0891u;
import c6.j1;
import c6.l0;
import c6.l1;
import c6.m1;
import c6.n0;
import c6.n1;
import c6.o1;
import c6.v0;
import c6.v1;
import c6.y1;
import com.websoptimization.callyzerbiz.R;
import dh.C1723a;
import java.lang.reflect.Field;
import p013o.C5218d;
import p013o.C5219e;
import p013o.InterfaceC5217c;
import p013o.RunnableC5216b;
import p013o.e2;
import p013o.q0;
import pg.s8;
import u5.C7340b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0890t, InterfaceC0891u {

    /* renamed from: D */
    public static final int[] f1722D = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: E */
    public static final y1 f1723E;

    /* renamed from: F */
    public static final Rect f1724F;

    /* renamed from: B */
    public final C0892v f1725B;

    /* renamed from: C */
    public final C5219e f1726C;

    /* renamed from: a */
    public int f1727a;

    /* renamed from: b */
    public ContentFrameLayout f1728b;

    /* renamed from: c */
    public ActionBarContainer f1729c;

    /* renamed from: d */
    public q0 f1730d;

    /* renamed from: e */
    public Drawable f1731e;

    /* renamed from: f */
    public boolean f1732f;

    /* renamed from: g */
    public boolean f1733g;

    /* renamed from: h */
    public boolean f1734h;

    /* renamed from: j */
    public boolean f1735j;

    /* renamed from: k */
    public int f1736k;

    /* renamed from: l */
    public final Rect f1737l;

    /* renamed from: m */
    public final Rect f1738m;

    /* renamed from: n */
    public final Rect f1739n;

    /* renamed from: p */
    public final Rect f1740p;

    /* renamed from: q */
    public y1 f1741q;

    /* renamed from: r */
    public y1 f1742r;

    /* renamed from: s */
    public y1 f1743s;

    /* renamed from: t */
    public y1 f1744t;

    /* renamed from: v */
    public OverScroller f1745v;

    /* renamed from: w */
    public ViewPropertyAnimator f1746w;

    /* renamed from: x */
    public final C1723a f1747x;

    /* renamed from: y */
    public final RunnableC5216b f1748y;

    /* renamed from: z */
    public final RunnableC5216b f1749z;

    static {
        int i10 = Build.VERSION.SDK_INT;
        o1 n1Var = i10 >= 34 ? new n1() : i10 >= 30 ? new m1() : i10 >= 29 ? new l1() : new j1();
        n1Var.mo2432g(C7340b.m13736b(0, 1, 0, 1));
        f1723E = n1Var.mo2430b();
        f1724F = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1737l = new Rect();
        this.f1738m = new Rect();
        this.f1739n = new Rect();
        this.f1740p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        y1 y1Var = y1.f5540b;
        this.f1741q = y1Var;
        this.f1742r = y1Var;
        this.f1743s = y1Var;
        this.f1744t = y1Var;
        this.f1747x = new C1723a(1, this);
        this.f1748y = new RunnableC5216b(this, 0);
        this.f1749z = new RunnableC5216b(this, 1);
        m563e(context);
        this.f1725B = new C0892v();
        C5219e c5219e = new C5219e(context);
        c5219e.setWillNotDraw(true);
        this.f1726C = c5219e;
        addView(c5219e);
    }

    /* renamed from: a */
    public static boolean m559a(View view, Rect rect, boolean z6) {
        boolean z10;
        C5218d c5218d = (C5218d) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) c5218d).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c5218d).leftMargin = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) c5218d).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) c5218d).topMargin = i13;
            z10 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) c5218d).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) c5218d).rightMargin = i15;
            z10 = true;
        }
        if (z6) {
            int i16 = ((ViewGroup.MarginLayoutParams) c5218d).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) c5218d).bottomMargin = i17;
                return true;
            }
        }
        return z10;
    }

    /* renamed from: b */
    public final void m560b() {
        removeCallbacks(this.f1748y);
        removeCallbacks(this.f1749z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1746w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: c */
    public final void mo561c(int i10, View view) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5218d;
    }

    @Override // c6.InterfaceC0891u
    /* renamed from: d */
    public final void mo562d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        mo564f(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f1731e != null) {
            if (this.f1729c.getVisibility() == 0) {
                translationY = (int) (this.f1729c.getTranslationY() + this.f1729c.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f1731e.setBounds(0, translationY, getWidth(), this.f1731e.getIntrinsicHeight() + translationY);
            this.f1731e.draw(canvas);
        }
    }

    /* renamed from: e */
    public final void m563e(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1722D);
        this.f1727a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1731e = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1745v = new OverScroller(context);
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: f */
    public final void mo564f(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: g */
    public final boolean mo565g(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C5218d(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5218d(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1729c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0892v c0892v = this.f1725B;
        return c0892v.f5526b | c0892v.f5525a;
    }

    public CharSequence getTitle() {
        m568j();
        return ((e2) this.f1730d).f25465a.getTitle();
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: h */
    public final void mo566h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    /* renamed from: j */
    public final void m568j() {
        q0 wrapper;
        if (this.f1728b == null) {
            this.f1728b = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1729c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof q0) {
                wrapper = (q0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f1730d = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m568j();
        y1 y1VarM2537d = y1.m2537d(this, windowInsets);
        v1 v1Var = y1VarM2537d.f5541a;
        boolean zM559a = m559a(this.f1729c, new Rect(v1Var.mo2477l().f34957a, y1VarM2537d.m2538a(), v1Var.mo2477l().f34959c, v1Var.mo2477l().f34960d), false);
        Field field = v0.f5527a;
        Rect rect = this.f1737l;
        n0.m2450b(this, y1VarM2537d, rect);
        y1 y1VarMo2478n = v1Var.mo2478n(rect.left, rect.top, rect.right, rect.bottom);
        this.f1741q = y1VarMo2478n;
        boolean z6 = true;
        if (!this.f1742r.equals(y1VarMo2478n)) {
            this.f1742r = this.f1741q;
            zM559a = true;
        }
        Rect rect2 = this.f1738m;
        if (rect2.equals(rect)) {
            z6 = zM559a;
        } else {
            rect2.set(rect);
        }
        if (z6) {
            requestLayout();
        }
        return v1Var.mo2500a().f5541a.mo2494c().f5541a.mo2493b().m2539c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m563e(getContext());
        Field field = v0.f5527a;
        l0.m2444c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m560b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C5218d c5218d = (C5218d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c5218d).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c5218d).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z6) {
        if (!this.f1734h || !z6) {
            return false;
        }
        this.f1745v.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1745v.getFinalY() > this.f1729c.getHeight()) {
            m560b();
            this.f1749z.run();
        } else {
            m560b();
            this.f1748y.run();
        }
        this.f1735j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1736k + i11;
        this.f1736k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f1725B.f5525a = i10;
        this.f1736k = getActionBarHideOffset();
        m560b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1729c.getVisibility() != 0) {
            return false;
        }
        return this.f1734h;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1734h || this.f1735j) {
            return;
        }
        if (this.f1736k <= this.f1729c.getHeight()) {
            m560b();
            postDelayed(this.f1748y, 600L);
        } else {
            m560b();
            postDelayed(this.f1749z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        m568j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setActionBarHideOffset(int i10) {
        m560b();
        this.f1729c.setTranslationY(-Math.max(0, Math.min(i10, this.f1729c.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC5217c interfaceC5217c) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z6) {
        this.f1733g = z6;
    }

    public void setHideOnContentScrollEnabled(boolean z6) {
        if (z6 != this.f1734h) {
            this.f1734h = z6;
            if (z6) {
                return;
            }
            m560b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        m568j();
        e2 e2Var = (e2) this.f1730d;
        e2Var.f25468d = i10 != 0 ? s8.m11864b(e2Var.f25465a.getContext(), i10) : null;
        e2Var.m10225c();
    }

    public void setLogo(int i10) {
        m568j();
        e2 e2Var = (e2) this.f1730d;
        e2Var.f25469e = i10 != 0 ? s8.m11864b(e2Var.f25465a.getContext(), i10) : null;
        e2Var.m10225c();
    }

    public void setOverlayMode(boolean z6) {
        this.f1732f = z6;
    }

    public void setWindowCallback(Window.Callback callback) {
        m568j();
        ((e2) this.f1730d).f25475k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        m568j();
        e2 e2Var = (e2) this.f1730d;
        if (e2Var.f25471g) {
            return;
        }
        Toolbar toolbar = e2Var.f25465a;
        e2Var.f25472h = charSequence;
        if ((e2Var.f25466b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (e2Var.f25471g) {
                v0.m2529k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C5218d(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m568j();
        e2 e2Var = (e2) this.f1730d;
        e2Var.f25468d = drawable;
        e2Var.m10225c();
    }

    public void setShowingForActionMode(boolean z6) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: i */
    public final void mo567i(View view, int i10, int i11, int[] iArr, int i12) {
    }
}
