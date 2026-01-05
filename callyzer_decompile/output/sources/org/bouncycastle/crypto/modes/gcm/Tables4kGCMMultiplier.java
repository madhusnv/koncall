package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class Tables4kGCMMultiplier implements GCMMultiplier {

    /* renamed from: H */
    private byte[] f27724H;

    /* renamed from: T */
    private long[][] f27725T;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f27725T == null) {
            this.f27725T = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (GCMUtil.areEqual(this.f27724H, bArr) != 0) {
            return;
        }
        byte[] bArr2 = new byte[16];
        this.f27724H = bArr2;
        GCMUtil.copy(bArr, bArr2);
        GCMUtil.asLongs(this.f27724H, this.f27725T[1]);
        long[] jArr = this.f27725T[1];
        GCMUtil.multiplyP7(jArr, jArr);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr2 = this.f27725T;
            GCMUtil.divideP(jArr2[i10 >> 1], jArr2[i10]);
            long[][] jArr3 = this.f27725T;
            GCMUtil.xor(jArr3[i10], jArr3[1], jArr3[i10 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.f27725T[bArr[15] & 255];
        long j6 = jArr[0];
        long j10 = jArr[1];
        for (int i10 = 14; i10 >= 0; i10--) {
            long[] jArr2 = this.f27725T[bArr[i10] & 255];
            long j11 = j10 << 56;
            j10 = ((j10 >>> 8) | (j6 << 56)) ^ jArr2[1];
            j6 = (((((j6 >>> 8) ^ jArr2[0]) ^ j11) ^ (j11 >>> 1)) ^ (j11 >>> 2)) ^ (j11 >>> 7);
        }
        Pack.longToBigEndian(j6, bArr, 0);
        Pack.longToBigEndian(j10, bArr, 8);
    }
}
