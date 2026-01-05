package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class qi1 {
    /* renamed from: a */
    public static Bitmap m45507a(byte[] bArr, int i, BitmapFactory.Options options) throws IOException {
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (bitmapDecodeByteArray == null) {
            throw byc.m19921a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            im6 im6Var = new im6(byteArrayInputStream);
            byteArrayInputStream.close();
            int iM32364s = im6Var.m32364s();
            if (iM32364s == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(iM32364s);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
