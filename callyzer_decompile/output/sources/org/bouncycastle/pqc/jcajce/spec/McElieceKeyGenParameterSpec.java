package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2;

/* loaded from: classes3.dex */
public class McElieceKeyGenParameterSpec implements AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int fieldPoly;

    /* renamed from: m */
    private int f28128m;

    /* renamed from: n */
    private int f28129n;

    /* renamed from: t */
    private int f28130t;

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }

    public int getFieldPoly() {
        return this.fieldPoly;
    }

    public int getM() {
        return this.f28128m;
    }

    public int getN() {
        return this.f28129n;
    }

    public int getT() {
        return this.f28130t;
    }

    public McElieceKeyGenParameterSpec(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("key size must be positive");
        }
        this.f28128m = 0;
        this.f28129n = 1;
        while (true) {
            int i11 = this.f28129n;
            if (i11 >= i10) {
                int i12 = i11 >>> 1;
                this.f28130t = i12;
                int i13 = this.f28128m;
                this.f28130t = i12 / i13;
                this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i13);
                return;
            }
            this.f28129n = i11 << 1;
            this.f28128m++;
        }
    }

    public McElieceKeyGenParameterSpec(int i10, int i11) {
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException("m is too large");
        }
        this.f28128m = i10;
        int i12 = 1 << i10;
        this.f28129n = i12;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i12) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        this.f28130t = i11;
        this.fieldPoly = PolynomialRingGF2.getIrreduciblePolynomial(i10);
    }

    public McElieceKeyGenParameterSpec(int i10, int i11, int i12) {
        this.f28128m = i10;
        if (i10 < 1) {
            throw new IllegalArgumentException("m must be positive");
        }
        if (i10 > 32) {
            throw new IllegalArgumentException(" m is too large");
        }
        int i13 = 1 << i10;
        this.f28129n = i13;
        this.f28130t = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException("t must be positive");
        }
        if (i11 > i13) {
            throw new IllegalArgumentException("t must be less than n = 2^m");
        }
        if (PolynomialRingGF2.degree(i12) != i10 || !PolynomialRingGF2.isIrreducible(i12)) {
            throw new IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.fieldPoly = i12;
    }
}
