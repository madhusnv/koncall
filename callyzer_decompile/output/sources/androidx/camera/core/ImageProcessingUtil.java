package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import c0.b1;
import c0.p0;
import c0.x0;
import c0.z0;
import i0.d1;
import java.nio.ByteBuffer;
import java.util.Locale;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a */
    public static int f1851a;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    /* renamed from: androidx.camera.core.ImageProcessingUtil$a */
    public enum EnumC0224a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* renamed from: a */
    public static void m604a(b1 b1Var) {
        if (!m608e(b1Var)) {
            u1.m10943b("ImageProcessingUtil");
            return;
        }
        int iMo2136b = b1Var.mo2136b();
        int height = b1Var.getHeight();
        int iMo2142p = b1Var.mo2137l()[0].mo2142p();
        int iMo2142p2 = b1Var.mo2137l()[1].mo2142p();
        int iMo2142p3 = b1Var.mo2137l()[2].mo2142p();
        int iMo2140J = b1Var.mo2137l()[0].mo2140J();
        int iMo2140J2 = b1Var.mo2137l()[1].mo2140J();
        if ((nativeShiftPixel(b1Var.mo2137l()[0].mo2141a(), iMo2142p, b1Var.mo2137l()[1].mo2141a(), iMo2142p2, b1Var.mo2137l()[2].mo2141a(), iMo2142p3, iMo2140J, iMo2140J2, iMo2136b, height, iMo2140J, iMo2140J2, iMo2140J2) != 0 ? EnumC0224a.ERROR_CONVERSION : EnumC0224a.SUCCESS) == EnumC0224a.ERROR_CONVERSION) {
            u1.m10943b("ImageProcessingUtil");
        }
    }

    /* renamed from: b */
    public static p0 m605b(b1 b1Var, d1 d1Var, ByteBuffer byteBuffer, int i10, boolean z6) {
        if (!m608e(b1Var)) {
            u1.m10943b("ImageProcessingUtil");
            return null;
        }
        System.currentTimeMillis();
        if (!m607d(i10)) {
            u1.m10943b("ImageProcessingUtil");
            return null;
        }
        Surface surface = d1Var.getSurface();
        int iMo2136b = b1Var.mo2136b();
        int height = b1Var.getHeight();
        int iMo2142p = b1Var.mo2137l()[0].mo2142p();
        int iMo2142p2 = b1Var.mo2137l()[1].mo2142p();
        int iMo2142p3 = b1Var.mo2137l()[2].mo2142p();
        int iMo2140J = b1Var.mo2137l()[0].mo2140J();
        int iMo2140J2 = b1Var.mo2137l()[1].mo2140J();
        if ((nativeConvertAndroid420ToABGR(b1Var.mo2137l()[0].mo2141a(), iMo2142p, b1Var.mo2137l()[1].mo2141a(), iMo2142p2, b1Var.mo2137l()[2].mo2141a(), iMo2142p3, iMo2140J, iMo2140J2, surface, byteBuffer, iMo2136b, height, z6 ? iMo2140J : 0, z6 ? iMo2140J2 : 0, z6 ? iMo2140J2 : 0, i10) != 0 ? EnumC0224a.ERROR_CONVERSION : EnumC0224a.SUCCESS) == EnumC0224a.ERROR_CONVERSION) {
            u1.m10943b("ImageProcessingUtil");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            u1.m10942a("ImageProcessingUtil");
            f1851a++;
        }
        b1 b1VarMo1878h = d1Var.mo1878h();
        if (b1VarMo1878h == null) {
            u1.m10943b("ImageProcessingUtil");
            return null;
        }
        p0 p0Var = new p0(b1VarMo1878h);
        p0Var.m2179h(new x0(b1VarMo1878h, b1Var, 0));
        return p0Var;
    }

    /* renamed from: c */
    public static void m606c(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* renamed from: d */
    public static boolean m607d(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    /* renamed from: e */
    public static boolean m608e(b1 b1Var) {
        return b1Var.getFormat() == 35 && b1Var.mo2137l().length == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0101  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c0.p0 m609f(c0.b1 r26, i0.d1 r27, android.media.ImageWriter r28, java.nio.ByteBuffer r29, java.nio.ByteBuffer r30, java.nio.ByteBuffer r31, int r32) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProcessingUtil.m609f(c0.b1, i0.d1, android.media.ImageWriter, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int):c0.p0");
    }

    /* renamed from: g */
    public static p0 m610g(b1 b1Var, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i10) {
        if (!m608e(b1Var)) {
            u1.m10943b("ImageProcessingUtil");
            return null;
        }
        if (!m607d(i10)) {
            u1.m10943b("ImageProcessingUtil");
            return null;
        }
        if (i10 == 0 && b1Var.mo2137l().length == 3 && b1Var.mo2137l()[1].mo2140J() == 2 && nativeGetYUVImageVUOff(b1Var.mo2137l()[2].mo2141a(), b1Var.mo2137l()[1].mo2141a()) == -1) {
            return null;
        }
        int i11 = i10 % 180;
        int iMo2136b = i11 == 0 ? b1Var.mo2136b() : b1Var.getHeight();
        int height = i11 == 0 ? b1Var.getHeight() : b1Var.mo2136b();
        ByteBuffer byteBufferNativeNewDirectByteBuffer = nativeNewDirectByteBuffer(byteBuffer5, 1, byteBuffer5.capacity());
        if (nativeRotateYUV(b1Var.mo2137l()[0].mo2141a(), b1Var.mo2137l()[0].mo2142p(), b1Var.mo2137l()[1].mo2141a(), b1Var.mo2137l()[1].mo2142p(), b1Var.mo2137l()[2].mo2141a(), b1Var.mo2137l()[2].mo2142p(), b1Var.mo2137l()[2].mo2140J(), byteBuffer4, iMo2136b, 1, byteBufferNativeNewDirectByteBuffer, iMo2136b, 2, byteBuffer5, iMo2136b, 2, byteBuffer, byteBuffer2, byteBuffer3, b1Var.mo2136b(), b1Var.getHeight(), i10) == 0) {
            return new p0(new z0(b1Var, byteBuffer4, byteBufferNativeNewDirectByteBuffer, byteBuffer5, iMo2136b, height));
        }
        u1.m10943b("ImageProcessingUtil");
        return null;
    }

    /* renamed from: h */
    public static void m611h(byte[] bArr, Surface surface) {
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            u1.m10943b("ImageProcessingUtil");
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z6);

    public static native int nativeGetYUVImageVUOff(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public static native ByteBuffer nativeNewDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
