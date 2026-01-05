package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b2.C0558p;
import b6.C0602c;
import bg.AbstractC0656a;
import bk.RunnableC0683n;
import c6.C0889s;
import c6.C0892v;
import c6.p0;
import c6.w0;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import e1.C1915q;
import e1.u0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k1.j2;
import m6.InterpolatorC4668d;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import uf.C7427b;
import ug.C7439j;
import ug.C7454y;
import ug.g1;
import x5.AbstractC8309e;
import x7.AbstractC8311a;
import y7.AbstractC8590y;
import y7.C8566a;
import y7.C8573h;
import y7.C8575j;
import y7.C8584s;
import y7.C8589x;
import y7.RunnableC8577l;
import y7.a0;
import y7.b0;
import y7.c0;
import y7.d0;
import y7.d1;
import y7.f0;
import y7.g0;
import y7.h0;
import y7.i0;
import y7.j0;
import y7.k0;
import y7.l0;
import y7.m0;
import y7.n0;
import y7.q0;
import y7.r0;
import y7.s0;
import y7.t0;
import y7.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final InterpolatorC4668d A1;

    /* renamed from: y1, reason: collision with root package name */
    public static final int[] f43688y1 = {R.attr.nestedScrollingEnabled};

    /* renamed from: z1, reason: collision with root package name */
    public static final Class[] f43689z1;

    /* renamed from: B */
    public final AccessibilityManager f2798B;

    /* renamed from: C */
    public boolean f2799C;

    /* renamed from: D */
    public boolean f2800D;

    /* renamed from: E */
    public int f2801E;

    /* renamed from: F */
    public int f2802F;

    /* renamed from: G */
    public b0 f2803G;

    /* renamed from: H */
    public EdgeEffect f2804H;

    /* renamed from: I */
    public EdgeEffect f2805I;

    /* renamed from: K */
    public EdgeEffect f2806K;

    /* renamed from: L */
    public EdgeEffect f2807L;

    /* renamed from: M */
    public c0 f2808M;

    /* renamed from: N */
    public int f2809N;

    /* renamed from: O */
    public int f2810O;

    /* renamed from: T */
    public VelocityTracker f2811T;

    /* renamed from: V */
    public int f2812V;
    public int X0;
    public int Y0;
    public h0 Z0;

    /* renamed from: a */
    public final C7454y f2813a;

    /* renamed from: a1, reason: collision with root package name */
    public final int f43690a1;

    /* renamed from: b */
    public final l0 f2814b;

    /* renamed from: b1, reason: collision with root package name */
    public final int f43691b1;

    /* renamed from: c */
    public n0 f2815c;

    /* renamed from: c1, reason: collision with root package name */
    public final float f43692c1;

    /* renamed from: d */
    public final xm.b0 f2816d;

    /* renamed from: d1, reason: collision with root package name */
    public final float f43693d1;

    /* renamed from: e */
    public final C7439j f2817e;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f43694e1;

    /* renamed from: f */
    public final C0917l f2818f;

    /* renamed from: f1, reason: collision with root package name */
    public final s0 f43695f1;

    /* renamed from: g */
    public boolean f2819g;

    /* renamed from: g1, reason: collision with root package name */
    public RunnableC8577l f43696g1;

    /* renamed from: h */
    public final Rect f2820h;

    /* renamed from: h0, reason: collision with root package name */
    public int f43697h0;

    /* renamed from: h1, reason: collision with root package name */
    public final C0558p f43698h1;

    /* renamed from: i1, reason: collision with root package name */
    public final q0 f43699i1;

    /* renamed from: j */
    public final Rect f2821j;

    /* renamed from: j1, reason: collision with root package name */
    public i0 f43700j1;

    /* renamed from: k */
    public final RectF f2822k;

    /* renamed from: k1, reason: collision with root package name */
    public ArrayList f43701k1;

    /* renamed from: l */
    public AbstractC8590y f2823l;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f43702l1;

    /* renamed from: m */
    public f0 f2824m;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f43703m1;

    /* renamed from: n */
    public final ArrayList f2825n;

    /* renamed from: n1, reason: collision with root package name */
    public final C8589x f43704n1;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f43705o1;

    /* renamed from: p */
    public final ArrayList f2826p;

    /* renamed from: p1, reason: collision with root package name */
    public v0 f43706p1;

    /* renamed from: q */
    public C8575j f2827q;

    /* renamed from: q1, reason: collision with root package name */
    public final int[] f43707q1;

    /* renamed from: r */
    public boolean f2828r;

    /* renamed from: r1, reason: collision with root package name */
    public C0889s f43708r1;

    /* renamed from: s */
    public boolean f2829s;

    /* renamed from: s1, reason: collision with root package name */
    public final int[] f43709s1;

    /* renamed from: t */
    public boolean f2830t;

    /* renamed from: t0, reason: collision with root package name */
    public int f43710t0;

    /* renamed from: t1, reason: collision with root package name */
    public final int[] f43711t1;

    /* renamed from: u1, reason: collision with root package name */
    public final int[] f43712u1;

    /* renamed from: v */
    public int f2831v;

    /* renamed from: v1, reason: collision with root package name */
    public final ArrayList f43713v1;

    /* renamed from: w */
    public boolean f2832w;

    /* renamed from: w1, reason: collision with root package name */
    public final RunnableC0683n f43714w1;

    /* renamed from: x */
    public boolean f2833x;

    /* renamed from: x1, reason: collision with root package name */
    public final C8589x f43715x1;

    /* renamed from: y */
    public boolean f2834y;

    /* renamed from: z */
    public int f2835z;

    static {
        Class cls = Integer.TYPE;
        f43689z1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1 = new InterpolatorC4668d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.websoptimization.callyzerbiz.R.attr.recyclerViewStyle);
    }

    /* renamed from: C */
    public static RecyclerView m1312C(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewM1312C = m1312C(viewGroup.getChildAt(i10));
            if (recyclerViewM1312C != null) {
                return recyclerViewM1312C;
            }
        }
        return null;
    }

    /* renamed from: H */
    public static t0 m1313H(View view) {
        if (view == null) {
            return null;
        }
        return ((g0) view.getLayoutParams()).f41639a;
    }

    private C0889s getScrollingChildHelper() {
        if (this.f43708r1 == null) {
            this.f43708r1 = new C0889s(this);
        }
        return this.f43708r1;
    }

    /* renamed from: i */
    public static void m1318i(t0 t0Var) {
        WeakReference weakReference = t0Var.f41793b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == t0Var.f41792a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            t0Var.f41793b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1319A(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f2826p
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            y7.j r5 = (y7.C8575j) r5
            int r6 = r5.f41682v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.m15868d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.m15867c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f41683w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f41676p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f41683w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f41673m = r6
        L55:
            r5.m15869f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f2827q = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1319A(android.view.MotionEvent):boolean");
    }

    /* renamed from: B */
    public final void m1320B(int[] iArr) {
        int iM14009t = this.f2817e.m14009t();
        if (iM14009t == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iM14009t; i12++) {
            t0 t0VarM1313H = m1313H(this.f2817e.m14008s(i12));
            if (!t0VarM1313H.m15930o()) {
                int iM15917b = t0VarM1313H.m15917b();
                if (iM15917b < i10) {
                    i10 = iM15917b;
                }
                if (iM15917b > i11) {
                    i11 = iM15917b;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    /* renamed from: D */
    public final t0 m1321D(int i10) {
        t0 t0Var = null;
        if (this.f2799C) {
            return null;
        }
        int iM14013x = this.f2817e.m14013x();
        for (int i11 = 0; i11 < iM14013x; i11++) {
            t0 t0VarM1313H = m1313H(this.f2817e.m14012w(i11));
            if (t0VarM1313H != null && !t0VarM1313H.m15923h() && m1322E(t0VarM1313H) == i10) {
                if (!((ArrayList) this.f2817e.f35539d).contains(t0VarM1313H.f41792a)) {
                    return t0VarM1313H;
                }
                t0Var = t0VarM1313H;
            }
        }
        return t0Var;
    }

    /* renamed from: E */
    public final int m1322E(t0 t0Var) {
        if ((t0Var.f41801j & 524) == 0 && t0Var.m15920e()) {
            int i10 = t0Var.f41794c;
            ArrayList arrayList = (ArrayList) this.f2816d.f40151e;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C8566a c8566a = (C8566a) arrayList.get(i11);
                int i12 = c8566a.f41562a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = c8566a.f41563b;
                        if (i13 <= i10) {
                            int i14 = c8566a.f41564c;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = c8566a.f41563b;
                        if (i15 == i10) {
                            i10 = c8566a.f41564c;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (c8566a.f41564c <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (c8566a.f41563b <= i10) {
                    i10 += c8566a.f41564c;
                }
            }
            return i10;
        }
        return -1;
    }

    /* renamed from: F */
    public final long m1323F(t0 t0Var) {
        return this.f2823l.f41833b ? t0Var.f41796e : t0Var.f41794c;
    }

    /* renamed from: G */
    public final t0 m1324G(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1313H(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: I */
    public final Rect m1325I(View view) {
        g0 g0Var = (g0) view.getLayoutParams();
        boolean z6 = g0Var.f41641c;
        Rect rect = g0Var.f41640b;
        if (!z6 || (this.f43699i1.f41757g && (g0Var.f41639a.m15926k() || g0Var.f41639a.m15921f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2825n;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Rect rect2 = this.f2820h;
            rect2.set(0, 0, 0, 0);
            ((d0) arrayList.get(i10)).getClass();
            ((g0) view.getLayoutParams()).f41639a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        g0Var.f41641c = false;
        return rect;
    }

    /* renamed from: J */
    public final boolean m1326J() {
        return !this.f2830t || this.f2799C || this.f2816d.m15565k();
    }

    /* renamed from: K */
    public final boolean m1327K() {
        return this.f2801E > 0;
    }

    /* renamed from: L */
    public final void m1328L(int i10) {
        if (this.f2824m == null) {
            return;
        }
        setScrollState(2);
        this.f2824m.i0(i10);
        awakenScrollBars();
    }

    /* renamed from: M */
    public final void m1329M() {
        int iM14013x = this.f2817e.m14013x();
        for (int i10 = 0; i10 < iM14013x; i10++) {
            ((g0) this.f2817e.m14012w(i10).getLayoutParams()).f41641c = true;
        }
        ArrayList arrayList = this.f2814b.f41706c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            g0 g0Var = (g0) ((t0) arrayList.get(i11)).f41792a.getLayoutParams();
            if (g0Var != null) {
                g0Var.f41641c = true;
            }
        }
    }

    /* renamed from: N */
    public final void m1330N(int i10, int i11, boolean z6) {
        int i12 = i10 + i11;
        int iM14013x = this.f2817e.m14013x();
        for (int i13 = 0; i13 < iM14013x; i13++) {
            t0 t0VarM1313H = m1313H(this.f2817e.m14012w(i13));
            if (t0VarM1313H != null && !t0VarM1313H.m15930o()) {
                int i14 = t0VarM1313H.f41794c;
                q0 q0Var = this.f43699i1;
                if (i14 >= i12) {
                    t0VarM1313H.m15927l(-i11, z6);
                    q0Var.f41756f = true;
                } else if (i14 >= i10) {
                    t0VarM1313H.m15916a(8);
                    t0VarM1313H.m15927l(-i11, z6);
                    t0VarM1313H.f41794c = i10 - 1;
                    q0Var.f41756f = true;
                }
            }
        }
        l0 l0Var = this.f2814b;
        ArrayList arrayList = l0Var.f41706c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0Var = (t0) arrayList.get(size);
            if (t0Var != null) {
                int i15 = t0Var.f41794c;
                if (i15 >= i12) {
                    t0Var.m15927l(-i11, z6);
                } else if (i15 >= i10) {
                    t0Var.m15916a(8);
                    l0Var.m15879e(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: O */
    public final void m1331O() {
        this.f2801E++;
    }

    /* renamed from: P */
    public final void m1332P(boolean z6) {
        int i10;
        AccessibilityManager accessibilityManager;
        int i11 = this.f2801E - 1;
        this.f2801E = i11;
        if (i11 < 1) {
            this.f2801E = 0;
            if (z6) {
                int i12 = this.f2835z;
                this.f2835z = 0;
                if (i12 != 0 && (accessibilityManager = this.f2798B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(NewHope.SENDB_BYTES);
                    accessibilityEventObtain.setContentChangeTypes(i12);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f43713v1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    if (t0Var.f41792a.getParent() == this && !t0Var.m15930o() && (i10 = t0Var.f41808q) != -1) {
                        View view = t0Var.f41792a;
                        Field field = c6.v0.f5527a;
                        view.setImportantForAccessibility(i10);
                        t0Var.f41808q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: Q */
    public final void m1333Q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2810O) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2810O = motionEvent.getPointerId(i10);
            int x3 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f43710t0 = x3;
            this.f2812V = x3;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.X0 = y10;
            this.f43697h0 = y10;
        }
    }

    /* renamed from: R */
    public final void m1334R() {
        if (this.f43705o1 || !this.f2828r) {
            return;
        }
        Field field = c6.v0.f5527a;
        postOnAnimation(this.f43714w1);
        this.f43705o1 = true;
    }

    /* renamed from: S */
    public final void m1335S(t0 t0Var, C0892v c0892v) {
        t0Var.f41801j &= -8193;
        boolean z6 = this.f43699i1.f41758h;
        C0917l c0917l = this.f2818f;
        if (z6 && t0Var.m15926k() && !t0Var.m15923h() && !t0Var.m15930o()) {
            ((C1915q) c0917l.f5595c).m5601e(m1323F(t0Var), t0Var);
        }
        u0 u0Var = (u0) c0917l.f5594b;
        d1 d1VarM15842a = (d1) u0Var.get(t0Var);
        if (d1VarM15842a == null) {
            d1VarM15842a = d1.m15842a();
            u0Var.put(t0Var, d1VarM15842a);
        }
        d1VarM15842a.f41602b = c0892v;
        d1VarM15842a.f41601a |= 4;
    }

    /* renamed from: T */
    public final void m1336T(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2820h;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof g0) {
            g0 g0Var = (g0) layoutParams;
            if (!g0Var.f41641c) {
                Rect rect2 = g0Var.f41640b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2824m.f0(this, view, this.f2820h, !this.f2830t, view2 == null);
    }

    /* renamed from: U */
    public final void m1337U() {
        VelocityTracker velocityTracker = this.f2811T;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        b0(0);
        EdgeEffect edgeEffect = this.f2804H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f2804H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2805I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f2805I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2806K;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f2806K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2807L;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f2807L.isFinished();
        }
        if (zIsFinished) {
            Field field = c6.v0.f5527a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1338V(int r18, int r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1338V(int, int, android.view.MotionEvent):boolean");
    }

    /* renamed from: W */
    public final void m1339W(int i10, int i11, int[] iArr) {
        t0 t0Var;
        m1342Z();
        m1331O();
        int i12 = AbstractC8309e.f39857a;
        Trace.beginSection("RV Scroll");
        q0 q0Var = this.f43699i1;
        m1362y(q0Var);
        l0 l0Var = this.f2814b;
        int iH0 = i10 != 0 ? this.f2824m.h0(i10, l0Var, q0Var) : 0;
        int iJ0 = i11 != 0 ? this.f2824m.j0(i11, l0Var, q0Var) : 0;
        Trace.endSection();
        C7439j c7439j = this.f2817e;
        int iM14009t = c7439j.m14009t();
        for (int i13 = 0; i13 < iM14009t; i13++) {
            View viewM14008s = c7439j.m14008s(i13);
            t0 t0VarM1324G = m1324G(viewM14008s);
            if (t0VarM1324G != null && (t0Var = t0VarM1324G.f41800i) != null) {
                View view = t0Var.f41792a;
                int left = viewM14008s.getLeft();
                int top = viewM14008s.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1332P(true);
        a0(false);
        if (iArr != null) {
            iArr[0] = iH0;
            iArr[1] = iJ0;
        }
    }

    /* renamed from: X */
    public final void m1340X(int i10) {
        C8584s c8584s;
        if (this.f2833x) {
            return;
        }
        setScrollState(0);
        s0 s0Var = this.f43695f1;
        s0Var.f41789g.removeCallbacks(s0Var);
        s0Var.f41785c.abortAnimation();
        f0 f0Var = this.f2824m;
        if (f0Var != null && (c8584s = f0Var.f41623e) != null) {
            c8584s.m15899f();
        }
        f0 f0Var2 = this.f2824m;
        if (f0Var2 == null) {
            return;
        }
        f0Var2.i0(i10);
        awakenScrollBars();
    }

    /* renamed from: Y */
    public final void m1341Y(int i10, int i11, boolean z6) {
        f0 f0Var = this.f2824m;
        if (f0Var == null || this.f2833x) {
            return;
        }
        if (!f0Var.mo1305d()) {
            i10 = 0;
        }
        if (!this.f2824m.mo1306e()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (z6) {
            int i12 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i12 |= 2;
            }
            getScrollingChildHelper().m2508g(i12, 1);
        }
        this.f43695f1.m15901b(i10, i11, Integer.MIN_VALUE, null);
    }

    /* renamed from: Z */
    public final void m1342Z() {
        int i10 = this.f2831v + 1;
        this.f2831v = i10;
        if (i10 != 1 || this.f2833x) {
            return;
        }
        this.f2832w = false;
    }

    public final void a0(boolean z6) {
        if (this.f2831v < 1) {
            this.f2831v = 1;
        }
        if (!z6 && !this.f2833x) {
            this.f2832w = false;
        }
        if (this.f2831v == 1) {
            if (z6 && this.f2832w && !this.f2833x && this.f2824m != null && this.f2823l != null) {
                m1351n();
            }
            if (!this.f2833x) {
                this.f2832w = false;
            }
        }
        this.f2831v--;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        f0 f0Var = this.f2824m;
        if (f0Var != null) {
            f0Var.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(int i10) {
        getScrollingChildHelper().m2509h(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g0) && this.f2824m.mo1289f((g0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        f0 f0Var = this.f2824m;
        if (f0Var != null && f0Var.mo1305d()) {
            return this.f2824m.mo1309j(this.f43699i1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        f0 f0Var = this.f2824m;
        if (f0Var != null && f0Var.mo1305d()) {
            return this.f2824m.mo1290k(this.f43699i1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        f0 f0Var = this.f2824m;
        if (f0Var != null && f0Var.mo1305d()) {
            return this.f2824m.mo1291l(this.f43699i1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        f0 f0Var = this.f2824m;
        if (f0Var != null && f0Var.mo1306e()) {
            return this.f2824m.mo1310m(this.f43699i1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        f0 f0Var = this.f2824m;
        if (f0Var != null && f0Var.mo1306e()) {
            return this.f2824m.mo1292n(this.f43699i1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        f0 f0Var = this.f2824m;
        if (f0Var != null && f0Var.mo1306e()) {
            return this.f2824m.mo1293o(this.f43699i1);
        }
        return 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f6, float f10, boolean z6) {
        return getScrollingChildHelper().m2502a(f6, f10, z6);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f6, float f10) {
        return getScrollingChildHelper().m2503b(f6, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m2504c(i10, iArr, i11, 0, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().m2505d(i10, iArr, i11, i12, i13, null, 0);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        ArrayList arrayList = this.f2825n;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((d0) arrayList.get(i10)).mo15841b(canvas);
        }
        EdgeEffect edgeEffect = this.f2804H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2819g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, DefinitionKt.NO_Float_VALUE);
            EdgeEffect edgeEffect2 = this.f2804H;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2805I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2819g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2805I;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f2806K;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2819g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2806K;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f2807L;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2819g) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2807L;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z6 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f2808M == null || arrayList.size() <= 0 || !this.f2808M.mo15840f()) ? z6 : true) {
            Field field = c6.v0.f5527a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    /* renamed from: e */
    public final void m1343e(t0 t0Var) {
        View view = t0Var.f41792a;
        boolean z6 = view.getParent() == this;
        this.f2814b.m15884j(m1324G(view));
        if (t0Var.m15925j()) {
            this.f2817e.m14002m(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z6) {
            this.f2817e.m14001b(view, -1, true);
            return;
        }
        C7439j c7439j = this.f2817e;
        int iIndexOfChild = ((RecyclerView) ((C7427b) c7439j.f35537b).f35231b).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((j2) c7439j.f35538c).m8464k(iIndexOfChild);
            c7439j.m14015z(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: f */
    public final void m1344f(d0 d0Var) {
        f0 f0Var = this.f2824m;
        if (f0Var != null) {
            f0Var.mo1304c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2825n;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(d0Var);
        m1329M();
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0 A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public final void m1345g(i0 i0Var) {
        if (this.f43701k1 == null) {
            this.f43701k1 = new ArrayList();
        }
        this.f43701k1.add(i0Var);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f0 f0Var = this.f2824m;
        if (f0Var != null) {
            return f0Var.mo1294r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1361x());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        f0 f0Var = this.f2824m;
        if (f0Var != null) {
            return f0Var.mo1295s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1361x());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC8590y getAdapter() {
        return this.f2823l;
    }

    @Override // android.view.View
    public int getBaseline() {
        f0 f0Var = this.f2824m;
        if (f0Var == null) {
            return super.getBaseline();
        }
        f0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2819g;
    }

    public v0 getCompatAccessibilityDelegate() {
        return this.f43706p1;
    }

    public b0 getEdgeEffectFactory() {
        return this.f2803G;
    }

    public c0 getItemAnimator() {
        return this.f2808M;
    }

    public int getItemDecorationCount() {
        return this.f2825n.size();
    }

    public f0 getLayoutManager() {
        return this.f2824m;
    }

    public int getMaxFlingVelocity() {
        return this.f43691b1;
    }

    public int getMinFlingVelocity() {
        return this.f43690a1;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public h0 getOnFlingListener() {
        return this.Z0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f43694e1;
    }

    public k0 getRecycledViewPool() {
        return this.f2814b.m15877c();
    }

    public int getScrollState() {
        return this.f2809N;
    }

    /* renamed from: h */
    public final void m1346h(String str) {
        if (m1327K()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1361x());
        }
        if (this.f2802F > 0) {
            new IllegalStateException("" + m1361x());
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m2507f(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2828r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2833x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f5514d;
    }

    /* renamed from: j */
    public final void m1347j() {
        int iM14013x = this.f2817e.m14013x();
        for (int i10 = 0; i10 < iM14013x; i10++) {
            t0 t0VarM1313H = m1313H(this.f2817e.m14012w(i10));
            if (!t0VarM1313H.m15930o()) {
                t0VarM1313H.f41795d = -1;
                t0VarM1313H.f41798g = -1;
            }
        }
        l0 l0Var = this.f2814b;
        ArrayList arrayList = l0Var.f41704a;
        ArrayList arrayList2 = l0Var.f41706c;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            t0 t0Var = (t0) arrayList2.get(i11);
            t0Var.f41795d = -1;
            t0Var.f41798g = -1;
        }
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            t0 t0Var2 = (t0) arrayList.get(i12);
            t0Var2.f41795d = -1;
            t0Var2.f41798g = -1;
        }
        ArrayList arrayList3 = l0Var.f41705b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                t0 t0Var3 = (t0) l0Var.f41705b.get(i13);
                t0Var3.f41795d = -1;
                t0Var3.f41798g = -1;
            }
        }
    }

    /* renamed from: k */
    public final void m1348k(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f2804H;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f2804H.onRelease();
            zIsFinished = this.f2804H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2806K;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f2806K.onRelease();
            zIsFinished |= this.f2806K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2805I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f2805I.onRelease();
            zIsFinished |= this.f2805I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2807L;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f2807L.onRelease();
            zIsFinished |= this.f2807L.isFinished();
        }
        if (zIsFinished) {
            Field field = c6.v0.f5527a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: l */
    public final void m1349l() {
        if (!this.f2830t || this.f2799C) {
            int i10 = AbstractC8309e.f39857a;
            Trace.beginSection("RV FullInvalidate");
            m1351n();
            Trace.endSection();
            return;
        }
        xm.b0 b0Var = this.f2816d;
        if (b0Var.m15565k()) {
            b0Var.getClass();
            if (b0Var.m15565k()) {
                int i11 = AbstractC8309e.f39857a;
                Trace.beginSection("RV FullInvalidate");
                m1351n();
                Trace.endSection();
            }
        }
    }

    /* renamed from: m */
    public final void m1350m(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = c6.v0.f5527a;
        setMeasuredDimension(f0.m15847g(i10, paddingRight, getMinimumWidth()), f0.m15847g(i11, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03b3  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1351n() {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1351n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1352o() {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m1352o():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2801E = r0
            r1 = 1
            r5.f2828r = r1
            boolean r2 = r5.f2830t
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f2830t = r2
            y7.f0 r2 = r5.f2824m
            if (r2 == 0) goto L1e
            r2.f41625g = r1
        L1e:
            r5.f43705o1 = r0
            java.lang.ThreadLocal r0 = y7.RunnableC8577l.f41698e
            java.lang.Object r1 = r0.get()
            y7.l r1 = (y7.RunnableC8577l) r1
            r5.f43696g1 = r1
            if (r1 != 0) goto L68
            y7.l r1 = new y7.l
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f41700a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f41703d = r2
            r5.f43696g1 = r1
            java.lang.reflect.Field r1 = c6.v0.f5527a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5a
            if (r1 == 0) goto L5a
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5a
            goto L5c
        L5a:
            r1 = 1114636288(0x42700000, float:60.0)
        L5c:
            y7.l r2 = r5.f43696g1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f41702c = r3
            r0.set(r2)
        L68:
            y7.l r0 = r5.f43696g1
            java.util.ArrayList r0 = r0.f41700a
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C8584s c8584s;
        super.onDetachedFromWindow();
        c0 c0Var = this.f2808M;
        if (c0Var != null) {
            c0Var.mo15839e();
        }
        setScrollState(0);
        s0 s0Var = this.f43695f1;
        s0Var.f41789g.removeCallbacks(s0Var);
        s0Var.f41785c.abortAnimation();
        f0 f0Var = this.f2824m;
        if (f0Var != null && (c8584s = f0Var.f41623e) != null) {
            c8584s.m15899f();
        }
        this.f2828r = false;
        f0 f0Var2 = this.f2824m;
        if (f0Var2 != null) {
            f0Var2.f41625g = false;
            f0Var2.mo1299M(this);
        }
        this.f43713v1.clear();
        removeCallbacks(this.f43714w1);
        this.f2818f.getClass();
        while (d1.f41600d.mo1762a() != null) {
        }
        RunnableC8577l runnableC8577l = this.f43696g1;
        if (runnableC8577l != null) {
            runnableC8577l.f41700a.remove(this);
            this.f43696g1 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2825n;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d0) arrayList.get(i10)).mo4094a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            y7.f0 r0 = r5.f2824m
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f2833x
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            y7.f0 r0 = r5.f2824m
            boolean r0 = r0.mo1306e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            y7.f0 r3 = r5.f2824m
            boolean r3 = r3.mo1305d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            y7.f0 r3 = r5.f2824m
            boolean r3 = r3.mo1306e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            y7.f0 r3 = r5.f2824m
            boolean r3 = r3.mo1305d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f43692c1
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f43693d1
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.m1338V(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        if (!this.f2833x) {
            this.f2827q = null;
            if (m1319A(motionEvent)) {
                m1337U();
                setScrollState(0);
                return true;
            }
            f0 f0Var = this.f2824m;
            if (f0Var != null) {
                boolean zMo1305d = f0Var.mo1305d();
                boolean zMo1306e = this.f2824m.mo1306e();
                if (this.f2811T == null) {
                    this.f2811T = VelocityTracker.obtain();
                }
                this.f2811T.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f2834y) {
                        this.f2834y = false;
                    }
                    this.f2810O = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.f43710t0 = x3;
                    this.f2812V = x3;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.X0 = y10;
                    this.f43697h0 = y10;
                    if (this.f2809N == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        b0(1);
                    }
                    int[] iArr = this.f43711t1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i10 = zMo1305d;
                    if (zMo1306e) {
                        i10 = (zMo1305d ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().m2508g(i10, 0);
                } else if (actionMasked == 1) {
                    this.f2811T.clear();
                    b0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2810O);
                    if (iFindPointerIndex >= 0) {
                        int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.f2809N != 1) {
                            int i11 = x10 - this.f2812V;
                            int i12 = y11 - this.f43697h0;
                            if (zMo1305d == 0 || Math.abs(i11) <= this.Y0) {
                                z6 = false;
                            } else {
                                this.f43710t0 = x10;
                                z6 = true;
                            }
                            if (zMo1306e && Math.abs(i12) > this.Y0) {
                                this.X0 = y11;
                                z6 = true;
                            }
                            if (z6) {
                                setScrollState(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    m1337U();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f2810O = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f43710t0 = x11;
                    this.f2812V = x11;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.X0 = y12;
                    this.f43697h0 = y12;
                } else if (actionMasked == 6) {
                    m1333Q(motionEvent);
                }
                if (this.f2809N == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int i14 = AbstractC8309e.f39857a;
        Trace.beginSection("RV OnLayout");
        m1351n();
        Trace.endSection();
        this.f2830t = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f0 f0Var = this.f2824m;
        if (f0Var == null) {
            m1350m(i10, i11);
            return;
        }
        boolean zMo1298H = f0Var.mo1298H();
        q0 q0Var = this.f43699i1;
        if (!zMo1298H) {
            if (this.f2829s) {
                this.f2824m.f41620b.m1350m(i10, i11);
                return;
            }
            if (q0Var.f41761k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC8590y abstractC8590y = this.f2823l;
            if (abstractC8590y != null) {
                q0Var.f41755e = abstractC8590y.mo4090a();
            } else {
                q0Var.f41755e = 0;
            }
            m1342Z();
            this.f2824m.f41620b.m1350m(i10, i11);
            a0(false);
            q0Var.f41757g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f2824m.f41620b.m1350m(i10, i11);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f2823l == null) {
            return;
        }
        if (q0Var.f41754d == 1) {
            m1352o();
        }
        this.f2824m.l0(i10, i11);
        q0Var.f41759i = true;
        m1353p();
        this.f2824m.n0(i10, i11);
        if (this.f2824m.q0()) {
            this.f2824m.l0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            q0Var.f41759i = true;
            m1353p();
            this.f2824m.n0(i10, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (m1327K()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof n0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n0 n0Var = (n0) parcelable;
        this.f2815c = n0Var;
        super.onRestoreInstanceState(n0Var.f21992a);
        f0 f0Var = this.f2824m;
        if (f0Var == null || (parcelable2 = this.f2815c.f41723c) == null) {
            return;
        }
        f0Var.mo1301Y(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        n0 n0Var = new n0(super.onSaveInstanceState());
        n0 n0Var2 = this.f2815c;
        if (n0Var2 != null) {
            n0Var.f41723c = n0Var2.f41723c;
            return n0Var;
        }
        f0 f0Var = this.f2824m;
        if (f0Var != null) {
            n0Var.f41723c = f0Var.mo1302Z();
            return n0Var;
        }
        n0Var.f41723c = null;
        return n0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        this.f2807L = null;
        this.f2805I = null;
        this.f2806K = null;
        this.f2804H = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01df A[PHI: r1
      0x01df: PHI (r1v52 int) = (r1v37 int), (r1v56 int) binds: [B:88:0x01c8, B:92:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e2  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r32) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m1353p() {
        m1342Z();
        m1331O();
        q0 q0Var = this.f43699i1;
        q0Var.m15893a(6);
        this.f2816d.m15557c();
        q0Var.f41755e = this.f2823l.mo4090a();
        q0Var.f41753c = 0;
        q0Var.f41757g = false;
        this.f2824m.mo1287W(this.f2814b, q0Var);
        q0Var.f41756f = false;
        this.f2815c = null;
        q0Var.f41760j = q0Var.f41760j && this.f2808M != null;
        q0Var.f41754d = 4;
        m1332P(true);
        a0(false);
    }

    /* renamed from: q */
    public final boolean m1354q(int i10, int[] iArr, int i11, int i12, int[] iArr2) {
        return getScrollingChildHelper().m2504c(i10, iArr, i11, i12, iArr2);
    }

    /* renamed from: r */
    public final void m1355r(int i10, int[] iArr, int i11, int i12, int i13, int[] iArr2, int i14) {
        getScrollingChildHelper().m2505d(i10, iArr, i11, i12, i13, iArr2, i14);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z6) {
        t0 t0VarM1313H = m1313H(view);
        if (t0VarM1313H != null) {
            if (t0VarM1313H.m15925j()) {
                t0VarM1313H.f41801j &= -257;
            } else if (!t0VarM1313H.m15930o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + t0VarM1313H + m1361x());
            }
        }
        view.clearAnimation();
        m1313H(view);
        super.removeDetachedView(view, z6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C8584s c8584s = this.f2824m.f41623e;
        if ((c8584s == null || !c8584s.f41772e) && !m1327K() && view2 != null) {
            m1336T(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f2824m.f0(this, view, rect, z6, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList arrayList = this.f2826p;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C8575j) arrayList.get(i10)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2831v != 0 || this.f2833x) {
            this.f2832w = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m1356s(int i10, int i11) {
        this.f2802F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        i0 i0Var = this.f43700j1;
        if (i0Var != null) {
            i0Var.mo4096b(this, i10, i11);
        }
        ArrayList arrayList = this.f43701k1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i0) this.f43701k1.get(size)).mo4096b(this, i10, i11);
            }
        }
        this.f2802F--;
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        f0 f0Var = this.f2824m;
        if (f0Var == null || this.f2833x) {
            return;
        }
        boolean zMo1305d = f0Var.mo1305d();
        boolean zMo1306e = this.f2824m.mo1306e();
        if (zMo1305d || zMo1306e) {
            if (!zMo1305d) {
                i10 = 0;
            }
            if (!zMo1306e) {
                i11 = 0;
            }
            m1338V(i10, i11, null);
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1327K()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2835z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(v0 v0Var) {
        this.f43706p1 = v0Var;
        c6.v0.m2528j(this, v0Var);
    }

    public void setAdapter(AbstractC8590y abstractC8590y) {
        setLayoutFrozen(false);
        AbstractC8590y abstractC8590y2 = this.f2823l;
        C7454y c7454y = this.f2813a;
        if (abstractC8590y2 != null) {
            abstractC8590y2.f41832a.unregisterObserver(c7454y);
            this.f2823l.getClass();
        }
        c0 c0Var = this.f2808M;
        if (c0Var != null) {
            c0Var.mo15839e();
        }
        f0 f0Var = this.f2824m;
        l0 l0Var = this.f2814b;
        if (f0Var != null) {
            f0Var.b0(l0Var);
            this.f2824m.c0(l0Var);
        }
        l0Var.f41704a.clear();
        l0Var.m15878d();
        xm.b0 b0Var = this.f2816d;
        b0Var.m15569o((ArrayList) b0Var.f40151e);
        b0Var.m15569o((ArrayList) b0Var.f40147a);
        AbstractC8590y abstractC8590y3 = this.f2823l;
        this.f2823l = abstractC8590y;
        if (abstractC8590y != null) {
            abstractC8590y.f41832a.registerObserver(c7454y);
        }
        AbstractC8590y abstractC8590y4 = this.f2823l;
        l0Var.f41704a.clear();
        l0Var.m15878d();
        k0 k0VarM15877c = l0Var.m15877c();
        if (abstractC8590y3 != null) {
            k0VarM15877c.f41697b--;
        }
        if (k0VarM15877c.f41697b == 0) {
            SparseArray sparseArray = k0VarM15877c.f41696a;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((j0) sparseArray.valueAt(i10)).f41687a.clear();
            }
        }
        if (abstractC8590y4 != null) {
            k0VarM15877c.f41697b++;
        }
        this.f43699i1.f41756f = true;
        this.f2800D |= false;
        this.f2799C = true;
        int iM14013x = this.f2817e.m14013x();
        for (int i11 = 0; i11 < iM14013x; i11++) {
            t0 t0VarM1313H = m1313H(this.f2817e.m14012w(i11));
            if (t0VarM1313H != null && !t0VarM1313H.m15930o()) {
                t0VarM1313H.m15916a(6);
            }
        }
        m1329M();
        l0 l0Var2 = this.f2814b;
        ArrayList arrayList = l0Var2.f41706c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            t0 t0Var = (t0) arrayList.get(i12);
            if (t0Var != null) {
                t0Var.m15916a(6);
                t0Var.m15916a(1024);
            }
        }
        AbstractC8590y abstractC8590y5 = l0Var2.f41711h.f2823l;
        if (abstractC8590y5 == null || !abstractC8590y5.f41833b) {
            l0Var2.m15878d();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(a0 a0Var) {
        if (a0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f2819g) {
            this.f2807L = null;
            this.f2805I = null;
            this.f2806K = null;
            this.f2804H = null;
        }
        this.f2819g = z6;
        super.setClipToPadding(z6);
        if (this.f2830t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(b0 b0Var) {
        b0Var.getClass();
        this.f2803G = b0Var;
        this.f2807L = null;
        this.f2805I = null;
        this.f2806K = null;
        this.f2804H = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.f2829s = z6;
    }

    public void setItemAnimator(c0 c0Var) {
        c0 c0Var2 = this.f2808M;
        if (c0Var2 != null) {
            c0Var2.mo15839e();
            this.f2808M.f41588a = null;
        }
        this.f2808M = c0Var;
        if (c0Var != null) {
            c0Var.f41588a = this.f43704n1;
        }
    }

    public void setItemViewCacheSize(int i10) {
        l0 l0Var = this.f2814b;
        l0Var.f41708e = i10;
        l0Var.m15885k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(f0 f0Var) {
        C8584s c8584s;
        if (f0Var == this.f2824m) {
            return;
        }
        setScrollState(0);
        s0 s0Var = this.f43695f1;
        s0Var.f41789g.removeCallbacks(s0Var);
        s0Var.f41785c.abortAnimation();
        f0 f0Var2 = this.f2824m;
        if (f0Var2 != null && (c8584s = f0Var2.f41623e) != null) {
            c8584s.m15899f();
        }
        f0 f0Var3 = this.f2824m;
        l0 l0Var = this.f2814b;
        if (f0Var3 != null) {
            c0 c0Var = this.f2808M;
            if (c0Var != null) {
                c0Var.mo15839e();
            }
            this.f2824m.b0(l0Var);
            this.f2824m.c0(l0Var);
            l0Var.f41704a.clear();
            l0Var.m15878d();
            if (this.f2828r) {
                f0 f0Var4 = this.f2824m;
                f0Var4.f41625g = false;
                f0Var4.mo1299M(this);
            }
            this.f2824m.o0(null);
            this.f2824m = null;
        } else {
            l0Var.f41704a.clear();
            l0Var.m15878d();
        }
        C7439j c7439j = this.f2817e;
        RecyclerView recyclerView = (RecyclerView) ((C7427b) c7439j.f35537b).f35231b;
        ((j2) c7439j.f35538c).m8463j();
        ArrayList arrayList = (ArrayList) c7439j.f35539d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t0 t0VarM1313H = m1313H((View) arrayList.get(size));
            if (t0VarM1313H != null) {
                int i10 = t0VarM1313H.f41807p;
                if (recyclerView.m1327K()) {
                    t0VarM1313H.f41808q = i10;
                    recyclerView.f43713v1.add(t0VarM1313H);
                } else {
                    View view = t0VarM1313H.f41792a;
                    Field field = c6.v0.f5527a;
                    view.setImportantForAccessibility(i10);
                }
                t0VarM1313H.f41807p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            m1313H(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2824m = f0Var;
        if (f0Var != null) {
            if (f0Var.f41620b != null) {
                throw new IllegalArgumentException("LayoutManager " + f0Var + " is already attached to a RecyclerView:" + f0Var.f41620b.m1361x());
            }
            f0Var.o0(this);
            if (this.f2828r) {
                this.f2824m.f41625g = true;
            }
        }
        l0Var.m15885k();
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
    public void setNestedScrollingEnabled(boolean z6) {
        C0889s scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f5514d) {
            ViewGroup viewGroup = scrollingChildHelper.f5513c;
            Field field = c6.v0.f5527a;
            c6.n0.m2462n(viewGroup);
        }
        scrollingChildHelper.f5514d = z6;
    }

    public void setOnFlingListener(h0 h0Var) {
        this.Z0 = h0Var;
    }

    @Deprecated
    public void setOnScrollListener(i0 i0Var) {
        this.f43700j1 = i0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f43694e1 = z6;
    }

    public void setRecycledViewPool(k0 k0Var) {
        l0 l0Var = this.f2814b;
        if (l0Var.f41710g != null) {
            r1.f41697b--;
        }
        l0Var.f41710g = k0Var;
        if (k0Var == null || l0Var.f41711h.getAdapter() == null) {
            return;
        }
        l0Var.f41710g.f41697b++;
    }

    public void setScrollState(int i10) {
        C8584s c8584s;
        if (i10 == this.f2809N) {
            return;
        }
        this.f2809N = i10;
        if (i10 != 2) {
            s0 s0Var = this.f43695f1;
            s0Var.f41789g.removeCallbacks(s0Var);
            s0Var.f41785c.abortAnimation();
            f0 f0Var = this.f2824m;
            if (f0Var != null && (c8584s = f0Var.f41623e) != null) {
                c8584s.m15899f();
            }
        }
        f0 f0Var2 = this.f2824m;
        if (f0Var2 != null) {
            f0Var2.a0(i10);
        }
        i0 i0Var = this.f43700j1;
        if (i0Var != null) {
            i0Var.mo4095a(this, i10);
        }
        ArrayList arrayList = this.f43701k1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((i0) this.f43701k1.get(size)).mo4095a(this, i10);
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 1) {
            this.Y0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.Y0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(r0 r0Var) {
        this.f2814b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().m2508g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m2509h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z6) {
        C8584s c8584s;
        if (z6 != this.f2833x) {
            m1346h("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.f2833x = false;
                if (this.f2832w && this.f2824m != null && this.f2823l != null) {
                    requestLayout();
                }
                this.f2832w = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0));
            this.f2833x = true;
            this.f2834y = true;
            setScrollState(0);
            s0 s0Var = this.f43695f1;
            s0Var.f41789g.removeCallbacks(s0Var);
            s0Var.f41785c.abortAnimation();
            f0 f0Var = this.f2824m;
            if (f0Var == null || (c8584s = f0Var.f41623e) == null) {
                return;
            }
            c8584s.m15899f();
        }
    }

    /* renamed from: t */
    public final void m1357t() {
        if (this.f2807L != null) {
            return;
        }
        this.f2803G.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2807L = edgeEffect;
        if (this.f2819g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: u */
    public final void m1358u() {
        if (this.f2804H != null) {
            return;
        }
        this.f2803G.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2804H = edgeEffect;
        if (this.f2819g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: v */
    public final void m1359v() {
        if (this.f2806K != null) {
            return;
        }
        this.f2803G.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2806K = edgeEffect;
        if (this.f2819g) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: w */
    public final void m1360w() {
        if (this.f2805I != null) {
            return;
        }
        this.f2803G.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2805I = edgeEffect;
        if (this.f2819g) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: x */
    public final String m1361x() {
        return " " + super.toString() + ", adapter:" + this.f2823l + ", layout:" + this.f2824m + ", context:" + getContext();
    }

    /* renamed from: y */
    public final void m1362y(q0 q0Var) {
        if (getScrollState() != 2) {
            q0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f43695f1.f41785c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        q0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* renamed from: z */
    public final View m1363z(View view) {
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

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        float fM2532a;
        AttributeSet attributeSet2;
        char c2;
        TypedArray typedArray;
        char c10;
        Context context2;
        Constructor constructor;
        super(context, attributeSet, i10);
        this.f2813a = new C7454y(this);
        this.f2814b = new l0(this);
        this.f2818f = new C0917l(24);
        this.f2820h = new Rect();
        this.f2821j = new Rect();
        this.f2822k = new RectF();
        this.f2825n = new ArrayList();
        this.f2826p = new ArrayList();
        this.f2831v = 0;
        this.f2799C = false;
        this.f2800D = false;
        this.f2801E = 0;
        this.f2802F = 0;
        this.f2803G = new b0();
        C8573h c8573h = new C8573h();
        Object[] objArr = null;
        c8573h.f41588a = null;
        c8573h.f41589b = new ArrayList();
        c8573h.f41590c = 120L;
        c8573h.f41591d = 120L;
        c8573h.f41592e = 250L;
        c8573h.f41593f = 250L;
        c8573h.f41644g = true;
        c8573h.f41645h = new ArrayList();
        c8573h.f41646i = new ArrayList();
        c8573h.f41647j = new ArrayList();
        c8573h.f41648k = new ArrayList();
        c8573h.f41649l = new ArrayList();
        c8573h.f41650m = new ArrayList();
        c8573h.f41651n = new ArrayList();
        c8573h.f41652o = new ArrayList();
        c8573h.f41653p = new ArrayList();
        c8573h.f41654q = new ArrayList();
        c8573h.f41655r = new ArrayList();
        this.f2808M = c8573h;
        this.f2809N = 0;
        this.f2810O = -1;
        this.f43692c1 = Float.MIN_VALUE;
        this.f43693d1 = Float.MIN_VALUE;
        this.f43694e1 = true;
        this.f43695f1 = new s0(this);
        this.f43698h1 = new C0558p(4);
        q0 q0Var = new q0();
        q0Var.f41751a = -1;
        q0Var.f41752b = 0;
        q0Var.f41753c = 0;
        q0Var.f41754d = 1;
        q0Var.f41755e = 0;
        q0Var.f41756f = false;
        q0Var.f41757g = false;
        q0Var.f41758h = false;
        q0Var.f41759i = false;
        q0Var.f41760j = false;
        q0Var.f41761k = false;
        this.f43699i1 = q0Var;
        this.f43702l1 = false;
        this.f43703m1 = false;
        C8589x c8589x = new C8589x(this);
        this.f43704n1 = c8589x;
        this.f43705o1 = false;
        this.f43707q1 = new int[2];
        this.f43709s1 = new int[2];
        this.f43711t1 = new int[2];
        this.f43712u1 = new int[2];
        this.f43713v1 = new ArrayList();
        this.f43714w1 = new RunnableC0683n(25, this);
        this.f43715x1 = new C8589x(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Y0 = viewConfiguration.getScaledTouchSlop();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            Method method = w0.f5534a;
            fM2532a = AbstractC0656a.m1904m(viewConfiguration);
        } else {
            fM2532a = w0.m2532a(viewConfiguration, context);
        }
        this.f43692c1 = fM2532a;
        this.f43693d1 = i11 >= 26 ? AbstractC0656a.m1905n(viewConfiguration) : w0.m2532a(viewConfiguration, context);
        this.f43690a1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f43691b1 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2808M.f41588a = c8589x;
        g1 g1Var = new g1(this);
        xm.b0 b0Var = new xm.b0();
        b0Var.f40150d = new C0602c(30);
        b0Var.f40151e = new ArrayList();
        b0Var.f40147a = new ArrayList();
        b0Var.f40148b = g1Var;
        b0Var.f40149c = new g1(b0Var);
        this.f2816d = b0Var;
        this.f2817e = new C7439j(new C7427b(13, this));
        Field field = c6.v0.f5527a;
        if ((i11 >= 26 ? p0.m2465a(this) : 0) == 0 && i11 >= 26) {
            p0.m2466b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2798B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new v0(this));
        int[] iArr = AbstractC8311a.f39860a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        if (i11 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2819g = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m1361x());
            }
            Resources resources = getContext().getResources();
            c10 = 2;
            attributeSet2 = attributeSet;
            typedArray = typedArrayObtainStyledAttributes;
            c2 = 3;
            context2 = context;
            new C8575j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.websoptimization.callyzerbiz.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.websoptimization.callyzerbiz.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.websoptimization.callyzerbiz.R.dimen.fastscroll_margin));
        } else {
            attributeSet2 = attributeSet;
            c2 = 3;
            typedArray = typedArrayObtainStyledAttributes;
            c10 = 2;
            context2 = context;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context2.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context2.getClassLoader()).asSubclass(f0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f43689z1);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c10] = Integer.valueOf(i10);
                        objArr2[c2] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e2);
                            throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Error creating LayoutManager " + str, e10);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((f0) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Class is not a LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Cannot access non-public constructor " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet2.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e15);
                }
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        int[] iArr2 = f43688y1;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i10, 0);
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context2, iArr2, attributeSet2, typedArrayObtainStyledAttributes2, i10, 0);
        }
        boolean z6 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z6);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        f0 f0Var = this.f2824m;
        if (f0Var != null) {
            return f0Var.mo1296t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1361x());
    }

    public void setRecyclerListener(m0 m0Var) {
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
    }
}
