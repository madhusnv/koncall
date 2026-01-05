package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class NTRUOWCPA {
    private final NTRUParameterSet params;
    private final NTRUSampling sampling;

    public NTRUOWCPA(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
        this.sampling = new NTRUSampling(nTRUParameterSet);
    }

    private int checkCiphertext(byte[] bArr) {
        return (((~((short) (bArr[this.params.ntruCiphertextBytes() - 1] & (255 << (8 - ((this.params.packDegree() * this.params.logQ()) & 7)))))) + 1) >>> 15) & 1;
    }

    private int checkM(HPSPolynomial hPSPolynomial) {
        short s5 = 0;
        short s10 = 0;
        for (int i10 = 0; i10 < this.params.m11267n() - 1; i10++) {
            short s11 = hPSPolynomial.coeffs[i10];
            s5 = (short) (s5 + (s11 & 1));
            s10 = (short) (s10 + (s11 & 2));
        }
        return (((~(((s10 >>> 1) ^ s5) | (((NTRUHPSParameterSet) this.params).weight() ^ s10))) + 1) >>> 31) & 1;
    }

    private int checkR(Polynomial polynomial) {
        int iM11268q = 0;
        for (int i10 = 0; i10 < this.params.m11267n() - 1; i10++) {
            short s5 = polynomial.coeffs[i10];
            iM11268q = iM11268q | ((s5 + 1) & (this.params.m11268q() - 4)) | ((s5 + 2) & 4);
        }
        return (((~(polynomial.coeffs[this.params.m11267n() - 1] | iM11268q)) + 1) >>> 31) & 1;
    }

    public OWCPADecryptResult decrypt(byte[] bArr, byte[] bArr2) {
        int iOwcpaMsgBytes = this.params.owcpaMsgBytes();
        byte[] bArr3 = new byte[iOwcpaMsgBytes];
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial4 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.s3FromBytes(bArr2);
        polynomialCreatePolynomial2.z3ToZq();
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial, polynomialCreatePolynomial2);
        polynomialCreatePolynomial2.rqToS3(polynomialCreatePolynomial3);
        polynomialCreatePolynomial3.s3FromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes(), bArr2.length));
        polynomialCreatePolynomial4.s3Mul(polynomialCreatePolynomial2, polynomialCreatePolynomial3);
        byte[] bArrS3ToBytes = polynomialCreatePolynomial4.s3ToBytes(iOwcpaMsgBytes - this.params.packTrinaryBytes());
        int iCheckCiphertext = checkCiphertext(bArr);
        if (this.params instanceof NTRUHPSParameterSet) {
            iCheckCiphertext |= checkM((HPSPolynomial) polynomialCreatePolynomial4);
        }
        polynomialCreatePolynomial2.lift(polynomialCreatePolynomial4);
        for (int i10 = 0; i10 < this.params.m11267n(); i10++) {
            short[] sArr = polynomialCreatePolynomial.coeffs;
            sArr[i10] = (short) (sArr[i10] - polynomialCreatePolynomial2.coeffs[i10]);
        }
        polynomialCreatePolynomial3.sqFromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes() * 2, bArr2.length));
        polynomialCreatePolynomial4.sqMul(polynomialCreatePolynomial, polynomialCreatePolynomial3);
        int iCheckR = iCheckCiphertext | checkR(polynomialCreatePolynomial4);
        polynomialCreatePolynomial4.trinaryZqToZ3();
        byte[] bArrS3ToBytes2 = polynomialCreatePolynomial4.s3ToBytes(this.params.owcpaMsgBytes());
        System.arraycopy(bArrS3ToBytes2, 0, bArr3, 0, bArrS3ToBytes2.length);
        System.arraycopy(bArrS3ToBytes, 0, bArr3, this.params.packTrinaryBytes(), bArrS3ToBytes.length);
        return new OWCPADecryptResult(bArr3, iCheckR);
    }

    public byte[] encrypt(Polynomial polynomial, Polynomial polynomial2, byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.rqMul(polynomial, polynomialCreatePolynomial);
        polynomialCreatePolynomial.lift(polynomial2);
        for (int i10 = 0; i10 < this.params.m11267n(); i10++) {
            short[] sArr = polynomialCreatePolynomial2.coeffs;
            sArr[i10] = (short) (sArr[i10] + polynomialCreatePolynomial.coeffs[i10]);
        }
        return polynomialCreatePolynomial2.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
    }

    public OWCPAKeyPair keypair(byte[] bArr) {
        int iOwcpaSecretKeyBytes = this.params.owcpaSecretKeyBytes();
        byte[] bArr2 = new byte[iOwcpaSecretKeyBytes];
        int iM11267n = this.params.m11267n();
        this.params.m11268q();
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        PolynomialPair polynomialPairSampleFg = this.sampling.sampleFg(bArr);
        Polynomial polynomialM11258f = polynomialPairSampleFg.m11258f();
        Polynomial polynomialM11259g = polynomialPairSampleFg.m11259g();
        polynomialCreatePolynomial.s3Inv(polynomialM11258f);
        byte[] bArrS3ToBytes = polynomialM11258f.s3ToBytes(this.params.owcpaMsgBytes());
        System.arraycopy(bArrS3ToBytes, 0, bArr2, 0, bArrS3ToBytes.length);
        byte[] bArrS3ToBytes2 = polynomialCreatePolynomial.s3ToBytes(iOwcpaSecretKeyBytes - this.params.packTrinaryBytes());
        System.arraycopy(bArrS3ToBytes2, 0, bArr2, this.params.packTrinaryBytes(), bArrS3ToBytes2.length);
        polynomialM11258f.z3ToZq();
        polynomialM11259g.z3ToZq();
        if (this.params instanceof NTRUHRSSParameterSet) {
            for (int i10 = iM11267n - 1; i10 > 0; i10--) {
                short[] sArr = polynomialM11259g.coeffs;
                sArr[i10] = (short) ((sArr[i10 - 1] - sArr[i10]) * 3);
            }
            short[] sArr2 = polynomialM11259g.coeffs;
            sArr2[0] = (short) (-(sArr2[0] * 3));
        } else {
            for (int i11 = 0; i11 < iM11267n; i11++) {
                short[] sArr3 = polynomialM11259g.coeffs;
                sArr3[i11] = (short) (sArr3[i11] * 3);
            }
        }
        polynomialCreatePolynomial.rqMul(polynomialM11259g, polynomialM11258f);
        polynomialCreatePolynomial2.rqInv(polynomialCreatePolynomial);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialM11258f);
        polynomialCreatePolynomial.sqMul(polynomialCreatePolynomial3, polynomialM11258f);
        byte[] bArrSqToBytes = polynomialCreatePolynomial.sqToBytes(iOwcpaSecretKeyBytes - (this.params.packTrinaryBytes() * 2));
        System.arraycopy(bArrSqToBytes, 0, bArr2, this.params.packTrinaryBytes() * 2, bArrSqToBytes.length);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialM11259g);
        polynomialCreatePolynomial.rqMul(polynomialCreatePolynomial3, polynomialM11259g);
        return new OWCPAKeyPair(polynomialCreatePolynomial.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes()), bArr2);
    }
}
