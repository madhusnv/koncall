package p001o;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public class p7d implements View.OnTouchListener, qbc, View.OnLayoutChangeListener {
    public static float k0 = 3.0f;
    public static float l0 = 1.75f;
    public static float m0 = 1.0f;
    public static int n0 = 200;

    /* renamed from: Q */
    public View.OnClickListener f39529Q;

    /* renamed from: X */
    public View.OnLongClickListener f39530X;

    /* renamed from: Y */
    public RunnableC16015e f39531Y;

    /* renamed from: h */
    public ImageView f39540h;
    public float h0;

    /* renamed from: q */
    public GestureDetector f39541q;

    /* renamed from: s */
    public ue4 f39542s;

    /* renamed from: a */
    public Interpolator f39533a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    public int f39534b = n0;

    /* renamed from: c */
    public float f39535c = m0;

    /* renamed from: d */
    public float f39536d = l0;

    /* renamed from: e */
    public float f39537e = k0;

    /* renamed from: f */
    public boolean f39538f = true;

    /* renamed from: g */
    public boolean f39539g = false;

    /* renamed from: x */
    public final Matrix f39543x = new Matrix();

    /* renamed from: y */
    public final Matrix f39544y = new Matrix();

    /* renamed from: H */
    public final Matrix f39526H = new Matrix();

    /* renamed from: L */
    public final RectF f39527L = new RectF();

    /* renamed from: M */
    public final float[] f39528M = new float[9];

    /* renamed from: Z */
    public int f39532Z = 2;
    public boolean i0 = true;
    public ImageView.ScaleType j0 = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: o.p7d$a */
    public class C16011a extends GestureDetector.SimpleOnGestureListener {
        public C16011a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            p7d.m43095i(p7d.this);
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (p7d.this.f39530X != null) {
                p7d.this.f39530X.onLongClick(p7d.this.f39540h);
            }
        }
    }

    /* renamed from: o.p7d$b */
    public class GestureDetectorOnDoubleTapListenerC16012b implements GestureDetector.OnDoubleTapListener {
        public GestureDetectorOnDoubleTapListenerC16012b() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fM43101A = p7d.this.m43101A();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (fM43101A < p7d.this.m43140y()) {
                    p7d p7dVar = p7d.this;
                    p7dVar.m43121U(p7dVar.m43140y(), x, y, true);
                } else if (fM43101A < p7d.this.m43140y() || fM43101A >= p7d.this.m43139x()) {
                    p7d p7dVar2 = p7d.this;
                    p7dVar2.m43121U(p7dVar2.m43141z(), x, y, true);
                } else {
                    p7d p7dVar3 = p7d.this;
                    p7dVar3.m43121U(p7dVar3.m43139x(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (p7d.this.f39529Q != null) {
                p7d.this.f39529Q.onClick(p7d.this.f39540h);
            }
            RectF rectFM43133r = p7d.this.m43133r();
            if (rectFM43133r == null) {
                return false;
            }
            if (!rectFM43133r.contains(motionEvent.getX(), motionEvent.getY())) {
                p7d.m43098l(p7d.this);
                return false;
            }
            rectFM43133r.width();
            rectFM43133r.height();
            p7d.m43097k(p7d.this);
            return true;
        }
    }

    /* renamed from: o.p7d$c */
    public static /* synthetic */ class C16013c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39547a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f39547a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39547a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39547a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39547a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: o.p7d$d */
    public class RunnableC16014d implements Runnable {

        /* renamed from: a */
        public final float f39548a;

        /* renamed from: b */
        public final float f39549b;

        /* renamed from: c */
        public final long f39550c = System.currentTimeMillis();

        /* renamed from: d */
        public final float f39551d;

        /* renamed from: e */
        public final float f39552e;

        public RunnableC16014d(float f, float f2, float f3, float f4) {
            this.f39548a = f3;
            this.f39549b = f4;
            this.f39551d = f;
            this.f39552e = f2;
        }

        /* renamed from: a */
        public final float m43142a() {
            return p7d.this.f39533a.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f39550c) * 1.0f) / p7d.this.f39534b));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fM43142a = m43142a();
            float f = this.f39551d;
            p7d.this.mo43128b((f + ((this.f39552e - f) * fM43142a)) / p7d.this.m43101A(), this.f39548a, this.f39549b);
            if (fM43142a < 1.0f) {
                wk3.m54659a(p7d.this.f39540h, this);
            }
        }
    }

    /* renamed from: o.p7d$e */
    public class RunnableC16015e implements Runnable {

        /* renamed from: a */
        public final OverScroller f39554a;

        /* renamed from: b */
        public int f39555b;

        /* renamed from: c */
        public int f39556c;

        public RunnableC16015e(Context context) {
            this.f39554a = new OverScroller(context);
        }

        /* renamed from: a */
        public void m43143a() {
            this.f39554a.forceFinished(true);
        }

        /* renamed from: b */
        public void m43144b(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFM43133r = p7d.this.m43133r();
            if (rectFM43133r == null) {
                return;
            }
            int iRound3 = Math.round(-rectFM43133r.left);
            float f = i;
            if (f < rectFM43133r.width()) {
                iRound = Math.round(rectFM43133r.width() - f);
                i5 = 0;
            } else {
                i5 = iRound3;
                iRound = i5;
            }
            int iRound4 = Math.round(-rectFM43133r.top);
            float f2 = i2;
            if (f2 < rectFM43133r.height()) {
                iRound2 = Math.round(rectFM43133r.height() - f2);
                i6 = 0;
            } else {
                i6 = iRound4;
                iRound2 = i6;
            }
            this.f39555b = iRound3;
            this.f39556c = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f39554a.fling(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f39554a.isFinished() && this.f39554a.computeScrollOffset()) {
                int currX = this.f39554a.getCurrX();
                int currY = this.f39554a.getCurrY();
                p7d.this.f39526H.postTranslate(this.f39555b - currX, this.f39556c - currY);
                p7d p7dVar = p7d.this;
                p7dVar.m43106F(p7dVar.m43135t());
                this.f39555b = currX;
                this.f39556c = currY;
                wk3.m54659a(p7d.this.f39540h, this);
            }
        }
    }

    public p7d(ImageView imageView) {
        this.f39540h = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.h0 = 0.0f;
        this.f39542s = new ue4(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C16011a());
        this.f39541q = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC16012b());
    }

    /* renamed from: i */
    public static /* synthetic */ hcc m43095i(p7d p7dVar) {
        p7dVar.getClass();
        return null;
    }

    /* renamed from: k */
    public static /* synthetic */ ybc m43097k(p7d p7dVar) {
        p7dVar.getClass();
        return null;
    }

    /* renamed from: l */
    public static /* synthetic */ wbc m43098l(p7d p7dVar) {
        p7dVar.getClass();
        return null;
    }

    /* renamed from: A */
    public float m43101A() {
        return (float) Math.sqrt(((float) Math.pow(m43103C(this.f39526H, 0), 2.0d)) + ((float) Math.pow(m43103C(this.f39526H, 3), 2.0d)));
    }

    /* renamed from: B */
    public ImageView.ScaleType m43102B() {
        return this.j0;
    }

    /* renamed from: C */
    public final float m43103C(Matrix matrix, int i) {
        matrix.getValues(this.f39528M);
        return this.f39528M[i];
    }

    /* renamed from: D */
    public final void m43104D() {
        this.f39526H.reset();
        m43118R(this.h0);
        m43106F(m43135t());
        m43132q();
    }

    /* renamed from: E */
    public void m43105E(boolean z) {
        this.f39538f = z;
    }

    /* renamed from: F */
    public final void m43106F(Matrix matrix) {
        this.f39540h.setImageMatrix(matrix);
    }

    /* renamed from: G */
    public void m43107G(float f) {
        vqi.m53293a(this.f39535c, this.f39536d, f);
        this.f39537e = f;
    }

    /* renamed from: H */
    public void m43108H(float f) {
        vqi.m53293a(this.f39535c, f, this.f39537e);
        this.f39536d = f;
    }

    /* renamed from: I */
    public void m43109I(float f) {
        vqi.m53293a(f, this.f39536d, this.f39537e);
        this.f39535c = f;
    }

    /* renamed from: J */
    public void m43110J(View.OnClickListener onClickListener) {
        this.f39529Q = onClickListener;
    }

    /* renamed from: K */
    public void m43111K(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f39541q.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: L */
    public void m43112L(View.OnLongClickListener onLongClickListener) {
        this.f39530X = onLongClickListener;
    }

    /* renamed from: M */
    public void m43113M(ubc ubcVar) {
    }

    /* renamed from: N */
    public void m43114N(wbc wbcVar) {
    }

    /* renamed from: O */
    public void m43115O(ybc ybcVar) {
    }

    /* renamed from: P */
    public void m43116P(fcc fccVar) {
    }

    /* renamed from: Q */
    public void m43117Q(hcc hccVar) {
    }

    /* renamed from: R */
    public void m43118R(float f) {
        this.f39526H.postRotate(f % 360.0f);
        m43131p();
    }

    /* renamed from: S */
    public void m43119S(float f) {
        this.f39526H.setRotate(f % 360.0f);
        m43131p();
    }

    /* renamed from: T */
    public void m43120T(float f) {
        m43122V(f, false);
    }

    /* renamed from: U */
    public void m43121U(float f, float f2, float f3, boolean z) {
        if (f < this.f39535c || f > this.f39537e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f39540h.post(new RunnableC16014d(m43101A(), f, f2, f3));
        } else {
            this.f39526H.setScale(f, f, f2, f3);
            m43131p();
        }
    }

    /* renamed from: V */
    public void m43122V(float f, boolean z) {
        m43121U(f, this.f39540h.getRight() / 2, this.f39540h.getBottom() / 2, z);
    }

    /* renamed from: W */
    public void m43123W(float f, float f2, float f3) {
        vqi.m53293a(f, f2, f3);
        this.f39535c = f;
        this.f39536d = f2;
        this.f39537e = f3;
    }

    /* renamed from: X */
    public void m43124X(ImageView.ScaleType scaleType) {
        if (!vqi.m53296d(scaleType) || scaleType == this.j0) {
            return;
        }
        this.j0 = scaleType;
        a0();
    }

    /* renamed from: Y */
    public void m43125Y(int i) {
        this.f39534b = i;
    }

    /* renamed from: Z */
    public void m43126Z(boolean z) {
        this.i0 = z;
        a0();
    }

    @Override // p001o.qbc
    /* renamed from: a */
    public void mo43127a(float f, float f2) {
        if (this.f39542s.m51395e()) {
            return;
        }
        this.f39526H.postTranslate(f, f2);
        m43131p();
        ViewParent parent = this.f39540h.getParent();
        if (!this.f39538f || this.f39542s.m51395e() || this.f39539g) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i = this.f39532Z;
        if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public void a0() {
        if (this.i0) {
            b0(this.f39540h.getDrawable());
        } else {
            m43104D();
        }
    }

    @Override // p001o.qbc
    /* renamed from: b */
    public void mo43128b(float f, float f2, float f3) {
        if (m43101A() < this.f39537e || f < 1.0f) {
            if (m43101A() > this.f39535c || f > 1.0f) {
                this.f39526H.postScale(f, f, f2, f3);
                m43131p();
            }
        }
    }

    public final void b0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fM43138w = m43138w(this.f39540h);
        float fM43137v = m43137v(this.f39540h);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f39543x.reset();
        float f = intrinsicWidth;
        float f2 = fM43138w / f;
        float f3 = intrinsicHeight;
        float f4 = fM43137v / f3;
        ImageView.ScaleType scaleType = this.j0;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f39543x.postTranslate((fM43138w - f) / 2.0f, (fM43137v - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            this.f39543x.postScale(fMax, fMax);
            this.f39543x.postTranslate((fM43138w - (f * fMax)) / 2.0f, (fM43137v - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            this.f39543x.postScale(fMin, fMin);
            this.f39543x.postTranslate((fM43138w - (f * fMin)) / 2.0f, (fM43137v - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, fM43138w, fM43137v);
            if (((int) this.h0) % Opcodes.GETFIELD != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C16013c.f39547a[this.j0.ordinal()];
            if (i == 1) {
                this.f39543x.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.f39543x.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.f39543x.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.f39543x.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        m43104D();
    }

    @Override // p001o.qbc
    /* renamed from: c */
    public void mo43129c(float f, float f2, float f3, float f4) {
        RunnableC16015e runnableC16015e = new RunnableC16015e(this.f39540h.getContext());
        this.f39531Y = runnableC16015e;
        runnableC16015e.m43144b(m43138w(this.f39540h), m43137v(this.f39540h), (int) f3, (int) f4);
        this.f39540h.post(this.f39531Y);
    }

    /* renamed from: o */
    public final void m43130o() {
        RunnableC16015e runnableC16015e = this.f39531Y;
        if (runnableC16015e != null) {
            runnableC16015e.m43143a();
            this.f39531Y = null;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        b0(this.f39540h.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ue4 ue4Var;
        boolean z2;
        GestureDetector gestureDetector;
        RectF rectFM43133r;
        boolean z3 = false;
        if (!this.i0 || !vqi.m53295c((ImageView) view)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && m43101A() < this.f39535c && (rectFM43133r = m43133r()) != null) {
                view.post(new RunnableC16014d(m43101A(), this.f39535c, rectFM43133r.centerX(), rectFM43133r.centerY()));
                z = true;
            }
            ue4Var = this.f39542s;
            if (ue4Var == null) {
                boolean zM51395e = ue4Var.m51395e();
                boolean zM51394d = this.f39542s.m51394d();
                boolean zM51396f = this.f39542s.m51396f(motionEvent);
                boolean z4 = (zM51395e || this.f39542s.m51395e()) ? false : true;
                boolean z5 = (zM51394d || this.f39542s.m51394d()) ? false : true;
                if (z4 && z5) {
                    z3 = true;
                }
                this.f39539g = z3;
                z2 = zM51396f;
            } else {
                z2 = z;
            }
            gestureDetector = this.f39541q;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        m43130o();
        z = false;
        ue4Var = this.f39542s;
        if (ue4Var == null) {
        }
        gestureDetector = this.f39541q;
        return gestureDetector == null ? z2 : z2;
    }

    /* renamed from: p */
    public final void m43131p() {
        if (m43132q()) {
            m43106F(m43135t());
        }
    }

    /* renamed from: q */
    public final boolean m43132q() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF rectFM43134s = m43134s(m43135t());
        if (rectFM43134s == null) {
            return false;
        }
        float fHeight = rectFM43134s.height();
        float fWidth = rectFM43134s.width();
        float fM43137v = m43137v(this.f39540h);
        float f6 = 0.0f;
        if (fHeight <= fM43137v) {
            int i = C16013c.f39547a[this.j0.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    fM43137v = (fM43137v - fHeight) / 2.0f;
                    f2 = rectFM43134s.top;
                } else {
                    fM43137v -= fHeight;
                    f2 = rectFM43134s.top;
                }
            } else {
                f = rectFM43134s.top;
                f3 = -f;
            }
        } else {
            f = rectFM43134s.top;
            if (f > 0.0f) {
                f3 = -f;
            } else {
                f2 = rectFM43134s.bottom;
                f3 = f2 < fM43137v ? fM43137v - f2 : 0.0f;
            }
        }
        float fM43138w = m43138w(this.f39540h);
        if (fWidth <= fM43138w) {
            int i2 = C16013c.f39547a[this.j0.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f4 = (fM43138w - fWidth) / 2.0f;
                    f5 = rectFM43134s.left;
                } else {
                    f4 = fM43138w - fWidth;
                    f5 = rectFM43134s.left;
                }
                f6 = f4 - f5;
            } else {
                f6 = -rectFM43134s.left;
            }
            this.f39532Z = 2;
        } else {
            float f7 = rectFM43134s.left;
            if (f7 > 0.0f) {
                this.f39532Z = 0;
                f6 = -f7;
            } else {
                float f8 = rectFM43134s.right;
                if (f8 < fM43138w) {
                    f6 = fM43138w - f8;
                    this.f39532Z = 1;
                } else {
                    this.f39532Z = -1;
                }
            }
        }
        this.f39526H.postTranslate(f6, f3);
        return true;
    }

    /* renamed from: r */
    public RectF m43133r() {
        m43132q();
        return m43134s(m43135t());
    }

    /* renamed from: s */
    public final RectF m43134s(Matrix matrix) {
        if (this.f39540h.getDrawable() == null) {
            return null;
        }
        this.f39527L.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f39527L);
        return this.f39527L;
    }

    /* renamed from: t */
    public final Matrix m43135t() {
        this.f39544y.set(this.f39543x);
        this.f39544y.postConcat(this.f39526H);
        return this.f39544y;
    }

    /* renamed from: u */
    public Matrix m43136u() {
        return this.f39544y;
    }

    /* renamed from: v */
    public final int m43137v(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: w */
    public final int m43138w(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: x */
    public float m43139x() {
        return this.f39537e;
    }

    /* renamed from: y */
    public float m43140y() {
        return this.f39536d;
    }

    /* renamed from: z */
    public float m43141z() {
        return this.f39535c;
    }
}
