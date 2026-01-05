package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: a */
    private byte[] f27690a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* renamed from: h */
    private final int f27691h;
    private byte[] ios;

    /* renamed from: k */
    private byte[] f27692k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f27691h = macSize;
        this.f27690a = new byte[macSize];
        this.f27692k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f27690a, 0);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f27690a;
            mac2.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f27690a, 0);
        }
        Mac mac3 = this.prf;
        byte[] bArr3 = this.f27690a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i10 = (this.generatedBytes / this.f27691h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr4[0] = (byte) (i10 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i10 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i10 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i10;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac4 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac4.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f27692k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) {
        int i12 = this.generatedBytes;
        int i13 = i12 + i11;
        if (i13 < 0 || i13 >= this.maxSizeExcl) {
            throw new DataLengthException(AbstractC5601a.m11233d(this.maxSizeExcl, " bytes", new StringBuilder("Current KDFCTR may only be used for ")));
        }
        if (i12 % this.f27691h == 0) {
            generateNext();
        }
        int i14 = this.generatedBytes;
        int i15 = this.f27691h;
        int i16 = i14 % i15;
        int iMin = Math.min(i15 - (i14 % i15), i11);
        System.arraycopy(this.f27692k, i16, bArr, i10, iMin);
        this.generatedBytes += iMin;
        int i17 = i11 - iMin;
        while (true) {
            i10 += iMin;
            if (i17 <= 0) {
                return i11;
            }
            generateNext();
            iMin = Math.min(this.f27691h, i17);
            System.arraycopy(this.f27692k, 0, bArr, i10, iMin);
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
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r9 = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r9 / 8];
        int iIntValue = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter()) {
            BigInteger bigIntegerMultiply = TWO.pow(r9).multiply(BigInteger.valueOf(this.f27691h));
            if (bigIntegerMultiply.compareTo(INTEGER_MAX) != 1) {
                iIntValue = bigIntegerMultiply.intValue();
            }
        }
        this.maxSizeExcl = iIntValue;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
