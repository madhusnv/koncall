package p001o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.gms.cast.MediaError;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class fwi {

    /* renamed from: x */
    public static final Interpolator f24207x = new InterpolatorC13586a();

    /* renamed from: a */
    public int f24208a;

    /* renamed from: b */
    public int f24209b;

    /* renamed from: d */
    public float[] f24211d;

    /* renamed from: e */
    public float[] f24212e;

    /* renamed from: f */
    public float[] f24213f;

    /* renamed from: g */
    public float[] f24214g;

    /* renamed from: h */
    public int[] f24215h;

    /* renamed from: i */
    public int[] f24216i;

    /* renamed from: j */
    public int[] f24217j;

    /* renamed from: k */
    public int f24218k;

    /* renamed from: l */
    public VelocityTracker f24219l;

    /* renamed from: m */
    public float f24220m;

    /* renamed from: n */
    public float f24221n;

    /* renamed from: o */
    public int f24222o;

    /* renamed from: p */
    public final int f24223p;

    /* renamed from: q */
    public int f24224q;

    /* renamed from: r */
    public OverScroller f24225r;

    /* renamed from: s */
    public final AbstractC13588c f24226s;

    /* renamed from: t */
    public View f24227t;

    /* renamed from: u */
    public boolean f24228u;

    /* renamed from: v */
    public final ViewGroup f24229v;

    /* renamed from: c */
    public int f24210c = -1;

    /* renamed from: w */
    public final Runnable f24230w = new RunnableC13587b();

    /* renamed from: o.fwi$a */
    public class InterpolatorC13586a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: o.fwi$b */
    public class RunnableC13587b implements Runnable {
        public RunnableC13587b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            fwi.this.m27677L(0);
        }
    }

    /* renamed from: o.fwi$c */
    public static abstract class AbstractC13588c {
        public abstract int clampViewPositionHorizontal(View view, int i, int i2);

        public abstract int clampViewPositionVertical(View view, int i, int i2);

        public int getOrderedChildIndex(int i) {
            return i;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public void onEdgeDragStarted(int i, int i2) {
        }

        public boolean onEdgeLock(int i) {
            return false;
        }

        public void onEdgeTouched(int i, int i2) {
        }

        public void onViewCaptured(View view, int i) {
        }

        public void onViewDragStateChanged(int i) {
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        }

        public abstract void onViewReleased(View view, float f, float f2);

        public abstract boolean tryCaptureView(View view, int i);
    }

    public fwi(Context context, ViewGroup viewGroup, AbstractC13588c abstractC13588c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC13588c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f24229v = viewGroup;
        this.f24226s = abstractC13588c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f24223p = i;
        this.f24222o = i;
        this.f24209b = viewConfiguration.getScaledTouchSlop();
        this.f24220m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f24221n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f24225r = new OverScroller(context, f24207x);
    }

    /* renamed from: o */
    public static fwi m27664o(ViewGroup viewGroup, float f, AbstractC13588c abstractC13588c) {
        fwi fwiVarM27665p = m27665p(viewGroup, abstractC13588c);
        fwiVarM27665p.f24209b = (int) (fwiVarM27665p.f24209b * (1.0f / f));
        return fwiVarM27665p;
    }

    /* renamed from: p */
    public static fwi m27665p(ViewGroup viewGroup, AbstractC13588c abstractC13588c) {
        return new fwi(viewGroup.getContext(), viewGroup, abstractC13588c);
    }

    /* renamed from: A */
    public int m27666A() {
        return this.f24209b;
    }

    /* renamed from: B */
    public int m27667B() {
        return this.f24208a;
    }

    /* renamed from: C */
    public boolean m27668C(int i, int i2) {
        return m27671F(this.f24227t, i, i2);
    }

    /* renamed from: D */
    public boolean m27669D(int i) {
        return ((1 << i) & this.f24218k) != 0;
    }

    /* renamed from: E */
    public final boolean m27670E(int i) {
        if (m27669D(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: F */
    public boolean m27671F(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: G */
    public void m27672G(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m27686b();
        }
        if (this.f24219l == null) {
            this.f24219l = VelocityTracker.obtain();
        }
        this.f24219l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM27703u = m27703u((int) x, (int) y);
            m27675J(x, y, pointerId);
            m27684S(viewM27703u, pointerId);
            int i3 = this.f24215h[pointerId];
            int i4 = this.f24224q;
            if ((i3 & i4) != 0) {
                this.f24226s.onEdgeTouched(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f24208a == 1) {
                m27673H();
            }
            m27686b();
            return;
        }
        if (actionMasked == 2) {
            if (this.f24208a == 1) {
                if (m27670E(this.f24210c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f24210c);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f24213f;
                    int i5 = this.f24210c;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f24214g[i5]);
                    m27701s(this.f24227t.getLeft() + i6, this.f24227t.getTop() + i7, i6, i7);
                    m27676K(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (m27670E(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f24211d[pointerId2];
                    float f2 = y3 - this.f24212e[pointerId2];
                    m27674I(f, f2, pointerId2);
                    if (this.f24208a != 1) {
                        View viewM27703u2 = m27703u((int) x3, (int) y3);
                        if (m27691g(viewM27703u2, f, f2) && m27684S(viewM27703u2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m27676K(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f24208a == 1) {
                m27699q(0.0f, 0.0f);
            }
            m27686b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            m27675J(x4, y4, pointerId3);
            if (this.f24208a != 0) {
                if (m27668C((int) x4, (int) y4)) {
                    m27684S(this.f24227t, pointerId3);
                    return;
                }
                return;
            } else {
                m27684S(m27703u((int) x4, (int) y4), pointerId3);
                int i8 = this.f24215h[pointerId3];
                int i9 = this.f24224q;
                if ((i8 & i9) != 0) {
                    this.f24226s.onEdgeTouched(i8 & i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f24208a == 1 && pointerId4 == this.f24210c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f24210c) {
                    View viewM27703u3 = m27703u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f24227t;
                    if (viewM27703u3 == view && m27684S(view, pointerId5)) {
                        i = this.f24210c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                m27673H();
            }
        }
        m27695k(pointerId4);
    }

    /* renamed from: H */
    public final void m27673H() {
        this.f24219l.computeCurrentVelocity(1000, this.f24220m);
        m27699q(m27692h(this.f24219l.getXVelocity(this.f24210c), this.f24221n, this.f24220m), m27692h(this.f24219l.getYVelocity(this.f24210c), this.f24221n, this.f24220m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.fwi$c] */
    /* renamed from: I */
    public final void m27674I(float f, float f2, int i) {
        boolean zM27688d = m27688d(f, f2, i, 1);
        boolean z = zM27688d;
        if (m27688d(f2, f, i, 4)) {
            z = (zM27688d ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (m27688d(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (m27688d(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.f24216i;
            iArr[i] = iArr[i] | r0;
            this.f24226s.onEdgeDragStarted(r0, i);
        }
    }

    /* renamed from: J */
    public final void m27675J(float f, float f2, int i) {
        m27702t(i);
        float[] fArr = this.f24211d;
        this.f24213f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f24212e;
        this.f24214g[i] = f2;
        fArr2[i] = f2;
        this.f24215h[i] = m27708z((int) f, (int) f2);
        this.f24218k |= 1 << i;
    }

    /* renamed from: K */
    public final void m27676K(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m27670E(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f24213f[pointerId] = x;
                this.f24214g[pointerId] = y;
            }
        }
    }

    /* renamed from: L */
    public void m27677L(int i) {
        this.f24229v.removeCallbacks(this.f24230w);
        if (this.f24208a != i) {
            this.f24208a = i;
            this.f24226s.onViewDragStateChanged(i);
            if (this.f24208a == 0) {
                this.f24227t = null;
            }
        }
    }

    /* renamed from: M */
    public void m27678M(int i) {
        this.f24222o = i;
    }

    /* renamed from: N */
    public void m27679N(int i) {
        this.f24224q = i;
    }

    /* renamed from: O */
    public void m27680O(float f) {
        this.f24221n = f;
    }

    /* renamed from: P */
    public boolean m27681P(int i, int i2) {
        if (this.f24228u) {
            return m27704v(i, i2, (int) this.f24219l.getXVelocity(this.f24210c), (int) this.f24219l.getYVelocity(this.f24210c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m27682Q(MotionEvent motionEvent) {
        boolean z;
        View viewM27703u;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m27686b();
        }
        if (this.f24219l == null) {
            this.f24219l = VelocityTracker.obtain();
        }
        this.f24219l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            z = false;
            int pointerId = motionEvent.getPointerId(0);
            m27675J(x, y, pointerId);
            View viewM27703u2 = m27703u((int) x, (int) y);
            if (viewM27703u2 == this.f24227t && this.f24208a == 2) {
                m27684S(viewM27703u2, pointerId);
            }
            int i = this.f24215h[pointerId];
            int i2 = this.f24224q;
            if ((i & i2) != 0) {
                this.f24226s.onEdgeTouched(i & i2, pointerId);
            }
        } else if (actionMasked == 1) {
            m27686b();
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x2 = motionEvent.getX(actionIndex);
                        float y2 = motionEvent.getY(actionIndex);
                        m27675J(x2, y2, pointerId2);
                        int i3 = this.f24208a;
                        if (i3 == 0) {
                            int i4 = this.f24215h[pointerId2];
                            int i5 = this.f24224q;
                            if ((i4 & i5) != 0) {
                                this.f24226s.onEdgeTouched(i4 & i5, pointerId2);
                            }
                        } else if (i3 == 2 && (viewM27703u = m27703u((int) x2, (int) y2)) == this.f24227t) {
                            m27684S(viewM27703u, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        m27695k(motionEvent.getPointerId(actionIndex));
                    }
                }
            } else if (this.f24211d != null && this.f24212e != null) {
                int pointerCount = motionEvent.getPointerCount();
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    int pointerId3 = motionEvent.getPointerId(i6);
                    if (m27670E(pointerId3)) {
                        float x3 = motionEvent.getX(i6);
                        float y3 = motionEvent.getY(i6);
                        float f = x3 - this.f24211d[pointerId3];
                        float f2 = y3 - this.f24212e[pointerId3];
                        View viewM27703u3 = m27703u((int) x3, (int) y3);
                        boolean z2 = viewM27703u3 != null && m27691g(viewM27703u3, f, f2);
                        if (z2) {
                            int left = viewM27703u3.getLeft();
                            int i7 = (int) f;
                            int iClampViewPositionHorizontal = this.f24226s.clampViewPositionHorizontal(viewM27703u3, left + i7, i7);
                            int top = viewM27703u3.getTop();
                            int i8 = (int) f2;
                            int iClampViewPositionVertical = this.f24226s.clampViewPositionVertical(viewM27703u3, top + i8, i8);
                            int viewHorizontalDragRange = this.f24226s.getViewHorizontalDragRange(viewM27703u3);
                            int viewVerticalDragRange = this.f24226s.getViewVerticalDragRange(viewM27703u3);
                            if ((viewHorizontalDragRange == 0 || (viewHorizontalDragRange > 0 && iClampViewPositionHorizontal == left)) && (viewVerticalDragRange == 0 || (viewVerticalDragRange > 0 && iClampViewPositionVertical == top))) {
                                break;
                            }
                            m27674I(f, f2, pointerId3);
                            if (this.f24208a == 1 || (z2 && m27684S(viewM27703u3, pointerId3))) {
                                break;
                            }
                        }
                    }
                }
                m27676K(motionEvent);
            }
            z = false;
        }
        if (this.f24208a == 1) {
            return true;
        }
        return z;
    }

    /* renamed from: R */
    public boolean m27683R(View view, int i, int i2) {
        this.f24227t = view;
        this.f24210c = -1;
        boolean zM27704v = m27704v(i, i2, 0, 0);
        if (!zM27704v && this.f24208a == 0 && this.f24227t != null) {
            this.f24227t = null;
        }
        return zM27704v;
    }

    /* renamed from: S */
    public boolean m27684S(View view, int i) {
        if (view == this.f24227t && this.f24210c == i) {
            return true;
        }
        if (view == null || !this.f24226s.tryCaptureView(view, i)) {
            return false;
        }
        this.f24210c = i;
        m27687c(view, i);
        return true;
    }

    /* renamed from: a */
    public void m27685a() {
        m27686b();
        if (this.f24208a == 2) {
            int currX = this.f24225r.getCurrX();
            int currY = this.f24225r.getCurrY();
            this.f24225r.abortAnimation();
            int currX2 = this.f24225r.getCurrX();
            int currY2 = this.f24225r.getCurrY();
            this.f24226s.onViewPositionChanged(this.f24227t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        m27677L(0);
    }

    /* renamed from: b */
    public void m27686b() {
        this.f24210c = -1;
        m27694j();
        VelocityTracker velocityTracker = this.f24219l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f24219l = null;
        }
    }

    /* renamed from: c */
    public void m27687c(View view, int i) {
        if (view.getParent() == this.f24229v) {
            this.f24227t = view;
            this.f24210c = i;
            this.f24226s.onViewCaptured(view, i);
            m27677L(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f24229v + ")");
    }

    /* renamed from: d */
    public final boolean m27688d(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f24215h[i] & i2) != i2 || (this.f24224q & i2) == 0 || (this.f24217j[i] & i2) == i2 || (this.f24216i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f24209b;
        if (fAbs <= i3 && fAbs2 <= i3) {
            return false;
        }
        if (fAbs >= fAbs2 * 0.5f || !this.f24226s.onEdgeLock(i2)) {
            return (this.f24216i[i] & i2) == 0 && fAbs > ((float) this.f24209b);
        }
        int[] iArr = this.f24217j;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: e */
    public boolean m27689e(int i) {
        int length = this.f24211d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (m27690f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean m27690f(int i, int i2) {
        if (!m27669D(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f24213f[i2] - this.f24211d[i2];
        float f2 = this.f24214g[i2] - this.f24212e[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f24209b) : z2 && Math.abs(f2) > ((float) this.f24209b);
        }
        float f3 = (f * f) + (f2 * f2);
        int i3 = this.f24209b;
        return f3 > ((float) (i3 * i3));
    }

    /* renamed from: g */
    public final boolean m27691g(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f24226s.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.f24226s.getViewVerticalDragRange(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f24209b) : z2 && Math.abs(f2) > ((float) this.f24209b);
        }
        float f3 = (f * f) + (f2 * f2);
        int i = this.f24209b;
        return f3 > ((float) (i * i));
    }

    /* renamed from: h */
    public final float m27692h(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        return fAbs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: i */
    public final int m27693i(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: j */
    public final void m27694j() {
        float[] fArr = this.f24211d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f24212e, 0.0f);
        Arrays.fill(this.f24213f, 0.0f);
        Arrays.fill(this.f24214g, 0.0f);
        Arrays.fill(this.f24215h, 0);
        Arrays.fill(this.f24216i, 0);
        Arrays.fill(this.f24217j, 0);
        this.f24218k = 0;
    }

    /* renamed from: k */
    public final void m27695k(int i) {
        if (this.f24211d == null || !m27669D(i)) {
            return;
        }
        this.f24211d[i] = 0.0f;
        this.f24212e[i] = 0.0f;
        this.f24213f[i] = 0.0f;
        this.f24214g[i] = 0.0f;
        this.f24215h[i] = 0;
        this.f24216i[i] = 0;
        this.f24217j[i] = 0;
        this.f24218k = (~(1 << i)) & this.f24218k;
    }

    /* renamed from: l */
    public final int m27696l(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f24229v.getWidth();
        float f = width / 2;
        float fM27700r = f + (m27700r(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fM27700r / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), MediaError.DetailedErrorCode.TEXT_UNKNOWN);
    }

    /* renamed from: m */
    public final int m27697m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iM27693i = m27693i(i3, (int) this.f24221n, (int) this.f24220m);
        int iM27693i2 = m27693i(i4, (int) this.f24221n, (int) this.f24220m);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iM27693i);
        int iAbs4 = Math.abs(iM27693i2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iM27693i != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iM27693i2 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((m27696l(i, iM27693i, this.f24226s.getViewHorizontalDragRange(view)) * f5) + (m27696l(i2, iM27693i2, this.f24226s.getViewVerticalDragRange(view)) * (f3 / f4)));
    }

    /* renamed from: n */
    public boolean m27698n(boolean z) {
        if (this.f24208a == 2) {
            boolean zComputeScrollOffset = this.f24225r.computeScrollOffset();
            int currX = this.f24225r.getCurrX();
            int currY = this.f24225r.getCurrY();
            int left = currX - this.f24227t.getLeft();
            int top = currY - this.f24227t.getTop();
            if (left != 0) {
                wvi.m55110W(this.f24227t, left);
            }
            if (top != 0) {
                wvi.m55111X(this.f24227t, top);
            }
            if (left != 0 || top != 0) {
                this.f24226s.onViewPositionChanged(this.f24227t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f24225r.getFinalX() && currY == this.f24225r.getFinalY()) {
                this.f24225r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f24229v.post(this.f24230w);
                } else {
                    m27677L(0);
                }
            }
        }
        return this.f24208a == 2;
    }

    /* renamed from: q */
    public final void m27699q(float f, float f2) {
        this.f24228u = true;
        this.f24226s.onViewReleased(this.f24227t, f, f2);
        this.f24228u = false;
        if (this.f24208a == 1) {
            m27677L(0);
        }
    }

    /* renamed from: r */
    public final float m27700r(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    /* renamed from: s */
    public final void m27701s(int i, int i2, int i3, int i4) {
        int left = this.f24227t.getLeft();
        int top = this.f24227t.getTop();
        if (i3 != 0) {
            i = this.f24226s.clampViewPositionHorizontal(this.f24227t, i, i3);
            wvi.m55110W(this.f24227t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f24226s.clampViewPositionVertical(this.f24227t, i2, i4);
            wvi.m55111X(this.f24227t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f24226s.onViewPositionChanged(this.f24227t, i5, i6, i5 - left, i6 - top);
    }

    /* renamed from: t */
    public final void m27702t(int i) {
        float[] fArr = this.f24211d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f24212e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f24213f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f24214g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f24215h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f24216i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f24217j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f24211d = fArr2;
            this.f24212e = fArr3;
            this.f24213f = fArr4;
            this.f24214g = fArr5;
            this.f24215h = iArr;
            this.f24216i = iArr2;
            this.f24217j = iArr3;
        }
    }

    /* renamed from: u */
    public View m27703u(int i, int i2) {
        for (int childCount = this.f24229v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f24229v.getChildAt(this.f24226s.getOrderedChildIndex(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public final boolean m27704v(int i, int i2, int i3, int i4) {
        int left = this.f24227t.getLeft();
        int top = this.f24227t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f24225r.abortAnimation();
            m27677L(0);
            return false;
        }
        this.f24225r.startScroll(left, top, i5, i6, m27697m(this.f24227t, i5, i6, i3, i4));
        m27677L(2);
        return true;
    }

    /* renamed from: w */
    public View m27705w() {
        return this.f24227t;
    }

    /* renamed from: x */
    public int m27706x() {
        return this.f24223p;
    }

    /* renamed from: y */
    public int m27707y() {
        return this.f24222o;
    }

    /* renamed from: z */
    public final int m27708z(int i, int i2) {
        int i3 = i < this.f24229v.getLeft() + this.f24222o ? 1 : 0;
        if (i2 < this.f24229v.getTop() + this.f24222o) {
            i3 |= 4;
        }
        if (i > this.f24229v.getRight() - this.f24222o) {
            i3 |= 2;
        }
        return i2 > this.f24229v.getBottom() - this.f24222o ? i3 | 8 : i3;
    }
}
