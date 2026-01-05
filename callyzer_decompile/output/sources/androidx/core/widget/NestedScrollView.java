package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import c6.C0878h;
import c6.C0889s;
import c6.C0892v;
import c6.InterfaceC0891u;
import c6.b0;
import c6.n0;
import c6.v0;
import com.google.android.material.datepicker.C1343g;
import com.skydoves.balloon.internals.DefinitionKt;
import g6.AbstractC2529d;
import g6.AbstractC2531f;
import g6.C2533h;
import g6.InterfaceC2532g;
import java.lang.reflect.Field;
import og.ag;
import zj.C8986c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0891u {

    /* renamed from: G */
    public static final float f2212G = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: H */
    public static final C1343g f2213H = new C1343g(2);

    /* renamed from: I */
    public static final int[] f2214I = {R.attr.fillViewport};

    /* renamed from: B */
    public C2533h f2215B;

    /* renamed from: C */
    public final C0892v f2216C;

    /* renamed from: D */
    public final C0889s f2217D;

    /* renamed from: E */
    public float f2218E;

    /* renamed from: F */
    public final C0878h f2219F;

    /* renamed from: a */
    public final float f2220a;

    /* renamed from: b */
    public long f2221b;

    /* renamed from: c */
    public final Rect f2222c;

    /* renamed from: d */
    public final OverScroller f2223d;

    /* renamed from: e */
    public final EdgeEffect f2224e;

    /* renamed from: f */
    public final EdgeEffect f2225f;

    /* renamed from: g */
    public b0 f2226g;

    /* renamed from: h */
    public int f2227h;

    /* renamed from: j */
    public boolean f2228j;

    /* renamed from: k */
    public boolean f2229k;

    /* renamed from: l */
    public View f2230l;

    /* renamed from: m */
    public boolean f2231m;

    /* renamed from: n */
    public VelocityTracker f2232n;

    /* renamed from: p */
    public boolean f2233p;

    /* renamed from: q */
    public boolean f2234q;

    /* renamed from: r */
    public final int f2235r;

    /* renamed from: s */
    public final int f2236s;

    /* renamed from: t */
    public final int f2237t;

    /* renamed from: v */
    public int f2238v;

    /* renamed from: w */
    public final int[] f2239w;

    /* renamed from: x */
    public final int[] f2240x;

    /* renamed from: y */
    public int f2241y;

    /* renamed from: z */
    public int f2242z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.websoptimization.callyzerbiz.R.attr.nestedScrollViewStyle);
        this.f2222c = new Rect();
        this.f2228j = true;
        this.f2229k = false;
        this.f2230l = null;
        this.f2231m = false;
        this.f2234q = true;
        this.f2238v = -1;
        this.f2239w = new int[2];
        this.f2240x = new int[2];
        this.f2219F = new C0878h(getContext(), new C8986c(13, this));
        int i10 = Build.VERSION.SDK_INT;
        this.f2224e = i10 >= 31 ? AbstractC2529d.m6552a(context, attributeSet) : new EdgeEffect(context);
        this.f2225f = i10 >= 31 ? AbstractC2529d.m6552a(context, attributeSet) : new EdgeEffect(context);
        this.f2220a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2223d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2235r = viewConfiguration.getScaledTouchSlop();
        this.f2236s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2237t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2214I, com.websoptimization.callyzerbiz.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f2216C = new C0892v();
        this.f2217D = new C0889s(this);
        setNestedScrollingEnabled(true);
        v0.m2528j(this, f2213H);
    }

    private b0 getScrollFeedbackProvider() {
        if (this.f2226g == null) {
            this.f2226g = new b0(this);
        }
        return this.f2226g;
    }

    /* renamed from: k */
    public static boolean m763k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m763k((View) parent, nestedScrollView);
    }

    /* renamed from: a */
    public final boolean m764a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m768l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m774r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f2222c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            m774r(m765b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !m768l(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* renamed from: b */
    public final int m765b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: c */
    public final void mo561c(int i10, View view) {
        C0892v c0892v = this.f2216C;
        if (i10 == 1) {
            c0892v.f5526b = 0;
        } else {
            c0892v.f5525a = 0;
        }
        m778v(i10);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // c6.InterfaceC0891u
    /* renamed from: d */
    public final void mo562d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m769m(i13, i14, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto Lcc
            android.graphics.Rect r0 = r6.f2222c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto La1
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto La1
            int r0 = r7.getAction()
            if (r0 != 0) goto L65
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L91
            r4 = 20
            if (r0 == r4) goto L81
            r4 = 62
            if (r0 == r4) goto L76
            r7 = 92
            if (r0 == r7) goto L71
            r7 = 93
            if (r0 == r7) goto L6c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L68
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L62
            goto L65
        L62:
            r6.m772p(r3)
        L65:
            r7 = r2
            goto Lc8
        L68:
            r6.m772p(r5)
            goto L65
        L6c:
            boolean r7 = r6.m767j(r3)
            goto Lc8
        L71:
            boolean r7 = r6.m767j(r5)
            goto Lc8
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7d
            r3 = r5
        L7d:
            r6.m772p(r3)
            goto L65
        L81:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8c
            boolean r7 = r6.m767j(r3)
            goto Lc8
        L8c:
            boolean r7 = r6.m764a(r3)
            goto Lc8
        L91:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9c
            boolean r7 = r6.m767j(r5)
            goto Lc8
        L9c:
            boolean r7 = r6.m764a(r5)
            goto Lc8
        La1:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L65
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L65
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto Lb5
            r7 = 0
        Lb5:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L65
            if (r7 == r6) goto L65
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L65
            r7 = r1
        Lc8:
            if (r7 == 0) goto Lcb
            goto Lcc
        Lcb:
            return r2
        Lcc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f10, boolean z6) {
        return this.f2217D.m2502a(f6, f10, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f10) {
        return this.f2217D.m2503b(f6, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f2217D.m2504c(i10, iArr, i11, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2217D.m2505d(i10, iArr, i11, i12, i13, null, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2224e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f2225f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, DefinitionKt.NO_Float_VALUE);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* renamed from: e */
    public final void m766e(int i10) {
        if (getChildCount() > 0) {
            this.f2223d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f2217D.m2508g(2, 1);
            this.f2242z = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                AbstractC2531f.m6560a(this, Math.abs(this.f2223d.getCurrVelocity()));
            }
        }
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: f */
    public final void mo564f(View view, int i10, int i11, int i12, int i13, int i14) {
        m769m(i13, i14, null);
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: g */
    public final boolean mo565g(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return DefinitionKt.NO_Float_VALUE;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0892v c0892v = this.f2216C;
        return c0892v.f5526b | c0892v.f5525a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return DefinitionKt.NO_Float_VALUE;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2218E == DefinitionKt.NO_Float_VALUE) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2218E = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2218E;
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: h */
    public final void mo566h(View view, View view2, int i10, int i11) {
        C0892v c0892v = this.f2216C;
        if (i11 == 1) {
            c0892v.f5526b = i10;
        } else {
            c0892v.f5525a = i10;
        }
        this.f2217D.m2508g(2, i11);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2217D.m2507f(0);
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: i */
    public final void mo567i(View view, int i10, int i11, int[] iArr, int i12) {
        this.f2217D.m2504c(i10, iArr, i11, i12, null);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2217D.f5514d;
    }

    /* renamed from: j */
    public final boolean m767j(int i10) {
        int childCount;
        boolean z6 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2222c;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m773q(i10, rect.top, rect.bottom);
    }

    /* renamed from: l */
    public final boolean m768l(View view, int i10, int i11) {
        Rect rect = this.f2222c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    /* renamed from: m */
    public final void m769m(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2217D.m2505d(0, null, scrollY2, 0, i10 - scrollY2, iArr, i11);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final void m770n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2238v) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2227h = (int) motionEvent.getY(i10);
            this.f2238v = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2232n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: o */
    public final boolean m771o(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z6;
        int i15;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z6 = false;
        } else {
            i14 = 0;
            z6 = true;
        }
        if (i16 > i13) {
            i15 = i13;
        } else {
            if (i16 >= 0) {
                i15 = i16;
                z10 = false;
                if (z10 && !this.f2217D.m2507f(1)) {
                    this.f2223d.springBack(i14, i15, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i14, i15);
                return !z6 || z10;
            }
            i15 = 0;
        }
        z10 = true;
        if (z10) {
            this.f2223d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z6) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2229k = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r32) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z6, i10, i11, i12, i13);
        int i14 = 0;
        this.f2228j = false;
        View view = this.f2230l;
        if (view != null && m763k(view, this)) {
            View view2 = this.f2230l;
            Rect rect = this.f2222c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM765b = m765b(rect);
            if (iM765b != 0) {
                scrollBy(0, iM765b);
            }
        }
        this.f2230l = null;
        if (!this.f2229k) {
            if (this.f2215B != null) {
                scrollTo(getScrollX(), this.f2215B.f13860a);
                this.f2215B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2229k = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2233p && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(DefinitionKt.NO_Float_VALUE, f10, true);
        m766e((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        return this.f2217D.m2503b(f6, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        this.f2217D.m2504c(i10, iArr, i11, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m769m(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        mo566h(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z6, boolean z10) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && m768l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2533h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2533h c2533h = (C2533h) parcelable;
        super.onRestoreInstanceState(c2533h.getSuperState());
        this.f2215B = c2533h;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2533h c2533h = new C2533h(super.onSaveInstanceState());
        c2533h.f13860a = getScrollY();
        return c2533h;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m768l(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f2222c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iM765b = m765b(rect);
        if (iM765b != 0) {
            if (this.f2234q) {
                m776t(0, iM765b, false);
            } else {
                scrollBy(0, iM765b);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return mo565g(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo561c(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m772p(int i10) {
        boolean z6 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2222c;
        if (z6) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        m773q(i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m773q(int r19, int r20, int r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r18.getHeight()
            int r4 = r18.getScrollY()
            int r3 = r3 + r4
            r5 = 33
            if (r0 != r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            r8 = 2
            r9 = r18
            java.util.ArrayList r8 = r9.getFocusables(r8)
            int r10 = r8.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r8.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r1 >= r6) goto L69
            if (r15 >= r2) goto L69
            if (r1 >= r15) goto L3f
            if (r6 >= r2) goto L3f
            r17 = 1
            goto L41
        L3f:
            r17 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r17
            goto L69
        L47:
            if (r5 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r5 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r17 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r17 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L70
            r6 = r9
            goto L71
        L70:
            r6 = r11
        L71:
            if (r1 < r4) goto L78
            if (r2 > r3) goto L78
            r16 = 0
            goto L8a
        L78:
            if (r5 == 0) goto L7d
            int r1 = r1 - r4
        L7b:
            r10 = r1
            goto L80
        L7d:
            int r1 = r2 - r3
            goto L7b
        L80:
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 1
            r9.m774r(r10, r11, r12, r13, r14, r15)
            r16 = 1
        L8a:
            android.view.View r1 = r18.findFocus()
            if (r6 == r1) goto L93
            r6.requestFocus(r0)
        L93:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m773q(int, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m774r(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m774r(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f2228j) {
            this.f2230l = view2;
        } else {
            Rect rect = this.f2222c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iM765b = m765b(rect);
            if (iM765b != 0) {
                scrollBy(0, iM765b);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM765b = m765b(rect);
        boolean z10 = iM765b != 0;
        if (z10) {
            if (z6) {
                scrollBy(0, iM765b);
                return z10;
            }
            m776t(0, iM765b, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f2232n) != null) {
            velocityTracker.recycle();
            this.f2232n = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2228j = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m775s(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float fM10539d = ag.m10539d(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f6 = this.f2220a * 0.015f;
        double dLog = Math.log(fAbs / f6);
        double d2 = f2212G;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f6))) < fM10539d;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f2233p) {
            this.f2233p = z6;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z6) {
        C0889s c0889s = this.f2217D;
        if (c0889s.f5514d) {
            ViewGroup viewGroup = c0889s.f5513c;
            Field field = v0.f5527a;
            n0.m2462n(viewGroup);
        }
        c0889s.f5514d = z6;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f2234q = z6;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f2217D.m2508g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        m778v(0);
    }

    /* renamed from: t */
    public final void m776t(int i10, int i11, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2221b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f2223d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z6) {
                this.f2217D.m2508g(2, 1);
            } else {
                m778v(1);
            }
            this.f2242z = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2223d.isFinished()) {
                this.f2223d.abortAnimation();
                m778v(1);
            }
            scrollBy(i10, i11);
        }
        this.f2221b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: u */
    public final boolean m777u(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f2224e;
        if (ag.m10539d(edgeEffect) != DefinitionKt.NO_Float_VALUE) {
            ag.m10540e(edgeEffect, DefinitionKt.NO_Float_VALUE, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f2225f;
        if (ag.m10539d(edgeEffect2) == DefinitionKt.NO_Float_VALUE) {
            return z6;
        }
        ag.m10540e(edgeEffect2, DefinitionKt.NO_Float_VALUE, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: v */
    public final void m778v(int i10) {
        this.f2217D.m2509h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC2532g interfaceC2532g) {
    }
}
