package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFCounterParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;

    /* renamed from: h */
    private final int f27688h;
    private byte[] ios;

    /* renamed from: k */
    private byte[] f27689k;
    private int maxSizeExcl;
    private final Mac prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f27688h = macSize;
        this.f27689k = new byte[macSize];
    }

    private void generateNext() {
        int i10 = (this.generatedBytes / this.f27688h) + 1;
        byte[] bArr = this.ios;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException("Unsupported size of counter i");
                    }
                    bArr[0] = (byte) (i10 >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i10 >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i10 >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i10;
        Mac mac = this.prf;
        byte[] bArr2 = this.fixedInputDataCtrPrefix;
        mac.update(bArr2, 0, bArr2.length);
        Mac mac2 = this.prf;
        byte[] bArr3 = this.ios;
        mac2.update(bArr3, 0, bArr3.length);
        Mac mac3 = this.prf;
        byte[] bArr4 = this.fixedInputData_afterCtr;
        mac3.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f27689k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12 = this.generatedBytes;
        int i13 = i12 + i11;
        if (i13 < 0 || i13 >= this.maxSizeExcl) {
            throw new DataLengthException(AbstractC5601a.m11233d(this.maxSizeExcl, " bytes", new StringBuilder("Current KDFCTR may only be used for ")));
        }
        if (i12 % this.f27688h == 0) {
            generateNext();
        }
        int i14 = this.generatedBytes;
        int i15 = this.f27688h;
        int i16 = i14 % i15;
        int iMin = Math.min(i15 - (i14 % i15), i11);
        System.arraycopy(this.f27689k, i16, bArr, i10, iMin);
        this.generatedBytes += iMin;
        int i17 = i11 - iMin;
        while (true) {
            i10 += iMin;
            if (i17 <= 0) {
                return i11;
            }
            generateNext();
            iMin = Math.min(this.f27688h, i17);
            System.arraycopy(this.f27689k, 0, bArr, i10, iMin);
            this.generatedBytes += iMin;
            i17 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r9 = kDFCounterParameters.getR();
        this.ios = new byte[r9 / 8];
        BigInteger bigIntegerMultiply = TWO.pow(r9).multiply(BigInteger.valueOf(this.f27688h));
        this.maxSizeExcl = bigIntegerMultiply.compareTo(INTEGER_MAX) == 1 ? Integer.MAX_VALUE : bigIntegerMultiply.intValue();
        this.generatedBytes = 0;
    }
}
