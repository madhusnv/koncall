package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes3.dex */
public class SRP6Client {

    /* renamed from: A */
    protected BigInteger f27562A;

    /* renamed from: B */
    protected BigInteger f27563B;
    protected BigInteger Key;
    protected BigInteger M1;
    protected BigInteger M2;

    /* renamed from: N */
    protected BigInteger f27564N;

    /* renamed from: S */
    protected BigInteger f27565S;

    /* renamed from: a */
    protected BigInteger f27566a;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f27567g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f27568u;

    /* renamed from: x */
    protected BigInteger f27569x;

    private BigInteger calculateS() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f27564N, this.f27567g);
        return this.f27563B.subtract(this.f27567g.modPow(this.f27569x, this.f27564N).multiply(bigIntegerCalculateK).mod(this.f27564N)).mod(this.f27564N).modPow(this.f27568u.multiply(this.f27569x).add(this.f27566a), this.f27564N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f27562A;
        if (bigInteger3 == null || (bigInteger = this.f27563B) == null || (bigInteger2 = this.f27565S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = SRP6Util.calculateM1(this.digest, this.f27564N, bigInteger3, bigInteger, bigInteger2);
        this.M1 = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f27564N, bigInteger);
        this.f27563B = bigIntegerValidatePublicValue;
        this.f27568u = SRP6Util.calculateU(this.digest, this.f27564N, this.f27562A, bigIntegerValidatePublicValue);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f27565S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f27565S;
        if (bigInteger == null || this.M1 == null || this.M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f27564N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27569x = SRP6Util.calculateX(this.digest, this.f27564N, bArr, bArr2, bArr3);
        BigInteger bigIntegerSelectPrivateValue = selectPrivateValue();
        this.f27566a = bigIntegerSelectPrivateValue;
        BigInteger bigIntegerModPow = this.f27567g.modPow(bigIntegerSelectPrivateValue, this.f27564N);
        this.f27562A = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f27564N = bigInteger;
        this.f27567g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f27564N, this.f27567g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f27562A;
        if (bigInteger4 == null || (bigInteger2 = this.M1) == null || (bigInteger3 = this.f27565S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f27564N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.M2 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }
}
