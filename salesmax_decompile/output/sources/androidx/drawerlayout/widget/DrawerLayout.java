package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import p001o.c64;
import p001o.cc;
import p001o.db;
import p001o.dv7;
import p001o.e6e;
import p001o.f7e;
import p001o.fwi;
import p001o.fy5;
import p001o.jc;
import p001o.ndc;
import p001o.pbe;
import p001o.r9j;
import p001o.sj8;
import p001o.wvi;

/* loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup implements ndc {
    public static final int[] C0 = {R.attr.colorPrimaryDark};
    public static final int[] D0 = {R.attr.layout_gravity};
    public static final boolean E0;
    public static final boolean F0;
    public static boolean G0;
    public Matrix A0;
    public final jc B0;

    /* renamed from: H */
    public boolean f7216H;

    /* renamed from: L */
    public int f7217L;

    /* renamed from: M */
    public int f7218M;

    /* renamed from: Q */
    public int f7219Q;

    /* renamed from: a */
    public final C2056d f7220a;

    /* renamed from: b */
    public float f7221b;

    /* renamed from: c */
    public int f7222c;

    /* renamed from: d */
    public int f7223d;

    /* renamed from: e */
    public float f7224e;

    /* renamed from: f */
    public Paint f7225f;

    /* renamed from: g */
    public final fwi f7226g;

    /* renamed from: h */
    public final fwi f7227h;
    public int h0;
    public boolean i0;
    public InterfaceC2057e j0;
    public List k0;
    public float l0;
    public float m0;
    public Drawable n0;
    public Drawable o0;
    public Drawable p0;

    /* renamed from: q */
    public final C2059g f7228q;
    public CharSequence q0;
    public CharSequence r0;

    /* renamed from: s */
    public final C2059g f7229s;
    public Object s0;
    public boolean t0;
    public Drawable u0;
    public Drawable v0;
    public Drawable w0;

    /* renamed from: x */
    public int f7230x;
    public Drawable x0;

    /* renamed from: y */
    public boolean f7231y;
    public final ArrayList y0;
    public Rect z0;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C2053a implements jc {
        public C2053a() {
        }

        @Override // p001o.jc
        /* renamed from: a */
        public boolean mo6030a(View view, jc.AbstractC14493a abstractC14493a) {
            if (!DrawerLayout.this.m5985E(view) || DrawerLayout.this.m6022t(view) == 2) {
                return false;
            }
            DrawerLayout.this.m6010h(view);
            return true;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class ViewOnApplyWindowInsetsListenerC2054b implements View.OnApplyWindowInsetsListener {
        public ViewOnApplyWindowInsetsListenerC2054b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public class C2055c extends db {

        /* renamed from: d */
        public final Rect f7243d = new Rect();

        public C2055c() {
        }

        @Override // p001o.db
        /* renamed from: a */
        public boolean mo6031a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo6031a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewM6020r = DrawerLayout.this.m6020r();
            if (viewM6020r == null) {
                return true;
            }
            CharSequence charSequenceM6023u = DrawerLayout.this.m6023u(DrawerLayout.this.m6024v(viewM6020r));
            if (charSequenceM6023u == null) {
                return true;
            }
            text.add(charSequenceM6023u);
            return true;
        }

        @Override // p001o.db
        /* renamed from: f */
        public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5937f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            if (DrawerLayout.E0) {
                super.mo5938g(view, ccVar);
            } else {
                cc ccVarC0 = cc.c0(ccVar);
                super.mo5938g(view, ccVarC0);
                ccVar.S0(view);
                Object objM55093F = wvi.m55093F(view);
                if (objM55093F instanceof View) {
                    ccVar.J0((View) objM55093F);
                }
                m6034o(ccVar, ccVarC0);
                ccVarC0.e0();
                m6033n(ccVar, (ViewGroup) view);
            }
            ccVar.o0("androidx.drawerlayout.widget.DrawerLayout");
            ccVar.y0(false);
            ccVar.z0(false);
            ccVar.f0(cc.C12624a.f17793e);
            ccVar.f0(cc.C12624a.f17794f);
        }

        @Override // p001o.db
        /* renamed from: i */
        public boolean mo6032i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.E0 || DrawerLayout.m5979C(view)) {
                return super.mo6032i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void m6033n(cc ccVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m5979C(childAt)) {
                    ccVar.m20779c(childAt);
                }
            }
        }

        /* renamed from: o */
        public final void m6034o(cc ccVar, cc ccVar2) {
            Rect rect = this.f7243d;
            ccVar2.m20789n(rect);
            ccVar.k0(rect);
            ccVar.b1(ccVar2.m20776Z());
            ccVar.H0(ccVar2.m20800z());
            ccVar.o0(ccVar2.m20792q());
            ccVar.s0(ccVar2.m20794t());
            ccVar.w0(ccVar2.m20765O());
            ccVar.z0(ccVar2.m20767Q());
            ccVar.h0(ccVar2.m20760J());
            ccVar.Q0(ccVar2.m20773W());
            ccVar.m20777a(ccVar2.m20786k());
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static final class C2056d extends db {
        @Override // p001o.db
        /* renamed from: g */
        public void mo5938g(View view, cc ccVar) {
            super.mo5938g(view, ccVar);
            if (DrawerLayout.m5979C(view)) {
                return;
            }
            ccVar.J0(null);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public interface InterfaceC2057e {
        /* renamed from: a */
        void mo17a(View view);

        /* renamed from: b */
        void mo18b(View view);

        /* renamed from: c */
        void mo19c(int i);

        /* renamed from: d */
        void mo20d(View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static abstract class AbstractC2058f implements InterfaceC2057e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: c */
        public void mo19c(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC2057e
        /* renamed from: d */
        public void mo20d(View view, float f) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    public class C2059g extends fwi.AbstractC13588c {

        /* renamed from: a */
        public final int f7245a;

        /* renamed from: b */
        public fwi f7246b;

        /* renamed from: c */
        public final Runnable f7247c = new a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2059g.this.m6036b();
            }
        }

        public C2059g(int i) {
            this.f7245a = i;
        }

        /* renamed from: a */
        public final void m6035a() {
            View viewM6018p = DrawerLayout.this.m6018p(this.f7245a == 3 ? 5 : 3);
            if (viewM6018p != null) {
                DrawerLayout.this.m6010h(viewM6018p);
            }
        }

        /* renamed from: b */
        public void m6036b() {
            View viewM6018p;
            int width;
            int iM27707y = this.f7246b.m27707y();
            boolean z = this.f7245a == 3;
            if (z) {
                viewM6018p = DrawerLayout.this.m6018p(3);
                width = (viewM6018p != null ? -viewM6018p.getWidth() : 0) + iM27707y;
            } else {
                viewM6018p = DrawerLayout.this.m6018p(5);
                width = DrawerLayout.this.getWidth() - iM27707y;
            }
            if (viewM6018p != null) {
                if (((!z || viewM6018p.getLeft() >= width) && (z || viewM6018p.getLeft() <= width)) || DrawerLayout.this.m6022t(viewM6018p) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewM6018p.getLayoutParams();
                this.f7246b.m27683R(viewM6018p, width, viewM6018p.getTop());
                layoutParams.f7234c = true;
                DrawerLayout.this.invalidate();
                m6035a();
                DrawerLayout.this.m6005c();
            }
        }

        /* renamed from: c */
        public void m6037c() {
            DrawerLayout.this.removeCallbacks(this.f7247c);
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            if (DrawerLayout.this.m6006d(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // p001o.fwi.AbstractC13588c
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public void m6038d(fwi fwiVar) {
            this.f7246b = fwiVar;
        }

        @Override // p001o.fwi.AbstractC13588c
        public int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.this.m5986F(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onEdgeDragStarted(int i, int i2) {
            View viewM6018p = (i & 1) == 1 ? DrawerLayout.this.m6018p(3) : DrawerLayout.this.m6018p(5);
            if (viewM6018p == null || DrawerLayout.this.m6022t(viewM6018p) != 0) {
                return;
            }
            this.f7246b.m27687c(viewM6018p, i2);
        }

        @Override // p001o.fwi.AbstractC13588c
        public boolean onEdgeLock(int i) {
            return false;
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f7247c, 160L);
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f7234c = false;
            m6035a();
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewDragStateChanged(int i) {
            DrawerLayout.this.m6002V(i, this.f7246b.m27705w());
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = (DrawerLayout.this.m6006d(view, 3) ? i + r3 : DrawerLayout.this.getWidth() - i) / view.getWidth();
            DrawerLayout.this.m5999S(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // p001o.fwi.AbstractC13588c
        public void onViewReleased(View view, float f, float f2) {
            int i;
            float fM6025w = DrawerLayout.this.m6025w(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m6006d(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && fM6025w > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && fM6025w > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f7246b.m27681P(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p001o.fwi.AbstractC13588c
        public boolean tryCaptureView(View view, int i) {
            return DrawerLayout.this.m5986F(view) && DrawerLayout.this.m6006d(view, this.f7245a) && DrawerLayout.this.m6022t(view) == 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        E0 = true;
        F0 = true;
        G0 = i >= 29;
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    public static boolean m5979C(View view) {
        return (wvi.m55137x(view) == 4 || wvi.m55137x(view) == 2) ? false : true;
    }

    /* renamed from: y */
    public static String m5980y(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: z */
    public static boolean m5981z(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: A */
    public final boolean m5982A() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f7234c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean m5983B() {
        return m6020r() != null;
    }

    /* renamed from: D */
    public boolean m5984D(View view) {
        return ((LayoutParams) view.getLayoutParams()).f7232a == 0;
    }

    /* renamed from: E */
    public boolean m5985E(View view) {
        if (m5986F(view)) {
            return (((LayoutParams) view.getLayoutParams()).f7235d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: F */
    public boolean m5986F(View view) {
        int iM23889b = dv7.m23889b(((LayoutParams) view.getLayoutParams()).f7232a, wvi.m55139z(view));
        return ((iM23889b & 3) == 0 && (iM23889b & 5) == 0) ? false : true;
    }

    /* renamed from: G */
    public boolean m5987G(View view) {
        if (m5986F(view)) {
            return ((LayoutParams) view.getLayoutParams()).f7233b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: H */
    public final boolean m5988H(float f, float f2, View view) {
        if (this.z0 == null) {
            this.z0 = new Rect();
        }
        view.getHitRect(this.z0);
        return this.z0.contains((int) f, (int) f2);
    }

    /* renamed from: I */
    public final void m5989I(Drawable drawable, int i) {
        if (drawable == null || !fy5.m27734h(drawable)) {
            return;
        }
        fy5.m27739m(drawable, i);
    }

    /* renamed from: J */
    public void m5990J(View view, float f) {
        float fM6025w = m6025w(view);
        float width = view.getWidth();
        int i = ((int) (width * f)) - ((int) (fM6025w * width));
        if (!m6006d(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        m5999S(view, f);
    }

    /* renamed from: K */
    public void m5991K(int i) {
        m5992L(i, true);
    }

    /* renamed from: L */
    public void m5992L(int i, boolean z) {
        View viewM6018p = m6018p(i);
        if (viewM6018p != null) {
            m5994N(viewM6018p, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m5980y(i));
    }

    /* renamed from: M */
    public void m5993M(View view) {
        m5994N(view, true);
    }

    /* renamed from: N */
    public void m5994N(View view, boolean z) {
        if (!m5986F(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f7216H) {
            layoutParams.f7233b = 1.0f;
            layoutParams.f7235d = 1;
            m6001U(view, true);
            m6000T(view);
        } else if (z) {
            layoutParams.f7235d |= 2;
            if (m6006d(view, 3)) {
                this.f7226g.m27683R(view, 0, view.getTop());
            } else {
                this.f7227h.m27683R(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            m5990J(view, 1.0f);
            m6002V(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: O */
    public void m5995O(InterfaceC2057e interfaceC2057e) {
        List list;
        if (interfaceC2057e == null || (list = this.k0) == null) {
            return;
        }
        list.remove(interfaceC2057e);
    }

    /* renamed from: P */
    public final Drawable m5996P() {
        int iM55139z = wvi.m55139z(this);
        if (iM55139z == 0) {
            Drawable drawable = this.u0;
            if (drawable != null) {
                m5989I(drawable, iM55139z);
                return this.u0;
            }
        } else {
            Drawable drawable2 = this.v0;
            if (drawable2 != null) {
                m5989I(drawable2, iM55139z);
                return this.v0;
            }
        }
        return this.w0;
    }

    /* renamed from: Q */
    public final Drawable m5997Q() {
        int iM55139z = wvi.m55139z(this);
        if (iM55139z == 0) {
            Drawable drawable = this.v0;
            if (drawable != null) {
                m5989I(drawable, iM55139z);
                return this.v0;
            }
        } else {
            Drawable drawable2 = this.u0;
            if (drawable2 != null) {
                m5989I(drawable2, iM55139z);
                return this.u0;
            }
        }
        return this.x0;
    }

    /* renamed from: R */
    public final void m5998R() {
        if (F0) {
            return;
        }
        this.o0 = m5996P();
        this.p0 = m5997Q();
    }

    /* renamed from: S */
    public void m5999S(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.f7233b) {
            return;
        }
        layoutParams.f7233b = f;
        m6016n(view, f);
    }

    /* renamed from: T */
    public final void m6000T(View view) {
        cc.C12624a c12624a = cc.C12624a.f17813y;
        wvi.g0(view, c12624a.m20802b());
        if (!m5985E(view) || m6022t(view) == 2) {
            return;
        }
        wvi.i0(view, c12624a, null, this.B0);
    }

    /* renamed from: U */
    public final void m6001U(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m5986F(childAt)) && !(z && childAt == view)) {
                wvi.t0(childAt, 4);
            } else {
                wvi.t0(childAt, 1);
            }
        }
    }

    /* renamed from: V */
    public void m6002V(int i, View view) {
        int i2;
        int iM27667B = this.f7226g.m27667B();
        int iM27667B2 = this.f7227h.m27667B();
        if (iM27667B == 1 || iM27667B2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (iM27667B != 2 && iM27667B2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f7233b;
            if (f == 0.0f) {
                m6014l(view);
            } else if (f == 1.0f) {
                m6015m(view);
            }
        }
        if (i2 != this.f7230x) {
            this.f7230x = i2;
            List list = this.k0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC2057e) this.k0.get(size)).mo19c(i2);
                }
            }
        }
    }

    @Override // p001o.ndc
    /* renamed from: a */
    public void mo6003a() {
        m5991K(8388611);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!m5986F(childAt)) {
                this.y0.add(childAt);
            } else if (m5985E(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            int size = this.y0.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) this.y0.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.y0.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (m6019q() != null || m5986F(view)) {
            wvi.t0(view, 4);
        } else {
            wvi.t0(view, 1);
        }
        if (E0) {
            return;
        }
        wvi.m0(view, this.f7220a);
    }

    /* renamed from: b */
    public void m6004b(InterfaceC2057e interfaceC2057e) {
        if (interfaceC2057e == null) {
            return;
        }
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(interfaceC2057e);
    }

    /* renamed from: c */
    public void m6005c() {
        if (this.i0) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.i0 = true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).f7233b);
        }
        this.f7224e = fMax;
        boolean zM27698n = this.f7226g.m27698n(true);
        boolean zM27698n2 = this.f7227h.m27698n(true);
        if (zM27698n || zM27698n2) {
            wvi.d0(this);
        }
    }

    /* renamed from: d */
    public boolean m6006d(View view, int i) {
        return (m6024v(view) & i) == i;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f7224e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m5988H(x, y, childAt) && !m5984D(childAt) && m6017o(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        int height = getHeight();
        boolean zM5984D = m5984D(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zM5984D) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m5981z(childAt) && m5986F(childAt) && childAt.getHeight() >= height) {
                    if (m6006d(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f7224e;
        if (f > 0.0f && zM5984D) {
            this.f7225f.setColor((this.f7223d & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f)) << 24));
            canvas.drawRect(i, 0.0f, width, getHeight(), this.f7225f);
        } else if (this.o0 != null && m6006d(view, 3)) {
            int intrinsicWidth = this.o0.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f7226g.m27707y(), 1.0f));
            this.o0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.o0.setAlpha((int) (fMax * 255.0f));
            this.o0.draw(canvas);
        } else if (this.p0 != null && m6006d(view, 5)) {
            int intrinsicWidth2 = this.p0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f7227h.m27707y(), 1.0f));
            this.p0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.p0.setAlpha((int) (fMax2 * 255.0f));
            this.p0.draw(canvas);
        }
        return zDrawChild;
    }

    /* renamed from: e */
    public void m6007e() {
        m6008f(8388611);
    }

    /* renamed from: f */
    public void m6008f(int i) {
        m6009g(i, true);
    }

    /* renamed from: g */
    public void m6009g(int i, boolean z) {
        View viewM6018p = m6018p(i);
        if (viewM6018p != null) {
            m6011i(viewM6018p, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m5980y(i));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (F0) {
            return this.f7221b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.n0;
    }

    /* renamed from: h */
    public void m6010h(View view) {
        m6011i(view, true);
    }

    /* renamed from: i */
    public void m6011i(View view, boolean z) {
        if (!m5986F(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.f7216H) {
            layoutParams.f7233b = 0.0f;
            layoutParams.f7235d = 0;
        } else if (z) {
            layoutParams.f7235d |= 4;
            if (m6006d(view, 3)) {
                this.f7226g.m27683R(view, -view.getWidth(), view.getTop());
            } else {
                this.f7227h.m27683R(view, getWidth(), view.getTop());
            }
        } else {
            m5990J(view, 0.0f);
            m6002V(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* renamed from: j */
    public void m6012j() {
        m6013k(false);
    }

    /* renamed from: k */
    public void m6013k(boolean z) {
        int childCount = getChildCount();
        boolean zM27683R = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m5986F(childAt) && (!z || layoutParams.f7234c)) {
                zM27683R |= m6006d(childAt, 3) ? this.f7226g.m27683R(childAt, -childAt.getWidth(), childAt.getTop()) : this.f7227h.m27683R(childAt, getWidth(), childAt.getTop());
                layoutParams.f7234c = false;
            }
        }
        this.f7228q.m6037c();
        this.f7229s.m6037c();
        if (zM27683R) {
            invalidate();
        }
    }

    /* renamed from: l */
    public void m6014l(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f7235d & 1) == 1) {
            layoutParams.f7235d = 0;
            List list = this.k0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC2057e) this.k0.get(size)).mo18b(view);
                }
            }
            m6001U(view, false);
            m6000T(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: m */
    public void m6015m(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f7235d & 1) == 0) {
            layoutParams.f7235d = 1;
            List list = this.k0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((InterfaceC2057e) this.k0.get(size)).mo17a(view);
                }
            }
            m6001U(view, true);
            m6000T(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: n */
    public void m6016n(View view, float f) {
        List list = this.k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC2057e) this.k0.get(size)).mo20d(view, f);
            }
        }
    }

    /* renamed from: o */
    public final boolean m6017o(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventM6026x = m6026x(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventM6026x);
            motionEventM6026x.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7216H = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7216H = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.t0 || this.n0 == null) {
            return;
        }
        Object obj = this.s0;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.n0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.n0.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewM27703u;
        int actionMasked = motionEvent.getActionMasked();
        boolean zM27682Q = this.f7226g.m27682Q(motionEvent) | this.f7227h.m27682Q(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.l0 = x;
            this.m0 = y;
            z = this.f7224e > 0.0f && (viewM27703u = this.f7226g.m27703u((int) x, (int) y)) != null && m5984D(viewM27703u);
            this.i0 = false;
        } else if (actionMasked == 1) {
            m6013k(true);
            this.i0 = false;
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            } else if (this.f7226g.m27689e(3)) {
                this.f7228q.m6037c();
                this.f7229s.m6037c();
            }
            z = false;
        }
        return zM27682Q || z || m5982A() || this.i0;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m5983B()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewM6020r = m6020r();
        if (viewM6020r != null && m6022t(viewM6020r) == 0) {
            m6012j();
        }
        return viewM6020r != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.f7231y = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m5984D(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m6006d(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f7233b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (layoutParams.f7233b * f3));
                    }
                    boolean z3 = f != layoutParams.f7233b ? z2 : false;
                    int i9 = layoutParams.f7232a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i13 > i10 - i14) {
                                i11 = (i10 - i14) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        m5999S(childAt, f);
                    }
                    int i17 = layoutParams.f7233b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (G0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            sj8 sj8VarM46393h = r9j.m46384w(rootWindowInsets).m46393h();
            fwi fwiVar = this.f7226g;
            fwiVar.m27678M(Math.max(fwiVar.m27706x(), sj8VarM46393h.f45477a));
            fwi fwiVar2 = this.f7227h;
            fwiVar2.m27678M(Math.max(fwiVar2.m27706x(), sj8VarM46393h.f45479c));
        }
        this.f7231y = false;
        this.f7216H = false;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z = this.s0 != null && wvi.m55136w(this);
        int iM55139z = wvi.m55139z(this);
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int iM23889b = dv7.m23889b(layoutParams.f7232a, iM55139z);
                    if (wvi.m55136w(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.s0;
                        if (iM23889b == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iM23889b == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.s0;
                        if (iM23889b == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iM23889b == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m5984D(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!m5986F(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (F0) {
                        float fM55134u = wvi.m55134u(childAt);
                        float f = this.f7221b;
                        if (fM55134u != f) {
                            wvi.s0(childAt, f);
                        }
                    }
                    int iM6024v = m6024v(childAt) & 7;
                    boolean z4 = iM6024v == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m5980y(iM6024v) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f7222c + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View viewM6018p;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m5953a());
        int i = savedState.f7236c;
        if (i != 0 && (viewM6018p = m6018p(i)) != null) {
            m5993M(viewM6018p);
        }
        int i2 = savedState.f7237d;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.f7238e;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.f7239f;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.f7240g;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        m5998R();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f7235d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f7236c = layoutParams.f7232a;
                break;
            }
        }
        savedState.f7237d = this.f7217L;
        savedState.f7238e = this.f7218M;
        savedState.f7239f = this.f7219Q;
        savedState.f7240g = this.h0;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View viewM6019q;
        this.f7226g.m27672G(motionEvent);
        this.f7227h.m27672G(motionEvent);
        int action = motionEvent.getAction() & Constants.MAX_HOST_LENGTH;
        boolean z = false;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.l0 = x;
            this.m0 = y;
            this.i0 = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View viewM27703u = this.f7226g.m27703u((int) x2, (int) y2);
            if (viewM27703u == null || !m5984D(viewM27703u)) {
                z = true;
                m6013k(z);
            } else {
                float f = x2 - this.l0;
                float f2 = y2 - this.m0;
                int iM27666A = this.f7226g.m27666A();
                if ((f * f) + (f2 * f2) >= iM27666A * iM27666A || (viewM6019q = m6019q()) == null || m6022t(viewM6019q) == 2) {
                }
                m6013k(z);
            }
        } else if (action == 3) {
            m6013k(true);
            this.i0 = false;
        }
        return true;
    }

    /* renamed from: p */
    public View m6018p(int i) {
        int iM23889b = dv7.m23889b(i, wvi.m55139z(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((m6024v(childAt) & 7) == iM23889b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public View m6019q() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f7235d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: r */
    public View m6020r() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m5986F(childAt) && m5987G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            m6013k(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f7231y) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: s */
    public int m6021s(int i) {
        int iM55139z = wvi.m55139z(this);
        if (i == 3) {
            int i2 = this.f7217L;
            if (i2 != 3) {
                return i2;
            }
            int i3 = iM55139z == 0 ? this.f7219Q : this.h0;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.f7218M;
            if (i4 != 3) {
                return i4;
            }
            int i5 = iM55139z == 0 ? this.h0 : this.f7219Q;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.f7219Q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = iM55139z == 0 ? this.f7217L : this.f7218M;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.h0;
        if (i8 != 3) {
            return i8;
        }
        int i9 = iM55139z == 0 ? this.f7218M : this.f7217L;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    public void setChildInsets(Object obj, boolean z) {
        this.s0 = obj;
        this.t0 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f7221b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m5986F(childAt)) {
                wvi.s0(childAt, this.f7221b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC2057e interfaceC2057e) {
        InterfaceC2057e interfaceC2057e2 = this.j0;
        if (interfaceC2057e2 != null) {
            m5995O(interfaceC2057e2);
        }
        if (interfaceC2057e != null) {
            m6004b(interfaceC2057e);
        }
        this.j0 = interfaceC2057e;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (F0) {
            return;
        }
        if ((i & 8388611) == 8388611) {
            this.u0 = drawable;
        } else if ((i & 8388613) == 8388613) {
            this.v0 = drawable;
        } else if ((i & 3) == 3) {
            this.w0 = drawable;
        } else if ((i & 5) != 5) {
            return;
        } else {
            this.x0 = drawable;
        }
        m5998R();
        invalidate();
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        int iM23889b = dv7.m23889b(i, wvi.m55139z(this));
        if (iM23889b == 3) {
            this.q0 = charSequence;
        } else if (iM23889b == 5) {
            this.r0 = charSequence;
        }
    }

    public void setScrimColor(int i) {
        this.f7223d = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.n0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.n0 = new ColorDrawable(i);
        invalidate();
    }

    /* renamed from: t */
    public int m6022t(View view) {
        if (m5986F(view)) {
            return m6021s(((LayoutParams) view.getLayoutParams()).f7232a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: u */
    public CharSequence m6023u(int i) {
        int iM23889b = dv7.m23889b(i, wvi.m55139z(this));
        if (iM23889b == 3) {
            return this.q0;
        }
        if (iM23889b == 5) {
            return this.r0;
        }
        return null;
    }

    /* renamed from: v */
    public int m6024v(View view) {
        return dv7.m23889b(((LayoutParams) view.getLayoutParams()).f7232a, wvi.m55139z(this));
    }

    /* renamed from: w */
    public float m6025w(View view) {
        return ((LayoutParams) view.getLayoutParams()).f7233b;
    }

    /* renamed from: x */
    public final MotionEvent m6026x(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.A0 == null) {
                this.A0 = new Matrix();
            }
            matrix.invert(this.A0);
            motionEventObtain.transform(this.A0);
        }
        return motionEventObtain;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e6e.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7220a = new C2056d();
        this.f7223d = -1728053248;
        this.f7225f = new Paint();
        this.f7216H = true;
        this.f7217L = 3;
        this.f7218M = 3;
        this.f7219Q = 3;
        this.h0 = 3;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.B0 = new C2053a();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f7222c = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C2059g c2059g = new C2059g(3);
        this.f7228q = c2059g;
        C2059g c2059g2 = new C2059g(5);
        this.f7229s = c2059g2;
        fwi fwiVarM27664o = fwi.m27664o(this, 1.0f, c2059g);
        this.f7226g = fwiVarM27664o;
        fwiVarM27664o.m27679N(1);
        fwiVarM27664o.m27680O(f2);
        c2059g.m6038d(fwiVarM27664o);
        fwi fwiVarM27664o2 = fwi.m27664o(this, 1.0f, c2059g2);
        this.f7227h = fwiVarM27664o2;
        fwiVarM27664o2.m27679N(2);
        fwiVarM27664o2.m27680O(f2);
        c2059g2.m6038d(fwiVarM27664o2);
        setFocusableInTouchMode(true);
        wvi.t0(this, 1);
        wvi.m0(this, new C2055c());
        setMotionEventSplittingEnabled(false);
        if (wvi.m55136w(this)) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC2054b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C0);
            try {
                this.n0 = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, pbe.DrawerLayout, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(pbe.DrawerLayout_elevation)) {
                this.f7221b = typedArrayObtainStyledAttributes2.getDimension(pbe.DrawerLayout_elevation, 0.0f);
            } else {
                this.f7221b = getResources().getDimension(f7e.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.y0 = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        View viewM6018p;
        int iM23889b = dv7.m23889b(i2, wvi.m55139z(this));
        if (i2 == 3) {
            this.f7217L = i;
        } else if (i2 == 5) {
            this.f7218M = i;
        } else if (i2 == 8388611) {
            this.f7219Q = i;
        } else if (i2 == 8388613) {
            this.h0 = i;
        }
        if (i != 0) {
            (iM23889b == 3 ? this.f7226g : this.f7227h).m27686b();
        }
        if (i != 1) {
            if (i == 2 && (viewM6018p = m6018p(iM23889b)) != null) {
                m5993M(viewM6018p);
                return;
            }
            return;
        }
        View viewM6018p2 = m6018p(iM23889b);
        if (viewM6018p2 != null) {
            m6010h(viewM6018p2);
        }
    }

    public void setStatusBarBackground(int i) {
        this.n0 = i != 0 ? c64.getDrawable(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f7232a;

        /* renamed from: b */
        public float f7233b;

        /* renamed from: c */
        public boolean f7234c;

        /* renamed from: d */
        public int f7235d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7232a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.D0);
            this.f7232a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f7232a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f7232a = 0;
            this.f7232a = layoutParams.f7232a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7232a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7232a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2052a();

        /* renamed from: c */
        public int f7236c;

        /* renamed from: d */
        public int f7237d;

        /* renamed from: e */
        public int f7238e;

        /* renamed from: f */
        public int f7239f;

        /* renamed from: g */
        public int f7240g;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        public class C2052a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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
            this.f7236c = 0;
            this.f7236c = parcel.readInt();
            this.f7237d = parcel.readInt();
            this.f7238e = parcel.readInt();
            this.f7239f = parcel.readInt();
            this.f7240g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7236c);
            parcel.writeInt(this.f7237d);
            parcel.writeInt(this.f7238e);
            parcel.writeInt(this.f7239f);
            parcel.writeInt(this.f7240g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f7236c = 0;
        }
    }

    public void setDrawerShadow(int i, int i2) {
        setDrawerShadow(c64.getDrawable(getContext(), i), i2);
    }

    public void setDrawerLockMode(int i, View view) {
        if (m5986F(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f7232a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }
}
