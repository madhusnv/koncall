package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.C2233a;

/* renamed from: androidx.media3.exoplayer.video.spherical.b */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC2234b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C2233a.a {

    /* renamed from: c */
    public final a f8628c;

    /* renamed from: d */
    public final float f8629d;

    /* renamed from: e */
    public final GestureDetector f8630e;

    /* renamed from: a */
    public final PointF f8626a = new PointF();

    /* renamed from: b */
    public final PointF f8627b = new PointF();

    /* renamed from: f */
    public volatile float f8631f = 3.1415927f;

    /* renamed from: androidx.media3.exoplayer.video.spherical.b$a */
    public interface a {
        /* renamed from: b */
        void mo7525b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public ViewOnTouchListenerC2234b(Context context, a aVar, float f) {
        this.f8628c = aVar;
        this.f8629d = f;
        this.f8630e = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.C2233a.a
    /* renamed from: a */
    public void mo7524a(float[] fArr, float f) {
        this.f8631f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f8626a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f8626a.x) / this.f8629d;
        float y = motionEvent2.getY();
        PointF pointF = this.f8626a;
        float f3 = (y - pointF.y) / this.f8629d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f8631f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f8627b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = pointF2.y + (fSin * x) + (fCos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f8628c.mo7525b(this.f8627b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f8628c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f8630e.onTouchEvent(motionEvent);
    }
}
