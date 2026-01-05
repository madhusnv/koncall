package s0;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import c0.a0;
import com.skydoves.balloon.internals.DefinitionKt;
import i0.m0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import og.u1;
import og.y0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s0.i */
/* loaded from: classes.dex */
public abstract class AbstractC6705i {

    /* renamed from: a */
    public static final int[] f32027a = {12344};

    /* renamed from: b */
    public static final int[] f32028b = {12445, 13632, 12344};

    /* renamed from: c */
    public static final String f32029c;

    /* renamed from: d */
    public static final String f32030d;

    /* renamed from: e */
    public static final C6700d f32031e;

    /* renamed from: f */
    public static final C6700d f32032f;

    /* renamed from: g */
    public static final C6700d f32033g;

    /* renamed from: h */
    public static final FloatBuffer f32034h;

    /* renamed from: i */
    public static final FloatBuffer f32035i;

    /* renamed from: j */
    public static final C6699c f32036j;

    static {
        Locale locale = Locale.US;
        f32029c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f32030d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        f32031e = new C6700d(0);
        f32032f = new C6700d(1);
        f32033g = new C6700d(2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        f32034h = floatBufferAsFloatBuffer;
        float[] fArr = {DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, 1.0f, 1.0f};
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr);
        floatBufferAsFloatBuffer2.position(0);
        f32035i = floatBufferAsFloatBuffer2;
        f32036j = new C6699c(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* renamed from: a */
    public static void m12832a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, ": EGL error: 0x");
        sbM11245p.append(Integer.toHexString(iEglGetError));
        throw new IllegalStateException(sbM11245p.toString());
    }

    /* renamed from: b */
    public static void m12833b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, ": GL error 0x");
        sbM11245p.append(Integer.toHexString(iGlGetError));
        throw new IllegalStateException(sbM11245p.toString());
    }

    /* renamed from: c */
    public static void m12834c(Thread thread) {
        y0.m11056f("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    /* renamed from: d */
    public static void m12835d(AtomicBoolean atomicBoolean, boolean z6) {
        y0.m11056f(z6 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z6 == atomicBoolean.get());
    }

    /* renamed from: e */
    public static void m12836e(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalStateException(AbstractC5601a.m11238i("Unable to locate '", str, "' in program"));
        }
    }

    /* renamed from: f */
    public static HashMap m12837f(a0 a0Var) {
        Object c6704h;
        EnumC6702f enumC6702f;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        EnumC6702f[] enumC6702fArrValues = EnumC6702f.values();
        int length = enumC6702fArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            EnumC6702f enumC6702f2 = enumC6702fArrValues[i10];
            C6700d c6700d = (C6700d) map.get(enumC6702f2);
            if (c6700d != null) {
                c6704h = new C6704h(a0Var, c6700d);
            } else if (enumC6702f2 == EnumC6702f.YUV || enumC6702f2 == (enumC6702f = EnumC6702f.DEFAULT)) {
                c6704h = new C6704h(a0Var, enumC6702f2);
            } else {
                y0.m11056f("Unhandled input format: " + enumC6702f2, enumC6702f2 == EnumC6702f.UNKNOWN);
                if (a0Var.m2138a()) {
                    c6704h = new C6701e("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    C6700d c6700d2 = (C6700d) map.get(enumC6702f);
                    c6704h = c6700d2 != null ? new C6704h(a0Var, c6700d2) : new C6704h(a0Var, enumC6702f);
                }
            }
            Objects.toString(enumC6702f2);
            c6704h.toString();
            map2.put(enumC6702f2, c6704h);
        }
        return map2;
    }

    /* renamed from: g */
    public static int m12838g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m12833b("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        m12833b("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m12833b("glTexParameter");
        return i10;
    }

    /* renamed from: h */
    public static EGLSurface m12839h(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        m12832a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: i */
    public static String m12840i() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return m0.m7379l(strGroup, ".", strGroup2);
    }

    /* renamed from: j */
    public static int m12841j(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        m12833b("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        u1.m10951j("GLUtils");
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + strGlGetShaderInfoLog);
    }
}
