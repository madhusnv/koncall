package ai.salesmax.ui.component;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public class TouchImageView extends AppCompatImageView implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: H */
    public float f518H;

    /* renamed from: L */
    public float f519L;

    /* renamed from: M */
    public float f520M;

    /* renamed from: Q */
    public int f521Q;

    /* renamed from: d */
    public Matrix f522d;

    /* renamed from: e */
    public int f523e;

    /* renamed from: f */
    public PointF f524f;

    /* renamed from: g */
    public PointF f525g;

    /* renamed from: h */
    public float f526h;
    public int h0;
    public ScaleGestureDetector i0;
    public Context j0;
    public GestureDetector k0;

    /* renamed from: q */
    public float f527q;

    /* renamed from: s */
    public float[] f528s;

    /* renamed from: x */
    public int f529x;

    /* renamed from: y */
    public int f530y;

    /* renamed from: ai.salesmax.ui.component.TouchImageView$a */
    public class ViewOnTouchListenerC0319a implements View.OnTouchListener {
        public ViewOnTouchListenerC0319a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            TouchImageView.this.i0.onTouchEvent(motionEvent);
            TouchImageView.this.k0.onTouchEvent(motionEvent);
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            if (action == 0) {
                TouchImageView.this.f524f.set(pointF);
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.f525g.set(touchImageView.f524f);
                TouchImageView.this.f523e = 1;
            } else if (action == 1) {
                TouchImageView touchImageView2 = TouchImageView.this;
                touchImageView2.f523e = 0;
                int iAbs = (int) Math.abs(pointF.x - touchImageView2.f525g.x);
                int iAbs2 = (int) Math.abs(pointF.y - TouchImageView.this.f525g.y);
                if (iAbs < 3 && iAbs2 < 3) {
                    TouchImageView.this.performClick();
                }
            } else if (action == 2) {
                TouchImageView touchImageView3 = TouchImageView.this;
                if (touchImageView3.f523e == 1) {
                    float f = pointF.x;
                    PointF pointF2 = touchImageView3.f524f;
                    float f2 = f - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    float fM793d = touchImageView3.m793d(f2, touchImageView3.f529x, touchImageView3.f519L * touchImageView3.f518H);
                    TouchImageView touchImageView4 = TouchImageView.this;
                    TouchImageView.this.f522d.postTranslate(fM793d, touchImageView4.m793d(f3, touchImageView4.f530y, touchImageView4.f520M * touchImageView4.f518H));
                    TouchImageView.this.m792c();
                    TouchImageView.this.f524f.set(pointF.x, pointF.y);
                }
            } else if (action == 6) {
                TouchImageView.this.f523e = 0;
            }
            TouchImageView touchImageView5 = TouchImageView.this;
            touchImageView5.setImageMatrix(touchImageView5.f522d);
            TouchImageView.this.invalidate();
            return true;
        }
    }

    /* renamed from: ai.salesmax.ui.component.TouchImageView$b */
    public class C0320b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float f;
            float f2;
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            TouchImageView touchImageView = TouchImageView.this;
            float f3 = touchImageView.f518H;
            float f4 = f3 * scaleFactor;
            touchImageView.f518H = f4;
            float f5 = touchImageView.f527q;
            if (f4 <= f5) {
                f5 = touchImageView.f526h;
                if (f4 < f5) {
                    touchImageView.f518H = f5;
                }
                f = touchImageView.f519L;
                f2 = touchImageView.f518H;
                if (f * f2 > touchImageView.f529x || touchImageView.f520M * f2 <= touchImageView.f530y) {
                    touchImageView.f522d.postScale(scaleFactor, scaleFactor, r4 / 2, touchImageView.f530y / 2);
                } else {
                    touchImageView.f522d.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                }
                TouchImageView.this.m792c();
                return true;
            }
            touchImageView.f518H = f5;
            scaleFactor = f5 / f3;
            f = touchImageView.f519L;
            f2 = touchImageView.f518H;
            if (f * f2 > touchImageView.f529x) {
                touchImageView.f522d.postScale(scaleFactor, scaleFactor, r4 / 2, touchImageView.f530y / 2);
            }
            TouchImageView.this.m792c();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            TouchImageView.this.f523e = 2;
            return true;
        }

        public C0320b() {
        }
    }

    public TouchImageView(Context context) {
        super(context);
        this.f523e = 0;
        this.f524f = new PointF();
        this.f525g = new PointF();
        this.f526h = 1.0f;
        this.f527q = 3.0f;
        this.f518H = 1.0f;
        m795f(context);
    }

    /* renamed from: c */
    public void m792c() {
        this.f522d.getValues(this.f528s);
        float[] fArr = this.f528s;
        float f = fArr[2];
        float f2 = fArr[5];
        float fM794e = m794e(f, this.f529x, this.f519L * this.f518H);
        float fM794e2 = m794e(f2, this.f530y, this.f520M * this.f518H);
        if (fM794e == 0.0f && fM794e2 == 0.0f) {
            return;
        }
        this.f522d.postTranslate(fM794e, fM794e2);
    }

    /* renamed from: d */
    public float m793d(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: e */
    public float m794e(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f5 = f2 - f3;
            f4 = 0.0f;
        } else {
            f4 = f2 - f3;
            f5 = 0.0f;
        }
        if (f < f4) {
            return (-f) + f4;
        }
        if (f > f5) {
            return (-f) + f5;
        }
        return 0.0f;
    }

    /* renamed from: f */
    public final void m795f(Context context) {
        super.setClickable(true);
        this.j0 = context;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.k0 = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        this.i0 = new ScaleGestureDetector(context, new C0320b());
        Matrix matrix = new Matrix();
        this.f522d = matrix;
        this.f528s = new float[9];
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(new ViewOnTouchListenerC0319a());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        float f = this.f518H;
        float f2 = this.f527q;
        if (f == f2) {
            f2 = this.f526h;
            this.f518H = f2;
        } else {
            this.f518H = f2;
        }
        float f3 = f2 / f;
        this.f522d.postScale(f3, f3, this.f529x / 2, this.f530y / 2);
        m792c();
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f529x = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f530y = size;
        int i3 = this.h0;
        int i4 = this.f529x;
        if ((i3 == i4 && i3 == size) || i4 == 0 || size == 0) {
            return;
        }
        this.h0 = size;
        this.f521Q = i4;
        if (this.f518H == 1.0f) {
            Drawable drawable = getDrawable();
            if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
                return;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("bmWidth: ");
            sb.append(intrinsicWidth);
            sb.append(" bmHeight : ");
            sb.append(intrinsicHeight);
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            float fMin = Math.min(this.f529x / f, this.f530y / f2);
            this.f522d.setScale(fMin, fMin);
            float f3 = (this.f530y - (f2 * fMin)) / 2.0f;
            float f4 = (this.f529x - (fMin * f)) / 2.0f;
            this.f522d.postTranslate(f4, f3);
            this.f519L = this.f529x - (f4 * 2.0f);
            this.f520M = this.f530y - (f3 * 2.0f);
            setImageMatrix(this.f522d);
        }
        m792c();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void setMaxZoom(float f) {
        this.f527q = f;
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f523e = 0;
        this.f524f = new PointF();
        this.f525g = new PointF();
        this.f526h = 1.0f;
        this.f527q = 3.0f;
        this.f518H = 1.0f;
        m795f(context);
    }
}
