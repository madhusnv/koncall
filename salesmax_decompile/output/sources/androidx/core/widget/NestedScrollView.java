package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import org.objectweb.asm.Opcodes;
import p001o.c36;
import p001o.c6e;
import p001o.cc;
import p001o.db;
import p001o.dt5;
import p001o.dtb;
import p001o.et5;
import p001o.etb;
import p001o.gtb;
import p001o.htb;
import p001o.ic;
import p001o.kmb;
import p001o.wvi;

/* loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements gtb, dtb {
    public static final float u0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final C2033a v0 = new C2033a();
    public static final int[] w0 = {R.attr.fillViewport};

    /* renamed from: H */
    public boolean f7176H;

    /* renamed from: L */
    public boolean f7177L;

    /* renamed from: M */
    public int f7178M;

    /* renamed from: Q */
    public int f7179Q;

    /* renamed from: a */
    public final float f7180a;

    /* renamed from: b */
    public long f7181b;

    /* renamed from: c */
    public final Rect f7182c;

    /* renamed from: d */
    public OverScroller f7183d;

    /* renamed from: e */
    public EdgeEffect f7184e;

    /* renamed from: f */
    public EdgeEffect f7185f;

    /* renamed from: g */
    public int f7186g;

    /* renamed from: h */
    public boolean f7187h;
    public int h0;
    public int i0;
    public final int[] j0;
    public final int[] k0;
    public int l0;
    public int m0;
    public SavedState n0;
    public final htb o0;
    public final etb p0;

    /* renamed from: q */
    public boolean f7188q;
    public float q0;
    public InterfaceC2036d r0;

    /* renamed from: s */
    public View f7189s;
    public final C2035c s0;
    public dt5 t0;

    /* renamed from: x */
    public boolean f7190x;

    /* renamed from: y */
    public VelocityTracker f7191y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2032a();

        /* renamed from: a */
        public int f7192a;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C2032a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f7192a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7192a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7192a = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C2033a extends db {
        @Override // p001o.db
        /* renamed from: f */
        public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5937f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            ic.m31892a(accessibilityEvent, nestedScrollView.getScrollX());
            ic.m31893b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            int scrollRange;
            super.mo5938g(view, ccVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            ccVar.o0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            ccVar.P0(true);
            if (nestedScrollView.getScrollY() > 0) {
                ccVar.m20778b(cc.C12624a.f17806r);
                ccVar.m20778b(cc.C12624a.f17773C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                ccVar.m20778b(cc.C12624a.f17805q);
                ccVar.m20778b(cc.C12624a.f17775E);
            }
        }

        @Override // p001o.db
        /* renamed from: j */
        public boolean mo5939j(View view, int i, Bundle bundle) {
            if (super.mo5939j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m5913W(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m5913W(0, iMin, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C2034b {
        /* renamed from: a */
        public static boolean m5940a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public class C2035c implements et5 {
        public C2035c() {
        }

        @Override // p001o.et5
        /* renamed from: a */
        public boolean mo5941a(float f) {
            if (f == 0.0f) {
                return false;
            }
            mo5943c();
            NestedScrollView.this.m5930v((int) f);
            return true;
        }

        @Override // p001o.et5
        /* renamed from: b */
        public float mo5942b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // p001o.et5
        /* renamed from: c */
        public void mo5943c() {
            NestedScrollView.this.f7183d.abortAnimation();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    public interface InterfaceC2036d {
        /* renamed from: a */
        void mo5529a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: F */
    public static boolean m5889F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m5889F((View) parent, view2);
    }

    /* renamed from: f */
    public static int m5891f(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: A */
    public final void m5892A() {
        VelocityTracker velocityTracker = this.f7191y;
        if (velocityTracker == null) {
            this.f7191y = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: B */
    public final void m5893B() {
        this.f7183d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f7178M = viewConfiguration.getScaledTouchSlop();
        this.f7179Q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h0 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: C */
    public final void m5894C() {
        if (this.f7191y == null) {
            this.f7191y = VelocityTracker.obtain();
        }
    }

    /* renamed from: D */
    public final void m5895D(int i, int i2) {
        this.f7186g = i;
        this.i0 = i2;
        m5914X(2, 0);
    }

    /* renamed from: E */
    public final boolean m5896E(View view) {
        return !m5897G(view, 0, getHeight());
    }

    /* renamed from: G */
    public final boolean m5897G(View view, int i, int i2) {
        view.getDrawingRect(this.f7182c);
        offsetDescendantRectToMyCoords(view, this.f7182c);
        return this.f7182c.bottom + i >= getScrollY() && this.f7182c.top - i <= getScrollY() + i2;
    }

    /* renamed from: H */
    public final void m5898H(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.p0.m25582e(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: I */
    public final void m5899I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.i0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f7186g = (int) motionEvent.getY(i);
            this.i0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f7191y;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: J */
    public boolean m5900J(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !m5933y(1)) {
            this.f7183d.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    /* renamed from: K */
    public boolean m5901K(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f7182c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f7182c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f7182c.top = getScrollY() - height;
            Rect rect2 = this.f7182c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f7182c;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m5905O(i, i2, i3);
    }

    /* renamed from: L */
    public final void m5902L() {
        VelocityTracker velocityTracker = this.f7191y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7191y = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m5903M(int i, float f) {
        float fM20159d;
        int iRound;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (c36.m20157b(this.f7184e) == 0.0f) {
            if (c36.m20157b(this.f7185f) != 0.0f) {
                fM20159d = c36.m20159d(this.f7185f, height, 1.0f - width);
                if (c36.m20157b(this.f7185f) == 0.0f) {
                    this.f7185f.onRelease();
                }
            }
            iRound = Math.round(f2 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fM20159d = -c36.m20159d(this.f7184e, -height, width);
        if (c36.m20157b(this.f7184e) == 0.0f) {
            this.f7184e.onRelease();
        }
        f2 = fM20159d;
        iRound = Math.round(f2 * getHeight());
        if (iRound != 0) {
        }
        return iRound;
    }

    /* renamed from: N */
    public final void m5904N(boolean z) {
        if (z) {
            m5914X(2, 1);
        } else {
            m5916Z(1);
        }
        this.m0 = getScrollY();
        postInvalidateOnAnimation();
    }

    /* renamed from: O */
    public final boolean m5905O(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewM5929u = m5929u(z2, i2, i3);
        if (viewM5929u == null) {
            viewM5929u = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m5906P(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        }
        if (viewM5929u != findFocus()) {
            viewM5929u.requestFocus(i);
        }
        return z;
    }

    /* renamed from: P */
    public final int m5906P(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            m5914X(2, i3);
        }
        boolean z2 = false;
        if (m5923o(0, i, this.k0, this.j0, i3)) {
            i4 = i - this.k0[1];
            i5 = this.j0[1] + 0;
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z3 = m5919d() && !z;
        boolean z4 = m5900J(0, i4, 0, scrollY, 0, scrollRange, 0, 0, true) && !m5933y(i3);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.k0;
        iArr[1] = 0;
        m5924p(0, scrollY2, 0, i4 - scrollY2, this.j0, i3, iArr);
        int i6 = i5 + this.j0[1];
        int i7 = i4 - this.k0[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z3) {
                c36.m20159d(this.f7184e, (-i7) / getHeight(), i2 / getWidth());
                if (!this.f7185f.isFinished()) {
                    this.f7185f.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            c36.m20159d(this.f7185f, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.f7184e.isFinished()) {
                this.f7184e.onRelease();
            }
        }
        if (this.f7184e.isFinished() && this.f7185f.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
        }
        if (z2 && i3 == 0 && (velocityTracker = this.f7191y) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            m5916Z(i3);
            this.f7184e.onRelease();
            this.f7185f.onRelease();
        }
        return i6;
    }

    /* renamed from: Q */
    public final void m5907Q(View view) {
        view.getDrawingRect(this.f7182c);
        offsetDescendantRectToMyCoords(view, this.f7182c);
        int iM5921j = m5921j(this.f7182c);
        if (iM5921j != 0) {
            scrollBy(0, iM5921j);
        }
    }

    /* renamed from: R */
    public final boolean m5908R(Rect rect, boolean z) {
        int iM5921j = m5921j(rect);
        boolean z2 = iM5921j != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM5921j);
            } else {
                m5910T(0, iM5921j);
            }
        }
        return z2;
    }

    /* renamed from: S */
    public final boolean m5909S(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return m5932x(-i) < c36.m20157b(edgeEffect) * ((float) getHeight());
    }

    /* renamed from: T */
    public final void m5910T(int i, int i2) {
        m5911U(i, i2, 250, false);
    }

    /* renamed from: U */
    public final void m5911U(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f7181b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f7183d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            m5904N(z);
        } else {
            if (!this.f7183d.isFinished()) {
                m5917a();
            }
            scrollBy(i, i2);
        }
        this.f7181b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: V */
    public void m5912V(int i, int i2, int i3, boolean z) {
        m5911U(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: W */
    public void m5913W(int i, int i2, boolean z) {
        m5912V(i, i2, 250, z);
    }

    /* renamed from: X */
    public boolean m5914X(int i, int i2) {
        return this.p0.m25593p(i, i2);
    }

    /* renamed from: Y */
    public final boolean m5915Y(MotionEvent motionEvent) {
        boolean z;
        if (c36.m20157b(this.f7184e) != 0.0f) {
            c36.m20159d(this.f7184e, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (c36.m20157b(this.f7185f) == 0.0f) {
            return z;
        }
        c36.m20159d(this.f7185f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: Z */
    public void m5916Z(int i) {
        this.p0.m25595r(i);
    }

    /* renamed from: a */
    public final void m5917a() {
        this.f7183d.abortAnimation();
        m5916Z(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* renamed from: c */
    public boolean m5918c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m5897G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m5906P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f7182c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f7182c);
            m5906P(m5921j(this.f7182c), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m5896E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(Opcodes.ACC_DEPRECATED);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f7183d.isFinished()) {
            return;
        }
        this.f7183d.computeScrollOffset();
        int currY = this.f7183d.getCurrY();
        int iM5922n = m5922n(currY - this.m0);
        this.m0 = currY;
        int[] iArr = this.k0;
        boolean z = false;
        iArr[1] = 0;
        m5923o(0, iM5922n, iArr, null, 1);
        int i = iM5922n - this.k0[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            m5900J(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.k0;
            iArr2[1] = 0;
            m5924p(0, scrollY2, 0, i2, this.j0, 1, iArr2);
            i = i2 - this.k0[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                if (i < 0) {
                    if (this.f7184e.isFinished()) {
                        this.f7184e.onAbsorb((int) this.f7183d.getCurrVelocity());
                    }
                } else if (this.f7185f.isFinished()) {
                    this.f7185f.onAbsorb((int) this.f7183d.getCurrVelocity());
                }
            }
            m5917a();
        }
        if (this.f7183d.isFinished()) {
            m5916Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* renamed from: d */
    public final boolean m5919d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m5928t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.p0.m25578a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.p0.m25579b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m5923o(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.p0.m25583f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f7184e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C2034b.m5940a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (C2034b.m5940a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f7184e.setSize(width, height);
            if (this.f7184e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f7185f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C2034b.m5940a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (C2034b.m5940a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f7185f.setSize(width2, height2);
        if (this.f7185f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* renamed from: e */
    public final boolean m5920e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // p001o.ftb
    /* renamed from: g */
    public void mo4127g(View view, View view2, int i, int i2) {
        this.o0.m31122c(view, view2, i, i2);
        m5914X(2, i2);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
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
        return this.o0.m31120a();
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
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.q0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.q0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.q0;
    }

    @Override // p001o.ftb
    /* renamed from: h */
    public void mo4128h(View view, int i) {
        this.o0.m31124e(view, i);
        m5916Z(i);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m5933y(0);
    }

    @Override // p001o.ftb
    /* renamed from: i */
    public void mo4129i(View view, int i, int i2, int[] iArr, int i3) {
        m5923o(i, i2, iArr, null, i3);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.p0.m25589l();
    }

    /* renamed from: j */
    public int m5921j(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // p001o.gtb
    /* renamed from: k */
    public void mo4131k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m5898H(i4, i5, iArr);
    }

    @Override // p001o.ftb
    /* renamed from: l */
    public void mo4132l(View view, int i, int i2, int i3, int i4, int i5) {
        m5898H(i4, i5, null);
    }

    @Override // p001o.ftb
    /* renamed from: m */
    public boolean mo4133m(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public int m5922n(int i) {
        int height = getHeight();
        if (i > 0 && c36.m20157b(this.f7184e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * c36.m20159d(this.f7184e, ((-i) * 4.0f) / height, 0.5f));
            if (iRound != i) {
                this.f7184e.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || c36.m20157b(this.f7185f) == 0.0f) {
            return i;
        }
        float f = height;
        int iRound2 = Math.round((f / 4.0f) * c36.m20159d(this.f7185f, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            this.f7185f.finish();
        }
        return i - iRound2;
    }

    /* renamed from: o */
    public boolean m5923o(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.p0.m25581d(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7188q = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f7190x) {
            if (kmb.m35931a(motionEvent, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (kmb.m35931a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m5906P(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, kmb.m35931a(motionEvent, 8194));
                if (i != 0) {
                    this.t0.m23781g(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f7190x) {
            return true;
        }
        int i = action & Constants.MAX_HOST_LENGTH;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            if (m5934z((int) motionEvent.getX(), y)) {
                this.f7186g = y;
                this.i0 = motionEvent.getPointerId(0);
                m5892A();
                this.f7191y.addMovement(motionEvent);
                this.f7183d.computeScrollOffset();
                if (!m5915Y(motionEvent) && this.f7183d.isFinished()) {
                    z = false;
                }
                this.f7190x = z;
                m5914X(2, 0);
            } else {
                if (!m5915Y(motionEvent) && this.f7183d.isFinished()) {
                    z = false;
                }
                this.f7190x = z;
                m5902L();
            }
        } else if (i == 1) {
            this.f7190x = false;
            this.i0 = -1;
            m5902L();
            if (this.f7183d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            m5916Z(0);
        } else if (i == 2) {
            int i2 = this.i0;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(i2);
                    sb.append(" in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f7186g) > this.f7178M && (2 & getNestedScrollAxes()) == 0) {
                        this.f7190x = true;
                        this.f7186g = y2;
                        m5894C();
                        this.f7191y.addMovement(motionEvent);
                        this.l0 = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i != 3) {
            if (i == 6) {
                m5899I(motionEvent);
            }
        }
        return this.f7190x;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f7187h = false;
        View view = this.f7189s;
        if (view != null && m5889F(view, this)) {
            m5907Q(this.f7189s);
        }
        this.f7189s = null;
        if (!this.f7188q) {
            if (this.n0 != null) {
                scrollTo(getScrollX(), this.n0.f7192a);
                this.n0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM5891f = m5891f(scrollY, paddingTop, measuredHeight);
            if (iM5891f != scrollY) {
                scrollTo(getScrollX(), iM5891f);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f7188q = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7176H && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m5930v((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo4129i(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m5898H(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo4127g(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || m5896E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.n0 = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7192a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC2036d interfaceC2036d = this.r0;
        if (interfaceC2036d != null) {
            interfaceC2036d.mo5529a(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m5897G(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f7182c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f7182c);
        m5925q(m5921j(this.f7182c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo4133m(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo4128h(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        m5894C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.l0 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.l0);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f7191y;
                velocityTracker.computeCurrentVelocity(1000, this.h0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.i0);
                if (Math.abs(yVelocity) >= this.f7179Q) {
                    if (!m5926r(yVelocity)) {
                        int i = -yVelocity;
                        float f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            m5930v(i);
                        }
                    }
                } else if (this.f7183d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m5927s();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.i0);
                if (iFindPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.i0);
                    sb.append(" in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f7186g - y;
                    int iM5903M = i2 - m5903M(i2, motionEvent.getX(iFindPointerIndex));
                    if (!this.f7190x && Math.abs(iM5903M) > this.f7178M) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f7190x = true;
                        iM5903M = iM5903M > 0 ? iM5903M - this.f7178M : iM5903M + this.f7178M;
                    }
                    if (this.f7190x) {
                        int iM5906P = m5906P(iM5903M, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f7186g = y - iM5906P;
                        this.l0 += iM5906P;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f7190x && getChildCount() > 0 && this.f7183d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m5927s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f7186g = (int) motionEvent.getY(actionIndex);
                this.i0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m5899I(motionEvent);
                this.f7186g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.i0));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f7190x && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f7183d.isFinished()) {
                m5917a();
            }
            m5895D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f7191y;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* renamed from: p */
    public void m5924p(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.p0.m25582e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: q */
    public final void m5925q(int i) {
        if (i != 0) {
            if (this.f7177L) {
                m5910T(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: r */
    public final boolean m5926r(int i) {
        if (c36.m20157b(this.f7184e) != 0.0f) {
            if (m5909S(this.f7184e, i)) {
                this.f7184e.onAbsorb(i);
            } else {
                m5930v(-i);
            }
        } else {
            if (c36.m20157b(this.f7185f) == 0.0f) {
                return false;
            }
            int i2 = -i;
            if (m5909S(this.f7185f, i2)) {
                this.f7185f.onAbsorb(i2);
            } else {
                m5930v(i2);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f7187h) {
            this.f7189s = view2;
        } else {
            m5907Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m5908R(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m5902L();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f7187h = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final void m5927s() {
        this.i0 = -1;
        this.f7190x = false;
        m5902L();
        m5916Z(0);
        this.f7184e.onRelease();
        this.f7185f.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM5891f = m5891f(i, width, width2);
            int iM5891f2 = m5891f(i2, height, height2);
            if (iM5891f == getScrollX() && iM5891f2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM5891f, iM5891f2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f7176H) {
            this.f7176H = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.p0.m25590m(z);
    }

    public void setOnScrollChangeListener(InterfaceC2036d interfaceC2036d) {
        this.r0 = interfaceC2036d;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f7177L = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m5914X(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m5916Z(0);
    }

    /* renamed from: t */
    public boolean m5928t(KeyEvent keyEvent) {
        this.f7182c.setEmpty();
        if (!m5920e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? m5931w(33) : m5918c(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? m5931w(130) : m5918c(130);
        }
        if (keyCode == 62) {
            m5901K(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return m5931w(33);
        }
        if (keyCode == 93) {
            return m5931w(130);
        }
        if (keyCode == 122) {
            m5901K(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        m5901K(130);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m5929u(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    public void m5930v(int i) {
        if (getChildCount() > 0) {
            this.f7183d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 0);
            m5904N(true);
        }
    }

    /* renamed from: w */
    public boolean m5931w(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f7182c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f7182c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f7182c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f7182c;
        return m5905O(i, rect3.top, rect3.bottom);
    }

    /* renamed from: x */
    public final float m5932x(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.f7180a * 0.015f));
        float f = u0;
        return (float) (this.f7180a * 0.015f * Math.exp((f / (f - 1.0d)) * dLog));
    }

    /* renamed from: y */
    public boolean m5933y(int i) {
        return this.p0.m25588k(i);
    }

    /* renamed from: z */
    public final boolean m5934z(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c6e.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7182c = new Rect();
        this.f7187h = true;
        this.f7188q = false;
        this.f7189s = null;
        this.f7190x = false;
        this.f7177L = true;
        this.i0 = -1;
        this.j0 = new int[2];
        this.k0 = new int[2];
        C2035c c2035c = new C2035c();
        this.s0 = c2035c;
        this.t0 = new dt5(getContext(), c2035c);
        this.f7184e = c36.m20156a(context, attributeSet);
        this.f7185f = c36.m20156a(context, attributeSet);
        this.f7180a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m5893B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w0, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.o0 = new htb(this);
        this.p0 = new etb(this);
        setNestedScrollingEnabled(true);
        wvi.m0(this, v0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
