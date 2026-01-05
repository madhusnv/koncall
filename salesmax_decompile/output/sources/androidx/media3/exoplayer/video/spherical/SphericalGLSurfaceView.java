package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.exoplayer.video.spherical.C2233a;
import androidx.media3.exoplayer.video.spherical.ViewOnTouchListenerC2234b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p001o.fa2;
import p001o.gui;
import p001o.op0;
import p001o.vs7;
import p001o.y4f;

/* loaded from: classes2.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: H */
    public static final /* synthetic */ int f8595H = 0;

    /* renamed from: a */
    public final CopyOnWriteArrayList f8596a;

    /* renamed from: b */
    public final SensorManager f8597b;

    /* renamed from: c */
    public final Sensor f8598c;

    /* renamed from: d */
    public final C2233a f8599d;

    /* renamed from: e */
    public final Handler f8600e;

    /* renamed from: f */
    public final ViewOnTouchListenerC2234b f8601f;

    /* renamed from: g */
    public final y4f f8602g;

    /* renamed from: h */
    public SurfaceTexture f8603h;

    /* renamed from: q */
    public Surface f8604q;

    /* renamed from: s */
    public boolean f8605s;

    /* renamed from: x */
    public boolean f8606x;

    /* renamed from: y */
    public boolean f8607y;

    /* renamed from: androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$a */
    public final class C2231a implements GLSurfaceView.Renderer, ViewOnTouchListenerC2234b.a, C2233a.a {

        /* renamed from: a */
        public final y4f f8608a;

        /* renamed from: d */
        public final float[] f8611d;

        /* renamed from: e */
        public final float[] f8612e;

        /* renamed from: f */
        public final float[] f8613f;

        /* renamed from: g */
        public float f8614g;

        /* renamed from: h */
        public float f8615h;

        /* renamed from: b */
        public final float[] f8609b = new float[16];

        /* renamed from: c */
        public final float[] f8610c = new float[16];

        /* renamed from: q */
        public final float[] f8616q = new float[16];

        /* renamed from: s */
        public final float[] f8617s = new float[16];

        public C2231a(y4f y4fVar) {
            float[] fArr = new float[16];
            this.f8611d = fArr;
            float[] fArr2 = new float[16];
            this.f8612e = fArr2;
            float[] fArr3 = new float[16];
            this.f8613f = fArr3;
            this.f8608a = y4fVar;
            vs7.m53378k(fArr);
            vs7.m53378k(fArr2);
            vs7.m53378k(fArr3);
            this.f8615h = 3.1415927f;
        }

        @Override // androidx.media3.exoplayer.video.spherical.C2233a.a
        /* renamed from: a */
        public synchronized void mo7524a(float[] fArr, float f) {
            float[] fArr2 = this.f8611d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f8615h = -f;
            m7527d();
        }

        @Override // androidx.media3.exoplayer.video.spherical.ViewOnTouchListenerC2234b.a
        /* renamed from: b */
        public synchronized void mo7525b(PointF pointF) {
            this.f8614g = pointF.y;
            m7527d();
            Matrix.setRotateM(this.f8613f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        /* renamed from: c */
        public final float m7526c(float f) {
            if (f > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d);
            }
            return 90.0f;
        }

        /* renamed from: d */
        public final void m7527d() {
            Matrix.setRotateM(this.f8612e, 0, -this.f8614g, (float) Math.cos(this.f8615h), (float) Math.sin(this.f8615h), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f8617s, 0, this.f8611d, 0, this.f8613f, 0);
                Matrix.multiplyMM(this.f8616q, 0, this.f8612e, 0, this.f8617s, 0);
            }
            Matrix.multiplyMM(this.f8610c, 0, this.f8609b, 0, this.f8616q, 0);
            this.f8608a.m57203c(this.f8610c, false);
        }

        @Override // androidx.media3.exoplayer.video.spherical.ViewOnTouchListenerC2234b.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.f8609b, 0, m7526c(f), f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.m7521g(this.f8608a.m57204f());
        }
    }

    /* renamed from: androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView$b */
    public interface InterfaceC2232b {
        /* renamed from: B */
        void mo7169B(Surface surface);

        /* renamed from: D */
        void mo7170D(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m7517e() {
        Surface surface = this.f8604q;
        if (surface != null) {
            Iterator it = this.f8596a.iterator();
            while (it.hasNext()) {
                ((InterfaceC2232b) it.next()).mo7169B(surface);
            }
        }
        m7519h(this.f8603h, surface);
        this.f8603h = null;
        this.f8604q = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m7518f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f8603h;
        Surface surface = this.f8604q;
        Surface surface2 = new Surface(surfaceTexture);
        this.f8603h = surfaceTexture;
        this.f8604q = surface2;
        Iterator it = this.f8596a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2232b) it.next()).mo7170D(surface2);
        }
        m7519h(surfaceTexture2, surface);
    }

    /* renamed from: h */
    public static void m7519h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    /* renamed from: d */
    public void m7520d(InterfaceC2232b interfaceC2232b) {
        this.f8596a.add(interfaceC2232b);
    }

    /* renamed from: g */
    public final void m7521g(final SurfaceTexture surfaceTexture) {
        this.f8600e.post(new Runnable() { // from class: o.l0g
            @Override // java.lang.Runnable
            public final void run() {
                this.f32957a.m7518f(surfaceTexture);
            }
        });
    }

    public fa2 getCameraMotionListener() {
        return this.f8602g;
    }

    public gui getVideoFrameMetadataListener() {
        return this.f8602g;
    }

    public Surface getVideoSurface() {
        return this.f8604q;
    }

    /* renamed from: i */
    public void m7522i(InterfaceC2232b interfaceC2232b) {
        this.f8596a.remove(interfaceC2232b);
    }

    /* renamed from: j */
    public final void m7523j() {
        boolean z = this.f8605s && this.f8606x;
        Sensor sensor = this.f8598c;
        if (sensor == null || z == this.f8607y) {
            return;
        }
        if (z) {
            this.f8597b.registerListener(this.f8599d, sensor, 0);
        } else {
            this.f8597b.unregisterListener(this.f8599d);
        }
        this.f8607y = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8600e.post(new Runnable() { // from class: o.m0g
            @Override // java.lang.Runnable
            public final void run() {
                this.f34606a.m7517e();
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f8606x = false;
        m7523j();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f8606x = true;
        m7523j();
    }

    public void setDefaultStereoMode(int i) {
        this.f8602g.m57205h(i);
    }

    public void setUseSensorRotation(boolean z) {
        this.f8605s = z;
        m7523j();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8596a = new CopyOnWriteArrayList();
        this.f8600e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) op0.m42515e(context.getSystemService("sensor"));
        this.f8597b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f8598c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        y4f y4fVar = new y4f();
        this.f8602g = y4fVar;
        C2231a c2231a = new C2231a(y4fVar);
        ViewOnTouchListenerC2234b viewOnTouchListenerC2234b = new ViewOnTouchListenerC2234b(context, c2231a, 25.0f);
        this.f8601f = viewOnTouchListenerC2234b;
        this.f8599d = new C2233a(((WindowManager) op0.m42515e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), viewOnTouchListenerC2234b, c2231a);
        this.f8605s = true;
        setEGLContextClientVersion(2);
        setRenderer(c2231a);
        setOnTouchListener(viewOnTouchListenerC2234b);
    }
}
