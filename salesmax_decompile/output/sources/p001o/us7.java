package p001o;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;
import p001o.vs7;

/* loaded from: classes2.dex */
public final class us7 {

    /* renamed from: a */
    public final int f49431a;

    /* renamed from: b */
    public final C17441a[] f49432b;

    /* renamed from: c */
    public final C17442b[] f49433c;

    /* renamed from: d */
    public final Map f49434d;

    /* renamed from: e */
    public final Map f49435e;

    /* renamed from: o.us7$a */
    public static final class C17441a {

        /* renamed from: a */
        public final String f49436a;

        /* renamed from: b */
        public final int f49437b;

        public C17441a(String str, int i) {
            this.f49436a = str;
            this.f49437b = i;
        }

        /* renamed from: a */
        public static C17441a m52003a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, us7.m51998h(bArr));
            return new C17441a(str, us7.m51997f(i, str));
        }
    }

    /* renamed from: o.us7$b */
    public static final class C17442b {

        /* renamed from: a */
        public final String f49438a;

        /* renamed from: b */
        public final int f49439b;

        /* renamed from: c */
        public final int f49440c;

        /* renamed from: d */
        public final float[] f49441d = new float[16];

        /* renamed from: e */
        public final int[] f49442e = new int[4];

        public C17442b(String str, int i, int i2) {
            this.f49438a = str;
            this.f49439b = i;
            this.f49440c = i2;
        }

        /* renamed from: a */
        public static C17442b m52004a(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, us7.m51998h(bArr));
            return new C17442b(str, us7.m51999i(i, str), iArr2[0]);
        }
    }

    public us7(String str, String str2) throws vs7.C17668a {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f49431a = iGlCreateProgram;
        vs7.m53369b();
        m51996d(iGlCreateProgram, 35633, str);
        m51996d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        vs7.m53370c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f49434d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f49432b = new C17441a[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            C17441a c17441aM52003a = C17441a.m52003a(this.f49431a, i);
            this.f49432b[i] = c17441aM52003a;
            this.f49434d.put(c17441aM52003a.f49436a, c17441aM52003a);
        }
        this.f49435e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f49431a, 35718, iArr3, 0);
        this.f49433c = new C17442b[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            C17442b c17442bM52004a = C17442b.m52004a(this.f49431a, i2);
            this.f49433c[i2] = c17442bM52004a;
            this.f49435e.put(c17442bM52004a.f49438a, c17442bM52004a);
        }
        vs7.m53369b();
    }

    /* renamed from: d */
    public static void m51996d(int i, int i2, String str) throws vs7.C17668a {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        vs7.m53370c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        vs7.m53369b();
    }

    /* renamed from: f */
    public static int m51997f(int i, String str) {
        return GLES20.glGetAttribLocation(i, str);
    }

    /* renamed from: h */
    public static int m51998h(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    /* renamed from: i */
    public static int m51999i(int i, String str) {
        return GLES20.glGetUniformLocation(i, str);
    }

    /* renamed from: e */
    public int m52000e(String str) throws vs7.C17668a {
        int iM52001g = m52001g(str);
        GLES20.glEnableVertexAttribArray(iM52001g);
        vs7.m53369b();
        return iM52001g;
    }

    /* renamed from: g */
    public final int m52001g(String str) {
        return m51997f(this.f49431a, str);
    }

    /* renamed from: j */
    public int m52002j(String str) {
        return m51999i(this.f49431a, str);
    }
}
