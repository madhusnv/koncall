package com.ortiz.touchview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import p001o.ibe;
import p001o.ic8;
import p001o.icc;
import p001o.id5;
import p001o.jcc;
import p001o.kfj;
import p001o.mcc;
import p001o.sq8;
import p001o.y17;

/* loaded from: classes6.dex */
public class TouchImageView extends AppCompatImageView {
    public static final C11882b E0 = new C11882b(null);
    public ScaleGestureDetector A0;
    public GestureDetector B0;
    public GestureDetector.OnDoubleTapListener C0;
    public View.OnTouchListener D0;

    /* renamed from: H */
    public float f13538H;

    /* renamed from: L */
    public float f13539L;

    /* renamed from: M */
    public boolean f13540M;

    /* renamed from: Q */
    public float f13541Q;

    /* renamed from: d */
    public float f13542d;

    /* renamed from: e */
    public Matrix f13543e;

    /* renamed from: f */
    public Matrix f13544f;

    /* renamed from: g */
    public boolean f13545g;

    /* renamed from: h */
    public boolean f13546h;
    public float h0;
    public float i0;
    public float j0;
    public float[] k0;
    public float l0;
    public RunnableC11885e m0;
    public int n0;
    public ImageView.ScaleType o0;
    public boolean p0;

    /* renamed from: q */
    public y17 f13547q;
    public boolean q0;
    public kfj r0;

    /* renamed from: s */
    public y17 f13548s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public float w0;

    /* renamed from: x */
    public boolean f13549x;
    public float x0;

    /* renamed from: y */
    public ic8 f13550y;
    public float y0;
    public float z0;

    /* renamed from: com.ortiz.touchview.TouchImageView$a */
    public final class RunnableC11881a implements Runnable {

        /* renamed from: a */
        public final int f13551a;

        /* renamed from: b */
        public final long f13552b;

        /* renamed from: c */
        public final float f13553c;

        /* renamed from: d */
        public final float f13554d;

        /* renamed from: e */
        public final PointF f13555e;

        /* renamed from: f */
        public final PointF f13556f;

        /* renamed from: g */
        public final LinearInterpolator f13557g;

        /* renamed from: h */
        public final /* synthetic */ TouchImageView f13558h;

        public RunnableC11881a(TouchImageView touchImageView, float f, PointF pointF, int i) {
            sq8.m48649h(pointF, "focus");
            this.f13558h = touchImageView;
            this.f13557g = new LinearInterpolator();
            touchImageView.setState(ic8.ANIMATE_ZOOM);
            this.f13552b = System.currentTimeMillis();
            this.f13553c = touchImageView.getCurrentZoom();
            this.f13554d = f;
            this.f13551a = i;
            this.f13555e = touchImageView.getScrollPosition();
            this.f13556f = pointF;
        }

        /* renamed from: a */
        public final float m15949a() {
            return this.f13557g.getInterpolation(Math.min(1.0f, (System.currentTimeMillis() - this.f13552b) / this.f13551a));
        }

        /* renamed from: b */
        public final void m15950b(mcc mccVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fM15949a = m15949a();
            float f = this.f13553c;
            float f2 = f + ((this.f13554d - f) * fM15949a);
            PointF pointF = this.f13555e;
            float f3 = pointF.x;
            PointF pointF2 = this.f13556f;
            float f4 = f3 + ((pointF2.x - f3) * fM15949a);
            float f5 = pointF.y;
            this.f13558h.setZoom(f2, f4, f5 + ((pointF2.y - f5) * fM15949a));
            if (fM15949a < 1.0f) {
                this.f13558h.m15931B(this);
            } else {
                this.f13558h.setState(ic8.NONE);
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$b */
    public static final class C11882b {
        public C11882b() {
        }

        public /* synthetic */ C11882b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$c */
    public final class C11883c {

        /* renamed from: a */
        public OverScroller f13559a;

        public C11883c(Context context) {
            this.f13559a = new OverScroller(context);
        }

        /* renamed from: a */
        public final boolean m15951a() {
            this.f13559a.computeScrollOffset();
            return this.f13559a.computeScrollOffset();
        }

        /* renamed from: b */
        public final void m15952b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f13559a.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        /* renamed from: c */
        public final void m15953c(boolean z) {
            this.f13559a.forceFinished(z);
        }

        /* renamed from: d */
        public final int m15954d() {
            return this.f13559a.getCurrX();
        }

        /* renamed from: e */
        public final int m15955e() {
            return this.f13559a.getCurrY();
        }

        /* renamed from: f */
        public final boolean m15956f() {
            return this.f13559a.isFinished();
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$d */
    public final class RunnableC11884d implements Runnable {

        /* renamed from: a */
        public final long f13561a;

        /* renamed from: b */
        public final float f13562b;

        /* renamed from: c */
        public final float f13563c;

        /* renamed from: d */
        public final float f13564d;

        /* renamed from: e */
        public final float f13565e;

        /* renamed from: f */
        public final boolean f13566f;

        /* renamed from: g */
        public final AccelerateDecelerateInterpolator f13567g = new AccelerateDecelerateInterpolator();

        /* renamed from: h */
        public final PointF f13568h;

        /* renamed from: q */
        public final PointF f13569q;

        public RunnableC11884d(float f, float f2, float f3, boolean z) {
            TouchImageView.this.setState(ic8.ANIMATE_ZOOM);
            this.f13561a = System.currentTimeMillis();
            this.f13562b = TouchImageView.this.getCurrentZoom();
            this.f13563c = f;
            this.f13566f = z;
            PointF pointFM15948S = TouchImageView.this.m15948S(f2, f3, false);
            float f4 = pointFM15948S.x;
            this.f13564d = f4;
            float f5 = pointFM15948S.y;
            this.f13565e = f5;
            this.f13568h = TouchImageView.this.m15947R(f4, f5);
            this.f13569q = new PointF(TouchImageView.this.s0 / 2, TouchImageView.this.t0 / 2);
        }

        /* renamed from: a */
        public final double m15957a(float f) {
            return (this.f13562b + (f * (this.f13563c - r0))) / TouchImageView.this.getCurrentZoom();
        }

        /* renamed from: b */
        public final float m15958b() {
            return this.f13567g.getInterpolation(Math.min(1.0f, (System.currentTimeMillis() - this.f13561a) / 500.0f));
        }

        /* renamed from: c */
        public final void m15959c(float f) {
            PointF pointF = this.f13568h;
            float f2 = pointF.x;
            PointF pointF2 = this.f13569q;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            float f5 = f4 + (f * (pointF2.y - f4));
            PointF pointFM15947R = TouchImageView.this.m15947R(this.f13564d, this.f13565e);
            TouchImageView.this.f13543e.postTranslate(f3 - pointFM15947R.x, f5 - pointFM15947R.y);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(ic8.NONE);
                return;
            }
            float fM15958b = m15958b();
            TouchImageView.this.m15945P(m15957a(fM15958b), this.f13564d, this.f13565e, this.f13566f);
            m15959c(fM15958b);
            TouchImageView.this.m15933D();
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.f13543e);
            TouchImageView.m15922r(TouchImageView.this);
            if (fM15958b < 1.0f) {
                TouchImageView.this.m15931B(this);
            } else {
                TouchImageView.this.setState(ic8.NONE);
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$e */
    public final class RunnableC11885e implements Runnable {

        /* renamed from: a */
        public C11883c f13571a;

        /* renamed from: b */
        public int f13572b;

        /* renamed from: c */
        public int f13573c;

        public RunnableC11885e(int i, int i2) {
            int imageWidth;
            int i3;
            int imageHeight;
            int i4;
            TouchImageView.this.setState(ic8.FLING);
            this.f13571a = TouchImageView.this.new C11883c(TouchImageView.this.getContext());
            TouchImageView.this.f13543e.getValues(TouchImageView.this.k0);
            int imageWidth2 = (int) TouchImageView.this.k0[2];
            int i5 = (int) TouchImageView.this.k0[5];
            if (TouchImageView.this.f13546h && TouchImageView.this.m15942M(TouchImageView.this.getDrawable())) {
                imageWidth2 -= (int) TouchImageView.this.getImageWidth();
            }
            if (TouchImageView.this.getImageWidth() > TouchImageView.this.s0) {
                imageWidth = TouchImageView.this.s0 - ((int) TouchImageView.this.getImageWidth());
                i3 = 0;
            } else {
                imageWidth = imageWidth2;
                i3 = imageWidth;
            }
            if (TouchImageView.this.getImageHeight() > TouchImageView.this.t0) {
                imageHeight = TouchImageView.this.t0 - ((int) TouchImageView.this.getImageHeight());
                i4 = 0;
            } else {
                imageHeight = i5;
                i4 = imageHeight;
            }
            this.f13571a.m15952b(imageWidth2, i5, i, i2, imageWidth, i3, imageHeight, i4);
            this.f13572b = imageWidth2;
            this.f13573c = i5;
        }

        /* renamed from: a */
        public final void m15960a() {
            TouchImageView.this.setState(ic8.NONE);
            this.f13571a.m15953c(true);
        }

        @Override // java.lang.Runnable
        public void run() {
            TouchImageView.m15922r(TouchImageView.this);
            if (!this.f13571a.m15956f() && this.f13571a.m15951a()) {
                int iM15954d = this.f13571a.m15954d();
                int iM15955e = this.f13571a.m15955e();
                int i = iM15954d - this.f13572b;
                int i2 = iM15955e - this.f13573c;
                this.f13572b = iM15954d;
                this.f13573c = iM15955e;
                TouchImageView.this.f13543e.postTranslate(i, i2);
                TouchImageView.this.m15934E();
                TouchImageView touchImageView = TouchImageView.this;
                touchImageView.setImageMatrix(touchImageView.f13543e);
                TouchImageView.this.m15931B(this);
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$f */
    public final class C11886f extends GestureDetector.SimpleOnGestureListener {
        public C11886f() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (motionEvent == null || !TouchImageView.this.m15939J()) {
                return false;
            }
            GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.C0;
            boolean zOnDoubleTap = onDoubleTapListener != null ? onDoubleTapListener.onDoubleTap(motionEvent) : false;
            if (TouchImageView.this.f13550y != ic8.NONE) {
                return zOnDoubleTap;
            }
            float doubleTapScale = (TouchImageView.this.getDoubleTapScale() > 0.0f ? 1 : (TouchImageView.this.getDoubleTapScale() == 0.0f ? 0 : -1)) == 0 ? TouchImageView.this.h0 : TouchImageView.this.getDoubleTapScale();
            if (!(TouchImageView.this.getCurrentZoom() == TouchImageView.this.f13539L)) {
                doubleTapScale = TouchImageView.this.f13539L;
            }
            TouchImageView.this.m15931B(TouchImageView.this.new RunnableC11884d(doubleTapScale, motionEvent.getX(), motionEvent.getY(), false));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.C0;
            if (onDoubleTapListener != null) {
                return onDoubleTapListener.onDoubleTapEvent(motionEvent);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            RunnableC11885e runnableC11885e = TouchImageView.this.m0;
            if (runnableC11885e != null) {
                runnableC11885e.m15960a();
            }
            TouchImageView touchImageView = TouchImageView.this;
            RunnableC11885e runnableC11885e2 = touchImageView.new RunnableC11885e((int) f, (int) f2);
            TouchImageView.this.m15931B(runnableC11885e2);
            touchImageView.m0 = runnableC11885e2;
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            TouchImageView.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            GestureDetector.OnDoubleTapListener onDoubleTapListener = TouchImageView.this.C0;
            return onDoubleTapListener != null ? onDoubleTapListener.onSingleTapConfirmed(motionEvent) : TouchImageView.this.performClick();
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$g */
    public final class ViewOnTouchListenerC11887g implements View.OnTouchListener {

        /* renamed from: a */
        public final PointF f13576a = new PointF();

        public ViewOnTouchListenerC11887g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            sq8.m48649h(view, "v");
            sq8.m48649h(motionEvent, "event");
            if (TouchImageView.this.getDrawable() == null) {
                TouchImageView.this.setState(ic8.NONE);
                return false;
            }
            if (TouchImageView.this.m15939J()) {
                TouchImageView.this.A0.onTouchEvent(motionEvent);
            }
            TouchImageView.this.B0.onTouchEvent(motionEvent);
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            ic8 ic8Var = TouchImageView.this.f13550y;
            ic8 ic8Var2 = ic8.NONE;
            if (ic8Var == ic8Var2 || TouchImageView.this.f13550y == ic8.DRAG || TouchImageView.this.f13550y == ic8.FLING) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f13576a.set(pointF);
                    RunnableC11885e runnableC11885e = TouchImageView.this.m0;
                    if (runnableC11885e != null) {
                        runnableC11885e.m15960a();
                    }
                    TouchImageView.this.setState(ic8.DRAG);
                } else if (action == 1) {
                    TouchImageView.this.setState(ic8Var2);
                } else if (action != 2) {
                    if (action == 6) {
                    }
                } else if (TouchImageView.this.f13550y == ic8.DRAG) {
                    float f = pointF.x;
                    PointF pointF2 = this.f13576a;
                    float f2 = f - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    TouchImageView.this.f13543e.postTranslate(TouchImageView.this.m15937H(f2, r2.s0, TouchImageView.this.getImageWidth()), TouchImageView.this.m15937H(f3, r2.t0, TouchImageView.this.getImageHeight()));
                    TouchImageView.this.m15934E();
                    this.f13576a.set(pointF.x, pointF.y);
                }
            }
            TouchImageView.m15921q(TouchImageView.this);
            TouchImageView touchImageView = TouchImageView.this;
            touchImageView.setImageMatrix(touchImageView.f13543e);
            View.OnTouchListener onTouchListener = TouchImageView.this.D0;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
            }
            TouchImageView.m15922r(TouchImageView.this);
            return true;
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$h */
    public final class C11888h extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C11888h() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            sq8.m48649h(scaleGestureDetector, "detector");
            TouchImageView.this.m15945P(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            TouchImageView.m15922r(TouchImageView.this);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            sq8.m48649h(scaleGestureDetector, "detector");
            TouchImageView.this.setState(ic8.ZOOM);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            sq8.m48649h(scaleGestureDetector, "detector");
            super.onScaleEnd(scaleGestureDetector);
            TouchImageView.this.setState(ic8.NONE);
            float currentZoom = TouchImageView.this.getCurrentZoom();
            boolean z = true;
            if (TouchImageView.this.getCurrentZoom() > TouchImageView.this.h0) {
                currentZoom = TouchImageView.this.h0;
            } else if (TouchImageView.this.getCurrentZoom() < TouchImageView.this.f13539L) {
                currentZoom = TouchImageView.this.f13539L;
            } else {
                z = false;
            }
            float f = currentZoom;
            if (z) {
                TouchImageView.this.m15931B(TouchImageView.this.new RunnableC11884d(f, r3.s0 / 2, TouchImageView.this.t0 / 2, true));
            }
        }
    }

    /* renamed from: com.ortiz.touchview.TouchImageView$i */
    public /* synthetic */ class C11889i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13579a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            iArr[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            iArr[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            f13579a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context) {
        this(context, null, 0, 6, null);
        sq8.m48649h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageHeight() {
        return this.x0 * this.f13542d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getImageWidth() {
        return this.w0 * this.f13542d;
    }

    /* renamed from: q */
    public static final /* synthetic */ icc m15921q(TouchImageView touchImageView) {
        touchImageView.getClass();
        return null;
    }

    /* renamed from: r */
    public static final /* synthetic */ jcc m15922r(TouchImageView touchImageView) {
        touchImageView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ic8 ic8Var) {
        this.f13550y = ic8Var;
    }

    /* renamed from: B */
    public final void m15931B(Runnable runnable) {
        postOnAnimation(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m15932C() {
        y17 y17Var = this.f13549x ? this.f13547q : this.f13548s;
        this.f13549x = false;
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0 || this.f13543e == null || this.f13544f == null) {
            return;
        }
        if (this.f13538H == -1.0f) {
            setMinZoom(-1.0f);
            float f = this.f13542d;
            float f2 = this.f13539L;
            if (f < f2) {
                this.f13542d = f2;
            }
        }
        int iM15936G = m15936G(drawable);
        int iM15935F = m15935F(drawable);
        float f3 = iM15936G;
        float fMax = this.s0 / f3;
        float f4 = iM15935F;
        float f5 = this.t0 / f4;
        ImageView.ScaleType scaleType = this.o0;
        switch (scaleType == null ? -1 : C11889i.f13579a[scaleType.ordinal()]) {
            case 1:
                fMax = 1.0f;
                break;
            case 2:
                fMax = Math.max(fMax, f5);
                break;
            case 3:
                float fMin = Math.min(1.0f, Math.min(fMax, f5));
                fMax = Math.min(fMin, fMin);
                break;
            case 4:
            case 5:
            case 6:
                fMax = Math.min(fMax, f5);
                break;
            default:
                int i = this.s0;
                float f6 = i - (fMax * f3);
                int i2 = this.t0;
                float f7 = i2 - (f5 * f4);
                this.w0 = i - f6;
                this.x0 = i2 - f7;
                if (!m15940K() || this.p0) {
                    if (this.y0 != 0.0f) {
                        m15944O();
                        this.f13544f.getValues(this.k0);
                        float[] fArr = this.k0;
                        float f8 = this.w0 / f3;
                        float f9 = this.f13542d;
                        fArr[0] = f8 * f9;
                        fArr[4] = (this.x0 / f4) * f9;
                        float f10 = fArr[2];
                        float f11 = fArr[5];
                        this.k0[2] = m15941L(f10, f9 * this.y0, getImageWidth(), this.u0, this.s0, iM15936G, y17Var);
                        this.k0[5] = m15941L(f11, this.z0 * this.f13542d, getImageHeight(), this.v0, this.t0, iM15935F, y17Var);
                        this.f13543e.setValues(this.k0);
                    } else {
                        if (this.z0 == 0.0f) {
                        }
                        this.f13544f.getValues(this.k0);
                        float[] fArr2 = this.k0;
                        float f82 = this.w0 / f3;
                        float f92 = this.f13542d;
                        fArr2[0] = f82 * f92;
                        fArr2[4] = (this.x0 / f4) * f92;
                        float f102 = fArr2[2];
                        float f112 = fArr2[5];
                        this.k0[2] = m15941L(f102, f92 * this.y0, getImageWidth(), this.u0, this.s0, iM15936G, y17Var);
                        this.k0[5] = m15941L(f112, this.z0 * this.f13542d, getImageHeight(), this.v0, this.t0, iM15935F, y17Var);
                        this.f13543e.setValues(this.k0);
                    }
                } else {
                    if (this.f13546h && m15942M(drawable)) {
                        this.f13543e.setRotate(90.0f);
                        this.f13543e.postTranslate(f3, 0.0f);
                        this.f13543e.postScale(fMax, f5);
                    } else {
                        this.f13543e.setScale(fMax, f5);
                    }
                    ImageView.ScaleType scaleType2 = this.o0;
                    int i3 = scaleType2 == null ? -1 : C11889i.f13579a[scaleType2.ordinal()];
                    if (i3 == 5) {
                        this.f13543e.postTranslate(0.0f, 0.0f);
                    } else if (i3 != 6) {
                        float f12 = 2;
                        this.f13543e.postTranslate(f6 / f12, f7 / f12);
                    } else {
                        this.f13543e.postTranslate(f6, f7);
                    }
                    this.f13542d = 1.0f;
                }
                m15934E();
                setImageMatrix(this.f13543e);
        }
        f5 = fMax;
        int i4 = this.s0;
        float f62 = i4 - (fMax * f3);
        int i22 = this.t0;
        float f72 = i22 - (f5 * f4);
        this.w0 = i4 - f62;
        this.x0 = i22 - f72;
        if (m15940K()) {
            if (this.y0 != 0.0f) {
            }
        }
        m15934E();
        setImageMatrix(this.f13543e);
    }

    /* renamed from: D */
    public final void m15933D() {
        m15934E();
        this.f13543e.getValues(this.k0);
        float imageWidth = getImageWidth();
        int i = this.s0;
        if (imageWidth < i) {
            float imageWidth2 = (i - getImageWidth()) / 2;
            if (this.f13546h && m15942M(getDrawable())) {
                imageWidth2 += getImageWidth();
            }
            this.k0[2] = imageWidth2;
        }
        float imageHeight = getImageHeight();
        int i2 = this.t0;
        if (imageHeight < i2) {
            this.k0[5] = (i2 - getImageHeight()) / 2;
        }
        this.f13543e.setValues(this.k0);
    }

    /* renamed from: E */
    public final void m15934E() {
        this.f13543e.getValues(this.k0);
        float[] fArr = this.k0;
        this.f13543e.postTranslate(m15938I(fArr[2], this.s0, getImageWidth(), (this.f13546h && m15942M(getDrawable())) ? getImageWidth() : 0.0f), m15938I(fArr[5], this.t0, getImageHeight(), 0.0f));
    }

    /* renamed from: F */
    public final int m15935F(Drawable drawable) {
        if (m15942M(drawable) && this.f13546h) {
            sq8.m48646e(drawable);
            return drawable.getIntrinsicWidth();
        }
        sq8.m48646e(drawable);
        return drawable.getIntrinsicHeight();
    }

    /* renamed from: G */
    public final int m15936G(Drawable drawable) {
        if (m15942M(drawable) && this.f13546h) {
            sq8.m48646e(drawable);
            return drawable.getIntrinsicHeight();
        }
        sq8.m48646e(drawable);
        return drawable.getIntrinsicWidth();
    }

    /* renamed from: H */
    public final float m15937H(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: I */
    public final float m15938I(float f, float f2, float f3, float f4) {
        float f5;
        if (f3 <= f2) {
            f5 = (f2 + f4) - f3;
        } else {
            f4 = (f2 + f4) - f3;
            f5 = f4;
        }
        if (f < f4) {
            return (-f) + f4;
        }
        if (f > f5) {
            return (-f) + f5;
        }
        return 0.0f;
    }

    /* renamed from: J */
    public final boolean m15939J() {
        return this.f13545g;
    }

    /* renamed from: K */
    public final boolean m15940K() {
        return !(this.f13542d == 1.0f);
    }

    /* renamed from: L */
    public final float m15941L(float f, float f2, float f3, int i, int i2, int i3, y17 y17Var) {
        float f4 = i2;
        float f5 = 0.5f;
        if (f3 < f4) {
            return (f4 - (i3 * this.k0[0])) * 0.5f;
        }
        if (f > 0.0f) {
            return -((f3 - f4) * 0.5f);
        }
        if (y17Var == y17.BOTTOM_RIGHT) {
            f5 = 1.0f;
        } else if (y17Var == y17.TOP_LEFT) {
            f5 = 0.0f;
        }
        return -(((((-f) + (i * f5)) / f2) * f3) - (f4 * f5));
    }

    /* renamed from: M */
    public final boolean m15942M(Drawable drawable) {
        boolean z = this.s0 > this.t0;
        sq8.m48646e(drawable);
        return z != (drawable.getIntrinsicWidth() > drawable.getIntrinsicHeight());
    }

    /* renamed from: N */
    public final void m15943N() {
        this.f13542d = 1.0f;
        m15932C();
    }

    /* renamed from: O */
    public final void m15944O() {
        if (this.t0 == 0 || this.s0 == 0) {
            return;
        }
        this.f13543e.getValues(this.k0);
        this.f13544f.setValues(this.k0);
        this.z0 = this.x0;
        this.y0 = this.w0;
        this.v0 = this.t0;
        this.u0 = this.s0;
    }

    /* renamed from: P */
    public final void m15945P(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        double d2;
        if (z) {
            f3 = this.i0;
            f4 = this.j0;
        } else {
            f3 = this.f13539L;
            f4 = this.h0;
        }
        float f5 = this.f13542d;
        float f6 = ((float) d) * f5;
        this.f13542d = f6;
        if (f6 <= f4) {
            if (f6 < f3) {
                this.f13542d = f3;
                d2 = f3;
            }
            float f7 = (float) d;
            this.f13543e.postScale(f7, f7, f, f2);
            m15933D();
        }
        this.f13542d = f4;
        d2 = f4;
        d = d2 / f5;
        float f72 = (float) d;
        this.f13543e.postScale(f72, f72, f, f2);
        m15933D();
    }

    /* renamed from: Q */
    public final int m15946Q(int i, int i2, int i3) {
        return i != Integer.MIN_VALUE ? i != 0 ? i2 : i3 : Math.min(i3, i2);
    }

    /* renamed from: R */
    public final PointF m15947R(float f, float f2) {
        this.f13543e.getValues(this.k0);
        return new PointF(this.k0[2] + (getImageWidth() * (f / getDrawable().getIntrinsicWidth())), this.k0[5] + (getImageHeight() * (f2 / getDrawable().getIntrinsicHeight())));
    }

    /* renamed from: S */
    public final PointF m15948S(float f, float f2, boolean z) {
        this.f13543e.getValues(this.k0);
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float[] fArr = this.k0;
        float f3 = fArr[2];
        float f4 = fArr[5];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - f4) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        this.f13543e.getValues(this.k0);
        float f = this.k0[2];
        if (getImageWidth() < this.s0) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.s0)) + ((float) 1) < getImageWidth() || i <= 0;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        this.f13543e.getValues(this.k0);
        float f = this.k0[5];
        if (getImageHeight() < this.t0) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.t0)) + ((float) 1) < getImageHeight() || i <= 0;
        }
        return false;
    }

    public final float getCurrentZoom() {
        return this.f13542d;
    }

    public final float getDoubleTapScale() {
        return this.l0;
    }

    public final float getMaxZoom() {
        return this.h0;
    }

    public final float getMinZoom() {
        return this.f13539L;
    }

    public final y17 getOrientationChangeFixedPixel() {
        return this.f13547q;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        ImageView.ScaleType scaleType = this.o0;
        sq8.m48646e(scaleType);
        return scaleType;
    }

    public final PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return new PointF(0.5f, 0.5f);
        }
        int iM15936G = m15936G(drawable);
        int iM15935F = m15935F(drawable);
        PointF pointFM15948S = m15948S(this.s0 / 2.0f, this.t0 / 2.0f, true);
        pointFM15948S.x /= iM15936G;
        pointFM15948S.y /= iM15935F;
        return pointFM15948S;
    }

    public final y17 getViewSizeChangeFixedPixel() {
        return this.f13548s;
    }

    public final RectF getZoomedRect() {
        if (this.o0 == ImageView.ScaleType.FIT_XY) {
            throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
        }
        PointF pointFM15948S = m15948S(0.0f, 0.0f, true);
        PointF pointFM15948S2 = m15948S(this.s0, this.t0, true);
        float fM15936G = m15936G(getDrawable());
        float fM15935F = m15935F(getDrawable());
        return new RectF(pointFM15948S.x / fM15936G, pointFM15948S.y / fM15935F, pointFM15948S2.x / fM15936G, pointFM15948S2.y / fM15935F);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        sq8.m48649h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = getResources().getConfiguration().orientation;
        if (i != this.n0) {
            this.f13549x = true;
            this.n0 = i;
        }
        m15944O();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        this.q0 = true;
        this.p0 = true;
        kfj kfjVar = this.r0;
        if (kfjVar != null) {
            sq8.m48646e(kfjVar);
            float fM35639c = kfjVar.m35639c();
            kfj kfjVar2 = this.r0;
            sq8.m48646e(kfjVar2);
            float fM35637a = kfjVar2.m35637a();
            kfj kfjVar3 = this.r0;
            sq8.m48646e(kfjVar3);
            float fM35638b = kfjVar3.m35638b();
            kfj kfjVar4 = this.r0;
            sq8.m48646e(kfjVar4);
            setZoom(fM35639c, fM35637a, fM35638b, kfjVar4.m35640d());
            this.r0 = null;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int iM15936G = m15936G(drawable);
        int iM15935F = m15935F(drawable);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int iM15946Q = m15946Q(mode, size, iM15936G);
        int iM15946Q2 = m15946Q(mode2, size2, iM15935F);
        if (!this.f13549x) {
            m15944O();
        }
        setMeasuredDimension((iM15946Q - getPaddingLeft()) - getPaddingRight(), (iM15946Q2 - getPaddingTop()) - getPaddingBottom());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        sq8.m48649h(parcelable, "state");
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f13542d = bundle.getFloat("saveScale");
        float[] floatArray = bundle.getFloatArray("matrix");
        sq8.m48646e(floatArray);
        this.k0 = floatArray;
        this.f13544f.setValues(floatArray);
        this.z0 = bundle.getFloat("matchViewHeight");
        this.y0 = bundle.getFloat("matchViewWidth");
        this.v0 = bundle.getInt("viewHeight");
        this.u0 = bundle.getInt("viewWidth");
        this.p0 = bundle.getBoolean("imageRendered");
        this.f13548s = (y17) bundle.getSerializable("viewSizeChangeFixedPixel");
        this.f13547q = (y17) bundle.getSerializable("orientationChangeFixedPixel");
        if (this.n0 != bundle.getInt("orientation")) {
            this.f13549x = true;
        }
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("orientation", this.n0);
        bundle.putFloat("saveScale", this.f13542d);
        bundle.putFloat("matchViewHeight", this.x0);
        bundle.putFloat("matchViewWidth", this.w0);
        bundle.putInt("viewWidth", this.s0);
        bundle.putInt("viewHeight", this.t0);
        this.f13543e.getValues(this.k0);
        bundle.putFloatArray("matrix", this.k0);
        bundle.putBoolean("imageRendered", this.p0);
        bundle.putSerializable("viewSizeChangeFixedPixel", this.f13548s);
        bundle.putSerializable("orientationChangeFixedPixel", this.f13547q);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.s0 = i;
        this.t0 = i2;
        m15932C();
    }

    public final void setDoubleTapScale(float f) {
        this.l0 = f;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.p0 = false;
        super.setImageBitmap(bitmap);
        m15944O();
        m15932C();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.p0 = false;
        super.setImageDrawable(drawable);
        m15944O();
        m15932C();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.p0 = false;
        super.setImageResource(i);
        m15944O();
        m15932C();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        this.p0 = false;
        super.setImageURI(uri);
        m15944O();
        m15932C();
    }

    public final void setMaxZoom(float f) {
        this.h0 = f;
        this.j0 = f * 1.25f;
        this.f13540M = false;
    }

    public final void setMaxZoomRatio(float f) {
        this.f13541Q = f;
        float f2 = this.f13539L * f;
        this.h0 = f2;
        this.j0 = f2 * 1.25f;
        this.f13540M = true;
    }

    public final void setMinZoom(float f) {
        this.f13538H = f;
        if (f == -1.0f) {
            ImageView.ScaleType scaleType = this.o0;
            if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.CENTER_CROP) {
                Drawable drawable = getDrawable();
                int iM15936G = m15936G(drawable);
                int iM15935F = m15935F(drawable);
                if (drawable != null && iM15936G > 0 && iM15935F > 0) {
                    float f2 = this.s0 / iM15936G;
                    float f3 = this.t0 / iM15935F;
                    this.f13539L = this.o0 == ImageView.ScaleType.CENTER ? Math.min(f2, f3) : Math.min(f2, f3) / Math.max(f2, f3);
                }
            } else {
                this.f13539L = 1.0f;
            }
        } else {
            this.f13539L = f;
        }
        if (this.f13540M) {
            setMaxZoomRatio(this.f13541Q);
        }
        this.i0 = this.f13539L * 0.75f;
    }

    public final void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        sq8.m48649h(onDoubleTapListener, "onDoubleTapListener");
        this.C0 = onDoubleTapListener;
    }

    public final void setOnTouchCoordinatesListener(icc iccVar) {
        sq8.m48649h(iccVar, "onTouchCoordinatesListener");
    }

    public final void setOnTouchImageViewListener(jcc jccVar) {
        sq8.m48649h(jccVar, "onTouchImageViewListener");
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.D0 = onTouchListener;
    }

    public final void setOrientationChangeFixedPixel(y17 y17Var) {
        this.f13547q = y17Var;
    }

    public final void setRotateImageToFitScreen(boolean z) {
        this.f13546h = z;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        sq8.m48649h(scaleType, "type");
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            super.setScaleType(scaleType2);
            return;
        }
        this.o0 = scaleType;
        if (this.q0) {
            setZoom(this);
        }
    }

    public final void setScrollPosition(float f, float f2) {
        setZoom(this.f13542d, f, f2);
    }

    public final void setViewSizeChangeFixedPixel(y17 y17Var) {
        this.f13548s = y17Var;
    }

    public final void setZoom(float f) {
        setZoom(f, 0.5f, 0.5f);
    }

    public final void setZoomAnimated(float f, float f2, float f3) {
        setZoomAnimated(f, f2, f3, 500);
    }

    public final void setZoomEnabled(boolean z) {
        this.f13545g = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        sq8.m48649h(context, "context");
    }

    public final void setZoom(float f, float f2, float f3) {
        setZoom(f, f2, f3, this.o0);
    }

    public final void setZoomAnimated(float f, float f2, float f3, int i) {
        m15931B(new RunnableC11881a(this, f, new PointF(f2, f3), i));
    }

    public /* synthetic */ TouchImageView(Context context, AttributeSet attributeSet, int i, int i2, id5 id5Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void setZoom(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        if (!this.q0) {
            this.r0 = new kfj(f, f2, f3, scaleType);
            return;
        }
        if (this.f13538H == -1.0f) {
            setMinZoom(-1.0f);
            float f4 = this.f13542d;
            float f5 = this.f13539L;
            if (f4 < f5) {
                this.f13542d = f5;
            }
        }
        if (scaleType != this.o0) {
            sq8.m48646e(scaleType);
            setScaleType(scaleType);
        }
        m15943N();
        m15945P(f, this.s0 / 2.0f, this.t0 / 2.0f, true);
        this.f13543e.getValues(this.k0);
        float[] fArr = this.k0;
        float f6 = this.s0;
        float f7 = this.w0;
        float f8 = 2;
        float f9 = f - 1;
        fArr[2] = ((f6 - f7) / f8) - ((f2 * f9) * f7);
        float f10 = this.t0;
        float f11 = this.x0;
        fArr[5] = ((f10 - f11) / f8) - ((f3 * f9) * f11);
        this.f13543e.setValues(fArr);
        m15934E();
        m15944O();
        setImageMatrix(this.f13543e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        y17 y17Var = y17.CENTER;
        this.f13547q = y17Var;
        this.f13548s = y17Var;
        super.setClickable(true);
        this.n0 = getResources().getConfiguration().orientation;
        this.A0 = new ScaleGestureDetector(context, new C11888h());
        this.B0 = new GestureDetector(context, new C11886f());
        this.f13543e = new Matrix();
        this.f13544f = new Matrix();
        this.k0 = new float[9];
        this.f13542d = 1.0f;
        if (this.o0 == null) {
            this.o0 = ImageView.ScaleType.FIT_CENTER;
        }
        this.f13539L = 1.0f;
        this.h0 = 3.0f;
        this.i0 = 1.0f * 0.75f;
        this.j0 = 3.0f * 1.25f;
        setImageMatrix(this.f13543e);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(ic8.NONE);
        this.q0 = false;
        super.setOnTouchListener(new ViewOnTouchListenerC11887g());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ibe.TouchImageView, i, 0);
        sq8.m48648g(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…chImageView, defStyle, 0)");
        try {
            if (!isInEditMode()) {
                this.f13545g = typedArrayObtainStyledAttributes.getBoolean(ibe.TouchImageView_zoom_enabled, true);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setZoomAnimated(float f, float f2, float f3, int i, mcc mccVar) {
        RunnableC11881a runnableC11881a = new RunnableC11881a(this, f, new PointF(f2, f3), i);
        runnableC11881a.m15950b(mccVar);
        m15931B(runnableC11881a);
    }

    public final void setZoomAnimated(float f, float f2, float f3, mcc mccVar) {
        RunnableC11881a runnableC11881a = new RunnableC11881a(this, f, new PointF(f2, f3), 500);
        runnableC11881a.m15950b(mccVar);
        m15931B(runnableC11881a);
    }

    public final void setZoom(TouchImageView touchImageView) {
        sq8.m48649h(touchImageView, "imageSource");
        PointF scrollPosition = touchImageView.getScrollPosition();
        setZoom(touchImageView.f13542d, scrollPosition.x, scrollPosition.y, touchImageView.getScaleType());
    }
}
