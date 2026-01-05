package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C2395a;
import androidx.recyclerview.widget.C2399e;
import androidx.recyclerview.widget.C2410p;
import androidx.recyclerview.widget.C2414t;
import androidx.recyclerview.widget.C2415u;
import androidx.recyclerview.widget.RunnableC2403i;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.c36;
import p001o.cc;
import p001o.cwi;
import p001o.db;
import p001o.ded;
import p001o.dtb;
import p001o.eb;
import p001o.etb;
import p001o.fgd;
import p001o.g6e;
import p001o.i7e;
import p001o.kmb;
import p001o.tq;
import p001o.vae;
import p001o.wvi;
import p001o.zsh;

/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements dtb {
    public static final a0 A1;
    public static final int[] q1 = {R.attr.nestedScrollingEnabled};
    public static final float r1 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean s1 = false;
    public static final boolean t1 = true;
    public static final boolean u1 = true;
    public static final boolean v1 = true;
    public static final boolean w1 = false;
    public static final boolean x1 = false;
    public static final Class[] y1;
    public static final Interpolator z1;
    public EdgeEffect A0;
    public EdgeEffect B0;
    public EdgeEffect C0;
    public EdgeEffect D0;
    public AbstractC2376m E0;
    public int F0;
    public int G0;

    /* renamed from: H */
    public AbstractC2371h f9762H;
    public VelocityTracker H0;
    public int I0;
    public int J0;
    public int K0;

    /* renamed from: L */
    public AbstractC2379p f9763L;
    public int L0;

    /* renamed from: M */
    public final List f9764M;
    public int M0;
    public AbstractC2381r N0;
    public final int O0;
    public final int P0;

    /* renamed from: Q */
    public final ArrayList f9765Q;
    public float Q0;
    public float R0;
    public boolean S0;
    public final c0 T0;
    public RunnableC2403i U0;
    public RunnableC2403i.b V0;
    public final C2389z W0;
    public AbstractC2383t X0;
    public List Y0;
    public boolean Z0;

    /* renamed from: a */
    public final float f9766a;
    public boolean a1;

    /* renamed from: b */
    public final C2387x f9767b;
    public AbstractC2376m.b b1;

    /* renamed from: c */
    public final C2385v f9768c;
    public boolean c1;

    /* renamed from: d */
    public SavedState f9769d;
    public C2410p d1;

    /* renamed from: e */
    public C2395a f9770e;
    public InterfaceC2374k e1;

    /* renamed from: f */
    public C2399e f9771f;
    public final int[] f1;

    /* renamed from: g */
    public final C2415u f9772g;
    public etb g1;

    /* renamed from: h */
    public boolean f9773h;
    public final ArrayList h0;
    public final int[] h1;
    public InterfaceC2382s i0;
    public final int[] i1;
    public boolean j0;
    public final int[] j1;
    public boolean k0;
    public final List k1;
    public boolean l0;
    public Runnable l1;
    public boolean m0;
    public boolean m1;
    public int n0;
    public int n1;
    public boolean o0;
    public int o1;
    public boolean p0;
    public final C2415u.b p1;

    /* renamed from: q */
    public final Runnable f9774q;
    public boolean q0;
    public int r0;

    /* renamed from: s */
    public final Rect f9775s;
    public boolean s0;
    public final AccessibilityManager t0;
    public List u0;
    public boolean v0;
    public boolean w0;

    /* renamed from: x */
    public final Rect f9776x;
    public int x0;

    /* renamed from: y */
    public final RectF f9777y;
    public int y0;
    public C2375l z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class RunnableC2364a implements Runnable {
        public RunnableC2364a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.m0 || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.j0) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.p0) {
                recyclerView2.o0 = true;
            } else {
                recyclerView2.m9102y();
            }
        }
    }

    public static class a0 extends C2375l {
        @Override // androidx.recyclerview.widget.RecyclerView.C2375l
        /* renamed from: a */
        public EdgeEffect mo9112a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class RunnableC2365b implements Runnable {
        public RunnableC2365b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2376m abstractC2376m = RecyclerView.this.E0;
            if (abstractC2376m != null) {
                abstractC2376m.mo9219v();
            }
            RecyclerView.this.c1 = false;
        }
    }

    public static abstract class b0 {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class InterpolatorC2366c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class c0 implements Runnable {

        /* renamed from: a */
        public int f9785a;

        /* renamed from: b */
        public int f9786b;

        /* renamed from: c */
        public OverScroller f9787c;

        /* renamed from: d */
        public Interpolator f9788d;

        /* renamed from: e */
        public boolean f9789e;

        /* renamed from: f */
        public boolean f9790f;

        public c0() {
            Interpolator interpolator = RecyclerView.z1;
            this.f9788d = interpolator;
            this.f9789e = false;
            this.f9790f = false;
            this.f9787c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final int m9113a(int i, int i2) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: b */
        public void m9114b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f9786b = 0;
            this.f9785a = 0;
            Interpolator interpolator = this.f9788d;
            Interpolator interpolator2 = RecyclerView.z1;
            if (interpolator != interpolator2) {
                this.f9788d = interpolator2;
                this.f9787c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f9787c.fling(0, 0, i, i2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            m9116d();
        }

        /* renamed from: c */
        public final void m9115c() {
            RecyclerView.this.removeCallbacks(this);
            wvi.e0(RecyclerView.this, this);
        }

        /* renamed from: d */
        public void m9116d() {
            if (this.f9789e) {
                this.f9790f = true;
            } else {
                m9115c();
            }
        }

        /* renamed from: e */
        public void m9117e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m9113a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.z1;
            }
            if (this.f9788d != interpolator) {
                this.f9788d = interpolator;
                this.f9787c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f9786b = 0;
            this.f9785a = 0;
            RecyclerView.this.setScrollState(2);
            this.f9787c.startScroll(0, 0, i, i2, i4);
            m9116d();
        }

        /* renamed from: f */
        public void m9118f() {
            RecyclerView.this.removeCallbacks(this);
            this.f9787c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f9763L == null) {
                m9118f();
                return;
            }
            this.f9790f = false;
            this.f9789e = true;
            recyclerView.m9102y();
            OverScroller overScroller = this.f9787c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f9785a;
                int i4 = currY - this.f9786b;
                this.f9785a = currX;
                this.f9786b = currY;
                int iM9099v = RecyclerView.this.m9099v(i3);
                int iM9101x = RecyclerView.this.m9101x(i4);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.j1;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m9067J(iM9099v, iM9101x, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.j1;
                    iM9099v -= iArr2[0];
                    iM9101x -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m9098u(iM9099v, iM9101x);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f9762H != null) {
                    int[] iArr3 = recyclerView3.j1;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.r1(iM9099v, iM9101x, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.j1;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    iM9099v -= i2;
                    iM9101x -= i;
                    AbstractC2388y abstractC2388y = recyclerView4.f9763L.f9839g;
                    if (abstractC2388y != null && !abstractC2388y.m9326g() && abstractC2388y.m9327h()) {
                        int iM9344b = RecyclerView.this.W0.m9344b();
                        if (iM9344b == 0) {
                            abstractC2388y.m9337r();
                        } else if (abstractC2388y.m9325f() >= iM9344b) {
                            abstractC2388y.m9335p(iM9344b - 1);
                            abstractC2388y.m9329j(i2, i);
                        } else {
                            abstractC2388y.m9329j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f9765Q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.j1;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m9068K(i2, i, iM9099v, iM9101x, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.j1;
                int i5 = iM9099v - iArr6[0];
                int i6 = iM9101x - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.m9070M(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                AbstractC2388y abstractC2388y2 = RecyclerView.this.f9763L.f9839g;
                if ((abstractC2388y2 != null && abstractC2388y2.m9326g()) || !z) {
                    m9116d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC2403i runnableC2403i = recyclerView7.U0;
                    if (runnableC2403i != null) {
                        runnableC2403i.m9536f(recyclerView7, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m9084b(i7, currVelocity);
                    }
                    if (RecyclerView.v1) {
                        RecyclerView.this.V0.m9542b();
                    }
                }
            }
            AbstractC2388y abstractC2388y3 = RecyclerView.this.f9763L.f9839g;
            if (abstractC2388y3 != null && abstractC2388y3.m9326g()) {
                abstractC2388y3.m9329j(0, 0);
            }
            this.f9789e = false;
            if (this.f9790f) {
                m9115c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.G1(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C2367d implements C2415u.b {
        public C2367d() {
        }

        @Override // androidx.recyclerview.widget.C2415u.b
        /* renamed from: a */
        public void mo9119a(d0 d0Var, AbstractC2376m.c cVar, AbstractC2376m.c cVar2) {
            RecyclerView.this.m9091m(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C2415u.b
        /* renamed from: b */
        public void mo9120b(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f9763L.z1(d0Var.f9794a, recyclerView.f9768c);
        }

        @Override // androidx.recyclerview.widget.C2415u.b
        /* renamed from: c */
        public void mo9121c(d0 d0Var, AbstractC2376m.c cVar, AbstractC2376m.c cVar2) {
            RecyclerView.this.f9768c.m9289O(d0Var);
            RecyclerView.this.m9093o(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C2415u.b
        /* renamed from: d */
        public void mo9122d(d0 d0Var, AbstractC2376m.c cVar, AbstractC2376m.c cVar2) {
            d0Var.m9131I(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.v0) {
                if (recyclerView.E0.mo9200b(d0Var, d0Var, cVar, cVar2)) {
                    RecyclerView.this.U0();
                }
            } else if (recyclerView.E0.mo9202d(d0Var, cVar, cVar2)) {
                RecyclerView.this.U0();
            }
        }
    }

    public static abstract class d0 {

        /* renamed from: t */
        public static final List f9793t = Collections.emptyList();

        /* renamed from: a */
        public final View f9794a;

        /* renamed from: b */
        public WeakReference f9795b;

        /* renamed from: j */
        public int f9803j;

        /* renamed from: r */
        public RecyclerView f9811r;

        /* renamed from: s */
        public AbstractC2371h f9812s;

        /* renamed from: c */
        public int f9796c = -1;

        /* renamed from: d */
        public int f9797d = -1;

        /* renamed from: e */
        public long f9798e = -1;

        /* renamed from: f */
        public int f9799f = -1;

        /* renamed from: g */
        public int f9800g = -1;

        /* renamed from: h */
        public d0 f9801h = null;

        /* renamed from: i */
        public d0 f9802i = null;

        /* renamed from: k */
        public List f9804k = null;

        /* renamed from: l */
        public List f9805l = null;

        /* renamed from: m */
        public int f9806m = 0;

        /* renamed from: n */
        public C2385v f9807n = null;

        /* renamed from: o */
        public boolean f9808o = false;

        /* renamed from: p */
        public int f9809p = 0;

        /* renamed from: q */
        public int f9810q = -1;

        public d0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f9794a = view;
        }

        /* renamed from: A */
        public boolean m9123A() {
            return (this.f9803j & 2) != 0;
        }

        /* renamed from: B */
        public boolean m9124B() {
            return (this.f9803j & 2) != 0;
        }

        /* renamed from: C */
        public void m9125C(int i, boolean z) {
            if (this.f9797d == -1) {
                this.f9797d = this.f9796c;
            }
            if (this.f9800g == -1) {
                this.f9800g = this.f9796c;
            }
            if (z) {
                this.f9800g += i;
            }
            this.f9796c += i;
            if (this.f9794a.getLayoutParams() != null) {
                ((LayoutParams) this.f9794a.getLayoutParams()).f9780c = true;
            }
        }

        /* renamed from: D */
        public void m9126D(RecyclerView recyclerView) {
            int i = this.f9810q;
            if (i != -1) {
                this.f9809p = i;
            } else {
                this.f9809p = wvi.m55137x(this.f9794a);
            }
            recyclerView.u1(this, 4);
        }

        /* renamed from: E */
        public void m9127E(RecyclerView recyclerView) {
            recyclerView.u1(this, this.f9809p);
            this.f9809p = 0;
        }

        /* renamed from: F */
        public void m9128F() {
            this.f9803j = 0;
            this.f9796c = -1;
            this.f9797d = -1;
            this.f9798e = -1L;
            this.f9800g = -1;
            this.f9806m = 0;
            this.f9801h = null;
            this.f9802i = null;
            m9140d();
            this.f9809p = 0;
            this.f9810q = -1;
            RecyclerView.m9057s(this);
        }

        /* renamed from: G */
        public void m9129G() {
            if (this.f9797d == -1) {
                this.f9797d = this.f9796c;
            }
        }

        /* renamed from: H */
        public void m9130H(int i, int i2) {
            this.f9803j = (i & i2) | (this.f9803j & (~i2));
        }

        /* renamed from: I */
        public final void m9131I(boolean z) {
            int i = this.f9806m;
            int i2 = z ? i - 1 : i + 1;
            this.f9806m = i2;
            if (i2 < 0) {
                this.f9806m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                return;
            }
            if (!z && i2 == 1) {
                this.f9803j |= 16;
            } else if (z && i2 == 0) {
                this.f9803j &= -17;
            }
        }

        /* renamed from: J */
        public void m9132J(C2385v c2385v, boolean z) {
            this.f9807n = c2385v;
            this.f9808o = z;
        }

        /* renamed from: K */
        public boolean m9133K() {
            return (this.f9803j & 16) != 0;
        }

        /* renamed from: L */
        public boolean m9134L() {
            return (this.f9803j & 128) != 0;
        }

        /* renamed from: M */
        public void m9135M() {
            this.f9807n.m9289O(this);
        }

        /* renamed from: N */
        public boolean m9136N() {
            return (this.f9803j & 32) != 0;
        }

        /* renamed from: a */
        public void m9137a(Object obj) {
            if (obj == null) {
                m9138b(1024);
            } else if ((1024 & this.f9803j) == 0) {
                m9143g();
                this.f9804k.add(obj);
            }
        }

        /* renamed from: b */
        public void m9138b(int i) {
            this.f9803j = i | this.f9803j;
        }

        /* renamed from: c */
        public void m9139c() {
            this.f9797d = -1;
            this.f9800g = -1;
        }

        /* renamed from: d */
        public void m9140d() {
            List list = this.f9804k;
            if (list != null) {
                list.clear();
            }
            this.f9803j &= -1025;
        }

        /* renamed from: e */
        public void m9141e() {
            this.f9803j &= -33;
        }

        /* renamed from: f */
        public void m9142f() {
            this.f9803j &= -257;
        }

        /* renamed from: g */
        public final void m9143g() {
            if (this.f9804k == null) {
                ArrayList arrayList = new ArrayList();
                this.f9804k = arrayList;
                this.f9805l = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: h */
        public boolean m9144h() {
            return (this.f9803j & 16) == 0 && wvi.m55102O(this.f9794a);
        }

        /* renamed from: i */
        public void m9145i(int i, int i2, boolean z) {
            m9138b(8);
            m9125C(i2, z);
            this.f9796c = i;
        }

        /* renamed from: j */
        public final int m9146j() {
            RecyclerView recyclerView = this.f9811r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.g0(this);
        }

        /* renamed from: k */
        public final int m9147k() {
            return m9148l();
        }

        /* renamed from: l */
        public final int m9148l() {
            RecyclerView recyclerView;
            AbstractC2371h adapter;
            int iG0;
            if (this.f9812s == null || (recyclerView = this.f9811r) == null || (adapter = recyclerView.getAdapter()) == null || (iG0 = this.f9811r.g0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.f9812s, this, iG0);
        }

        /* renamed from: m */
        public final long m9149m() {
            return this.f9798e;
        }

        /* renamed from: n */
        public final int m9150n() {
            return this.f9799f;
        }

        /* renamed from: o */
        public final int m9151o() {
            int i = this.f9800g;
            return i == -1 ? this.f9796c : i;
        }

        /* renamed from: p */
        public final int m9152p() {
            return this.f9797d;
        }

        /* renamed from: q */
        public List m9153q() {
            if ((this.f9803j & 1024) != 0) {
                return f9793t;
            }
            List list = this.f9804k;
            return (list == null || list.size() == 0) ? f9793t : this.f9805l;
        }

        /* renamed from: r */
        public boolean m9154r(int i) {
            return (i & this.f9803j) != 0;
        }

        /* renamed from: s */
        public boolean m9155s() {
            return (this.f9803j & 512) != 0 || m9158v();
        }

        /* renamed from: t */
        public boolean m9156t() {
            return (this.f9794a.getParent() == null || this.f9794a.getParent() == this.f9811r) ? false : true;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f9796c + " id=" + this.f9798e + ", oldPos=" + this.f9797d + ", pLpos:" + this.f9800g);
            if (m9161y()) {
                sb.append(" scrap ");
                sb.append(this.f9808o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (m9158v()) {
                sb.append(" invalid");
            }
            if (!m9157u()) {
                sb.append(" unbound");
            }
            if (m9124B()) {
                sb.append(" update");
            }
            if (m9160x()) {
                sb.append(" removed");
            }
            if (m9134L()) {
                sb.append(" ignored");
            }
            if (m9162z()) {
                sb.append(" tmpDetached");
            }
            if (!m9159w()) {
                sb.append(" not recyclable(" + this.f9806m + ")");
            }
            if (m9155s()) {
                sb.append(" undefined adapter position");
            }
            if (this.f9794a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: u */
        public boolean m9157u() {
            return (this.f9803j & 1) != 0;
        }

        /* renamed from: v */
        public boolean m9158v() {
            return (this.f9803j & 4) != 0;
        }

        /* renamed from: w */
        public final boolean m9159w() {
            return (this.f9803j & 16) == 0 && !wvi.m55102O(this.f9794a);
        }

        /* renamed from: x */
        public boolean m9160x() {
            return (this.f9803j & 8) != 0;
        }

        /* renamed from: y */
        public boolean m9161y() {
            return this.f9807n != null;
        }

        /* renamed from: z */
        public boolean m9162z() {
            return (this.f9803j & 256) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C2368e implements C2399e.b {
        public C2368e() {
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: a */
        public View mo9163a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: b */
        public void mo9164b(View view) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (d0VarL0 != null) {
                d0VarL0.m9126D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: c */
        public int mo9165c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: d */
        public d0 mo9166d(View view) {
            return RecyclerView.l0(view);
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: e */
        public void mo9167e(int i) {
            d0 d0VarL0;
            View viewMo9163a = mo9163a(i);
            if (viewMo9163a != null && (d0VarL0 = RecyclerView.l0(viewMo9163a)) != null) {
                if (d0VarL0.m9162z() && !d0VarL0.m9134L()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + d0VarL0 + RecyclerView.this.m9077T());
                }
                d0VarL0.m9138b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: f */
        public void mo9168f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.m9060C(view);
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: g */
        public void mo9169g() {
            int iMo9165c = mo9165c();
            for (int i = 0; i < iMo9165c; i++) {
                View viewMo9163a = mo9163a(i);
                RecyclerView.this.m9061D(viewMo9163a);
                viewMo9163a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: h */
        public int mo9170h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: i */
        public void mo9171i(View view) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (d0VarL0 != null) {
                d0VarL0.m9127E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: j */
        public void mo9172j(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.m9061D(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C2399e.b
        /* renamed from: k */
        public void mo9173k(View view, int i, ViewGroup.LayoutParams layoutParams) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (d0VarL0 != null) {
                if (!d0VarL0.m9162z() && !d0VarL0.m9134L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + d0VarL0 + RecyclerView.this.m9077T());
                }
                d0VarL0.m9142f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C2369f implements C2395a.a {
        public C2369f() {
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: a */
        public void mo9174a(int i, int i2) {
            RecyclerView.this.K0(i, i2);
            RecyclerView.this.Z0 = true;
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: b */
        public void mo9175b(C2395a.b bVar) {
            m9182i(bVar);
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: c */
        public void mo9176c(C2395a.b bVar) {
            m9182i(bVar);
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: d */
        public void mo9177d(int i, int i2) {
            RecyclerView.this.L0(i, i2, false);
            RecyclerView.this.Z0 = true;
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: e */
        public void mo9178e(int i, int i2, Object obj) {
            RecyclerView.this.J1(i, i2, obj);
            RecyclerView.this.a1 = true;
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: f */
        public d0 mo9179f(int i) {
            d0 d0VarE0 = RecyclerView.this.e0(i, true);
            if (d0VarE0 == null || RecyclerView.this.f9771f.m9457n(d0VarE0.f9794a)) {
                return null;
            }
            return d0VarE0;
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: g */
        public void mo9180g(int i, int i2) {
            RecyclerView.this.J0(i, i2);
            RecyclerView.this.Z0 = true;
        }

        @Override // androidx.recyclerview.widget.C2395a.a
        /* renamed from: h */
        public void mo9181h(int i, int i2) {
            RecyclerView.this.L0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.Z0 = true;
            recyclerView.W0.f9885d += i2;
        }

        /* renamed from: i */
        public void m9182i(C2395a.b bVar) {
            int i = bVar.f9940a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f9763L.d1(recyclerView, bVar.f9941b, bVar.f9943d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f9763L.g1(recyclerView2, bVar.f9941b, bVar.f9943d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f9763L.i1(recyclerView3, bVar.f9941b, bVar.f9943d, bVar.f9942c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f9763L.f1(recyclerView4, bVar.f9941b, bVar.f9943d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static /* synthetic */ class C2370g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9815a;

        static {
            int[] iArr = new int[AbstractC2371h.a.values().length];
            f9815a = iArr;
            try {
                iArr[AbstractC2371h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9815a[AbstractC2371h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class AbstractC2371h {
        private final C2372i mObservable = new C2372i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(d0 d0Var, int i) {
            boolean z = d0Var.f9812s == null;
            if (z) {
                d0Var.f9796c = i;
                if (hasStableIds()) {
                    d0Var.f9798e = getItemId(i);
                }
                d0Var.m9130H(1, 519);
                zsh.m59821a("RV OnBindView");
            }
            d0Var.f9812s = this;
            onBindViewHolder(d0Var, i, d0Var.m9153q());
            if (z) {
                d0Var.m9140d();
                ViewGroup.LayoutParams layoutParams = d0Var.f9794a.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f9780c = true;
                }
                zsh.m59822b();
            }
        }

        public boolean canRestoreState() {
            int i = C2370g.f9815a[this.mStateRestorationPolicy.ordinal()];
            if (i != 1) {
                return i != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final d0 createViewHolder(ViewGroup viewGroup, int i) {
            try {
                zsh.m59821a("RV CreateView");
                d0 d0VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (d0VarOnCreateViewHolder.f9794a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                d0VarOnCreateViewHolder.f9799f = i;
                return d0VarOnCreateViewHolder;
            } finally {
                zsh.m59822b();
            }
        }

        public int findRelativeAdapterPositionIn(AbstractC2371h abstractC2371h, d0 d0Var, int i) {
            if (abstractC2371h == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m9183a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m9184b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.m9186d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m9188f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m9185c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m9186d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m9188f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m9189g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m9189g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(d0 d0Var, int i);

        public void onBindViewHolder(d0 d0Var, int i, List<Object> list) {
            onBindViewHolder(d0Var, i);
        }

        public abstract d0 onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(d0 d0Var) {
            return false;
        }

        public void onViewAttachedToWindow(d0 d0Var) {
        }

        public void onViewDetachedFromWindow(d0 d0Var) {
        }

        public void onViewRecycled(d0 d0Var) {
        }

        public void registerAdapterDataObserver(AbstractC2373j abstractC2373j) {
            this.mObservable.registerObserver(abstractC2373j);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.m9190h();
        }

        public void unregisterAdapterDataObserver(AbstractC2373j abstractC2373j) {
            this.mObservable.unregisterObserver(abstractC2373j);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.m9187e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.m9187e(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C2372i extends Observable {
        /* renamed from: a */
        public boolean m9183a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m9184b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2373j) ((Observable) this).mObservers.get(size)).mo9191a();
            }
        }

        /* renamed from: c */
        public void m9185c(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2373j) ((Observable) this).mObservers.get(size)).mo9194d(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void m9186d(int i, int i2) {
            m9187e(i, i2, null);
        }

        /* renamed from: e */
        public void m9187e(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2373j) ((Observable) this).mObservers.get(size)).mo9192b(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void m9188f(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2373j) ((Observable) this).mObservers.get(size)).mo9193c(i, i2);
            }
        }

        /* renamed from: g */
        public void m9189g(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2373j) ((Observable) this).mObservers.get(size)).mo9195e(i, i2);
            }
        }

        /* renamed from: h */
        public void m9190h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC2373j) ((Observable) this).mObservers.get(size)).mo9196f();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class AbstractC2373j {
        /* renamed from: a */
        public abstract void mo9191a();

        /* renamed from: b */
        public abstract void mo9192b(int i, int i2, Object obj);

        /* renamed from: c */
        public abstract void mo9193c(int i, int i2);

        /* renamed from: d */
        public abstract void mo9194d(int i, int i2, int i3);

        /* renamed from: e */
        public abstract void mo9195e(int i, int i2);

        /* renamed from: f */
        public void mo9196f() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface InterfaceC2374k {
        /* renamed from: a */
        int m9197a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C2375l {
        /* renamed from: a */
        public abstract EdgeEffect mo9112a(RecyclerView recyclerView, int i);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class AbstractC2376m {

        /* renamed from: a */
        public b f9816a = null;

        /* renamed from: b */
        public ArrayList f9817b = new ArrayList();

        /* renamed from: c */
        public long f9818c = 120;

        /* renamed from: d */
        public long f9819d = 120;

        /* renamed from: e */
        public long f9820e = 250;

        /* renamed from: f */
        public long f9821f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public interface a {
            /* renamed from: a */
            void mo9221a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public interface b {
            /* renamed from: a */
            void mo9222a(d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public static class c {

            /* renamed from: a */
            public int f9822a;

            /* renamed from: b */
            public int f9823b;

            /* renamed from: c */
            public int f9824c;

            /* renamed from: d */
            public int f9825d;

            /* renamed from: a */
            public c m9223a(d0 d0Var) {
                return m9224b(d0Var, 0);
            }

            /* renamed from: b */
            public c m9224b(d0 d0Var, int i) {
                View view = d0Var.f9794a;
                this.f9822a = view.getLeft();
                this.f9823b = view.getTop();
                this.f9824c = view.getRight();
                this.f9825d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        public static int m9198e(d0 d0Var) {
            int i = d0Var.f9803j & 14;
            if (d0Var.m9158v()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int iM9152p = d0Var.m9152p();
            int iM9146j = d0Var.m9146j();
            return (iM9152p == -1 || iM9146j == -1 || iM9152p == iM9146j) ? i : i | 2048;
        }

        /* renamed from: a */
        public abstract boolean mo9199a(d0 d0Var, c cVar, c cVar2);

        /* renamed from: b */
        public abstract boolean mo9200b(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        /* renamed from: c */
        public abstract boolean mo9201c(d0 d0Var, c cVar, c cVar2);

        /* renamed from: d */
        public abstract boolean mo9202d(d0 d0Var, c cVar, c cVar2);

        /* renamed from: f */
        public abstract boolean mo9203f(d0 d0Var);

        /* renamed from: g */
        public boolean mo9204g(d0 d0Var, List list) {
            return mo9203f(d0Var);
        }

        /* renamed from: h */
        public final void m9205h(d0 d0Var) {
            m9216s(d0Var);
            b bVar = this.f9816a;
            if (bVar != null) {
                bVar.mo9222a(d0Var);
            }
        }

        /* renamed from: i */
        public final void m9206i() {
            int size = this.f9817b.size();
            for (int i = 0; i < size; i++) {
                ((a) this.f9817b.get(i)).mo9221a();
            }
            this.f9817b.clear();
        }

        /* renamed from: j */
        public abstract void mo9207j(d0 d0Var);

        /* renamed from: k */
        public abstract void mo9208k();

        /* renamed from: l */
        public long m9209l() {
            return this.f9818c;
        }

        /* renamed from: m */
        public long m9210m() {
            return this.f9821f;
        }

        /* renamed from: n */
        public long m9211n() {
            return this.f9820e;
        }

        /* renamed from: o */
        public long m9212o() {
            return this.f9819d;
        }

        /* renamed from: p */
        public abstract boolean mo9213p();

        /* renamed from: q */
        public final boolean m9214q(a aVar) {
            boolean zMo9213p = mo9213p();
            if (aVar != null) {
                if (zMo9213p) {
                    this.f9817b.add(aVar);
                } else {
                    aVar.mo9221a();
                }
            }
            return zMo9213p;
        }

        /* renamed from: r */
        public c m9215r() {
            return new c();
        }

        /* renamed from: s */
        public void m9216s(d0 d0Var) {
        }

        /* renamed from: t */
        public c m9217t(C2389z c2389z, d0 d0Var) {
            return m9215r().m9223a(d0Var);
        }

        /* renamed from: u */
        public c m9218u(C2389z c2389z, d0 d0Var, int i, List list) {
            return m9215r().m9223a(d0Var);
        }

        /* renamed from: v */
        public abstract void mo9219v();

        /* renamed from: w */
        public void m9220w(b bVar) {
            this.f9816a = bVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public class C2377n implements AbstractC2376m.b {
        public C2377n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2376m.b
        /* renamed from: a */
        public void mo9222a(d0 d0Var) {
            d0Var.m9131I(true);
            if (d0Var.f9801h != null && d0Var.f9802i == null) {
                d0Var.f9801h = null;
            }
            d0Var.f9802i = null;
            if (d0Var.m9133K() || RecyclerView.this.f1(d0Var.f9794a) || !d0Var.m9162z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f9794a, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class AbstractC2378o {
        /* renamed from: f */
        public void m9225f(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo9226g(Rect rect, View view, RecyclerView recyclerView, C2389z c2389z) {
            m9225f(rect, ((LayoutParams) view.getLayoutParams()).m9104a(), recyclerView);
        }

        /* renamed from: h */
        public void m9227h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo9228i(Canvas canvas, RecyclerView recyclerView, C2389z c2389z) {
            m9227h(canvas, recyclerView);
        }

        /* renamed from: j */
        public void m9229j(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: k */
        public void mo9230k(Canvas canvas, RecyclerView recyclerView, C2389z c2389z) {
            m9229j(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC2379p {

        /* renamed from: H */
        public int f9827H;

        /* renamed from: L */
        public boolean f9828L;

        /* renamed from: M */
        public int f9829M;

        /* renamed from: Q */
        public int f9830Q;

        /* renamed from: X */
        public int f9831X;

        /* renamed from: Y */
        public int f9832Y;

        /* renamed from: a */
        public C2399e f9833a;

        /* renamed from: b */
        public RecyclerView f9834b;

        /* renamed from: c */
        public final C2414t.b f9835c;

        /* renamed from: d */
        public final C2414t.b f9836d;

        /* renamed from: e */
        public C2414t f9837e;

        /* renamed from: f */
        public C2414t f9838f;

        /* renamed from: g */
        public AbstractC2388y f9839g;

        /* renamed from: h */
        public boolean f9840h;

        /* renamed from: q */
        public boolean f9841q;

        /* renamed from: s */
        public boolean f9842s;

        /* renamed from: x */
        public boolean f9843x;

        /* renamed from: y */
        public boolean f9844y;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        public class a implements C2414t.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: a */
            public View mo9251a(int i) {
                return AbstractC2379p.this.m9240Y(i);
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: b */
            public int mo9252b(View view) {
                return AbstractC2379p.this.g0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: c */
            public int mo9253c() {
                return AbstractC2379p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: d */
            public int mo9254d() {
                return AbstractC2379p.this.z0() - AbstractC2379p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: e */
            public int mo9255e(View view) {
                return AbstractC2379p.this.j0(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        public class b implements C2414t.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: a */
            public View mo9251a(int i) {
                return AbstractC2379p.this.m9240Y(i);
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: b */
            public int mo9252b(View view) {
                return AbstractC2379p.this.k0(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: c */
            public int mo9253c() {
                return AbstractC2379p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: d */
            public int mo9254d() {
                return AbstractC2379p.this.m0() - AbstractC2379p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C2414t.b
            /* renamed from: e */
            public int mo9255e(View view) {
                return AbstractC2379p.this.e0(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface c {
            /* renamed from: a */
            void mo9256a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class d {

            /* renamed from: a */
            public int f9847a;

            /* renamed from: b */
            public int f9848b;

            /* renamed from: c */
            public boolean f9849c;

            /* renamed from: d */
            public boolean f9850d;
        }

        public AbstractC2379p() {
            a aVar = new a();
            this.f9835c = aVar;
            b bVar = new b();
            this.f9836d = bVar;
            this.f9837e = new C2414t(aVar);
            this.f9838f = new C2414t(bVar);
            this.f9840h = false;
            this.f9841q = false;
            this.f9842s = false;
            this.f9843x = true;
            this.f9844y = true;
        }

        /* renamed from: D */
        public static int m9231D(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public static boolean I0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int a0(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                        i2 = 0;
                        i4 = 0;
                    } else {
                        i4 = iMax;
                    }
                }
                i2 = 1073741824;
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1) {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i4 = iMax;
                        i2 = Integer.MIN_VALUE;
                    } else {
                        i4 = iMax;
                        i2 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public static d t0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vae.RecyclerView, i, i2);
            dVar.f9847a = typedArrayObtainStyledAttributes.getInt(vae.RecyclerView_android_orientation, 1);
            dVar.f9848b = typedArrayObtainStyledAttributes.getInt(vae.RecyclerView_spanCount, 1);
            dVar.f9849c = typedArrayObtainStyledAttributes.getBoolean(vae.RecyclerView_reverseLayout, false);
            dVar.f9850d = typedArrayObtainStyledAttributes.getBoolean(vae.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: A */
        public abstract boolean mo9027A();

        public int A0() {
            return this.f9829M;
        }

        public void A1(int i, C2385v c2385v) {
            View viewM9240Y = m9240Y(i);
            D1(i);
            c2385v.m9281G(viewM9240Y);
        }

        /* renamed from: B */
        public abstract boolean mo9028B();

        public boolean B0() {
            int iM9241Z = m9241Z();
            for (int i = 0; i < iM9241Z; i++) {
                ViewGroup.LayoutParams layoutParams = m9240Y(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean B1(Runnable runnable) {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: C */
        public boolean mo9009C(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public boolean C0() {
            return this.f9841q;
        }

        public void C1(View view) {
            this.f9833a.m9459p(view);
        }

        public abstract boolean D0();

        public void D1(int i) {
            if (m9240Y(i) != null) {
                this.f9833a.m9460q(i);
            }
        }

        /* renamed from: E */
        public void mo9029E(int i, int i2, C2389z c2389z, c cVar) {
        }

        public final boolean E0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iZ0 = z0() - getPaddingRight();
            int iM0 = m0() - getPaddingBottom();
            Rect rect = this.f9834b.f9775s;
            f0(focusedChild, rect);
            return rect.left - i < iZ0 && rect.right - i > paddingLeft && rect.top - i2 < iM0 && rect.bottom - i2 > paddingTop;
        }

        public boolean E1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return F1(recyclerView, view, rect, z, false);
        }

        /* renamed from: F */
        public void mo9030F(int i, c cVar) {
        }

        public final boolean F0() {
            return this.f9844y;
        }

        public boolean F1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrB0 = b0(view, rect);
            int i = iArrB0[0];
            int i2 = iArrB0[1];
            if ((z2 && !E0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.x1(i, i2);
            }
            return true;
        }

        /* renamed from: G */
        public abstract int mo9031G(C2389z c2389z);

        public boolean G0(C2385v c2385v, C2389z c2389z) {
            return false;
        }

        public void G1() {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: H */
        public abstract int mo9010H(C2389z c2389z);

        public boolean H0() {
            return this.f9843x;
        }

        public void H1() {
            this.f9840h = true;
        }

        /* renamed from: I */
        public abstract int mo9011I(C2389z c2389z);

        public final void I1(C2385v c2385v, int i, View view) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (d0VarL0.m9134L()) {
                return;
            }
            if (d0VarL0.m9158v() && !d0VarL0.m9160x() && !this.f9834b.f9762H.hasStableIds()) {
                D1(i);
                c2385v.m9282H(d0VarL0);
            } else {
                m9233N(i);
                c2385v.m9283I(view);
                this.f9834b.f9772g.m9703k(d0VarL0);
            }
        }

        /* renamed from: J */
        public abstract int mo9032J(C2389z c2389z);

        public boolean J0() {
            AbstractC2388y abstractC2388y = this.f9839g;
            return abstractC2388y != null && abstractC2388y.m9327h();
        }

        public abstract int J1(int i, C2385v c2385v, C2389z c2389z);

        /* renamed from: K */
        public abstract int mo9012K(C2389z c2389z);

        public boolean K0(View view, boolean z, boolean z2) {
            boolean z3 = this.f9837e.m9687b(view, 24579) && this.f9838f.m9687b(view, 24579);
            return z ? z3 : !z3;
        }

        public abstract void K1(int i);

        /* renamed from: L */
        public abstract int mo9013L(C2389z c2389z);

        public void L0(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f9779b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public abstract int L1(int i, C2385v c2385v, C2389z c2389z);

        /* renamed from: M */
        public void m9232M(C2385v c2385v) {
            for (int iM9241Z = m9241Z() - 1; iM9241Z >= 0; iM9241Z--) {
                I1(c2385v, iM9241Z, m9240Y(iM9241Z));
            }
        }

        public void M0(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rectP0 = this.f9834b.p0(view);
            int i3 = i + rectP0.left + rectP0.right;
            int i4 = i2 + rectP0.top + rectP0.bottom;
            int iA0 = a0(z0(), A0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, mo9027A());
            int iA02 = a0(m0(), n0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, mo9028B());
            if (S1(view, iA0, iA02, layoutParams)) {
                view.measure(iA0, iA02);
            }
        }

        public void M1(RecyclerView recyclerView) {
            N1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: N */
        public void m9233N(int i) {
            m9234O(i, m9240Y(i));
        }

        public void N0(int i, int i2) {
            View viewM9240Y = m9240Y(i);
            if (viewM9240Y != null) {
                m9233N(i);
                m9248x(viewM9240Y, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f9834b.toString());
            }
        }

        public void N1(int i, int i2) {
            this.f9831X = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f9829M = mode;
            if (mode == 0 && !RecyclerView.t1) {
                this.f9831X = 0;
            }
            this.f9832Y = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f9830Q = mode2;
            if (mode2 != 0 || RecyclerView.t1) {
                return;
            }
            this.f9832Y = 0;
        }

        /* renamed from: O */
        public final void m9234O(int i, View view) {
            this.f9833a.m9447d(i);
        }

        public void O0(int i) {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                recyclerView.H0(i);
            }
        }

        public void O1(int i, int i2) {
            this.f9834b.setMeasuredDimension(i, i2);
        }

        /* renamed from: P */
        public void m9235P(RecyclerView recyclerView) {
            this.f9841q = true;
            S0(recyclerView);
        }

        public void P0(int i) {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                recyclerView.I0(i);
            }
        }

        public void P1(Rect rect, int i, int i2) {
            O1(m9231D(i, rect.width() + getPaddingLeft() + getPaddingRight(), r0()), m9231D(i2, rect.height() + getPaddingTop() + getPaddingBottom(), q0()));
        }

        /* renamed from: Q */
        public void m9236Q(RecyclerView recyclerView, C2385v c2385v) {
            this.f9841q = false;
            U0(recyclerView, c2385v);
        }

        public void Q0(AbstractC2371h abstractC2371h, AbstractC2371h abstractC2371h2) {
        }

        public void Q1(int i, int i2) {
            int iM9241Z = m9241Z();
            if (iM9241Z == 0) {
                this.f9834b.m9058A(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < iM9241Z; i7++) {
                View viewM9240Y = m9240Y(i7);
                Rect rect = this.f9834b.f9775s;
                f0(viewM9240Y, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.f9834b.f9775s.set(i6, i4, i3, i5);
            P1(this.f9834b.f9775s, i, i2);
        }

        /* renamed from: R */
        public View m9237R(View view) {
            View viewM9080W;
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView == null || (viewM9080W = recyclerView.m9080W(view)) == null || this.f9833a.m9457n(viewM9080W)) {
                return null;
            }
            return viewM9080W;
        }

        public boolean R0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        public void R1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f9834b = null;
                this.f9833a = null;
                this.f9831X = 0;
                this.f9832Y = 0;
            } else {
                this.f9834b = recyclerView;
                this.f9833a = recyclerView.f9771f;
                this.f9831X = recyclerView.getWidth();
                this.f9832Y = recyclerView.getHeight();
            }
            this.f9829M = 1073741824;
            this.f9830Q = 1073741824;
        }

        /* renamed from: S */
        public View mo9033S(int i) {
            int iM9241Z = m9241Z();
            for (int i2 = 0; i2 < iM9241Z; i2++) {
                View viewM9240Y = m9240Y(i2);
                d0 d0VarL0 = RecyclerView.l0(viewM9240Y);
                if (d0VarL0 != null && d0VarL0.m9151o() == i && !d0VarL0.m9134L() && (this.f9834b.W0.m9347e() || !d0VarL0.m9160x())) {
                    return viewM9240Y;
                }
            }
            return null;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public boolean S1(View view, int i, int i2, LayoutParams layoutParams) {
            return (!view.isLayoutRequested() && this.f9843x && I0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && I0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: T */
        public abstract LayoutParams mo9014T();

        public void T0(RecyclerView recyclerView) {
        }

        public boolean T1() {
            return false;
        }

        /* renamed from: U */
        public LayoutParams mo9015U(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void U0(RecyclerView recyclerView, C2385v c2385v) {
            T0(recyclerView);
        }

        public boolean U1(View view, int i, int i2, LayoutParams layoutParams) {
            return (this.f9843x && I0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && I0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
        }

        /* renamed from: V */
        public LayoutParams mo9016V(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        public View V0(View view, int i, C2385v c2385v, C2389z c2389z) {
            return null;
        }

        public abstract void V1(RecyclerView recyclerView, C2389z c2389z, int i);

        /* renamed from: W */
        public int m9238W() {
            return -1;
        }

        public void W0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f9834b;
            X0(recyclerView.f9768c, recyclerView.W0, accessibilityEvent);
        }

        public void W1(AbstractC2388y abstractC2388y) {
            AbstractC2388y abstractC2388y2 = this.f9839g;
            if (abstractC2388y2 != null && abstractC2388y != abstractC2388y2 && abstractC2388y2.m9327h()) {
                this.f9839g.m9337r();
            }
            this.f9839g = abstractC2388y;
            abstractC2388y.m9336q(this.f9834b, this);
        }

        /* renamed from: X */
        public int m9239X(View view) {
            return ((LayoutParams) view.getLayoutParams()).f9779b.bottom;
        }

        public void X0(C2385v c2385v, C2389z c2389z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f9834b.canScrollVertically(-1) && !this.f9834b.canScrollHorizontally(-1) && !this.f9834b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC2371h abstractC2371h = this.f9834b.f9762H;
            if (abstractC2371h != null) {
                accessibilityEvent.setItemCount(abstractC2371h.getItemCount());
            }
        }

        public void X1() {
            AbstractC2388y abstractC2388y = this.f9839g;
            if (abstractC2388y != null) {
                abstractC2388y.m9337r();
            }
        }

        /* renamed from: Y */
        public View m9240Y(int i) {
            C2399e c2399e = this.f9833a;
            if (c2399e != null) {
                return c2399e.m9449f(i);
            }
            return null;
        }

        public void Y0(C2385v c2385v, C2389z c2389z, cc ccVar) {
            if (this.f9834b.canScrollVertically(-1) || this.f9834b.canScrollHorizontally(-1)) {
                ccVar.m20777a(8192);
                ccVar.P0(true);
            }
            if (this.f9834b.canScrollVertically(1) || this.f9834b.canScrollHorizontally(1)) {
                ccVar.m20777a(4096);
                ccVar.P0(true);
            }
            ccVar.q0(cc.C12628e.m20831b(v0(c2385v, c2389z), d0(c2385v, c2389z), G0(c2385v, c2389z), w0(c2385v, c2389z)));
        }

        public boolean Y1() {
            return false;
        }

        /* renamed from: Z */
        public int m9241Z() {
            C2399e c2399e = this.f9833a;
            if (c2399e != null) {
                return c2399e.m9450g();
            }
            return 0;
        }

        public void Z0(cc ccVar) {
            RecyclerView recyclerView = this.f9834b;
            Y0(recyclerView.f9768c, recyclerView.W0, ccVar);
        }

        public void a1(View view, cc ccVar) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (d0VarL0 == null || d0VarL0.m9160x() || this.f9833a.m9457n(d0VarL0.f9794a)) {
                return;
            }
            RecyclerView recyclerView = this.f9834b;
            b1(recyclerView.f9768c, recyclerView.W0, view, ccVar);
        }

        public final int[] b0(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iZ0 = z0() - getPaddingRight();
            int iM0 = m0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iZ0;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iM0);
            if (o0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public void b1(C2385v c2385v, C2389z c2389z, View view, cc ccVar) {
        }

        public boolean c0() {
            RecyclerView recyclerView = this.f9834b;
            return recyclerView != null && recyclerView.f9773h;
        }

        public View c1(View view, int i) {
            return null;
        }

        public int d0(C2385v c2385v, C2389z c2389z) {
            return -1;
        }

        public void d1(RecyclerView recyclerView, int i, int i2) {
        }

        public int e0(View view) {
            return view.getBottom() + m9239X(view);
        }

        public void e1(RecyclerView recyclerView) {
        }

        public void f0(View view, Rect rect) {
            RecyclerView.m0(view, rect);
        }

        public void f1(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int g0(View view) {
            return view.getLeft() - p0(view);
        }

        public void g1(RecyclerView recyclerView, int i, int i2) {
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                return wvi.m55091D(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                return wvi.m55092E(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int h0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f9779b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void h1(RecyclerView recyclerView, int i, int i2) {
        }

        public int i0(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f9779b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void i1(RecyclerView recyclerView, int i, int i2, Object obj) {
            h1(recyclerView, i, i2);
        }

        /* renamed from: j */
        public int m9242j() {
            RecyclerView recyclerView = this.f9834b;
            AbstractC2371h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int j0(View view) {
            return view.getRight() + u0(view);
        }

        public abstract void j1(C2385v c2385v, C2389z c2389z);

        public int k0(View view) {
            return view.getTop() - x0(view);
        }

        public void k1(C2389z c2389z) {
        }

        public View l0() {
            View focusedChild;
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f9833a.m9457n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void l1(C2385v c2385v, C2389z c2389z, int i, int i2) {
            this.f9834b.m9058A(i, i2);
        }

        public int m0() {
            return this.f9832Y;
        }

        public boolean m1(RecyclerView recyclerView, View view, View view2) {
            return J0() || recyclerView.B0();
        }

        public int n0() {
            return this.f9830Q;
        }

        public boolean n1(RecyclerView recyclerView, C2389z c2389z, View view, View view2) {
            return m1(recyclerView, view, view2);
        }

        public int o0() {
            return wvi.m55139z(this.f9834b);
        }

        public void o1(Parcelable parcelable) {
        }

        public int p0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f9779b.left;
        }

        public Parcelable p1() {
            return null;
        }

        public int q0() {
            return wvi.m55088A(this.f9834b);
        }

        public void q1(int i) {
        }

        /* renamed from: r */
        public void m9243r(View view) {
            m9244s(view, -1);
        }

        public int r0() {
            return wvi.m55089B(this.f9834b);
        }

        public void r1(AbstractC2388y abstractC2388y) {
            if (this.f9839g == abstractC2388y) {
                this.f9839g = null;
            }
        }

        /* renamed from: s */
        public void m9244s(View view, int i) {
            m9247v(view, i, true);
        }

        public int s0(View view) {
            return ((LayoutParams) view.getLayoutParams()).m9104a();
        }

        public boolean s1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f9834b;
            return t1(recyclerView.f9768c, recyclerView.W0, i, bundle);
        }

        /* renamed from: t */
        public void m9245t(View view) {
            m9246u(view, -1);
        }

        public boolean t1(C2385v c2385v, C2389z c2389z, int i, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i2;
            int i3;
            if (this.f9834b == null) {
                return false;
            }
            int iM0 = m0();
            int iZ0 = z0();
            Rect rect = new Rect();
            if (this.f9834b.getMatrix().isIdentity() && this.f9834b.getGlobalVisibleRect(rect)) {
                iM0 = rect.height();
                iZ0 = rect.width();
            }
            if (i == 4096) {
                paddingTop = this.f9834b.canScrollVertically(1) ? (iM0 - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f9834b.canScrollHorizontally(1)) {
                    paddingLeft = (iZ0 - getPaddingLeft()) - getPaddingRight();
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                paddingTop = this.f9834b.canScrollVertically(-1) ? -((iM0 - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f9834b.canScrollHorizontally(-1)) {
                    paddingLeft = -((iZ0 - getPaddingLeft()) - getPaddingRight());
                    i2 = paddingTop;
                    i3 = paddingLeft;
                }
                i2 = paddingTop;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f9834b.A1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: u */
        public void m9246u(View view, int i) {
            m9247v(view, i, false);
        }

        public int u0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f9779b.right;
        }

        public boolean u1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f9834b;
            return v1(recyclerView.f9768c, recyclerView.W0, view, i, bundle);
        }

        /* renamed from: v */
        public final void m9247v(View view, int i, boolean z) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (z || d0VarL0.m9160x()) {
                this.f9834b.f9772g.m9694b(d0VarL0);
            } else {
                this.f9834b.f9772g.m9708p(d0VarL0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (d0VarL0.m9136N() || d0VarL0.m9161y()) {
                if (d0VarL0.m9161y()) {
                    d0VarL0.m9135M();
                } else {
                    d0VarL0.m9141e();
                }
                this.f9833a.m9446c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f9834b) {
                int iM9456m = this.f9833a.m9456m(view);
                if (i == -1) {
                    i = this.f9833a.m9450g();
                }
                if (iM9456m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f9834b.indexOfChild(view) + this.f9834b.m9077T());
                }
                if (iM9456m != i) {
                    this.f9834b.f9763L.N0(iM9456m, i);
                }
            } else {
                this.f9833a.m9444a(view, i, false);
                layoutParams.f9780c = true;
                AbstractC2388y abstractC2388y = this.f9839g;
                if (abstractC2388y != null && abstractC2388y.m9327h()) {
                    this.f9839g.m9330k(view);
                }
            }
            if (layoutParams.f9781d) {
                d0VarL0.f9794a.invalidate();
                layoutParams.f9781d = false;
            }
        }

        public int v0(C2385v c2385v, C2389z c2389z) {
            return -1;
        }

        public boolean v1(C2385v c2385v, C2389z c2389z, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: w */
        public void mo9036w(String str) {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView != null) {
                recyclerView.m9094p(str);
            }
        }

        public int w0(C2385v c2385v, C2389z c2389z) {
            return 0;
        }

        public void w1() {
            for (int iM9241Z = m9241Z() - 1; iM9241Z >= 0; iM9241Z--) {
                this.f9833a.m9460q(iM9241Z);
            }
        }

        /* renamed from: x */
        public void m9248x(View view, int i) {
            m9249y(view, i, (LayoutParams) view.getLayoutParams());
        }

        public int x0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f9779b.top;
        }

        public void x1(C2385v c2385v) {
            for (int iM9241Z = m9241Z() - 1; iM9241Z >= 0; iM9241Z--) {
                if (!RecyclerView.l0(m9240Y(iM9241Z)).m9134L()) {
                    A1(iM9241Z, c2385v);
                }
            }
        }

        /* renamed from: y */
        public void m9249y(View view, int i, LayoutParams layoutParams) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (d0VarL0.m9160x()) {
                this.f9834b.f9772g.m9694b(d0VarL0);
            } else {
                this.f9834b.f9772g.m9708p(d0VarL0);
            }
            this.f9833a.m9446c(view, i, layoutParams, d0VarL0.m9160x());
        }

        public void y0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f9779b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f9834b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f9834b.f9777y;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void y1(C2385v c2385v) {
            int iM9302j = c2385v.m9302j();
            for (int i = iM9302j - 1; i >= 0; i--) {
                View viewM9306n = c2385v.m9306n(i);
                d0 d0VarL0 = RecyclerView.l0(viewM9306n);
                if (!d0VarL0.m9134L()) {
                    d0VarL0.m9131I(false);
                    if (d0VarL0.m9162z()) {
                        this.f9834b.removeDetachedView(viewM9306n, false);
                    }
                    AbstractC2376m abstractC2376m = this.f9834b.E0;
                    if (abstractC2376m != null) {
                        abstractC2376m.mo9207j(d0VarL0);
                    }
                    d0VarL0.m9131I(true);
                    c2385v.m9278D(viewM9306n);
                }
            }
            c2385v.m9297e();
            if (iM9302j > 0) {
                this.f9834b.invalidate();
            }
        }

        /* renamed from: z */
        public void m9250z(View view, Rect rect) {
            RecyclerView recyclerView = this.f9834b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.p0(view));
            }
        }

        public int z0() {
            return this.f9831X;
        }

        public void z1(View view, C2385v c2385v) {
            C1(view);
            c2385v.m9281G(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface InterfaceC2380q {
        /* renamed from: b */
        void mo9257b(View view);

        /* renamed from: d */
        void mo9258d(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class AbstractC2381r {
        /* renamed from: a */
        public abstract boolean mo9259a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface InterfaceC2382s {
        /* renamed from: a */
        void mo728a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo729c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: e */
        void mo730e(boolean z);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC2383t {
        /* renamed from: a */
        public void mo9260a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo964b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C2384u {

        /* renamed from: a */
        public SparseArray f9851a = new SparseArray();

        /* renamed from: b */
        public int f9852b = 0;

        /* renamed from: c */
        public Set f9853c = Collections.newSetFromMap(new IdentityHashMap());

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        public static class a {

            /* renamed from: a */
            public final ArrayList f9854a = new ArrayList();

            /* renamed from: b */
            public int f9855b = 5;

            /* renamed from: c */
            public long f9856c = 0;

            /* renamed from: d */
            public long f9857d = 0;
        }

        /* renamed from: a */
        public void m9261a() {
            this.f9852b++;
        }

        /* renamed from: b */
        public void m9262b(AbstractC2371h abstractC2371h) {
            this.f9853c.add(abstractC2371h);
        }

        /* renamed from: c */
        public void m9263c() {
            for (int i = 0; i < this.f9851a.size(); i++) {
                a aVar = (a) this.f9851a.valueAt(i);
                Iterator it = aVar.f9854a.iterator();
                while (it.hasNext()) {
                    ded.m22906b(((d0) it.next()).f9794a);
                }
                aVar.f9854a.clear();
            }
        }

        /* renamed from: d */
        public void m9264d() {
            this.f9852b--;
        }

        /* renamed from: e */
        public void m9265e(AbstractC2371h abstractC2371h, boolean z) {
            this.f9853c.remove(abstractC2371h);
            if (this.f9853c.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < this.f9851a.size(); i++) {
                SparseArray sparseArray = this.f9851a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i))).f9854a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ded.m22906b(((d0) arrayList.get(i2)).f9794a);
                }
            }
        }

        /* renamed from: f */
        public void m9266f(int i, long j) {
            a aVarM9269i = m9269i(i);
            aVarM9269i.f9857d = m9272l(aVarM9269i.f9857d, j);
        }

        /* renamed from: g */
        public void m9267g(int i, long j) {
            a aVarM9269i = m9269i(i);
            aVarM9269i.f9856c = m9272l(aVarM9269i.f9856c, j);
        }

        /* renamed from: h */
        public d0 m9268h(int i) {
            a aVar = (a) this.f9851a.get(i);
            if (aVar == null || aVar.f9854a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f9854a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((d0) arrayList.get(size)).m9156t()) {
                    return (d0) arrayList.remove(size);
                }
            }
            return null;
        }

        /* renamed from: i */
        public final a m9269i(int i) {
            a aVar = (a) this.f9851a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f9851a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: j */
        public void m9270j(AbstractC2371h abstractC2371h, AbstractC2371h abstractC2371h2, boolean z) {
            if (abstractC2371h != null) {
                m9264d();
            }
            if (!z && this.f9852b == 0) {
                m9263c();
            }
            if (abstractC2371h2 != null) {
                m9261a();
            }
        }

        /* renamed from: k */
        public void m9271k(d0 d0Var) {
            int iM9150n = d0Var.m9150n();
            ArrayList arrayList = m9269i(iM9150n).f9854a;
            if (((a) this.f9851a.get(iM9150n)).f9855b <= arrayList.size()) {
                ded.m22906b(d0Var.f9794a);
            } else {
                d0Var.m9128F();
                arrayList.add(d0Var);
            }
        }

        /* renamed from: l */
        public long m9272l(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: m */
        public boolean m9273m(int i, long j, long j2) {
            long j3 = m9269i(i).f9857d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: n */
        public boolean m9274n(int i, long j, long j2) {
            long j3 = m9269i(i).f9856c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C2385v {

        /* renamed from: a */
        public final ArrayList f9858a;

        /* renamed from: b */
        public ArrayList f9859b;

        /* renamed from: c */
        public final ArrayList f9860c;

        /* renamed from: d */
        public final List f9861d;

        /* renamed from: e */
        public int f9862e;

        /* renamed from: f */
        public int f9863f;

        /* renamed from: g */
        public C2384u f9864g;

        public C2385v() {
            ArrayList arrayList = new ArrayList();
            this.f9858a = arrayList;
            this.f9859b = null;
            this.f9860c = new ArrayList();
            this.f9861d = Collections.unmodifiableList(arrayList);
            this.f9862e = 2;
            this.f9863f = 2;
        }

        /* renamed from: A */
        public void m9275A() {
            for (int i = 0; i < this.f9860c.size(); i++) {
                ded.m22906b(((d0) this.f9860c.get(i)).f9794a);
            }
            m9276B(RecyclerView.this.f9762H);
        }

        /* renamed from: B */
        public final void m9276B(AbstractC2371h abstractC2371h) {
            m9277C(abstractC2371h, false);
        }

        /* renamed from: C */
        public final void m9277C(AbstractC2371h abstractC2371h, boolean z) {
            C2384u c2384u = this.f9864g;
            if (c2384u != null) {
                c2384u.m9265e(abstractC2371h, z);
            }
        }

        /* renamed from: D */
        public void m9278D(View view) {
            d0 d0VarL0 = RecyclerView.l0(view);
            d0VarL0.f9807n = null;
            d0VarL0.f9808o = false;
            d0VarL0.m9141e();
            m9282H(d0VarL0);
        }

        /* renamed from: E */
        public void m9279E() {
            for (int size = this.f9860c.size() - 1; size >= 0; size--) {
                m9280F(size);
            }
            this.f9860c.clear();
            if (RecyclerView.v1) {
                RecyclerView.this.V0.m9542b();
            }
        }

        /* renamed from: F */
        public void m9280F(int i) {
            m9293a((d0) this.f9860c.get(i), true);
            this.f9860c.remove(i);
        }

        /* renamed from: G */
        public void m9281G(View view) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (d0VarL0.m9162z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (d0VarL0.m9161y()) {
                d0VarL0.m9135M();
            } else if (d0VarL0.m9136N()) {
                d0VarL0.m9141e();
            }
            m9282H(d0VarL0);
            if (RecyclerView.this.E0 == null || d0VarL0.m9159w()) {
                return;
            }
            RecyclerView.this.E0.mo9207j(d0VarL0);
        }

        /* renamed from: H */
        public void m9282H(d0 d0Var) {
            boolean z;
            boolean z2 = true;
            if (d0Var.m9161y() || d0Var.f9794a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.m9161y());
                sb.append(" isAttached:");
                sb.append(d0Var.f9794a.getParent() != null);
                sb.append(RecyclerView.this.m9077T());
                throw new IllegalArgumentException(sb.toString());
            }
            if (d0Var.m9162z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.m9077T());
            }
            if (d0Var.m9134L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m9077T());
            }
            boolean zM9144h = d0Var.m9144h();
            AbstractC2371h abstractC2371h = RecyclerView.this.f9762H;
            if ((abstractC2371h != null && zM9144h && abstractC2371h.onFailedToRecycleView(d0Var)) || d0Var.m9159w()) {
                if (this.f9863f <= 0 || d0Var.m9154r(526)) {
                    z = false;
                } else {
                    int size = this.f9860c.size();
                    if (size >= this.f9863f && size > 0) {
                        m9280F(0);
                        size--;
                    }
                    if (RecyclerView.v1 && size > 0 && !RecyclerView.this.V0.m9544d(d0Var.f9796c)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.V0.m9544d(((d0) this.f9860c.get(i)).f9796c)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.f9860c.add(size, d0Var);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    m9293a(d0Var, true);
                }
                z = z;
            } else {
                z2 = false;
            }
            RecyclerView.this.f9772g.m9709q(d0Var);
            if (z || z2 || !zM9144h) {
                return;
            }
            ded.m22906b(d0Var.f9794a);
            d0Var.f9812s = null;
            d0Var.f9811r = null;
        }

        /* renamed from: I */
        public void m9283I(View view) {
            d0 d0VarL0 = RecyclerView.l0(view);
            if (!d0VarL0.m9154r(12) && d0VarL0.m9123A() && !RecyclerView.this.m9095q(d0VarL0)) {
                if (this.f9859b == null) {
                    this.f9859b = new ArrayList();
                }
                d0VarL0.m9132J(this, true);
                this.f9859b.add(d0VarL0);
                return;
            }
            if (!d0VarL0.m9158v() || d0VarL0.m9160x() || RecyclerView.this.f9762H.hasStableIds()) {
                d0VarL0.m9132J(this, false);
                this.f9858a.add(d0VarL0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m9077T());
            }
        }

        /* renamed from: J */
        public void m9284J(C2384u c2384u) {
            m9276B(RecyclerView.this.f9762H);
            C2384u c2384u2 = this.f9864g;
            if (c2384u2 != null) {
                c2384u2.m9264d();
            }
            this.f9864g = c2384u;
            if (c2384u != null && RecyclerView.this.getAdapter() != null) {
                this.f9864g.m9261a();
            }
            m9313u();
        }

        /* renamed from: K */
        public void m9285K(b0 b0Var) {
        }

        /* renamed from: L */
        public void m9286L(int i) {
            this.f9862e = i;
            m9290P();
        }

        /* renamed from: M */
        public final boolean m9287M(d0 d0Var, int i, int i2, long j) {
            d0Var.f9812s = null;
            d0Var.f9811r = RecyclerView.this;
            int iM9150n = d0Var.m9150n();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f9864g.m9273m(iM9150n, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f9762H.bindViewHolder(d0Var, i);
            this.f9864g.m9266f(d0Var.m9150n(), RecyclerView.this.getNanoTime() - nanoTime);
            m9294b(d0Var);
            if (!RecyclerView.this.W0.m9347e()) {
                return true;
            }
            d0Var.f9800g = i2;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[PHI: r1 r4
          0x012c: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$d0) = (r1v11 androidx.recyclerview.widget.RecyclerView$d0), (r1v30 androidx.recyclerview.widget.RecyclerView$d0) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]
          0x012c: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:45:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d3 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01d6  */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d0 m9288N(int i, boolean z, long j) {
            d0 d0VarM9304l;
            boolean z2;
            d0 d0Var;
            boolean z3;
            boolean zM9287M;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            RecyclerView recyclerViewA0;
            if (i < 0 || i >= RecyclerView.this.W0.m9344b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + RecyclerView.this.W0.m9344b() + RecyclerView.this.m9077T());
            }
            if (RecyclerView.this.W0.m9347e()) {
                d0VarM9304l = m9300h(i);
                if (d0VarM9304l != null) {
                    z2 = true;
                }
                if (d0VarM9304l == null && (d0VarM9304l = m9305m(i, z)) != null) {
                    if (m9291Q(d0VarM9304l)) {
                        if (!z) {
                            d0VarM9304l.m9138b(4);
                            if (d0VarM9304l.m9161y()) {
                                RecyclerView.this.removeDetachedView(d0VarM9304l.f9794a, false);
                                d0VarM9304l.m9135M();
                            } else if (d0VarM9304l.m9136N()) {
                                d0VarM9304l.m9141e();
                            }
                            m9282H(d0VarM9304l);
                        }
                        d0VarM9304l = null;
                    } else {
                        z2 = true;
                    }
                }
                if (d0VarM9304l != null) {
                    d0Var = d0VarM9304l;
                } else {
                    int iM9411m = RecyclerView.this.f9770e.m9411m(i);
                    if (iM9411m < 0 || iM9411m >= RecyclerView.this.f9762H.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM9411m + ").state:" + RecyclerView.this.W0.m9344b() + RecyclerView.this.m9077T());
                    }
                    int itemViewType = RecyclerView.this.f9762H.getItemViewType(iM9411m);
                    if (RecyclerView.this.f9762H.hasStableIds() && (d0VarM9304l = m9304l(RecyclerView.this.f9762H.getItemId(iM9411m), itemViewType, z)) != null) {
                        d0VarM9304l.f9796c = iM9411m;
                        z2 = true;
                    }
                    if (d0VarM9304l == null) {
                        d0 d0VarM9268h = m9301i().m9268h(itemViewType);
                        if (d0VarM9268h != null) {
                            d0VarM9268h.m9128F();
                            if (RecyclerView.s1) {
                                m9310r(d0VarM9268h);
                            }
                        }
                        d0VarM9304l = d0VarM9268h;
                    }
                    if (d0VarM9304l == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j != Long.MAX_VALUE && !this.f9864g.m9274n(itemViewType, nanoTime, j)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        d0 d0VarCreateViewHolder = recyclerView.f9762H.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.v1 && (recyclerViewA0 = RecyclerView.a0(d0VarCreateViewHolder.f9794a)) != null) {
                            d0VarCreateViewHolder.f9795b = new WeakReference(recyclerViewA0);
                        }
                        this.f9864g.m9267g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        d0Var = d0VarCreateViewHolder;
                    }
                }
                z3 = z2;
                if (z3 && !RecyclerView.this.W0.m9347e() && d0Var.m9154r(8192)) {
                    d0Var.m9130H(0, 8192);
                    if (RecyclerView.this.W0.f9892k) {
                        int iM9198e = AbstractC2376m.m9198e(d0Var) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.Z0(d0Var, recyclerView2.E0.m9218u(recyclerView2.W0, d0Var, iM9198e, d0Var.m9153q()));
                    }
                }
                if (RecyclerView.this.W0.m9347e() || !d0Var.m9157u()) {
                    if (d0Var.m9157u() || d0Var.m9124B() || d0Var.m9158v()) {
                        zM9287M = m9287M(d0Var, RecyclerView.this.f9770e.m9411m(i), i, j);
                    }
                    layoutParams = d0Var.f9794a.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                        d0Var.f9794a.setLayoutParams(layoutParams2);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParams2 = (LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                        d0Var.f9794a.setLayoutParams(layoutParams2);
                    }
                    layoutParams2.f9778a = d0Var;
                    layoutParams2.f9781d = z3 && zM9287M;
                    return d0Var;
                }
                d0Var.f9800g = i;
                zM9287M = false;
                layoutParams = d0Var.f9794a.getLayoutParams();
                if (layoutParams == null) {
                }
                layoutParams2.f9778a = d0Var;
                layoutParams2.f9781d = z3 && zM9287M;
                return d0Var;
            }
            d0VarM9304l = null;
            z2 = false;
            if (d0VarM9304l == null) {
                if (m9291Q(d0VarM9304l)) {
                }
            }
            if (d0VarM9304l != null) {
            }
            z3 = z2;
            if (z3) {
                d0Var.m9130H(0, 8192);
                if (RecyclerView.this.W0.f9892k) {
                }
            }
            if (RecyclerView.this.W0.m9347e()) {
                if (d0Var.m9157u()) {
                }
                zM9287M = m9287M(d0Var, RecyclerView.this.f9770e.m9411m(i), i, j);
            }
            layoutParams = d0Var.f9794a.getLayoutParams();
            if (layoutParams == null) {
            }
            layoutParams2.f9778a = d0Var;
            layoutParams2.f9781d = z3 && zM9287M;
            return d0Var;
        }

        /* renamed from: O */
        public void m9289O(d0 d0Var) {
            if (d0Var.f9808o) {
                this.f9859b.remove(d0Var);
            } else {
                this.f9858a.remove(d0Var);
            }
            d0Var.f9807n = null;
            d0Var.f9808o = false;
            d0Var.m9141e();
        }

        /* renamed from: P */
        public void m9290P() {
            AbstractC2379p abstractC2379p = RecyclerView.this.f9763L;
            this.f9863f = this.f9862e + (abstractC2379p != null ? abstractC2379p.f9827H : 0);
            for (int size = this.f9860c.size() - 1; size >= 0 && this.f9860c.size() > this.f9863f; size--) {
                m9280F(size);
            }
        }

        /* renamed from: Q */
        public boolean m9291Q(d0 d0Var) {
            if (d0Var.m9160x()) {
                return RecyclerView.this.W0.m9347e();
            }
            int i = d0Var.f9796c;
            if (i >= 0 && i < RecyclerView.this.f9762H.getItemCount()) {
                if (RecyclerView.this.W0.m9347e() || RecyclerView.this.f9762H.getItemViewType(d0Var.f9796c) == d0Var.m9150n()) {
                    return !RecyclerView.this.f9762H.hasStableIds() || d0Var.m9149m() == RecyclerView.this.f9762H.getItemId(d0Var.f9796c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.m9077T());
        }

        /* renamed from: R */
        public void m9292R(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f9860c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f9860c.get(size);
                if (d0Var != null && (i3 = d0Var.f9796c) >= i && i3 < i4) {
                    d0Var.m9138b(2);
                    m9280F(size);
                }
            }
        }

        /* renamed from: a */
        public void m9293a(d0 d0Var, boolean z) {
            RecyclerView.m9057s(d0Var);
            View view = d0Var.f9794a;
            C2410p c2410p = RecyclerView.this.d1;
            if (c2410p != null) {
                db dbVarM9655n = c2410p.m9655n();
                wvi.m0(view, dbVarM9655n instanceof C2410p.a ? ((C2410p.a) dbVarM9655n).m9660n(view) : null);
            }
            if (z) {
                m9299g(d0Var);
            }
            d0Var.f9812s = null;
            d0Var.f9811r = null;
            m9301i().m9271k(d0Var);
        }

        /* renamed from: b */
        public final void m9294b(d0 d0Var) {
            if (RecyclerView.this.z0()) {
                View view = d0Var.f9794a;
                if (wvi.m55137x(view) == 0) {
                    wvi.t0(view, 1);
                }
                C2410p c2410p = RecyclerView.this.d1;
                if (c2410p == null) {
                    return;
                }
                db dbVarM9655n = c2410p.m9655n();
                if (dbVarM9655n instanceof C2410p.a) {
                    ((C2410p.a) dbVarM9655n).m9661o(view);
                }
                wvi.m0(view, dbVarM9655n);
            }
        }

        /* renamed from: c */
        public void m9295c() {
            this.f9858a.clear();
            m9279E();
        }

        /* renamed from: d */
        public void m9296d() {
            int size = this.f9860c.size();
            for (int i = 0; i < size; i++) {
                ((d0) this.f9860c.get(i)).m9139c();
            }
            int size2 = this.f9858a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((d0) this.f9858a.get(i2)).m9139c();
            }
            ArrayList arrayList = this.f9859b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((d0) this.f9859b.get(i3)).m9139c();
                }
            }
        }

        /* renamed from: e */
        public void m9297e() {
            this.f9858a.clear();
            ArrayList arrayList = this.f9859b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m9298f(int i) {
            if (i >= 0 && i < RecyclerView.this.W0.m9344b()) {
                return !RecyclerView.this.W0.m9347e() ? i : RecyclerView.this.f9770e.m9411m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.W0.m9344b() + RecyclerView.this.m9077T());
        }

        /* renamed from: g */
        public void m9299g(d0 d0Var) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f9764M.size() > 0) {
                tq.m50332a(RecyclerView.this.f9764M.get(0));
                throw null;
            }
            AbstractC2371h abstractC2371h = RecyclerView.this.f9762H;
            if (abstractC2371h != null) {
                abstractC2371h.onViewRecycled(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.W0 != null) {
                recyclerView.f9772g.m9709q(d0Var);
            }
        }

        /* renamed from: h */
        public d0 m9300h(int i) {
            int size;
            int iM9411m;
            ArrayList arrayList = this.f9859b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    d0 d0Var = (d0) this.f9859b.get(i2);
                    if (!d0Var.m9136N() && d0Var.m9151o() == i) {
                        d0Var.m9138b(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.f9762H.hasStableIds() && (iM9411m = RecyclerView.this.f9770e.m9411m(i)) > 0 && iM9411m < RecyclerView.this.f9762H.getItemCount()) {
                    long itemId = RecyclerView.this.f9762H.getItemId(iM9411m);
                    for (int i3 = 0; i3 < size; i3++) {
                        d0 d0Var2 = (d0) this.f9859b.get(i3);
                        if (!d0Var2.m9136N() && d0Var2.m9149m() == itemId) {
                            d0Var2.m9138b(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        public C2384u m9301i() {
            if (this.f9864g == null) {
                this.f9864g = new C2384u();
                m9313u();
            }
            return this.f9864g;
        }

        /* renamed from: j */
        public int m9302j() {
            return this.f9858a.size();
        }

        /* renamed from: k */
        public List m9303k() {
            return this.f9861d;
        }

        /* renamed from: l */
        public d0 m9304l(long j, int i, boolean z) {
            for (int size = this.f9858a.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f9858a.get(size);
                if (d0Var.m9149m() == j && !d0Var.m9136N()) {
                    if (i == d0Var.m9150n()) {
                        d0Var.m9138b(32);
                        if (d0Var.m9160x() && !RecyclerView.this.W0.m9347e()) {
                            d0Var.m9130H(2, 14);
                        }
                        return d0Var;
                    }
                    if (!z) {
                        this.f9858a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f9794a, false);
                        m9278D(d0Var.f9794a);
                    }
                }
            }
            int size2 = this.f9860c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                d0 d0Var2 = (d0) this.f9860c.get(size2);
                if (d0Var2.m9149m() == j && !d0Var2.m9156t()) {
                    if (i == d0Var2.m9150n()) {
                        if (!z) {
                            this.f9860c.remove(size2);
                        }
                        return d0Var2;
                    }
                    if (!z) {
                        m9280F(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        public d0 m9305m(int i, boolean z) {
            View viewM9448e;
            int size = this.f9858a.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = (d0) this.f9858a.get(i2);
                if (!d0Var.m9136N() && d0Var.m9151o() == i && !d0Var.m9158v() && (RecyclerView.this.W0.f9889h || !d0Var.m9160x())) {
                    d0Var.m9138b(32);
                    return d0Var;
                }
            }
            if (z || (viewM9448e = RecyclerView.this.f9771f.m9448e(i)) == null) {
                int size2 = this.f9860c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d0 d0Var2 = (d0) this.f9860c.get(i3);
                    if (!d0Var2.m9158v() && d0Var2.m9151o() == i && !d0Var2.m9156t()) {
                        if (!z) {
                            this.f9860c.remove(i3);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 d0VarL0 = RecyclerView.l0(viewM9448e);
            RecyclerView.this.f9771f.m9462s(viewM9448e);
            int iM9456m = RecyclerView.this.f9771f.m9456m(viewM9448e);
            if (iM9456m != -1) {
                RecyclerView.this.f9771f.m9447d(iM9456m);
                m9283I(viewM9448e);
                d0VarL0.m9138b(8224);
                return d0VarL0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + d0VarL0 + RecyclerView.this.m9077T());
        }

        /* renamed from: n */
        public View m9306n(int i) {
            return ((d0) this.f9858a.get(i)).f9794a;
        }

        /* renamed from: o */
        public View m9307o(int i) {
            return m9308p(i, false);
        }

        /* renamed from: p */
        public View m9308p(int i, boolean z) {
            return m9288N(i, z, Long.MAX_VALUE).f9794a;
        }

        /* renamed from: q */
        public final void m9309q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m9309q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: r */
        public final void m9310r(d0 d0Var) {
            View view = d0Var.f9794a;
            if (view instanceof ViewGroup) {
                m9309q((ViewGroup) view, false);
            }
        }

        /* renamed from: s */
        public void m9311s() {
            int size = this.f9860c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) ((d0) this.f9860c.get(i)).f9794a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f9780c = true;
                }
            }
        }

        /* renamed from: t */
        public void m9312t() {
            int size = this.f9860c.size();
            for (int i = 0; i < size; i++) {
                d0 d0Var = (d0) this.f9860c.get(i);
                if (d0Var != null) {
                    d0Var.m9138b(6);
                    d0Var.m9137a(null);
                }
            }
            AbstractC2371h abstractC2371h = RecyclerView.this.f9762H;
            if (abstractC2371h == null || !abstractC2371h.hasStableIds()) {
                m9279E();
            }
        }

        /* renamed from: u */
        public final void m9313u() {
            if (this.f9864g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f9762H == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f9864g.m9262b(RecyclerView.this.f9762H);
            }
        }

        /* renamed from: v */
        public void m9314v(int i, int i2) {
            int size = this.f9860c.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = (d0) this.f9860c.get(i3);
                if (d0Var != null && d0Var.f9796c >= i) {
                    d0Var.m9125C(i2, false);
                }
            }
        }

        /* renamed from: w */
        public void m9315w(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f9860c.size();
            for (int i7 = 0; i7 < size; i7++) {
                d0 d0Var = (d0) this.f9860c.get(i7);
                if (d0Var != null && (i6 = d0Var.f9796c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        d0Var.m9125C(i2 - i, false);
                    } else {
                        d0Var.m9125C(i3, false);
                    }
                }
            }
        }

        /* renamed from: x */
        public void m9316x(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f9860c.size() - 1; size >= 0; size--) {
                d0 d0Var = (d0) this.f9860c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f9796c;
                    if (i4 >= i3) {
                        d0Var.m9125C(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.m9138b(8);
                        m9280F(size);
                    }
                }
            }
        }

        /* renamed from: y */
        public void m9317y(AbstractC2371h abstractC2371h, AbstractC2371h abstractC2371h2, boolean z) {
            m9295c();
            m9277C(abstractC2371h, true);
            m9301i().m9270j(abstractC2371h, abstractC2371h2, z);
            m9313u();
        }

        /* renamed from: z */
        public void m9318z() {
            m9313u();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface InterfaceC2386w {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public class C2387x extends AbstractC2373j {
        public C2387x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: a */
        public void mo9191a() {
            RecyclerView.this.m9094p(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.W0.f9888g = true;
            recyclerView.X0(true);
            if (RecyclerView.this.f9770e.m9414p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: b */
        public void mo9192b(int i, int i2, Object obj) {
            RecyclerView.this.m9094p(null);
            if (RecyclerView.this.f9770e.m9416r(i, i2, obj)) {
                m9319g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: c */
        public void mo9193c(int i, int i2) {
            RecyclerView.this.m9094p(null);
            if (RecyclerView.this.f9770e.m9417s(i, i2)) {
                m9319g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: d */
        public void mo9194d(int i, int i2, int i3) {
            RecyclerView.this.m9094p(null);
            if (RecyclerView.this.f9770e.m9418t(i, i2, i3)) {
                m9319g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: e */
        public void mo9195e(int i, int i2) {
            RecyclerView.this.m9094p(null);
            if (RecyclerView.this.f9770e.m9419u(i, i2)) {
                m9319g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2373j
        /* renamed from: f */
        public void mo9196f() {
            AbstractC2371h abstractC2371h;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f9769d == null || (abstractC2371h = recyclerView.f9762H) == null || !abstractC2371h.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        /* renamed from: g */
        public void m9319g() {
            if (RecyclerView.u1) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.k0 && recyclerView.j0) {
                    wvi.e0(recyclerView, recyclerView.f9774q);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.s0 = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class AbstractC2388y {

        /* renamed from: b */
        public RecyclerView f9868b;

        /* renamed from: c */
        public AbstractC2379p f9869c;

        /* renamed from: d */
        public boolean f9870d;

        /* renamed from: e */
        public boolean f9871e;

        /* renamed from: f */
        public View f9872f;

        /* renamed from: h */
        public boolean f9874h;

        /* renamed from: a */
        public int f9867a = -1;

        /* renamed from: g */
        public final a f9873g = new a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public static class a {

            /* renamed from: a */
            public int f9875a;

            /* renamed from: b */
            public int f9876b;

            /* renamed from: c */
            public int f9877c;

            /* renamed from: d */
            public int f9878d;

            /* renamed from: e */
            public Interpolator f9879e;

            /* renamed from: f */
            public boolean f9880f;

            /* renamed from: g */
            public int f9881g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: a */
            public boolean m9338a() {
                return this.f9878d >= 0;
            }

            /* renamed from: b */
            public void m9339b(int i) {
                this.f9878d = i;
            }

            /* renamed from: c */
            public void m9340c(RecyclerView recyclerView) {
                int i = this.f9878d;
                if (i >= 0) {
                    this.f9878d = -1;
                    recyclerView.D0(i);
                    this.f9880f = false;
                } else {
                    if (!this.f9880f) {
                        this.f9881g = 0;
                        return;
                    }
                    m9342e();
                    recyclerView.T0.m9117e(this.f9875a, this.f9876b, this.f9877c, this.f9879e);
                    this.f9881g++;
                    this.f9880f = false;
                }
            }

            /* renamed from: d */
            public void m9341d(int i, int i2, int i3, Interpolator interpolator) {
                this.f9875a = i;
                this.f9876b = i2;
                this.f9877c = i3;
                this.f9879e = interpolator;
                this.f9880f = true;
            }

            /* renamed from: e */
            public final void m9342e() {
                if (this.f9879e != null && this.f9877c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f9877c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.f9878d = -1;
                this.f9880f = false;
                this.f9881g = 0;
                this.f9875a = i;
                this.f9876b = i2;
                this.f9877c = i3;
                this.f9879e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        public interface b {
            /* renamed from: c */
            PointF mo9034c(int i);
        }

        /* renamed from: a */
        public PointF mo9320a(int i) {
            Object objM9324e = m9324e();
            if (objM9324e instanceof b) {
                return ((b) objM9324e).mo9034c(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m9321b(int i) {
            return this.f9868b.f9763L.mo9033S(i);
        }

        /* renamed from: c */
        public int m9322c() {
            return this.f9868b.f9763L.m9241Z();
        }

        /* renamed from: d */
        public int m9323d(View view) {
            return this.f9868b.j0(view);
        }

        /* renamed from: e */
        public AbstractC2379p m9324e() {
            return this.f9869c;
        }

        /* renamed from: f */
        public int m9325f() {
            return this.f9867a;
        }

        /* renamed from: g */
        public boolean m9326g() {
            return this.f9870d;
        }

        /* renamed from: h */
        public boolean m9327h() {
            return this.f9871e;
        }

        /* renamed from: i */
        public void m9328i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        /* renamed from: j */
        public void m9329j(int i, int i2) {
            PointF pointFMo9320a;
            RecyclerView recyclerView = this.f9868b;
            if (this.f9867a == -1 || recyclerView == null) {
                m9337r();
            }
            if (this.f9870d && this.f9872f == null && this.f9869c != null && (pointFMo9320a = mo9320a(this.f9867a)) != null) {
                float f = pointFMo9320a.x;
                if (f != 0.0f || pointFMo9320a.y != 0.0f) {
                    recyclerView.r1((int) Math.signum(f), (int) Math.signum(pointFMo9320a.y), null);
                }
            }
            this.f9870d = false;
            View view = this.f9872f;
            if (view != null) {
                if (m9323d(view) == this.f9867a) {
                    mo9334o(this.f9872f, recyclerView.W0, this.f9873g);
                    this.f9873g.m9340c(recyclerView);
                    m9337r();
                } else {
                    this.f9872f = null;
                }
            }
            if (this.f9871e) {
                mo9331l(i, i2, recyclerView.W0, this.f9873g);
                boolean zM9338a = this.f9873g.m9338a();
                this.f9873g.m9340c(recyclerView);
                if (zM9338a && this.f9871e) {
                    this.f9870d = true;
                    recyclerView.T0.m9116d();
                }
            }
        }

        /* renamed from: k */
        public void m9330k(View view) {
            if (m9323d(view) == m9325f()) {
                this.f9872f = view;
            }
        }

        /* renamed from: l */
        public abstract void mo9331l(int i, int i2, C2389z c2389z, a aVar);

        /* renamed from: m */
        public abstract void mo9332m();

        /* renamed from: n */
        public abstract void mo9333n();

        /* renamed from: o */
        public abstract void mo9334o(View view, C2389z c2389z, a aVar);

        /* renamed from: p */
        public void m9335p(int i) {
            this.f9867a = i;
        }

        /* renamed from: q */
        public void m9336q(RecyclerView recyclerView, AbstractC2379p abstractC2379p) {
            recyclerView.T0.m9118f();
            if (this.f9874h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.f9868b = recyclerView;
            this.f9869c = abstractC2379p;
            int i = this.f9867a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.W0.f9882a = i;
            this.f9871e = true;
            this.f9870d = true;
            this.f9872f = m9321b(m9325f());
            mo9332m();
            this.f9868b.T0.m9116d();
            this.f9874h = true;
        }

        /* renamed from: r */
        public final void m9337r() {
            if (this.f9871e) {
                this.f9871e = false;
                mo9333n();
                this.f9868b.W0.f9882a = -1;
                this.f9872f = null;
                this.f9867a = -1;
                this.f9870d = false;
                this.f9869c.r1(this);
                this.f9869c = null;
                this.f9868b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C2389z {

        /* renamed from: b */
        public SparseArray f9883b;

        /* renamed from: m */
        public int f9894m;

        /* renamed from: n */
        public long f9895n;

        /* renamed from: o */
        public int f9896o;

        /* renamed from: p */
        public int f9897p;

        /* renamed from: q */
        public int f9898q;

        /* renamed from: a */
        public int f9882a = -1;

        /* renamed from: c */
        public int f9884c = 0;

        /* renamed from: d */
        public int f9885d = 0;

        /* renamed from: e */
        public int f9886e = 1;

        /* renamed from: f */
        public int f9887f = 0;

        /* renamed from: g */
        public boolean f9888g = false;

        /* renamed from: h */
        public boolean f9889h = false;

        /* renamed from: i */
        public boolean f9890i = false;

        /* renamed from: j */
        public boolean f9891j = false;

        /* renamed from: k */
        public boolean f9892k = false;

        /* renamed from: l */
        public boolean f9893l = false;

        /* renamed from: a */
        public void m9343a(int i) {
            if ((this.f9886e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f9886e));
        }

        /* renamed from: b */
        public int m9344b() {
            return this.f9889h ? this.f9884c - this.f9885d : this.f9887f;
        }

        /* renamed from: c */
        public int m9345c() {
            return this.f9882a;
        }

        /* renamed from: d */
        public boolean m9346d() {
            return this.f9882a != -1;
        }

        /* renamed from: e */
        public boolean m9347e() {
            return this.f9889h;
        }

        /* renamed from: f */
        public void m9348f(AbstractC2371h abstractC2371h) {
            this.f9886e = 1;
            this.f9887f = abstractC2371h.getItemCount();
            this.f9889h = false;
            this.f9890i = false;
            this.f9891j = false;
        }

        /* renamed from: g */
        public boolean m9349g() {
            return this.f9893l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f9882a + ", mData=" + this.f9883b + ", mItemCount=" + this.f9887f + ", mIsMeasuring=" + this.f9891j + ", mPreviousLayoutItemCount=" + this.f9884c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f9885d + ", mStructureChanged=" + this.f9888g + ", mInPreLayout=" + this.f9889h + ", mRunSimpleAnimations=" + this.f9892k + ", mRunPredictiveAnimations=" + this.f9893l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        y1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        z1 = new InterpolatorC2366c();
        A1 = new a0();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private boolean E1(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A0;
        if (edgeEffect == null || c36.m20157b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            c36.m20159d(this.A0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.C0;
        if (edgeEffect2 != null && c36.m20157b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            c36.m20159d(this.C0, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.B0;
        if (edgeEffect3 != null && c36.m20157b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            c36.m20159d(this.B0, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.D0;
        if (edgeEffect4 == null || c36.m20157b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        c36.m20159d(this.D0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public static RecyclerView a0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewA0 = a0(viewGroup.getChildAt(i));
            if (recyclerViewA0 != null) {
                return recyclerViewA0;
            }
        }
        return null;
    }

    private int d1(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.B0;
        float f2 = 0.0f;
        if (edgeEffect == null || c36.m20157b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.D0;
            if (edgeEffect2 != null && c36.m20157b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.D0.onRelease();
                } else {
                    float fM20159d = c36.m20159d(this.D0, height, 1.0f - width);
                    if (c36.m20157b(this.D0) == 0.0f) {
                        this.D0.onRelease();
                    }
                    f2 = fM20159d;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.B0.onRelease();
            } else {
                float f3 = -c36.m20159d(this.B0, -height, width);
                if (c36.m20157b(this.B0) == 0.0f) {
                    this.B0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private etb getScrollingChildHelper() {
        if (this.g1 == null) {
            this.g1 = new etb(this);
        }
        return this.g1;
    }

    public static d0 l0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f9778a;
    }

    public static void m0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f9779b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private float q0(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.f9766a * 0.015f));
        float f = r1;
        return (float) (this.f9766a * 0.015f * Math.exp((f / (f - 1.0d)) * dLog));
    }

    /* renamed from: s */
    public static void m9057s(d0 d0Var) {
        WeakReference weakReference = d0Var.f9795b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == d0Var.f9794a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            d0Var.f9795b = null;
        }
    }

    /* renamed from: A */
    public void m9058A(int i, int i2) {
        setMeasuredDimension(AbstractC2379p.m9231D(i, getPaddingLeft() + getPaddingRight(), wvi.m55089B(this)), AbstractC2379p.m9231D(i2, getPaddingTop() + getPaddingBottom(), wvi.m55088A(this)));
    }

    public boolean A0() {
        AbstractC2376m abstractC2376m = this.E0;
        return abstractC2376m != null && abstractC2376m.mo9213p();
    }

    public void A1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null || this.p0) {
            return;
        }
        if (!abstractC2379p.mo9027A()) {
            i = 0;
        }
        if (!this.f9763L.mo9028B()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!(i3 == Integer.MIN_VALUE || i3 > 0)) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            D1(i4, 1);
        }
        this.T0.m9117e(i, i2, i3, interpolator);
    }

    /* renamed from: B */
    public final boolean m9059B(int i, int i2) {
        m9083Z(this.f1);
        int[] iArr = this.f1;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    public boolean B0() {
        return this.x0 > 0;
    }

    public void B1(int i) {
        AbstractC2379p abstractC2379p;
        if (this.p0 || (abstractC2379p = this.f9763L) == null) {
            return;
        }
        abstractC2379p.V1(this, this.W0, i);
    }

    /* renamed from: C */
    public void m9060C(View view) {
        d0 d0VarL0 = l0(view);
        M0(view);
        AbstractC2371h abstractC2371h = this.f9762H;
        if (abstractC2371h != null && d0VarL0 != null) {
            abstractC2371h.onViewAttachedToWindow(d0VarL0);
        }
        List list = this.u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC2380q) this.u0.get(size)).mo9258d(view);
            }
        }
    }

    public final boolean C0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || m9080W(view2) == null) {
            return false;
        }
        if (view == null || m9080W(view) == null) {
            return true;
        }
        this.f9775s.set(0, 0, view.getWidth(), view.getHeight());
        this.f9776x.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f9775s);
        offsetDescendantRectToMyCoords(view2, this.f9776x);
        char c = 65535;
        int i3 = this.f9763L.o0() == 1 ? -1 : 1;
        Rect rect = this.f9775s;
        int i4 = rect.left;
        Rect rect2 = this.f9776x;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i + m9077T());
    }

    public void C1() {
        int i = this.n0 + 1;
        this.n0 = i;
        if (i != 1 || this.p0) {
            return;
        }
        this.o0 = false;
    }

    /* renamed from: D */
    public void m9061D(View view) {
        d0 d0VarL0 = l0(view);
        N0(view);
        AbstractC2371h abstractC2371h = this.f9762H;
        if (abstractC2371h != null && d0VarL0 != null) {
            abstractC2371h.onViewDetachedFromWindow(d0VarL0);
        }
        List list = this.u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC2380q) this.u0.get(size)).mo9257b(view);
            }
        }
    }

    public void D0(int i) {
        if (this.f9763L == null) {
            return;
        }
        setScrollState(2);
        this.f9763L.K1(i);
        awakenScrollBars();
    }

    public boolean D1(int i, int i2) {
        return getScrollingChildHelper().m25593p(i, i2);
    }

    /* renamed from: E */
    public final void m9062E() {
        int i = this.r0;
        this.r0 = 0;
        if (i == 0 || !z0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        eb.m24668b(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public void E0() {
        int iM9453j = this.f9771f.m9453j();
        for (int i = 0; i < iM9453j; i++) {
            ((LayoutParams) this.f9771f.m9452i(i).getLayoutParams()).f9780c = true;
        }
        this.f9768c.m9311s();
    }

    /* renamed from: F */
    public void m9063F() {
        if (this.f9762H == null || this.f9763L == null) {
            return;
        }
        this.W0.f9891j = false;
        boolean z = this.m1 && !(this.n1 == getWidth() && this.o1 == getHeight());
        this.n1 = 0;
        this.o1 = 0;
        this.m1 = false;
        if (this.W0.f9886e == 1) {
            m9064G();
            this.f9763L.M1(this);
            m9065H();
        } else if (this.f9770e.m9415q() || z || this.f9763L.z0() != getWidth() || this.f9763L.m0() != getHeight()) {
            this.f9763L.M1(this);
            m9065H();
        } else {
            this.f9763L.M1(this);
        }
        m9066I();
    }

    public void F0() {
        int iM9453j = this.f9771f.m9453j();
        for (int i = 0; i < iM9453j; i++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i));
            if (d0VarL0 != null && !d0VarL0.m9134L()) {
                d0VarL0.m9138b(6);
            }
        }
        E0();
        this.f9768c.m9312t();
    }

    public void F1(boolean z) {
        if (this.n0 < 1) {
            this.n0 = 1;
        }
        if (!z && !this.p0) {
            this.o0 = false;
        }
        if (this.n0 == 1) {
            if (z && this.o0 && !this.p0 && this.f9763L != null && this.f9762H != null) {
                m9063F();
            }
            if (!this.p0) {
                this.o0 = false;
            }
        }
        this.n0--;
    }

    /* renamed from: G */
    public final void m9064G() {
        this.W0.m9343a(1);
        m9078U(this.W0);
        this.W0.f9891j = false;
        C1();
        this.f9772g.m9698f();
        O0();
        W0();
        o1();
        C2389z c2389z = this.W0;
        c2389z.f9890i = c2389z.f9892k && this.a1;
        this.a1 = false;
        this.Z0 = false;
        c2389z.f9889h = c2389z.f9893l;
        c2389z.f9887f = this.f9762H.getItemCount();
        m9083Z(this.f1);
        if (this.W0.f9892k) {
            int iM9450g = this.f9771f.m9450g();
            for (int i = 0; i < iM9450g; i++) {
                d0 d0VarL0 = l0(this.f9771f.m9449f(i));
                if (!d0VarL0.m9134L() && (!d0VarL0.m9158v() || this.f9762H.hasStableIds())) {
                    this.f9772g.m9697e(d0VarL0, this.E0.m9218u(this.W0, d0VarL0, AbstractC2376m.m9198e(d0VarL0), d0VarL0.m9153q()));
                    if (this.W0.f9890i && d0VarL0.m9123A() && !d0VarL0.m9160x() && !d0VarL0.m9134L() && !d0VarL0.m9158v()) {
                        this.f9772g.m9695c(h0(d0VarL0), d0VarL0);
                    }
                }
            }
        }
        if (this.W0.f9893l) {
            p1();
            C2389z c2389z2 = this.W0;
            boolean z = c2389z2.f9888g;
            c2389z2.f9888g = false;
            this.f9763L.j1(this.f9768c, c2389z2);
            this.W0.f9888g = z;
            for (int i2 = 0; i2 < this.f9771f.m9450g(); i2++) {
                d0 d0VarL02 = l0(this.f9771f.m9449f(i2));
                if (!d0VarL02.m9134L() && !this.f9772g.m9701i(d0VarL02)) {
                    int iM9198e = AbstractC2376m.m9198e(d0VarL02);
                    boolean zM9154r = d0VarL02.m9154r(8192);
                    if (!zM9154r) {
                        iM9198e |= 4096;
                    }
                    AbstractC2376m.c cVarM9218u = this.E0.m9218u(this.W0, d0VarL02, iM9198e, d0VarL02.m9153q());
                    if (zM9154r) {
                        Z0(d0VarL02, cVarM9218u);
                    } else {
                        this.f9772g.m9693a(d0VarL02, cVarM9218u);
                    }
                }
            }
            m9097t();
        } else {
            m9097t();
        }
        P0();
        F1(false);
        this.W0.f9886e = 2;
    }

    public final void G0(int i, int i2, MotionEvent motionEvent, int i3) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null || this.p0) {
            return;
        }
        int[] iArr = this.j1;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zMo9027A = abstractC2379p.mo9027A();
        boolean zMo9028B = this.f9763L.mo9028B();
        int i4 = zMo9028B ? (zMo9027A ? 1 : 0) | 2 : zMo9027A ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iC1 = i - c1(i, height);
        int iD1 = i2 - d1(i2, width);
        D1(i4, i3);
        if (m9067J(zMo9027A ? iC1 : 0, zMo9028B ? iD1 : 0, this.j1, this.h1, i3)) {
            int[] iArr2 = this.j1;
            iC1 -= iArr2[0];
            iD1 -= iArr2[1];
        }
        q1(zMo9027A ? iC1 : 0, zMo9028B ? iD1 : 0, motionEvent, i3);
        RunnableC2403i runnableC2403i = this.U0;
        if (runnableC2403i != null && (iC1 != 0 || iD1 != 0)) {
            runnableC2403i.m9536f(this, iC1, iD1);
        }
        G1(i3);
    }

    public void G1(int i) {
        getScrollingChildHelper().m25595r(i);
    }

    /* renamed from: H */
    public final void m9065H() {
        C1();
        O0();
        this.W0.m9343a(6);
        this.f9770e.m9408j();
        this.W0.f9887f = this.f9762H.getItemCount();
        this.W0.f9885d = 0;
        if (this.f9769d != null && this.f9762H.canRestoreState()) {
            Parcelable parcelable = this.f9769d.f9782c;
            if (parcelable != null) {
                this.f9763L.o1(parcelable);
            }
            this.f9769d = null;
        }
        C2389z c2389z = this.W0;
        c2389z.f9889h = false;
        this.f9763L.j1(this.f9768c, c2389z);
        C2389z c2389z2 = this.W0;
        c2389z2.f9888g = false;
        c2389z2.f9892k = c2389z2.f9892k && this.E0 != null;
        c2389z2.f9886e = 4;
        P0();
        F1(false);
    }

    public void H0(int i) {
        int iM9450g = this.f9771f.m9450g();
        for (int i2 = 0; i2 < iM9450g; i2++) {
            this.f9771f.m9449f(i2).offsetLeftAndRight(i);
        }
    }

    public void H1() {
        setScrollState(0);
        I1();
    }

    /* renamed from: I */
    public final void m9066I() {
        this.W0.m9343a(4);
        C1();
        O0();
        C2389z c2389z = this.W0;
        c2389z.f9886e = 1;
        if (c2389z.f9892k) {
            for (int iM9450g = this.f9771f.m9450g() - 1; iM9450g >= 0; iM9450g--) {
                d0 d0VarL0 = l0(this.f9771f.m9449f(iM9450g));
                if (!d0VarL0.m9134L()) {
                    long jH0 = h0(d0VarL0);
                    AbstractC2376m.c cVarM9217t = this.E0.m9217t(this.W0, d0VarL0);
                    d0 d0VarM9699g = this.f9772g.m9699g(jH0);
                    if (d0VarM9699g == null || d0VarM9699g.m9134L()) {
                        this.f9772g.m9696d(d0VarL0, cVarM9217t);
                    } else {
                        boolean zM9700h = this.f9772g.m9700h(d0VarM9699g);
                        boolean zM9700h2 = this.f9772g.m9700h(d0VarL0);
                        if (zM9700h && d0VarM9699g == d0VarL0) {
                            this.f9772g.m9696d(d0VarL0, cVarM9217t);
                        } else {
                            AbstractC2376m.c cVarM9706n = this.f9772g.m9706n(d0VarM9699g);
                            this.f9772g.m9696d(d0VarL0, cVarM9217t);
                            AbstractC2376m.c cVarM9705m = this.f9772g.m9705m(d0VarL0);
                            if (cVarM9706n == null) {
                                r0(jH0, d0VarL0, d0VarM9699g);
                            } else {
                                m9092n(d0VarM9699g, d0VarL0, cVarM9706n, cVarM9705m, zM9700h, zM9700h2);
                            }
                        }
                    }
                }
            }
            this.f9772g.m9707o(this.p1);
        }
        this.f9763L.y1(this.f9768c);
        C2389z c2389z2 = this.W0;
        c2389z2.f9884c = c2389z2.f9887f;
        this.v0 = false;
        this.w0 = false;
        c2389z2.f9892k = false;
        c2389z2.f9893l = false;
        this.f9763L.f9840h = false;
        ArrayList arrayList = this.f9768c.f9859b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p.f9828L) {
            abstractC2379p.f9827H = 0;
            abstractC2379p.f9828L = false;
            this.f9768c.m9290P();
        }
        this.f9763L.k1(this.W0);
        P0();
        F1(false);
        this.f9772g.m9698f();
        int[] iArr = this.f1;
        if (m9059B(iArr[0], iArr[1])) {
            m9070M(0, 0);
        }
        a1();
        m1();
    }

    public void I0(int i) {
        int iM9450g = this.f9771f.m9450g();
        for (int i2 = 0; i2 < iM9450g; i2++) {
            this.f9771f.m9449f(i2).offsetTopAndBottom(i);
        }
    }

    public final void I1() {
        this.T0.m9118f();
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.X1();
        }
    }

    /* renamed from: J */
    public boolean m9067J(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m25581d(i, i2, iArr, iArr2, i3);
    }

    public void J0(int i, int i2) {
        int iM9453j = this.f9771f.m9453j();
        for (int i3 = 0; i3 < iM9453j; i3++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i3));
            if (d0VarL0 != null && !d0VarL0.m9134L() && d0VarL0.f9796c >= i) {
                d0VarL0.m9125C(i2, false);
                this.W0.f9888g = true;
            }
        }
        this.f9768c.m9314v(i, i2);
        requestLayout();
    }

    public void J1(int i, int i2, Object obj) {
        int i3;
        int iM9453j = this.f9771f.m9453j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < iM9453j; i5++) {
            View viewM9452i = this.f9771f.m9452i(i5);
            d0 d0VarL0 = l0(viewM9452i);
            if (d0VarL0 != null && !d0VarL0.m9134L() && (i3 = d0VarL0.f9796c) >= i && i3 < i4) {
                d0VarL0.m9138b(2);
                d0VarL0.m9137a(obj);
                ((LayoutParams) viewM9452i.getLayoutParams()).f9780c = true;
            }
        }
        this.f9768c.m9292R(i, i2);
    }

    /* renamed from: K */
    public final void m9068K(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m25582e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void K0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iM9453j = this.f9771f.m9453j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < iM9453j; i7++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i7));
            if (d0VarL0 != null && (i6 = d0VarL0.f9796c) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    d0VarL0.m9125C(i2 - i, false);
                } else {
                    d0VarL0.m9125C(i5, false);
                }
                this.W0.f9888g = true;
            }
        }
        this.f9768c.m9315w(i, i2);
        requestLayout();
    }

    /* renamed from: L */
    public void m9069L(int i) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.q1(i);
        }
        S0(i);
        AbstractC2383t abstractC2383t = this.X0;
        if (abstractC2383t != null) {
            abstractC2383t.mo9260a(this, i);
        }
        List list = this.Y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC2383t) this.Y0.get(size)).mo9260a(this, i);
            }
        }
    }

    public void L0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM9453j = this.f9771f.m9453j();
        for (int i4 = 0; i4 < iM9453j; i4++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i4));
            if (d0VarL0 != null && !d0VarL0.m9134L()) {
                int i5 = d0VarL0.f9796c;
                if (i5 >= i3) {
                    d0VarL0.m9125C(-i2, z);
                    this.W0.f9888g = true;
                } else if (i5 >= i) {
                    d0VarL0.m9145i(i - 1, -i2, z);
                    this.W0.f9888g = true;
                }
            }
        }
        this.f9768c.m9316x(i, i2, z);
        requestLayout();
    }

    /* renamed from: M */
    public void m9070M(int i, int i2) {
        this.y0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        T0(i, i2);
        AbstractC2383t abstractC2383t = this.X0;
        if (abstractC2383t != null) {
            abstractC2383t.mo964b(this, i, i2);
        }
        List list = this.Y0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC2383t) this.Y0.get(size)).mo964b(this, i, i2);
            }
        }
        this.y0--;
    }

    public void M0(View view) {
    }

    /* renamed from: N */
    public void m9071N() {
        int i;
        for (int size = this.k1.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) this.k1.get(size);
            if (d0Var.f9794a.getParent() == this && !d0Var.m9134L() && (i = d0Var.f9810q) != -1) {
                wvi.t0(d0Var.f9794a, i);
                d0Var.f9810q = -1;
            }
        }
        this.k1.clear();
    }

    public void N0(View view) {
    }

    /* renamed from: O */
    public final boolean m9072O(MotionEvent motionEvent) {
        InterfaceC2382s interfaceC2382s = this.i0;
        if (interfaceC2382s == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m9082Y(motionEvent);
        }
        interfaceC2382s.mo728a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.i0 = null;
        }
        return true;
    }

    public void O0() {
        this.x0++;
    }

    /* renamed from: P */
    public void m9073P() {
        if (this.D0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo9112a = this.z0.mo9112a(this, 3);
        this.D0 = edgeEffectMo9112a;
        if (this.f9773h) {
            edgeEffectMo9112a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo9112a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void P0() {
        Q0(true);
    }

    /* renamed from: Q */
    public void m9074Q() {
        if (this.A0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo9112a = this.z0.mo9112a(this, 0);
        this.A0 = edgeEffectMo9112a;
        if (this.f9773h) {
            edgeEffectMo9112a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo9112a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void Q0(boolean z) {
        int i = this.x0 - 1;
        this.x0 = i;
        if (i < 1) {
            this.x0 = 0;
            if (z) {
                m9062E();
                m9071N();
            }
        }
    }

    /* renamed from: R */
    public void m9075R() {
        if (this.C0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo9112a = this.z0.mo9112a(this, 2);
        this.C0 = edgeEffectMo9112a;
        if (this.f9773h) {
            edgeEffectMo9112a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo9112a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void R0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.G0 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.K0 = x;
            this.I0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.L0 = y;
            this.J0 = y;
        }
    }

    /* renamed from: S */
    public void m9076S() {
        if (this.B0 != null) {
            return;
        }
        EdgeEffect edgeEffectMo9112a = this.z0.mo9112a(this, 1);
        this.B0 = edgeEffectMo9112a;
        if (this.f9773h) {
            edgeEffectMo9112a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo9112a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void S0(int i) {
    }

    /* renamed from: T */
    public String m9077T() {
        return " " + super.toString() + ", adapter:" + this.f9762H + ", layout:" + this.f9763L + ", context:" + getContext();
    }

    public void T0(int i, int i2) {
    }

    /* renamed from: U */
    public final void m9078U(C2389z c2389z) {
        if (getScrollState() != 2) {
            c2389z.f9897p = 0;
            c2389z.f9898q = 0;
        } else {
            OverScroller overScroller = this.T0.f9787c;
            c2389z.f9897p = overScroller.getFinalX() - overScroller.getCurrX();
            c2389z.f9898q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void U0() {
        if (this.c1 || !this.j0) {
            return;
        }
        wvi.e0(this, this.l1);
        this.c1 = true;
    }

    /* renamed from: V */
    public View m9079V(float f, float f2) {
        for (int iM9450g = this.f9771f.m9450g() - 1; iM9450g >= 0; iM9450g--) {
            View viewM9449f = this.f9771f.m9449f(iM9450g);
            float translationX = viewM9449f.getTranslationX();
            float translationY = viewM9449f.getTranslationY();
            if (f >= viewM9449f.getLeft() + translationX && f <= viewM9449f.getRight() + translationX && f2 >= viewM9449f.getTop() + translationY && f2 <= viewM9449f.getBottom() + translationY) {
                return viewM9449f;
            }
        }
        return null;
    }

    public final boolean V0() {
        return this.E0 != null && this.f9763L.Y1();
    }

    /* renamed from: W */
    public View m9080W(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final void W0() {
        boolean z;
        if (this.v0) {
            this.f9770e.m9423y();
            if (this.w0) {
                this.f9763L.e1(this);
            }
        }
        if (V0()) {
            this.f9770e.m9421w();
        } else {
            this.f9770e.m9408j();
        }
        boolean z2 = false;
        boolean z3 = this.Z0 || this.a1;
        this.W0.f9892k = this.m0 && this.E0 != null && ((z = this.v0) || z3 || this.f9763L.f9840h) && (!z || this.f9762H.hasStableIds());
        C2389z c2389z = this.W0;
        if (c2389z.f9892k && z3 && !this.v0 && V0()) {
            z2 = true;
        }
        c2389z.f9893l = z2;
    }

    /* renamed from: X */
    public d0 m9081X(View view) {
        View viewM9080W = m9080W(view);
        if (viewM9080W == null) {
            return null;
        }
        return k0(viewM9080W);
    }

    public void X0(boolean z) {
        this.w0 = z | this.w0;
        this.v0 = true;
        F0();
    }

    /* renamed from: Y */
    public final boolean m9082Y(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2382s interfaceC2382s = (InterfaceC2382s) this.h0.get(i);
            if (interfaceC2382s.mo729c(this, motionEvent) && action != 3) {
                this.i0 = interfaceC2382s;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 < 0.0f) {
            m9074Q();
            c36.m20159d(this.A0, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        } else {
            if (f2 <= 0.0f) {
                z = false;
                if (f4 >= 0.0f) {
                    m9076S();
                    c36.m20159d(this.B0, (-f4) / getHeight(), f / getWidth());
                } else if (f4 > 0.0f) {
                    m9073P();
                    c36.m20159d(this.D0, f4 / getHeight(), 1.0f - (f / getWidth()));
                } else {
                    z2 = z;
                }
                if (z2 && f2 == 0.0f && f4 == 0.0f) {
                    return;
                }
                wvi.d0(this);
            }
            m9075R();
            c36.m20159d(this.C0, f2 / getWidth(), f3 / getHeight());
        }
        z = true;
        if (f4 >= 0.0f) {
        }
        if (z2) {
        }
        wvi.d0(this);
    }

    /* renamed from: Z */
    public final void m9083Z(int[] iArr) {
        int iM9450g = this.f9771f.m9450g();
        if (iM9450g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM9450g; i3++) {
            d0 d0VarL0 = l0(this.f9771f.m9449f(i3));
            if (!d0VarL0.m9134L()) {
                int iM9151o = d0VarL0.m9151o();
                if (iM9151o < i) {
                    i = iM9151o;
                }
                if (iM9151o > i2) {
                    i2 = iM9151o;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void Z0(d0 d0Var, AbstractC2376m.c cVar) {
        d0Var.m9130H(0, 8192);
        if (this.W0.f9890i && d0Var.m9123A() && !d0Var.m9160x() && !d0Var.m9134L()) {
            this.f9772g.m9695c(h0(d0Var), d0Var);
        }
        this.f9772g.m9697e(d0Var, cVar);
    }

    public final void a1() {
        View viewFindViewById;
        if (!this.S0 || this.f9762H == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!x1 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f9771f.m9457n(focusedChild)) {
                    return;
                }
            } else if (this.f9771f.m9450g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewB0 = null;
        d0 d0VarD0 = (this.W0.f9895n == -1 || !this.f9762H.hasStableIds()) ? null : d0(this.W0.f9895n);
        if (d0VarD0 != null && !this.f9771f.m9457n(d0VarD0.f9794a) && d0VarD0.f9794a.hasFocusable()) {
            viewB0 = d0VarD0.f9794a;
        } else if (this.f9771f.m9450g() > 0) {
            viewB0 = b0();
        }
        if (viewB0 != null) {
            int i = this.W0.f9896o;
            if (i != -1 && (viewFindViewById = viewB0.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewB0 = viewFindViewById;
            }
            viewB0.requestFocus();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null || !abstractC2379p.R0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b */
    public void m9084b(int i, int i2) {
        if (i < 0) {
            m9074Q();
            if (this.A0.isFinished()) {
                this.A0.onAbsorb(-i);
            }
        } else if (i > 0) {
            m9075R();
            if (this.C0.isFinished()) {
                this.C0.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            m9076S();
            if (this.B0.isFinished()) {
                this.B0.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            m9073P();
            if (this.D0.isFinished()) {
                this.D0.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        wvi.d0(this);
    }

    public final View b0() {
        d0 d0VarC0;
        C2389z c2389z = this.W0;
        int i = c2389z.f9894m;
        if (i == -1) {
            i = 0;
        }
        int iM9344b = c2389z.m9344b();
        for (int i2 = i; i2 < iM9344b; i2++) {
            d0 d0VarC02 = c0(i2);
            if (d0VarC02 == null) {
                break;
            }
            if (d0VarC02.f9794a.hasFocusable()) {
                return d0VarC02.f9794a;
            }
        }
        int iMin = Math.min(iM9344b, i);
        do {
            iMin--;
            if (iMin < 0 || (d0VarC0 = c0(iMin)) == null) {
                return null;
            }
        } while (!d0VarC0.f9794a.hasFocusable());
        return d0VarC0.f9794a;
    }

    public final void b1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A0.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.B0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D0.isFinished();
        }
        if (zIsFinished) {
            wvi.d0(this);
        }
    }

    public d0 c0(int i) {
        d0 d0Var = null;
        if (this.v0) {
            return null;
        }
        int iM9453j = this.f9771f.m9453j();
        for (int i2 = 0; i2 < iM9453j; i2++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i2));
            if (d0VarL0 != null && !d0VarL0.m9160x() && g0(d0VarL0) == i) {
                if (!this.f9771f.m9457n(d0VarL0.f9794a)) {
                    return d0VarL0;
                }
                d0Var = d0VarL0;
            }
        }
        return d0Var;
    }

    public final int c1(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.A0;
        float f2 = 0.0f;
        if (edgeEffect == null || c36.m20157b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.C0;
            if (edgeEffect2 != null && c36.m20157b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.C0.onRelease();
                } else {
                    float fM20159d = c36.m20159d(this.C0, width, height);
                    if (c36.m20157b(this.C0) == 0.0f) {
                        this.C0.onRelease();
                    }
                    f2 = fM20159d;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.A0.onRelease();
            } else {
                float f3 = -c36.m20159d(this.A0, -width, 1.0f - height);
                if (c36.m20157b(this.A0) == 0.0f) {
                    this.A0.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f9763L.mo9009C((LayoutParams) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null && abstractC2379p.mo9027A()) {
            return this.f9763L.mo9031G(this.W0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null && abstractC2379p.mo9027A()) {
            return this.f9763L.mo9010H(this.W0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null && abstractC2379p.mo9027A()) {
            return this.f9763L.mo9011I(this.W0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null && abstractC2379p.mo9028B()) {
            return this.f9763L.mo9032J(this.W0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null && abstractC2379p.mo9028B()) {
            return this.f9763L.mo9012K(this.W0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null && abstractC2379p.mo9028B()) {
            return this.f9763L.mo9013L(this.W0);
        }
        return 0;
    }

    public d0 d0(long j) {
        AbstractC2371h abstractC2371h = this.f9762H;
        d0 d0Var = null;
        if (abstractC2371h != null && abstractC2371h.hasStableIds()) {
            int iM9453j = this.f9771f.m9453j();
            for (int i = 0; i < iM9453j; i++) {
                d0 d0VarL0 = l0(this.f9771f.m9452i(i));
                if (d0VarL0 != null && !d0VarL0.m9160x() && d0VarL0.m9149m() == j) {
                    if (!this.f9771f.m9457n(d0VarL0.f9794a)) {
                        return d0VarL0;
                    }
                    d0Var = d0VarL0;
                }
            }
        }
        return d0Var;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m25578a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m25579b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m25580c(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m25583f(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f9765Q.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC2378o) this.f9765Q.get(i)).mo9230k(canvas, this, this.W0);
        }
        EdgeEffect edgeEffect = this.A0;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f9773h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A0;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.B0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f9773h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B0;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.C0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f9773h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C0;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.D0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f9773h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.E0 == null || this.f9765Q.size() <= 0 || !this.E0.mo9213p()) ? z : true) {
            wvi.d0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d0 e0(int i, boolean z) {
        int iM9453j = this.f9771f.m9453j();
        d0 d0Var = null;
        for (int i2 = 0; i2 < iM9453j; i2++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i2));
            if (d0VarL0 != null && !d0VarL0.m9160x()) {
                if (z) {
                    if (d0VarL0.f9796c != i) {
                        continue;
                    } else {
                        if (!this.f9771f.m9457n(d0VarL0.f9794a)) {
                            return d0VarL0;
                        }
                        d0Var = d0VarL0;
                    }
                } else if (d0VarL0.m9151o() != i) {
                    continue;
                }
            }
        }
        return d0Var;
    }

    public void e1() {
        AbstractC2376m abstractC2376m = this.E0;
        if (abstractC2376m != null) {
            abstractC2376m.mo9208k();
        }
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.x1(this.f9768c);
            this.f9763L.y1(this.f9768c);
        }
        this.f9768c.m9295c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean f0(int i, int i2) {
        int iMax;
        int i3;
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null || this.p0) {
            return false;
        }
        int iMo9027A = abstractC2379p.mo9027A();
        boolean zMo9028B = this.f9763L.mo9028B();
        if (iMo9027A == 0 || Math.abs(i) < this.O0) {
            i = 0;
        }
        if (!zMo9028B || Math.abs(i2) < this.O0) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.A0;
            if (edgeEffect == null || c36.m20157b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.C0;
                if (edgeEffect2 != null && c36.m20157b(edgeEffect2) != 0.0f) {
                    if (v1(this.C0, i, getWidth())) {
                        this.C0.onAbsorb(i);
                        i = 0;
                    }
                    iMax = i;
                    i = 0;
                }
                iMax = 0;
            } else {
                int i4 = -i;
                if (v1(this.A0, i4, getWidth())) {
                    this.A0.onAbsorb(i4);
                    i = 0;
                }
                iMax = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.B0;
            if (edgeEffect3 == null || c36.m20157b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.D0;
                if (edgeEffect4 != null && c36.m20157b(edgeEffect4) != 0.0f) {
                    if (v1(this.D0, i2, getHeight())) {
                        this.D0.onAbsorb(i2);
                        i2 = 0;
                    }
                    i3 = 0;
                }
                i3 = i2;
                i2 = 0;
            } else {
                int i5 = -i2;
                if (v1(this.B0, i5, getHeight())) {
                    this.B0.onAbsorb(i5);
                    i2 = 0;
                }
                i3 = 0;
            }
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.P0;
            iMax = Math.max(-i6, Math.min(iMax, i6));
            int i7 = this.P0;
            i2 = Math.max(-i7, Math.min(i2, i7));
            this.T0.m9114b(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iMo9027A != 0 || zMo9028B;
            dispatchNestedFling(f, f2, z);
            AbstractC2381r abstractC2381r = this.N0;
            if (abstractC2381r != null && abstractC2381r.mo9259a(i, i3)) {
                return true;
            }
            if (z) {
                if (zMo9028B) {
                    iMo9027A = (iMo9027A == true ? 1 : 0) | 2;
                }
                D1(iMo9027A, 1);
                int i8 = this.P0;
                int iMax2 = Math.max(-i8, Math.min(i, i8));
                int i9 = this.P0;
                this.T0.m9114b(iMax2, Math.max(-i9, Math.min(i3, i9)));
                return true;
            }
        }
        return false;
    }

    public boolean f1(View view) {
        C1();
        boolean zM9461r = this.f9771f.m9461r(view);
        if (zM9461r) {
            d0 d0VarL0 = l0(view);
            this.f9768c.m9289O(d0VarL0);
            this.f9768c.m9282H(d0VarL0);
        }
        F1(!zM9461r);
        return zM9461r;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewV0;
        boolean z;
        View viewC1 = this.f9763L.c1(view, i);
        if (viewC1 != null) {
            return viewC1;
        }
        boolean z2 = (this.f9762H == null || this.f9763L == null || B0() || this.p0) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.f9763L.mo9028B()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (w1) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f9763L.mo9027A()) {
                int i3 = (this.f9763L.o0() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (w1) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                m9102y();
                if (m9080W(view) == null) {
                    return null;
                }
                C1();
                this.f9763L.V0(view, i, this.f9768c, this.W0);
                F1(false);
            }
            viewV0 = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                m9102y();
                if (m9080W(view) == null) {
                    return null;
                }
                C1();
                viewV0 = this.f9763L.V0(view, i, this.f9768c, this.W0);
                F1(false);
            } else {
                viewV0 = viewFindNextFocus;
            }
        }
        if (viewV0 == null || viewV0.hasFocusable()) {
            return C0(view, viewV0, i) ? viewV0 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        l1(viewV0, null);
        return view;
    }

    /* renamed from: g */
    public final void m9085g(d0 d0Var) {
        View view = d0Var.f9794a;
        boolean z = view.getParent() == this;
        this.f9768c.m9289O(k0(view));
        if (d0Var.m9162z()) {
            this.f9771f.m9446c(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            this.f9771f.m9454k(view);
        } else {
            this.f9771f.m9445b(view, true);
        }
    }

    public int g0(d0 d0Var) {
        if (d0Var.m9154r(524) || !d0Var.m9157u()) {
            return -1;
        }
        return this.f9770e.m9403e(d0Var.f9796c);
    }

    public void g1(AbstractC2378o abstractC2378o) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.mo9036w("Cannot remove item decoration during a scroll  or layout");
        }
        this.f9765Q.remove(abstractC2378o);
        if (this.f9765Q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        E0();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            return abstractC2379p.mo9014T();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m9077T());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            return abstractC2379p.mo9015U(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m9077T());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC2371h getAdapter() {
        return this.f9762H;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC2379p abstractC2379p = this.f9763L;
        return abstractC2379p != null ? abstractC2379p.m9238W() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC2374k interfaceC2374k = this.e1;
        return interfaceC2374k == null ? super.getChildDrawingOrder(i, i2) : interfaceC2374k.m9197a(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f9773h;
    }

    public C2410p getCompatAccessibilityDelegate() {
        return this.d1;
    }

    public C2375l getEdgeEffectFactory() {
        return this.z0;
    }

    public AbstractC2376m getItemAnimator() {
        return this.E0;
    }

    public int getItemDecorationCount() {
        return this.f9765Q.size();
    }

    public AbstractC2379p getLayoutManager() {
        return this.f9763L;
    }

    public int getMaxFlingVelocity() {
        return this.P0;
    }

    public int getMinFlingVelocity() {
        return this.O0;
    }

    long getNanoTime() {
        if (v1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC2381r getOnFlingListener() {
        return this.N0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.S0;
    }

    public C2384u getRecycledViewPool() {
        return this.f9768c.m9301i();
    }

    public int getScrollState() {
        return this.F0;
    }

    /* renamed from: h */
    public void m9086h(AbstractC2378o abstractC2378o) {
        m9087i(abstractC2378o, -1);
    }

    public long h0(d0 d0Var) {
        return this.f9762H.hasStableIds() ? d0Var.m9149m() : d0Var.f9796c;
    }

    public void h1(InterfaceC2380q interfaceC2380q) {
        List list = this.u0;
        if (list == null) {
            return;
        }
        list.remove(interfaceC2380q);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m25587j();
    }

    /* renamed from: i */
    public void m9087i(AbstractC2378o abstractC2378o, int i) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.mo9036w("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f9765Q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f9765Q.add(abstractC2378o);
        } else {
            this.f9765Q.add(i, abstractC2378o);
        }
        E0();
        requestLayout();
    }

    public int i0(View view) {
        d0 d0VarL0 = l0(view);
        if (d0VarL0 != null) {
            return d0VarL0.m9146j();
        }
        return -1;
    }

    public void i1(InterfaceC2382s interfaceC2382s) {
        this.h0.remove(interfaceC2382s);
        if (this.i0 == interfaceC2382s) {
            this.i0 = null;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.j0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.p0;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m25589l();
    }

    /* renamed from: j */
    public void m9088j(InterfaceC2380q interfaceC2380q) {
        if (this.u0 == null) {
            this.u0 = new ArrayList();
        }
        this.u0.add(interfaceC2380q);
    }

    public int j0(View view) {
        d0 d0VarL0 = l0(view);
        if (d0VarL0 != null) {
            return d0VarL0.m9151o();
        }
        return -1;
    }

    public void j1(AbstractC2383t abstractC2383t) {
        List list = this.Y0;
        if (list != null) {
            list.remove(abstractC2383t);
        }
    }

    /* renamed from: k */
    public void m9089k(InterfaceC2382s interfaceC2382s) {
        this.h0.add(interfaceC2382s);
    }

    public d0 k0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return l0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public void k1() {
        d0 d0Var;
        int iM9450g = this.f9771f.m9450g();
        for (int i = 0; i < iM9450g; i++) {
            View viewM9449f = this.f9771f.m9449f(i);
            d0 d0VarK0 = k0(viewM9449f);
            if (d0VarK0 != null && (d0Var = d0VarK0.f9802i) != null) {
                View view = d0Var.f9794a;
                int left = viewM9449f.getLeft();
                int top = viewM9449f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: l */
    public void m9090l(AbstractC2383t abstractC2383t) {
        if (this.Y0 == null) {
            this.Y0 = new ArrayList();
        }
        this.Y0.add(abstractC2383t);
    }

    public final void l1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f9775s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f9780c) {
                Rect rect = layoutParams2.f9779b;
                Rect rect2 = this.f9775s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f9775s);
            offsetRectIntoDescendantCoords(view, this.f9775s);
        }
        this.f9763L.F1(this, view, this.f9775s, !this.m0, view2 == null);
    }

    /* renamed from: m */
    public void m9091m(d0 d0Var, AbstractC2376m.c cVar, AbstractC2376m.c cVar2) {
        d0Var.m9131I(false);
        if (this.E0.mo9199a(d0Var, cVar, cVar2)) {
            U0();
        }
    }

    public final void m1() {
        C2389z c2389z = this.W0;
        c2389z.f9895n = -1L;
        c2389z.f9894m = -1;
        c2389z.f9896o = -1;
    }

    /* renamed from: n */
    public final void m9092n(d0 d0Var, d0 d0Var2, AbstractC2376m.c cVar, AbstractC2376m.c cVar2, boolean z, boolean z2) {
        d0Var.m9131I(false);
        if (z) {
            m9085g(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                m9085g(d0Var2);
            }
            d0Var.f9801h = d0Var2;
            m9085g(d0Var);
            this.f9768c.m9289O(d0Var);
            d0Var2.m9131I(false);
            d0Var2.f9802i = d0Var;
        }
        if (this.E0.mo9200b(d0Var, d0Var2, cVar, cVar2)) {
            U0();
        }
    }

    public final int n0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void n1() {
        VelocityTracker velocityTracker = this.H0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        G1(0);
        b1();
    }

    /* renamed from: o */
    public void m9093o(d0 d0Var, AbstractC2376m.c cVar, AbstractC2376m.c cVar2) {
        m9085g(d0Var);
        d0Var.m9131I(false);
        if (this.E0.mo9201c(d0Var, cVar, cVar2)) {
            U0();
        }
    }

    public final String o0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public final void o1() {
        View focusedChild = (this.S0 && hasFocus() && this.f9762H != null) ? getFocusedChild() : null;
        d0 d0VarM9081X = focusedChild != null ? m9081X(focusedChild) : null;
        if (d0VarM9081X == null) {
            m1();
            return;
        }
        this.W0.f9895n = this.f9762H.hasStableIds() ? d0VarM9081X.m9149m() : -1L;
        this.W0.f9894m = this.v0 ? -1 : d0VarM9081X.m9160x() ? d0VarM9081X.f9797d : d0VarM9081X.m9146j();
        this.W0.f9896o = n0(d0VarM9081X.f9794a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.x0 = 0;
        this.j0 = true;
        this.m0 = this.m0 && !isLayoutRequested();
        this.f9768c.m9318z();
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.m9235P(this);
        }
        this.c1 = false;
        if (v1) {
            ThreadLocal threadLocal = RunnableC2403i.f10087e;
            RunnableC2403i runnableC2403i = (RunnableC2403i) threadLocal.get();
            this.U0 = runnableC2403i;
            if (runnableC2403i == null) {
                this.U0 = new RunnableC2403i();
                Display displayM55133t = wvi.m55133t(this);
                if (isInEditMode() || displayM55133t == null) {
                    refreshRate = 60.0f;
                    RunnableC2403i runnableC2403i2 = this.U0;
                    runnableC2403i2.f10091c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC2403i2);
                } else {
                    refreshRate = displayM55133t.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC2403i runnableC2403i22 = this.U0;
                    runnableC2403i22.f10091c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC2403i22);
                }
            }
            this.U0.m9532a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC2403i runnableC2403i;
        super.onDetachedFromWindow();
        AbstractC2376m abstractC2376m = this.E0;
        if (abstractC2376m != null) {
            abstractC2376m.mo9208k();
        }
        H1();
        this.j0 = false;
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.m9236Q(this, this.f9768c);
        }
        this.k1.clear();
        removeCallbacks(this.l1);
        this.f9772g.m9702j();
        this.f9768c.m9275A();
        ded.m22907c(this);
        if (!v1 || (runnableC2403i = this.U0) == null) {
            return;
        }
        runnableC2403i.m9540j(this);
        this.U0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f9765Q.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2378o) this.f9765Q.get(i)).mo9228i(canvas, this, this.W0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.f9763L != null && !this.p0 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.f9763L.mo9028B() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f9763L.mo9027A() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f != 0.0f || axisValue != 0.0f) {
                    G0((int) (axisValue * this.Q0), (int) (f * this.R0), motionEvent, 1);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f9763L.mo9028B()) {
                    f = -axisValue2;
                    if (f != 0.0f) {
                        G0((int) (axisValue * this.Q0), (int) (f * this.R0), motionEvent, 1);
                    }
                } else {
                    if (this.f9763L.mo9027A()) {
                        axisValue = axisValue2;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.p0) {
            return false;
        }
        this.i0 = null;
        if (m9082Y(motionEvent)) {
            m9096r();
            return true;
        }
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null) {
            return false;
        }
        boolean zMo9027A = abstractC2379p.mo9027A();
        boolean zMo9028B = this.f9763L.mo9028B();
        if (this.H0 == null) {
            this.H0 = VelocityTracker.obtain();
        }
        this.H0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.q0) {
                this.q0 = false;
            }
            this.G0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.K0 = x;
            this.I0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.L0 = y;
            this.J0 = y;
            if (E1(motionEvent) || this.F0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                G1(1);
            }
            int[] iArr = this.i1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zMo9027A;
            if (zMo9028B) {
                i = (zMo9027A ? 1 : 0) | 2;
            }
            D1(i, 0);
        } else if (actionMasked == 1) {
            this.H0.clear();
            G1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.G0);
            if (iFindPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.G0);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.F0 != 1) {
                int i2 = x2 - this.I0;
                int i3 = y2 - this.J0;
                if (zMo9027A == 0 || Math.abs(i2) <= this.M0) {
                    z = false;
                } else {
                    this.K0 = x2;
                    z = true;
                }
                if (zMo9028B && Math.abs(i3) > this.M0) {
                    this.L0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m9096r();
        } else if (actionMasked == 5) {
            this.G0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.K0 = x3;
            this.I0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.L0 = y3;
            this.J0 = y3;
        } else if (actionMasked == 6) {
            R0(motionEvent);
        }
        return this.F0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        zsh.m59821a("RV OnLayout");
        m9063F();
        zsh.m59822b();
        this.m0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null) {
            m9058A(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC2379p.D0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f9763L.l1(this.f9768c, this.W0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.m1 = z;
            if (z || this.f9762H == null) {
                return;
            }
            if (this.W0.f9886e == 1) {
                m9064G();
            }
            this.f9763L.N1(i, i2);
            this.W0.f9891j = true;
            m9065H();
            this.f9763L.Q1(i, i2);
            if (this.f9763L.T1()) {
                this.f9763L.N1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.W0.f9891j = true;
                m9065H();
                this.f9763L.Q1(i, i2);
            }
            this.n1 = getMeasuredWidth();
            this.o1 = getMeasuredHeight();
            return;
        }
        if (this.k0) {
            this.f9763L.l1(this.f9768c, this.W0, i, i2);
            return;
        }
        if (this.s0) {
            C1();
            O0();
            W0();
            P0();
            C2389z c2389z = this.W0;
            if (c2389z.f9893l) {
                c2389z.f9889h = true;
            } else {
                this.f9770e.m9408j();
                this.W0.f9889h = false;
            }
            this.s0 = false;
            F1(false);
        } else if (this.W0.f9893l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC2371h abstractC2371h = this.f9762H;
        if (abstractC2371h != null) {
            this.W0.f9887f = abstractC2371h.getItemCount();
        } else {
            this.W0.f9887f = 0;
        }
        C1();
        this.f9763L.l1(this.f9768c, this.W0, i, i2);
        F1(false);
        this.W0.f9889h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (B0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f9769d = savedState;
        super.onRestoreInstanceState(savedState.m5953a());
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f9769d;
        if (savedState2 != null) {
            savedState.m9108b(savedState2);
        } else {
            AbstractC2379p abstractC2379p = this.f9763L;
            if (abstractC2379p != null) {
                savedState.f9782c = abstractC2379p.p1();
            } else {
                savedState.f9782c = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        y0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[PHI: r0
      0x00d6: PHI (r0v37 int) = (r0v26 int), (r0v41 int) binds: [B:41:0x00bf, B:45:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.p0 || this.q0) {
            return false;
        }
        if (m9072O(motionEvent)) {
            m9096r();
            return true;
        }
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null) {
            return false;
        }
        boolean zMo9027A = abstractC2379p.mo9027A();
        boolean zMo9028B = this.f9763L.mo9028B();
        if (this.H0 == null) {
            this.H0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.i1;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.i1;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.G0 = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.K0 = x;
            this.I0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.L0 = y;
            this.J0 = y;
            int i = zMo9027A;
            if (zMo9028B) {
                i = (zMo9027A ? 1 : 0) | 2;
            }
            D1(i, 0);
        } else if (actionMasked == 1) {
            this.H0.addMovement(motionEventObtain);
            this.H0.computeCurrentVelocity(1000, this.P0);
            float f = zMo9027A != 0 ? -this.H0.getXVelocity(this.G0) : 0.0f;
            float f2 = zMo9028B ? -this.H0.getYVelocity(this.G0) : 0.0f;
            if ((f == 0.0f && f2 == 0.0f) || !f0((int) f, (int) f2)) {
                setScrollState(0);
            }
            n1();
            z2 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.G0);
            if (iFindPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.G0);
                sb.append(" not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMax = this.K0 - x2;
            int iMax2 = this.L0 - y2;
            if (this.F0 != 1) {
                if (zMo9027A == 0) {
                    z = false;
                    if (zMo9028B) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.M0) : Math.min(0, iMax2 + this.M0);
                        if (iMax2 != 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        setScrollState(1);
                    }
                } else {
                    iMax = iMax > 0 ? Math.max(0, iMax - this.M0) : Math.min(0, iMax + this.M0);
                    if (iMax != 0) {
                        z = true;
                    }
                    if (zMo9028B) {
                    }
                    if (z) {
                    }
                }
            }
            if (this.F0 == 1) {
                int[] iArr3 = this.j1;
                iArr3[0] = 0;
                iArr3[1] = 0;
                int iC1 = iMax - c1(iMax, motionEvent.getY());
                int iD1 = iMax2 - d1(iMax2, motionEvent.getX());
                if (m9067J(zMo9027A != 0 ? iC1 : 0, zMo9028B ? iD1 : 0, this.j1, this.h1, 0)) {
                    int[] iArr4 = this.j1;
                    iC1 -= iArr4[0];
                    iD1 -= iArr4[1];
                    int[] iArr5 = this.i1;
                    int i2 = iArr5[0];
                    int[] iArr6 = this.h1;
                    iArr5[0] = i2 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i3 = iD1;
                int[] iArr7 = this.h1;
                this.K0 = x2 - iArr7[0];
                this.L0 = y2 - iArr7[1];
                if (q1(zMo9027A != 0 ? iC1 : 0, zMo9028B ? i3 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                RunnableC2403i runnableC2403i = this.U0;
                if (runnableC2403i != null && (iC1 != 0 || i3 != 0)) {
                    runnableC2403i.m9536f(this, iC1, i3);
                }
            }
        } else if (actionMasked == 3) {
            m9096r();
        } else if (actionMasked == 5) {
            this.G0 = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.K0 = x3;
            this.I0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.L0 = y3;
            this.J0 = y3;
        } else if (actionMasked == 6) {
            R0(motionEvent);
        }
        if (!z2) {
            this.H0.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* renamed from: p */
    public void m9094p(String str) {
        if (B0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m9077T());
        }
        if (this.y0 > 0) {
            new IllegalStateException("" + m9077T());
        }
    }

    public Rect p0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f9780c) {
            return layoutParams.f9779b;
        }
        if (this.W0.m9347e() && (layoutParams.m9105b() || layoutParams.m9107d())) {
            return layoutParams.f9779b;
        }
        Rect rect = layoutParams.f9779b;
        rect.set(0, 0, 0, 0);
        int size = this.f9765Q.size();
        for (int i = 0; i < size; i++) {
            this.f9775s.set(0, 0, 0, 0);
            ((AbstractC2378o) this.f9765Q.get(i)).mo9226g(this.f9775s, view, this, this.W0);
            int i2 = rect.left;
            Rect rect2 = this.f9775s;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f9780c = false;
        return rect;
    }

    public void p1() {
        int iM9453j = this.f9771f.m9453j();
        for (int i = 0; i < iM9453j; i++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i));
            if (!d0VarL0.m9134L()) {
                d0VarL0.m9129G();
            }
        }
    }

    /* renamed from: q */
    public boolean m9095q(d0 d0Var) {
        AbstractC2376m abstractC2376m = this.E0;
        return abstractC2376m == null || abstractC2376m.mo9204g(d0Var, d0Var.m9153q());
    }

    public boolean q1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        m9102y();
        if (this.f9762H != null) {
            int[] iArr = this.j1;
            iArr[0] = 0;
            iArr[1] = 0;
            r1(i, i2, iArr);
            int[] iArr2 = this.j1;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i - i8;
            i7 = i2 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.f9765Q.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.j1;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m9068K(i5, i4, i6, i7, this.h1, i3, iArr3);
        int[] iArr4 = this.j1;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.K0;
        int[] iArr5 = this.h1;
        int i15 = iArr5[0];
        this.K0 = i14 - i15;
        int i16 = this.L0;
        int i17 = iArr5[1];
        this.L0 = i16 - i17;
        int[] iArr6 = this.i1;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !kmb.m35931a(motionEvent, 8194)) {
                Y0(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            m9098u(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            m9070M(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: r */
    public final void m9096r() {
        n1();
        setScrollState(0);
    }

    public final void r0(long j, d0 d0Var, d0 d0Var2) {
        int iM9450g = this.f9771f.m9450g();
        for (int i = 0; i < iM9450g; i++) {
            d0 d0VarL0 = l0(this.f9771f.m9449f(i));
            if (d0VarL0 != d0Var && h0(d0VarL0) == j) {
                AbstractC2371h abstractC2371h = this.f9762H;
                if (abstractC2371h == null || !abstractC2371h.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + d0VarL0 + " \n View Holder 2:" + d0Var + m9077T());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + d0VarL0 + " \n View Holder 2:" + d0Var + m9077T());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb.append(d0Var2);
        sb.append(" cannot be found but it is necessary for ");
        sb.append(d0Var);
        sb.append(m9077T());
    }

    public void r1(int i, int i2, int[] iArr) {
        C1();
        O0();
        zsh.m59821a("RV Scroll");
        m9078U(this.W0);
        int iJ1 = i != 0 ? this.f9763L.J1(i, this.f9768c, this.W0) : 0;
        int iL1 = i2 != 0 ? this.f9763L.L1(i2, this.f9768c, this.W0) : 0;
        zsh.m59822b();
        k1();
        P0();
        F1(false);
        if (iArr != null) {
            iArr[0] = iJ1;
            iArr[1] = iL1;
        }
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        d0 d0VarL0 = l0(view);
        if (d0VarL0 != null) {
            if (d0VarL0.m9162z()) {
                d0VarL0.m9142f();
            } else if (!d0VarL0.m9134L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + d0VarL0 + m9077T());
            }
        }
        view.clearAnimation();
        m9061D(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f9763L.n1(this, this.W0, view, view2) && view2 != null) {
            l1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f9763L.E1(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC2382s) this.h0.get(i)).mo730e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.n0 != 0 || this.p0) {
            this.o0 = true;
        } else {
            super.requestLayout();
        }
    }

    public boolean s0() {
        return !this.m0 || this.v0 || this.f9770e.m9414p();
    }

    public void s1(int i) {
        if (this.p0) {
            return;
        }
        H1();
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null) {
            return;
        }
        abstractC2379p.K1(i);
        awakenScrollBars();
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p == null || this.p0) {
            return;
        }
        boolean zMo9027A = abstractC2379p.mo9027A();
        boolean zMo9028B = this.f9763L.mo9028B();
        if (zMo9027A || zMo9028B) {
            if (!zMo9027A) {
                i = 0;
            }
            if (!zMo9028B) {
                i2 = 0;
            }
            q1(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (w1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C2410p c2410p) {
        this.d1 = c2410p;
        wvi.m0(this, c2410p);
    }

    public void setAdapter(AbstractC2371h abstractC2371h) {
        setLayoutFrozen(false);
        t1(abstractC2371h, false, true);
        X0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC2374k interfaceC2374k) {
        if (interfaceC2374k == this.e1) {
            return;
        }
        this.e1 = interfaceC2374k;
        setChildrenDrawingOrderEnabled(interfaceC2374k != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.f9773h) {
            y0();
        }
        this.f9773h = z;
        super.setClipToPadding(z);
        if (this.m0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C2375l c2375l) {
        fgd.m26663g(c2375l);
        this.z0 = c2375l;
        y0();
    }

    public void setHasFixedSize(boolean z) {
        this.k0 = z;
    }

    public void setItemAnimator(AbstractC2376m abstractC2376m) {
        AbstractC2376m abstractC2376m2 = this.E0;
        if (abstractC2376m2 != null) {
            abstractC2376m2.mo9208k();
            this.E0.m9220w(null);
        }
        this.E0 = abstractC2376m;
        if (abstractC2376m != null) {
            abstractC2376m.m9220w(this.b1);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f9768c.m9286L(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC2379p abstractC2379p) {
        if (abstractC2379p == this.f9763L) {
            return;
        }
        H1();
        if (this.f9763L != null) {
            AbstractC2376m abstractC2376m = this.E0;
            if (abstractC2376m != null) {
                abstractC2376m.mo9208k();
            }
            this.f9763L.x1(this.f9768c);
            this.f9763L.y1(this.f9768c);
            this.f9768c.m9295c();
            if (this.j0) {
                this.f9763L.m9236Q(this, this.f9768c);
            }
            this.f9763L.R1(null);
            this.f9763L = null;
        } else {
            this.f9768c.m9295c();
        }
        this.f9771f.m9458o();
        this.f9763L = abstractC2379p;
        if (abstractC2379p != null) {
            if (abstractC2379p.f9834b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC2379p + " is already attached to a RecyclerView:" + abstractC2379p.f9834b.m9077T());
            }
            abstractC2379p.R1(this);
            if (this.j0) {
                this.f9763L.m9235P(this);
            }
        }
        this.f9768c.m9290P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m25590m(z);
    }

    public void setOnFlingListener(AbstractC2381r abstractC2381r) {
        this.N0 = abstractC2381r;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2383t abstractC2383t) {
        this.X0 = abstractC2383t;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.S0 = z;
    }

    public void setRecycledViewPool(C2384u c2384u) {
        this.f9768c.m9284J(c2384u);
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2386w interfaceC2386w) {
    }

    void setScrollState(int i) {
        if (i == this.F0) {
            return;
        }
        this.F0 = i;
        if (i != 2) {
            I1();
        }
        m9069L(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.M0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("setScrollingTouchSlop(): bad argument constant ");
            sb.append(i);
            sb.append("; using default value");
        }
        this.M0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.f9768c.m9285K(b0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m25592o(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m25594q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.p0) {
            m9094p("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.p0 = true;
                this.q0 = true;
                H1();
                return;
            }
            this.p0 = false;
            if (this.o0 && this.f9763L != null && this.f9762H != null) {
                requestLayout();
            }
            this.o0 = false;
        }
    }

    /* renamed from: t */
    public void m9097t() {
        int iM9453j = this.f9771f.m9453j();
        for (int i = 0; i < iM9453j; i++) {
            d0 d0VarL0 = l0(this.f9771f.m9452i(i));
            if (!d0VarL0.m9134L()) {
                d0VarL0.m9139c();
            }
        }
        this.f9768c.m9296d();
    }

    public final boolean t0() {
        int iM9450g = this.f9771f.m9450g();
        for (int i = 0; i < iM9450g; i++) {
            d0 d0VarL0 = l0(this.f9771f.m9449f(i));
            if (d0VarL0 != null && !d0VarL0.m9134L() && d0VarL0.m9123A()) {
                return true;
            }
        }
        return false;
    }

    public final void t1(AbstractC2371h abstractC2371h, boolean z, boolean z2) {
        AbstractC2371h abstractC2371h2 = this.f9762H;
        if (abstractC2371h2 != null) {
            abstractC2371h2.unregisterAdapterDataObserver(this.f9767b);
            this.f9762H.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            e1();
        }
        this.f9770e.m9423y();
        AbstractC2371h abstractC2371h3 = this.f9762H;
        this.f9762H = abstractC2371h;
        if (abstractC2371h != null) {
            abstractC2371h.registerAdapterDataObserver(this.f9767b);
            abstractC2371h.onAttachedToRecyclerView(this);
        }
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            abstractC2379p.Q0(abstractC2371h3, this.f9762H);
        }
        this.f9768c.m9317y(abstractC2371h3, this.f9762H, z);
        this.W0.f9888g = true;
    }

    /* renamed from: u */
    public void m9098u(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.A0;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.A0.onRelease();
            zIsFinished = this.A0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C0.onRelease();
            zIsFinished |= this.C0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B0.onRelease();
            zIsFinished |= this.B0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D0.onRelease();
            zIsFinished |= this.D0.isFinished();
        }
        if (zIsFinished) {
            wvi.d0(this);
        }
    }

    public void u0() {
        this.f9770e = new C2395a(new C2369f());
    }

    public boolean u1(d0 d0Var, int i) {
        if (!B0()) {
            wvi.t0(d0Var.f9794a, i);
            return true;
        }
        d0Var.f9810q = i;
        this.k1.add(d0Var);
        return false;
    }

    /* renamed from: v */
    public int m9099v(int i) {
        return m9100w(i, this.A0, this.C0, getWidth());
    }

    public final void v0() {
        if (wvi.m55138y(this) == 0) {
            wvi.v0(this, 8);
        }
    }

    public final boolean v1(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return q0(-i) < c36.m20157b(edgeEffect) * ((float) i2);
    }

    /* renamed from: w */
    public final int m9100w(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && c36.m20157b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i2) / 4.0f) * c36.m20159d(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || c36.m20157b(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round((f / 4.0f) * c36.m20159d(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public final void w0() {
        this.f9771f = new C2399e(new C2368e());
    }

    public boolean w1(AccessibilityEvent accessibilityEvent) {
        if (!B0()) {
            return false;
        }
        int iM24667a = accessibilityEvent != null ? eb.m24667a(accessibilityEvent) : 0;
        this.r0 |= iM24667a != 0 ? iM24667a : 0;
        return true;
    }

    /* renamed from: x */
    int m9101x(int i) {
        return m9100w(i, this.B0, this.D0, getHeight());
    }

    public void x0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C2402h(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(i7e.fastscroll_default_thickness), resources.getDimensionPixelSize(i7e.fastscroll_minimum_range), resources.getDimensionPixelOffset(i7e.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m9077T());
        }
    }

    public void x1(int i, int i2) {
        y1(i, i2, null);
    }

    /* renamed from: y */
    public void m9102y() {
        if (!this.m0 || this.v0) {
            zsh.m59821a("RV FullInvalidate");
            m9063F();
            zsh.m59822b();
            return;
        }
        if (this.f9770e.m9414p()) {
            if (!this.f9770e.m9413o(4) || this.f9770e.m9413o(11)) {
                if (this.f9770e.m9414p()) {
                    zsh.m59821a("RV FullInvalidate");
                    m9063F();
                    zsh.m59822b();
                    return;
                }
                return;
            }
            zsh.m59821a("RV PartialInvalidate");
            C1();
            O0();
            this.f9770e.m9421w();
            if (!this.o0) {
                if (t0()) {
                    m9063F();
                } else {
                    this.f9770e.m9407i();
                }
            }
            F1(true);
            P0();
            zsh.m59822b();
        }
    }

    public void y0() {
        this.D0 = null;
        this.B0 = null;
        this.C0 = null;
        this.A0 = null;
    }

    public void y1(int i, int i2, Interpolator interpolator) {
        z1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: z */
    public final void m9103z(Context context, String str, AttributeSet attributeSet, int i, int i2) throws NoSuchMethodException, SecurityException {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strO0 = o0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strO0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC2379p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(y1);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strO0, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC2379p) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strO0, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strO0, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strO0, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strO0, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strO0, e7);
            }
        }
    }

    public boolean z0() {
        AccessibilityManager accessibilityManager = this.t0;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void z1(int i, int i2, Interpolator interpolator, int i3) {
        A1(i, i2, interpolator, i3, false);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g6e.recyclerViewStyle);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2363a();

        /* renamed from: c */
        public Parcelable f9782c;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C2363a implements Parcelable.ClassLoaderCreator {
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
            this.f9782c = parcel.readParcelable(classLoader == null ? AbstractC2379p.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        public void m9108b(SavedState savedState) {
            this.f9782c = savedState.f9782c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f9782c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i);
        this.f9767b = new C2387x();
        this.f9768c = new C2385v();
        this.f9772g = new C2415u();
        this.f9774q = new RunnableC2364a();
        this.f9775s = new Rect();
        this.f9776x = new Rect();
        this.f9777y = new RectF();
        this.f9764M = new ArrayList();
        this.f9765Q = new ArrayList();
        this.h0 = new ArrayList();
        this.n0 = 0;
        this.v0 = false;
        this.w0 = false;
        this.x0 = 0;
        this.y0 = 0;
        this.z0 = A1;
        this.E0 = new C2400f();
        this.F0 = 0;
        this.G0 = -1;
        this.Q0 = Float.MIN_VALUE;
        this.R0 = Float.MIN_VALUE;
        this.S0 = true;
        this.T0 = new c0();
        this.V0 = v1 ? new RunnableC2403i.b() : null;
        this.W0 = new C2389z();
        this.Z0 = false;
        this.a1 = false;
        this.b1 = new C2377n();
        this.c1 = false;
        this.f1 = new int[2];
        this.h1 = new int[2];
        this.i1 = new int[2];
        this.j1 = new int[2];
        this.k1 = new ArrayList();
        this.l1 = new RunnableC2365b();
        this.n1 = 0;
        this.o1 = 0;
        this.p1 = new C2367d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.M0 = viewConfiguration.getScaledTouchSlop();
        this.Q0 = cwi.m21947f(viewConfiguration, context);
        this.R0 = cwi.m21951j(viewConfiguration, context);
        this.O0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.P0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f9766a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.E0.m9220w(this.b1);
        u0();
        w0();
        v0();
        if (wvi.m55137x(this) == 0) {
            wvi.t0(this, 1);
        }
        this.t0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C2410p(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vae.RecyclerView, i, 0);
        wvi.k0(this, context, vae.RecyclerView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(vae.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(vae.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f9773h = typedArrayObtainStyledAttributes.getBoolean(vae.RecyclerView_android_clipToPadding, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(vae.RecyclerView_fastScrollEnabled, false);
        this.l0 = z;
        if (z) {
            x0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(vae.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(vae.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(vae.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(vae.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        m9103z(context, string, attributeSet, i, 0);
        int[] iArr = q1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        wvi.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        ded.m22912h(this, true);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public d0 f9778a;

        /* renamed from: b */
        public final Rect f9779b;

        /* renamed from: c */
        public boolean f9780c;

        /* renamed from: d */
        public boolean f9781d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f9779b = new Rect();
            this.f9780c = true;
            this.f9781d = false;
        }

        /* renamed from: a */
        public int m9104a() {
            return this.f9778a.m9151o();
        }

        /* renamed from: b */
        public boolean m9105b() {
            return this.f9778a.m9123A();
        }

        /* renamed from: c */
        public boolean m9106c() {
            return this.f9778a.m9160x();
        }

        /* renamed from: d */
        public boolean m9107d() {
            return this.f9778a.m9158v();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f9779b = new Rect();
            this.f9780c = true;
            this.f9781d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f9779b = new Rect();
            this.f9780c = true;
            this.f9781d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9779b = new Rect();
            this.f9780c = true;
            this.f9781d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f9779b = new Rect();
            this.f9780c = true;
            this.f9781d = false;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2379p abstractC2379p = this.f9763L;
        if (abstractC2379p != null) {
            return abstractC2379p.mo9016V(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m9077T());
    }
}
