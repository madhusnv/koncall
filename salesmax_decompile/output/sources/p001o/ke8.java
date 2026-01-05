package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.InterfaceC1893c;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class ke8 {

    /* renamed from: o.ke8$a */
    public static final class C14815a extends Exception {

        /* renamed from: a */
        public final a f32109a;

        /* renamed from: o.ke8$a$a */
        public enum a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public C14815a(String str, a aVar) {
            super(str);
            this.f32109a = aVar;
        }
    }

    /* renamed from: a */
    public static Rect m35528a(Size size, Rational rational) {
        int i;
        if (!m35535h(rational)) {
            wja.m54638l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f3) {
            int iRound = Math.round((f / numerator) * denominator);
            i = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f2 / denominator) * numerator);
            int i3 = (width - iRound2) / 2;
            width = iRound2;
            i = 0;
            i2 = i3;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    /* renamed from: b */
    public static Bitmap m35529b(InterfaceC1893c interfaceC1893c) {
        int iMo4657l = interfaceC1893c.mo4657l();
        if (iMo4657l == 1) {
            return m35531d(interfaceC1893c);
        }
        if (iMo4657l == 35) {
            return ImageProcessingUtil.m4648c(interfaceC1893c);
        }
        if (iMo4657l == 256 || iMo4657l == 4101) {
            return m35530c(interfaceC1893c);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC1893c.mo4657l() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    /* renamed from: c */
    public static Bitmap m35530c(InterfaceC1893c interfaceC1893c) {
        byte[] bArrM35537j = m35537j(interfaceC1893c);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM35537j, 0, bArrM35537j.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    /* renamed from: d */
    public static Bitmap m35531d(InterfaceC1893c interfaceC1893c) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(interfaceC1893c.getWidth(), interfaceC1893c.getHeight(), Bitmap.Config.ARGB_8888);
        interfaceC1893c.u1()[0].getBuffer().rewind();
        ImageProcessingUtil.m4652g(bitmapCreateBitmap, interfaceC1893c.u1()[0].getBuffer(), interfaceC1893c.u1()[0].mo4658a());
        return bitmapCreateBitmap;
    }

    /* renamed from: e */
    public static ByteBuffer m35532e(Bitmap bitmap) {
        fgd.m26658b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.m4651f(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    /* renamed from: f */
    public static Rational m35533f(int i, Rational rational) {
        return (i == 90 || i == 270) ? m35534g(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    /* renamed from: g */
    public static Rational m35534g(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* renamed from: h */
    public static boolean m35535h(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    /* renamed from: i */
    public static boolean m35536i(int i) {
        return i == 256 || i == 4101;
    }

    /* renamed from: j */
    public static byte[] m35537j(InterfaceC1893c interfaceC1893c) {
        if (!m35536i(interfaceC1893c.mo4657l())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC1893c.mo4657l());
        }
        ByteBuffer buffer = interfaceC1893c.u1()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    /* renamed from: k */
    public static Bitmap m35538k(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: l */
    public static byte[] m35539l(InterfaceC1893c interfaceC1893c, Rect rect, int i, int i2) throws C14815a {
        if (interfaceC1893c.mo4657l() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC1893c.mo4657l());
        }
        YuvImage yuvImage = new YuvImage(m35540m(interfaceC1893c), 17, interfaceC1893c.getWidth(), interfaceC1893c.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mm6 mm6Var = new mm6(byteArrayOutputStream, hm6.m30788b(interfaceC1893c, i2));
        if (rect == null) {
            rect = new Rect(0, 0, interfaceC1893c.getWidth(), interfaceC1893c.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i, mm6Var)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new C14815a("YuvImage failed to encode jpeg.", C14815a.a.ENCODE_FAILED);
    }

    /* renamed from: m */
    public static byte[] m35540m(InterfaceC1893c interfaceC1893c) {
        InterfaceC1893c.a aVar = interfaceC1893c.u1()[0];
        InterfaceC1893c.a aVar2 = interfaceC1893c.u1()[1];
        InterfaceC1893c.a aVar3 = interfaceC1893c.u1()[2];
        ByteBuffer buffer = aVar.getBuffer();
        ByteBuffer buffer2 = aVar2.getBuffer();
        ByteBuffer buffer3 = aVar3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[((interfaceC1893c.getWidth() * interfaceC1893c.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i = 0; i < interfaceC1893c.getHeight(); i++) {
            buffer.get(bArr, width, interfaceC1893c.getWidth());
            width += interfaceC1893c.getWidth();
            buffer.position(Math.min(iRemaining, (buffer.position() - interfaceC1893c.getWidth()) + aVar.mo4658a()));
        }
        int height = interfaceC1893c.getHeight() / 2;
        int width2 = interfaceC1893c.getWidth() / 2;
        int iMo4658a = aVar3.mo4658a();
        int iMo4658a2 = aVar2.mo4658a();
        int iMo4659b = aVar3.mo4659b();
        int iMo4659b2 = aVar2.mo4659b();
        byte[] bArr2 = new byte[iMo4658a];
        byte[] bArr3 = new byte[iMo4658a2];
        for (int i2 = 0; i2 < height; i2++) {
            buffer3.get(bArr2, 0, Math.min(iMo4658a, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(iMo4658a2, buffer2.remaining()));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < width2; i5++) {
                int i6 = width + 1;
                bArr[width] = bArr2[i3];
                width = i6 + 1;
                bArr[i6] = bArr3[i4];
                i3 += iMo4659b;
                i4 += iMo4659b2;
            }
        }
        return bArr;
    }
}
