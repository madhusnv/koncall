package org.bouncycastle.crypto.macs;

import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SipHash128 extends SipHash {
    public SipHash128() {
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        this.f27701m = ((this.f27701m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.f44602v2 ^= 238;
        applySipRounds(this.f27700d);
        long j6 = this.f44600v0;
        long j10 = this.f44601v1;
        long j11 = ((j6 ^ j10) ^ this.f44602v2) ^ this.f44603v3;
        this.f44601v1 = j10 ^ 221;
        applySipRounds(this.f27700d);
        long j12 = ((this.f44600v0 ^ this.f44601v1) ^ this.f44602v2) ^ this.f44603v3;
        reset();
        Pack.longToLittleEndian(j11, bArr, i10);
        Pack.longToLittleEndian(j12, bArr, i10 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash128-" + this.f27699c + "-" + this.f27700d;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.macs.SipHash, org.bouncycastle.crypto.Mac
    public void reset() {
        super.reset();
        this.f44601v1 ^= 238;
    }

    public SipHash128(int i10, int i11) {
        super(i10, i11);
    }

    @Override // org.bouncycastle.crypto.macs.SipHash
    public long doFinal() {
        throw new UnsupportedOperationException("doFinal() is not supported");
    }
}
