package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class SPHINCSPlusPublicKeyParameters extends SPHINCSPlusKeyParameters {

    /* renamed from: pk, reason: collision with root package name */
    private final PK f44740pk;

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, PK pk2) {
        super(false, sPHINCSPlusParameters);
        this.f44740pk = pk2;
    }

    public byte[] getEncoded() {
        PK pk2 = this.f44740pk;
        return Arrays.concatenate(pk2.seed, pk2.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.f44740pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.f44740pk.seed);
    }

    public SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters sPHINCSPlusParameters, byte[] bArr) {
        super(false, sPHINCSPlusParameters);
        int n6 = sPHINCSPlusParameters.getN();
        int i10 = n6 * 2;
        if (bArr.length != i10) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.f44740pk = new PK(Arrays.copyOfRange(bArr, 0, n6), Arrays.copyOfRange(bArr, n6, i10));
    }
}
