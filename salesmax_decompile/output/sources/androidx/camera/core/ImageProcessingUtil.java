package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.AbstractC1892b;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC1893c;
import java.nio.ByteBuffer;
import java.util.Locale;
import p001o.fgd;
import p001o.wja;
import p001o.xtf;
import p001o.zd8;

/* loaded from: classes2.dex */
public abstract class ImageProcessingUtil {

    /* renamed from: a */
    public static int f6090a;

    /* renamed from: androidx.camera.core.ImageProcessingUtil$a */
    public enum EnumC1890a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    /* renamed from: b */
    public static InterfaceC1893c m4647b(zd8 zd8Var, byte[] bArr) {
        fgd.m26657a(zd8Var.mo4670d() == 256);
        fgd.m26663g(bArr);
        Surface surfaceMo4668a = zd8Var.mo4668a();
        fgd.m26663g(surfaceMo4668a);
        if (nativeWriteJpegToSurface(bArr, surfaceMo4668a) != 0) {
            wja.m54629c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        InterfaceC1893c interfaceC1893cMo4669c = zd8Var.mo4669c();
        if (interfaceC1893cMo4669c == null) {
            wja.m54629c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return interfaceC1893cMo4669c;
    }

    /* renamed from: c */
    public static Bitmap m4648c(InterfaceC1893c interfaceC1893c) {
        if (interfaceC1893c.mo4657l() != 35) {
            throw new IllegalArgumentException("Input image format must be YUV_420_888");
        }
        int width = interfaceC1893c.getWidth();
        int height = interfaceC1893c.getHeight();
        int iMo4658a = interfaceC1893c.u1()[0].mo4658a();
        int iMo4658a2 = interfaceC1893c.u1()[1].mo4658a();
        int iMo4658a3 = interfaceC1893c.u1()[2].mo4658a();
        int iMo4659b = interfaceC1893c.u1()[0].mo4659b();
        int iMo4659b2 = interfaceC1893c.u1()[1].mo4659b();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC1893c.getWidth(), interfaceC1893c.getHeight(), Bitmap.Config.ARGB_8888);
        if (nativeConvertAndroid420ToBitmap(interfaceC1893c.u1()[0].getBuffer(), iMo4658a, interfaceC1893c.u1()[1].getBuffer(), iMo4658a2, interfaceC1893c.u1()[2].getBuffer(), iMo4658a3, iMo4659b, iMo4659b2, bitmapCreateBitmap, bitmapCreateBitmap.getRowBytes(), width, height) == 0) {
            return bitmapCreateBitmap;
        }
        throw new UnsupportedOperationException("YUV to RGB conversion failed");
    }

    /* renamed from: d */
    public static InterfaceC1893c m4649d(final InterfaceC1893c interfaceC1893c, zd8 zd8Var, ByteBuffer byteBuffer, int i, boolean z) {
        if (!m4654i(interfaceC1893c)) {
            wja.m54629c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!m4653h(i)) {
            wja.m54629c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (m4650e(interfaceC1893c, zd8Var.mo4668a(), byteBuffer, i, z) == EnumC1890a.ERROR_CONVERSION) {
            wja.m54629c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            wja.m54627a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f6090a)));
            f6090a++;
        }
        final InterfaceC1893c interfaceC1893cMo4669c = zd8Var.mo4669c();
        if (interfaceC1893cMo4669c == null) {
            wja.m54629c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        xtf xtfVar = new xtf(interfaceC1893cMo4669c);
        xtfVar.m4660a(new AbstractC1892b.a() { // from class: o.sd8
            @Override // androidx.camera.core.AbstractC1892b.a
            /* renamed from: b */
            public final void mo4662b(InterfaceC1893c interfaceC1893c2) {
                ImageProcessingUtil.m4655j(interfaceC1893cMo4669c, interfaceC1893c, interfaceC1893c2);
            }
        });
        return xtfVar;
    }

    /* renamed from: e */
    public static EnumC1890a m4650e(InterfaceC1893c interfaceC1893c, Surface surface, ByteBuffer byteBuffer, int i, boolean z) {
        int width = interfaceC1893c.getWidth();
        int height = interfaceC1893c.getHeight();
        int iMo4658a = interfaceC1893c.u1()[0].mo4658a();
        int iMo4658a2 = interfaceC1893c.u1()[1].mo4658a();
        int iMo4658a3 = interfaceC1893c.u1()[2].mo4658a();
        int iMo4659b = interfaceC1893c.u1()[0].mo4659b();
        int iMo4659b2 = interfaceC1893c.u1()[1].mo4659b();
        return nativeConvertAndroid420ToABGR(interfaceC1893c.u1()[0].getBuffer(), iMo4658a, interfaceC1893c.u1()[1].getBuffer(), iMo4658a2, interfaceC1893c.u1()[2].getBuffer(), iMo4658a3, iMo4659b, iMo4659b2, surface, byteBuffer, width, height, z ? iMo4659b : 0, z ? iMo4659b2 : 0, z ? iMo4659b2 : 0, i) != 0 ? EnumC1890a.ERROR_CONVERSION : EnumC1890a.SUCCESS;
    }

    /* renamed from: f */
    public static void m4651f(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    /* renamed from: g */
    public static void m4652g(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    /* renamed from: h */
    public static boolean m4653h(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    /* renamed from: i */
    public static boolean m4654i(InterfaceC1893c interfaceC1893c) {
        return interfaceC1893c.mo4657l() == 35 && interfaceC1893c.u1().length == 3;
    }

    /* renamed from: j */
    public static /* synthetic */ void m4655j(InterfaceC1893c interfaceC1893c, InterfaceC1893c interfaceC1893c2, InterfaceC1893c interfaceC1893c3) {
        if (interfaceC1893c == null || interfaceC1893c2 == null) {
            return;
        }
        interfaceC1893c2.close();
    }

    /* renamed from: k */
    public static boolean m4656k(Surface surface, byte[] bArr) {
        fgd.m26663g(bArr);
        fgd.m26663g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        wja.m54629c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
