package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.MediaError;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.perf.util.Constants;
import p001o.bkh;
import p001o.cbc;
import p001o.ebe;
import p001o.fy5;
import p001o.gh0;
import p001o.gua;
import p001o.gza;
import p001o.iae;
import p001o.km5;
import p001o.l5g;
import p001o.n8e;
import p001o.o46;
import p001o.pae;
import p001o.pza;
import p001o.qg3;
import p001o.qxi;
import p001o.r9j;
import p001o.s6c;
import p001o.umb;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.yya;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int B0 = pae.Widget_Design_CollapsingToolbar;
    public int A0;

    /* renamed from: H */
    public final qg3 f11989H;

    /* renamed from: L */
    public final o46 f11990L;

    /* renamed from: M */
    public boolean f11991M;

    /* renamed from: Q */
    public boolean f11992Q;

    /* renamed from: a */
    public boolean f11993a;

    /* renamed from: b */
    public int f11994b;

    /* renamed from: c */
    public ViewGroup f11995c;

    /* renamed from: d */
    public View f11996d;

    /* renamed from: e */
    public View f11997e;

    /* renamed from: f */
    public int f11998f;

    /* renamed from: g */
    public int f11999g;

    /* renamed from: h */
    public int f12000h;
    public Drawable h0;
    public Drawable i0;
    public int j0;
    public boolean k0;
    public ValueAnimator l0;
    public long m0;
    public final TimeInterpolator n0;
    public final TimeInterpolator o0;
    public int p0;

    /* renamed from: q */
    public int f12001q;
    public AppBarLayout.InterfaceC10929e q0;
    public int r0;

    /* renamed from: s */
    public int f12002s;
    public int s0;
    public int t0;
    public r9j u0;
    public int v0;
    public boolean w0;

    /* renamed from: x */
    public final Rect f12003x;
    public int x0;

    /* renamed from: y */
    public final qg3 f12004y;
    public int y0;
    public boolean z0;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C10930a implements cbc {
        public C10930a() {
        }

        @Override // p001o.cbc
        /* renamed from: a */
        public r9j mo3830a(View view, r9j r9jVar) {
            return CollapsingToolbarLayout.this.m13904p(r9jVar);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public class C10931b implements ValueAnimator.AnimatorUpdateListener {
        public C10931b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public class C10932c implements AppBarLayout.InterfaceC10929e {
        public C10932c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC10926b
        /* renamed from: a */
        public void mo13886a(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.r0 = i;
            r9j r9jVar = collapsingToolbarLayout.u0;
            int iM46397l = r9jVar != null ? r9jVar.m46397l() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                qxi qxiVarM13892l = CollapsingToolbarLayout.m13892l(childAt);
                int i3 = layoutParams.f12005a;
                if (i3 == 1) {
                    qxiVarM13892l.m45974f(pza.m44556b(-i, 0, CollapsingToolbarLayout.this.m13901i(childAt)));
                } else if (i3 == 2) {
                    qxiVarM13892l.m45974f(Math.round((-i) * layoutParams.f12006b));
                }
            }
            CollapsingToolbarLayout.this.m13910v();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.i0 != null && iM46397l > 0) {
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - CollapsingToolbarLayout.this.getMinimumHeight()) - iM46397l;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            int i4 = CollapsingToolbarLayout.this.r0 + minimumHeight;
            float f = minimumHeight;
            float fAbs = Math.abs(i) / f;
            float f2 = scrimVisibleHeightTrigger / f;
            CollapsingToolbarLayout.this.f12004y.E0(Math.min(1.0f, f2));
            CollapsingToolbarLayout.this.f12004y.p0(i4);
            CollapsingToolbarLayout.this.f12004y.C0(fAbs);
            CollapsingToolbarLayout.this.f11989H.E0(Math.min(1.0f, f2));
            CollapsingToolbarLayout.this.f11989H.p0(i4);
            CollapsingToolbarLayout.this.f11989H.C0(fAbs);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    public interface InterfaceC10933d extends l5g {
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() throws Resources.NotFoundException {
        ColorStateList colorStateListM29508g = gua.m29508g(getContext(), x5e.colorSurfaceContainer);
        if (colorStateListM29508g != null) {
            return colorStateListM29508g.getDefaultColor();
        }
        return this.f11990L.m41515d(getResources().getDimension(x6e.design_appbar_elevation));
    }

    /* renamed from: h */
    public static int m13889h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: j */
    public static CharSequence m13890j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    /* renamed from: k */
    public static CharSequence m13891k(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    /* renamed from: l */
    public static qxi m13892l(View view) {
        qxi qxiVar = (qxi) view.getTag(n8e.view_offset_helper);
        if (qxiVar != null) {
            return qxiVar;
        }
        qxi qxiVar2 = new qxi(view);
        view.setTag(n8e.view_offset_helper, qxiVar2);
        return qxiVar2;
    }

    /* renamed from: n */
    public static boolean m13893n(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    /* renamed from: a */
    public final void m13894a(int i) {
        m13897d();
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.l0 = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.j0 ? this.n0 : this.o0);
            this.l0.addUpdateListener(new C10931b());
        } else if (valueAnimator.isRunning()) {
            this.l0.cancel();
        }
        this.l0.setDuration(this.m0);
        this.l0.setIntValues(this.j0, i);
        this.l0.start();
    }

    /* renamed from: b */
    public final TextUtils.TruncateAt m13895b(int i) {
        return i != 0 ? i != 1 ? i != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    /* renamed from: c */
    public final void m13896c(AppBarLayout appBarLayout) {
        if (m13902m()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void m13897d() {
        if (this.f11993a) {
            ViewGroup viewGroup = null;
            this.f11995c = null;
            this.f11996d = null;
            int i = this.f11994b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.f11995c = viewGroup2;
                if (viewGroup2 != null) {
                    this.f11996d = m13898e(viewGroup2);
                }
            }
            if (this.f11995c == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (m13893n(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.f11995c = viewGroup;
            }
            m13909u();
            this.f11993a = false;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m13897d();
        if (this.f11995c == null && (drawable = this.h0) != null && this.j0 > 0) {
            drawable.mutate().setAlpha(this.j0);
            this.h0.draw(canvas);
        }
        if (this.f11991M && this.f11992Q) {
            if (this.f11995c == null || this.h0 == null || this.j0 <= 0 || !m13902m() || this.f12004y.m45383H() >= this.f12004y.m45384I()) {
                this.f12004y.m45409k(canvas);
                this.f11989H.m45409k(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.h0.getBounds(), Region.Op.DIFFERENCE);
                this.f12004y.m45409k(canvas);
                this.f11989H.m45409k(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.i0 == null || this.j0 <= 0) {
            return;
        }
        r9j r9jVar = this.u0;
        int iM46397l = r9jVar != null ? r9jVar.m46397l() : 0;
        if (iM46397l > 0) {
            this.i0.setBounds(0, -this.r0, getWidth(), iM46397l - this.r0);
            this.i0.mutate().setAlpha(this.j0);
            this.i0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.h0 == null || this.j0 <= 0 || !m13903o(view)) {
            z = false;
        } else {
            m13908t(this.h0, view, getWidth(), getHeight());
            this.h0.mutate().setAlpha(this.j0);
            this.h0.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i0;
        boolean zL0 = false;
        if (drawable != null && drawable.isStateful()) {
            zL0 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.h0;
        if (drawable2 != null && drawable2.isStateful()) {
            zL0 |= drawable2.setState(drawableState);
        }
        qg3 qg3Var = this.f12004y;
        if (qg3Var != null) {
            zL0 |= qg3Var.L0(drawableState);
        }
        if (zL0) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final View m13898e(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public float getCollapsedSubtitleTextSize() {
        return this.f11989H.m45419u();
    }

    public Typeface getCollapsedSubtitleTypeface() {
        return this.f11989H.m45420v();
    }

    public int getCollapsedTitleGravity() {
        return this.f12004y.m45415q();
    }

    public float getCollapsedTitleTextSize() {
        return this.f12004y.m45419u();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f12004y.m45420v();
    }

    public Drawable getContentScrim() {
        return this.h0;
    }

    public float getExpandedSubtitleTextSize() {
        return this.f11989H.m45381F();
    }

    public Typeface getExpandedSubtitleTypeface() {
        return this.f11989H.m45382G();
    }

    public int getExpandedTitleGravity() {
        return this.f12004y.m45378C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f12001q;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f12000h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f11998f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f11999g;
    }

    public int getExpandedTitleSpacing() {
        return this.f12002s;
    }

    public float getExpandedTitleTextSize() {
        return this.f12004y.m45381F();
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f12004y.m45382G();
    }

    public int getHyphenationFrequency() {
        return this.f12004y.m45385J();
    }

    public int getLineCount() {
        return this.f12004y.m45386K();
    }

    public float getLineSpacingAdd() {
        return this.f12004y.m45387L();
    }

    public float getLineSpacingMultiplier() {
        return this.f12004y.m45388M();
    }

    public int getMaxLines() {
        return this.f12004y.m45376A();
    }

    public int getScrimAlpha() {
        return this.j0;
    }

    public long getScrimAnimationDuration() {
        return this.m0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.p0;
        if (i >= 0) {
            return i + this.v0 + this.x0 + this.y0 + this.A0;
        }
        r9j r9jVar = this.u0;
        int iM46397l = r9jVar != null ? r9jVar.m46397l() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iM46397l, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.i0;
    }

    public CharSequence getSubtitle() {
        if (this.f11991M) {
            return this.f11989H.m45391P();
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.f11991M) {
            return this.f12004y.m45391P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.t0;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f12004y.m45390O();
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f12004y.m45394S();
    }

    /* renamed from: i */
    public final int m13901i(View view) {
        return ((getHeight() - m13892l(view).m45970b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: m */
    public final boolean m13902m() {
        return this.t0 == 1;
    }

    /* renamed from: o */
    public final boolean m13903o(View view) {
        View view2 = this.f11996d;
        if (view2 == null || view2 == this) {
            if (view == this.f11995c) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m13896c(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.q0 == null) {
                this.q0 = new C10932c();
            }
            appBarLayout.m13835d(this.q0);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12004y.m45399Z(configuration);
        if (this.s0 != configuration.orientation && this.z0 && this.f12004y.m45383H() == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.s0 = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC10929e interfaceC10929e = this.q0;
        if (interfaceC10929e != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m13854y(interfaceC10929e);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        r9j r9jVar = this.u0;
        if (r9jVar != null) {
            int iM46397l = r9jVar.m46397l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iM46397l) {
                    wvi.m55111X(childAt, iM46397l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m13892l(getChildAt(i6)).m45972d();
        }
        m13911w(i, i2, i3, i4, false);
        m13912x();
        m13910v();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m13892l(getChildAt(i7)).m45969a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m13897d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        r9j r9jVar = this.u0;
        int iM46397l = r9jVar != null ? r9jVar.m46397l() : 0;
        if ((mode == 0 || this.w0) && iM46397l > 0) {
            this.v0 = iM46397l;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iM46397l, 1073741824));
        }
        m13912x();
        if (this.f11991M && !TextUtils.isEmpty(this.f12004y.m45391P())) {
            int measuredHeight = getMeasuredHeight();
            m13911w(0, 0, getMeasuredWidth(), measuredHeight, true);
            int iM45377B = (int) (this.v0 + this.f11999g + this.f12004y.m45377B() + (TextUtils.isEmpty(this.f11989H.m45391P()) ? 0.0f : this.f12002s + this.f11989H.m45377B()) + this.f12001q);
            if (iM45377B > measuredHeight) {
                this.A0 = iM45377B - measuredHeight;
            } else {
                this.A0 = 0;
            }
            if (this.z0) {
                if (this.f12004y.m45376A() > 1) {
                    int iM45424z = this.f12004y.m45424z();
                    if (iM45424z > 1) {
                        this.x0 = Math.round(this.f12004y.m45377B()) * (iM45424z - 1);
                    } else {
                        this.x0 = 0;
                    }
                }
                if (this.f11989H.m45376A() > 1) {
                    int iM45424z2 = this.f11989H.m45424z();
                    if (iM45424z2 > 1) {
                        this.y0 = Math.round(this.f11989H.m45377B()) * (iM45424z2 - 1);
                    } else {
                        this.y0 = 0;
                    }
                }
            }
            int i3 = this.A0;
            int i4 = this.x0;
            int i5 = this.y0;
            if (i3 + i4 + i5 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight + i3 + i4 + i5, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f11995c;
        if (viewGroup != null) {
            View view = this.f11996d;
            if (view == null || view == this) {
                setMinimumHeight(m13889h(viewGroup));
            } else {
                setMinimumHeight(m13889h(view));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.h0;
        if (drawable != null) {
            m13907s(drawable, i, i2);
        }
    }

    /* renamed from: p */
    public r9j m13904p(r9j r9jVar) {
        r9j r9jVar2 = getFitsSystemWindows() ? r9jVar : null;
        if (!s6c.m47909a(this.u0, r9jVar2)) {
            this.u0 = r9jVar2;
            requestLayout();
        }
        return r9jVar.m46388c();
    }

    /* renamed from: q */
    public final void m13905q(boolean z) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f11996d;
        if (view == null) {
            view = this.f11995c;
        }
        int iM13901i = m13901i(view);
        km5.m35901a(this, this.f11997e, this.f12003x);
        ViewGroup viewGroup = this.f11995c;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        Rect rect = this.f12003x;
        int i = rect.left + (z ? titleMarginEnd : titleMarginStart);
        int i2 = rect.right;
        if (!z) {
            titleMarginStart = titleMarginEnd;
        }
        int i3 = i2 - titleMarginStart;
        int i4 = rect.top + iM13901i + titleMarginTop;
        int i5 = (rect.bottom + iM13901i) - titleMarginBottom;
        if (TextUtils.isEmpty(this.f11989H.m45391P())) {
            this.f12004y.f0(i, i4, i3, i5);
        } else {
            this.f12004y.f0(i, i4, i3, (int) (i5 - this.f11989H.m45411m()));
            this.f11989H.f0(i, (int) (i4 + this.f12004y.m45411m()), i3, i5);
        }
    }

    /* renamed from: r */
    public final void m13906r() {
        setContentDescription(getTitle());
    }

    /* renamed from: s */
    public final void m13907s(Drawable drawable, int i, int i2) {
        m13908t(drawable, this.f11995c, i, i2);
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.f11989H.i0(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        this.f11989H.m0(f);
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        this.f11989H.n0(typeface);
    }

    public void setCollapsedTitleGravity(int i) {
        this.f12004y.l0(i);
        this.f11989H.l0(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f12004y.i0(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        this.f12004y.m0(f);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f12004y.n0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.h0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.h0 = drawableMutate;
            if (drawableMutate != null) {
                m13907s(drawableMutate, getWidth(), getHeight());
                this.h0.setCallback(this);
                this.h0.setAlpha(this.j0);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.f11989H.v0(i);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        this.f11989H.x0(colorStateList);
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.f11989H.z0(f);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        this.f11989H.A0(typeface);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f12004y.y0(i);
        this.f11989H.y0(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f11998f = i;
        this.f11999g = i2;
        this.f12000h = i3;
        this.f12001q = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f12001q = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f12000h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f11998f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f11999g = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.f12002s = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f12004y.v0(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f12004y.x0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f) {
        this.f12004y.z0(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f12004y.A0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.z0 = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.w0 = z;
    }

    public void setHyphenationFrequency(int i) {
        this.f12004y.F0(i);
    }

    public void setLineSpacingAdd(float f) {
        this.f12004y.H0(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.f12004y.I0(f);
    }

    public void setMaxLines(int i) {
        this.f12004y.u0(i);
        this.f11989H.u0(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f12004y.K0(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.j0) {
            if (this.h0 != null && (viewGroup = this.f11995c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.j0 = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.m0 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.p0 != i) {
            this.p0 = i;
            m13910v();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, isLaidOut() && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(InterfaceC10933d interfaceC10933d) {
        this.f12004y.M0(interfaceC10933d);
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.i0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.i0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.i0.setState(getDrawableState());
                }
                fy5.m27739m(this.i0, getLayoutDirection());
                this.i0.setVisible(getVisibility() == 0, false);
                this.i0.setCallback(this);
                this.i0.setAlpha(this.j0);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f11989H.N0(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f12004y.N0(charSequence);
        m13906r();
    }

    public void setTitleCollapseMode(int i) {
        this.t0 = i;
        boolean zM13902m = m13902m();
        this.f12004y.D0(zM13902m);
        this.f11989H.D0(zM13902m);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m13896c((AppBarLayout) parent);
        }
        if (zM13902m && this.h0 == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.f12004y.P0(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f11991M) {
            this.f11991M = z;
            m13906r();
            m13909u();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.f12004y.J0(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.i0;
        if (drawable != null && drawable.isVisible() != z) {
            this.i0.setVisible(z, false);
        }
        Drawable drawable2 = this.h0;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.h0.setVisible(z, false);
    }

    /* renamed from: t */
    public final void m13908t(Drawable drawable, View view, int i, int i2) {
        if (m13902m() && view != null && this.f11991M) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: u */
    public final void m13909u() {
        View view;
        if (!this.f11991M && (view = this.f11997e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f11997e);
            }
        }
        if (!this.f11991M || this.f11995c == null) {
            return;
        }
        if (this.f11997e == null) {
            this.f11997e = new View(getContext());
        }
        if (this.f11997e.getParent() == null) {
            this.f11995c.addView(this.f11997e, -1, -1);
        }
    }

    /* renamed from: v */
    public final void m13910v() {
        if (this.h0 == null && this.i0 == null) {
            return;
        }
        setScrimsShown(getHeight() + this.r0 < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.h0 || drawable == this.i0;
    }

    /* renamed from: w */
    public final void m13911w(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.f11991M || (view = this.f11997e) == null) {
            return;
        }
        boolean z2 = view.isAttachedToWindow() && this.f11997e.getVisibility() == 0;
        this.f11992Q = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            m13905q(z3);
            int i5 = z3 ? this.f12000h : this.f11998f;
            int i6 = this.f12003x.top + this.f11999g;
            int i7 = (i3 - i) - (z3 ? this.f11998f : this.f12000h);
            int i8 = (i4 - i2) - this.f12001q;
            if (TextUtils.isEmpty(this.f11989H.m45391P())) {
                this.f12004y.q0(i5, i6, i7, i8);
                this.f12004y.c0(z);
                return;
            }
            int i9 = i5;
            this.f12004y.r0(i9, i6, i7, (int) ((i8 - (this.f11989H.m45377B() + this.y0)) - this.f12002s), false);
            this.f11989H.r0(i9, (int) (i6 + this.f12004y.m45377B() + this.x0 + this.f12002s), i7, i8, false);
            this.f12004y.c0(z);
            this.f11989H.c0(z);
        }
    }

    /* renamed from: x */
    public final void m13912x() {
        ViewGroup viewGroup = this.f11995c;
        if (viewGroup == null || !this.f11991M) {
            return;
        }
        CharSequence charSequenceM13891k = m13891k(viewGroup);
        if (TextUtils.isEmpty(this.f12004y.m45391P()) && !TextUtils.isEmpty(charSequenceM13891k)) {
            setTitle(charSequenceM13891k);
        }
        CharSequence charSequenceM13890j = m13890j(this.f11995c);
        if (!TextUtils.isEmpty(this.f11989H.m45391P()) || TextUtils.isEmpty(charSequenceM13890j)) {
            return;
        }
        setSubtitle(charSequenceM13890j);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.f11989H.k0(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f12004y.k0(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.k0 != z) {
            int i = Constants.MAX_HOST_LENGTH;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m13894a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.k0 = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = B0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f11993a = true;
        this.f12003x = new Rect();
        this.p0 = -1;
        this.v0 = 0;
        this.x0 = 0;
        this.y0 = 0;
        this.A0 = 0;
        Context context2 = getContext();
        this.s0 = getResources().getConfiguration().orientation;
        qg3 qg3Var = new qg3(this);
        this.f12004y = qg3Var;
        TimeInterpolator timeInterpolator = gh0.f25150e;
        qg3Var.O0(timeInterpolator);
        qg3Var.K0(false);
        this.f11990L = new o46(context2);
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.CollapsingToolbarLayout, i, i2, new int[0]);
        int i3 = typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        int i4 = typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_collapsedTitleGravity, 8388627);
        qg3Var.y0(i3);
        qg3Var.l0(i4);
        int dimensionPixelSize = typedArrayM19305i.getDimensionPixelSize(ebe.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f12001q = dimensionPixelSize;
        this.f12000h = dimensionPixelSize;
        this.f11999g = dimensionPixelSize;
        this.f11998f = dimensionPixelSize;
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f11998f = typedArrayM19305i.getDimensionPixelSize(ebe.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f12000h = typedArrayM19305i.getDimensionPixelSize(ebe.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f11999g = typedArrayM19305i.getDimensionPixelSize(ebe.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f12001q = typedArrayM19305i.getDimensionPixelSize(ebe.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedTitleSpacing)) {
            this.f12002s = typedArrayM19305i.getDimensionPixelSize(ebe.CollapsingToolbarLayout_expandedTitleSpacing, 0);
        }
        this.f11991M = typedArrayM19305i.getBoolean(ebe.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayM19305i.getText(ebe.CollapsingToolbarLayout_title));
        qg3Var.v0(pae.TextAppearance_Design_CollapsingToolbar_Expanded);
        qg3Var.i0(iae.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            qg3Var.v0(typedArrayM19305i.getResourceId(ebe.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            qg3Var.i0(typedArrayM19305i.getResourceId(ebe.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(m13895b(typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedTitleTextColor)) {
            qg3Var.x0(yya.m58494a(context2, typedArrayM19305i, ebe.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            qg3Var.k0(yya.m58494a(context2, typedArrayM19305i, ebe.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.p0 = typedArrayM19305i.getDimensionPixelSize(ebe.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_titleMaxLines)) {
            qg3Var.u0(typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_titleMaxLines, 1));
        } else if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_maxLines)) {
            qg3Var.u0(typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_titlePositionInterpolator)) {
            qg3Var.J0(AnimationUtils.loadInterpolator(context2, typedArrayM19305i.getResourceId(ebe.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        qg3 qg3Var2 = new qg3(this);
        this.f11989H = qg3Var2;
        qg3Var2.O0(timeInterpolator);
        qg3Var2.K0(false);
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_subtitle)) {
            setSubtitle(typedArrayM19305i.getText(ebe.CollapsingToolbarLayout_subtitle));
        }
        qg3Var2.y0(i3);
        qg3Var2.l0(i4);
        qg3Var2.v0(iae.TextAppearance_AppCompat_Headline);
        qg3Var2.i0(iae.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedSubtitleTextAppearance)) {
            qg3Var2.v0(typedArrayM19305i.getResourceId(ebe.CollapsingToolbarLayout_expandedSubtitleTextAppearance, 0));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_collapsedSubtitleTextAppearance)) {
            qg3Var2.i0(typedArrayM19305i.getResourceId(ebe.CollapsingToolbarLayout_collapsedSubtitleTextAppearance, 0));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_expandedSubtitleTextColor)) {
            qg3Var2.x0(yya.m58494a(context2, typedArrayM19305i, ebe.CollapsingToolbarLayout_expandedSubtitleTextColor));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_collapsedSubtitleTextColor)) {
            qg3Var2.k0(yya.m58494a(context2, typedArrayM19305i, ebe.CollapsingToolbarLayout_collapsedSubtitleTextColor));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_subtitleMaxLines)) {
            qg3Var2.u0(typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_subtitleMaxLines, 1));
        }
        if (typedArrayM19305i.hasValue(ebe.CollapsingToolbarLayout_titlePositionInterpolator)) {
            qg3Var2.J0(AnimationUtils.loadInterpolator(context2, typedArrayM19305i.getResourceId(ebe.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.m0 = typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_scrimAnimationDuration, MediaError.DetailedErrorCode.TEXT_UNKNOWN);
        this.n0 = umb.m51786g(context2, x5e.motionEasingStandardInterpolator, gh0.f25148c);
        this.o0 = umb.m51786g(context2, x5e.motionEasingStandardInterpolator, gh0.f25149d);
        setContentScrim(typedArrayM19305i.getDrawable(ebe.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayM19305i.getDrawable(ebe.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayM19305i.getInt(ebe.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f11994b = typedArrayM19305i.getResourceId(ebe.CollapsingToolbarLayout_toolbarId, -1);
        this.w0 = typedArrayM19305i.getBoolean(ebe.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.z0 = typedArrayM19305i.getBoolean(ebe.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayM19305i.recycle();
        setWillNotDraw(false);
        wvi.x0(this, new C10930a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f12005a;

        /* renamed from: b */
        public float f12006b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12005a = 0;
            this.f12006b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.CollapsingToolbarLayout_Layout);
            this.f12005a = typedArrayObtainStyledAttributes.getInt(ebe.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            m13913a(typedArrayObtainStyledAttributes.getFloat(ebe.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m13913a(float f) {
            this.f12006b = f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f12005a = 0;
            this.f12006b = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12005a = 0;
            this.f12006b = 0.5f;
        }
    }
}
