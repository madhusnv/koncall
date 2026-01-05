package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: classes3.dex */
public class SRP6Server {

    /* renamed from: A */
    protected BigInteger f27570A;

    /* renamed from: B */
    protected BigInteger f27571B;
    protected BigInteger Key;
    protected BigInteger M1;
    protected BigInteger M2;

    /* renamed from: N */
    protected BigInteger f27572N;

    /* renamed from: S */
    protected BigInteger f27573S;

    /* renamed from: b */
    protected BigInteger f27574b;
    protected Digest digest;

    /* renamed from: g */
    protected BigInteger f27575g;
    protected SecureRandom random;

    /* renamed from: u */
    protected BigInteger f27576u;

    /* renamed from: v */
    protected BigInteger f27577v;

    private BigInteger calculateS() {
        return this.f27577v.modPow(this.f27576u, this.f27572N).multiply(this.f27570A).mod(this.f27572N).modPow(this.f27574b, this.f27572N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f27572N, bigInteger);
        this.f27570A = bigIntegerValidatePublicValue;
        this.f27576u = SRP6Util.calculateU(this.digest, this.f27572N, bigIntegerValidatePublicValue, this.f27571B);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f27573S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f27570A;
        if (bigInteger3 == null || (bigInteger = this.M1) == null || (bigInteger2 = this.f27573S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.f27572N, bigInteger3, bigInteger, bigInteger2);
        this.M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f27573S;
        if (bigInteger == null || this.M1 == null || this.M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f27572N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f27572N, this.f27575g);
        this.f27574b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f27577v).mod(this.f27572N).add(this.f27575g.modPow(this.f27574b, this.f27572N)).mod(this.f27572N);
        this.f27571B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f27572N = bigInteger;
        this.f27575g = bigInteger2;
        this.f27577v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f27572N, this.f27575g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f27570A;
        if (bigInteger4 == null || (bigInteger2 = this.f27571B) == null || (bigInteger3 = this.f27573S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f27572N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.M1 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }
}
