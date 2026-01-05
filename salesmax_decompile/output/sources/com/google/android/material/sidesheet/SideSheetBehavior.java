package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p001o.bue;
import p001o.cc;
import p001o.dza;
import p001o.ebe;
import p001o.fwi;
import p001o.gh0;
import p001o.jc;
import p001o.l91;
import p001o.lba;
import p001o.opf;
import p001o.pae;
import p001o.pza;
import p001o.qta;
import p001o.rnf;
import p001o.tq;
import p001o.v9e;
import p001o.wvi;
import p001o.ykf;
import p001o.yya;
import p001o.zya;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements qta {
    public static final int n0 = v9e.side_sheet_accessibility_pane_title;
    public static final int o0 = pae.Widget_Material3_SideSheet;

    /* renamed from: H */
    public float f12877H;

    /* renamed from: L */
    public int f12878L;

    /* renamed from: M */
    public int f12879M;

    /* renamed from: Q */
    public int f12880Q;

    /* renamed from: X */
    public int f12881X;

    /* renamed from: Y */
    public WeakReference f12882Y;

    /* renamed from: Z */
    public WeakReference f12883Z;

    /* renamed from: a */
    public rnf f12884a;

    /* renamed from: b */
    public float f12885b;

    /* renamed from: c */
    public zya f12886c;

    /* renamed from: d */
    public ColorStateList f12887d;

    /* renamed from: e */
    public ykf f12888e;

    /* renamed from: f */
    public final C11099c f12889f;

    /* renamed from: g */
    public float f12890g;

    /* renamed from: h */
    public boolean f12891h;
    public int h0;
    public VelocityTracker i0;
    public dza j0;
    public int k0;
    public final Set l0;
    public final fwi.AbstractC13588c m0;

    /* renamed from: q */
    public int f12892q;

    /* renamed from: s */
    public int f12893s;

    /* renamed from: x */
    public fwi f12894x;

    /* renamed from: y */
    public boolean f12895y;

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$a */
    public class C11097a extends fwi.AbstractC13588c {
        public C11097a() {
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return pza.m44556b(i, SideSheetBehavior.this.f12884a.mo19830g(), SideSheetBehavior.this.f12884a.mo19829f());
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p001o.fwi.AbstractC13588c
        public int getViewHorizontalDragRange(View view) {
            return SideSheetBehavior.this.f12878L + SideSheetBehavior.this.k0();
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewDragStateChanged(int i) {
            if (i == 1 && SideSheetBehavior.this.f12891h) {
                SideSheetBehavior.this.J0(1);
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewF0 = SideSheetBehavior.this.f0();
            if (viewF0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f12884a.mo19839p(marginLayoutParams, view.getLeft(), view.getRight());
                viewF0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i);
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewReleased(View view, float f, float f2) {
            int iM15049W = SideSheetBehavior.this.m15049W(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.O0(view, iM15049W, sideSheetBehavior.N0());
        }

        @Override // p001o.fwi.AbstractC13588c
        public boolean tryCaptureView(View view, int i) {
            return (SideSheetBehavior.this.f12892q == 1 || SideSheetBehavior.this.f12882Y == null || SideSheetBehavior.this.f12882Y.get() != view) ? false : true;
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$b */
    public class C11098b extends AnimatorListenerAdapter {
        public C11098b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.J0(5);
            if (SideSheetBehavior.this.f12882Y == null || SideSheetBehavior.this.f12882Y.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f12882Y.get()).requestLayout();
        }
    }

    /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$c */
    public class C11099c {

        /* renamed from: a */
        public int f12899a;

        /* renamed from: b */
        public boolean f12900b;

        /* renamed from: c */
        public final Runnable f12901c = new Runnable() { // from class: o.hrf
            @Override // java.lang.Runnable
            public final void run() {
                this.f27408a.m15057c();
            }
        };

        public C11099c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m15057c() {
            this.f12900b = false;
            if (SideSheetBehavior.this.f12894x != null && SideSheetBehavior.this.f12894x.m27698n(true)) {
                m15058b(this.f12899a);
            } else if (SideSheetBehavior.this.f12892q == 2) {
                SideSheetBehavior.this.J0(this.f12899a);
            }
        }

        /* renamed from: b */
        public void m15058b(int i) {
            if (SideSheetBehavior.this.f12882Y == null || SideSheetBehavior.this.f12882Y.get() == null) {
                return;
            }
            this.f12899a = i;
            if (this.f12900b) {
                return;
            }
            ((View) SideSheetBehavior.this.f12882Y.get()).postOnAnimation(this.f12901c);
            this.f12900b = true;
        }
    }

    public SideSheetBehavior() {
        this.f12889f = new C11099c();
        this.f12891h = true;
        this.f12892q = 5;
        this.f12893s = 5;
        this.f12877H = 0.1f;
        this.h0 = -1;
        this.l0 = new LinkedHashSet();
        this.m0 = new C11097a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean x0(int i, View view, jc.AbstractC14493a abstractC14493a) {
        I0(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, ValueAnimator valueAnimator) {
        this.f12884a.mo19838o(marginLayoutParams, gh0.m28649c(i, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(int i) {
        View view = (View) this.f12882Y.get();
        if (view != null) {
            O0(view, i, false);
        }
    }

    public final void A0(CoordinatorLayout coordinatorLayout) {
        int i;
        View viewFindViewById;
        if (this.f12883Z != null || (i = this.h0) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.f12883Z = new WeakReference(viewFindViewById);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: B */
    public void mo5761B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.m5953a() != null) {
            super.mo5761B(coordinatorLayout, view, savedState.m5953a());
        }
        int i = savedState.f12896c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f12892q = i;
        this.f12893s = i;
    }

    public final void B0(View view, cc.C12624a c12624a, int i) {
        wvi.i0(view, c12624a, null, m15051Y(i));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: C */
    public Parcelable mo5762C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.mo5762C(coordinatorLayout, view), this);
    }

    public final void C0() {
        VelocityTracker velocityTracker = this.i0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.i0 = null;
        }
    }

    public final void D0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void E0(int i) {
        this.h0 = i;
        m15050X();
        WeakReference weakReference = this.f12882Y;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    public void F0(boolean z) {
        this.f12891h = z;
    }

    public final void G0(int i) {
        rnf rnfVar = this.f12884a;
        if (rnfVar == null || rnfVar.mo19833j() != i) {
            if (i == 0) {
                this.f12884a = new bue(this);
                if (this.f12888e == null || s0()) {
                    return;
                }
                ykf.C18426b c18426bM57943w = this.f12888e.m57943w();
                c18426bM57943w.m57968I(0.0f).m57982z(0.0f);
                R0(c18426bM57943w.m57970m());
                return;
            }
            if (i == 1) {
                this.f12884a = new lba(this);
                if (this.f12888e == null || r0()) {
                    return;
                }
                ykf.C18426b c18426bM57943w2 = this.f12888e.m57943w();
                c18426bM57943w2.m57964E(0.0f).m57978v(0.0f);
                R0(c18426bM57943w2.m57970m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1.");
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: H */
    public boolean mo5767H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f12892q == 1 && actionMasked == 0) {
            return true;
        }
        if (K0()) {
            this.f12894x.m27672G(motionEvent);
        }
        if (actionMasked == 0) {
            C0();
        }
        if (this.i0 == null) {
            this.i0 = VelocityTracker.obtain();
        }
        this.i0.addMovement(motionEvent);
        if (K0() && actionMasked == 2 && !this.f12895y && t0(motionEvent)) {
            this.f12894x.m27687c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f12895y;
    }

    public final void H0(View view, int i) {
        G0(Gravity.getAbsoluteGravity(((CoordinatorLayout.C2012e) view.getLayoutParams()).f7097c, i) == 3 ? 1 : 0);
    }

    public void I0(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f12882Y;
        if (weakReference == null || weakReference.get() == null) {
            J0(i);
        } else {
            D0((View) this.f12882Y.get(), new Runnable() { // from class: o.grf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25736a.z0(i);
                }
            });
        }
    }

    public void J0(int i) {
        View view;
        if (this.f12892q == i) {
            return;
        }
        this.f12892q = i;
        if (i == 3 || i == 5) {
            this.f12893s = i;
        }
        WeakReference weakReference = this.f12882Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        S0(view);
        Iterator it = this.l0.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
        P0();
    }

    public final boolean K0() {
        return this.f12894x != null && (this.f12891h || this.f12892q == 1);
    }

    public boolean L0(View view, float f) {
        return this.f12884a.mo19837n(view, f);
    }

    public final boolean M0(View view) {
        return (view.isShown() || wvi.m55128o(view) != null) && this.f12891h;
    }

    public boolean N0() {
        return true;
    }

    public final void O0(View view, int i, boolean z) {
        if (!w0(view, i, z)) {
            J0(i);
        } else {
            J0(2);
            this.f12889f.m15058b(i);
        }
    }

    public final void P0() {
        View view;
        WeakReference weakReference = this.f12882Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        wvi.g0(view, 262144);
        wvi.g0(view, 1048576);
        if (this.f12892q != 5) {
            B0(view, cc.C12624a.f17813y, 5);
        }
        if (this.f12892q != 3) {
            B0(view, cc.C12624a.f17811w, 3);
        }
    }

    public final void Q0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f12882Y;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f12882Y.get();
        View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return;
        }
        this.f12884a.mo19838o(marginLayoutParams, (int) ((this.f12878L * view.getScaleX()) + this.f12881X));
        viewF0.requestLayout();
    }

    public final void R0(ykf ykfVar) {
        zya zyaVar = this.f12886c;
        if (zyaVar != null) {
            zyaVar.setShapeAppearanceModel(ykfVar);
        }
    }

    public final void S0(View view) {
        int i = this.f12892q == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: U */
    public final int m15047U(int i, View view) {
        int i2 = this.f12892q;
        if (i2 == 1 || i2 == 2) {
            return i - this.f12884a.mo19831h(view);
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 5) {
            return this.f12884a.mo19828e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f12892q);
    }

    /* renamed from: V */
    public final float m15048V(float f, float f2) {
        return Math.abs(f - f2);
    }

    /* renamed from: W */
    public final int m15049W(View view, float f, float f2) {
        if (u0(f)) {
            return 3;
        }
        if (L0(view, f)) {
            if (!this.f12884a.mo19836m(f, f2) && !this.f12884a.mo19835l(view)) {
                return 3;
            }
        } else if (f == 0.0f || !opf.m42538a(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - g0()) < Math.abs(left - this.f12884a.mo19828e())) {
                return 3;
            }
        }
        return 5;
    }

    /* renamed from: X */
    public final void m15050X() {
        WeakReference weakReference = this.f12883Z;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f12883Z = null;
    }

    /* renamed from: Y */
    public final jc m15051Y(final int i) {
        return new jc() { // from class: o.erf
            @Override // p001o.jc
            /* renamed from: a */
            public final boolean mo6030a(View view, jc.AbstractC14493a abstractC14493a) {
                return this.f22091a.x0(i, view, abstractC14493a);
            }
        };
    }

    /* renamed from: Z */
    public final void m15052Z(Context context) {
        if (this.f12888e == null) {
            return;
        }
        zya zyaVar = new zya(this.f12888e);
        this.f12886c = zyaVar;
        zyaVar.m60115U(context);
        ColorStateList colorStateList = this.f12887d;
        if (colorStateList != null) {
            this.f12886c.g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f12886c.setTint(typedValue.data);
    }

    @Override // p001o.qta
    /* renamed from: a */
    public void mo14172a() {
        dza dzaVar = this.j0;
        if (dzaVar == null) {
            return;
        }
        dzaVar.m23963f();
    }

    public final void a0(View view, int i) {
        if (this.l0.isEmpty()) {
            return;
        }
        this.f12884a.mo19825b(i);
        Iterator it = this.l0.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    @Override // p001o.qta
    /* renamed from: b */
    public void mo14173b(l91 l91Var) {
        dza dzaVar = this.j0;
        if (dzaVar == null) {
            return;
        }
        dzaVar.m23967j(l91Var);
    }

    public final void b0(View view) {
        if (wvi.m55128o(view) == null) {
            wvi.o0(view, view.getResources().getString(n0));
        }
    }

    @Override // p001o.qta
    /* renamed from: c */
    public void mo14174c(l91 l91Var) {
        dza dzaVar = this.j0;
        if (dzaVar == null) {
            return;
        }
        dzaVar.m23969l(l91Var, h0());
        Q0();
    }

    public final int c0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    @Override // p001o.qta
    /* renamed from: d */
    public void mo14175d() {
        dza dzaVar = this.j0;
        if (dzaVar == null) {
            return;
        }
        l91 l91VarM44148c = dzaVar.m44148c();
        if (l91VarM44148c == null || Build.VERSION.SDK_INT < 34) {
            I0(5);
        } else {
            this.j0.m23965h(l91VarM44148c, h0(), new C11098b(), e0());
        }
    }

    public int d0() {
        return this.f12878L;
    }

    public final ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewF0 = f0();
        if (viewF0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewF0.getLayoutParams()) == null) {
            return null;
        }
        final int iMo19826c = this.f12884a.mo19826c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.frf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f23984a.y0(marginLayoutParams, iMo19826c, viewF0, valueAnimator);
            }
        };
    }

    public View f0() {
        WeakReference weakReference = this.f12883Z;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f12884a.mo19827d();
    }

    public final int h0() {
        rnf rnfVar = this.f12884a;
        return (rnfVar == null || rnfVar.mo19833j() == 0) ? 5 : 3;
    }

    public float i0() {
        return this.f12877H;
    }

    public float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public void mo5774k(CoordinatorLayout.C2012e c2012e) {
        super.mo5774k(c2012e);
        this.f12882Y = null;
        this.f12894x = null;
        this.j0 = null;
    }

    public int k0() {
        return this.f12881X;
    }

    public int l0(int i) {
        if (i == 3) {
            return g0();
        }
        if (i == 5) {
            return this.f12884a.mo19828e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
    }

    public int m0() {
        return this.f12880Q;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: n */
    public void mo5777n() {
        super.mo5777n();
        this.f12882Y = null;
        this.f12894x = null;
        this.j0 = null;
    }

    public int n0() {
        return this.f12879M;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: o */
    public boolean mo5778o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        fwi fwiVar;
        if (!M0(view)) {
            this.f12895y = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            C0();
        }
        if (this.i0 == null) {
            this.i0 = VelocityTracker.obtain();
        }
        this.i0.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.k0 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f12895y) {
            this.f12895y = false;
            return false;
        }
        return (this.f12895y || (fwiVar = this.f12894x) == null || !fwiVar.m27682Q(motionEvent)) ? false : true;
    }

    public int o0() {
        return 500;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f12882Y == null) {
            this.f12882Y = new WeakReference(view);
            this.j0 = new dza(view);
            zya zyaVar = this.f12886c;
            if (zyaVar != null) {
                view.setBackground(zyaVar);
                zya zyaVar2 = this.f12886c;
                float elevation = this.f12890g;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                zyaVar2.f0(elevation);
            } else {
                ColorStateList colorStateList = this.f12887d;
                if (colorStateList != null) {
                    wvi.q0(view, colorStateList);
                }
            }
            S0(view);
            P0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            b0(view);
        }
        H0(view, i);
        if (this.f12894x == null) {
            this.f12894x = fwi.m27665p(coordinatorLayout, this.m0);
        }
        int iMo19831h = this.f12884a.mo19831h(view);
        coordinatorLayout.m5737M(view, i);
        this.f12879M = coordinatorLayout.getWidth();
        this.f12880Q = this.f12884a.mo19832i(coordinatorLayout);
        this.f12878L = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f12881X = marginLayoutParams != null ? this.f12884a.mo19824a(marginLayoutParams) : 0;
        wvi.m55110W(view, m15047U(iMo19831h, view));
        A0(coordinatorLayout);
        Iterator it = this.l0.iterator();
        while (it.hasNext()) {
            tq.m50332a(it.next());
        }
        return true;
    }

    public fwi p0() {
        return this.f12894x;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: q */
    public boolean mo5780q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(c0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), c0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    public final CoordinatorLayout.C2012e q0() {
        View view;
        WeakReference weakReference = this.f12882Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.C2012e)) {
            return null;
        }
        return (CoordinatorLayout.C2012e) view.getLayoutParams();
    }

    public final boolean r0() {
        CoordinatorLayout.C2012e c2012eQ0 = q0();
        return c2012eQ0 != null && ((ViewGroup.MarginLayoutParams) c2012eQ0).leftMargin > 0;
    }

    public final boolean s0() {
        CoordinatorLayout.C2012e c2012eQ0 = q0();
        return c2012eQ0 != null && ((ViewGroup.MarginLayoutParams) c2012eQ0).rightMargin > 0;
    }

    public final boolean t0(MotionEvent motionEvent) {
        return K0() && m15048V((float) this.k0, motionEvent.getX()) > ((float) this.f12894x.m27666A());
    }

    public final boolean u0(float f) {
        return this.f12884a.mo19834k(f);
    }

    public final boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    public final boolean w0(View view, int i, boolean z) {
        int iL0 = l0(i);
        fwi fwiVarP0 = p0();
        return fwiVarP0 != null && (!z ? !fwiVarP0.m27683R(view, iL0, view.getTop()) : !fwiVarP0.m27681P(iL0, view.getTop()));
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11096a();

        /* renamed from: c */
        public final int f12896c;

        /* renamed from: com.google.android.material.sidesheet.SideSheetBehavior$SavedState$a */
        public class C11096a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12896c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12896c);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f12896c = sideSheetBehavior.f12892q;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12889f = new C11099c();
        this.f12891h = true;
        this.f12892q = 5;
        this.f12893s = 5;
        this.f12877H = 0.1f;
        this.h0 = -1;
        this.l0 = new LinkedHashSet();
        this.m0 = new C11097a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.SideSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(ebe.SideSheetBehavior_Layout_backgroundTint)) {
            this.f12887d = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.SideSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ebe.SideSheetBehavior_Layout_shapeAppearance)) {
            this.f12888e = ykf.m57925e(context, attributeSet, 0, o0).m57970m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(ebe.SideSheetBehavior_Layout_coplanarSiblingViewId)) {
            E0(typedArrayObtainStyledAttributes.getResourceId(ebe.SideSheetBehavior_Layout_coplanarSiblingViewId, -1));
        }
        m15052Z(context);
        this.f12890g = typedArrayObtainStyledAttributes.getDimension(ebe.SideSheetBehavior_Layout_android_elevation, -1.0f);
        F0(typedArrayObtainStyledAttributes.getBoolean(ebe.SideSheetBehavior_Layout_behavior_draggable, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f12885b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
