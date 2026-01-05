package p001o;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.work.Data;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class dn7 {

    /* renamed from: a */
    public static final int[] f20294a = {12344};

    /* renamed from: b */
    public static final int[] f20295b = {12445, 13632, 12344};

    /* renamed from: c */
    public static final String f20296c;

    /* renamed from: d */
    public static final String f20297d;

    /* renamed from: e */
    public static final rkf f20298e;

    /* renamed from: f */
    public static final rkf f20299f;

    /* renamed from: g */
    public static final rkf f20300g;

    /* renamed from: h */
    public static final float[] f20301h;

    /* renamed from: i */
    public static final FloatBuffer f20302i;

    /* renamed from: j */
    public static final float[] f20303j;

    /* renamed from: k */
    public static final FloatBuffer f20304k;

    /* renamed from: l */
    public static final ngc f20305l;

    /* renamed from: o.dn7$a */
    public class C12998a implements rkf {
        @Override // p001o.rkf
        /* renamed from: a */
        public String mo23610a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    }

    /* renamed from: o.dn7$b */
    public class C12999b implements rkf {
        @Override // p001o.rkf
        /* renamed from: a */
        public String mo23610a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* renamed from: o.dn7$c */
    public class C13000c implements rkf {
        @Override // p001o.rkf
        /* renamed from: a */
        public String mo23610a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    }

    /* renamed from: o.dn7$d */
    public static class C13001d extends AbstractC13003f {
        public C13001d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    /* renamed from: o.dn7$e */
    public enum EnumC13002e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    /* renamed from: o.dn7$f */
    public static abstract class AbstractC13003f {

        /* renamed from: a */
        public int f20306a;

        /* renamed from: b */
        public int f20307b = -1;

        /* renamed from: c */
        public int f20308c = -1;

        /* renamed from: d */
        public int f20309d = -1;

        /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractC13003f(String str, String str2) throws Throwable {
            int iM23608y;
            int iM23608y2;
            int iGlCreateProgram;
            try {
                iM23608y = dn7.m23608y(35633, str);
            } catch (IllegalArgumentException | IllegalStateException e) {
                e = e;
                iM23608y = -1;
                iM23608y2 = -1;
            }
            try {
                iM23608y2 = dn7.m23608y(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                } catch (IllegalArgumentException | IllegalStateException e2) {
                    e = e2;
                    iGlCreateProgram = -1;
                }
                try {
                    dn7.m23590g("glCreateProgram");
                    GLES20.glAttachShader(iGlCreateProgram, iM23608y);
                    dn7.m23590g("glAttachShader");
                    GLES20.glAttachShader(iGlCreateProgram, iM23608y2);
                    dn7.m23590g("glAttachShader");
                    GLES20.glLinkProgram(iGlCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                    if (iArr[0] == 1) {
                        this.f20306a = iGlCreateProgram;
                        m23613c();
                    } else {
                        throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                    }
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    if (iM23608y != -1) {
                        GLES20.glDeleteShader(iM23608y);
                    }
                    if (iM23608y2 != -1) {
                        GLES20.glDeleteShader(iM23608y2);
                    }
                    if (iGlCreateProgram != -1) {
                        GLES20.glDeleteProgram(iGlCreateProgram);
                    }
                    throw e;
                } catch (IllegalStateException e4) {
                    e = e4;
                    if (iM23608y != -1) {
                    }
                    if (iM23608y2 != -1) {
                    }
                    if (iGlCreateProgram != -1) {
                    }
                    throw e;
                }
            } catch (IllegalArgumentException | IllegalStateException e5) {
                e = e5;
                iM23608y2 = -1;
                iGlCreateProgram = iM23608y2;
                if (iM23608y != -1) {
                }
                if (iM23608y2 != -1) {
                }
                if (iGlCreateProgram != -1) {
                }
                throw e;
            }
        }

        /* renamed from: b */
        public void m23612b() {
            GLES20.glDeleteProgram(this.f20306a);
        }

        /* renamed from: c */
        public final void m23613c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f20306a, "aPosition");
            this.f20309d = iGlGetAttribLocation;
            dn7.m23593j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f20306a, "uTransMatrix");
            this.f20307b = iGlGetUniformLocation;
            dn7.m23593j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f20306a, "uAlphaScale");
            this.f20308c = iGlGetUniformLocation2;
            dn7.m23593j(iGlGetUniformLocation2, "uAlphaScale");
        }

        /* renamed from: d */
        public void m23614d(float f) {
            GLES20.glUniform1f(this.f20308c, f);
            dn7.m23590g("glUniform1f");
        }

        /* renamed from: e */
        public void m23615e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f20307b, 1, false, fArr, 0);
            dn7.m23590g("glUniformMatrix4fv");
        }

        /* renamed from: f */
        public void mo23616f() {
            GLES20.glUseProgram(this.f20306a);
            dn7.m23590g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f20309d);
            dn7.m23590g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f20309d, 2, 5126, false, 0, (Buffer) dn7.f20302i);
            dn7.m23590g("glVertexAttribPointer");
            m23615e(dn7.m23595l());
            m23614d(1.0f);
        }
    }

    /* renamed from: o.dn7$g */
    public static class C13004g extends AbstractC13003f {

        /* renamed from: e */
        public int f20310e;

        /* renamed from: f */
        public int f20311f;

        /* renamed from: g */
        public int f20312g;

        public C13004g(y16 y16Var, EnumC13002e enumC13002e) {
            this(y16Var, m23618g(y16Var, enumC13002e));
        }

        /* renamed from: c */
        private void m23617c() {
            m23613c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f20306a, "sTexture");
            this.f20310e = iGlGetUniformLocation;
            dn7.m23593j(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f20306a, "aTextureCoord");
            this.f20312g = iGlGetAttribLocation;
            dn7.m23593j(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f20306a, "uTexMatrix");
            this.f20311f = iGlGetUniformLocation2;
            dn7.m23593j(iGlGetUniformLocation2, "uTexMatrix");
        }

        /* renamed from: g */
        public static rkf m23618g(y16 y16Var, EnumC13002e enumC13002e) {
            if (!y16Var.m57104d()) {
                return dn7.f20298e;
            }
            fgd.m26658b(enumC13002e != EnumC13002e.UNKNOWN, "No default sampler shader available for" + enumC13002e);
            return enumC13002e == EnumC13002e.YUV ? dn7.f20300g : dn7.f20299f;
        }

        @Override // p001o.dn7.AbstractC13003f
        /* renamed from: f */
        public void mo23616f() {
            super.mo23616f();
            GLES20.glUniform1i(this.f20310e, 0);
            GLES20.glEnableVertexAttribArray(this.f20312g);
            dn7.m23590g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f20312g, 2, 5126, false, 0, (Buffer) dn7.f20304k);
            dn7.m23590g("glVertexAttribPointer");
        }

        /* renamed from: h */
        public void m23619h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f20311f, 1, false, fArr, 0);
            dn7.m23590g("glUniformMatrix4fv");
        }

        public C13004g(y16 y16Var, rkf rkfVar) {
            super(y16Var.m57104d() ? dn7.f20297d : dn7.f20296c, dn7.m23605v(rkfVar));
            this.f20310e = -1;
            this.f20311f = -1;
            this.f20312g = -1;
            m23617c();
        }
    }

    static {
        Locale locale = Locale.US;
        f20296c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f20297d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f20298e = new C12998a();
        f20299f = new C12999b();
        f20300g = new C13000c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f20301h = fArr;
        f20302i = m23596m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f20303j = fArr2;
        f20304k = m23596m(fArr2);
        f20305l = ngc.m40544d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* renamed from: e */
    public static void m23588e(String str) {
        try {
            m23589f(str);
        } catch (IllegalStateException e) {
            wja.m54630d("GLUtils", e.toString(), e);
        }
    }

    /* renamed from: f */
    public static void m23589f(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    /* renamed from: g */
    public static void m23590g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    /* renamed from: h */
    public static void m23591h(Thread thread) {
        fgd.m26666j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    /* renamed from: i */
    public static void m23592i(AtomicBoolean atomicBoolean, boolean z) {
        fgd.m26666j(z == atomicBoolean.get(), z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    /* renamed from: j */
    public static void m23593j(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    /* renamed from: k */
    public static int[] m23594k(String str, y16 y16Var) {
        int[] iArr = f20294a;
        if (y16Var.m57103b() != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f20295b;
        }
        wja.m54638l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    /* renamed from: l */
    public static float[] m23595l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    /* renamed from: m */
    public static FloatBuffer m23596m(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    /* renamed from: n */
    public static EGLSurface m23597n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        m23589f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: o */
    public static Map m23598o(y16 y16Var, Map map) {
        Object c13004g;
        EnumC13002e enumC13002e;
        HashMap map2 = new HashMap();
        EnumC13002e[] enumC13002eArrValues = EnumC13002e.values();
        int length = enumC13002eArrValues.length;
        for (int i = 0; i < length; i++) {
            EnumC13002e enumC13002e2 = enumC13002eArrValues[i];
            rkf rkfVar = (rkf) map.get(enumC13002e2);
            if (rkfVar != null) {
                c13004g = new C13004g(y16Var, rkfVar);
            } else if (enumC13002e2 == EnumC13002e.YUV || enumC13002e2 == (enumC13002e = EnumC13002e.DEFAULT)) {
                c13004g = new C13004g(y16Var, enumC13002e2);
            } else {
                fgd.m26666j(enumC13002e2 == EnumC13002e.UNKNOWN, "Unhandled input format: " + enumC13002e2);
                if (y16Var.m57104d()) {
                    c13004g = new C13001d();
                } else {
                    rkf rkfVar2 = (rkf) map.get(enumC13002e);
                    c13004g = rkfVar2 != null ? new C13004g(y16Var, rkfVar2) : new C13004g(y16Var, enumC13002e);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Shader program for input format ");
            sb.append(enumC13002e2);
            sb.append(" created: ");
            sb.append(c13004g);
            map2.put(enumC13002e2, c13004g);
        }
        return map2;
    }

    /* renamed from: p */
    public static int m23599p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m23590g("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m23590g("glBindTexture " + i);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m23590g("glTexParameter");
        return i;
    }

    /* renamed from: q */
    public static EGLSurface m23600q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        m23589f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: r */
    public static void m23601r(int i) {
        GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        m23590g("glDeleteFramebuffers");
    }

    /* renamed from: s */
    public static void m23602s(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        m23590g("glDeleteTextures");
    }

    /* renamed from: t */
    public static int m23603t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        m23590g("glGenFramebuffers");
        return iArr[0];
    }

    /* renamed from: u */
    public static int m23604u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m23590g("glGenTextures");
        return iArr[0];
    }

    /* renamed from: v */
    public static String m23605v(rkf rkfVar) {
        try {
            String strMo23610a = rkfVar.mo23610a("sTexture", "vTextureCoord");
            if (strMo23610a != null && strMo23610a.contains("vTextureCoord") && strMo23610a.contains("sTexture")) {
                return strMo23610a;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    /* renamed from: w */
    public static String m23606w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return IdManager.DEFAULT_VERSION_NAME;
        }
        return ((String) fgd.m26663g(matcher.group(1))) + "." + ((String) fgd.m26663g(matcher.group(2)));
    }

    /* renamed from: x */
    public static Size m23607x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(m23609z(eGLDisplay, eGLSurface, 12375), m23609z(eGLDisplay, eGLSurface, 12374));
    }

    /* renamed from: y */
    public static int m23608y(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m23590g("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        wja.m54638l("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    /* renamed from: z */
    public static int m23609z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0);
        return iArr[0];
    }
}
