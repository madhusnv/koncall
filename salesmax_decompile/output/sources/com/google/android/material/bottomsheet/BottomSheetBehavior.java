package com.google.android.material.bottomsheet;

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
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.cc;
import p001o.ebe;
import p001o.fwi;
import p001o.jc;
import p001o.l91;
import p001o.pae;
import p001o.pza;
import p001o.qta;
import p001o.r9j;
import p001o.sj8;
import p001o.tj8;
import p001o.uta;
import p001o.v9e;
import p001o.wvi;
import p001o.x5e;
import p001o.x6e;
import p001o.xzi;
import p001o.ykf;
import p001o.yya;
import p001o.zya;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements qta {
    public static final int Y0 = pae.Widget_Design_BottomSheet_Modal;
    public boolean A0;
    public boolean B0;
    public int C0;
    public int D0;
    public fwi E0;
    public boolean F0;
    public int G0;

    /* renamed from: H */
    public int f12152H;
    public boolean H0;
    public float I0;
    public int J0;
    public int K0;

    /* renamed from: L */
    public int f12153L;
    public int L0;

    /* renamed from: M */
    public boolean f12154M;
    public WeakReference M0;
    public WeakReference N0;
    public WeakReference O0;
    public final ArrayList P0;

    /* renamed from: Q */
    public boolean f12155Q;
    public VelocityTracker Q0;
    public uta R0;
    public int S0;
    public int T0;
    public boolean U0;
    public Map V0;
    public final SparseIntArray W0;

    /* renamed from: X */
    public boolean f12156X;
    public final fwi.AbstractC13588c X0;

    /* renamed from: Y */
    public boolean f12157Y;

    /* renamed from: Z */
    public boolean f12158Z;

    /* renamed from: a */
    public int f12159a;

    /* renamed from: b */
    public boolean f12160b;

    /* renamed from: c */
    public boolean f12161c;

    /* renamed from: d */
    public float f12162d;

    /* renamed from: e */
    public int f12163e;

    /* renamed from: f */
    public int f12164f;

    /* renamed from: g */
    public boolean f12165g;

    /* renamed from: h */
    public int f12166h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public int l0;
    public boolean m0;
    public ykf n0;
    public boolean o0;
    public final C10968h p0;

    /* renamed from: q */
    public int f12167q;
    public ValueAnimator q0;
    public int r0;

    /* renamed from: s */
    public zya f12168s;
    public int s0;
    public int t0;
    public float u0;
    public int v0;
    public float w0;

    /* renamed from: x */
    public ColorStateList f12169x;
    public boolean x0;

    /* renamed from: y */
    public int f12170y;
    public boolean y0;
    public boolean z0;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class RunnableC10961a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f12176a;

        /* renamed from: b */
        public final /* synthetic */ int f12177b;

        public RunnableC10961a(View view, int i) {
            this.f12176a = view;
            this.f12177b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.h1(this.f12176a, this.f12177b, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C10962b extends AnimatorListenerAdapter {
        public C10962b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.a1(5);
            WeakReference weakReference = BottomSheetBehavior.this.M0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.M0.get()).requestLayout();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C10963c implements ValueAnimator.AnimatorUpdateListener {
        public C10963c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f12168s != null) {
                BottomSheetBehavior.this.f12168s.h0(fFloatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C10964d implements xzi.InterfaceC18287d {

        /* renamed from: a */
        public final /* synthetic */ boolean f12181a;

        public C10964d(boolean z) {
            this.f12181a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // p001o.xzi.InterfaceC18287d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public r9j mo14146a(View view, r9j r9jVar, xzi.C18288e c18288e) {
            boolean z;
            sj8 sj8VarM46391f = r9jVar.m46391f(r9j.C16576m.m46449e());
            sj8 sj8VarM46391f2 = r9jVar.m46391f(r9j.C16576m.m46448d());
            BottomSheetBehavior.this.l0 = sj8VarM46391f.f45478b;
            boolean zM57079o = xzi.m57079o(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f12155Q) {
                BottomSheetBehavior.this.k0 = r9jVar.m46394i();
                paddingBottom = c18288e.f54661d + BottomSheetBehavior.this.k0;
            }
            if (BottomSheetBehavior.this.f12156X) {
                paddingLeft = (zM57079o ? c18288e.f54660c : c18288e.f54658a) + sj8VarM46391f.f45477a;
            }
            if (BottomSheetBehavior.this.f12157Y) {
                paddingRight = (zM57079o ? c18288e.f54658a : c18288e.f54660c) + sj8VarM46391f.f45479c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z2 = true;
            if (BottomSheetBehavior.this.h0) {
                int i = marginLayoutParams.leftMargin;
                int i2 = sj8VarM46391f.f45477a;
                if (i != i2) {
                    marginLayoutParams.leftMargin = i2;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (BottomSheetBehavior.this.i0) {
                int i3 = marginLayoutParams.rightMargin;
                int i4 = sj8VarM46391f.f45479c;
                if (i3 != i4) {
                    marginLayoutParams.rightMargin = i4;
                    z = true;
                }
            }
            if (BottomSheetBehavior.this.j0) {
                int i5 = marginLayoutParams.topMargin;
                int i6 = sj8VarM46391f.f45478b;
                if (i5 != i6) {
                    marginLayoutParams.topMargin = i6;
                } else {
                    z2 = z;
                }
            }
            if (z2) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f12181a) {
                BottomSheetBehavior.this.f12153L = sj8VarM46391f2.f45480d;
            }
            if (BottomSheetBehavior.this.f12155Q || this.f12181a) {
                BottomSheetBehavior.this.m1(false);
            }
            return r9jVar;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C10965e extends fwi.AbstractC13588c {

        /* renamed from: a */
        public long f12183a;

        public C10965e() {
        }

        /* renamed from: a */
        public final boolean m14179a(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.L0 + bottomSheetBehavior.s0()) / 2;
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return pza.m44556b(i, BottomSheetBehavior.this.s0(), getViewVerticalDragRange(view));
        }

        @Override // p001o.fwi.AbstractC13588c
        public int getViewVerticalDragRange(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.L0 : BottomSheetBehavior.this.v0;
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewDragStateChanged(int i) {
            if (i == 1 && BottomSheetBehavior.this.z0) {
                BottomSheetBehavior.this.a1(1);
            }
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.o0(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // p001o.fwi.AbstractC13588c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onViewReleased(View view, float f, float f2) {
            int i = 6;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.x0 && bottomSheetBehavior.e1(view, f2)) {
                    if ((Math.abs(f) < Math.abs(f2) && f2 > BottomSheetBehavior.this.f12163e) || m14179a(view)) {
                        i = 5;
                    } else if (BottomSheetBehavior.this.f12160b || Math.abs(view.getTop() - BottomSheetBehavior.this.s0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.t0)) {
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f12160b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i2 = bottomSheetBehavior2.t0;
                        if (top < i2) {
                            if (top >= Math.abs(top - bottomSheetBehavior2.v0)) {
                                if (BottomSheetBehavior.this.f1()) {
                                }
                            }
                        } else if (Math.abs(top - i2) >= Math.abs(top - BottomSheetBehavior.this.v0) || BottomSheetBehavior.this.f1()) {
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.s0) < Math.abs(top - BottomSheetBehavior.this.v0)) {
                    }
                } else if (!BottomSheetBehavior.this.f12160b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.t0) >= Math.abs(top2 - BottomSheetBehavior.this.v0) || BottomSheetBehavior.this.f1()) {
                    }
                }
            } else if (BottomSheetBehavior.this.f12160b) {
                i = 3;
            } else {
                int top3 = view.getTop();
                long jUptimeMillis = SystemClock.uptimeMillis() - this.f12183a;
                if (BottomSheetBehavior.this.f1()) {
                    if (!BottomSheetBehavior.this.c1(jUptimeMillis, (top3 * 100.0f) / r10.L0)) {
                        i = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.t0) {
                }
                i = 3;
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.h1(view, i, bottomSheetBehavior3.g1());
        }

        @Override // p001o.fwi.AbstractC13588c
        public boolean tryCaptureView(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.C0;
            if (i2 == 1 || bottomSheetBehavior.U0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.S0 == i) {
                WeakReference weakReference = bottomSheetBehavior.O0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f12183a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.M0;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class C10966f implements jc {

        /* renamed from: a */
        public final /* synthetic */ int f12185a;

        public C10966f(int i) {
            this.f12185a = i;
        }

        @Override // p001o.jc
        /* renamed from: a */
        public boolean mo6030a(View view, jc.AbstractC14493a abstractC14493a) {
            BottomSheetBehavior.this.Z0(this.f12185a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static abstract class AbstractC10967g {
        /* renamed from: a */
        public void mo14180a(View view) {
        }

        /* renamed from: b */
        public abstract void mo14181b(View view, float f);

        /* renamed from: c */
        public abstract void mo14182c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.f12159a = 0;
        this.f12160b = true;
        this.f12161c = false;
        this.f12170y = -1;
        this.f12152H = -1;
        this.p0 = new C10968h(this, null);
        this.u0 = 0.5f;
        this.w0 = -1.0f;
        this.z0 = true;
        this.A0 = true;
        this.C0 = 4;
        this.D0 = 4;
        this.I0 = 0.1f;
        this.P0 = new ArrayList();
        this.T0 = -1;
        this.W0 = new SparseIntArray();
        this.X0 = new C10965e();
    }

    public static BottomSheetBehavior q0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.C2012e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behaviorM5798f = ((CoordinatorLayout.C2012e) layoutParams).m5798f();
        if (behaviorM5798f instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behaviorM5798f;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public boolean A0() {
        return this.f12154M;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: B */
    public void mo5761B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo5761B(coordinatorLayout, view, savedState.m5953a());
        I0(savedState);
        int i = savedState.f12171c;
        if (i == 1 || i == 2) {
            this.C0 = 4;
            this.D0 = 4;
        } else {
            this.C0 = i;
            this.D0 = i;
        }
    }

    public boolean B0() {
        return this.x0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: C */
    public Parcelable mo5762C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.mo5762C(coordinatorLayout, view), this);
    }

    public boolean C0() {
        return true;
    }

    public final boolean D0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: E */
    public boolean mo5764E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.G0 = 0;
        this.H0 = false;
        return (i & 2) != 0;
    }

    public boolean E0() {
        return true;
    }

    public void F0(AbstractC10967g abstractC10967g) {
        this.P0.remove(abstractC10967g);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo5766G(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        WeakReference weakReference;
        int i2 = 3;
        if (view.getTop() == s0()) {
            a1(3);
            return;
        }
        if (!E0() || ((weakReference = this.O0) != null && view2 == weakReference.get() && this.H0)) {
            if (this.G0 > 0) {
                if (!this.f12160b && view.getTop() > this.t0) {
                    i2 = 6;
                }
            } else if (this.x0 && e1(view, w0())) {
                i2 = 5;
            } else if (this.G0 == 0) {
                int top = view.getTop();
                if (!this.f12160b) {
                    int i3 = this.t0;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.v0)) {
                            if (f1()) {
                            }
                        }
                    } else if (Math.abs(top - i3) < Math.abs(top - this.v0)) {
                    }
                } else if (Math.abs(top - this.s0) >= Math.abs(top - this.v0)) {
                    i2 = 4;
                }
            } else {
                if (!this.f12160b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.t0) < Math.abs(top2 - this.v0)) {
                    }
                }
                i2 = 4;
            }
            h1(view, i2, false);
            this.H0 = false;
        }
    }

    public final void G0(View view, cc.C12624a c12624a, int i) {
        wvi.i0(view, c12624a, null, l0(i));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: H */
    public boolean mo5767H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.C0 == 1 && actionMasked == 0) {
            return true;
        }
        if (d1()) {
            this.E0.m27672G(motionEvent);
        }
        if (actionMasked == 0) {
            H0();
        }
        if (this.Q0 == null) {
            this.Q0 = VelocityTracker.obtain();
        }
        this.Q0.addMovement(motionEvent);
        if (d1() && actionMasked == 2 && !this.F0 && Math.abs(this.T0 - motionEvent.getY()) > this.E0.m27666A()) {
            this.E0.m27687c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.F0;
    }

    public final void H0() {
        this.S0 = -1;
        this.T0 = -1;
        VelocityTracker velocityTracker = this.Q0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Q0 = null;
        }
    }

    public final void I0(SavedState savedState) {
        int i = this.f12159a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f12164f = savedState.f12172d;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f12160b = savedState.f12173e;
        }
        if (i == -1 || (i & 4) == 4) {
            this.x0 = savedState.f12174f;
        }
        if (i == -1 || (i & 8) == 8) {
            this.y0 = savedState.f12175g;
        }
    }

    public final void J0(View view, Runnable runnable) {
        if (D0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void K0(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.N0) == null) {
            this.N0 = new WeakReference(view);
            j1(view, 1);
        } else {
            k0((View) weakReference.get(), 1);
            this.N0 = null;
        }
    }

    public void L0(boolean z) {
        this.z0 = z;
    }

    public void M0(boolean z) {
        this.A0 = z;
    }

    public void N0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.r0 = i;
        k1(this.C0, true);
    }

    public void O0(boolean z) {
        if (this.f12160b == z) {
            return;
        }
        this.f12160b = z;
        if (this.M0 != null) {
            d0();
        }
        a1((this.f12160b && this.C0 == 6) ? 3 : this.C0);
        k1(this.C0, true);
        i1();
    }

    public void P0(boolean z) {
        this.f12154M = z;
    }

    public void Q0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.u0 = f;
        if (this.M0 != null) {
            f0();
        }
    }

    public void R0(boolean z) {
        if (this.x0 != z) {
            this.x0 = z;
            if (!z && this.C0 == 5) {
                Z0(4);
            }
            i1();
        }
    }

    public void S0(int i) {
        this.f12152H = i;
    }

    public void T0(int i) {
        this.f12170y = i;
    }

    public void U0(int i) {
        V0(i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (this.f12165g) {
                z2 = false;
            } else {
                this.f12165g = true;
            }
        } else if (this.f12165g || this.f12164f != i) {
            this.f12165g = false;
            this.f12164f = Math.max(0, i);
        }
        if (z2) {
            m1(z);
        }
    }

    public void W0(int i) {
        this.f12159a = i;
    }

    public void X0(int i) {
        this.f12163e = i;
    }

    public void Y0(boolean z) {
        this.y0 = z;
    }

    public void Z0(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.x0 && i == 5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set state: ");
            sb2.append(i);
            return;
        }
        int i2 = (i == 6 && this.f12160b && v0(i) <= this.s0) ? 3 : i;
        WeakReference weakReference = this.M0;
        if (weakReference == null || weakReference.get() == null) {
            a1(i);
        } else {
            View view = (View) this.M0.get();
            J0(view, new RunnableC10961a(view, i2));
        }
    }

    @Override // p001o.qta
    /* renamed from: a */
    public void mo14172a() {
        uta utaVar = this.R0;
        if (utaVar == null) {
            return;
        }
        utaVar.m52014f();
    }

    public void a1(int i) {
        View view;
        if (this.C0 == i) {
            return;
        }
        this.C0 = i;
        if (i == 4 || i == 3 || i == 6 || (this.x0 && i == 5)) {
            this.D0 = i;
        }
        WeakReference weakReference = this.M0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            l1(true);
        } else if (i == 6 || i == 5 || i == 4) {
            l1(false);
        }
        k1(i, true);
        for (int i2 = 0; i2 < this.P0.size(); i2++) {
            ((AbstractC10967g) this.P0.get(i2)).mo14182c(view, i);
        }
        i1();
    }

    @Override // p001o.qta
    /* renamed from: b */
    public void mo14173b(l91 l91Var) {
        uta utaVar = this.R0;
        if (utaVar == null) {
            return;
        }
        utaVar.m52018j(l91Var);
    }

    public final int b0(View view, int i, int i2) {
        return wvi.m55116c(view, view.getResources().getString(i), l0(i2));
    }

    public final void b1(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || A0() || this.f12165g) ? false : true;
        if (this.f12155Q || this.f12156X || this.f12157Y || this.h0 || this.i0 || this.j0 || z) {
            xzi.m57070f(view, new C10964d(z));
        }
    }

    @Override // p001o.qta
    /* renamed from: c */
    public void mo14174c(l91 l91Var) {
        uta utaVar = this.R0;
        if (utaVar == null) {
            return;
        }
        utaVar.m52020l(l91Var);
    }

    public void c0(AbstractC10967g abstractC10967g) {
        if (this.P0.contains(abstractC10967g)) {
            return;
        }
        this.P0.add(abstractC10967g);
    }

    public boolean c1(long j, float f) {
        return false;
    }

    @Override // p001o.qta
    /* renamed from: d */
    public void mo14175d() {
        uta utaVar = this.R0;
        if (utaVar == null) {
            return;
        }
        l91 l91VarM44148c = utaVar.m44148c();
        if (l91VarM44148c == null || Build.VERSION.SDK_INT < 34) {
            Z0(this.x0 ? 5 : 4);
        } else if (this.x0) {
            this.R0.m52016h(l91VarM44148c, new C10962b());
        } else {
            this.R0.m52017i(l91VarM44148c, null);
            Z0(4);
        }
    }

    public final void d0() {
        int iH0 = h0();
        if (this.f12160b) {
            this.v0 = Math.max(this.L0 - iH0, this.s0);
        } else {
            this.v0 = this.L0 - iH0;
        }
    }

    public final boolean d1() {
        return this.E0 != null && (this.z0 || this.C0 == 1);
    }

    public final float e0(float f, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f > 0.0f) {
                return radius / f;
            }
        }
        return 0.0f;
    }

    public boolean e1(View view, float f) {
        if (this.y0) {
            return true;
        }
        if (C0() && view.getTop() >= this.v0) {
            return Math.abs((((float) view.getTop()) + (f * this.I0)) - ((float) this.v0)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    public final void f0() {
        this.t0 = (int) (this.L0 * (1.0f - this.u0));
    }

    public boolean f1() {
        return false;
    }

    public final float g0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f12168s == null || (weakReference = this.M0) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.M0.get();
        if (!x0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(e0(this.f12168s.m60108N(), rootWindowInsets.getRoundedCorner(0)), e0(this.f12168s.m60109O(), rootWindowInsets.getRoundedCorner(1)));
    }

    public boolean g1() {
        return true;
    }

    public final int h0() {
        int i;
        return this.f12165g ? Math.min(Math.max(this.f12166h, this.L0 - ((this.K0 * 9) / 16)), this.J0) + this.k0 : (this.f12154M || this.f12155Q || (i = this.f12153L) <= 0) ? this.f12164f + this.k0 : Math.max(this.f12164f, i + this.f12167q);
    }

    public final void h1(View view, int i, boolean z) {
        int iV0 = v0(i);
        fwi fwiVar = this.E0;
        if (!(fwiVar != null && (!z ? !fwiVar.m27683R(view, view.getLeft(), iV0) : !fwiVar.m27681P(view.getLeft(), iV0)))) {
            a1(i);
            return;
        }
        a1(2);
        k1(i, true);
        this.p0.m14185c(i);
    }

    public final float i0(int i) {
        float f;
        float fS0;
        int i2 = this.v0;
        if (i > i2 || i2 == s0()) {
            int i3 = this.v0;
            f = i3 - i;
            fS0 = this.L0 - i3;
        } else {
            int i4 = this.v0;
            f = i4 - i;
            fS0 = i4 - s0();
        }
        return f / fS0;
    }

    public final void i1() {
        WeakReference weakReference = this.M0;
        if (weakReference != null) {
            j1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.N0;
        if (weakReference2 != null) {
            j1((View) weakReference2.get(), 1);
        }
    }

    public final boolean j0() {
        return B0() && C0();
    }

    public final void j1(View view, int i) {
        if (view == null) {
            return;
        }
        k0(view, i);
        if (!this.f12160b && this.C0 != 6) {
            this.W0.put(i, b0(view, v9e.bottomsheet_action_expand_halfway, 6));
        }
        if (this.x0 && C0() && this.C0 != 5) {
            G0(view, cc.C12624a.f17813y, 5);
        }
        int i2 = this.C0;
        if (i2 == 3) {
            G0(view, cc.C12624a.f17812x, this.f12160b ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            G0(view, cc.C12624a.f17811w, this.f12160b ? 3 : 6);
        } else {
            if (i2 != 6) {
                return;
            }
            G0(view, cc.C12624a.f17812x, 4);
            G0(view, cc.C12624a.f17811w, 3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public void mo5774k(CoordinatorLayout.C2012e c2012e) {
        super.mo5774k(c2012e);
        this.M0 = null;
        this.E0 = null;
        this.R0 = null;
    }

    public final void k0(View view, int i) {
        if (view == null) {
            return;
        }
        wvi.g0(view, Opcodes.ASM8);
        wvi.g0(view, 262144);
        wvi.g0(view, 1048576);
        int i2 = this.W0.get(i, -1);
        if (i2 != -1) {
            wvi.g0(view, i2);
            this.W0.delete(i);
        }
    }

    public final void k1(int i, boolean z) {
        boolean zY0;
        ValueAnimator valueAnimator;
        if (i == 2 || this.o0 == (zY0 = y0()) || this.f12168s == null) {
            return;
        }
        this.o0 = zY0;
        if (!z || (valueAnimator = this.q0) == null) {
            ValueAnimator valueAnimator2 = this.q0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.q0.cancel();
            }
            this.f12168s.h0(this.o0 ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.q0.reverse();
        } else {
            this.q0.setFloatValues(this.f12168s.m60097C(), zY0 ? g0() : 1.0f);
            this.q0.start();
        }
    }

    public final jc l0(int i) {
        return new C10966f(i);
    }

    public final void l1(boolean z) {
        Map map;
        WeakReference weakReference = this.M0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.V0 != null) {
                    return;
                } else {
                    this.V0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.M0.get()) {
                    if (z) {
                        this.V0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f12161c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f12161c && (map = this.V0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.V0.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.V0 = null;
            } else if (this.f12161c) {
                ((View) this.M0.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final void m0(Context context) {
        if (this.n0 == null) {
            return;
        }
        zya zyaVar = new zya(this.n0);
        this.f12168s = zyaVar;
        zyaVar.m60115U(context);
        ColorStateList colorStateList = this.f12169x;
        if (colorStateList != null) {
            this.f12168s.g0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f12168s.setTint(typedValue.data);
    }

    public final void m1(boolean z) {
        View view;
        if (this.M0 != null) {
            d0();
            if (this.C0 != 4 || (view = (View) this.M0.get()) == null) {
                return;
            }
            if (z) {
                Z0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: n */
    public void mo5777n() {
        super.mo5777n();
        this.M0 = null;
        this.E0 = null;
        this.R0 = null;
    }

    public final void n0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.q0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.q0.addUpdateListener(new C10963c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: o */
    public boolean mo5778o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        fwi fwiVar;
        if (!view.isShown() || !this.z0) {
            this.F0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H0();
        }
        if (this.Q0 == null) {
            this.Q0 = VelocityTracker.obtain();
        }
        this.Q0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.T0 = (int) motionEvent.getY();
            if (this.C0 != 2) {
                WeakReference weakReference = this.O0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m5730F(view2, x, this.T0)) {
                    this.S0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.U0 = true;
                }
            }
            this.F0 = this.S0 == -1 && !coordinatorLayout.m5730F(view, x, this.T0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.U0 = false;
            this.S0 = -1;
            if (this.F0) {
                this.F0 = false;
                return false;
            }
        }
        if (!this.F0 && (fwiVar = this.E0) != null && fwiVar.m27682Q(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.O0;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.F0 || this.C0 == 1 || coordinatorLayout.m5730F(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.E0 == null || (i = this.T0) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.E0.m27666A())) ? false : true;
    }

    public void o0(int i) {
        View view = (View) this.M0.get();
        if (view == null || this.P0.isEmpty()) {
            return;
        }
        float fI0 = i0(i);
        for (int i2 = 0; i2 < this.P0.size(); i2++) {
            ((AbstractC10967g) this.P0.get(i2)).mo14181b(view, fI0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: p */
    public boolean mo5779p(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.M0 == null) {
            this.f12166h = coordinatorLayout.getResources().getDimensionPixelSize(x6e.design_bottom_sheet_peek_height_min);
            b1(view);
            wvi.E0(view, new tj8(view));
            this.M0 = new WeakReference(view);
            this.R0 = new uta(view);
            zya zyaVar = this.f12168s;
            if (zyaVar != null) {
                view.setBackground(zyaVar);
                zya zyaVar2 = this.f12168s;
                float elevation = this.w0;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                zyaVar2.f0(elevation);
            } else {
                ColorStateList colorStateList = this.f12169x;
                if (colorStateList != null) {
                    wvi.q0(view, colorStateList);
                }
            }
            i1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.E0 == null) {
            this.E0 = fwi.m27665p(coordinatorLayout, this.X0);
        }
        int top = view.getTop();
        coordinatorLayout.m5737M(view, i);
        this.K0 = coordinatorLayout.getWidth();
        this.L0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.J0 = height;
        int iMin = this.L0;
        int i2 = iMin - height;
        int i3 = this.l0;
        if (i2 < i3) {
            if (this.f12158Z) {
                int i4 = this.f12152H;
                if (i4 != -1) {
                    iMin = Math.min(iMin, i4);
                }
                this.J0 = iMin;
            } else {
                int iMin2 = iMin - i3;
                int i5 = this.f12152H;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.J0 = iMin2;
            }
        }
        this.s0 = Math.max(0, this.L0 - this.J0);
        f0();
        d0();
        int i6 = this.C0;
        if (i6 == 3) {
            wvi.m55111X(view, s0());
        } else if (i6 == 6) {
            wvi.m55111X(view, this.t0);
        } else if (this.x0 && i6 == 5) {
            wvi.m55111X(view, this.L0);
        } else if (i6 == 4) {
            wvi.m55111X(view, this.v0);
        } else if (i6 == 1 || i6 == 2) {
            wvi.m55111X(view, top - view.getTop());
        }
        k1(this.C0, false);
        this.O0 = new WeakReference(p0(view));
        for (int i7 = 0; i7 < this.P0.size(); i7++) {
            ((AbstractC10967g) this.P0.get(i7)).mo14180a(view);
        }
        return true;
    }

    public View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewP0 = p0(viewGroup.getChildAt(i));
                if (viewP0 != null) {
                    return viewP0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: q */
    public boolean mo5780q(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(r0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f12170y, marginLayoutParams.width), r0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f12152H, marginLayoutParams.height));
        return true;
    }

    public final int r0(int i, int i2, int i3, int i4) {
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: s */
    public boolean mo5782s(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference;
        if (E0() && (weakReference = this.O0) != null && view2 == weakReference.get()) {
            return !(this.C0 == 3 || this.B0) || super.mo5782s(coordinatorLayout, view, view2, f, f2);
        }
        return false;
    }

    public int s0() {
        if (this.f12160b) {
            return this.s0;
        }
        return Math.max(this.r0, this.f12158Z ? 0 : this.l0);
    }

    public zya t0() {
        return this.f12168s;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: u */
    public void mo5784u(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.O0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!E0() || view2 == view3) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (!this.H0 && !this.A0 && view2 == view3 && view2.canScrollVertically(1)) {
                    this.B0 = true;
                    return;
                }
                if (i4 < s0()) {
                    int iS0 = top - s0();
                    iArr[1] = iS0;
                    wvi.m55111X(view, -iS0);
                    a1(3);
                } else {
                    if (!this.z0) {
                        return;
                    }
                    iArr[1] = i2;
                    wvi.m55111X(view, -i2);
                    a1(1);
                }
            } else if (i2 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.H0 && !this.A0 && view2 == view3 && zCanScrollVertically) {
                    this.B0 = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i4 > this.v0 && !j0()) {
                        int i5 = top - this.v0;
                        iArr[1] = i5;
                        wvi.m55111X(view, -i5);
                        a1(4);
                    } else {
                        if (!this.z0) {
                            return;
                        }
                        iArr[1] = i2;
                        wvi.m55111X(view, -i2);
                        a1(1);
                    }
                }
            }
            o0(view.getTop());
            this.G0 = i2;
            this.H0 = true;
            this.B0 = false;
        }
    }

    public int u0() {
        return this.C0;
    }

    public final int v0(int i) {
        if (i == 3) {
            return s0();
        }
        if (i == 4) {
            return this.v0;
        }
        if (i == 5) {
            return this.L0;
        }
        if (i == 6) {
            return this.t0;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i);
    }

    public final float w0() {
        VelocityTracker velocityTracker = this.Q0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f12162d);
        return this.Q0.getYVelocity(this.S0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: x */
    public void mo5787x(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public final boolean x0() {
        WeakReference weakReference = this.M0;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.M0.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public final boolean y0() {
        return this.C0 == 3 && (this.m0 || x0());
    }

    public boolean z0() {
        return this.f12160b;
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    public class C10968h {

        /* renamed from: a */
        public int f12187a;

        /* renamed from: b */
        public boolean f12188b;

        /* renamed from: c */
        public final Runnable f12189c;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C10968h.this.f12188b = false;
                fwi fwiVar = BottomSheetBehavior.this.E0;
                if (fwiVar != null && fwiVar.m27698n(true)) {
                    C10968h c10968h = C10968h.this;
                    c10968h.m14185c(c10968h.f12187a);
                    return;
                }
                C10968h c10968h2 = C10968h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.C0 == 2) {
                    bottomSheetBehavior.a1(c10968h2.f12187a);
                }
            }
        }

        public C10968h() {
            this.f12189c = new a();
        }

        /* renamed from: c */
        public void m14185c(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.M0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f12187a = i;
            if (this.f12188b) {
                return;
            }
            ((View) BottomSheetBehavior.this.M0.get()).postOnAnimation(this.f12189c);
            this.f12188b = true;
        }

        public /* synthetic */ C10968h(BottomSheetBehavior bottomSheetBehavior, RunnableC10961a runnableC10961a) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C10960a();

        /* renamed from: c */
        public final int f12171c;

        /* renamed from: d */
        public int f12172d;

        /* renamed from: e */
        public boolean f12173e;

        /* renamed from: f */
        public boolean f12174f;

        /* renamed from: g */
        public boolean f12175g;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public class C10960a implements Parcelable.ClassLoaderCreator {
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
            this.f12171c = parcel.readInt();
            this.f12172d = parcel.readInt();
            this.f12173e = parcel.readInt() == 1;
            this.f12174f = parcel.readInt() == 1;
            this.f12175g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f12171c);
            parcel.writeInt(this.f12172d);
            parcel.writeInt(this.f12173e ? 1 : 0);
            parcel.writeInt(this.f12174f ? 1 : 0);
            parcel.writeInt(this.f12175g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f12171c = bottomSheetBehavior.C0;
            this.f12172d = bottomSheetBehavior.f12164f;
            this.f12173e = bottomSheetBehavior.f12160b;
            this.f12174f = bottomSheetBehavior.x0;
            this.f12175g = bottomSheetBehavior.y0;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f12159a = 0;
        this.f12160b = true;
        this.f12161c = false;
        this.f12170y = -1;
        this.f12152H = -1;
        this.p0 = new C10968h(this, null);
        this.u0 = 0.5f;
        this.w0 = -1.0f;
        this.z0 = true;
        this.A0 = true;
        this.C0 = 4;
        this.D0 = 4;
        this.I0 = 0.1f;
        this.P0 = new ArrayList();
        this.T0 = -1;
        this.W0 = new SparseIntArray();
        this.X0 = new C10965e();
        this.f12167q = context.getResources().getDimensionPixelSize(x6e.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ebe.BottomSheetBehavior_Layout);
        if (typedArrayObtainStyledAttributes.hasValue(ebe.BottomSheetBehavior_Layout_backgroundTint)) {
            this.f12169x = yya.m58494a(context, typedArrayObtainStyledAttributes, ebe.BottomSheetBehavior_Layout_backgroundTint);
        }
        if (typedArrayObtainStyledAttributes.hasValue(ebe.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.n0 = ykf.m57925e(context, attributeSet, x5e.bottomSheetStyle, Y0).m57970m();
        }
        m0(context);
        n0();
        this.w0 = typedArrayObtainStyledAttributes.getDimension(ebe.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(ebe.BottomSheetBehavior_Layout_android_maxWidth)) {
            T0(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(ebe.BottomSheetBehavior_Layout_android_maxHeight)) {
            S0(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(ebe.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            U0(i);
        } else {
            U0(typedArrayObtainStyledAttributes.getDimensionPixelSize(ebe.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        R0(typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_behavior_hideable, false));
        P0(typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        O0(typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        Y0(typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        L0(typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_behavior_draggable, true));
        M0(typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_behavior_draggableOnNestedScroll, true));
        W0(typedArrayObtainStyledAttributes.getInt(ebe.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        Q0(typedArrayObtainStyledAttributes.getFloat(ebe.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(ebe.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            N0(typedValuePeekValue2.data);
        } else {
            N0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ebe.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        X0(typedArrayObtainStyledAttributes.getInt(ebe.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500));
        this.f12155Q = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f12156X = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f12157Y = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f12158Z = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        this.h0 = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
        this.i0 = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
        this.j0 = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
        this.m0 = typedArrayObtainStyledAttributes.getBoolean(ebe.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f12162d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
