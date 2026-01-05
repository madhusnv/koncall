package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.Xof;

/* loaded from: classes3.dex */
public class AsconXof implements Xof {
    private final int ASCON_PB_ROUNDS;
    private final String algorithmName;
    AsconParameters asconParameters;

    /* renamed from: x0, reason: collision with root package name */
    private long f44503x0;

    /* renamed from: x1, reason: collision with root package name */
    private long f44504x1;

    /* renamed from: x2, reason: collision with root package name */
    private long f44505x2;
    private long x3;

    /* renamed from: x4, reason: collision with root package name */
    private long f44506x4;
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private final int CRYPTO_BYTES = 32;

    /* renamed from: org.bouncycastle.crypto.digests.AsconXof$1 */
    public static /* synthetic */ class C55311 {

        /* renamed from: $SwitchMap$org$bouncycastle$crypto$digests$AsconXof$AsconParameters */
        static final /* synthetic */ int[] f27581x260a377d;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            f27581x260a377d = iArr;
            try {
                iArr[AsconParameters.AsconXof.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27581x260a377d[AsconParameters.AsconXofA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AsconParameters {
        AsconXof,
        AsconXofA
    }

    public AsconXof(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i10 = C55311.f27581x260a377d[asconParameters.ordinal()];
        if (i10 == 1) {
            this.ASCON_PB_ROUNDS = 12;
            str = "Ascon-Xof";
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Invalid parameter settings for Ascon Hash");
            }
            this.ASCON_PB_ROUNDS = 8;
            str = "Ascon-XofA";
        }
        this.algorithmName = str;
        reset();
    }

    private long LOADBYTES(byte[] bArr, int i10, int i11) {
        long j6 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j6 |= (bArr[i12 + i10] & 255) << ((7 - i12) << 3);
        }
        return j6;
    }

    /* renamed from: P */
    private void m11183P(int i10) {
        if (i10 == 12) {
            ROUND(240L);
            ROUND(225L);
            ROUND(210L);
            ROUND(195L);
        }
        if (i10 >= 8) {
            ROUND(180L);
            ROUND(165L);
        }
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long PAD(int i10) {
        return 128 << (56 - (i10 << 3));
    }

    private long ROR(long j6, int i10) {
        return (j6 << (64 - i10)) | (j6 >>> i10);
    }

    private void ROUND(long j6) {
        long j10 = this.f44503x0;
        long j11 = this.f44504x1;
        long j12 = this.f44505x2;
        long j13 = this.x3;
        long j14 = this.f44506x4;
        long j15 = ((((j10 ^ j11) ^ j12) ^ j13) ^ j6) ^ ((((j10 ^ j12) ^ j14) ^ j6) & j11);
        long j16 = ((((j10 ^ j12) ^ j13) ^ j14) ^ j6) ^ (((j11 ^ j12) ^ j6) & (j11 ^ j13));
        long j17 = (((j11 ^ j12) ^ j14) ^ j6) ^ (j13 & j14);
        long j18 = ((j12 ^ (j10 ^ j11)) ^ j6) ^ ((~j10) & (j13 ^ j14));
        long j19 = ((j10 ^ j14) & j11) ^ ((j11 ^ j13) ^ j14);
        this.f44503x0 = ROR(j15, 28) ^ (ROR(j15, 19) ^ j15);
        this.f44504x1 = (ROR(j16, 39) ^ j16) ^ ROR(j16, 61);
        this.f44505x2 = ~(ROR(j17, 6) ^ (ROR(j17, 1) ^ j17));
        this.x3 = (ROR(j18, 10) ^ j18) ^ ROR(j18, 17);
        this.f44506x4 = ROR(j19, 41) ^ (ROR(j19, 7) ^ j19);
    }

    private void STOREBYTES(byte[] bArr, int i10, long j6, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12 + i10] = (byte) (j6 >>> ((7 - i12) << 3));
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        return doOutput(bArr, i10, getDigestSize());
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i10, int i11) {
        long j6;
        if (i10 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int size = this.buffer.size();
        int i12 = 0;
        while (true) {
            j6 = this.f44503x0;
            if (size < 8) {
                break;
            }
            this.f44503x0 = j6 ^ LOADBYTES(byteArray, i12, 8);
            m11183P(this.ASCON_PB_ROUNDS);
            i12 += 8;
            size -= 8;
        }
        long jLOADBYTES = j6 ^ LOADBYTES(byteArray, i12, size);
        this.f44503x0 = jLOADBYTES;
        this.f44503x0 = PAD(size) ^ jLOADBYTES;
        m11183P(12);
        int i13 = i10;
        int i14 = 32;
        while (i14 > 8) {
            byte[] bArr2 = bArr;
            STOREBYTES(bArr2, i13, this.f44503x0, 8);
            m11183P(this.ASCON_PB_ROUNDS);
            i13 += 8;
            i14 -= 8;
            bArr = bArr2;
        }
        STOREBYTES(bArr, i13, this.f44503x0, i14);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        long j6;
        this.buffer.reset();
        int i10 = C55311.f27581x260a377d[this.asconParameters.ordinal()];
        if (i10 == 1) {
            this.f44503x0 = -5368810569253202922L;
            this.f44504x1 = 3121280575360345120L;
            this.f44505x2 = 7395939140700676632L;
            this.x3 = 6533890155656471820L;
            j6 = 5710016986865767350L;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f44503x0 = 4940560291654768690L;
            this.f44504x1 = -3635129828240960206L;
            this.f44505x2 = -597534922722107095L;
            this.x3 = 2623493988082852443L;
            j6 = -6283826724160825537L;
        }
        this.f44506x4 = j6;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.buffer.write(b10);
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i10, int i11) {
        return doOutput(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i10, i11);
    }
}
