package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GoppaCode;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Permutation;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.pqc.legacy.math.linearalgebra.PolynomialRingGF2m;

/* loaded from: classes3.dex */
public class McEliecePrivateKeyParameters extends McElieceKeyParameters {
    private GF2mField field;
    private PolynomialGF2mSmallM goppaPoly;

    /* renamed from: h */
    private GF2Matrix f28170h;

    /* renamed from: k */
    private int f28171k;

    /* renamed from: n */
    private int f28172n;
    private String oid;

    /* renamed from: p1, reason: collision with root package name */
    private Permutation f44746p1;

    /* renamed from: p2, reason: collision with root package name */
    private Permutation f44747p2;
    private PolynomialGF2mSmallM[] qInv;
    private GF2Matrix sInv;

    public McEliecePrivateKeyParameters(int i10, int i11, GF2mField gF2mField, PolynomialGF2mSmallM polynomialGF2mSmallM, Permutation permutation, Permutation permutation2, GF2Matrix gF2Matrix) {
        super(true, null);
        this.f28171k = i11;
        this.f28172n = i10;
        this.field = gF2mField;
        this.goppaPoly = polynomialGF2mSmallM;
        this.sInv = gF2Matrix;
        this.f44746p1 = permutation;
        this.f44747p2 = permutation2;
        this.f28170h = GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        this.qInv = new PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }

    public GF2mField getField() {
        return this.field;
    }

    public PolynomialGF2mSmallM getGoppaPoly() {
        return this.goppaPoly;
    }

    public GF2Matrix getH() {
        return this.f28170h;
    }

    public int getK() {
        return this.f28171k;
    }

    public int getN() {
        return this.f28172n;
    }

    public Permutation getP1() {
        return this.f44746p1;
    }

    public Permutation getP2() {
        return this.f44747p2;
    }

    public PolynomialGF2mSmallM[] getQInv() {
        return this.qInv;
    }

    public GF2Matrix getSInv() {
        return this.sInv;
    }

    public McEliecePrivateKeyParameters(int i10, int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.f28172n = i10;
        this.f28171k = i11;
        GF2mField gF2mField = new GF2mField(bArr);
        this.field = gF2mField;
        this.goppaPoly = new PolynomialGF2mSmallM(gF2mField, bArr2);
        this.sInv = new GF2Matrix(bArr3);
        this.f44746p1 = new Permutation(bArr4);
        this.f44747p2 = new Permutation(bArr5);
        this.f28170h = new GF2Matrix(bArr6);
        this.qInv = new PolynomialGF2mSmallM[bArr7.length];
        for (int i12 = 0; i12 < bArr7.length; i12++) {
            this.qInv[i12] = new PolynomialGF2mSmallM(this.field, bArr7[i12]);
        }
    }
}
