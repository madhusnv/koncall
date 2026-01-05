package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.aa3;
import p001o.c64;
import p001o.dtb;
import p001o.etb;
import p001o.ftb;
import p001o.gtb;
import p001o.htb;
import p001o.sfa;
import p001o.t93;
import p001o.wvi;

/* loaded from: classes2.dex */
public class SwipeRefreshLayout extends ViewGroup implements gtb, ftb, dtb {
    public static final int[] G0 = {R.attr.enabled};
    public int A0;
    public boolean B0;
    public boolean C0;
    public Animation.AnimationListener D0;
    public final Animation E0;
    public final Animation F0;

    /* renamed from: H */
    public int f10250H;

    /* renamed from: L */
    public int f10251L;

    /* renamed from: M */
    public float f10252M;

    /* renamed from: Q */
    public float f10253Q;

    /* renamed from: a */
    public View f10254a;

    /* renamed from: b */
    public InterfaceC2475j f10255b;

    /* renamed from: c */
    public boolean f10256c;

    /* renamed from: d */
    public int f10257d;

    /* renamed from: e */
    public float f10258e;

    /* renamed from: f */
    public float f10259f;

    /* renamed from: g */
    public final htb f10260g;

    /* renamed from: h */
    public final etb f10261h;
    public boolean h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public final DecelerateInterpolator l0;
    public t93 m0;
    public int n0;
    public int o0;
    public float p0;

    /* renamed from: q */
    public final int[] f10262q;
    public int q0;
    public int r0;

    /* renamed from: s */
    public final int[] f10263s;
    public int s0;
    public aa3 t0;
    public Animation u0;
    public Animation v0;
    public Animation w0;

    /* renamed from: x */
    public final int[] f10264x;
    public Animation x0;

    /* renamed from: y */
    public boolean f10265y;
    public Animation y0;
    public boolean z0;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class AnimationAnimationListenerC2466a implements Animation.AnimationListener {
        public AnimationAnimationListenerC2466a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            InterfaceC2475j interfaceC2475j;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f10256c) {
                swipeRefreshLayout.m9789s();
                return;
            }
            swipeRefreshLayout.t0.setAlpha(Constants.MAX_HOST_LENGTH);
            SwipeRefreshLayout.this.t0.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.z0 && (interfaceC2475j = swipeRefreshLayout2.f10255b) != null) {
                interfaceC2475j.mo9799a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f10251L = swipeRefreshLayout3.m0.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C2467b extends Animation {
        public C2467b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C2468c extends Animation {
        public C2468c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C2469d extends Animation {

        /* renamed from: a */
        public final /* synthetic */ int f10270a;

        /* renamed from: b */
        public final /* synthetic */ int f10271b;

        public C2469d(int i, int i2) {
            this.f10270a = i;
            this.f10271b = i2;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.t0.setAlpha((int) (this.f10270a + ((this.f10271b - r0) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class AnimationAnimationListenerC2470e implements Animation.AnimationListener {
        public AnimationAnimationListenerC2470e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.j0) {
                return;
            }
            swipeRefreshLayout.m9795y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C2471f extends Animation {
        public C2471f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.B0 ? swipeRefreshLayout.r0 - Math.abs(swipeRefreshLayout.q0) : swipeRefreshLayout.r0;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.o0 + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout2.m0.getTop());
            SwipeRefreshLayout.this.t0.m16721e(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public class C2472g extends Animation {
        public C2472g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.m9787q(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public class C2473h extends Animation {
        public C2473h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.p0;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.m9787q(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface InterfaceC2474i {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface InterfaceC2475j {
        /* renamed from: a */
        void mo9799a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    private void setColorViewAlpha(int i) {
        this.m0.getBackground().setAlpha(i);
        this.t0.setAlpha(i);
    }

    /* renamed from: A */
    public final void m9776A(Animation.AnimationListener animationListener) {
        this.m0.setVisibility(0);
        this.t0.setAlpha(Constants.MAX_HOST_LENGTH);
        C2467b c2467b = new C2467b();
        this.u0 = c2467b;
        c2467b.setDuration(this.f10250H);
        if (animationListener != null) {
            this.m0.m49573b(animationListener);
        }
        this.m0.clearAnimation();
        this.m0.startAnimation(this.u0);
    }

    /* renamed from: a */
    public final void m9777a(int i, Animation.AnimationListener animationListener) {
        this.o0 = i;
        this.E0.reset();
        this.E0.setDuration(200L);
        this.E0.setInterpolator(this.l0);
        if (animationListener != null) {
            this.m0.m49573b(animationListener);
        }
        this.m0.clearAnimation();
        this.m0.startAnimation(this.E0);
    }

    /* renamed from: b */
    public final void m9778b(int i, Animation.AnimationListener animationListener) {
        if (this.j0) {
            m9796z(i, animationListener);
            return;
        }
        this.o0 = i;
        this.F0.reset();
        this.F0.setDuration(200L);
        this.F0.setInterpolator(this.l0);
        if (animationListener != null) {
            this.m0.m49573b(animationListener);
        }
        this.m0.clearAnimation();
        this.m0.startAnimation(this.F0);
    }

    /* renamed from: c */
    public boolean m9779c() {
        View view = this.f10254a;
        return view instanceof ListView ? sfa.m48290a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* renamed from: d */
    public final void m9780d() {
        this.m0 = new t93(getContext());
        aa3 aa3Var = new aa3(getContext());
        this.t0 = aa3Var;
        aa3Var.m16728l(1);
        this.m0.setImageDrawable(this.t0);
        this.m0.setVisibility(8);
        addView(this.m0);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f10261h.m25578a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f10261h.m25579b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f10261h.m25580c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f10261h.m25583f(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public void m9781e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (i5 == 0) {
            this.f10261h.m25582e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* renamed from: f */
    public final void m9782f() {
        if (this.f10254a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.m0)) {
                    this.f10254a = childAt;
                    return;
                }
            }
        }
    }

    @Override // p001o.ftb
    /* renamed from: g */
    public void mo4127g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.n0;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f10260g.m31120a();
    }

    public int getProgressCircleDiameter() {
        return this.A0;
    }

    public int getProgressViewEndOffset() {
        return this.r0;
    }

    public int getProgressViewStartOffset() {
        return this.q0;
    }

    @Override // p001o.ftb
    /* renamed from: h */
    public void mo4128h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f10261h.m25587j();
    }

    @Override // p001o.ftb
    /* renamed from: i */
    public void mo4129i(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f10261h.m25589l();
    }

    /* renamed from: j */
    public final void m9783j(float f) {
        if (f > this.f10258e) {
            m9790t(true, true);
            return;
        }
        this.f10256c = false;
        this.t0.m16726j(0.0f, 0.0f);
        m9778b(this.f10251L, !this.j0 ? new AnimationAnimationListenerC2470e() : null);
        this.t0.m16720d(false);
    }

    @Override // p001o.gtb
    /* renamed from: k */
    public void mo4131k(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        m9781e(i, i2, i3, i4, this.f10263s, i5, iArr);
        int i7 = i4 - (iArr[1] - i6);
        if ((i7 == 0 ? i4 + this.f10263s[1] : i7) >= 0 || m9779c()) {
            return;
        }
        float fAbs = this.f10259f + Math.abs(r1);
        this.f10259f = fAbs;
        m9786p(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // p001o.ftb
    /* renamed from: l */
    public void mo4132l(View view, int i, int i2, int i3, int i4, int i5) {
        mo4131k(view, i, i2, i3, i4, i5, this.f10264x);
    }

    @Override // p001o.ftb
    /* renamed from: m */
    public boolean mo4133m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m9784n(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    /* renamed from: o */
    public boolean m9785o() {
        return this.f10256c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m9789s();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        m9782f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.k0 && actionMasked == 0) {
            this.k0 = false;
        }
        if (!isEnabled() || this.k0 || m9779c() || this.f10256c || this.f10265y) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.q0 - this.m0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.i0 = pointerId;
            this.h0 = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.f10253Q = motionEvent.getY(iFindPointerIndex2);
        } else if (actionMasked == 1) {
            this.h0 = false;
            this.i0 = -1;
        } else if (actionMasked == 2) {
            int i = this.i0;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                return false;
            }
            m9792v(motionEvent.getY(iFindPointerIndex));
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                m9788r(motionEvent);
            }
        }
        return this.h0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f10254a == null) {
            m9782f();
        }
        View view = this.f10254a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.m0.getMeasuredWidth();
        int measuredHeight2 = this.m0.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.f10251L;
        this.m0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f10254a == null) {
            m9782f();
        }
        View view = this.f10254a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.m0.measure(View.MeasureSpec.makeMeasureSpec(this.A0, 1073741824), View.MeasureSpec.makeMeasureSpec(this.A0, 1073741824));
        this.n0 = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.m0) {
                this.n0 = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f10259f;
            if (f > 0.0f) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f10259f = 0.0f;
                } else {
                    this.f10259f = f - f2;
                    iArr[1] = i2;
                }
                m9786p(this.f10259f);
            }
        }
        if (this.B0 && i2 > 0 && this.f10259f == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.m0.setVisibility(8);
        }
        int[] iArr2 = this.f10262q;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo4131k(view, i, i2, i3, i4, 0, this.f10264x);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f10260g.m31121b(view, view2, i);
        startNestedScroll(i & 2);
        this.f10259f = 0.0f;
        this.f10265y = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f10266a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f10256c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.k0 || this.f10256c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f10260g.m31123d(view);
        this.f10265y = false;
        float f = this.f10259f;
        if (f > 0.0f) {
            m9783j(f);
            this.f10259f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.k0 && actionMasked == 0) {
            this.k0 = false;
        }
        if (!isEnabled() || this.k0 || m9779c() || this.f10256c || this.f10265y) {
            return false;
        }
        if (actionMasked == 0) {
            this.i0 = motionEvent.getPointerId(0);
            this.h0 = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.i0);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.h0) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.f10252M) * 0.5f;
                    this.h0 = false;
                    m9783j(y);
                }
                this.i0 = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.i0);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                m9792v(y2);
                if (this.h0) {
                    float f = (y2 - this.f10252M) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m9786p(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.i0 = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    m9788r(motionEvent);
                }
            }
        }
        return true;
    }

    /* renamed from: p */
    public final void m9786p(float f) {
        this.t0.m16720d(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.f10258e));
        float fMax = (((float) Math.max(fMin - 0.4d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f10258e;
        int i = this.s0;
        if (i <= 0) {
            i = this.B0 ? this.r0 - this.q0 : this.r0;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.q0 + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        if (this.m0.getVisibility() != 0) {
            this.m0.setVisibility(0);
        }
        if (!this.j0) {
            this.m0.setScaleX(1.0f);
            this.m0.setScaleY(1.0f);
        }
        if (this.j0) {
            setAnimationProgress(Math.min(1.0f, f / this.f10258e));
        }
        if (f < this.f10258e) {
            if (this.t0.getAlpha() > 76 && !m9784n(this.w0)) {
                m9794x();
            }
        } else if (this.t0.getAlpha() < 255 && !m9784n(this.x0)) {
            m9793w();
        }
        this.t0.m16726j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.t0.m16721e(Math.min(1.0f, fMax));
        this.t0.m16723g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f10251L);
    }

    /* renamed from: q */
    public void m9787q(float f) {
        setTargetOffsetTopAndBottom((this.o0 + ((int) ((this.q0 - r0) * f))) - this.m0.getTop());
    }

    /* renamed from: r */
    public final void m9788r(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.i0) {
            this.i0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f10254a;
        if (view == null || wvi.m55106S(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        } else {
            if (this.C0 || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: s */
    public void m9789s() {
        this.m0.clearAnimation();
        this.t0.stop();
        this.m0.setVisibility(8);
        setColorViewAlpha(Constants.MAX_HOST_LENGTH);
        if (this.j0) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.q0 - this.f10251L);
        }
        this.f10251L = this.m0.getTop();
    }

    public void setAnimationProgress(float f) {
        this.m0.setScaleX(f);
        this.m0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m9782f();
        this.t0.m16722f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = c64.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f10258e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m9789s();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.C0 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.f10261h.m25590m(z);
    }

    public void setOnChildScrollUpCallback(InterfaceC2474i interfaceC2474i) {
    }

    public void setOnRefreshListener(InterfaceC2475j interfaceC2475j) {
        this.f10255b = interfaceC2475j;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.m0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(c64.getColor(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.r0 = i;
        this.j0 = z;
        this.m0.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.j0 = z;
        this.q0 = i;
        this.r0 = i2;
        this.B0 = true;
        m9789s();
        this.f10256c = false;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f10256c == z) {
            m9790t(z, false);
            return;
        }
        this.f10256c = z;
        setTargetOffsetTopAndBottom((!this.B0 ? this.r0 + this.q0 : this.r0) - this.f10251L);
        this.z0 = false;
        m9776A(this.D0);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.A0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.A0 = (int) (displayMetrics.density * 40.0f);
            }
            this.m0.setImageDrawable(null);
            this.t0.m16728l(i);
            this.m0.setImageDrawable(this.t0);
        }
    }

    public void setSlingshotDistance(int i) {
        this.s0 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.m0.bringToFront();
        wvi.m55111X(this.m0, i);
        this.f10251L = this.m0.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f10261h.m25592o(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f10261h.m25594q();
    }

    /* renamed from: t */
    public final void m9790t(boolean z, boolean z2) {
        if (this.f10256c != z) {
            this.z0 = z2;
            m9782f();
            this.f10256c = z;
            if (z) {
                m9777a(this.f10251L, this.D0);
            } else {
                m9795y(this.D0);
            }
        }
    }

    /* renamed from: u */
    public final Animation m9791u(int i, int i2) {
        C2469d c2469d = new C2469d(i, i2);
        c2469d.setDuration(300L);
        this.m0.m49573b(null);
        this.m0.clearAnimation();
        this.m0.startAnimation(c2469d);
        return c2469d;
    }

    /* renamed from: v */
    public final void m9792v(float f) {
        float f2 = this.f10253Q;
        float f3 = f - f2;
        int i = this.f10257d;
        if (f3 <= i || this.h0) {
            return;
        }
        this.f10252M = f2 + i;
        this.h0 = true;
        this.t0.setAlpha(76);
    }

    /* renamed from: w */
    public final void m9793w() {
        this.x0 = m9791u(this.t0.getAlpha(), Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: x */
    public final void m9794x() {
        this.w0 = m9791u(this.t0.getAlpha(), 76);
    }

    /* renamed from: y */
    public void m9795y(Animation.AnimationListener animationListener) {
        C2468c c2468c = new C2468c();
        this.v0 = c2468c;
        c2468c.setDuration(150L);
        this.m0.m49573b(animationListener);
        this.m0.clearAnimation();
        this.m0.startAnimation(this.v0);
    }

    /* renamed from: z */
    public final void m9796z(int i, Animation.AnimationListener animationListener) {
        this.o0 = i;
        this.p0 = this.m0.getScaleX();
        C2473h c2473h = new C2473h();
        this.y0 = c2473h;
        c2473h.setDuration(150L);
        if (animationListener != null) {
            this.m0.m49573b(animationListener);
        }
        this.m0.clearAnimation();
        this.m0.startAnimation(this.y0);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2465a();

        /* renamed from: a */
        public final boolean f10266a;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        public class C2465a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f10266a = z;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f10266a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f10266a = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10256c = false;
        this.f10258e = -1.0f;
        this.f10262q = new int[2];
        this.f10263s = new int[2];
        this.f10264x = new int[2];
        this.i0 = -1;
        this.n0 = -1;
        this.D0 = new AnimationAnimationListenerC2466a();
        this.E0 = new C2471f();
        this.F0 = new C2472g();
        this.f10257d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f10250H = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.l0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A0 = (int) (displayMetrics.density * 40.0f);
        m9780d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.r0 = i;
        this.f10258e = i;
        this.f10260g = new htb(this);
        this.f10261h = new etb(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.A0;
        this.f10251L = i2;
        this.q0 = i2;
        m9787q(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, G0);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
