package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.appcompat.widget.LinearLayoutCompat;
import p001o.yzi;

/* loaded from: classes2.dex */
public class ActionMenuView extends LinearLayoutCompat implements C1792e.b, InterfaceC1797j {

    /* renamed from: Q */
    public C1792e f5750Q;
    public Context h0;
    public int i0;
    public boolean j0;
    public ActionMenuPresenter k0;
    public InterfaceC1796i.a l0;
    public C1792e.a m0;
    public boolean n0;
    public int o0;
    public int p0;
    public int q0;
    public InterfaceC1817d r0;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a */
        public boolean f5751a;

        /* renamed from: b */
        public int f5752b;

        /* renamed from: c */
        public int f5753c;

        /* renamed from: d */
        public boolean f5754d;

        /* renamed from: e */
        public boolean f5755e;

        /* renamed from: f */
        public boolean f5756f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f5751a = layoutParams.f5751a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f5751a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC1814a {
        /* renamed from: a */
        boolean mo3946a();

        /* renamed from: b */
        boolean mo3947b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C1815b implements InterfaceC1796i.a {
        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: b */
        public void mo3835b(C1792e c1792e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: c */
        public boolean mo3836c(C1792e c1792e) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public class C1816c implements C1792e.a {
        public C1816c() {
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: a */
        public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
            InterfaceC1817d interfaceC1817d = ActionMenuView.this.r0;
            return interfaceC1817d != null && interfaceC1817d.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: b */
        public void mo3809b(C1792e c1792e) {
            C1792e.a aVar = ActionMenuView.this.m0;
            if (aVar != null) {
                aVar.mo3809b(c1792e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface InterfaceC1817d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m4171L(View view, int i, int i2, int i3, int i4) {
        int i5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.m3950s();
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
            } else {
                i5 = 0;
            }
        }
        layoutParams.f5754d = !layoutParams.f5751a && z;
        layoutParams.f5752b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    /* renamed from: B */
    public void m4172B() {
        ActionMenuPresenter actionMenuPresenter = this.k0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m4154B();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    /* renamed from: F */
    public LayoutParams m4176F() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f5751a = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    /* renamed from: G */
    public boolean m4177G(int i) {
        boolean zMo3946a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1814a)) {
            zMo3946a = false | ((InterfaceC1814a) childAt).mo3946a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1814a)) ? zMo3946a : zMo3946a | ((InterfaceC1814a) childAt2).mo3947b();
    }

    /* renamed from: H */
    public boolean m4178H() {
        ActionMenuPresenter actionMenuPresenter = this.k0;
        return actionMenuPresenter != null && actionMenuPresenter.m4157E();
    }

    /* renamed from: I */
    public boolean m4179I() {
        ActionMenuPresenter actionMenuPresenter = this.k0;
        return actionMenuPresenter != null && actionMenuPresenter.m4159G();
    }

    /* renamed from: J */
    public boolean m4180J() {
        ActionMenuPresenter actionMenuPresenter = this.k0;
        return actionMenuPresenter != null && actionMenuPresenter.m4160H();
    }

    /* renamed from: K */
    public boolean m4181K() {
        return this.j0;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* renamed from: M */
    public final void m4182M(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.p0;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int iMax = 0;
        int i13 = 0;
        boolean z4 = false;
        int i14 = 0;
        int iMax2 = 0;
        int i15 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i16 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i17 = i14 + 1;
                if (z5) {
                    int i18 = this.q0;
                    i7 = i17;
                    r14 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    i7 = i17;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f5756f = r14;
                layoutParams.f5753c = r14;
                layoutParams.f5752b = r14;
                layoutParams.f5754d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.f5755e = z5 && ((ActionMenuItemView) childAt).m3950s();
                int iM4171L = m4171L(childAt, i12, layoutParams.f5751a ? 1 : i10, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM4171L);
                if (layoutParams.f5754d) {
                    i15++;
                }
                if (layoutParams.f5751a) {
                    z4 = true;
                }
                i10 -= iM4171L;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM4171L == 1) {
                    j |= 1 << i13;
                    iMax = iMax;
                }
                i14 = i7;
            }
            i13++;
            size2 = i16;
        }
        int i19 = size2;
        boolean z6 = z4 && i14 == 2;
        boolean z7 = false;
        while (i15 > 0 && i10 > 0) {
            int i20 = Integer.MAX_VALUE;
            int i21 = 0;
            int i22 = 0;
            long j2 = 0;
            while (i22 < childCount) {
                boolean z8 = z7;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i22).getLayoutParams();
                int i23 = iMax;
                if (layoutParams2.f5754d) {
                    int i24 = layoutParams2.f5752b;
                    if (i24 < i20) {
                        j2 = 1 << i22;
                        i20 = i24;
                        i21 = 1;
                    } else if (i24 == i20) {
                        i21++;
                        j2 |= 1 << i22;
                    }
                }
                i22++;
                iMax = i23;
                z7 = z8;
            }
            z = z7;
            i5 = iMax;
            j |= j2;
            if (i21 > i10) {
                i3 = mode;
                i4 = i8;
                break;
            }
            int i25 = i20 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i27 = i8;
                int i28 = mode;
                long j3 = 1 << i26;
                if ((j2 & j3) == 0) {
                    if (layoutParams3.f5752b == i25) {
                        j |= j3;
                    }
                    z3 = z6;
                } else {
                    if (z6 && layoutParams3.f5755e && i10 == 1) {
                        int i29 = this.q0;
                        z3 = z6;
                        childAt2.setPadding(i29 + i12, 0, i29, 0);
                    } else {
                        z3 = z6;
                    }
                    layoutParams3.f5752b++;
                    layoutParams3.f5756f = true;
                    i10--;
                }
                i26++;
                mode = i28;
                i8 = i27;
                z6 = z3;
            }
            iMax = i5;
            z7 = true;
        }
        i3 = mode;
        i4 = i8;
        z = z7;
        i5 = iMax;
        boolean z9 = !z4 && i14 == 1;
        if (i10 <= 0 || j == 0 || (i10 >= i14 - 1 && !z9 && iMax2 <= 1)) {
            i6 = 0;
            z2 = z;
        } else {
            float fBitCount = Long.bitCount(j);
            if (z9) {
                i6 = 0;
            } else {
                i6 = 0;
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f5755e) {
                    fBitCount -= 0.5f;
                }
                int i30 = childCount - 1;
                if ((j & (1 << i30)) != 0 && !((LayoutParams) getChildAt(i30).getLayoutParams()).f5755e) {
                    fBitCount -= 0.5f;
                }
            }
            int i31 = fBitCount > 0.0f ? (int) ((i10 * i12) / fBitCount) : i6;
            z2 = z;
            for (int i32 = i6; i32 < childCount; i32++) {
                if ((j & (1 << i32)) != 0) {
                    View childAt3 = getChildAt(i32);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f5753c = i31;
                        layoutParams4.f5756f = true;
                        if (i32 == 0 && !layoutParams4.f5755e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i31) / 2;
                        }
                        z2 = true;
                    } else if (layoutParams4.f5751a) {
                        layoutParams4.f5753c = i31;
                        layoutParams4.f5756f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i31) / 2;
                        z2 = true;
                    } else {
                        if (i32 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i31 / 2;
                        }
                        if (i32 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i31 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i33 = i6; i33 < childCount; i33++) {
                View childAt4 = getChildAt(i33);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f5756f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f5752b * i12) + layoutParams5.f5753c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i19);
    }

    /* renamed from: N */
    public C1792e m4183N() {
        return this.f5750Q;
    }

    /* renamed from: O */
    public boolean m4184O() {
        ActionMenuPresenter actionMenuPresenter = this.k0;
        return actionMenuPresenter != null && actionMenuPresenter.m4166N();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j
    /* renamed from: a */
    public void mo3956a(C1792e c1792e) {
        this.f5750Q = c1792e;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.view.menu.C1792e.b
    /* renamed from: d */
    public boolean mo3957d(C1794g c1794g) {
        return this.f5750Q.m4028O(c1794g, 0);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f5750Q == null) {
            Context context = getContext();
            C1792e c1792e = new C1792e(context);
            this.f5750Q = c1792e;
            c1792e.mo4036W(new C1816c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.k0 = actionMenuPresenter;
            actionMenuPresenter.m4165M(true);
            ActionMenuPresenter actionMenuPresenter2 = this.k0;
            InterfaceC1796i.a c1815b = this.l0;
            if (c1815b == null) {
                c1815b = new C1815b();
            }
            actionMenuPresenter2.mo3965d(c1815b);
            this.f5750Q.m4042c(this.k0, this.h0);
            this.k0.m4163K(this);
        }
        return this.f5750Q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.k0.m4156D();
    }

    public int getPopupTheme() {
        return this.i0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.k0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo3967h(false);
            if (this.k0.m4160H()) {
                this.k0.m4157E();
                this.k0.m4166N();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4172B();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.n0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM58585b = yzi.m58585b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f5751a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m4177G(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM58585b) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    m4177G(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zM58585b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f5751a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f5751a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = i18 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        C1792e c1792e;
        boolean z = this.n0;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.n0 = z2;
        if (z != z2) {
            this.o0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.n0 && (c1792e = this.f5750Q) != null && size != this.o0) {
            this.o0 = size;
            c1792e.mo4027N(true);
        }
        int childCount = getChildCount();
        if (this.n0 && childCount > 0) {
            m4182M(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.k0.m4162J(z);
    }

    public void setMenuCallbacks(InterfaceC1796i.a aVar, C1792e.a aVar2) {
        this.l0 = aVar;
        this.m0 = aVar2;
    }

    public void setOnMenuItemClickListener(InterfaceC1817d interfaceC1817d) {
        this.r0 = interfaceC1817d;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.k0.m4164L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.j0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.i0 != i) {
            this.i0 = i;
            if (i == 0) {
                this.h0 = getContext();
            } else {
                this.h0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.k0 = actionMenuPresenter;
        actionMenuPresenter.m4163K(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.p0 = (int) (56.0f * f);
        this.q0 = (int) (f * 4.0f);
        this.h0 = context;
        this.i0 = 0;
    }
}
