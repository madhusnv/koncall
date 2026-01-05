package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* renamed from: g */
    private GF2Matrix f28173g;

    /* renamed from: n */
    private int f28174n;

    /* renamed from: t */
    private int f28175t;

    public McEliecePublicKeyParameters(int i10, int i11, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f28174n = i10;
        this.f28175t = i11;
        this.f28173g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f28173g;
    }

    public int getK() {
        return this.f28173g.getNumRows();
    }

    public int getN() {
        return this.f28174n;
    }

    public int getT() {
        return this.f28175t;
    }
}
