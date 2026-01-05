package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class SRP6GroupParameters {

    /* renamed from: N */
    private BigInteger f27781N;

    /* renamed from: g */
    private BigInteger f27782g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f27781N = bigInteger;
        this.f27782g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f27782g;
    }

    public BigInteger getN() {
        return this.f27781N;
    }
}
