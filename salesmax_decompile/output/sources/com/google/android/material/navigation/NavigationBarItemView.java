package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1794g;
import com.google.android.material.badge.AbstractC10937b;
import com.google.android.material.badge.C10936a;
import com.google.android.material.internal.BaselineLayout;
import p001o.b9e;
import p001o.cc;
import p001o.fy5;
import p001o.gh0;
import p001o.gjh;
import p001o.gue;
import p001o.jsh;
import p001o.ksb;
import p001o.n8e;
import p001o.u7e;
import p001o.umb;
import p001o.v9e;
import p001o.x5e;
import p001o.x6e;
import p001o.yya;

/* loaded from: classes3.dex */
public abstract class NavigationBarItemView extends FrameLayout implements ksb {
    public static final int[] X0 = {R.attr.state_checked};
    public static final C11073c Y0;
    public static final C11073c Z0;
    public ColorStateList A0;
    public Drawable B0;
    public Drawable C0;
    public ValueAnimator D0;
    public C11073c E0;
    public float F0;
    public boolean G0;

    /* renamed from: H */
    public float f12714H;
    public int H0;
    public int I0;
    public int J0;
    public int K0;

    /* renamed from: L */
    public int f12715L;
    public boolean L0;

    /* renamed from: M */
    public boolean f12716M;
    public int M0;
    public int N0;
    public C10936a O0;
    public int P0;

    /* renamed from: Q */
    public final LinearLayout f12717Q;
    public int Q0;
    public int R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public Rect W0;

    /* renamed from: a */
    public boolean f12718a;

    /* renamed from: b */
    public ColorStateList f12719b;

    /* renamed from: c */
    public Drawable f12720c;

    /* renamed from: d */
    public int f12721d;

    /* renamed from: e */
    public int f12722e;

    /* renamed from: f */
    public int f12723f;

    /* renamed from: g */
    public int f12724g;

    /* renamed from: h */
    public float f12725h;
    public final LinearLayout h0;
    public final View i0;
    public final FrameLayout j0;
    public final ImageView k0;
    public final BaselineLayout l0;
    public final TextView m0;
    public final TextView n0;
    public BaselineLayout o0;
    public TextView p0;

    /* renamed from: q */
    public float f12726q;
    public TextView q0;
    public BaselineLayout r0;

    /* renamed from: s */
    public float f12727s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;

    /* renamed from: x */
    public float f12728x;
    public ColorStateList x0;

    /* renamed from: y */
    public float f12729y;
    public boolean y0;
    public C1794g z0;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    public class RunnableC11071a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f12730a;

        public RunnableC11071a(int i) {
            this.f12730a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.m14786B(this.f12730a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$b */
    public class C11072b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f12732a;

        public C11072b(float f) {
            this.f12732a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.m14803q(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f12732a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$c */
    public static class C11073c {
        public C11073c() {
        }

        public /* synthetic */ C11073c(RunnableC11071a runnableC11071a) {
            this();
        }

        /* renamed from: a */
        public float m14810a(float f, float f2) {
            return gh0.m28648b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f);
        }

        /* renamed from: b */
        public float m14811b(float f) {
            return gh0.m28647a(0.4f, 1.0f, f);
        }

        /* renamed from: c */
        public float mo14812c(float f) {
            return 1.0f;
        }

        /* renamed from: d */
        public void m14813d(float f, float f2, View view) {
            view.setScaleX(m14811b(f));
            view.setScaleY(mo14812c(f));
            view.setAlpha(m14810a(f, f2));
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$d */
    public static class C11074d extends C11073c {
        public C11074d() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.C11073c
        /* renamed from: c */
        public float mo14812c(float f) {
            return m14811b(f);
        }

        public /* synthetic */ C11074d(RunnableC11071a runnableC11071a) {
            this();
        }
    }

    static {
        RunnableC11071a runnableC11071a = null;
        Y0 = new C11073c(runnableC11071a);
        Z0 = new C11074d(runnableC11071a);
    }

    public NavigationBarItemView(Context context) throws Resources.NotFoundException {
        super(context);
        this.f12718a = false;
        this.s0 = -1;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = 0;
        this.w0 = 0;
        this.y0 = false;
        this.E0 = Y0;
        this.F0 = 0.0f;
        this.G0 = false;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = -2;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = 0;
        this.N0 = 0;
        this.Q0 = 0;
        this.R0 = 49;
        this.S0 = false;
        this.T0 = false;
        this.U0 = false;
        this.V0 = false;
        this.W0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f12717Q = (LinearLayout) findViewById(n8e.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(n8e.navigation_bar_item_inner_content_container);
        this.h0 = linearLayout;
        this.i0 = findViewById(n8e.navigation_bar_item_active_indicator_view);
        this.j0 = (FrameLayout) findViewById(n8e.navigation_bar_item_icon_container);
        this.k0 = (ImageView) findViewById(n8e.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(n8e.navigation_bar_item_labels_group);
        this.l0 = baselineLayout;
        TextView textView = (TextView) findViewById(n8e.navigation_bar_item_small_label_view);
        this.m0 = textView;
        TextView textView2 = (TextView) findViewById(n8e.navigation_bar_item_large_label_view);
        this.n0 = textView2;
        m14797j();
        this.r0 = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f12721d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f12722e = baselineLayout.getPaddingBottom();
        this.f12723f = 0;
        this.f12724g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.p0.setImportantForAccessibility(2);
        this.q0.setImportantForAccessibility(2);
        setFocusable(true);
        m14794f();
        this.K0 = getResources().getDimensionPixelSize(x6e.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.hsb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f27435a.m14781l(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* renamed from: H */
    public static void m14777H(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        C10936a c10936a = this.O0;
        int minimumWidth = c10936a == null ? 0 : c10936a.getMinimumWidth() - this.O0.m14056n();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j0.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.k0.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    /* renamed from: h */
    public static Drawable m14780h(ColorStateList colorStateList) {
        return new RippleDrawable(gue.m29516a(colorStateList), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m14781l(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (this.k0.getVisibility() == 0) {
            m14785A(this.k0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h0.getLayoutParams();
        int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z2 = true;
        if (this.P0 == 1 && this.J0 == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.i0.getLayoutParams();
            if (this.J0 != -2 || this.i0.getMeasuredWidth() == i9) {
                z = false;
            } else {
                layoutParams2.width = Math.max(i9, Math.min(this.H0, getMeasuredWidth() - (this.M0 * 2)));
                z = true;
            }
            if (this.i0.getMeasuredHeight() < i10) {
                layoutParams2.height = i10;
            } else {
                z2 = z;
            }
            if (z2) {
                this.i0.setLayoutParams(layoutParams2);
            }
        }
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    /* renamed from: v */
    public static void m14782v(TextView textView, int i) throws Resources.NotFoundException {
        gjh.m28914m(textView, i);
        int iM58503j = yya.m58503j(textView.getContext(), i, 0);
        if (iM58503j != 0) {
            textView.setTextSize(0, iM58503j);
        }
    }

    /* renamed from: w */
    public static void m14783w(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: x */
    public static void m14784x(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: A */
    public final void m14785A(View view) {
        if (m14796i()) {
            AbstractC10937b.m14074f(this.O0, view, null);
        }
    }

    /* renamed from: B */
    public void m14786B(int i) {
        if (i > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.H0, i - (this.M0 * 2));
            int iMax = this.I0;
            if (this.P0 == 1) {
                int measuredWidth = i - (this.N0 * 2);
                int i2 = this.J0;
                if (i2 != -1) {
                    measuredWidth = i2 == -2 ? this.f12717Q.getMeasuredWidth() : Math.min(i2, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.K0, this.h0.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i0.getLayoutParams();
            if (m14798k()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            this.i0.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: C */
    public final void m14787C() {
        if (m14798k()) {
            this.E0 = Z0;
        } else {
            this.E0 = Y0;
        }
    }

    /* renamed from: D */
    public final void m14788D() {
        TextView textView = this.n0;
        textView.setTypeface(textView.getTypeface(), this.y0 ? 1 : 0);
        TextView textView2 = this.q0;
        textView2.setTypeface(textView2.getTypeface(), this.y0 ? 1 : 0);
    }

    /* renamed from: E */
    public final void m14789E(TextView textView, int i) throws Resources.NotFoundException {
        if (textView == null) {
            return;
        }
        m14807u(textView, i);
        m14794f();
        textView.setMinimumHeight(yya.m58502i(textView.getContext(), i, 0));
        ColorStateList colorStateList = this.x0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        m14788D();
    }

    /* renamed from: F */
    public final void m14790F(TextView textView, int i) throws Resources.NotFoundException {
        if (textView == null) {
            return;
        }
        m14807u(textView, i);
        m14794f();
        textView.setMinimumHeight(yya.m58502i(textView.getContext(), i, 0));
        ColorStateList colorStateList = this.x0;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: G */
    public final void m14791G() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.Q0 = 0;
        this.r0 = this.l0;
        int i7 = 8;
        if (this.P0 == 1) {
            if (this.o0.getParent() == null) {
                m14793d();
            }
            Rect rect = this.W0;
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = rect.top;
            i = rect.bottom;
            this.Q0 = 1;
            int i11 = this.N0;
            this.r0 = this.o0;
            i5 = i10;
            i4 = i9;
            i3 = i8;
            i2 = i11;
            i6 = 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 8;
            i7 = 0;
        }
        this.l0.setVisibility(i7);
        this.o0.setVisibility(i6);
        ((FrameLayout.LayoutParams) this.f12717Q.getLayoutParams()).gravity = this.R0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h0.getLayoutParams();
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i5;
        layoutParams.bottomMargin = i;
        setPadding(i2, 0, i2, 0);
        m14786B(getWidth());
    }

    /* renamed from: I */
    public final void m14792I() {
        C1794g c1794g = this.z0;
        if (c1794g != null) {
            setVisibility((!c1794g.isVisible() || (!this.S0 && this.T0)) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: c */
    public void mo3948c(C1794g c1794g, int i) {
        this.z0 = c1794g;
        setCheckable(c1794g.isCheckable());
        setChecked(c1794g.isChecked());
        setEnabled(c1794g.isEnabled());
        setIcon(c1794g.getIcon());
        setTitle(c1794g.getTitle());
        setId(c1794g.getItemId());
        if (!TextUtils.isEmpty(c1794g.getContentDescription())) {
            setContentDescription(c1794g.getContentDescription());
        }
        jsh.m34483a(this, !TextUtils.isEmpty(c1794g.getTooltipText()) ? c1794g.getTooltipText() : c1794g.getTitle());
        m14792I();
        this.f12718a = true;
    }

    /* renamed from: d */
    public final void m14793d() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.h0.addView(this.o0, layoutParams);
        m14804r();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.G0) {
            this.j0.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    /* renamed from: e */
    public boolean mo3949e() {
        return false;
    }

    /* renamed from: f */
    public final void m14794f() {
        float textSize = this.m0.getTextSize();
        float textSize2 = this.n0.getTextSize();
        this.f12725h = textSize - textSize2;
        this.f12726q = (textSize2 * 1.0f) / textSize;
        this.f12727s = (textSize * 1.0f) / textSize2;
        float textSize3 = this.p0.getTextSize();
        float textSize4 = this.q0.getTextSize();
        this.f12728x = textSize3 - textSize4;
        this.f12729y = (textSize4 * 1.0f) / textSize3;
        this.f12714H = (textSize3 * 1.0f) / textSize4;
    }

    /* renamed from: g */
    public void m14795g() {
        m14802p();
        this.z0 = null;
        this.F0 = 0.0f;
        this.f12718a = false;
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.i0.getBackground();
    }

    public C10936a getBadge() {
        return this.O0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.o0;
    }

    public int getItemBackgroundResId() {
        return u7e.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1797j.a
    public C1794g getItemData() {
        return this.z0;
    }

    public int getItemDefaultMarginResId() {
        return x6e.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.s0;
    }

    public BaselineLayout getLabelGroup() {
        return this.l0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f12717Q.getLayoutParams();
        return this.f12717Q.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.P0 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h0.getLayoutParams();
            return this.h0.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.l0.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.l0.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    /* renamed from: i */
    public final boolean m14796i() {
        return this.O0 != null;
    }

    /* renamed from: j */
    public final void m14797j() throws Resources.NotFoundException {
        float dimension = getResources().getDimension(x6e.default_navigation_text_size);
        float dimension2 = getResources().getDimension(x6e.default_navigation_active_text_size);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.o0 = baselineLayout;
        baselineLayout.setVisibility(8);
        this.o0.setDuplicateParentStateEnabled(true);
        this.o0.setMeasurePaddingFromBaseline(this.U0);
        TextView textView = new TextView(getContext());
        this.p0 = textView;
        textView.setMaxLines(1);
        this.p0.setEllipsize(TextUtils.TruncateAt.END);
        this.p0.setDuplicateParentStateEnabled(true);
        this.p0.setIncludeFontPadding(false);
        this.p0.setGravity(16);
        this.p0.setTextSize(dimension);
        TextView textView2 = new TextView(getContext());
        this.q0 = textView2;
        textView2.setMaxLines(1);
        this.q0.setEllipsize(TextUtils.TruncateAt.END);
        this.q0.setDuplicateParentStateEnabled(true);
        this.q0.setVisibility(4);
        this.q0.setIncludeFontPadding(false);
        this.q0.setGravity(16);
        this.q0.setTextSize(dimension2);
        this.o0.addView(this.p0);
        this.o0.addView(this.q0);
    }

    /* renamed from: k */
    public final boolean m14798k() {
        return this.L0 && this.f12715L == 2;
    }

    /* renamed from: m */
    public final void m14799m(float f) {
        if (!this.G0 || !this.f12718a || !isAttachedToWindow()) {
            m14803q(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.D0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.D0 = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.F0, f);
        this.D0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new C11072b(f));
        this.D0.setInterpolator(umb.m51786g(getContext(), x5e.motionEasingEmphasizedInterpolator, gh0.f25147b));
        this.D0.setDuration(umb.m51785f(getContext(), x5e.motionDurationLong2, getResources().getInteger(b9e.material_motion_duration_long_1)));
        this.D0.start();
    }

    /* renamed from: n */
    public final void m14800n() {
        C1794g c1794g = this.z0;
        if (c1794g != null) {
            setChecked(c1794g.isChecked());
        }
    }

    /* renamed from: o */
    public final void m14801o() {
        Drawable drawableM14780h = this.f12720c;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.f12719b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.G0 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(gue.m29519d(this.f12719b), null, activeIndicatorDrawable);
                z = false;
            } else if (drawableM14780h == null) {
                drawableM14780h = m14780h(this.f12719b);
            }
        }
        this.j0.setPadding(0, 0, 0, 0);
        this.j0.setForeground(rippleDrawable);
        setBackground(drawableM14780h);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1794g c1794g = this.z0;
        if (c1794g != null && c1794g.isCheckable() && this.z0.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, X0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C10936a c10936a = this.O0;
        if (c10936a != null && c10936a.isVisible()) {
            CharSequence title = this.z0.getTitle();
            if (!TextUtils.isEmpty(this.z0.getContentDescription())) {
                title = this.z0.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.O0.m14053k()));
        }
        cc ccVarD1 = cc.d1(accessibilityNodeInfo);
        ccVarD1.r0(cc.C12629f.m20832a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            ccVarD1.p0(false);
            ccVarD1.f0(cc.C12624a.f17797i);
        }
        ccVarD1.N0(getResources().getString(v9e.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new RunnableC11071a(i));
    }

    /* renamed from: p */
    public void m14802p() {
        m14809z(this.k0);
    }

    /* renamed from: q */
    public final void m14803q(float f, float f2) {
        this.E0.m14813d(f, f2, this.i0);
        this.F0 = f;
    }

    /* renamed from: r */
    public final void m14804r() {
        int i = this.k0.getLayoutParams().width > 0 ? this.f12724g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.o0.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    /* renamed from: s */
    public final void m14805s(View view, View view2, float f, float f2) {
        m14783w(this.f12717Q, this.P0 == 0 ? (int) (this.f12721d + f2) : 0, 0, this.R0);
        LinearLayout linearLayout = this.h0;
        int i = this.P0;
        m14783w(linearLayout, i == 0 ? 0 : this.W0.top, i == 0 ? 0 : this.W0.bottom, i == 0 ? 17 : 8388627);
        m14777H(this.l0, this.f12722e);
        this.r0.setVisibility(0);
        m14784x(view, 1.0f, 1.0f, 0);
        m14784x(view2, f, f, 4);
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.i0.setBackground(drawable);
        m14801o();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.G0 = z;
        m14801o();
        this.i0.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.K0 = i;
        m14786B(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.N0 = i;
        if (this.P0 == 1) {
            setPadding(i, 0, i, 0);
        }
        m14786B(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.W0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.J0 = i;
        m14786B(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.I0 = i;
        m14786B(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f12723f != i) {
            this.f12723f = i;
            ((LinearLayout.LayoutParams) this.l0.getLayoutParams()).topMargin = i;
            if (this.o0.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.o0.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.M0 = i;
        m14786B(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.L0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.H0 = i;
        m14786B(getWidth());
    }

    public void setBadge(C10936a c10936a) {
        if (this.O0 == c10936a) {
            return;
        }
        if (m14796i() && this.k0 != null) {
            m14809z(this.k0);
        }
        this.O0 = c10936a;
        c10936a.m14039R(this.Q0);
        ImageView imageView = this.k0;
        if (imageView != null) {
            m14808y(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        setLabelPivots(this.n0);
        setLabelPivots(this.m0);
        setLabelPivots(this.q0);
        setLabelPivots(this.p0);
        m14799m(z ? 1.0f : 0.0f);
        TextView textView = this.n0;
        TextView textView2 = this.m0;
        float f = this.f12725h;
        float f2 = this.f12726q;
        float f3 = this.f12727s;
        if (this.P0 == 1) {
            textView = this.q0;
            textView2 = this.p0;
            f = this.f12728x;
            f2 = this.f12729y;
            f3 = this.f12714H;
        }
        int i = this.f12715L;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m14806t();
                    }
                } else if (z) {
                    m14805s(textView, textView2, f2, f);
                } else {
                    m14805s(textView2, textView, f3, 0.0f);
                }
            } else if (z) {
                m14805s(textView, textView2, f2, 0.0f);
            } else {
                m14806t();
            }
        } else if (this.f12716M) {
            if (z) {
                m14805s(textView, textView2, f2, 0.0f);
            } else {
                m14806t();
            }
        } else if (z) {
            m14805s(textView, textView2, f2, f);
        } else {
            m14805s(textView2, textView, f3, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.m0.setEnabled(z);
        this.n0.setEnabled(z);
        this.p0.setEnabled(z);
        this.q0.setEnabled(z);
        this.k0.setEnabled(z);
    }

    @Override // p001o.ksb
    public void setExpanded(boolean z) {
        this.S0 = z;
        m14792I();
    }

    public void setHorizontalTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.v0 = i;
        TextView textView = this.q0;
        if (i == 0) {
            i = this.t0;
        }
        m14789E(textView, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.w0 = i;
        TextView textView = this.p0;
        if (i == 0) {
            i = this.u0;
        }
        m14790F(textView, i);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.B0) {
            return;
        }
        this.B0 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = fy5.m27744r(drawable).mutate();
            this.C0 = drawable;
            ColorStateList colorStateList = this.A0;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.k0.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.f12724g != i) {
            this.f12724g = i;
            m14804r();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.k0.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.k0.setLayoutParams(layoutParams);
        m14804r();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.A0 = colorStateList;
        if (this.z0 == null || (drawable = this.C0) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.C0.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemGravity(int i) {
        this.R0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        if (this.P0 != i) {
            this.P0 = i;
            m14791G();
            m14801o();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.f12722e != i) {
            this.f12722e = i;
            m14800n();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f12721d != i) {
            this.f12721d = i;
            m14800n();
        }
    }

    public void setItemPosition(int i) {
        this.s0 = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f12719b = colorStateList;
        m14801o();
    }

    public void setLabelFontScalingEnabled(boolean z) throws Resources.NotFoundException {
        this.V0 = z;
        setTextAppearanceActive(this.t0);
        setTextAppearanceInactive(this.u0);
        setHorizontalTextAppearanceActive(this.v0);
        setHorizontalTextAppearanceInactive(this.w0);
    }

    public void setLabelMaxLines(int i) {
        this.m0.setMaxLines(i);
        this.n0.setMaxLines(i);
        this.p0.setMaxLines(i);
        this.q0.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            this.m0.setGravity(17);
            this.n0.setGravity(17);
        } else if (i > 1) {
            this.m0.setEllipsize(null);
            this.n0.setEllipsize(null);
            this.m0.setGravity(17);
            this.n0.setGravity(17);
        } else {
            this.m0.setGravity(16);
            this.n0.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f12715L != i) {
            this.f12715L = i;
            m14787C();
            m14786B(getWidth());
            m14800n();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.U0 = z;
        this.l0.setMeasurePaddingFromBaseline(z);
        this.m0.setIncludeFontPadding(z);
        this.n0.setIncludeFontPadding(z);
        this.o0.setMeasurePaddingFromBaseline(z);
        this.p0.setIncludeFontPadding(z);
        this.q0.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // p001o.ksb
    public void setOnlyShowWhenExpanded(boolean z) {
        this.T0 = z;
        m14792I();
    }

    public void setShifting(boolean z) {
        if (this.f12716M != z) {
            this.f12716M = z;
            m14800n();
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.t0 = i;
        m14789E(this.n0, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) throws Resources.NotFoundException {
        this.y0 = z;
        setTextAppearanceActive(this.t0);
        setHorizontalTextAppearanceActive(this.v0);
        m14788D();
    }

    public void setTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.u0 = i;
        m14790F(this.m0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.x0 = colorStateList;
        if (colorStateList != null) {
            this.m0.setTextColor(colorStateList);
            this.n0.setTextColor(colorStateList);
            this.p0.setTextColor(colorStateList);
            this.q0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.m0.setText(charSequence);
        this.n0.setText(charSequence);
        this.p0.setText(charSequence);
        this.q0.setText(charSequence);
        C1794g c1794g = this.z0;
        if (c1794g == null || TextUtils.isEmpty(c1794g.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C1794g c1794g2 = this.z0;
        if (c1794g2 != null && !TextUtils.isEmpty(c1794g2.getTooltipText())) {
            charSequence = this.z0.getTooltipText();
        }
        jsh.m34483a(this, charSequence);
    }

    /* renamed from: t */
    public final void m14806t() {
        LinearLayout linearLayout = this.f12717Q;
        int i = this.f12721d;
        m14783w(linearLayout, i, i, this.P0 == 0 ? 17 : this.R0);
        m14783w(this.h0, 0, 0, 17);
        m14777H(this.l0, 0);
        this.r0.setVisibility(8);
    }

    /* renamed from: u */
    public final void m14807u(TextView textView, int i) throws Resources.NotFoundException {
        if (this.V0) {
            gjh.m28914m(textView, i);
        } else {
            m14782v(textView, i);
        }
    }

    /* renamed from: y */
    public final void m14808y(View view) {
        if (m14796i() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            AbstractC10937b.m14069a(this.O0, view);
        }
    }

    /* renamed from: z */
    public final void m14809z(View view) {
        if (m14796i()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                AbstractC10937b.m14073e(this.O0, view);
            }
            this.O0 = null;
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f12720c = drawable;
        m14801o();
    }
}
