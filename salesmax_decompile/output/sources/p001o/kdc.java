package p001o;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p001o.av7;
import p001o.dn7;

/* loaded from: classes2.dex */
public class kdc {

    /* renamed from: c */
    public Thread f31984c;

    /* renamed from: g */
    public EGLConfig f31988g;

    /* renamed from: i */
    public Surface f31990i;

    /* renamed from: a */
    public final AtomicBoolean f31982a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Map f31983b = new HashMap();

    /* renamed from: d */
    public EGLDisplay f31985d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e */
    public EGLContext f31986e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f */
    public int[] f31987f = dn7.f20294a;

    /* renamed from: h */
    public EGLSurface f31989h = EGL14.EGL_NO_SURFACE;

    /* renamed from: j */
    public Map f31991j = Collections.emptyMap();

    /* renamed from: k */
    public dn7.AbstractC13003f f31992k = null;

    /* renamed from: l */
    public dn7.EnumC13002e f31993l = dn7.EnumC13002e.UNKNOWN;

    /* renamed from: m */
    public int f31994m = -1;

    /* renamed from: a */
    public final void m35466a(int i) {
        GLES20.glActiveTexture(33984);
        dn7.m23590g("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        dn7.m23590g("glBindTexture");
    }

    /* renamed from: b */
    public final void m35467b(y16 y16Var, av7.AbstractC12255a abstractC12255a) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f31985d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f31985d, iArr, 0, iArr, 1)) {
            this.f31985d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (abstractC12255a != null) {
            abstractC12255a.mo17872c(iArr[0] + "." + iArr[1]);
        }
        int i = y16Var.m57104d() ? 10 : 8;
        int[] iArr2 = {12324, i, 12323, i, 12322, i, 12321, y16Var.m57104d() ? 2 : 8, 12325, 0, 12326, 0, 12352, y16Var.m57104d() ? 64 : 4, 12610, y16Var.m57104d() ? -1 : 1, 12339, 5, 12344};
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f31985d, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        int[] iArr3 = new int[3];
        iArr3[0] = 12440;
        iArr3[1] = y16Var.m57104d() ? 3 : 2;
        iArr3[2] = 12344;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f31985d, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr3, 0);
        dn7.m23589f("eglCreateContext");
        this.f31988g = eGLConfig;
        this.f31986e = eGLContextEglCreateContext;
        int[] iArr4 = new int[1];
        EGL14.eglQueryContext(this.f31985d, eGLContextEglCreateContext, 12440, iArr4, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("EGLContext created, client version ");
        sb.append(iArr4[0]);
    }

    /* renamed from: c */
    public ngc m35468c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f31985d;
            EGLConfig eGLConfig = this.f31988g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceM23600q = dn7.m23600q(eGLDisplay, eGLConfig, surface, this.f31987f);
            Size sizeM23607x = dn7.m23607x(this.f31985d, eGLSurfaceM23600q);
            return ngc.m40544d(eGLSurfaceM23600q, sizeM23607x.getWidth(), sizeM23607x.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            wja.m54639m("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: d */
    public final void m35469d() {
        EGLDisplay eGLDisplay = this.f31985d;
        EGLConfig eGLConfig = this.f31988g;
        Objects.requireNonNull(eGLConfig);
        this.f31989h = dn7.m23597n(eGLDisplay, eGLConfig, 1, 1);
    }

    /* renamed from: e */
    public final iwc m35470e(y16 y16Var) {
        dn7.m23592i(this.f31982a, false);
        try {
            m35467b(y16Var, null);
            m35469d();
            m35474i(this.f31989h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f31985d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new iwc(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            wja.m54639m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new iwc("", "");
        } finally {
            m35477l();
        }
    }

    /* renamed from: f */
    public ngc m35471f(Surface surface) {
        fgd.m26666j(this.f31983b.containsKey(surface), "The surface is not registered.");
        ngc ngcVar = (ngc) this.f31983b.get(surface);
        Objects.requireNonNull(ngcVar);
        return ngcVar;
    }

    /* renamed from: g */
    public int m35472g() {
        dn7.m23592i(this.f31982a, true);
        dn7.m23591h(this.f31984c);
        return this.f31994m;
    }

    /* renamed from: h */
    public av7 mo35473h(y16 y16Var, Map map) {
        dn7.m23592i(this.f31982a, false);
        av7.AbstractC12255a abstractC12255aM17865a = av7.m17865a();
        try {
            if (y16Var.m57104d()) {
                iwc iwcVarM35470e = m35470e(y16Var);
                String str = (String) fgd.m26663g((String) iwcVarM35470e.f29291a);
                String str2 = (String) fgd.m26663g((String) iwcVarM35470e.f29292b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    wja.m54638l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    y16Var = y16.f54703d;
                }
                this.f31987f = dn7.m23594k(str2, y16Var);
                abstractC12255aM17865a.mo17873d(str);
                abstractC12255aM17865a.mo17871b(str2);
            }
            m35467b(y16Var, abstractC12255aM17865a);
            m35469d();
            m35474i(this.f31989h);
            abstractC12255aM17865a.mo17874e(dn7.m23606w());
            this.f31991j = dn7.m23598o(y16Var, map);
            int iM23599p = dn7.m23599p();
            this.f31994m = iM23599p;
            m35484s(iM23599p);
            this.f31984c = Thread.currentThread();
            this.f31982a.set(true);
            return abstractC12255aM17865a.mo17870a();
        } catch (IllegalArgumentException | IllegalStateException e) {
            m35477l();
            throw e;
        }
    }

    /* renamed from: i */
    public void m35474i(EGLSurface eGLSurface) {
        fgd.m26663g(this.f31985d);
        fgd.m26663g(this.f31986e);
        if (!EGL14.eglMakeCurrent(this.f31985d, eGLSurface, eGLSurface, this.f31986e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    /* renamed from: j */
    public void m35475j(Surface surface) {
        dn7.m23592i(this.f31982a, true);
        dn7.m23591h(this.f31984c);
        if (this.f31983b.containsKey(surface)) {
            return;
        }
        this.f31983b.put(surface, dn7.f20305l);
    }

    /* renamed from: k */
    public void mo35476k() {
        if (this.f31982a.getAndSet(false)) {
            dn7.m23591h(this.f31984c);
            m35477l();
        }
    }

    /* renamed from: l */
    public final void m35477l() {
        Iterator it = this.f31991j.values().iterator();
        while (it.hasNext()) {
            ((dn7.AbstractC13003f) it.next()).m23612b();
        }
        this.f31991j = Collections.emptyMap();
        this.f31992k = null;
        if (!Objects.equals(this.f31985d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f31985d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (ngc ngcVar : this.f31983b.values()) {
                if (!Objects.equals(ngcVar.mo20245a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f31985d, ngcVar.mo20245a())) {
                    dn7.m23588e("eglDestroySurface");
                }
            }
            this.f31983b.clear();
            if (!Objects.equals(this.f31989h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f31985d, this.f31989h);
                this.f31989h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f31986e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f31985d, this.f31986e);
                this.f31986e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f31985d);
            this.f31985d = EGL14.EGL_NO_DISPLAY;
        }
        this.f31988g = null;
        this.f31994m = -1;
        this.f31993l = dn7.EnumC13002e.UNKNOWN;
        this.f31990i = null;
        this.f31984c = null;
    }

    /* renamed from: m */
    public void m35478m(Surface surface, boolean z) {
        if (this.f31990i == surface) {
            this.f31990i = null;
            m35474i(this.f31989h);
        }
        ngc ngcVar = z ? (ngc) this.f31983b.remove(surface) : (ngc) this.f31983b.put(surface, dn7.f20305l);
        if (ngcVar == null || ngcVar == dn7.f20305l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f31985d, ngcVar.mo20245a());
        } catch (RuntimeException e) {
            wja.m54639m("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    /* renamed from: n */
    public void m35479n(long j, float[] fArr, Surface surface) {
        dn7.m23592i(this.f31982a, true);
        dn7.m23591h(this.f31984c);
        ngc ngcVarM35471f = m35471f(surface);
        if (ngcVarM35471f == dn7.f20305l) {
            ngcVarM35471f = m35468c(surface);
            if (ngcVarM35471f == null) {
                return;
            } else {
                this.f31983b.put(surface, ngcVarM35471f);
            }
        }
        if (surface != this.f31990i) {
            m35474i(ngcVarM35471f.mo20245a());
            this.f31990i = surface;
            GLES20.glViewport(0, 0, ngcVarM35471f.mo20247c(), ngcVarM35471f.mo20246b());
            GLES20.glScissor(0, 0, ngcVarM35471f.mo20247c(), ngcVarM35471f.mo20246b());
        }
        dn7.AbstractC13003f abstractC13003f = (dn7.AbstractC13003f) fgd.m26663g(this.f31992k);
        if (abstractC13003f instanceof dn7.C13004g) {
            ((dn7.C13004g) abstractC13003f).m23619h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        dn7.m23590g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f31985d, ngcVarM35471f.mo20245a(), j);
        if (EGL14.eglSwapBuffers(this.f31985d, ngcVarM35471f.mo20245a())) {
            return;
        }
        wja.m54638l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m35478m(surface, false);
    }

    /* renamed from: o */
    public void m35480o(dn7.EnumC13002e enumC13002e) {
        dn7.m23592i(this.f31982a, true);
        dn7.m23591h(this.f31984c);
        if (this.f31993l != enumC13002e) {
            this.f31993l = enumC13002e;
            m35484s(this.f31994m);
        }
    }

    /* renamed from: p */
    public Bitmap m35481p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        m35482q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.m4652g(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    /* renamed from: q */
    public final void m35482q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        fgd.m26658b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        fgd.m26658b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iM23604u = dn7.m23604u();
        GLES20.glActiveTexture(33985);
        dn7.m23590g("glActiveTexture");
        GLES20.glBindTexture(3553, iM23604u);
        dn7.m23590g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        dn7.m23590g("glTexImage2D");
        GLES20.glTexParameteri(3553, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iM23603t = dn7.m23603t();
        GLES20.glBindFramebuffer(36160, iM23603t);
        dn7.m23590g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iM23604u, 0);
        dn7.m23590g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        dn7.m23590g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f31994m);
        dn7.m23590g("glBindTexture");
        this.f31990i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        dn7.AbstractC13003f abstractC13003f = (dn7.AbstractC13003f) fgd.m26663g(this.f31992k);
        if (abstractC13003f instanceof dn7.C13004g) {
            ((dn7.C13004g) abstractC13003f).m23619h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        dn7.m23590g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        dn7.m23590g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        dn7.m23602s(iM23604u);
        dn7.m23601r(iM23603t);
        m35466a(this.f31994m);
    }

    /* renamed from: r */
    public void m35483r(Surface surface) {
        dn7.m23592i(this.f31982a, true);
        dn7.m23591h(this.f31984c);
        m35478m(surface, true);
    }

    /* renamed from: s */
    public void m35484s(int i) {
        dn7.AbstractC13003f abstractC13003f = (dn7.AbstractC13003f) this.f31991j.get(this.f31993l);
        if (abstractC13003f == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f31993l);
        }
        if (this.f31992k != abstractC13003f) {
            this.f31992k = abstractC13003f;
            abstractC13003f.mo23616f();
            StringBuilder sb = new StringBuilder();
            sb.append("Using program for input format ");
            sb.append(this.f31993l);
            sb.append(": ");
            sb.append(this.f31992k);
        }
        m35466a(i);
    }
}
