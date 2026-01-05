package androidx.appcompat.widget;

import al.C0174b;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.skydoves.balloon.internals.DefinitionKt;
import l1.C4327p;
import mm.AbstractC4801l;
import p012n.InterfaceC4928h;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;
import p013o.C5220f;
import p013o.C5222h;
import p013o.C5223i;
import p013o.C5225k;
import p013o.InterfaceC5224j;
import p013o.InterfaceC5226l;
import p013o.a1;
import p013o.b1;
import p013o.l2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class ActionMenuView extends b1 implements InterfaceC4928h {

    /* renamed from: B */
    public final int f1750B;

    /* renamed from: C */
    public InterfaceC5226l f1751C;

    /* renamed from: r */
    public MenuC4929i f1752r;

    /* renamed from: s */
    public Context f1753s;

    /* renamed from: t */
    public int f1754t;

    /* renamed from: v */
    public C5223i f1755v;

    /* renamed from: w */
    public C4327p f1756w;

    /* renamed from: x */
    public boolean f1757x;

    /* renamed from: y */
    public int f1758y;

    /* renamed from: z */
    public final int f1759z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.f1759z = (int) (56.0f * f6);
        this.f1750B = (int) (f6 * 4.0f);
        this.f1753s = context;
        this.f1754t = 0;
    }

    /* renamed from: i */
    public static C5225k m569i() {
        C5225k c5225k = new C5225k(-2, -2);
        c5225k.f25570a = false;
        ((LinearLayout.LayoutParams) c5225k).gravity = 16;
        return c5225k;
    }

    /* renamed from: j */
    public static C5225k m570j(ViewGroup.LayoutParams layoutParams) {
        C5225k c5225k;
        if (layoutParams == null) {
            return m569i();
        }
        if (layoutParams instanceof C5225k) {
            C5225k c5225k2 = (C5225k) layoutParams;
            c5225k = new C5225k(c5225k2);
            c5225k.f25570a = c5225k2.f25570a;
        } else {
            c5225k = new C5225k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c5225k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c5225k).gravity = 16;
        }
        return c5225k;
    }

    @Override // p012n.InterfaceC4928h
    /* renamed from: b */
    public final boolean mo555b(MenuItemC4930j menuItemC4930j) {
        return this.f1752r.m9867p(menuItemC4930j, null, 0);
    }

    @Override // p013o.b1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5225k;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p013o.b1
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ a1 generateDefaultLayoutParams() {
        return m569i();
    }

    @Override // p013o.b1
    /* renamed from: f */
    public final a1 generateLayoutParams(AttributeSet attributeSet) {
        return new C5225k(getContext(), attributeSet);
    }

    @Override // p013o.b1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ a1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m570j(layoutParams);
    }

    @Override // p013o.b1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m569i();
    }

    @Override // p013o.b1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m570j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1752r == null) {
            Context context = getContext();
            MenuC4929i menuC4929i = new MenuC4929i(context);
            this.f1752r = menuC4929i;
            menuC4929i.f24537e = new C4327p(9, this);
            C5223i c5223i = new C5223i(context);
            this.f1755v = c5223i;
            c5223i.f25524l = true;
            c5223i.f25525m = true;
            c5223i.f25518e = new C0174b(22);
            this.f1752r.m9853b(c5223i, this.f1753s);
            C5223i c5223i2 = this.f1755v;
            c5223i2.f25520g = this;
            this.f1752r = c5223i2.f25516c;
        }
        return this.f1752r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C5223i c5223i = this.f1755v;
        C5222h c5222h = c5223i.f25521h;
        if (c5222h != null) {
            return c5222h.getDrawable();
        }
        if (c5223i.f25523k) {
            return c5223i.f25522j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1754t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: k */
    public final boolean m574k(int i10) {
        boolean zMo551b = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC5224j)) {
            zMo551b = ((InterfaceC5224j) childAt).mo551b();
        }
        return (i10 <= 0 || !(childAt2 instanceof InterfaceC5224j)) ? zMo551b : ((InterfaceC5224j) childAt2).mo552c() | zMo551b;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C5223i c5223i = this.f1755v;
        if (c5223i != null) {
            c5223i.mo9838g();
            C5220f c5220f = this.f1755v.f25531t;
            if (c5220f == null || !c5220f.m9881b()) {
                return;
            }
            this.f1755v.m10242f();
            this.f1755v.m10243h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5223i c5223i = this.f1755v;
        if (c5223i != null) {
            c5223i.m10242f();
            C5220f c5220f = c5223i.f25532v;
            if (c5220f == null || !c5220f.m9881b()) {
                return;
            }
            c5220f.f24591i.dismiss();
        }
    }

    @Override // p013o.b1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f1757x) {
            super.onLayout(z6, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean z10 = l2.f25576a;
        boolean z11 = getLayoutDirection() == 1;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                C5225k c5225k = (C5225k) childAt.getLayoutParams();
                if (c5225k.f25570a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m574k(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z11) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c5225k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c5225k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c5225k).leftMargin) + ((LinearLayout.LayoutParams) c5225k).rightMargin;
                    m574k(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (z11) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                C5225k c5225k2 = (C5225k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c5225k2.f25570a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) c5225k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c5225k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            C5225k c5225k3 = (C5225k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c5225k3.f25570a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) c5225k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = AbstractC4801l.m9725C(measuredWidth4, ((LinearLayout.LayoutParams) c5225k3).rightMargin, iMax, i27);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p013o.b1, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        ?? r11;
        int i14;
        int i15;
        MenuC4929i menuC4929i;
        boolean z6 = this.f1757x;
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1757x = z10;
        if (z6 != z10) {
            this.f1758y = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1757x && (menuC4929i = this.f1752r) != null && size != this.f1758y) {
            this.f1758y = size;
            menuC4929i.m9866o(true);
        }
        int childCount = getChildCount();
        if (!this.f1757x || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                C5225k c5225k = (C5225k) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) c5225k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c5225k).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.f1759z;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        boolean z11 = false;
        int i24 = 0;
        long j6 = 0;
        while (true) {
            i12 = this.f1750B;
            if (i23 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i23);
            int i25 = size3;
            int i26 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i14 = i21;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z12) {
                    childAt.setPadding(i12, 0, i12, 0);
                }
                C5225k c5225k2 = (C5225k) childAt.getLayoutParams();
                c5225k2.f25575f = false;
                c5225k2.f25572c = 0;
                c5225k2.f25571b = 0;
                c5225k2.f25573d = false;
                ((LinearLayout.LayoutParams) c5225k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c5225k2).rightMargin = 0;
                c5225k2.f25574e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i27 = c5225k2.f25570a ? 1 : i19;
                C5225k c5225k3 = (C5225k) childAt.getLayoutParams();
                int i28 = i19;
                i14 = i21;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i26, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i27 <= 0 || (z13 && i27 < 2)) {
                    i15 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i27, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i15 = measuredWidth / i14;
                    if (measuredWidth % i14 != 0) {
                        i15++;
                    }
                    if (z14 && i15 < 2) {
                        i15 = 2;
                    }
                }
                c5225k3.f25573d = !c5225k3.f25570a && z14;
                c5225k3.f25571b = i15;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i15 * i14, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i15);
                if (c5225k2.f25573d) {
                    i24++;
                }
                if (c5225k2.f25570a) {
                    z11 = true;
                }
                i19 = i28 - i15;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i15 == 1) {
                    j6 |= 1 << i23;
                }
            }
            i23++;
            size3 = i25;
            paddingBottom = i26;
            i21 = i14;
        }
        int i29 = size3;
        int i30 = i19;
        int i31 = i21;
        boolean z15 = z11 && i22 == 2;
        int i32 = i30;
        boolean z16 = false;
        while (i24 > 0 && i32 > 0) {
            int i33 = Integer.MAX_VALUE;
            long j10 = 0;
            int i34 = 0;
            int i35 = 0;
            while (i35 < childCount2) {
                int i36 = iMax;
                C5225k c5225k4 = (C5225k) getChildAt(i35).getLayoutParams();
                boolean z17 = z15;
                if (c5225k4.f25573d) {
                    int i37 = c5225k4.f25571b;
                    if (i37 < i33) {
                        j10 = 1 << i35;
                        i33 = i37;
                        i34 = 1;
                    } else if (i37 == i33) {
                        j10 |= 1 << i35;
                        i34++;
                    }
                }
                i35++;
                z15 = z17;
                iMax = i36;
            }
            i13 = iMax;
            boolean z18 = z15;
            j6 |= j10;
            if (i34 > i32) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                C5225k c5225k5 = (C5225k) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j11 = 1 << i39;
                if ((j10 & j11) != 0) {
                    if (z18 && c5225k5.f25574e) {
                        r11 = 1;
                        r11 = 1;
                        if (i32 == 1) {
                            childAt2.setPadding(i12 + i31, 0, i12, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c5225k5.f25571b += r11;
                    c5225k5.f25575f = r11;
                    i32--;
                } else if (c5225k5.f25571b == i38) {
                    j6 |= j11;
                }
                i39++;
                z11 = z19;
            }
            z15 = z18;
            iMax = i13;
            z16 = true;
        }
        i13 = iMax;
        boolean z20 = !z11 && i22 == 1;
        if (i32 > 0 && j6 != 0 && (i32 < i22 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j6);
            if (!z20) {
                if ((j6 & 1) != 0 && !((C5225k) getChildAt(0).getLayoutParams()).f25574e) {
                    fBitCount -= 0.5f;
                }
                int i40 = childCount2 - 1;
                if ((j6 & (1 << i40)) != 0 && !((C5225k) getChildAt(i40).getLayoutParams()).f25574e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > DefinitionKt.NO_Float_VALUE ? (int) ((i32 * i31) / fBitCount) : 0;
            boolean z21 = z16;
            for (int i42 = 0; i42 < childCount2; i42++) {
                if ((j6 & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    C5225k c5225k6 = (C5225k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c5225k6.f25572c = i41;
                        c5225k6.f25575f = true;
                        if (i42 == 0 && !c5225k6.f25574e) {
                            ((LinearLayout.LayoutParams) c5225k6).leftMargin = (-i41) / 2;
                        }
                        z21 = true;
                    } else if (c5225k6.f25570a) {
                        c5225k6.f25572c = i41;
                        c5225k6.f25575f = true;
                        ((LinearLayout.LayoutParams) c5225k6).rightMargin = (-i41) / 2;
                        z21 = true;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) c5225k6).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c5225k6).rightMargin = i41 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i43 = 0; i43 < childCount2; i43++) {
                View childAt4 = getChildAt(i43);
                C5225k c5225k7 = (C5225k) childAt4.getLayoutParams();
                if (c5225k7.f25575f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c5225k7.f25571b * i31) + c5225k7.f25572c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i13 : i29);
    }

    public void setExpandedActionViewsExclusive(boolean z6) {
        this.f1755v.f25529r = z6;
    }

    public void setOnMenuItemClickListener(InterfaceC5226l interfaceC5226l) {
        this.f1751C = interfaceC5226l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C5223i c5223i = this.f1755v;
        C5222h c5222h = c5223i.f25521h;
        if (c5222h != null) {
            c5222h.setImageDrawable(drawable);
        } else {
            c5223i.f25523k = true;
            c5223i.f25522j = drawable;
        }
    }

    public void setPopupTheme(int i10) {
        if (this.f1754t != i10) {
            this.f1754t = i10;
            if (i10 == 0) {
                this.f1753s = getContext();
            } else {
                this.f1753s = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C5223i c5223i) {
        this.f1755v = c5223i;
        c5223i.f25520g = this;
        this.f1752r = c5223i.f25516c;
    }

    @Override // p013o.b1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5225k(getContext(), attributeSet);
    }

    public void setOverflowReserved(boolean z6) {
    }
}
