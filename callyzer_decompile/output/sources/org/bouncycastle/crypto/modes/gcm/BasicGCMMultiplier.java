package org.bouncycastle.crypto.modes.gcm;

/* loaded from: classes3.dex */
public class BasicGCMMultiplier implements GCMMultiplier {

    /* renamed from: H */
    private long[] f27723H;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.f27723H = GCMUtil.asLongs(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        GCMUtil.multiply(bArr, this.f27723H);
    }
}
