package org.bouncycastle.crypto.signers;

import a2.AbstractC0030c;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class SM2Signer implements Signer, ECConstants {
    private final Digest digest;
    private ECKeyParameters ecKey;
    private ECDomainParameters ecParams;
    private final DSAEncoding encoding;
    private final DSAKCalculator kCalculator;
    private ECPoint pubPoint;

    /* renamed from: z */
    private byte[] f27795z;

    public SM2Signer() {
        this(StandardDSAEncoding.INSTANCE, new SM3Digest());
    }

    private void addFieldElement(Digest digest, ECFieldElement eCFieldElement) {
        byte[] encoded = eCFieldElement.getEncoded();
        digest.update(encoded, 0, encoded.length);
    }

    private void addUserID(Digest digest, byte[] bArr) {
        int length = bArr.length * 8;
        digest.update((byte) ((length >> 8) & 255));
        digest.update((byte) (length & 255));
        digest.update(bArr, 0, bArr.length);
    }

    private byte[] digestDoFinal() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        reset();
        return bArr;
    }

    private byte[] getZ(byte[] bArr) {
        this.digest.reset();
        addUserID(this.digest, bArr);
        addFieldElement(this.digest, this.ecParams.getCurve().getA());
        addFieldElement(this.digest, this.ecParams.getCurve().getB());
        addFieldElement(this.digest, this.ecParams.getG().getAffineXCoord());
        addFieldElement(this.digest, this.ecParams.getG().getAffineYCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineXCoord());
        addFieldElement(this.digest, this.pubPoint.getAffineYCoord());
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return bArr2;
    }

    private boolean verifySignature(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger n6 = this.ecParams.getN();
        BigInteger bigInteger3 = ECConstants.ONE;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(n6) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(n6) >= 0) {
            return false;
        }
        BigInteger bigIntegerCalculateE = calculateE(n6, digestDoFinal());
        BigInteger bigIntegerMod = bigInteger.add(bigInteger2).mod(n6);
        if (bigIntegerMod.equals(ECConstants.ZERO)) {
            return false;
        }
        ECPoint eCPointNormalize = ECAlgorithms.sumOfTwoMultiplies(this.ecParams.getG(), bigInteger2, ((ECPublicKeyParameters) this.ecKey).getQ(), bigIntegerMod).normalize();
        if (eCPointNormalize.isInfinity()) {
            return false;
        }
        return bigIntegerCalculateE.add(eCPointNormalize.getAffineXCoord().toBigInteger()).mod(n6).equals(bigInteger);
    }

    public BigInteger calculateE(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public ECMultiplier createBasePointMultiplier() {
        return new FixedPointCombMultiplier();
    }

    @Override // org.bouncycastle.crypto.Signer
    public byte[] generateSignature() throws CryptoException {
        byte[] bArrDigestDoFinal = digestDoFinal();
        BigInteger n6 = this.ecParams.getN();
        BigInteger bigIntegerCalculateE = calculateE(n6, bArrDigestDoFinal);
        BigInteger d2 = ((ECPrivateKeyParameters) this.ecKey).getD();
        ECMultiplier eCMultiplierCreateBasePointMultiplier = createBasePointMultiplier();
        while (true) {
            BigInteger bigIntegerNextK = this.kCalculator.nextK();
            BigInteger bigIntegerMod = bigIntegerCalculateE.add(eCMultiplierCreateBasePointMultiplier.multiply(this.ecParams.getG(), bigIntegerNextK).normalize().getAffineXCoord().toBigInteger()).mod(n6);
            BigInteger bigInteger = ECConstants.ZERO;
            if (!bigIntegerMod.equals(bigInteger) && !bigIntegerMod.add(bigIntegerNextK).equals(n6)) {
                BigInteger bigIntegerMod2 = BigIntegers.modOddInverse(n6, d2.add(ECConstants.ONE)).multiply(bigIntegerNextK.subtract(bigIntegerMod.multiply(d2)).mod(n6)).mod(n6);
                if (!bigIntegerMod2.equals(bigInteger)) {
                    try {
                        return this.encoding.encode(this.ecParams.getN(), bigIntegerMod, bigIntegerMod2);
                    } catch (Exception e2) {
                        throw new CryptoException(AbstractC0030c.m117h(e2, new StringBuilder("unable to encode signature: ")), e2);
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void init(boolean z6, CipherParameters cipherParameters) {
        byte[] bArrDecodeStrict;
        ECPoint q10;
        if (cipherParameters instanceof ParametersWithID) {
            ParametersWithID parametersWithID = (ParametersWithID) cipherParameters;
            CipherParameters parameters = parametersWithID.getParameters();
            byte[] id2 = parametersWithID.getID();
            if (id2.length >= 8192) {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^13 bits long");
            }
            bArrDecodeStrict = id2;
            cipherParameters = parameters;
        } else {
            bArrDecodeStrict = Hex.decodeStrict("31323334353637383132333435363738");
        }
        if (z6) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                ECKeyParameters eCKeyParameters = (ECKeyParameters) parametersWithRandom.getParameters();
                this.ecKey = eCKeyParameters;
                ECDomainParameters parameters2 = eCKeyParameters.getParameters();
                this.ecParams = parameters2;
                this.kCalculator.init(parameters2.getN(), parametersWithRandom.getRandom());
            } else {
                ECKeyParameters eCKeyParameters2 = (ECKeyParameters) cipherParameters;
                this.ecKey = eCKeyParameters2;
                ECDomainParameters parameters3 = eCKeyParameters2.getParameters();
                this.ecParams = parameters3;
                this.kCalculator.init(parameters3.getN(), CryptoServicesRegistrar.getSecureRandom());
            }
            BigInteger d2 = ((ECPrivateKeyParameters) this.ecKey).getD();
            BigInteger bigIntegerSubtract = this.ecParams.getN().subtract(BigIntegers.ONE);
            if (d2.compareTo(ECConstants.ONE) < 0 || d2.compareTo(bigIntegerSubtract) >= 0) {
                throw new IllegalArgumentException("SM2 private key out of range");
            }
            q10 = createBasePointMultiplier().multiply(this.ecParams.getG(), d2).normalize();
        } else {
            ECKeyParameters eCKeyParameters3 = (ECKeyParameters) cipherParameters;
            this.ecKey = eCKeyParameters3;
            this.ecParams = eCKeyParameters3.getParameters();
            q10 = ((ECPublicKeyParameters) this.ecKey).getQ();
        }
        this.pubPoint = q10;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties("ECNR", this.ecKey, z6));
        byte[] z10 = getZ(bArrDecodeStrict);
        this.f27795z = z10;
        this.digest.update(z10, 0, z10.length);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void reset() {
        this.digest.reset();
        byte[] bArr = this.f27795z;
        if (bArr != null) {
            this.digest.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte b10) {
        this.digest.update(b10);
    }

    public SM2Signer(Digest digest) {
        this(StandardDSAEncoding.INSTANCE, digest);
    }

    @Override // org.bouncycastle.crypto.Signer
    public void update(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.Signer
    public boolean verifySignature(byte[] bArr) {
        try {
            BigInteger[] bigIntegerArrDecode = this.encoding.decode(this.ecParams.getN(), bArr);
            return verifySignature(bigIntegerArrDecode[0], bigIntegerArrDecode[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    public SM2Signer(DSAEncoding dSAEncoding) {
        this.kCalculator = new RandomDSAKCalculator();
        this.encoding = dSAEncoding;
        this.digest = new SM3Digest();
    }

    public SM2Signer(DSAEncoding dSAEncoding, Digest digest) {
        this.kCalculator = new RandomDSAKCalculator();
        this.encoding = dSAEncoding;
        this.digest = digest;
    }
}
