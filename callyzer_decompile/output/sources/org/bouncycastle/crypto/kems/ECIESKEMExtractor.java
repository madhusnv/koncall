package org.bouncycastle.crypto.kems;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* loaded from: classes3.dex */
public class ECIESKEMExtractor implements EncapsulatedSecretExtractor {
    private boolean CofactorMode;
    private boolean OldCofactorMode;
    private boolean SingleHashMode;
    private final ECPrivateKeyParameters decKey;
    private DerivationFunction kdf;
    private int keyLen;

    public ECIESKEMExtractor(ECPrivateKeyParameters eCPrivateKeyParameters, int i10, DerivationFunction derivationFunction) {
        this.decKey = eCPrivateKeyParameters;
        this.keyLen = i10;
        this.kdf = derivationFunction;
        this.CofactorMode = false;
        this.OldCofactorMode = false;
        this.SingleHashMode = false;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        ECPrivateKeyParameters eCPrivateKeyParameters = this.decKey;
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        ECCurve curve = parameters.getCurve();
        BigInteger n6 = parameters.getN();
        BigInteger h10 = parameters.getH();
        ECPoint eCPointDecodePoint = curve.decodePoint(bArr);
        if (this.CofactorMode || this.OldCofactorMode) {
            eCPointDecodePoint = eCPointDecodePoint.multiply(h10);
        }
        BigInteger d2 = eCPrivateKeyParameters.getD();
        if (this.CofactorMode) {
            d2 = d2.multiply(parameters.getHInv()).mod(n6);
        }
        return ECIESKEMGenerator.deriveKey(this.SingleHashMode, this.kdf, this.keyLen, bArr, eCPointDecodePoint.multiply(d2).normalize().getAffineXCoord().getEncoded());
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return ((this.decKey.getParameters().getCurve().getFieldSize() / 8) * 2) + 1;
    }

    public ECIESKEMExtractor(ECPrivateKeyParameters eCPrivateKeyParameters, int i10, DerivationFunction derivationFunction, boolean z6, boolean z10, boolean z11) {
        this.decKey = eCPrivateKeyParameters;
        this.keyLen = i10;
        this.kdf = derivationFunction;
        this.CofactorMode = z6;
        if (z6) {
            this.OldCofactorMode = false;
        } else {
            this.OldCofactorMode = z10;
        }
        this.SingleHashMode = z11;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("ECIESKem", ConstraintUtils.bitsOfSecurityFor(eCPrivateKeyParameters.getParameters().getCurve()), eCPrivateKeyParameters, CryptoServicePurpose.DECRYPTION));
    }
}
