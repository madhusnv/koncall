package p013o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import l4.C4367l;
import mm.AbstractC4801l;
import p009j.AbstractC3500a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b1 extends ViewGroup {

    /* renamed from: a */
    public boolean f25445a;

    /* renamed from: b */
    public int f25446b;

    /* renamed from: c */
    public int f25447c;

    /* renamed from: d */
    public int f25448d;

    /* renamed from: e */
    public int f25449e;

    /* renamed from: f */
    public int f25450f;

    /* renamed from: g */
    public float f25451g;

    /* renamed from: h */
    public boolean f25452h;

    /* renamed from: j */
    public int[] f25453j;

    /* renamed from: k */
    public int[] f25454k;

    /* renamed from: l */
    public Drawable f25455l;

    /* renamed from: m */
    public int f25456m;

    /* renamed from: n */
    public int f25457n;

    /* renamed from: p */
    public int f25458p;

    /* renamed from: q */
    public int f25459q;

    public b1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f25445a = true;
        this.f25446b = -1;
        this.f25447c = 0;
        this.f25449e = 8388659;
        int[] iArr = AbstractC3500a.f18355l;
        C4367l c4367lM9117H = C4367l.m9117H(context, attributeSet, iArr, 0);
        v0.m2527i(this, context, iArr, attributeSet, (TypedArray) c4367lM9117H.f21922c, 0);
        TypedArray typedArray = (TypedArray) c4367lM9117H.f21922c;
        int i11 = typedArray.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = typedArray.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z6 = typedArray.getBoolean(2, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f25451g = typedArray.getFloat(4, -1.0f);
        this.f25446b = typedArray.getInt(3, -1);
        this.f25452h = typedArray.getBoolean(7, false);
        setDividerDrawable(c4367lM9117H.m9145y(5));
        this.f25458p = typedArray.getInt(8, 0);
        this.f25459q = typedArray.getDimensionPixelSize(6, 0);
        c4367lM9117H.m9124I();
    }

    /* renamed from: c */
    public final void m10210c(Canvas canvas, int i10) {
        this.f25455l.setBounds(getPaddingLeft() + this.f25459q, i10, (getWidth() - getPaddingRight()) - this.f25459q, this.f25457n + i10);
        this.f25455l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a1;
    }

    /* renamed from: d */
    public final void m10211d(Canvas canvas, int i10) {
        this.f25455l.setBounds(i10, getPaddingTop() + this.f25459q, this.f25456m + i10, (getHeight() - getPaddingBottom()) - this.f25459q);
        this.f25455l.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a1 generateDefaultLayoutParams() {
        int i10 = this.f25448d;
        if (i10 == 0) {
            return new a1(-2, -2);
        }
        if (i10 == 1) {
            return new a1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a1 generateLayoutParams(AttributeSet attributeSet) {
        return new a1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a1 ? new a1((a1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a1((ViewGroup.MarginLayoutParams) layoutParams) : new a1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f25446b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f25446b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f25446b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iM9727a = this.f25447c;
        if (this.f25448d == 1 && (i10 = this.f25449e & 112) != 48) {
            if (i10 == 16) {
                iM9727a = AbstractC4801l.m9727a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f25450f, 2, iM9727a);
            } else if (i10 == 80) {
                iM9727a = ((getBottom() - getTop()) - getPaddingBottom()) - this.f25450f;
            }
        }
        return iM9727a + ((LinearLayout.LayoutParams) ((a1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f25446b;
    }

    public Drawable getDividerDrawable() {
        return this.f25455l;
    }

    public int getDividerPadding() {
        return this.f25459q;
    }

    public int getDividerWidth() {
        return this.f25456m;
    }

    public int getGravity() {
        return this.f25449e;
    }

    public int getOrientation() {
        return this.f25448d;
    }

    public int getShowDividers() {
        return this.f25458p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f25451g;
    }

    /* renamed from: h */
    public final boolean m10212h(int i10) {
        if (i10 == 0) {
            return (this.f25458p & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f25458p & 4) != 0;
        }
        if ((this.f25458p & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.f25455l == null) {
            return;
        }
        int i11 = 0;
        if (this.f25448d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && m10212h(i11)) {
                    m10210c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a1) childAt.getLayoutParams())).topMargin) - this.f25457n);
                }
                i11++;
            }
            if (m10212h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m10210c(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f25457n : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a1) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z6 = l2.f25576a;
        boolean z10 = getLayoutDirection() == 1;
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m10212h(i11)) {
                a1 a1Var = (a1) childAt3.getLayoutParams();
                m10211d(canvas, z10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) a1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) a1Var).leftMargin) - this.f25456m);
            }
            i11++;
        }
        if (m10212h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a1 a1Var2 = (a1) childAt4.getLayoutParams();
                if (z10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) a1Var2).leftMargin;
                    i10 = this.f25456m;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) a1Var2).rightMargin;
                }
            } else if (z10) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f25456m;
                right = left - i10;
            }
            m10211d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ad  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013o.b1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013o.b1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z6) {
        this.f25445a = z6;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f25446b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f25455l) {
            return;
        }
        this.f25455l = drawable;
        if (drawable != null) {
            this.f25456m = drawable.getIntrinsicWidth();
            this.f25457n = drawable.getIntrinsicHeight();
        } else {
            this.f25456m = 0;
            this.f25457n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f25459q = i10;
    }

    public void setGravity(int i10) {
        if (this.f25449e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f25449e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f25449e;
        if ((8388615 & i12) != i11) {
            this.f25449e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f25452h = z6;
    }

    public void setOrientation(int i10) {
        if (this.f25448d != i10) {
            this.f25448d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f25458p) {
            requestLayout();
        }
        this.f25458p = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f25449e;
        if ((i12 & 112) != i11) {
            this.f25449e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f25451g = Math.max(DefinitionKt.NO_Float_VALUE, f6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
