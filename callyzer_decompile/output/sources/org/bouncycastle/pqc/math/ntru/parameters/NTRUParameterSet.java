package org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: classes3.dex */
public abstract class NTRUParameterSet {
    private final int logQ;

    /* renamed from: n */
    private final int f28185n;
    private final int prfKeyBytes;
    private final int seedBytes;
    private final int sharedKeyBytes;

    public NTRUParameterSet(int i10, int i11, int i12, int i13, int i14) {
        this.f28185n = i10;
        this.logQ = i11;
        this.seedBytes = i12;
        this.prfKeyBytes = i13;
        this.sharedKeyBytes = i14;
    }

    public abstract Polynomial createPolynomial();

    public int logQ() {
        return this.logQ;
    }

    /* renamed from: n */
    public int m11267n() {
        return this.f28185n;
    }

    public int ntruCiphertextBytes() {
        return owcpaBytes();
    }

    public int ntruPublicKeyBytes() {
        return owcpaPublicKeyBytes();
    }

    public int ntruSecretKeyBytes() {
        return owcpaSecretKeyBytes() + this.prfKeyBytes;
    }

    public int owcpaBytes() {
        return ((packDegree() * this.logQ) + 7) / 8;
    }

    public int owcpaMsgBytes() {
        return packTrinaryBytes() * 2;
    }

    public int owcpaPublicKeyBytes() {
        return ((packDegree() * this.logQ) + 7) / 8;
    }

    public int owcpaSecretKeyBytes() {
        return owcpaPublicKeyBytes() + (packTrinaryBytes() * 2);
    }

    public int packDegree() {
        return this.f28185n - 1;
    }

    public int packTrinaryBytes() {
        return (packDegree() + 4) / 5;
    }

    public int prfKeyBytes() {
        return this.prfKeyBytes;
    }

    /* renamed from: q */
    public int m11268q() {
        return 1 << this.logQ;
    }

    public abstract int sampleFgBytes();

    public int sampleFixedTypeBytes() {
        return (((this.f28185n - 1) * 30) + 7) / 8;
    }

    public int sampleIidBytes() {
        return this.f28185n - 1;
    }

    public abstract int sampleRmBytes();

    public int seedBytes() {
        return this.seedBytes;
    }

    public int sharedKeyBytes() {
        return this.sharedKeyBytes;
    }
}
