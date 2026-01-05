package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
class SeedDerive {

    /* renamed from: I */
    private final byte[] f28076I;
    private final Digest digest;

    /* renamed from: j */
    private int f28077j;
    private final byte[] masterSeed;

    /* renamed from: q */
    private int f28078q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f28076I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z6) {
        deriveSeed(bArr, z6, 0);
    }

    public byte[] getI() {
        return this.f28076I;
    }

    public int getJ() {
        return this.f28077j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f28078q;
    }

    public void setJ(int i10) {
        this.f28077j = i10;
    }

    public void setQ(int i10) {
        this.f28078q = i10;
    }

    public void deriveSeed(byte[] bArr, boolean z6, int i10) {
        deriveSeed(bArr, i10);
        if (z6) {
            this.f28077j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i10) {
        if (bArr.length - i10 < this.digest.getDigestSize()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Digest digest = this.digest;
        byte[] bArr2 = this.f28076I;
        digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (this.f28078q >>> 24));
        this.digest.update((byte) (this.f28078q >>> 16));
        this.digest.update((byte) (this.f28078q >>> 8));
        this.digest.update((byte) this.f28078q);
        this.digest.update((byte) (this.f28077j >>> 8));
        this.digest.update((byte) this.f28077j);
        this.digest.update((byte) -1);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.masterSeed;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, i10);
        return bArr;
    }
}
