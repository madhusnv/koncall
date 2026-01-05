package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.api.Api;
import com.google.android.material.badge.AbstractC10937b;
import com.google.android.material.badge.C10936a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p001o.aza;
import p001o.bbe;
import p001o.bkh;
import p001o.cc;
import p001o.ebe;
import p001o.fy5;
import p001o.ged;
import p001o.gh0;
import p001o.gjh;
import p001o.gue;
import p001o.gza;
import p001o.ied;
import p001o.jsh;
import p001o.ked;
import p001o.l46;
import p001o.lk0;
import p001o.n9e;
import p001o.os6;
import p001o.pae;
import p001o.pic;
import p001o.rcd;
import p001o.umb;
import p001o.v9e;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.xy5;
import p001o.xzi;
import p001o.yya;
import p001o.zya;

@ViewPager.InterfaceC2537e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    public static final int O0 = pae.Widget_Design_TabLayout;
    public static final ged P0 = new ked(16);
    public C11143a A0;
    public final TimeInterpolator B0;
    public InterfaceC11136c C0;
    public final ArrayList D0;
    public InterfaceC11136c E0;
    public ValueAnimator F0;
    public ViewPager G0;

    /* renamed from: H */
    public ColorStateList f13018H;
    public pic H0;
    public DataSetObserver I0;
    public C11141h J0;
    public C11135b K0;

    /* renamed from: L */
    public ColorStateList f13019L;
    public boolean L0;

    /* renamed from: M */
    public Drawable f13020M;
    public int M0;
    public final ged N0;

    /* renamed from: Q */
    public int f13021Q;

    /* renamed from: a */
    public int f13022a;

    /* renamed from: b */
    public final ArrayList f13023b;

    /* renamed from: c */
    public C11140g f13024c;

    /* renamed from: d */
    public final C11139f f13025d;

    /* renamed from: e */
    public int f13026e;

    /* renamed from: f */
    public int f13027f;

    /* renamed from: g */
    public int f13028g;

    /* renamed from: h */
    public int f13029h;
    public PorterDuff.Mode h0;
    public float i0;
    public float j0;
    public float k0;
    public final int l0;
    public int m0;
    public final int n0;
    public final int o0;
    public final int p0;

    /* renamed from: q */
    public final int f13030q;
    public int q0;
    public int r0;

    /* renamed from: s */
    public final int f13031s;
    public int s0;
    public int t0;
    public int u0;
    public boolean v0;
    public boolean w0;

    /* renamed from: x */
    public int f13032x;
    public int x0;

    /* renamed from: y */
    public ColorStateList f13033y;
    public int y0;
    public boolean z0;

    public final class TabView extends LinearLayout {

        /* renamed from: a */
        public C11140g f13034a;

        /* renamed from: b */
        public TextView f13035b;

        /* renamed from: c */
        public ImageView f13036c;

        /* renamed from: d */
        public View f13037d;

        /* renamed from: e */
        public C10936a f13038e;

        /* renamed from: f */
        public View f13039f;

        /* renamed from: g */
        public TextView f13040g;

        /* renamed from: h */
        public ImageView f13041h;

        /* renamed from: q */
        public Drawable f13042q;

        /* renamed from: s */
        public int f13043s;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        public class ViewOnLayoutChangeListenerC11133a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            public final /* synthetic */ View f13045a;

            public ViewOnLayoutChangeListenerC11133a(View view) {
                this.f13045a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f13045a.getVisibility() == 0) {
                    TabView.this.m15269o(this.f13045a);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            this.f13043s = 2;
            m15271q(context);
            setPaddingRelative(TabLayout.this.f13026e, TabLayout.this.f13027f, TabLayout.this.f13028g, TabLayout.this.f13029h);
            setGravity(17);
            setOrientation(!TabLayout.this.v0 ? 1 : 0);
            setClickable(true);
            wvi.y0(this, rcd.m46525b(getContext(), 1002));
        }

        private C10936a getBadge() {
            return this.f13038e;
        }

        private C10936a getOrCreateBadge() {
            if (this.f13038e == null) {
                this.f13038e = C10936a.m14020f(getContext());
            }
            m15268n();
            C10936a c10936a = this.f13038e;
            if (c10936a != null) {
                return c10936a;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: d */
        public final void m15258d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC11133a(view));
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f13042q;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f13042q.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* renamed from: e */
        public final float m15259e(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: f */
        public final void m15260f(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        /* renamed from: g */
        public final void m15261g(Canvas canvas) {
            Drawable drawable = this.f13042q;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f13042q.draw(canvas);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f13035b, this.f13036c, this.f13039f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f13035b, this.f13036c, this.f13039f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public C11140g getTab() {
            return this.f13034a;
        }

        /* renamed from: h */
        public final boolean m15262h() {
            return this.f13038e != null;
        }

        /* renamed from: i */
        public final void m15263i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(n9e.design_layout_tab_icon, (ViewGroup) this, false);
            this.f13036c = imageView;
            addView(imageView, 0);
        }

        /* renamed from: j */
        public final void m15264j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(n9e.design_layout_tab_text, (ViewGroup) this, false);
            this.f13035b = textView;
            addView(textView);
        }

        /* renamed from: k */
        public void m15265k() {
            setTab(null);
            setSelected(false);
        }

        /* renamed from: l */
        public final void m15266l(View view) {
            if (m15262h() && view != null) {
                m15260f(false);
                AbstractC10937b.m14070b(this.f13038e, view, null);
                this.f13037d = view;
            }
        }

        /* renamed from: m */
        public final void m15267m() {
            if (m15262h()) {
                m15260f(true);
                View view = this.f13037d;
                if (view != null) {
                    AbstractC10937b.m14073e(this.f13038e, view);
                    this.f13037d = null;
                }
            }
        }

        /* renamed from: n */
        public final void m15268n() {
            C11140g c11140g;
            C11140g c11140g2;
            if (m15262h()) {
                if (this.f13039f != null) {
                    m15267m();
                    return;
                }
                if (this.f13036c != null && (c11140g2 = this.f13034a) != null && c11140g2.m15292f() != null) {
                    View view = this.f13037d;
                    ImageView imageView = this.f13036c;
                    if (view == imageView) {
                        m15269o(imageView);
                        return;
                    } else {
                        m15267m();
                        m15266l(this.f13036c);
                        return;
                    }
                }
                if (this.f13035b == null || (c11140g = this.f13034a) == null || c11140g.m15294h() != 1) {
                    m15267m();
                    return;
                }
                View view2 = this.f13037d;
                TextView textView = this.f13035b;
                if (view2 == textView) {
                    m15269o(textView);
                } else {
                    m15267m();
                    m15266l(this.f13035b);
                }
            }
        }

        /* renamed from: o */
        public final void m15269o(View view) {
            if (m15262h() && view == this.f13037d) {
                AbstractC10937b.m14074f(this.f13038e, view, null);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            cc ccVarD1 = cc.d1(accessibilityNodeInfo);
            C10936a c10936a = this.f13038e;
            if (c10936a != null && c10936a.isVisible()) {
                ccVarD1.s0(this.f13038e.m14053k());
            }
            ccVarD1.r0(cc.C12629f.m20832a(0, 1, this.f13034a.m15293g(), 1, false, isSelected()));
            if (isSelected()) {
                ccVarD1.p0(false);
                ccVarD1.f0(cc.C12624a.f17797i);
            }
            ccVarD1.N0(getResources().getString(v9e.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.m0, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f13035b != null) {
                float f = TabLayout.this.i0;
                if (isSelected() && TabLayout.this.f13032x != -1) {
                    f = TabLayout.this.j0;
                }
                int i3 = this.f13043s;
                ImageView imageView = this.f13036c;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f13035b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.k0;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f13035b.getTextSize();
                int lineCount = this.f13035b.getLineCount();
                int maxLines = this.f13035b.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.u0 == 1 && f > textSize && lineCount == 1 && ((layout = this.f13035b.getLayout()) == null || m15259e(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z = false;
                    }
                    if (z) {
                        this.f13035b.setTextSize(0, f);
                        this.f13035b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: p */
        public final void m15270p() {
            m15273s();
            C11140g c11140g = this.f13034a;
            setSelected(c11140g != null && c11140g.m15296j());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f13034a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f13034a.m15298l();
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$TabView] */
        /* renamed from: q */
        public final void m15271q(Context context) {
            int i = TabLayout.this.l0;
            if (i != 0) {
                Drawable drawableM37353b = lk0.m37353b(context, i);
                this.f13042q = drawableM37353b;
                if (drawableM37353b != null && drawableM37353b.isStateful()) {
                    this.f13042q.setState(getDrawableState());
                }
            } else {
                this.f13042q = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f13019L != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListM29516a = gue.m29516a(TabLayout.this.f13019L);
                boolean z = TabLayout.this.z0;
                if (z) {
                    gradientDrawable = null;
                }
                gradientDrawable = new RippleDrawable(colorStateListM29516a, gradientDrawable, z ? null : gradientDrawable2);
            }
            setBackground(gradientDrawable);
            TabLayout.this.invalidate();
        }

        /* renamed from: r */
        public final void m15272r() {
            setOrientation(!TabLayout.this.v0 ? 1 : 0);
            TextView textView = this.f13040g;
            if (textView == null && this.f13041h == null) {
                m15274t(this.f13035b, this.f13036c, true);
            } else {
                m15274t(textView, this.f13041h, false);
            }
        }

        /* renamed from: s */
        public final void m15273s() {
            ViewParent parent;
            C11140g c11140g = this.f13034a;
            View viewM15291e = c11140g != null ? c11140g.m15291e() : null;
            if (viewM15291e != null) {
                ViewParent parent2 = viewM15291e.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewM15291e);
                    }
                    View view = this.f13039f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f13039f);
                    }
                    addView(viewM15291e);
                }
                this.f13039f = viewM15291e;
                TextView textView = this.f13035b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f13036c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f13036c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewM15291e.findViewById(R.id.text1);
                this.f13040g = textView2;
                if (textView2 != null) {
                    this.f13043s = textView2.getMaxLines();
                }
                this.f13041h = (ImageView) viewM15291e.findViewById(R.id.icon);
            } else {
                View view2 = this.f13039f;
                if (view2 != null) {
                    removeView(view2);
                    this.f13039f = null;
                }
                this.f13040g = null;
                this.f13041h = null;
            }
            if (this.f13039f == null) {
                if (this.f13036c == null) {
                    m15263i();
                }
                if (this.f13035b == null) {
                    m15264j();
                    this.f13043s = this.f13035b.getMaxLines();
                }
                gjh.m28914m(this.f13035b, TabLayout.this.f13030q);
                if (!isSelected() || TabLayout.this.f13032x == -1) {
                    gjh.m28914m(this.f13035b, TabLayout.this.f13031s);
                } else {
                    gjh.m28914m(this.f13035b, TabLayout.this.f13032x);
                }
                ColorStateList colorStateList = TabLayout.this.f13033y;
                if (colorStateList != null) {
                    this.f13035b.setTextColor(colorStateList);
                }
                m15274t(this.f13035b, this.f13036c, true);
                m15268n();
                m15258d(this.f13036c);
                m15258d(this.f13035b);
            } else {
                TextView textView3 = this.f13040g;
                if (textView3 != null || this.f13041h != null) {
                    m15274t(textView3, this.f13041h, false);
                }
            }
            if (c11140g == null || TextUtils.isEmpty(c11140g.f13060d)) {
                return;
            }
            setContentDescription(c11140g.f13060d);
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.f13035b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f13036c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f13039f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C11140g c11140g) {
            if (c11140g != this.f13034a) {
                this.f13034a = c11140g;
                m15270p();
            }
        }

        /* renamed from: t */
        public final void m15274t(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            C11140g c11140g = this.f13034a;
            Drawable drawableMutate = (c11140g == null || c11140g.m15292f() == null) ? null : fy5.m27744r(this.f13034a.m15292f()).mutate();
            if (drawableMutate != null) {
                drawableMutate.setTintList(TabLayout.this.f13018H);
                PorterDuff.Mode mode = TabLayout.this.h0;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            C11140g c11140g2 = this.f13034a;
            CharSequence charSequenceM15295i = c11140g2 != null ? c11140g2.m15295i() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z3 = !TextUtils.isEmpty(charSequenceM15295i);
            if (textView != null) {
                z2 = z3 && this.f13034a.f13063g == 1;
                textView.setText(z3 ? charSequenceM15295i : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (z3) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iM57071g = (z2 && imageView.getVisibility() == 0) ? (int) xzi.m57071g(getContext(), 8) : 0;
                if (TabLayout.this.v0) {
                    if (iM57071g != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iM57071g);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iM57071g != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iM57071g;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C11140g c11140g3 = this.f13034a;
            CharSequence charSequence = c11140g3 != null ? c11140g3.f13060d : null;
            if (!z3) {
                charSequenceM15295i = charSequence;
            }
            jsh.m34483a(this, charSequenceM15295i);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C11134a implements ValueAnimator.AnimatorUpdateListener {
        public C11134a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C11135b implements ViewPager.InterfaceC2540h {

        /* renamed from: a */
        public boolean f13048a;

        public C11135b() {
        }

        /* renamed from: a */
        public void m15275a(boolean z) {
            this.f13048a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2540h
        /* renamed from: d */
        public void mo9970d(ViewPager viewPager, pic picVar, pic picVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.G0 == viewPager) {
                tabLayout.m15229N(picVar2, this.f13048a);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface InterfaceC11136c {
        /* renamed from: a */
        void mo943a(C11140g c11140g);

        /* renamed from: b */
        void mo944b(C11140g c11140g);

        /* renamed from: c */
        void mo945c(C11140g c11140g);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface InterfaceC11137d extends InterfaceC11136c {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C11138e extends DataSetObserver {
        public C11138e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m15221F();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m15221F();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public class C11139f extends LinearLayout {

        /* renamed from: a */
        public ValueAnimator f13051a;

        /* renamed from: b */
        public int f13052b;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ View f13054a;

            /* renamed from: b */
            public final /* synthetic */ View f13055b;

            public a(View view, View view2) {
                this.f13054a = view;
                this.f13055b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C11139f.this.m15285j(this.f13054a, this.f13055b, valueAnimator.getAnimatedFraction());
            }
        }

        public C11139f(Context context) {
            super(context);
            this.f13052b = -1;
            setWillNotDraw(false);
        }

        /* renamed from: c */
        public void m15278c(int i, int i2) {
            ValueAnimator valueAnimator = this.f13051a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f13022a != i) {
                this.f13051a.cancel();
            }
            m15286k(true, i, i2);
        }

        /* renamed from: d */
        public boolean m15279d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f13020M.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f13020M.getIntrinsicHeight();
            }
            int i = TabLayout.this.t0;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i != 1) {
                height = 0;
                if (i != 2) {
                    iHeight = i != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f13020M.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f13020M.getBounds();
                TabLayout.this.f13020M.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f13020M.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        public final void m15280e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f13022a == -1) {
                tabLayout.f13022a = tabLayout.getSelectedTabPosition();
            }
            m15281f(TabLayout.this.f13022a);
        }

        /* renamed from: f */
        public final void m15281f(int i) {
            if (TabLayout.this.M0 == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i);
                C11143a c11143a = TabLayout.this.A0;
                TabLayout tabLayout = TabLayout.this;
                c11143a.m15309c(tabLayout, childAt, tabLayout.f13020M);
                TabLayout.this.f13022a = i;
            }
        }

        /* renamed from: g */
        public final void m15282g() {
            m15281f(TabLayout.this.getSelectedTabPosition());
        }

        /* renamed from: h */
        public void m15283h(int i, float f) {
            TabLayout.this.f13022a = Math.round(i + f);
            ValueAnimator valueAnimator = this.f13051a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f13051a.cancel();
            }
            m15285j(getChildAt(i), getChildAt(i + 1), f);
        }

        /* renamed from: i */
        public void m15284i(int i) {
            Rect bounds = TabLayout.this.f13020M.getBounds();
            TabLayout.this.f13020M.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: j */
        public final void m15285j(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C11143a c11143a = TabLayout.this.A0;
                TabLayout tabLayout = TabLayout.this;
                c11143a.mo15310d(tabLayout, view, view2, f, tabLayout.f13020M);
            } else {
                Drawable drawable = TabLayout.this.f13020M;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f13020M.getBounds().bottom);
            }
            postInvalidateOnAnimation();
        }

        /* renamed from: k */
        public final void m15286k(boolean z, int i, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f13022a == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m15282g();
                return;
            }
            TabLayout.this.f13022a = i;
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.f13051a.removeAllUpdateListeners();
                this.f13051a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13051a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.B0);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f13051a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m15280e();
            } else {
                m15286k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.r0 == 1 || tabLayout.u0 == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) xzi.m57071g(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.r0 = 0;
                    tabLayout2.m15234S(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C11140g {

        /* renamed from: a */
        public Object f13057a;

        /* renamed from: b */
        public Drawable f13058b;

        /* renamed from: c */
        public CharSequence f13059c;

        /* renamed from: d */
        public CharSequence f13060d;

        /* renamed from: f */
        public View f13062f;

        /* renamed from: h */
        public TabLayout f13064h;

        /* renamed from: i */
        public TabView f13065i;

        /* renamed from: e */
        public int f13061e = -1;

        /* renamed from: g */
        public int f13063g = 1;

        /* renamed from: j */
        public int f13066j = -1;

        /* renamed from: e */
        public View m15291e() {
            return this.f13062f;
        }

        /* renamed from: f */
        public Drawable m15292f() {
            return this.f13058b;
        }

        /* renamed from: g */
        public int m15293g() {
            return this.f13061e;
        }

        /* renamed from: h */
        public int m15294h() {
            return this.f13063g;
        }

        /* renamed from: i */
        public CharSequence m15295i() {
            return this.f13059c;
        }

        /* renamed from: j */
        public boolean m15296j() {
            TabLayout tabLayout = this.f13064h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f13061e;
        }

        /* renamed from: k */
        public void m15297k() {
            this.f13064h = null;
            this.f13065i = null;
            this.f13057a = null;
            this.f13058b = null;
            this.f13066j = -1;
            this.f13059c = null;
            this.f13060d = null;
            this.f13061e = -1;
            this.f13062f = null;
        }

        /* renamed from: l */
        public void m15298l() {
            TabLayout tabLayout = this.f13064h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m15227L(this);
        }

        /* renamed from: m */
        public C11140g m15299m(CharSequence charSequence) {
            this.f13060d = charSequence;
            m15305s();
            return this;
        }

        /* renamed from: n */
        public C11140g m15300n(int i) {
            return m15301o(LayoutInflater.from(this.f13065i.getContext()).inflate(i, (ViewGroup) this.f13065i, false));
        }

        /* renamed from: o */
        public C11140g m15301o(View view) {
            this.f13062f = view;
            m15305s();
            return this;
        }

        /* renamed from: p */
        public C11140g m15302p(Drawable drawable) {
            this.f13058b = drawable;
            TabLayout tabLayout = this.f13064h;
            if (tabLayout.r0 == 1 || tabLayout.u0 == 2) {
                tabLayout.m15234S(true);
            }
            m15305s();
            return this;
        }

        /* renamed from: q */
        public void m15303q(int i) {
            this.f13061e = i;
        }

        /* renamed from: r */
        public C11140g m15304r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f13060d) && !TextUtils.isEmpty(charSequence)) {
                this.f13065i.setContentDescription(charSequence);
            }
            this.f13059c = charSequence;
            m15305s();
            return this;
        }

        /* renamed from: s */
        public void m15305s() {
            TabView tabView = this.f13065i;
            if (tabView != null) {
                tabView.m15270p();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C11141h implements ViewPager.InterfaceC2541i {

        /* renamed from: a */
        public final WeakReference f13067a;

        /* renamed from: b */
        public int f13068b;

        /* renamed from: c */
        public int f13069c;

        public C11141h(TabLayout tabLayout) {
            this.f13067a = new WeakReference(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2541i
        /* renamed from: a */
        public void mo9967a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f13067a.get();
            if (tabLayout != null) {
                int i3 = this.f13069c;
                tabLayout.m15230O(i, f, i3 != 2 || this.f13068b == 1, (i3 == 2 && this.f13068b == 0) ? false : true, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2541i
        /* renamed from: b */
        public void mo9968b(int i) {
            this.f13068b = this.f13069c;
            this.f13069c = i;
            TabLayout tabLayout = (TabLayout) this.f13067a.get();
            if (tabLayout != null) {
                tabLayout.m15235T(this.f13069c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2541i
        /* renamed from: c */
        public void mo9969c(int i) {
            TabLayout tabLayout = (TabLayout) this.f13067a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f13069c;
            tabLayout.m15228M(tabLayout.m15217B(i), i2 == 0 || (i2 == 2 && this.f13068b == 0));
        }

        /* renamed from: d */
        public void m15306d() {
            this.f13069c = 0;
            this.f13068b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C11142i implements InterfaceC11137d {

        /* renamed from: a */
        public final ViewPager f13070a;

        public C11142i(ViewPager viewPager) {
            this.f13070a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: a */
        public void mo943a(C11140g c11140g) throws Resources.NotFoundException {
            this.f13070a.setCurrentItem(c11140g.m15293g());
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: b */
        public void mo944b(C11140g c11140g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC11136c
        /* renamed from: c */
        public void mo945c(C11140g c11140g) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private int getDefaultHeight() {
        int size = this.f13023b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C11140g c11140g = (C11140g) this.f13023b.get(i);
                if (c11140g != null && c11140g.m15292f() != null && !TextUtils.isEmpty(c11140g.m15295i())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.v0) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.n0;
        if (i != -1) {
            return i;
        }
        int i2 = this.u0;
        if (i2 == 0 || i2 == 2) {
            return this.p0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f13025d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f13025d.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f13025d.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).m15273s();
                    }
                }
                i2++;
            }
        }
    }

    /* renamed from: t */
    public static ColorStateList m15215t(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: A */
    public final void m15216A() {
        if (this.F0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.F0 = valueAnimator;
            valueAnimator.setInterpolator(this.B0);
            this.F0.setDuration(this.s0);
            this.F0.addUpdateListener(new C11134a());
        }
    }

    /* renamed from: B */
    public C11140g m15217B(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C11140g) this.f13023b.get(i);
    }

    /* renamed from: C */
    public final boolean m15218C() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    /* renamed from: D */
    public boolean m15219D() {
        return this.w0;
    }

    /* renamed from: E */
    public C11140g m15220E() {
        C11140g c11140gM15250v = m15250v();
        c11140gM15250v.f13064h = this;
        c11140gM15250v.f13065i = m15251w(c11140gM15250v);
        if (c11140gM15250v.f13066j != -1) {
            c11140gM15250v.f13065i.setId(c11140gM15250v.f13066j);
        }
        return c11140gM15250v;
    }

    /* renamed from: F */
    public void m15221F() {
        int currentItem;
        m15223H();
        pic picVar = this.H0;
        if (picVar != null) {
            int iMo27814d = picVar.mo27814d();
            for (int i = 0; i < iMo27814d; i++) {
                m15240k(m15220E().m15304r(this.H0.mo27815f(i)), false);
            }
            ViewPager viewPager = this.G0;
            if (viewPager == null || iMo27814d <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m15227L(m15217B(currentItem));
        }
    }

    /* renamed from: G */
    public boolean m15222G(C11140g c11140g) {
        return P0.mo28525a(c11140g);
    }

    /* renamed from: H */
    public void m15223H() {
        for (int childCount = this.f13025d.getChildCount() - 1; childCount >= 0; childCount--) {
            m15226K(childCount);
        }
        Iterator it = this.f13023b.iterator();
        while (it.hasNext()) {
            C11140g c11140g = (C11140g) it.next();
            it.remove();
            c11140g.m15297k();
            m15222G(c11140g);
        }
        this.f13024c = null;
    }

    /* renamed from: I */
    public void m15224I(InterfaceC11136c interfaceC11136c) {
        this.D0.remove(interfaceC11136c);
    }

    /* renamed from: J */
    public void m15225J(InterfaceC11137d interfaceC11137d) {
        m15224I(interfaceC11137d);
    }

    /* renamed from: K */
    public final void m15226K(int i) {
        TabView tabView = (TabView) this.f13025d.getChildAt(i);
        this.f13025d.removeViewAt(i);
        if (tabView != null) {
            tabView.m15265k();
            this.N0.mo28525a(tabView);
        }
        requestLayout();
    }

    /* renamed from: L */
    public void m15227L(C11140g c11140g) {
        m15228M(c11140g, true);
    }

    /* renamed from: M */
    public void m15228M(C11140g c11140g, boolean z) {
        C11140g c11140g2 = this.f13024c;
        if (c11140g2 == c11140g) {
            if (c11140g2 != null) {
                m15252x(c11140g);
                m15244o(c11140g.m15293g());
                return;
            }
            return;
        }
        int iM15293g = c11140g != null ? c11140g.m15293g() : -1;
        if (z) {
            if ((c11140g2 == null || c11140g2.m15293g() == -1) && iM15293g != -1) {
                setScrollPosition(iM15293g, 0.0f, true);
            } else {
                m15244o(iM15293g);
            }
            if (iM15293g != -1) {
                setSelectedTabView(iM15293g);
            }
        }
        this.f13024c = c11140g;
        if (c11140g2 != null && c11140g2.f13064h != null) {
            m15254z(c11140g2);
        }
        if (c11140g != null) {
            m15253y(c11140g);
        }
    }

    /* renamed from: N */
    public void m15229N(pic picVar, boolean z) {
        DataSetObserver dataSetObserver;
        pic picVar2 = this.H0;
        if (picVar2 != null && (dataSetObserver = this.I0) != null) {
            picVar2.m43746r(dataSetObserver);
        }
        this.H0 = picVar;
        if (z && picVar != null) {
            if (this.I0 == null) {
                this.I0 = new C11138e();
            }
            picVar.m43738j(this.I0);
        }
        m15221F();
    }

    /* renamed from: O */
    public void m15230O(int i, float f, boolean z, boolean z2, boolean z3) {
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.f13025d.getChildCount()) {
            return;
        }
        if (z2) {
            this.f13025d.m15283h(i, f);
        }
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.F0.cancel();
        }
        int iM15247r = m15247r(i, f);
        int scrollX = getScrollX();
        boolean z4 = (i < getSelectedTabPosition() && iM15247r >= scrollX) || (i > getSelectedTabPosition() && iM15247r <= scrollX) || i == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z4 = (i < getSelectedTabPosition() && iM15247r <= scrollX) || (i > getSelectedTabPosition() && iM15247r >= scrollX) || i == getSelectedTabPosition();
        }
        if (z4 || this.M0 == 1 || z3) {
            if (i < 0) {
                iM15247r = 0;
            }
            scrollTo(iM15247r, 0);
        }
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* renamed from: P */
    public final void m15231P(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.G0;
        if (viewPager2 != null) {
            C11141h c11141h = this.J0;
            if (c11141h != null) {
                viewPager2.m9980I(c11141h);
            }
            C11135b c11135b = this.K0;
            if (c11135b != null) {
                this.G0.m9979H(c11135b);
            }
        }
        InterfaceC11136c interfaceC11136c = this.E0;
        if (interfaceC11136c != null) {
            m15224I(interfaceC11136c);
            this.E0 = null;
        }
        if (viewPager != null) {
            this.G0 = viewPager;
            if (this.J0 == null) {
                this.J0 = new C11141h(this);
            }
            this.J0.m15306d();
            viewPager.m9991c(this.J0);
            C11142i c11142i = new C11142i(viewPager);
            this.E0 = c11142i;
            m15236g(c11142i);
            pic adapter = viewPager.getAdapter();
            if (adapter != null) {
                m15229N(adapter, z);
            }
            if (this.K0 == null) {
                this.K0 = new C11135b();
            }
            this.K0.m15275a(z);
            viewPager.m9990b(this.K0);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.G0 = null;
            m15229N(null, false);
        }
        this.L0 = z2;
    }

    /* renamed from: Q */
    public final void m15232Q() {
        int size = this.f13023b.size();
        for (int i = 0; i < size; i++) {
            ((C11140g) this.f13023b.get(i)).m15305s();
        }
    }

    /* renamed from: R */
    public final void m15233R(LinearLayout.LayoutParams layoutParams) {
        if (this.u0 == 1 && this.r0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* renamed from: S */
    public void m15234S(boolean z) {
        for (int i = 0; i < this.f13025d.getChildCount(); i++) {
            View childAt = this.f13025d.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m15233R((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* renamed from: T */
    public void m15235T(int i) {
        this.M0 = i;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m15243n(view);
    }

    /* renamed from: g */
    public void m15236g(InterfaceC11136c interfaceC11136c) {
        if (this.D0.contains(interfaceC11136c)) {
            return;
        }
        this.D0.add(interfaceC11136c);
    }

    public int getSelectedTabPosition() {
        C11140g c11140g = this.f13024c;
        if (c11140g != null) {
            return c11140g.m15293g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f13023b.size();
    }

    public int getTabGravity() {
        return this.r0;
    }

    public ColorStateList getTabIconTint() {
        return this.f13018H;
    }

    public int getTabIndicatorAnimationMode() {
        return this.y0;
    }

    public int getTabIndicatorGravity() {
        return this.t0;
    }

    public int getTabMaxWidth() {
        return this.m0;
    }

    public int getTabMode() {
        return this.u0;
    }

    public ColorStateList getTabRippleColor() {
        return this.f13019L;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f13020M;
    }

    public ColorStateList getTabTextColors() {
        return this.f13033y;
    }

    /* renamed from: h */
    public void m15237h(InterfaceC11137d interfaceC11137d) {
        m15236g(interfaceC11137d);
    }

    /* renamed from: i */
    public void m15238i(C11140g c11140g) {
        m15240k(c11140g, this.f13023b.isEmpty());
    }

    /* renamed from: j */
    public void m15239j(C11140g c11140g, int i, boolean z) {
        if (c11140g.f13064h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        m15248s(c11140g, i);
        m15242m(c11140g);
        if (z) {
            c11140g.m15298l();
        }
    }

    /* renamed from: k */
    public void m15240k(C11140g c11140g, boolean z) {
        m15239j(c11140g, this.f13023b.size(), z);
    }

    /* renamed from: l */
    public final void m15241l(TabItem tabItem) {
        C11140g c11140gM15220E = m15220E();
        CharSequence charSequence = tabItem.f13015a;
        if (charSequence != null) {
            c11140gM15220E.m15304r(charSequence);
        }
        Drawable drawable = tabItem.f13016b;
        if (drawable != null) {
            c11140gM15220E.m15302p(drawable);
        }
        int i = tabItem.f13017c;
        if (i != 0) {
            c11140gM15220E.m15300n(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            c11140gM15220E.m15299m(tabItem.getContentDescription());
        }
        m15238i(c11140gM15220E);
    }

    /* renamed from: m */
    public final void m15242m(C11140g c11140g) {
        TabView tabView = c11140g.f13065i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f13025d.addView(tabView, c11140g.m15293g(), m15249u());
    }

    /* renamed from: n */
    public final void m15243n(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        m15241l((TabItem) view);
    }

    /* renamed from: o */
    public final void m15244o(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f13025d.m15279d()) {
            setScrollPosition(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iM15247r = m15247r(i, 0.0f);
        if (scrollX != iM15247r) {
            m15216A();
            this.F0.setIntValues(scrollX, iM15247r);
            this.F0.start();
        }
        this.f13025d.m15278c(i, this.s0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        aza.m18044e(this);
        if (this.G0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m15231P((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.L0) {
            setupWithViewPager(null);
            this.L0 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f13025d.getChildCount(); i++) {
            View childAt = this.f13025d.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m15261g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        cc.d1(accessibilityNodeInfo).q0(cc.C12628e.m20831b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return m15218C() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int iRound = Math.round(xzi.m57071g(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM57071g = this.o0;
            if (iM57071g <= 0) {
                iM57071g = (int) (size - xzi.m57071g(getContext(), 56));
            }
            this.m0 = iM57071g;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.u0;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z = true;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || m15218C()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public final void m15245p(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f13025d.setGravity(1);
                return;
            } else if (i != 2) {
                return;
            }
        }
        this.f13025d.setGravity(8388611);
    }

    /* renamed from: q */
    public final void m15246q() {
        int i = this.u0;
        this.f13025d.setPaddingRelative((i == 0 || i == 2) ? Math.max(0, this.q0 - this.f13026e) : 0, 0, 0, 0);
        int i2 = this.u0;
        if (i2 == 0) {
            m15245p(this.r0);
        } else if (i2 == 1 || i2 == 2) {
            this.f13025d.setGravity(1);
        }
        m15234S(true);
    }

    /* renamed from: r */
    public final int m15247r(int i, float f) {
        View childAt;
        int i2 = this.u0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f13025d.getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < this.f13025d.getChildCount() ? this.f13025d.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    /* renamed from: s */
    public final void m15248s(C11140g c11140g, int i) {
        c11140g.m15303q(i);
        this.f13023b.add(i, c11140g);
        int size = this.f13023b.size();
        int i2 = -1;
        for (int i3 = i + 1; i3 < size; i3++) {
            if (((C11140g) this.f13023b.get(i3)).m15293g() == this.f13022a) {
                i2 = i3;
            }
            ((C11140g) this.f13023b.get(i3)).m15303q(i3);
        }
        this.f13022a = i2;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        aza.m18043d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.v0 != z) {
            this.v0 = z;
            for (int i = 0; i < this.f13025d.getChildCount(); i++) {
                View childAt = this.f13025d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m15272r();
                }
            }
            m15246q();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC11137d interfaceC11137d) {
        setOnTabSelectedListener((InterfaceC11136c) interfaceC11137d);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m15216A();
        this.F0.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = fy5.m27744r(drawable).mutate();
        this.f13020M = drawableMutate;
        xy5.m56955n(drawableMutate, this.f13021Q);
        int intrinsicHeight = this.x0;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f13020M.getIntrinsicHeight();
        }
        this.f13025d.m15284i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f13021Q = i;
        xy5.m56955n(this.f13020M, i);
        m15234S(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.t0 != i) {
            this.t0 = i;
            this.f13025d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.x0 = i;
        this.f13025d.m15284i(i);
    }

    public void setTabGravity(int i) {
        if (this.r0 != i) {
            this.r0 = i;
            m15246q();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f13018H != colorStateList) {
            this.f13018H = colorStateList;
            m15232Q();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(lk0.m37352a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.y0 = i;
        if (i == 0) {
            this.A0 = new C11143a();
            return;
        }
        if (i == 1) {
            this.A0 = new l46();
        } else {
            if (i == 2) {
                this.A0 = new os6();
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.w0 = z;
        this.f13025d.m15282g();
        this.f13025d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.u0) {
            this.u0 = i;
            m15246q();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f13019L != colorStateList) {
            this.f13019L = colorStateList;
            for (int i = 0; i < this.f13025d.getChildCount(); i++) {
                View childAt = this.f13025d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m15271q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(lk0.m37352a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f13033y != colorStateList) {
            this.f13033y = colorStateList;
            m15232Q();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(pic picVar) {
        m15229N(picVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            for (int i = 0; i < this.f13025d.getChildCount(); i++) {
                View childAt = this.f13025d.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m15271q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* renamed from: u */
    public final LinearLayout.LayoutParams m15249u() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m15233R(layoutParams);
        return layoutParams;
    }

    /* renamed from: v */
    public C11140g m15250v() {
        C11140g c11140g = (C11140g) P0.mo28526b();
        return c11140g == null ? new C11140g() : c11140g;
    }

    /* renamed from: w */
    public final TabView m15251w(C11140g c11140g) {
        ged gedVar = this.N0;
        TabView tabView = gedVar != null ? (TabView) gedVar.mo28526b() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(c11140g);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c11140g.f13060d)) {
            tabView.setContentDescription(c11140g.f13059c);
        } else {
            tabView.setContentDescription(c11140g.f13060d);
        }
        return tabView;
    }

    /* renamed from: x */
    public final void m15252x(C11140g c11140g) {
        for (int size = this.D0.size() - 1; size >= 0; size--) {
            ((InterfaceC11136c) this.D0.get(size)).mo945c(c11140g);
        }
    }

    /* renamed from: y */
    public final void m15253y(C11140g c11140g) {
        for (int size = this.D0.size() - 1; size >= 0; size--) {
            ((InterfaceC11136c) this.D0.get(size)).mo943a(c11140g);
        }
    }

    /* renamed from: z */
    public final void m15254z(C11140g c11140g) {
        for (int size = this.D0.size() - 1; size >= 0; size--) {
            ((InterfaceC11136c) this.D0.get(size)).mo944b(c11140g);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m15243n(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC11136c interfaceC11136c) {
        InterfaceC11136c interfaceC11136c2 = this.C0;
        if (interfaceC11136c2 != null) {
            m15224I(interfaceC11136c2);
        }
        this.C0 = interfaceC11136c;
        if (interfaceC11136c != null) {
            m15236g(interfaceC11136c);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        m15230O(i, f, z, z2, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        m15231P(viewPager, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int i2 = O0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.f13022a = -1;
        this.f13023b = new ArrayList();
        this.f13032x = -1;
        this.f13021Q = 0;
        this.m0 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.x0 = -1;
        this.D0 = new ArrayList();
        this.N0 = new ied(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C11139f c11139f = new C11139f(context2);
        this.f13025d = c11139f;
        super.addView(c11139f, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.TabLayout, i, i2, ebe.TabLayout_tabTextAppearance);
        ColorStateList colorStateListM56948g = xy5.m56948g(getBackground());
        if (colorStateListM56948g != null) {
            zya zyaVar = new zya();
            zyaVar.g0(colorStateListM56948g);
            zyaVar.m60115U(context2);
            zyaVar.f0(getElevation());
            setBackground(zyaVar);
        }
        setSelectedTabIndicator(yya.m58498e(context2, typedArrayM19305i, ebe.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayM19305i.getColor(ebe.TabLayout_tabIndicatorColor, 0));
        c11139f.m15284i(typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayM19305i.getInt(ebe.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayM19305i.getInt(ebe.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayM19305i.getBoolean(ebe.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabPadding, 0);
        this.f13029h = dimensionPixelSize;
        this.f13028g = dimensionPixelSize;
        this.f13027f = dimensionPixelSize;
        this.f13026e = dimensionPixelSize;
        this.f13026e = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f13027f = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabPaddingTop, this.f13027f);
        this.f13028g = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabPaddingEnd, this.f13028g);
        this.f13029h = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabPaddingBottom, this.f13029h);
        if (bkh.m19303g(context2)) {
            this.f13030q = x5e.textAppearanceTitleSmall;
        } else {
            this.f13030q = x5e.textAppearanceButton;
        }
        int resourceId = typedArrayM19305i.getResourceId(ebe.TabLayout_tabTextAppearance, pae.TextAppearance_Design_Tab);
        this.f13031s = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, bbe.TextAppearance);
        try {
            this.i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bbe.TextAppearance_android_textSize, 0);
            this.f13033y = yya.m58494a(context2, typedArrayObtainStyledAttributes, bbe.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM19305i.hasValue(ebe.TabLayout_tabSelectedTextAppearance)) {
                this.f13032x = typedArrayM19305i.getResourceId(ebe.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i3 = this.f13032x;
            if (i3 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i3, bbe.TextAppearance);
                try {
                    this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bbe.TextAppearance_android_textSize, (int) this.i0);
                    ColorStateList colorStateListM58494a = yya.m58494a(context2, typedArrayObtainStyledAttributes, bbe.TextAppearance_android_textColor);
                    if (colorStateListM58494a != null) {
                        this.f13033y = m15215t(this.f13033y.getDefaultColor(), colorStateListM58494a.getColorForState(new int[]{R.attr.state_selected}, colorStateListM58494a.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayM19305i.hasValue(ebe.TabLayout_tabTextColor)) {
                this.f13033y = yya.m58494a(context2, typedArrayM19305i, ebe.TabLayout_tabTextColor);
            }
            if (typedArrayM19305i.hasValue(ebe.TabLayout_tabSelectedTextColor)) {
                this.f13033y = m15215t(this.f13033y.getDefaultColor(), typedArrayM19305i.getColor(ebe.TabLayout_tabSelectedTextColor, 0));
            }
            this.f13018H = yya.m58494a(context2, typedArrayM19305i, ebe.TabLayout_tabIconTint);
            this.h0 = xzi.m57081q(typedArrayM19305i.getInt(ebe.TabLayout_tabIconTintMode, -1), null);
            this.f13019L = yya.m58494a(context2, typedArrayM19305i, ebe.TabLayout_tabRippleColor);
            this.s0 = typedArrayM19305i.getInt(ebe.TabLayout_tabIndicatorAnimationDuration, 300);
            this.B0 = umb.m51786g(context2, x5e.motionEasingEmphasizedInterpolator, gh0.f25147b);
            this.n0 = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabMinWidth, -1);
            this.o0 = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabMaxWidth, -1);
            this.l0 = typedArrayM19305i.getResourceId(ebe.TabLayout_tabBackground, 0);
            this.q0 = typedArrayM19305i.getDimensionPixelSize(ebe.TabLayout_tabContentStart, 0);
            this.u0 = typedArrayM19305i.getInt(ebe.TabLayout_tabMode, 1);
            this.r0 = typedArrayM19305i.getInt(ebe.TabLayout_tabGravity, 0);
            this.v0 = typedArrayM19305i.getBoolean(ebe.TabLayout_tabInlineLabel, false);
            this.z0 = typedArrayM19305i.getBoolean(ebe.TabLayout_tabUnboundedRipple, false);
            typedArrayM19305i.recycle();
            Resources resources = getResources();
            this.k0 = resources.getDimensionPixelSize(x6e.design_tab_text_size_2line);
            this.p0 = resources.getDimensionPixelSize(x6e.design_tab_scrollable_min_width);
            m15246q();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m15243n(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m15243n(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m15215t(i, i2));
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(lk0.m37353b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
