package p001o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public abstract class of7 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f38275a;

    /* renamed from: b */
    public final int f38276b;

    /* renamed from: c */
    public final int f38277c;

    /* renamed from: d */
    public final View f38278d;

    /* renamed from: e */
    public Runnable f38279e;

    /* renamed from: f */
    public Runnable f38280f;

    /* renamed from: g */
    public boolean f38281g;

    /* renamed from: h */
    public int f38282h;

    /* renamed from: q */
    public final int[] f38283q = new int[2];

    /* renamed from: o.of7$a */
    public class RunnableC15791a implements Runnable {
        public RunnableC15791a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = of7.this.f38278d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: o.of7$b */
    public class RunnableC15792b implements Runnable {
        public RunnableC15792b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            of7.this.m42172e();
        }
    }

    public of7(View view) {
        this.f38278d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f38275a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f38276b = tapTimeout;
        this.f38277c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m42170h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    public final void m42171a() {
        Runnable runnable = this.f38280f;
        if (runnable != null) {
            this.f38278d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f38279e;
        if (runnable2 != null) {
            this.f38278d.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract brf mo3953b();

    /* renamed from: c */
    public abstract boolean mo3954c();

    /* renamed from: d */
    public boolean mo4170d() {
        brf brfVarMo3953b = mo3953b();
        if (brfVarMo3953b == null || !brfVarMo3953b.mo3986a()) {
            return true;
        }
        brfVarMo3953b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void m42172e() {
        m42171a();
        View view = this.f38278d;
        if (view.isEnabled() && !view.isLongClickable() && mo3954c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f38281g = true;
        }
    }

    /* renamed from: f */
    public final boolean m42173f(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        rz5 rz5Var;
        View view = this.f38278d;
        brf brfVarMo3953b = mo3953b();
        if (brfVarMo3953b == null || !brfVarMo3953b.mo3986a() || (rz5Var = (rz5) brfVarMo3953b.mo3992o()) == null || !rz5Var.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m42175i(view, motionEventObtainNoHistory);
        m42176j(rz5Var, motionEventObtainNoHistory);
        boolean zMo4324e = rz5Var.mo4324e(motionEventObtainNoHistory, this.f38282h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zMo4324e && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m42174g(MotionEvent motionEvent) {
        View view = this.f38278d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f38282h = motionEvent.getPointerId(0);
            if (this.f38279e == null) {
                this.f38279e = new RunnableC15791a();
            }
            view.postDelayed(this.f38279e, this.f38276b);
            if (this.f38280f == null) {
                this.f38280f = new RunnableC15792b();
            }
            view.postDelayed(this.f38280f, this.f38277c);
        } else if (actionMasked == 1) {
            m42171a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f38282h);
            if (iFindPointerIndex >= 0 && !m42170h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f38275a)) {
                m42171a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m42175i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f38283q);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean m42176j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f38283q);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f38281g;
        if (z2) {
            z = m42173f(motionEvent) || !mo4170d();
        } else {
            z = m42174g(motionEvent) && mo3954c();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f38278d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f38281g = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f38281g = false;
        this.f38282h = -1;
        Runnable runnable = this.f38279e;
        if (runnable != null) {
            this.f38278d.removeCallbacks(runnable);
        }
    }
}
