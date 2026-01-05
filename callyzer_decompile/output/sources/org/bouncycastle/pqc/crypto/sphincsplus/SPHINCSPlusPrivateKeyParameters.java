package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class SPHINCSPlusPrivateKeyParameters extends SPHINCSPlusKeyParameters {

    /* renamed from: pk, reason: collision with root package name */
    final PK f44738pk;

    /* renamed from: sk, reason: collision with root package name */
    final SK f44739sk;

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, SK sk2, PK pk2) {
        super(true, sPHINCSPlusParameters);
        this.f44739sk = sk2;
        this.f44738pk = pk2;
    }

    public byte[] getEncoded() {
        SK sk2 = this.f44739sk;
        byte[] bArr = sk2.seed;
        byte[] bArr2 = sk2.prf;
        PK pk2 = this.f44738pk;
        return Arrays.concatenate(new byte[][]{bArr, bArr2, pk2.seed, pk2.root});
    }

    public byte[] getEncodedPublicKey() {
        PK pk2 = this.f44738pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getPrf() {
        return Arrays.clone(this.f44739sk.prf);
    }

    public byte[] getPublicKey() {
        PK pk2 = this.f44738pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.f44738pk.seed);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f44738pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f44739sk.seed);
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(true, sPHINCSPlusParameters);
        int n6 = sPHINCSPlusParameters.getN();
        int i10 = n6 * 4;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("private key encoding does not match parameters");
        }
        int i11 = n6 * 2;
        this.f44739sk = new SK(Arrays.copyOfRange(bArr, 0, n6), Arrays.copyOfRange(bArr, n6, i11));
        int i12 = n6 * 3;
        this.f44738pk = new PK(Arrays.copyOfRange(bArr, i11, i12), Arrays.copyOfRange(bArr, i12, i10));
    }

    public SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, sPHINCSPlusParameters);
        this.f44739sk = new SK(bArr, bArr2);
        this.f44738pk = new PK(bArr3, bArr4);
    }
}
