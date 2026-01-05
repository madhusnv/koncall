package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes3.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* renamed from: x */
    private long[] f27722x;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j6, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        if (j6 > 0) {
            long[] jArr = new long[2];
            GCMUtil.copy(this.f27722x, jArr);
            do {
                if ((1 & j6) != 0) {
                    GCMUtil.multiply(jArrOneAsLongs, jArr);
                }
                GCMUtil.square(jArr, jArr);
                j6 >>>= 1;
            } while (j6 > 0);
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f27722x = GCMUtil.asLongs(bArr);
    }
}
