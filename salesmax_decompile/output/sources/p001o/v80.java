package p001o;

import java.util.Arrays;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public abstract class v80 {
    /* renamed from: a */
    public static byte[] m52451a(byte[] bArr) {
        if (bArr.length >= 16) {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        bArrCopyOf[bArr.length] = -128;
        return bArrCopyOf;
    }

    /* renamed from: b */
    public static byte[] m52452b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & Opcodes.I2D)) ^ bArr2[15]);
        return bArr2;
    }
}
