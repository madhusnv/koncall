package p001o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes5.dex */
public class ue4 {

    /* renamed from: a */
    public int f48754a = -1;

    /* renamed from: b */
    public int f48755b = 0;

    /* renamed from: c */
    public final ScaleGestureDetector f48756c;

    /* renamed from: d */
    public VelocityTracker f48757d;

    /* renamed from: e */
    public boolean f48758e;

    /* renamed from: f */
    public float f48759f;

    /* renamed from: g */
    public float f48760g;

    /* renamed from: h */
    public final float f48761h;

    /* renamed from: i */
    public final float f48762i;

    /* renamed from: j */
    public qbc f48763j;

    /* renamed from: o.ue4$a */
    public class ScaleGestureDetectorOnScaleGestureListenerC17356a implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetectorOnScaleGestureListenerC17356a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            ue4.this.f48763j.mo43128b(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public ue4(Context context, qbc qbcVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f48762i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f48761h = viewConfiguration.getScaledTouchSlop();
        this.f48763j = qbcVar;
        this.f48756c = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC17356a());
    }

    /* renamed from: b */
    public final float m51392b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f48755b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    public final float m51393c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f48755b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* renamed from: d */
    public boolean m51394d() {
        return this.f48758e;
    }

    /* renamed from: e */
    public boolean m51395e() {
        return this.f48756c.isInProgress();
    }

    /* renamed from: f */
    public boolean m51396f(MotionEvent motionEvent) {
        try {
            this.f48756c.onTouchEvent(motionEvent);
            return m51397g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean m51397g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & Constants.MAX_HOST_LENGTH;
        if (action == 0) {
            this.f48754a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f48757d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            this.f48759f = m51392b(motionEvent);
            this.f48760g = m51393c(motionEvent);
            this.f48758e = false;
        } else if (action == 1) {
            this.f48754a = -1;
            if (this.f48758e && this.f48757d != null) {
                this.f48759f = m51392b(motionEvent);
                this.f48760g = m51393c(motionEvent);
                this.f48757d.addMovement(motionEvent);
                this.f48757d.computeCurrentVelocity(1000);
                float xVelocity = this.f48757d.getXVelocity();
                float yVelocity = this.f48757d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f48762i) {
                    this.f48763j.mo43129c(this.f48759f, this.f48760g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f48757d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f48757d = null;
            }
        } else if (action == 2) {
            float fM51392b = m51392b(motionEvent);
            float fM51393c = m51393c(motionEvent);
            float f = fM51392b - this.f48759f;
            float f2 = fM51393c - this.f48760g;
            if (!this.f48758e) {
                this.f48758e = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.f48761h);
            }
            if (this.f48758e) {
                this.f48763j.mo43127a(f, f2);
                this.f48759f = fM51392b;
                this.f48760g = fM51393c;
                VelocityTracker velocityTracker2 = this.f48757d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f48754a = -1;
            VelocityTracker velocityTracker3 = this.f48757d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f48757d = null;
            }
        } else if (action == 6) {
            int iM53294b = vqi.m53294b(motionEvent.getAction());
            if (motionEvent.getPointerId(iM53294b) == this.f48754a) {
                int i = iM53294b == 0 ? 1 : 0;
                this.f48754a = motionEvent.getPointerId(i);
                this.f48759f = motionEvent.getX(i);
                this.f48760g = motionEvent.getY(i);
            }
        }
        int i2 = this.f48754a;
        this.f48755b = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        return true;
    }
}
