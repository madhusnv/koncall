package p001o;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class kdj extends rf2 {
    public kdj(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: n */
    public static int[] m35485n(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        rf2.m46637k(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        rf2.m46638l(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // p001o.rf2
    /* renamed from: d */
    public int[] mo35486d(int[] iArr, int i) {
        if (iArr.length != mo35487g() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        rf2.m46637k(iArr2, m35485n(this.f43481a, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // p001o.rf2
    /* renamed from: g */
    public int mo35487g() {
        return 24;
    }
}
