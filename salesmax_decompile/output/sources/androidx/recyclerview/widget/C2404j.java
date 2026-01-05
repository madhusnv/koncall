package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p001o.i7e;
import p001o.no7;
import p001o.q49;
import p001o.wvi;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes2.dex */
public class C2404j extends RecyclerView.AbstractC2378o implements RecyclerView.InterfaceC2380q {

    /* renamed from: A */
    public f f10102A;

    /* renamed from: C */
    public Rect f10104C;

    /* renamed from: D */
    public long f10105D;

    /* renamed from: d */
    public float f10109d;

    /* renamed from: e */
    public float f10110e;

    /* renamed from: f */
    public float f10111f;

    /* renamed from: g */
    public float f10112g;

    /* renamed from: h */
    public float f10113h;

    /* renamed from: i */
    public float f10114i;

    /* renamed from: j */
    public float f10115j;

    /* renamed from: k */
    public float f10116k;

    /* renamed from: m */
    public e f10118m;

    /* renamed from: o */
    public int f10120o;

    /* renamed from: q */
    public int f10122q;

    /* renamed from: r */
    public RecyclerView f10123r;

    /* renamed from: t */
    public VelocityTracker f10125t;

    /* renamed from: u */
    public List f10126u;

    /* renamed from: v */
    public List f10127v;

    /* renamed from: z */
    public no7 f10131z;

    /* renamed from: a */
    public final List f10106a = new ArrayList();

    /* renamed from: b */
    public final float[] f10107b = new float[2];

    /* renamed from: c */
    public RecyclerView.d0 f10108c = null;

    /* renamed from: l */
    public int f10117l = -1;

    /* renamed from: n */
    public int f10119n = 0;

    /* renamed from: p */
    public List f10121p = new ArrayList();

    /* renamed from: s */
    public final Runnable f10124s = new a();

    /* renamed from: w */
    public RecyclerView.InterfaceC2374k f10128w = null;

    /* renamed from: x */
    public View f10129x = null;

    /* renamed from: y */
    public int f10130y = -1;

    /* renamed from: B */
    public final RecyclerView.InterfaceC2382s f10103B = new b();

    /* renamed from: androidx.recyclerview.widget.j$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2404j c2404j = C2404j.this;
            if (c2404j.f10108c == null || !c2404j.m9552E()) {
                return;
            }
            C2404j c2404j2 = C2404j.this;
            RecyclerView.d0 d0Var = c2404j2.f10108c;
            if (d0Var != null) {
                c2404j2.m9572z(d0Var);
            }
            C2404j c2404j3 = C2404j.this;
            c2404j3.f10123r.removeCallbacks(c2404j3.f10124s);
            wvi.e0(C2404j.this.f10123r, this);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    public class b implements RecyclerView.InterfaceC2382s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
        /* renamed from: a */
        public void mo728a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C2404j.this.f10131z.m40865a(motionEvent);
            VelocityTracker velocityTracker = C2404j.this.f10125t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C2404j.this.f10117l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(C2404j.this.f10117l);
            if (iFindPointerIndex >= 0) {
                C2404j.this.m9562o(actionMasked, motionEvent, iFindPointerIndex);
            }
            C2404j c2404j = C2404j.this;
            RecyclerView.d0 d0Var = c2404j.f10108c;
            if (d0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        c2404j.m9558K(motionEvent, c2404j.f10120o, iFindPointerIndex);
                        C2404j.this.m9572z(d0Var);
                        C2404j c2404j2 = C2404j.this;
                        c2404j2.f10123r.removeCallbacks(c2404j2.f10124s);
                        C2404j.this.f10124s.run();
                        C2404j.this.f10123r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    C2404j c2404j3 = C2404j.this;
                    if (pointerId == c2404j3.f10117l) {
                        c2404j3.f10117l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        C2404j c2404j4 = C2404j.this;
                        c2404j4.m9558K(motionEvent, c2404j4.f10120o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c2404j.f10125t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            C2404j.this.m9553F(null, 0);
            C2404j.this.f10117l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
        /* renamed from: c */
        public boolean mo729c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarM9566s;
            C2404j.this.f10131z.m40865a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C2404j.this.f10117l = motionEvent.getPointerId(0);
                C2404j.this.f10109d = motionEvent.getX();
                C2404j.this.f10110e = motionEvent.getY();
                C2404j.this.m9548A();
                C2404j c2404j = C2404j.this;
                if (c2404j.f10108c == null && (gVarM9566s = c2404j.m9566s(motionEvent)) != null) {
                    C2404j c2404j2 = C2404j.this;
                    c2404j2.f10109d -= gVarM9566s.f10154j;
                    c2404j2.f10110e -= gVarM9566s.f10155k;
                    c2404j2.m9565r(gVarM9566s.f10149e, true);
                    if (C2404j.this.f10106a.remove(gVarM9566s.f10149e.f9794a)) {
                        C2404j c2404j3 = C2404j.this;
                        c2404j3.f10118m.mo2682c(c2404j3.f10123r, gVarM9566s.f10149e);
                    }
                    C2404j.this.m9553F(gVarM9566s.f10149e, gVarM9566s.f10150f);
                    C2404j c2404j4 = C2404j.this;
                    c2404j4.m9558K(motionEvent, c2404j4.f10120o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C2404j c2404j5 = C2404j.this;
                c2404j5.f10117l = -1;
                c2404j5.m9553F(null, 0);
            } else {
                int i = C2404j.this.f10117l;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C2404j.this.m9562o(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C2404j.this.f10125t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return C2404j.this.f10108c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2382s
        /* renamed from: e */
        public void mo730e(boolean z) {
            if (z) {
                C2404j.this.m9553F(null, 0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    public class c extends g {

        /* renamed from: o */
        public final /* synthetic */ int f10134o;

        /* renamed from: p */
        public final /* synthetic */ RecyclerView.d0 f10135p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.d0 d0Var2) {
            super(d0Var, i, i2, f, f2, f3, f4);
            this.f10134o = i3;
            this.f10135p = d0Var2;
        }

        @Override // androidx.recyclerview.widget.C2404j.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f10156l) {
                return;
            }
            if (this.f10134o <= 0) {
                C2404j c2404j = C2404j.this;
                c2404j.f10118m.mo2682c(c2404j.f10123r, this.f10135p);
            } else {
                C2404j.this.f10106a.add(this.f10135p.f9794a);
                this.f10153i = true;
                int i = this.f10134o;
                if (i > 0) {
                    C2404j.this.m9549B(this, i);
                }
            }
            C2404j c2404j2 = C2404j.this;
            View view = c2404j2.f10129x;
            View view2 = this.f10135p.f9794a;
            if (view == view2) {
                c2404j2.m9551D(view2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ g f10137a;

        /* renamed from: b */
        public final /* synthetic */ int f10138b;

        public d(g gVar, int i) {
            this.f10137a = gVar;
            this.f10138b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = C2404j.this.f10123r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f10137a;
            if (gVar.f10156l || gVar.f10149e.m9146j() == -1) {
                return;
            }
            RecyclerView.AbstractC2376m itemAnimator = C2404j.this.f10123r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.m9214q(null)) && !C2404j.this.m9571x()) {
                C2404j.this.f10118m.mo2681B(this.f10137a.f10149e, this.f10138b);
            } else {
                C2404j.this.f10123r.post(this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$e */
    public static abstract class e {

        /* renamed from: b */
        public static final Interpolator f10140b = new a();

        /* renamed from: c */
        public static final Interpolator f10141c = new b();

        /* renamed from: a */
        public int f10142a = -1;

        /* renamed from: androidx.recyclerview.widget.j$e$a */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.j$e$b */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: e */
        public static int m9573e(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        /* renamed from: s */
        public static int m9574s(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: t */
        public static int m9575t(int i, int i2) {
            return m9574s(2, i) | m9574s(1, i2) | m9574s(0, i2 | i);
        }

        /* renamed from: A */
        public void mo2680A(RecyclerView.d0 d0Var, int i) {
            if (d0Var != null) {
                q49.f41288a.mo42964b(d0Var.f9794a);
            }
        }

        /* renamed from: B */
        public abstract void mo2681B(RecyclerView.d0 d0Var, int i);

        /* renamed from: a */
        public boolean m9576a(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            return true;
        }

        /* renamed from: b */
        public RecyclerView.d0 m9577b(RecyclerView.d0 d0Var, List list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = i + d0Var.f9794a.getWidth();
            int height = i2 + d0Var.f9794a.getHeight();
            int left2 = i - d0Var.f9794a.getLeft();
            int top2 = i2 - d0Var.f9794a.getTop();
            int size = list.size();
            RecyclerView.d0 d0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.d0 d0Var3 = (RecyclerView.d0) list.get(i4);
                if (left2 > 0 && (right = d0Var3.f9794a.getRight() - width) < 0 && d0Var3.f9794a.getRight() > d0Var.f9794a.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = d0Var3.f9794a.getLeft() - i) > 0 && d0Var3.f9794a.getLeft() < d0Var.f9794a.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = d0Var3.f9794a.getTop() - i2) > 0 && d0Var3.f9794a.getTop() < d0Var.f9794a.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = d0Var3.f9794a.getBottom() - height) < 0 && d0Var3.f9794a.getBottom() > d0Var.f9794a.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    d0Var2 = d0Var3;
                    i3 = iAbs;
                }
            }
            return d0Var2;
        }

        /* renamed from: c */
        public void mo2682c(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            q49.f41288a.mo42963a(d0Var.f9794a);
        }

        /* renamed from: d */
        public int mo9578d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: f */
        public final int m9579f(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return mo9578d(mo9584k(recyclerView, d0Var), wvi.m55139z(recyclerView));
        }

        /* renamed from: g */
        public long m9580g(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.AbstractC2376m itemAnimator = recyclerView.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200L : 250L : i == 8 ? itemAnimator.m9211n() : itemAnimator.m9212o();
        }

        /* renamed from: h */
        public int m9581h() {
            return 0;
        }

        /* renamed from: i */
        public final int m9582i(RecyclerView recyclerView) {
            if (this.f10142a == -1) {
                this.f10142a = recyclerView.getResources().getDimensionPixelSize(i7e.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f10142a;
        }

        /* renamed from: j */
        public float m9583j(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        /* renamed from: k */
        public abstract int mo9584k(RecyclerView recyclerView, RecyclerView.d0 d0Var);

        /* renamed from: l */
        public float m9585l(float f) {
            return f;
        }

        /* renamed from: m */
        public float m9586m(RecyclerView.d0 d0Var) {
            return 0.5f;
        }

        /* renamed from: n */
        public float m9587n(float f) {
            return f;
        }

        /* renamed from: o */
        public boolean m9588o(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return (m9579f(recyclerView, d0Var) & 16711680) != 0;
        }

        /* renamed from: p */
        public int m9589p(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int iSignum = (int) (((int) (((int) Math.signum(i2)) * m9582i(recyclerView) * f10141c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * f10140b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
            return iSignum == 0 ? i2 > 0 ? 1 : -1 : iSignum;
        }

        /* renamed from: q */
        public boolean m9590q() {
            return true;
        }

        /* renamed from: r */
        public boolean m9591r() {
            return true;
        }

        /* renamed from: u */
        public void mo9592u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            q49.f41288a.mo42965c(canvas, recyclerView, d0Var.f9794a, f, f2, i, z);
        }

        /* renamed from: v */
        public void m9593v(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
            q49.f41288a.mo42966d(canvas, recyclerView, d0Var.f9794a, f, f2, i, z);
        }

        /* renamed from: w */
        public void m9594w(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = (g) list.get(i2);
                gVar.m9602e();
                int iSave = canvas.save();
                mo9592u(canvas, recyclerView, gVar.f10149e, gVar.f10154j, gVar.f10155k, gVar.f10150f, false);
                canvas.restoreToCount(iSave);
            }
            if (d0Var != null) {
                int iSave2 = canvas.save();
                mo9592u(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        /* renamed from: x */
        public void m9595x(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, List list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = (g) list.get(i2);
                int iSave = canvas.save();
                m9593v(canvas, recyclerView, gVar.f10149e, gVar.f10154j, gVar.f10155k, gVar.f10150f, false);
                canvas.restoreToCount(iSave);
            }
            if (d0Var != null) {
                int iSave2 = canvas.save();
                m9593v(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                g gVar2 = (g) list.get(i3);
                boolean z2 = gVar2.f10157m;
                if (z2 && !gVar2.f10153i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: y */
        public abstract boolean mo2683y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: z */
        public void m9596z(RecyclerView recyclerView, RecyclerView.d0 d0Var, int i, RecyclerView.d0 d0Var2, int i2, int i3, int i4) {
            RecyclerView.AbstractC2379p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof i) {
                ((i) layoutManager).mo9035f(d0Var.f9794a, d0Var2.f9794a, i3, i4);
                return;
            }
            if (layoutManager.mo9027A()) {
                if (layoutManager.g0(d0Var2.f9794a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.s1(i2);
                }
                if (layoutManager.j0(d0Var2.f9794a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.s1(i2);
                }
            }
            if (layoutManager.mo9028B()) {
                if (layoutManager.k0(d0Var2.f9794a) <= recyclerView.getPaddingTop()) {
                    recyclerView.s1(i2);
                }
                if (layoutManager.e0(d0Var2.f9794a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.s1(i2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$f */
    public class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f10143a = true;

        public f() {
        }

        /* renamed from: a */
        public void m9597a() {
            this.f10143a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewM9567t;
            RecyclerView.d0 d0VarK0;
            if (!this.f10143a || (viewM9567t = C2404j.this.m9567t(motionEvent)) == null || (d0VarK0 = C2404j.this.f10123r.k0(viewM9567t)) == null) {
                return;
            }
            C2404j c2404j = C2404j.this;
            if (c2404j.f10118m.m9588o(c2404j.f10123r, d0VarK0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = C2404j.this.f10117l;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    C2404j c2404j2 = C2404j.this;
                    c2404j2.f10109d = x;
                    c2404j2.f10110e = y;
                    c2404j2.f10114i = 0.0f;
                    c2404j2.f10113h = 0.0f;
                    if (c2404j2.f10118m.m9591r()) {
                        C2404j.this.m9553F(d0VarK0, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$g */
    public static class g implements Animator.AnimatorListener {

        /* renamed from: a */
        public final float f10145a;

        /* renamed from: b */
        public final float f10146b;

        /* renamed from: c */
        public final float f10147c;

        /* renamed from: d */
        public final float f10148d;

        /* renamed from: e */
        public final RecyclerView.d0 f10149e;

        /* renamed from: f */
        public final int f10150f;

        /* renamed from: g */
        public final ValueAnimator f10151g;

        /* renamed from: h */
        public final int f10152h;

        /* renamed from: i */
        public boolean f10153i;

        /* renamed from: j */
        public float f10154j;

        /* renamed from: k */
        public float f10155k;

        /* renamed from: l */
        public boolean f10156l = false;

        /* renamed from: m */
        public boolean f10157m = false;

        /* renamed from: n */
        public float f10158n;

        /* renamed from: androidx.recyclerview.widget.j$g$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.m9600c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.d0 d0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f10150f = i2;
            this.f10152h = i;
            this.f10149e = d0Var;
            this.f10145a = f;
            this.f10146b = f2;
            this.f10147c = f3;
            this.f10148d = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10151g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(d0Var.f9794a);
            valueAnimatorOfFloat.addListener(this);
            m9600c(0.0f);
        }

        /* renamed from: a */
        public void m9598a() {
            this.f10151g.cancel();
        }

        /* renamed from: b */
        public void m9599b(long j) {
            this.f10151g.setDuration(j);
        }

        /* renamed from: c */
        public void m9600c(float f) {
            this.f10158n = f;
        }

        /* renamed from: d */
        public void m9601d() {
            this.f10149e.m9131I(false);
            this.f10151g.start();
        }

        /* renamed from: e */
        public void m9602e() {
            float f = this.f10145a;
            float f2 = this.f10147c;
            if (f == f2) {
                this.f10154j = this.f10149e.f9794a.getTranslationX();
            } else {
                this.f10154j = f + (this.f10158n * (f2 - f));
            }
            float f3 = this.f10146b;
            float f4 = this.f10148d;
            if (f3 == f4) {
                this.f10155k = this.f10149e.f9794a.getTranslationY();
            } else {
                this.f10155k = f3 + (this.f10158n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m9600c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f10157m) {
                this.f10149e.m9131I(true);
            }
            this.f10157m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$h */
    public static abstract class h extends e {

        /* renamed from: d */
        public int f10160d;

        /* renamed from: e */
        public int f10161e;

        public h(int i, int i2) {
            this.f10160d = i2;
            this.f10161e = i;
        }

        /* renamed from: C */
        public int m9603C(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.f10161e;
        }

        /* renamed from: D */
        public int m9604D(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return this.f10160d;
        }

        @Override // androidx.recyclerview.widget.C2404j.e
        /* renamed from: k */
        public int mo9584k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            return e.m9575t(m9603C(recyclerView, d0Var), m9604D(recyclerView, d0Var));
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$i */
    public interface i {
        /* renamed from: f */
        void mo9035f(View view, View view2, int i, int i2);
    }

    public C2404j(e eVar) {
        this.f10118m = eVar;
    }

    /* renamed from: y */
    public static boolean m9547y(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    /* renamed from: A */
    public void m9548A() {
        VelocityTracker velocityTracker = this.f10125t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f10125t = VelocityTracker.obtain();
    }

    /* renamed from: B */
    public void m9549B(g gVar, int i2) {
        this.f10123r.post(new d(gVar, i2));
    }

    /* renamed from: C */
    public final void m9550C() {
        VelocityTracker velocityTracker = this.f10125t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10125t = null;
        }
    }

    /* renamed from: D */
    public void m9551D(View view) {
        if (view == this.f10129x) {
            this.f10129x = null;
            if (this.f10128w != null) {
                this.f10123r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m9552E() {
        int iM9589p;
        int iM9589p2;
        int i2;
        int width;
        if (this.f10108c == null) {
            this.f10105D = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f10105D;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        RecyclerView.AbstractC2379p layoutManager = this.f10123r.getLayoutManager();
        if (this.f10104C == null) {
            this.f10104C = new Rect();
        }
        layoutManager.m9250z(this.f10108c.f9794a, this.f10104C);
        if (layoutManager.mo9027A()) {
            int i3 = (int) (this.f10115j + this.f10113h);
            int paddingLeft = (i3 - this.f10104C.left) - this.f10123r.getPaddingLeft();
            float f2 = this.f10113h;
            iM9589p = (f2 >= 0.0f || paddingLeft >= 0) ? (f2 <= 0.0f || (width = ((i3 + this.f10108c.f9794a.getWidth()) + this.f10104C.right) - (this.f10123r.getWidth() - this.f10123r.getPaddingRight())) <= 0) ? 0 : width : paddingLeft;
        }
        if (layoutManager.mo9028B()) {
            int i4 = (int) (this.f10116k + this.f10114i);
            int paddingTop = (i4 - this.f10104C.top) - this.f10123r.getPaddingTop();
            float f3 = this.f10114i;
            if (f3 < 0.0f && paddingTop < 0) {
                iM9589p2 = paddingTop;
            } else if (f3 <= 0.0f || (iM9589p2 = ((i4 + this.f10108c.f9794a.getHeight()) + this.f10104C.bottom) - (this.f10123r.getHeight() - this.f10123r.getPaddingBottom())) <= 0) {
                iM9589p2 = 0;
            }
        }
        if (iM9589p != 0) {
            iM9589p = this.f10118m.m9589p(this.f10123r, this.f10108c.f9794a.getWidth(), iM9589p, this.f10123r.getWidth(), j2);
        }
        int i5 = iM9589p;
        if (iM9589p2 != 0) {
            i2 = i5;
            iM9589p2 = this.f10118m.m9589p(this.f10123r, this.f10108c.f9794a.getHeight(), iM9589p2, this.f10123r.getHeight(), j2);
        } else {
            i2 = i5;
        }
        if (i2 == 0 && iM9589p2 == 0) {
            this.f10105D = Long.MIN_VALUE;
            return false;
        }
        if (this.f10105D == Long.MIN_VALUE) {
            this.f10105D = jCurrentTimeMillis;
        }
        this.f10123r.scrollBy(i2, iM9589p2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m9553F(RecyclerView.d0 d0Var, int i2) {
        boolean z;
        boolean z2;
        float fSignum;
        float fSignum2;
        if (d0Var == this.f10108c && i2 == this.f10119n) {
            return;
        }
        this.f10105D = Long.MIN_VALUE;
        int i3 = this.f10119n;
        m9565r(d0Var, true);
        this.f10119n = i2;
        if (i2 == 2) {
            if (d0Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f10129x = d0Var.f9794a;
            m9559l();
        }
        int i4 = (1 << ((i2 * 8) + 8)) - 1;
        RecyclerView.d0 d0Var2 = this.f10108c;
        if (d0Var2 != null) {
            if (d0Var2.f9794a.getParent() != null) {
                int iM9557J = i3 == 2 ? 0 : m9557J(d0Var2);
                m9550C();
                if (iM9557J == 1 || iM9557J == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f10114i) * this.f10123r.getHeight();
                } else if (iM9557J == 4 || iM9557J == 8 || iM9557J == 16 || iM9557J == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f10113h) * this.f10123r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                int i5 = i3 == 2 ? 8 : iM9557J > 0 ? 2 : 4;
                m9570w(this.f10107b);
                float[] fArr = this.f10107b;
                float f2 = fArr[0];
                float f3 = fArr[1];
                c cVar = new c(d0Var2, i5, i3, f2, f3, fSignum, fSignum2, iM9557J, d0Var2);
                cVar.m9599b(this.f10118m.m9580g(this.f10123r, i5, fSignum - f2, fSignum2 - f3));
                this.f10121p.add(cVar);
                cVar.m9601d();
                z = true;
            } else {
                m9551D(d0Var2.f9794a);
                this.f10118m.mo2682c(this.f10123r, d0Var2);
                z = false;
            }
            this.f10108c = null;
        } else {
            z = false;
        }
        if (d0Var != null) {
            this.f10120o = (this.f10118m.m9579f(this.f10123r, d0Var) & i4) >> (this.f10119n * 8);
            this.f10115j = d0Var.f9794a.getLeft();
            this.f10116k = d0Var.f9794a.getTop();
            this.f10108c = d0Var;
            if (i2 == 2) {
                z2 = false;
                d0Var.f9794a.performHapticFeedback(0);
            } else {
                z2 = false;
            }
        }
        ViewParent parent = this.f10123r.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.f10108c != null ? true : z2);
        }
        if (!z) {
            this.f10123r.getLayoutManager().H1();
        }
        this.f10118m.mo2680A(this.f10108c, this.f10119n);
        this.f10123r.invalidate();
    }

    /* renamed from: G */
    public final void m9554G() {
        this.f10122q = ViewConfiguration.get(this.f10123r.getContext()).getScaledTouchSlop();
        this.f10123r.m9086h(this);
        this.f10123r.m9089k(this.f10103B);
        this.f10123r.m9088j(this);
        m9555H();
    }

    /* renamed from: H */
    public final void m9555H() {
        this.f10102A = new f();
        this.f10131z = new no7(this.f10123r.getContext(), this.f10102A);
    }

    /* renamed from: I */
    public final void m9556I() {
        f fVar = this.f10102A;
        if (fVar != null) {
            fVar.m9597a();
            this.f10102A = null;
        }
        if (this.f10131z != null) {
            this.f10131z = null;
        }
    }

    /* renamed from: J */
    public final int m9557J(RecyclerView.d0 d0Var) {
        if (this.f10119n == 2) {
            return 0;
        }
        int iMo9584k = this.f10118m.mo9584k(this.f10123r, d0Var);
        int iMo9578d = (this.f10118m.mo9578d(iMo9584k, wvi.m55139z(this.f10123r)) & 65280) >> 8;
        if (iMo9578d == 0) {
            return 0;
        }
        int i2 = (iMo9584k & 65280) >> 8;
        if (Math.abs(this.f10113h) > Math.abs(this.f10114i)) {
            int iM9561n = m9561n(d0Var, iMo9578d);
            if (iM9561n > 0) {
                return (i2 & iM9561n) == 0 ? e.m9573e(iM9561n, wvi.m55139z(this.f10123r)) : iM9561n;
            }
            int iM9563p = m9563p(d0Var, iMo9578d);
            if (iM9563p > 0) {
                return iM9563p;
            }
        } else {
            int iM9563p2 = m9563p(d0Var, iMo9578d);
            if (iM9563p2 > 0) {
                return iM9563p2;
            }
            int iM9561n2 = m9561n(d0Var, iMo9578d);
            if (iM9561n2 > 0) {
                return (i2 & iM9561n2) == 0 ? e.m9573e(iM9561n2, wvi.m55139z(this.f10123r)) : iM9561n2;
            }
        }
        return 0;
    }

    /* renamed from: K */
    public void m9558K(MotionEvent motionEvent, int i2, int i3) {
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.f10109d;
        this.f10113h = f2;
        this.f10114i = y - this.f10110e;
        if ((i2 & 4) == 0) {
            this.f10113h = Math.max(0.0f, f2);
        }
        if ((i2 & 8) == 0) {
            this.f10113h = Math.min(0.0f, this.f10113h);
        }
        if ((i2 & 1) == 0) {
            this.f10114i = Math.max(0.0f, this.f10114i);
        }
        if ((i2 & 2) == 0) {
            this.f10114i = Math.min(0.0f, this.f10114i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2380q
    /* renamed from: b */
    public void mo9257b(View view) {
        m9551D(view);
        RecyclerView.d0 d0VarK0 = this.f10123r.k0(view);
        if (d0VarK0 == null) {
            return;
        }
        RecyclerView.d0 d0Var = this.f10108c;
        if (d0Var != null && d0VarK0 == d0Var) {
            m9553F(null, 0);
            return;
        }
        m9565r(d0VarK0, false);
        if (this.f10106a.remove(d0VarK0.f9794a)) {
            this.f10118m.mo2682c(this.f10123r, d0VarK0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC2380q
    /* renamed from: d */
    public void mo9258d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
    /* renamed from: g */
    public void mo9226g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
    /* renamed from: i */
    public void mo9228i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
        float f2;
        float f3;
        this.f10130y = -1;
        if (this.f10108c != null) {
            m9570w(this.f10107b);
            float[] fArr = this.f10107b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f10118m.m9594w(canvas, recyclerView, this.f10108c, this.f10121p, this.f10119n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2378o
    /* renamed from: k */
    public void mo9230k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C2389z c2389z) {
        float f2;
        float f3;
        if (this.f10108c != null) {
            m9570w(this.f10107b);
            float[] fArr = this.f10107b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f10118m.m9595x(canvas, recyclerView, this.f10108c, this.f10121p, this.f10119n, f2, f3);
    }

    /* renamed from: l */
    public final void m9559l() {
    }

    /* renamed from: m */
    public void m9560m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10123r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m9564q();
        }
        this.f10123r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f10111f = resources.getDimension(i7e.item_touch_helper_swipe_escape_velocity);
            this.f10112g = resources.getDimension(i7e.item_touch_helper_swipe_escape_max_velocity);
            m9554G();
        }
    }

    /* renamed from: n */
    public final int m9561n(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 12) == 0) {
            return 0;
        }
        int i3 = this.f10113h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f10125t;
        if (velocityTracker != null && this.f10117l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f10118m.m9587n(this.f10112g));
            float xVelocity = this.f10125t.getXVelocity(this.f10117l);
            float yVelocity = this.f10125t.getYVelocity(this.f10117l);
            int i4 = xVelocity <= 0.0f ? 4 : 8;
            float fAbs = Math.abs(xVelocity);
            if ((i4 & i2) != 0 && i3 == i4 && fAbs >= this.f10118m.m9585l(this.f10111f) && fAbs > Math.abs(yVelocity)) {
                return i4;
            }
        }
        float width = this.f10123r.getWidth() * this.f10118m.m9586m(d0Var);
        if ((i2 & i3) == 0 || Math.abs(this.f10113h) <= width) {
            return 0;
        }
        return i3;
    }

    /* renamed from: o */
    public void m9562o(int i2, MotionEvent motionEvent, int i3) {
        RecyclerView.d0 d0VarM9569v;
        int iM9579f;
        if (this.f10108c != null || i2 != 2 || this.f10119n == 2 || !this.f10118m.m9590q() || this.f10123r.getScrollState() == 1 || (d0VarM9569v = m9569v(motionEvent)) == null || (iM9579f = (this.f10118m.m9579f(this.f10123r, d0VarM9569v) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i3);
        float y = motionEvent.getY(i3);
        float f2 = x - this.f10109d;
        float f3 = y - this.f10110e;
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        int i4 = this.f10122q;
        if (fAbs >= i4 || fAbs2 >= i4) {
            if (fAbs > fAbs2) {
                if (f2 < 0.0f && (iM9579f & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iM9579f & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iM9579f & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iM9579f & 2) == 0) {
                    return;
                }
            }
            this.f10114i = 0.0f;
            this.f10113h = 0.0f;
            this.f10117l = motionEvent.getPointerId(0);
            m9553F(d0VarM9569v, 1);
        }
    }

    /* renamed from: p */
    public final int m9563p(RecyclerView.d0 d0Var, int i2) {
        if ((i2 & 3) == 0) {
            return 0;
        }
        int i3 = this.f10114i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f10125t;
        if (velocityTracker != null && this.f10117l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f10118m.m9587n(this.f10112g));
            float xVelocity = this.f10125t.getXVelocity(this.f10117l);
            float yVelocity = this.f10125t.getYVelocity(this.f10117l);
            int i4 = yVelocity <= 0.0f ? 1 : 2;
            float fAbs = Math.abs(yVelocity);
            if ((i4 & i2) != 0 && i4 == i3 && fAbs >= this.f10118m.m9585l(this.f10111f) && fAbs > Math.abs(xVelocity)) {
                return i4;
            }
        }
        float height = this.f10123r.getHeight() * this.f10118m.m9586m(d0Var);
        if ((i2 & i3) == 0 || Math.abs(this.f10114i) <= height) {
            return 0;
        }
        return i3;
    }

    /* renamed from: q */
    public final void m9564q() {
        this.f10123r.g1(this);
        this.f10123r.i1(this.f10103B);
        this.f10123r.h1(this);
        for (int size = this.f10121p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10121p.get(0);
            gVar.m9598a();
            this.f10118m.mo2682c(this.f10123r, gVar.f10149e);
        }
        this.f10121p.clear();
        this.f10129x = null;
        this.f10130y = -1;
        m9550C();
        m9556I();
    }

    /* renamed from: r */
    public void m9565r(RecyclerView.d0 d0Var, boolean z) {
        for (int size = this.f10121p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10121p.get(size);
            if (gVar.f10149e == d0Var) {
                gVar.f10156l |= z;
                if (!gVar.f10157m) {
                    gVar.m9598a();
                }
                this.f10121p.remove(size);
                return;
            }
        }
    }

    /* renamed from: s */
    public g m9566s(MotionEvent motionEvent) {
        if (this.f10121p.isEmpty()) {
            return null;
        }
        View viewM9567t = m9567t(motionEvent);
        for (int size = this.f10121p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10121p.get(size);
            if (gVar.f10149e.f9794a == viewM9567t) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    public View m9567t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.d0 d0Var = this.f10108c;
        if (d0Var != null) {
            View view = d0Var.f9794a;
            if (m9547y(view, x, y, this.f10115j + this.f10113h, this.f10116k + this.f10114i)) {
                return view;
            }
        }
        for (int size = this.f10121p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f10121p.get(size);
            View view2 = gVar.f10149e.f9794a;
            if (m9547y(view2, x, y, gVar.f10154j, gVar.f10155k)) {
                return view2;
            }
        }
        return this.f10123r.m9079V(x, y);
    }

    /* renamed from: u */
    public final List m9568u(RecyclerView.d0 d0Var) {
        RecyclerView.d0 d0Var2 = d0Var;
        List list = this.f10126u;
        if (list == null) {
            this.f10126u = new ArrayList();
            this.f10127v = new ArrayList();
        } else {
            list.clear();
            this.f10127v.clear();
        }
        int iM9581h = this.f10118m.m9581h();
        int iRound = Math.round(this.f10115j + this.f10113h) - iM9581h;
        int iRound2 = Math.round(this.f10116k + this.f10114i) - iM9581h;
        int i2 = iM9581h * 2;
        int width = d0Var2.f9794a.getWidth() + iRound + i2;
        int height = d0Var2.f9794a.getHeight() + iRound2 + i2;
        int i3 = (iRound + width) / 2;
        int i4 = (iRound2 + height) / 2;
        RecyclerView.AbstractC2379p layoutManager = this.f10123r.getLayoutManager();
        int iM9241Z = layoutManager.m9241Z();
        int i5 = 0;
        while (i5 < iM9241Z) {
            View viewM9240Y = layoutManager.m9240Y(i5);
            if (viewM9240Y != d0Var2.f9794a && viewM9240Y.getBottom() >= iRound2 && viewM9240Y.getTop() <= height && viewM9240Y.getRight() >= iRound && viewM9240Y.getLeft() <= width) {
                RecyclerView.d0 d0VarK0 = this.f10123r.k0(viewM9240Y);
                if (this.f10118m.m9576a(this.f10123r, this.f10108c, d0VarK0)) {
                    int iAbs = Math.abs(i3 - ((viewM9240Y.getLeft() + viewM9240Y.getRight()) / 2));
                    int iAbs2 = Math.abs(i4 - ((viewM9240Y.getTop() + viewM9240Y.getBottom()) / 2));
                    int i6 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f10126u.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size && i6 > ((Integer) this.f10127v.get(i8)).intValue(); i8++) {
                        i7++;
                    }
                    this.f10126u.add(i7, d0VarK0);
                    this.f10127v.add(i7, Integer.valueOf(i6));
                }
            }
            i5++;
            d0Var2 = d0Var;
        }
        return this.f10126u;
    }

    /* renamed from: v */
    public final RecyclerView.d0 m9569v(MotionEvent motionEvent) {
        View viewM9567t;
        RecyclerView.AbstractC2379p layoutManager = this.f10123r.getLayoutManager();
        int i2 = this.f10117l;
        if (i2 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
        float x = motionEvent.getX(iFindPointerIndex) - this.f10109d;
        float y = motionEvent.getY(iFindPointerIndex) - this.f10110e;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        int i3 = this.f10122q;
        if (fAbs < i3 && fAbs2 < i3) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.mo9027A()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.mo9028B()) && (viewM9567t = m9567t(motionEvent)) != null) {
            return this.f10123r.k0(viewM9567t);
        }
        return null;
    }

    /* renamed from: w */
    public final void m9570w(float[] fArr) {
        if ((this.f10120o & 12) != 0) {
            fArr[0] = (this.f10115j + this.f10113h) - this.f10108c.f9794a.getLeft();
        } else {
            fArr[0] = this.f10108c.f9794a.getTranslationX();
        }
        if ((this.f10120o & 3) != 0) {
            fArr[1] = (this.f10116k + this.f10114i) - this.f10108c.f9794a.getTop();
        } else {
            fArr[1] = this.f10108c.f9794a.getTranslationY();
        }
    }

    /* renamed from: x */
    public boolean m9571x() {
        int size = this.f10121p.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((g) this.f10121p.get(i2)).f10157m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void m9572z(RecyclerView.d0 d0Var) {
        if (!this.f10123r.isLayoutRequested() && this.f10119n == 2) {
            float fM9583j = this.f10118m.m9583j(d0Var);
            int i2 = (int) (this.f10115j + this.f10113h);
            int i3 = (int) (this.f10116k + this.f10114i);
            if (Math.abs(i3 - d0Var.f9794a.getTop()) >= d0Var.f9794a.getHeight() * fM9583j || Math.abs(i2 - d0Var.f9794a.getLeft()) >= d0Var.f9794a.getWidth() * fM9583j) {
                List listM9568u = m9568u(d0Var);
                if (listM9568u.size() == 0) {
                    return;
                }
                RecyclerView.d0 d0VarM9577b = this.f10118m.m9577b(d0Var, listM9568u, i2, i3);
                if (d0VarM9577b == null) {
                    this.f10126u.clear();
                    this.f10127v.clear();
                    return;
                }
                int iM9146j = d0VarM9577b.m9146j();
                int iM9146j2 = d0Var.m9146j();
                if (this.f10118m.mo2683y(this.f10123r, d0Var, d0VarM9577b)) {
                    this.f10118m.m9596z(this.f10123r, d0Var, iM9146j2, d0VarM9577b, iM9146j, i2, i3);
                }
            }
        }
    }
}
