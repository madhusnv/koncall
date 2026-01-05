package p001o;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes2.dex */
public abstract class vs7 {

    /* renamed from: a */
    public static final int[] f50820a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b */
    public static final int[] f50821b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c */
    public static final int[] f50822c = {12445, 13120, 12344, 12344};

    /* renamed from: d */
    public static final int[] f50823d = {12445, 13632, 12344, 12344};

    /* renamed from: e */
    public static final int[] f50824e = {12344};

    /* renamed from: o.vs7$a */
    public static final class C17668a extends Exception {
        public C17668a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static void m53368a(int i, int i2, int i3) throws C17668a {
        GLES20.glBindTexture(i, i2);
        m53369b();
        GLES20.glTexParameteri(i, Data.MAX_DATA_BYTES, i3);
        m53369b();
        GLES20.glTexParameteri(i, 10241, i3);
        m53369b();
        GLES20.glTexParameteri(i, 10242, 33071);
        m53369b();
        GLES20.glTexParameteri(i, 10243, 33071);
        m53369b();
    }

    /* renamed from: b */
    public static void m53369b() throws C17668a {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new C17668a(sb.toString());
        }
    }

    /* renamed from: c */
    public static void m53370c(boolean z, String str) throws C17668a {
        if (!z) {
            throw new C17668a(str);
        }
    }

    /* renamed from: d */
    public static FloatBuffer m53371d(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: e */
    public static FloatBuffer m53372e(float[] fArr) {
        return (FloatBuffer) m53371d(fArr.length).put(fArr).flip();
    }

    /* renamed from: f */
    public static int m53373f() throws C17668a {
        int iM53374g = m53374g();
        m53368a(36197, iM53374g, 9729);
        return iM53374g;
    }

    /* renamed from: g */
    public static int m53374g() throws C17668a {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m53369b();
        return iArr[0];
    }

    /* renamed from: h */
    public static boolean m53375h(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    /* renamed from: i */
    public static boolean m53376i(Context context) {
        int i = sqi.f45790a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(sqi.f45792c) || "XT1650".equals(sqi.f45793d))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return m53375h("EGL_EXT_protected_content");
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m53377j() {
        return m53375h("EGL_KHR_surfaceless_context");
    }

    /* renamed from: k */
    public static void m53378k(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }
}
