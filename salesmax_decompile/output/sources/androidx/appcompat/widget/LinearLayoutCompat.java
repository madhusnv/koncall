package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p001o.anh;
import p001o.bbe;
import p001o.dv7;
import p001o.wvi;
import p001o.yzi;

/* loaded from: classes2.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: H */
    public int f5876H;

    /* renamed from: L */
    public int f5877L;

    /* renamed from: M */
    public int f5878M;

    /* renamed from: a */
    public boolean f5879a;

    /* renamed from: b */
    public int f5880b;

    /* renamed from: c */
    public int f5881c;

    /* renamed from: d */
    public int f5882d;

    /* renamed from: e */
    public int f5883e;

    /* renamed from: f */
    public int f5884f;

    /* renamed from: g */
    public float f5885g;

    /* renamed from: h */
    public boolean f5886h;

    /* renamed from: q */
    public int[] f5887q;

    /* renamed from: s */
    public int[] f5888s;

    /* renamed from: x */
    public Drawable f5889x;

    /* renamed from: y */
    public int f5890y;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    public final void m4264A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: g */
    public void m4265g(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean zM58585b = yzi.m58585b(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewM4274s = m4274s(i2);
            if (viewM4274s != null && viewM4274s.getVisibility() != 8 && m4275t(i2)) {
                LayoutParams layoutParams = (LayoutParams) viewM4274s.getLayoutParams();
                m4268j(canvas, zM58585b ? viewM4274s.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (viewM4274s.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.f5890y);
            }
        }
        if (m4275t(virtualChildCount)) {
            View viewM4274s2 = m4274s(virtualChildCount - 1);
            if (viewM4274s2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) viewM4274s2.getLayoutParams();
                if (zM58585b) {
                    left = viewM4274s2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.f5890y;
                    right = left - i;
                } else {
                    right = viewM4274s2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zM58585b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f5890y;
                right = left - i;
            }
            m4268j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f5880b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f5880b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f5880b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f5881c;
        if (this.f5882d == 1 && (i = this.f5883e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5884f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5884f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f5880b;
    }

    public Drawable getDividerDrawable() {
        return this.f5889x;
    }

    public int getDividerPadding() {
        return this.f5878M;
    }

    public int getDividerWidth() {
        return this.f5890y;
    }

    public int getGravity() {
        return this.f5883e;
    }

    public int getOrientation() {
        return this.f5882d;
    }

    public int getShowDividers() {
        return this.f5877L;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5885g;
    }

    /* renamed from: h */
    public void m4266h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View viewM4274s = m4274s(i);
            if (viewM4274s != null && viewM4274s.getVisibility() != 8 && m4275t(i)) {
                m4267i(canvas, (viewM4274s.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) viewM4274s.getLayoutParams())).topMargin) - this.f5876H);
            }
        }
        if (m4275t(virtualChildCount)) {
            View viewM4274s2 = m4274s(virtualChildCount - 1);
            m4267i(canvas, viewM4274s2 == null ? (getHeight() - getPaddingBottom()) - this.f5876H : viewM4274s2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) viewM4274s2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: i */
    public void m4267i(Canvas canvas, int i) {
        this.f5889x.setBounds(getPaddingLeft() + this.f5878M, i, (getWidth() - getPaddingRight()) - this.f5878M, this.f5876H + i);
        this.f5889x.draw(canvas);
    }

    /* renamed from: j */
    public void m4268j(Canvas canvas, int i) {
        this.f5889x.setBounds(i, getPaddingTop() + this.f5878M, this.f5890y + i, (getHeight() - getPaddingBottom()) - this.f5878M);
        this.f5889x.draw(canvas);
    }

    /* renamed from: k */
    public final void m4269k(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewM4274s = m4274s(i3);
            if (viewM4274s.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewM4274s.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = viewM4274s.getMeasuredWidth();
                    measureChildWithMargins(viewM4274s, i2, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    public final void m4270l(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewM4274s = m4274s(i3);
            if (viewM4274s.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) viewM4274s.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = viewM4274s.getMeasuredHeight();
                    measureChildWithMargins(viewM4274s, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f5882d;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f5889x == null) {
            return;
        }
        if (this.f5882d == 1) {
            m4266h(canvas);
        } else {
            m4265g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5882d == 1) {
            m4277v(i, i2, i3, i4);
        } else {
            m4276u(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f5882d == 1) {
            m4281z(i, i2);
        } else {
            m4279x(i, i2);
        }
    }

    /* renamed from: p */
    public int m4271p(View view, int i) {
        return 0;
    }

    /* renamed from: q */
    public int m4272q(View view) {
        return 0;
    }

    /* renamed from: r */
    public int m4273r(View view) {
        return 0;
    }

    /* renamed from: s */
    public View m4274s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f5879a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f5880b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f5889x) {
            return;
        }
        this.f5889x = drawable;
        if (drawable != null) {
            this.f5890y = drawable.getIntrinsicWidth();
            this.f5876H = drawable.getIntrinsicHeight();
        } else {
            this.f5890y = 0;
            this.f5876H = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f5878M = i;
    }

    public void setGravity(int i) {
        if (this.f5883e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5883e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f5883e;
        if ((8388615 & i3) != i2) {
            this.f5883e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f5886h = z;
    }

    public void setOrientation(int i) {
        if (this.f5882d != i) {
            this.f5882d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f5877L) {
            requestLayout();
        }
        this.f5877L = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f5883e;
        if ((i3 & 112) != i2) {
            this.f5883e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f5885g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public boolean m4275t(int i) {
        if (i == 0) {
            return (this.f5877L & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f5877L & 4) != 0;
        }
        if ((this.f5877L & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4276u(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int measuredHeight;
        boolean zM58585b = yzi.m58585b(this);
        int paddingTop = getPaddingTop();
        int i12 = i4 - i2;
        int paddingBottom = i12 - getPaddingBottom();
        int paddingBottom2 = (i12 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i13 = this.f5883e;
        int i14 = i13 & 112;
        boolean z2 = this.f5879a;
        int[] iArr = this.f5887q;
        int[] iArr2 = this.f5888s;
        int iM23889b = dv7.m23889b(8388615 & i13, getLayoutDirection());
        boolean z3 = true;
        int paddingLeft = iM23889b != 1 ? iM23889b != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f5884f : getPaddingLeft() + (((i3 - i) - this.f5884f) / 2);
        if (zM58585b) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int iM4271p = 0;
        while (iM4271p < virtualChildCount) {
            int i15 = i5 + (i6 * iM4271p);
            View viewM4274s = m4274s(i15);
            if (viewM4274s == null) {
                paddingLeft += m4280y(i15);
                z = z3;
                i7 = paddingTop;
                i8 = virtualChildCount;
                i9 = i14;
            } else if (viewM4274s.getVisibility() != 8) {
                int measuredWidth = viewM4274s.getMeasuredWidth();
                int measuredHeight2 = viewM4274s.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) viewM4274s.getLayoutParams();
                int i16 = iM4271p;
                if (z2) {
                    i8 = virtualChildCount;
                    int baseline = ((LinearLayout.LayoutParams) layoutParams).height != -1 ? viewM4274s.getBaseline() : -1;
                    i10 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i10 < 0) {
                        i10 = i14;
                    }
                    i11 = i10 & 112;
                    i9 = i14;
                    if (i11 == 16) {
                        if (i11 == 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + paddingTop;
                            if (baseline != -1) {
                                z = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewM4274s.getMeasuredHeight() - baseline);
                            }
                        }
                        z = true;
                    } else {
                        z = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) layoutParams).topMargin) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    if (m4275t(i15)) {
                        paddingLeft += this.f5890y;
                    }
                    int i17 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    i7 = paddingTop;
                    m4264A(viewM4274s, i17 + m4272q(viewM4274s), measuredHeight, measuredWidth, measuredHeight2);
                    int iM4273r = i17 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + m4273r(viewM4274s);
                    iM4271p = i16 + m4271p(viewM4274s, i15);
                    paddingLeft = iM4273r;
                    iM4271p++;
                    virtualChildCount = i8;
                    i14 = i9;
                    z3 = z;
                    paddingTop = i7;
                } else {
                    i8 = virtualChildCount;
                }
                i10 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i10 < 0) {
                }
                i11 = i10 & 112;
                i9 = i14;
                if (i11 == 16) {
                }
                if (m4275t(i15)) {
                }
                int i172 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                i7 = paddingTop;
                m4264A(viewM4274s, i172 + m4272q(viewM4274s), measuredHeight, measuredWidth, measuredHeight2);
                int iM4273r2 = i172 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + m4273r(viewM4274s);
                iM4271p = i16 + m4271p(viewM4274s, i15);
                paddingLeft = iM4273r2;
                iM4271p++;
                virtualChildCount = i8;
                i14 = i9;
                z3 = z;
                paddingTop = i7;
            } else {
                i7 = paddingTop;
                i8 = virtualChildCount;
                i9 = i14;
                z = true;
            }
            iM4271p++;
            virtualChildCount = i8;
            i14 = i9;
            z3 = z;
            paddingTop = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4277v(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f5883e;
        int i11 = i10 & 112;
        int i12 = i10 & 8388615;
        int paddingTop = i11 != 16 ? i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f5884f : getPaddingTop() + (((i4 - i2) - this.f5884f) / 2);
        int iM4271p = 0;
        while (iM4271p < virtualChildCount) {
            View viewM4274s = m4274s(iM4271p);
            if (viewM4274s == null) {
                paddingTop += m4280y(iM4271p);
            } else {
                if (viewM4274s.getVisibility() != 8) {
                    int measuredWidth = viewM4274s.getMeasuredWidth();
                    int measuredHeight = viewM4274s.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) viewM4274s.getLayoutParams();
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i13 < 0) {
                        i13 = i12;
                    }
                    int iM23889b = dv7.m23889b(i13, getLayoutDirection()) & 7;
                    if (iM23889b == 1) {
                        i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    } else if (iM23889b != 5) {
                        i7 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        int i14 = i7;
                        if (m4275t(iM4271p)) {
                            paddingTop += this.f5876H;
                        }
                        int i15 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        m4264A(viewM4274s, i14, i15 + m4272q(viewM4274s), measuredWidth, measuredHeight);
                        int iM4273r = i15 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + m4273r(viewM4274s);
                        iM4271p += m4271p(viewM4274s, iM4271p);
                        paddingTop = iM4273r;
                        i8 = 1;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i7 = i5 - i6;
                    int i142 = i7;
                    if (m4275t(iM4271p)) {
                    }
                    int i152 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    m4264A(viewM4274s, i142, i152 + m4272q(viewM4274s), measuredWidth, measuredHeight);
                    int iM4273r2 = i152 + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + m4273r(viewM4274s);
                    iM4271p += m4271p(viewM4274s, iM4271p);
                    paddingTop = iM4273r2;
                    i8 = 1;
                }
                iM4271p += i8;
            }
            i8 = 1;
            iM4271p += i8;
        }
    }

    /* renamed from: w */
    public void m4278w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4279x(int i, int i2) {
        int[] iArr;
        int i3;
        int iMax;
        int i4;
        int i5;
        int iMax2;
        int iMax3;
        int i6;
        int i7;
        float f;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        char c;
        int i12;
        int i13;
        boolean z;
        boolean z2;
        View view;
        int i14;
        boolean z3;
        int measuredHeight;
        int iM4271p;
        int baseline2;
        int i15;
        this.f5884f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.f5887q == null || this.f5888s == null) {
            this.f5887q = new int[4];
            this.f5888s = new int[4];
        }
        int[] iArr2 = this.f5887q;
        int[] iArr3 = this.f5888s;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z4 = this.f5879a;
        boolean z5 = this.f5886h;
        int i16 = 1073741824;
        boolean z6 = mode == 1073741824;
        int iM4271p2 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        int iMax7 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates = 0;
        boolean z8 = false;
        boolean z9 = true;
        float f2 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iM4271p2 >= virtualChildCount) {
                break;
            }
            View viewM4274s = m4274s(iM4271p2);
            if (viewM4274s == null) {
                this.f5884f += m4280y(iM4271p2);
            } else if (viewM4274s.getVisibility() == 8) {
                iM4271p2 += m4271p(viewM4274s, iM4271p2);
            } else {
                if (m4275t(iM4271p2)) {
                    this.f5884f += this.f5890y;
                }
                LayoutParams layoutParams = (LayoutParams) viewM4274s.getLayoutParams();
                float f3 = ((LinearLayout.LayoutParams) layoutParams).weight;
                float f4 = f2 + f3;
                if (mode == i16 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f3 > 0.0f) {
                    if (z6) {
                        this.f5884f += ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    } else {
                        int i17 = this.f5884f;
                        this.f5884f = Math.max(i17, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i17 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z4) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        viewM4274s.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        i13 = iM4271p2;
                        z = z5;
                        z2 = z4;
                        view = viewM4274s;
                    } else {
                        i13 = iM4271p2;
                        z = z5;
                        z2 = z4;
                        view = viewM4274s;
                        z7 = true;
                        i14 = 1073741824;
                        if (mode2 == i14 && ((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            z3 = true;
                            z8 = true;
                        } else {
                            z3 = false;
                        }
                        int i18 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i18;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i15 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i15 < 0) {
                                i15 = this.f5883e;
                            }
                            int i19 = (((i15 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i19] = Math.max(iArr2[i19], baseline2);
                            iArr[i19] = Math.max(iArr[i19], measuredHeight - baseline2);
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                        z9 = !z9 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                        if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                            if (!z3) {
                                i18 = measuredHeight;
                            }
                            iMax7 = Math.max(iMax7, i18);
                        } else {
                            int i20 = iMax7;
                            if (!z3) {
                                i18 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i18);
                            iMax7 = i20;
                        }
                        int i21 = i13;
                        iM4271p = m4271p(view, i21) + i21;
                        f2 = f4;
                        int i22 = iM4271p + 1;
                        iArr3 = iArr;
                        z5 = z;
                        z4 = z2;
                        i16 = i14;
                        iM4271p2 = i22;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f3 <= 0.0f) {
                        c = 65534;
                        i12 = Integer.MIN_VALUE;
                    } else {
                        c = 65534;
                        ((LinearLayout.LayoutParams) layoutParams).width = -2;
                        i12 = 0;
                    }
                    i13 = iM4271p2;
                    int i23 = i12;
                    z = z5;
                    z2 = z4;
                    m4278w(viewM4274s, i13, i, f4 == 0.0f ? this.f5884f : 0, i2, 0);
                    if (i23 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams).width = i23;
                    }
                    int measuredWidth = viewM4274s.getMeasuredWidth();
                    if (z6) {
                        view = viewM4274s;
                        this.f5884f += ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + m4273r(view);
                    } else {
                        view = viewM4274s;
                        int i24 = this.f5884f;
                        this.f5884f = Math.max(i24, i24 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + m4273r(view));
                    }
                    if (z) {
                        iMax4 = Math.max(measuredWidth, iMax4);
                    }
                }
                i14 = 1073741824;
                if (mode2 == i14) {
                    z3 = false;
                    int i182 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i182;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z2) {
                        i15 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                        if (i15 < 0) {
                        }
                        int i192 = (((i15 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i192] = Math.max(iArr2[i192], baseline2);
                        iArr[i192] = Math.max(iArr[i192], measuredHeight - baseline2);
                    }
                    iMax5 = Math.max(iMax5, measuredHeight);
                    if (z9) {
                        if (((LinearLayout.LayoutParams) layoutParams).weight <= 0.0f) {
                        }
                        int i212 = i13;
                        iM4271p = m4271p(view, i212) + i212;
                        f2 = f4;
                    }
                }
                int i222 = iM4271p + 1;
                iArr3 = iArr;
                z5 = z;
                z4 = z2;
                i16 = i14;
                iM4271p2 = i222;
            }
            z = z5;
            z2 = z4;
            int i25 = i16;
            iM4271p = iM4271p2;
            i14 = i25;
            int i2222 = iM4271p + 1;
            iArr3 = iArr;
            z5 = z;
            z4 = z2;
            i16 = i14;
            iM4271p2 = i2222;
        }
        boolean z10 = z5;
        boolean z11 = z4;
        int i26 = iMax5;
        int i27 = iMax6;
        int i28 = iMax7;
        int i29 = iCombineMeasuredStates;
        if (this.f5884f > 0 && m4275t(virtualChildCount)) {
            this.f5884f += this.f5890y;
        }
        int i30 = iArr2[1];
        if (i30 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            iMax = i26;
            i3 = i29;
        } else {
            i3 = i29;
            iMax = Math.max(i26, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i30, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z10 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f5884f = 0;
            int iM4271p3 = 0;
            while (iM4271p3 < virtualChildCount) {
                View viewM4274s2 = m4274s(iM4271p3);
                if (viewM4274s2 == null) {
                    this.f5884f += m4280y(iM4271p3);
                } else if (viewM4274s2.getVisibility() == 8) {
                    iM4271p3 += m4271p(viewM4274s2, iM4271p3);
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) viewM4274s2.getLayoutParams();
                    if (z6) {
                        this.f5884f += ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + m4273r(viewM4274s2);
                    } else {
                        int i31 = this.f5884f;
                        i11 = iMax;
                        this.f5884f = Math.max(i31, i31 + iMax4 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + m4273r(viewM4274s2));
                        iM4271p3++;
                        iMax = i11;
                    }
                }
                i11 = iMax;
                iM4271p3++;
                iMax = i11;
            }
        }
        int i32 = iMax;
        int paddingLeft = this.f5884f + getPaddingLeft() + getPaddingRight();
        this.f5884f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i33 = (16777215 & iResolveSizeAndState) - this.f5884f;
        if (z7 || (i33 != 0 && f2 > 0.0f)) {
            float f5 = this.f5885g;
            if (f5 > 0.0f) {
                f2 = f5;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f5884f = 0;
            int i34 = i27;
            int iMax8 = -1;
            int iCombineMeasuredStates2 = i3;
            int i35 = 0;
            while (i35 < virtualChildCount) {
                View viewM4274s3 = m4274s(i35);
                if (viewM4274s3 == null || viewM4274s3.getVisibility() == 8) {
                    i6 = i33;
                    i7 = virtualChildCount;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) viewM4274s3.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f6 > 0.0f) {
                        int i36 = (int) ((i33 * f6) / f2);
                        float f7 = f2 - f6;
                        int i37 = i33 - i36;
                        i7 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i10 = 1073741824;
                            if (mode == 1073741824) {
                                if (i36 <= 0) {
                                    i36 = 0;
                                }
                                viewM4274s3.measure(View.MeasureSpec.makeMeasureSpec(i36, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewM4274s3.getMeasuredState() & (-16777216));
                            f2 = f7;
                            i6 = i37;
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth2 = viewM4274s3.getMeasuredWidth() + i36;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewM4274s3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i10), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewM4274s3.getMeasuredState() & (-16777216));
                        f2 = f7;
                        i6 = i37;
                    } else {
                        i6 = i33;
                        i7 = virtualChildCount;
                    }
                    if (z6) {
                        this.f5884f += viewM4274s3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + m4273r(viewM4274s3);
                        f = f2;
                    } else {
                        int i38 = this.f5884f;
                        f = f2;
                        this.f5884f = Math.max(i38, viewM4274s3.getMeasuredWidth() + i38 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + m4273r(viewM4274s3));
                    }
                    boolean z12 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i39 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = viewM4274s3.getMeasuredHeight() + i39;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z12) {
                        i39 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i34, i39);
                    if (z9) {
                        i8 = -1;
                        boolean z13 = ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                        if (z11 && (baseline = viewM4274s3.getBaseline()) != i8) {
                            i9 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i9 < 0) {
                                i9 = this.f5883e;
                            }
                            int i40 = (((i9 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i40] = Math.max(iArr2[i40], baseline);
                            iArr[i40] = Math.max(iArr[i40], measuredHeight2 - baseline);
                        }
                        z9 = z13;
                        i34 = iMax9;
                        f2 = f;
                    } else {
                        i8 = -1;
                    }
                    if (z11) {
                        i9 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i9 < 0) {
                        }
                        int i402 = (((i9 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i402] = Math.max(iArr2[i402], baseline);
                        iArr[i402] = Math.max(iArr[i402], measuredHeight2 - baseline);
                    }
                    z9 = z13;
                    i34 = iMax9;
                    f2 = f;
                }
                i35++;
                i33 = i6;
                virtualChildCount = i7;
            }
            i4 = i2;
            i5 = virtualChildCount;
            this.f5884f += getPaddingLeft() + getPaddingRight();
            int i41 = iArr2[1];
            iMax2 = (i41 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i41, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax3 = i34;
            i3 = iCombineMeasuredStates2;
        } else {
            iMax3 = Math.max(i27, i28);
            if (z10 && mode != 1073741824) {
                for (int i42 = 0; i42 < virtualChildCount; i42++) {
                    View viewM4274s4 = m4274s(i42);
                    if (viewM4274s4 != null && viewM4274s4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) viewM4274s4.getLayoutParams())).weight > 0.0f) {
                        viewM4274s4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewM4274s4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = i2;
            i5 = virtualChildCount;
            iMax2 = i32;
        }
        if (z9 || mode2 == 1073741824) {
            iMax3 = iMax2;
        }
        setMeasuredDimension(iResolveSizeAndState | (i3 & (-16777216)), View.resolveSizeAndState(Math.max(iMax3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, i3 << 16));
        if (z8) {
            m4269k(i5, i);
        }
    }

    /* renamed from: y */
    public int m4280y(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0333  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4281z(int i, int i2) {
        int i3;
        int iCombineMeasuredStates;
        int i4;
        int iMax;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        View view;
        int iMax2;
        boolean z2;
        int iMax3;
        this.f5884f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i17 = this.f5880b;
        boolean z3 = this.f5886h;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int iMax4 = 0;
        int i21 = 0;
        int iM4271p = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = true;
        float f = 0.0f;
        while (true) {
            int i22 = 8;
            int i23 = iMax4;
            if (iM4271p >= virtualChildCount) {
                int i24 = i18;
                int i25 = i20;
                int i26 = i21;
                int i27 = virtualChildCount;
                int i28 = mode2;
                int iMax5 = i19;
                if (this.f5884f > 0) {
                    i3 = i27;
                    if (m4275t(i3)) {
                        this.f5884f += this.f5876H;
                    }
                } else {
                    i3 = i27;
                }
                if (z3 && (i28 == Integer.MIN_VALUE || i28 == 0)) {
                    this.f5884f = 0;
                    int iM4271p2 = 0;
                    while (iM4271p2 < i3) {
                        View viewM4274s = m4274s(iM4271p2);
                        if (viewM4274s == null) {
                            this.f5884f += m4280y(iM4271p2);
                        } else if (viewM4274s.getVisibility() == i22) {
                            iM4271p2 += m4271p(viewM4274s, iM4271p2);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) viewM4274s.getLayoutParams();
                            int i29 = this.f5884f;
                            this.f5884f = Math.max(i29, i29 + i25 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + m4273r(viewM4274s));
                        }
                        iM4271p2++;
                        i22 = 8;
                    }
                }
                int paddingTop = this.f5884f + getPaddingTop() + getPaddingBottom();
                this.f5884f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i30 = (16777215 & iResolveSizeAndState) - this.f5884f;
                if (z4 || (i30 != 0 && f > 0.0f)) {
                    float f2 = this.f5885g;
                    if (f2 > 0.0f) {
                        f = f2;
                    }
                    this.f5884f = 0;
                    int i31 = i30;
                    int i32 = i26;
                    iCombineMeasuredStates = i24;
                    int i33 = 0;
                    while (i33 < i3) {
                        View viewM4274s2 = m4274s(i33);
                        if (viewM4274s2.getVisibility() == 8) {
                            i5 = i31;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) viewM4274s2.getLayoutParams();
                            float f3 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f3 > 0.0f) {
                                int i34 = (int) ((i31 * f3) / f);
                                float f4 = f - f3;
                                i5 = i31 - i34;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i8 = 1073741824;
                                    if (i28 == 1073741824) {
                                        if (i34 <= 0) {
                                            i34 = 0;
                                        }
                                        viewM4274s2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i34, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewM4274s2.getMeasuredState() & (-256));
                                    f = f4;
                                } else {
                                    i8 = 1073741824;
                                }
                                int measuredHeight = viewM4274s2.getMeasuredHeight() + i34;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewM4274s2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewM4274s2.getMeasuredState() & (-256));
                                f = f4;
                            } else {
                                i5 = i31;
                            }
                            int i35 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = viewM4274s2.getMeasuredWidth() + i35;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f5 = f;
                            if (mode != 1073741824) {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                                z = ((LinearLayout.LayoutParams) layoutParams2).width == -1;
                                if (!z) {
                                    i35 = measuredWidth;
                                }
                                int iMax6 = Math.max(i32, i35);
                                boolean z7 = !z6 && ((LinearLayout.LayoutParams) layoutParams2).width == i7;
                                int i36 = this.f5884f;
                                this.f5884f = Math.max(i36, viewM4274s2.getMeasuredHeight() + i36 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + m4273r(viewM4274s2));
                                z6 = z7;
                                iCombineMeasuredStates = i6;
                                i32 = iMax6;
                                f = f5;
                            } else {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                            }
                            if (!z) {
                            }
                            int iMax62 = Math.max(i32, i35);
                            if (z6) {
                                int i362 = this.f5884f;
                                this.f5884f = Math.max(i362, viewM4274s2.getMeasuredHeight() + i362 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin + m4273r(viewM4274s2));
                                z6 = z7;
                                iCombineMeasuredStates = i6;
                                i32 = iMax62;
                                f = f5;
                            }
                        }
                        i33++;
                        i31 = i5;
                    }
                    i4 = i;
                    this.f5884f += getPaddingTop() + getPaddingBottom();
                    iMax = i32;
                } else {
                    iMax = Math.max(i26, i23);
                    if (z3 && i28 != 1073741824) {
                        for (int i37 = 0; i37 < i3; i37++) {
                            View viewM4274s3 = m4274s(i37);
                            if (viewM4274s3 != null && viewM4274s3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) viewM4274s3.getLayoutParams())).weight > 0.0f) {
                                viewM4274s3.measure(View.MeasureSpec.makeMeasureSpec(viewM4274s3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                            }
                        }
                    }
                    i4 = i;
                    iCombineMeasuredStates = i24;
                }
                if (z6 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, iCombineMeasuredStates), iResolveSizeAndState);
                if (z5) {
                    m4270l(i3, i2);
                    return;
                }
                return;
            }
            View viewM4274s4 = m4274s(iM4271p);
            if (viewM4274s4 == null) {
                this.f5884f += m4280y(iM4271p);
                i12 = virtualChildCount;
                i13 = mode2;
                iMax4 = i23;
            } else {
                int i38 = i18;
                if (viewM4274s4.getVisibility() == 8) {
                    iM4271p += m4271p(viewM4274s4, iM4271p);
                    i12 = virtualChildCount;
                    iMax4 = i23;
                    i18 = i38;
                    i13 = mode2;
                } else {
                    if (m4275t(iM4271p)) {
                        this.f5884f += this.f5876H;
                    }
                    LayoutParams layoutParams3 = (LayoutParams) viewM4274s4.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    float f7 = f + f6;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f6 > 0.0f) {
                        int i39 = this.f5884f;
                        this.f5884f = Math.max(i39, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i39 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                        iMax2 = i20;
                        view = viewM4274s4;
                        i15 = i21;
                        z4 = true;
                        i10 = i38;
                        i11 = i19;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i14 = i23;
                        i16 = iM4271p;
                    } else {
                        int i40 = i19;
                        if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                            i9 = 0;
                        }
                        i10 = i38;
                        int i41 = i9;
                        i11 = i40;
                        int i42 = i20;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i14 = i23;
                        i15 = i21;
                        i16 = iM4271p;
                        m4278w(viewM4274s4, iM4271p, i, 0, i2, f7 == 0.0f ? this.f5884f : 0);
                        if (i41 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) layoutParams3).height = i41;
                        }
                        int measuredHeight2 = viewM4274s4.getMeasuredHeight();
                        int i43 = this.f5884f;
                        view = viewM4274s4;
                        this.f5884f = Math.max(i43, i43 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin + m4273r(view));
                        iMax2 = z3 ? Math.max(measuredHeight2, i42) : i42;
                    }
                    if (i17 >= 0 && i17 == i16 + 1) {
                        this.f5881c = this.f5884f;
                    }
                    if (i16 < i17 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                        z5 = true;
                    }
                    int i44 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i44;
                    int iMax7 = Math.max(i11, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i10, view.getMeasuredState());
                    z6 = z6 && ((LinearLayout.LayoutParams) layoutParams3).width == -1;
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (!z2) {
                            i44 = measuredWidth2;
                        }
                        iMax4 = Math.max(i14, i44);
                        iMax3 = i15;
                    } else {
                        if (!z2) {
                            i44 = measuredWidth2;
                        }
                        iMax3 = Math.max(i15, i44);
                        iMax4 = i14;
                    }
                    int iM4271p3 = m4271p(view, i16) + i16;
                    i20 = iMax2;
                    f = f7;
                    i21 = iMax3;
                    i18 = iCombineMeasuredStates2;
                    iM4271p = iM4271p3;
                    i19 = iMax7;
                }
            }
            iM4271p++;
            mode2 = i13;
            virtualChildCount = i12;
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5879a = true;
        this.f5880b = -1;
        this.f5881c = 0;
        this.f5883e = 8388659;
        anh anhVarM17525v = anh.m17525v(context, attributeSet, bbe.LinearLayoutCompat, i, 0);
        wvi.k0(this, context, bbe.LinearLayoutCompat, attributeSet, anhVarM17525v.m17543r(), i, 0);
        int iM17536k = anhVarM17525v.m17536k(bbe.LinearLayoutCompat_android_orientation, -1);
        if (iM17536k >= 0) {
            setOrientation(iM17536k);
        }
        int iM17536k2 = anhVarM17525v.m17536k(bbe.LinearLayoutCompat_android_gravity, -1);
        if (iM17536k2 >= 0) {
            setGravity(iM17536k2);
        }
        boolean zM17526a = anhVarM17525v.m17526a(bbe.LinearLayoutCompat_android_baselineAligned, true);
        if (!zM17526a) {
            setBaselineAligned(zM17526a);
        }
        this.f5885g = anhVarM17525v.m17534i(bbe.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f5880b = anhVarM17525v.m17536k(bbe.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f5886h = anhVarM17525v.m17526a(bbe.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(anhVarM17525v.m17532g(bbe.LinearLayoutCompat_divider));
        this.f5877L = anhVarM17525v.m17536k(bbe.LinearLayoutCompat_showDividers, 0);
        this.f5878M = anhVarM17525v.m17531f(bbe.LinearLayoutCompat_dividerPadding, 0);
        anhVarM17525v.m17546x();
    }
}
