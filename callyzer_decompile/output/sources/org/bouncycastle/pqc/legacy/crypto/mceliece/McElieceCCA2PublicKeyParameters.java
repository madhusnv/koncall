package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McElieceCCA2PublicKeyParameters extends McElieceCCA2KeyParameters {
    private GF2Matrix matrixG;

    /* renamed from: n */
    private int f28150n;

    /* renamed from: t */
    private int f28151t;

    public McElieceCCA2PublicKeyParameters(int i10, int i11, GF2Matrix gF2Matrix, String str) {
        super(false, str);
        this.f28150n = i10;
        this.f28151t = i11;
        this.matrixG = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.matrixG;
    }

    public int getK() {
        return this.matrixG.getNumRows();
    }

    public int getN() {
        return this.f28150n;
    }

    public int getT() {
        return this.f28151t;
    }
}
