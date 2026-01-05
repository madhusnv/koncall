package p001o;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import p001o.vs7;

/* loaded from: classes2.dex */
public final class p26 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g */
    public static final int[] f39199g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a */
    public final Handler f39200a;

    /* renamed from: b */
    public final int[] f39201b;

    /* renamed from: c */
    public EGLDisplay f39202c;

    /* renamed from: d */
    public EGLContext f39203d;

    /* renamed from: e */
    public EGLSurface f39204e;

    /* renamed from: f */
    public SurfaceTexture f39205f;

    /* renamed from: o.p26$a */
    public interface InterfaceC15940a {
    }

    public p26(Handler handler) {
        this(handler, null);
    }

    /* renamed from: a */
    public static EGLConfig m42869a(EGLDisplay eGLDisplay) throws vs7.C17668a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f39199g, 0, eGLConfigArr, 0, 1, iArr, 0);
        vs7.m53370c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, sqi.m48702G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    /* renamed from: b */
    public static EGLContext m42870b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws vs7.C17668a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        vs7.m53370c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    /* renamed from: c */
    public static EGLSurface m42871c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws vs7.C17668a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            vs7.m53370c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        vs7.m53370c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    /* renamed from: e */
    public static void m42872e(int[] iArr) throws vs7.C17668a {
        GLES20.glGenTextures(1, iArr, 0);
        vs7.m53369b();
    }

    /* renamed from: f */
    public static EGLDisplay m42873f() throws vs7.C17668a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        vs7.m53370c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        vs7.m53370c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    /* renamed from: d */
    public final void m42874d() {
    }

    /* renamed from: g */
    public SurfaceTexture m42875g() {
        return (SurfaceTexture) op0.m42515e(this.f39205f);
    }

    /* renamed from: h */
    public void m42876h(int i) throws vs7.C17668a {
        EGLDisplay eGLDisplayM42873f = m42873f();
        this.f39202c = eGLDisplayM42873f;
        EGLConfig eGLConfigM42869a = m42869a(eGLDisplayM42873f);
        EGLContext eGLContextM42870b = m42870b(this.f39202c, eGLConfigM42869a, i);
        this.f39203d = eGLContextM42870b;
        this.f39204e = m42871c(this.f39202c, eGLConfigM42869a, eGLContextM42870b, i);
        m42872e(this.f39201b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f39201b[0]);
        this.f39205f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public void m42877i() {
        this.f39200a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f39205f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f39201b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f39202c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f39202c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f39204e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f39202c, this.f39204e);
            }
            EGLContext eGLContext = this.f39203d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f39202c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f39202c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f39202c);
            }
            this.f39202c = null;
            this.f39203d = null;
            this.f39204e = null;
            this.f39205f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f39200a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m42874d();
        SurfaceTexture surfaceTexture = this.f39205f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public p26(Handler handler, InterfaceC15940a interfaceC15940a) {
        this.f39200a = handler;
        this.f39201b = new int[1];
    }
}
