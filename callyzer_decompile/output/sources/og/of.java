package og;

import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class of {

    /* renamed from: a */
    public static final /* synthetic */ int f26709a = 0;

    /* renamed from: a */
    public static byte[] m10802a(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        int fieldSize = (ellipticCurve.getField().getFieldSize() + 7) / 8;
        int i10 = (fieldSize * 2) + 1;
        byte[] bArr = new byte[i10];
        bArr[0] = 4;
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        int i11 = 0;
        while (byteArray[i11] == 0) {
            i11++;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(byteArray, i11, byteArray.length);
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        int i12 = 0;
        while (byteArray2[i12] == 0) {
            i12++;
        }
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(byteArray2, i12, byteArray2.length);
        System.arraycopy(bArrCopyOfRange, 0, bArr, (fieldSize + 1) - bArrCopyOfRange.length, bArrCopyOfRange.length);
        System.arraycopy(bArrCopyOfRange2, 0, bArr, i10 - bArrCopyOfRange2.length, bArrCopyOfRange2.length);
        return bArr;
    }
}
