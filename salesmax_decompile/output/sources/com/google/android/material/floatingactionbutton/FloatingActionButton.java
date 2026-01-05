package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C11060a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p001o.bkh;
import p001o.ebe;
import p001o.ek0;
import p001o.fgd;
import p001o.fy5;
import p001o.gza;
import p001o.ik0;
import p001o.km5;
import p001o.lo6;
import p001o.mo6;
import p001o.pae;
import p001o.rlf;
import p001o.smb;
import p001o.vkf;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.ykf;
import p001o.yuh;
import p001o.yya;

/* loaded from: classes3.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements lo6, rlf, CoordinatorLayout.InterfaceC2009b {
    public static final int i0 = pae.Widget_Design_FloatingActionButton;

    /* renamed from: H */
    public final Rect f12578H;

    /* renamed from: L */
    public final Rect f12579L;

    /* renamed from: M */
    public final ik0 f12580M;

    /* renamed from: Q */
    public final mo6 f12581Q;

    /* renamed from: b */
    public ColorStateList f12582b;

    /* renamed from: c */
    public PorterDuff.Mode f12583c;

    /* renamed from: d */
    public ColorStateList f12584d;

    /* renamed from: e */
    public PorterDuff.Mode f12585e;

    /* renamed from: f */
    public ColorStateList f12586f;

    /* renamed from: g */
    public int f12587g;

    /* renamed from: h */
    public int f12588h;
    public C11060a h0;

    /* renamed from: q */
    public int f12589q;

    /* renamed from: s */
    public int f12590s;

    /* renamed from: x */
    public int f12591x;

    /* renamed from: y */
    public boolean f12592y;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo5769f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo5769f(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo5775l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo5775l(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* renamed from: N */
        public /* bridge */ /* synthetic */ boolean mo5779p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo5779p(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: k */
        public /* bridge */ /* synthetic */ void mo5774k(CoordinatorLayout.C2012e c2012e) {
            super.mo5774k(c2012e);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C11056a implements C11060a.g {

        /* renamed from: a */
        public final /* synthetic */ AbstractC11057b f12596a;

        public C11056a(AbstractC11057b abstractC11057b) {
            this.f12596a = abstractC11057b;
        }

        @Override // com.google.android.material.floatingactionbutton.C11060a.g
        /* renamed from: a */
        public void mo14660a() {
            this.f12596a.mo14148b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C11060a.g
        /* renamed from: b */
        public void mo14661b() {
            this.f12596a.mo14147a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class AbstractC11057b {
        /* renamed from: a */
        public void mo14147a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo14148b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C11058c implements vkf {
        public C11058c() {
        }

        @Override // p001o.vkf
        /* renamed from: a */
        public void mo14662a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f12578H.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f12590s, i2 + FloatingActionButton.this.f12590s, i3 + FloatingActionButton.this.f12590s, i4 + FloatingActionButton.this.f12590s);
        }

        @Override // p001o.vkf
        /* renamed from: b */
        public void mo14663b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // p001o.vkf
        /* renamed from: c */
        public boolean mo14664c() {
            return FloatingActionButton.this.f12592y;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public class C11059d implements C11060a.f {

        /* renamed from: a */
        public final yuh f12599a;

        public C11059d(yuh yuhVar) {
            this.f12599a = yuhVar;
        }

        @Override // com.google.android.material.floatingactionbutton.C11060a.f
        /* renamed from: a */
        public void mo14665a() {
            this.f12599a.mo14143b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.C11060a.f
        /* renamed from: b */
        public void mo14666b() {
            this.f12599a.mo14142a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C11059d) && ((C11059d) obj).f12599a.equals(this.f12599a);
        }

        public int hashCode() {
            return this.f12599a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private C11060a getImpl() {
        if (this.h0 == null) {
            this.h0 = new C11060a(this, new C11058c());
        }
        return this.h0;
    }

    @Override // p001o.lo6
    /* renamed from: a */
    public boolean mo14635a() {
        return this.f12581Q.m39450c();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    /* renamed from: e */
    public void m14636e(Animator.AnimatorListener animatorListener) {
        getImpl().m14697e(animatorListener);
    }

    /* renamed from: f */
    public void m14637f(Animator.AnimatorListener animatorListener) {
        getImpl().m14698f(animatorListener);
    }

    /* renamed from: g */
    public void m14638g(yuh yuhVar) {
        getImpl().m14699g(new C11059d(yuhVar));
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f12582b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f12583c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2009b
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m14708p();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().m14711s();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().m14713u();
    }

    public Drawable getContentBackground() {
        return getImpl().m14707o();
    }

    public int getCustomSize() {
        return this.f12589q;
    }

    public int getExpandedComponentIdHint() {
        return this.f12581Q.m39449b();
    }

    public smb getHideMotionSpec() {
        return getImpl().m14710r();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f12586f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f12586f;
    }

    public ykf getShapeAppearanceModel() {
        return (ykf) fgd.m26663g(getImpl().m14714v());
    }

    public smb getShowMotionSpec() {
        return getImpl().m14715w();
    }

    public int getSize() {
        return this.f12588h;
    }

    public int getSizeDimension() {
        return m14640i(this.f12588h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f12584d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f12585e;
    }

    public boolean getUseCompatPadding() {
        return this.f12592y;
    }

    /* renamed from: h */
    public void m14639h(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m14646o(rect);
    }

    /* renamed from: i */
    public final int m14640i(int i) {
        int i2 = this.f12589q;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(x6e.design_fab_size_normal) : resources.getDimensionPixelSize(x6e.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? m14640i(1) : m14640i(0);
    }

    /* renamed from: j */
    public final void m14641j(Rect rect) {
        m14639h(rect);
        int i = -this.h0.m14716x();
        rect.inset(i, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    /* renamed from: k */
    public void m14642k(AbstractC11057b abstractC11057b) {
        m14643l(abstractC11057b, true);
    }

    /* renamed from: l */
    public void m14643l(AbstractC11057b abstractC11057b, boolean z) {
        getImpl().m14717y(m14651t(abstractC11057b), z);
    }

    /* renamed from: m */
    public boolean m14644m() {
        return getImpl().m14673B();
    }

    /* renamed from: n */
    public boolean m14645n() {
        return getImpl().m14674C();
    }

    /* renamed from: o */
    public final void m14646o(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f12578H;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().m14675E();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().m14677G();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f12590s = (sizeDimension - this.f12591x) / 2;
        getImpl().d0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.f12578H;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.m5953a());
        this.f12581Q.m39451d((Bundle) fgd.m26663g((Bundle) extendableSavedState.f13014c.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f13014c.put("expandableWidgetHelper", this.f12581Q.m39452e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            m14641j(this.f12579L);
            if (!this.f12579L.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m14647p() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f12584d;
        if (colorStateList == null) {
            fy5.m27729c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f12585e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(ek0.m25164e(colorForState, mode));
    }

    /* renamed from: q */
    public boolean m14648q(boolean z) {
        return this.f12581Q.m39453f(z);
    }

    /* renamed from: r */
    public void m14649r(AbstractC11057b abstractC11057b) {
        m14650s(abstractC11057b, true);
    }

    /* renamed from: s */
    public void m14650s(AbstractC11057b abstractC11057b, boolean z) {
        getImpl().b0(m14651t(abstractC11057b), z);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f12582b != colorStateList) {
            this.f12582b = colorStateList;
            getImpl().m14682L(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f12583c != mode) {
            this.f12583c = mode;
            getImpl().m14683M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().m14684N(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().m14687Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().m14691U(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f12589q) {
            this.f12589q = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().e0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().m14709q()) {
            getImpl().m14685O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f12581Q.m39454g(i);
    }

    public void setHideMotionSpec(smb smbVar) {
        getImpl().m14686P(smbVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(smb.m48547d(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().c0();
            if (this.f12584d != null) {
                m14647p();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f12580M.m32225i(i);
        m14647p();
    }

    public void setMaxImageSize(int i) {
        this.f12591x = i;
        getImpl().m14689S(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().m14680J();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().m14680J();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().m14693W(z);
    }

    @Override // p001o.rlf
    public void setShapeAppearanceModel(ykf ykfVar) {
        getImpl().m14694X(ykfVar);
    }

    public void setShowMotionSpec(smb smbVar) {
        getImpl().m14695Y(smbVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(smb.m48547d(getContext(), i));
    }

    public void setSize(int i) {
        this.f12589q = 0;
        if (i != this.f12588h) {
            this.f12588h = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f12584d != colorStateList) {
            this.f12584d = colorStateList;
            m14647p();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f12585e != mode) {
            this.f12585e = mode;
            m14647p();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().m14681K();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().m14681K();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().m14681K();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f12592y != z) {
            this.f12592y = z;
            getImpl().m14676F();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public final C11060a.g m14651t(AbstractC11057b abstractC11057b) {
        if (abstractC11057b == null) {
            return null;
        }
        return new C11056a(abstractC11057b);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f12593a;

        /* renamed from: b */
        public AbstractC11057b f12594b;

        /* renamed from: c */
        public boolean f12595c;

        public BaseBehavior() {
            this.f12595c = true;
        }

        /* renamed from: K */
        public static boolean m14652K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2012e) {
                return ((CoordinatorLayout.C2012e) layoutParams).m5798f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo5769f(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f12578H;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: J */
        public final boolean m14654J(View view, FloatingActionButton floatingActionButton) {
            return (this.f12595c && ((CoordinatorLayout.C2012e) floatingActionButton.getLayoutParams()).m5797e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        /* renamed from: L */
        public final void m14655L(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f12578H;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.C2012e c2012e = (CoordinatorLayout.C2012e) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) c2012e).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) c2012e).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) c2012e).bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) c2012e).topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                wvi.m55111X(floatingActionButton, i);
            }
            if (i2 != 0) {
                wvi.m55110W(floatingActionButton, i2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo5775l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m14658O(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!m14652K(view)) {
                return false;
            }
            m14659P(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean mo5779p(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List listM5755v = coordinatorLayout.m5755v(floatingActionButton);
            int size = listM5755v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) listM5755v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m14652K(view) && m14659P(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (m14658O(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m5737M(floatingActionButton, i);
            m14655L(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: O */
        public final boolean m14658O(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (m14654J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f12593a == null) {
                this.f12593a = new Rect();
            }
            Rect rect = this.f12593a;
            km5.m35901a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.m14643l(this.f12594b, false);
                return true;
            }
            floatingActionButton.m14650s(this.f12594b, false);
            return true;
        }

        /* renamed from: P */
        public final boolean m14659P(View view, FloatingActionButton floatingActionButton) {
            if (m14654J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2012e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.m14643l(this.f12594b, false);
                return true;
            }
            floatingActionButton.m14650s(this.f12594b, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: k */
        public void mo5774k(CoordinatorLayout.C2012e c2012e) {
            if (c2012e.f7102h == 0) {
                c2012e.f7102h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.FloatingActionButton_Behavior_Layout);
            this.f12595c = typedArrayObtainStyledAttributes.getBoolean(ebe.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f12586f != colorStateList) {
            this.f12586f = colorStateList;
            getImpl().m14692V(this.f12586f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2 = i0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f12578H = new Rect();
        this.f12579L = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.FloatingActionButton, i, i2, new int[0]);
        this.f12582b = yya.m58494a(context2, typedArrayM19305i, ebe.FloatingActionButton_backgroundTint);
        this.f12583c = xzi.m57081q(typedArrayM19305i.getInt(ebe.FloatingActionButton_backgroundTintMode, -1), null);
        this.f12586f = yya.m58494a(context2, typedArrayM19305i, ebe.FloatingActionButton_rippleColor);
        this.f12588h = typedArrayM19305i.getInt(ebe.FloatingActionButton_fabSize, -1);
        this.f12589q = typedArrayM19305i.getDimensionPixelSize(ebe.FloatingActionButton_fabCustomSize, 0);
        this.f12587g = typedArrayM19305i.getDimensionPixelSize(ebe.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayM19305i.getDimension(ebe.FloatingActionButton_elevation, 0.0f);
        float dimension2 = typedArrayM19305i.getDimension(ebe.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = typedArrayM19305i.getDimension(ebe.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f12592y = typedArrayM19305i.getBoolean(ebe.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(x6e.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayM19305i.getDimensionPixelSize(ebe.FloatingActionButton_maxImageSize, 0));
        smb smbVarM48546c = smb.m48546c(context2, typedArrayM19305i, ebe.FloatingActionButton_showMotionSpec);
        smb smbVarM48546c2 = smb.m48546c(context2, typedArrayM19305i, ebe.FloatingActionButton_hideMotionSpec);
        ykf ykfVarM57970m = ykf.m57927g(context2, attributeSet, i, i2, ykf.f55640m).m57970m();
        boolean z = typedArrayM19305i.getBoolean(ebe.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayM19305i.getBoolean(ebe.FloatingActionButton_android_enabled, true));
        typedArrayM19305i.recycle();
        ik0 ik0Var = new ik0(this);
        this.f12580M = ik0Var;
        ik0Var.m32223g(attributeSet, i);
        this.f12581Q = new mo6(this);
        getImpl().m14694X(ykfVarM57970m);
        getImpl().m14672A(this.f12582b, this.f12583c, this.f12586f, this.f12587g);
        getImpl().m14690T(dimensionPixelSize);
        getImpl().m14684N(dimension);
        getImpl().m14687Q(dimension2);
        getImpl().m14691U(dimension3);
        getImpl().m14695Y(smbVarM48546c);
        getImpl().m14686P(smbVarM48546c2);
        getImpl().m14685O(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
