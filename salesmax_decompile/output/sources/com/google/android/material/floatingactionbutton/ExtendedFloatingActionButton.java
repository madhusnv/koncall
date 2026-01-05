package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import p001o.bkh;
import p001o.ebe;
import p001o.ee1;
import p001o.gza;
import p001o.km5;
import p001o.mh0;
import p001o.pae;
import p001o.s5e;
import p001o.smb;
import p001o.x5e;
import p001o.ykf;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC2009b {
    public static final int P0 = pae.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    public static final Property Q0 = new C11047f(Float.class, "width");
    public static final Property R0 = new C11048g(Float.class, "height");
    public static final Property S0 = new C11049h(Float.class, "paddingStart");
    public static final Property T0 = new C11050i(Float.class, "paddingEnd");
    public final InterfaceC11061b A0;
    public final InterfaceC11061b B0;
    public final InterfaceC11061b C0;
    public final InterfaceC11061b D0;
    public final int E0;
    public int F0;
    public int G0;
    public final CoordinatorLayout.Behavior H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public ColorStateList L0;
    public int M0;
    public int N0;
    public final int O0;
    public int x0;
    public boolean y0;
    public final mh0 z0;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C11042a implements InterfaceC11055n {
        public C11042a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo14617a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C11043b implements InterfaceC11055n {
        public C11043b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo14617a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.G0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.F0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.F0 + ExtendedFloatingActionButton.this.G0;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C11044c implements InterfaceC11055n {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11055n f12564a;

        public C11044c(InterfaceC11055n interfaceC11055n) {
            this.f12564a = interfaceC11055n;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo14617a() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.N0 == 0 ? -2 : ExtendedFloatingActionButton.this.N0);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.N0 != -1) {
                return (ExtendedFloatingActionButton.this.N0 == 0 || ExtendedFloatingActionButton.this.N0 == -2) ? this.f12564a.getHeight() : ExtendedFloatingActionButton.this.N0;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f12564a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height == -2) {
                return this.f12564a.getHeight();
            }
            int i = 0;
            int paddingTop = view.getPaddingTop() + view.getPaddingBottom() + 0;
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            return (view.getHeight() - i) - paddingTop;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.G0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.F0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f12564a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2) {
                return this.f12564a.getWidth();
            }
            int i = 0;
            int paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + 0;
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
            return (view.getWidth() - i) - paddingLeft;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C11045d implements InterfaceC11055n {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC11055n f12566a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC11055n f12567b;

        public C11045d(InterfaceC11055n interfaceC11055n, InterfaceC11055n interfaceC11055n2) {
            this.f12566a = interfaceC11055n;
            this.f12567b = interfaceC11055n2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        /* renamed from: a */
        public ViewGroup.LayoutParams mo14617a() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.M0 == 0 ? -2 : ExtendedFloatingActionButton.this.M0, ExtendedFloatingActionButton.this.N0 != 0 ? ExtendedFloatingActionButton.this.N0 : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.N0 == -1 ? this.f12566a.getHeight() : (ExtendedFloatingActionButton.this.N0 == 0 || ExtendedFloatingActionButton.this.N0 == -2) ? this.f12567b.getHeight() : ExtendedFloatingActionButton.this.N0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.G0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.F0;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC11055n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.M0 == -1 ? this.f12566a.getWidth() : (ExtendedFloatingActionButton.this.M0 == 0 || ExtendedFloatingActionButton.this.M0 == -2) ? this.f12567b.getWidth() : ExtendedFloatingActionButton.this.M0;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public class C11046e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f12569a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC11061b f12570b;

        public C11046e(InterfaceC11061b interfaceC11061b, AbstractC11053l abstractC11053l) {
            this.f12570b = interfaceC11061b;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12569a = true;
            this.f12570b.mo14632e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12570b.mo14626a();
            if (this.f12569a) {
                return;
            }
            this.f12570b.mo14631j(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f12570b.onAnimationStart(animator);
            this.f12569a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public class C11047f extends Property {
        public C11047f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    public class C11048g extends Property {
        public C11048g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public class C11049h extends Property {
        public C11049h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.setPaddingRelative(f.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    public class C11050i extends Property {
        public C11050i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public class C11051j extends ee1 {

        /* renamed from: g */
        public final InterfaceC11055n f12572g;

        /* renamed from: h */
        public final boolean f12573h;

        public C11051j(mh0 mh0Var, InterfaceC11055n interfaceC11055n, boolean z) {
            super(ExtendedFloatingActionButton.this, mh0Var);
            this.f12572g = interfaceC11055n;
            this.f12573h = z;
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: a */
        public void mo14626a() {
            super.mo14626a();
            ExtendedFloatingActionButton.this.J0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f12572g.mo14617a().width;
            layoutParams.height = this.f12572g.mo14617a().height;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: b */
        public void mo14627b() {
            ExtendedFloatingActionButton.this.I0 = this.f12573h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f12573h) {
                ExtendedFloatingActionButton.this.M0 = layoutParams.width;
                ExtendedFloatingActionButton.this.N0 = layoutParams.height;
            }
            layoutParams.width = this.f12572g.mo14617a().width;
            layoutParams.height = this.f12572g.mo14617a().height;
            if (this.f12573h) {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                extendedFloatingActionButton.m14607J(extendedFloatingActionButton.L0);
            } else if (ExtendedFloatingActionButton.this.getText() != null && ExtendedFloatingActionButton.this.getText() != "") {
                ExtendedFloatingActionButton.this.m14607J(ColorStateList.valueOf(0));
            }
            ExtendedFloatingActionButton.this.setPaddingRelative(this.f12572g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f12572g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: d */
        public boolean mo14628d() {
            return this.f12573h == ExtendedFloatingActionButton.this.I0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: f */
        public int mo14629f() {
            return this.f12573h ? s5e.mtrl_extended_fab_change_size_expand_motion_spec : s5e.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: h */
        public AnimatorSet mo14630h() {
            smb smbVarM24837m = m24837m();
            if (smbVarM24837m.m48554j("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrM48551g = smbVarM24837m.m48551g("width");
                propertyValuesHolderArrM48551g[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f12572g.getWidth());
                smbVarM24837m.m48556l("width", propertyValuesHolderArrM48551g);
            }
            if (smbVarM24837m.m48554j("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrM48551g2 = smbVarM24837m.m48551g("height");
                propertyValuesHolderArrM48551g2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f12572g.getHeight());
                smbVarM24837m.m48556l("height", propertyValuesHolderArrM48551g2);
            }
            if (smbVarM24837m.m48554j("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrM48551g3 = smbVarM24837m.m48551g("paddingStart");
                propertyValuesHolderArrM48551g3[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingStart(), this.f12572g.getPaddingStart());
                smbVarM24837m.m48556l("paddingStart", propertyValuesHolderArrM48551g3);
            }
            if (smbVarM24837m.m48554j("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrM48551g4 = smbVarM24837m.m48551g("paddingEnd");
                propertyValuesHolderArrM48551g4[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingEnd(), this.f12572g.getPaddingEnd());
                smbVarM24837m.m48556l("paddingEnd", propertyValuesHolderArrM48551g4);
            }
            if (smbVarM24837m.m48554j("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrM48551g5 = smbVarM24837m.m48551g("labelOpacity");
                boolean z = this.f12573h;
                propertyValuesHolderArrM48551g5[0].setFloatValues(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                smbVarM24837m.m48556l("labelOpacity", propertyValuesHolderArrM48551g5);
            }
            return super.m24836l(smbVarM24837m);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: j */
        public void mo14631j(AbstractC11053l abstractC11053l) {
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.I0 = this.f12573h;
            ExtendedFloatingActionButton.this.J0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    public class C11052k extends ee1 {

        /* renamed from: g */
        public boolean f12575g;

        public C11052k(mh0 mh0Var) {
            super(ExtendedFloatingActionButton.this, mh0Var);
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: a */
        public void mo14626a() {
            super.mo14626a();
            ExtendedFloatingActionButton.this.x0 = 0;
            if (this.f12575g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: b */
        public void mo14627b() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: d */
        public boolean mo14628d() {
            return ExtendedFloatingActionButton.this.m14602E();
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: e */
        public void mo14632e() {
            super.mo14632e();
            this.f12575g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: f */
        public int mo14629f() {
            return s5e.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: j */
        public void mo14631j(AbstractC11053l abstractC11053l) {
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f12575g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.x0 = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    public static abstract class AbstractC11053l {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$m */
    public class C11054m extends ee1 {
        public C11054m(mh0 mh0Var) {
            super(ExtendedFloatingActionButton.this, mh0Var);
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: a */
        public void mo14626a() {
            super.mo14626a();
            ExtendedFloatingActionButton.this.x0 = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: b */
        public void mo14627b() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: d */
        public boolean mo14628d() {
            return ExtendedFloatingActionButton.this.m14603F();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: f */
        public int mo14629f() {
            return s5e.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC11061b
        /* renamed from: j */
        public void mo14631j(AbstractC11053l abstractC11053l) {
        }

        @Override // p001o.ee1, com.google.android.material.floatingactionbutton.InterfaceC11061b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.x0 = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n */
    public interface InterfaceC11055n {
        /* renamed from: a */
        ViewGroup.LayoutParams mo14617a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* renamed from: D */
    public final InterfaceC11055n m14601D(int i) {
        C11043b c11043b = new C11043b();
        C11044c c11044c = new C11044c(c11043b);
        return i != 1 ? i != 2 ? new C11045d(c11044c, c11043b) : c11044c : c11043b;
    }

    /* renamed from: E */
    public final boolean m14602E() {
        return getVisibility() == 0 ? this.x0 == 1 : this.x0 != 2;
    }

    /* renamed from: F */
    public final boolean m14603F() {
        return getVisibility() != 0 ? this.x0 == 2 : this.x0 != 1;
    }

    /* renamed from: G */
    public final void m14604G(int i, AbstractC11053l abstractC11053l) {
        InterfaceC11061b interfaceC11061b;
        if (i == 0) {
            interfaceC11061b = this.C0;
        } else if (i == 1) {
            interfaceC11061b = this.D0;
        } else if (i == 2) {
            interfaceC11061b = this.A0;
        } else {
            if (i != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i);
            }
            interfaceC11061b = this.B0;
        }
        if (interfaceC11061b.mo14628d()) {
            return;
        }
        if (!m14606I()) {
            interfaceC11061b.mo14627b();
            interfaceC11061b.mo14631j(abstractC11053l);
            return;
        }
        if (i == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.M0 = layoutParams.width;
                this.N0 = layoutParams.height;
            } else {
                this.M0 = getWidth();
                this.N0 = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetMo14630h = interfaceC11061b.mo14630h();
        animatorSetMo14630h.addListener(new C11046e(interfaceC11061b, abstractC11053l));
        Iterator it = interfaceC11061b.mo14723i().iterator();
        while (it.hasNext()) {
            animatorSetMo14630h.addListener((Animator.AnimatorListener) it.next());
        }
        animatorSetMo14630h.start();
    }

    /* renamed from: H */
    public final void m14605H() {
        this.L0 = getTextColors();
    }

    /* renamed from: I */
    public final boolean m14606I() {
        return this.y0 && (isLaidOut() || (!m14603F() && this.K0)) && !isInEditMode();
    }

    /* renamed from: J */
    public void m14607J(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC2009b
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.H0;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.E0;
        return i < 0 ? (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize() : i;
    }

    public smb getExtendMotionSpec() {
        return this.B0.mo14721c();
    }

    public smb getHideMotionSpec() {
        return this.D0.mo14721c();
    }

    public smb getShowMotionSpec() {
        return this.C0.mo14721c();
    }

    public smb getShrinkMotionSpec() {
        return this.A0.mo14721c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.I0 = false;
            this.A0.mo14627b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.K0 = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.y0 = z;
    }

    public void setExtendMotionSpec(smb smbVar) {
        this.B0.mo14722g(smbVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(smb.m48547d(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.I0 == z) {
            return;
        }
        InterfaceC11061b interfaceC11061b = z ? this.B0 : this.A0;
        if (interfaceC11061b.mo14628d()) {
            return;
        }
        interfaceC11061b.mo14627b();
    }

    public void setHideMotionSpec(smb smbVar) {
        this.D0.mo14722g(smbVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(smb.m48547d(getContext(), i));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.I0 || this.J0) {
            return;
        }
        this.F0 = getPaddingStart();
        this.G0 = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.I0 || this.J0) {
            return;
        }
        this.F0 = i;
        this.G0 = i3;
    }

    public void setShowMotionSpec(smb smbVar) {
        this.C0.mo14722g(smbVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(smb.m48547d(getContext(), i));
    }

    public void setShrinkMotionSpec(smb smbVar) {
        this.A0.mo14722g(smbVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(smb.m48547d(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        m14605H();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x5e.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f12559a;

        /* renamed from: b */
        public boolean f12560b;

        /* renamed from: c */
        public boolean f12561c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f12560b = false;
            this.f12561c = true;
        }

        /* renamed from: K */
        public static boolean m14608K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C2012e) {
                return ((CoordinatorLayout.C2012e) layoutParams).m5798f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: I */
        public void m14609I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m14604G(this.f12561c ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean mo5769f(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo5769f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean mo5775l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m14615P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!m14608K(view)) {
                return false;
            }
            m14616Q(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo5779p(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List listM5755v = coordinatorLayout.m5755v(extendedFloatingActionButton);
            int size = listM5755v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) listM5755v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m14608K(view) && m14616Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m14615P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m5737M(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: N */
        public final boolean m14613N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f12560b || this.f12561c) && ((CoordinatorLayout.C2012e) extendedFloatingActionButton.getLayoutParams()).m5797e() == view.getId();
        }

        /* renamed from: O */
        public void m14614O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m14604G(this.f12561c ? 2 : 1, null);
        }

        /* renamed from: P */
        public final boolean m14615P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m14613N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f12559a == null) {
                this.f12559a = new Rect();
            }
            Rect rect = this.f12559a;
            km5.m35901a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m14614O(extendedFloatingActionButton);
                return true;
            }
            m14609I(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: Q */
        public final boolean m14616Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m14613N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C2012e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m14614O(extendedFloatingActionButton);
                return true;
            }
            m14609I(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: k */
        public void mo5774k(CoordinatorLayout.C2012e c2012e) {
            if (c2012e.f7102h == 0) {
                c2012e.f7102h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.ExtendedFloatingActionButton_Behavior_Layout);
            this.f12560b = typedArrayObtainStyledAttributes.getBoolean(ebe.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f12561c = typedArrayObtainStyledAttributes.getBoolean(ebe.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = P0;
        super(gza.m29680d(context, attributeSet, i, i2), attributeSet, i);
        this.x0 = 0;
        this.y0 = true;
        mh0 mh0Var = new mh0();
        this.z0 = mh0Var;
        C11054m c11054m = new C11054m(mh0Var);
        this.C0 = c11054m;
        C11052k c11052k = new C11052k(mh0Var);
        this.D0 = c11052k;
        this.I0 = true;
        this.J0 = false;
        this.K0 = false;
        Context context2 = getContext();
        this.H0 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayM19305i = bkh.m19305i(context2, attributeSet, ebe.ExtendedFloatingActionButton, i, i2, new int[0]);
        smb smbVarM48546c = smb.m48546c(context2, typedArrayM19305i, ebe.ExtendedFloatingActionButton_showMotionSpec);
        smb smbVarM48546c2 = smb.m48546c(context2, typedArrayM19305i, ebe.ExtendedFloatingActionButton_hideMotionSpec);
        smb smbVarM48546c3 = smb.m48546c(context2, typedArrayM19305i, ebe.ExtendedFloatingActionButton_extendMotionSpec);
        smb smbVarM48546c4 = smb.m48546c(context2, typedArrayM19305i, ebe.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.E0 = typedArrayM19305i.getDimensionPixelSize(ebe.ExtendedFloatingActionButton_collapsedSize, -1);
        int i3 = typedArrayM19305i.getInt(ebe.ExtendedFloatingActionButton_extendStrategy, 1);
        this.O0 = i3;
        this.F0 = getPaddingStart();
        this.G0 = getPaddingEnd();
        mh0 mh0Var2 = new mh0();
        C11051j c11051j = new C11051j(mh0Var2, m14601D(i3), true);
        this.B0 = c11051j;
        C11051j c11051j2 = new C11051j(mh0Var2, new C11042a(), false);
        this.A0 = c11051j2;
        c11054m.mo14722g(smbVarM48546c);
        c11052k.mo14722g(smbVarM48546c2);
        c11051j.mo14722g(smbVarM48546c3);
        c11051j2.mo14722g(smbVarM48546c4);
        typedArrayM19305i.recycle();
        setShapeAppearanceModel(ykf.m57927g(context2, attributeSet, i, i2, ykf.f55640m).m57970m());
        m14605H();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m14605H();
    }
}
