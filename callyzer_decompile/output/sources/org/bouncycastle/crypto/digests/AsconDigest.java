package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes3.dex */
public class AsconDigest implements ExtendedDigest {
    private final int ASCON_PB_ROUNDS;
    private final String algorithmName;
    AsconParameters asconParameters;

    /* renamed from: x0, reason: collision with root package name */
    private long f44499x0;

    /* renamed from: x1, reason: collision with root package name */
    private long f44500x1;

    /* renamed from: x2, reason: collision with root package name */
    private long f44501x2;
    private long x3;

    /* renamed from: x4, reason: collision with root package name */
    private long f44502x4;
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private final int CRYPTO_BYTES = 32;

    /* renamed from: org.bouncycastle.crypto.digests.AsconDigest$1 */
    public static /* synthetic */ class C55301 {

        /* renamed from: $SwitchMap$org$bouncycastle$crypto$digests$AsconDigest$AsconParameters */
        static final /* synthetic */ int[] f27580x8d084c42;

        static {
            int[] iArr = new int[AsconParameters.values().length];
            f27580x8d084c42 = iArr;
            try {
                iArr[AsconParameters.AsconHash.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27580x8d084c42[AsconParameters.AsconHashA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AsconParameters {
        AsconHash,
        AsconHashA
    }

    public AsconDigest(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i10 = C55301.f27580x8d084c42[asconParameters.ordinal()];
        if (i10 == 1) {
            this.ASCON_PB_ROUNDS = 12;
            str = "Ascon-Hash";
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Invalid parameter settings for Ascon Hash");
            }
            this.ASCON_PB_ROUNDS = 8;
            str = "Ascon-HashA";
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
    private void m11182P(int i10) {
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
        long j10 = this.f44499x0;
        long j11 = this.f44500x1;
        long j12 = this.f44501x2;
        long j13 = this.x3;
        long j14 = this.f44502x4;
        long j15 = ((((j10 ^ j11) ^ j12) ^ j13) ^ j6) ^ ((((j10 ^ j12) ^ j14) ^ j6) & j11);
        long j16 = ((((j10 ^ j12) ^ j13) ^ j14) ^ j6) ^ (((j11 ^ j12) ^ j6) & (j11 ^ j13));
        long j17 = (((j11 ^ j12) ^ j14) ^ j6) ^ (j13 & j14);
        long j18 = ((j12 ^ (j10 ^ j11)) ^ j6) ^ ((~j10) & (j13 ^ j14));
        long j19 = ((j10 ^ j14) & j11) ^ ((j11 ^ j13) ^ j14);
        this.f44499x0 = ROR(j15, 28) ^ (ROR(j15, 19) ^ j15);
        this.f44500x1 = (ROR(j16, 39) ^ j16) ^ ROR(j16, 61);
        this.f44501x2 = ~(ROR(j17, 6) ^ (ROR(j17, 1) ^ j17));
        this.x3 = (ROR(j18, 10) ^ j18) ^ ROR(j18, 17);
        this.f44502x4 = ROR(j19, 41) ^ (ROR(j19, 7) ^ j19);
    }

    private void STOREBYTES(byte[] bArr, int i10, long j6, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12 + i10] = (byte) (j6 >>> ((7 - i12) << 3));
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        long j6;
        if (i10 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int size = this.buffer.size();
        int i11 = 0;
        while (true) {
            j6 = this.f44499x0;
            if (size < 8) {
                break;
            }
            this.f44499x0 = j6 ^ LOADBYTES(byteArray, i11, 8);
            m11182P(this.ASCON_PB_ROUNDS);
            i11 += 8;
            size -= 8;
        }
        long jLOADBYTES = j6 ^ LOADBYTES(byteArray, i11, size);
        this.f44499x0 = jLOADBYTES;
        this.f44499x0 = PAD(size) ^ jLOADBYTES;
        m11182P(12);
        int i12 = i10;
        int i13 = 32;
        while (i13 > 8) {
            byte[] bArr2 = bArr;
            STOREBYTES(bArr2, i12, this.f44499x0, 8);
            m11182P(this.ASCON_PB_ROUNDS);
            i12 += 8;
            i13 -= 8;
            bArr = bArr2;
        }
        STOREBYTES(bArr, i12, this.f44499x0, i13);
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
        int i10 = C55301.f27580x8d084c42[this.asconParameters.ordinal()];
        if (i10 == 1) {
            this.f44499x0 = -1255492011513352131L;
            this.f44500x1 = -8380609354527731710L;
            this.f44501x2 = -5437372128236807582L;
            this.x3 = 4834782570098516968L;
            j6 = 3787428097924915520L;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f44499x0 = 92044056785660070L;
            this.f44500x1 = 8326807761760157607L;
            this.f44501x2 = 3371194088139667532L;
            this.x3 = -2956994353054992515L;
            j6 = -6828509670848688761L;
        }
        this.f44502x4 = j6;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        this.buffer.write(b10);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i10, i11);
    }
}
