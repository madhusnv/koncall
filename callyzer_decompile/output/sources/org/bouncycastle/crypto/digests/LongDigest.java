package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;

    /* renamed from: K */
    static final long[] f27600K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    protected long H1;
    protected long H2;
    protected long H3;
    protected long H4;
    protected long H5;
    protected long H6;
    protected long H7;
    protected long H8;

    /* renamed from: W */
    private long[] f27601W;
    private long byteCount1;
    private long byteCount2;
    protected final CryptoServicePurpose purpose;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    public LongDigest() {
        this(CryptoServicePurpose.ANY);
    }

    private long Ch(long j6, long j10, long j11) {
        return ((~j6) & j11) ^ (j10 & j6);
    }

    private long Maj(long j6, long j10, long j11) {
        return ((j6 & j11) ^ (j6 & j10)) ^ (j10 & j11);
    }

    private long Sigma0(long j6) {
        return (j6 >>> 7) ^ (((j6 << 63) | (j6 >>> 1)) ^ ((j6 << 56) | (j6 >>> 8)));
    }

    private long Sigma1(long j6) {
        return (j6 >>> 6) ^ (((j6 << 45) | (j6 >>> 19)) ^ ((j6 << 3) | (j6 >>> 61)));
    }

    private long Sum0(long j6) {
        return ((j6 >>> 39) | (j6 << 25)) ^ (((j6 << 36) | (j6 >>> 28)) ^ ((j6 << 30) | (j6 >>> 34)));
    }

    private long Sum1(long j6) {
        return ((j6 >>> 41) | (j6 << 23)) ^ (((j6 << 50) | (j6 >>> 14)) ^ ((j6 << 46) | (j6 >>> 18)));
    }

    private void adjustByteCounts() {
        long j6 = this.byteCount1;
        if (j6 > 2305843009213693951L) {
            this.byteCount2 += j6 >>> 61;
            this.byteCount1 = j6 & 2305843009213693951L;
        }
    }

    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.H1 = longDigest.H1;
        this.H2 = longDigest.H2;
        this.H3 = longDigest.H3;
        this.H4 = longDigest.H4;
        this.H5 = longDigest.H5;
        this.H6 = longDigest.H6;
        this.H7 = longDigest.H7;
        this.H8 = longDigest.H8;
        long[] jArr = longDigest.f27601W;
        System.arraycopy(jArr, 0, this.f27601W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public abstract CryptoServiceProperties cryptoServiceProperties();

    public void finish() {
        adjustByteCounts();
        long j6 = this.byteCount1 << 3;
        long j10 = this.byteCount2;
        byte b10 = -128;
        while (true) {
            update(b10);
            if (this.xBufOff == 0) {
                processLength(j6, j10);
                processBlock();
                return;
            }
            b10 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    public int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.H1, bArr, 28);
        Pack.longToBigEndian(this.H2, bArr, 36);
        Pack.longToBigEndian(this.H3, bArr, 44);
        Pack.longToBigEndian(this.H4, bArr, 52);
        Pack.longToBigEndian(this.H5, bArr, 60);
        Pack.longToBigEndian(this.H6, bArr, 68);
        Pack.longToBigEndian(this.H7, bArr, 76);
        Pack.longToBigEndian(this.H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i10 = 0; i10 < this.wOff; i10++) {
            Pack.longToBigEndian(this.f27601W[i10], bArr, (i10 * 8) + 96);
        }
    }

    public void processBlock() {
        adjustByteCounts();
        for (int i10 = 16; i10 <= 79; i10++) {
            long[] jArr = this.f27601W;
            long jSigma1 = Sigma1(jArr[i10 - 2]);
            long[] jArr2 = this.f27601W;
            jArr[i10] = jSigma1 + jArr2[i10 - 7] + Sigma0(jArr2[i10 - 15]) + this.f27601W[i10 - 16];
        }
        long j6 = this.H1;
        long j10 = this.H2;
        long j11 = this.H3;
        long j12 = this.H4;
        long j13 = this.H5;
        long j14 = j12;
        long j15 = this.H6;
        int i11 = 0;
        int i12 = 0;
        long j16 = j11;
        long j17 = this.H7;
        long j18 = this.H8;
        long j19 = j6;
        long j20 = j13;
        long j21 = j10;
        while (i11 < 10) {
            long j22 = j15;
            long j23 = j20;
            long j24 = j17;
            long jSum1 = Sum1(j20) + Ch(j20, j22, j17);
            long[] jArr3 = f27600K;
            int i13 = i12 + 1;
            long j25 = jSum1 + jArr3[i12] + this.f27601W[i12] + j18;
            long j26 = j14 + j25;
            long j27 = j19;
            long j28 = j21;
            long j29 = j16;
            long jSum0 = Sum0(j19) + Maj(j27, j28, j29) + j25;
            long jSum12 = Sum1(j26) + Ch(j26, j23, j22) + jArr3[i13];
            int i14 = i12 + 2;
            long j30 = jSum12 + this.f27601W[i13] + j24;
            long j31 = j29 + j30;
            long jSum02 = Sum0(jSum0) + Maj(jSum0, j27, j28) + j30;
            int i15 = i12 + 3;
            long jSum13 = Sum1(j31) + Ch(j31, j26, j23) + jArr3[i14] + this.f27601W[i14] + j22;
            long j32 = j28 + jSum13;
            long jSum03 = Sum0(jSum02) + Maj(jSum02, jSum0, j27) + jSum13;
            long jSum14 = Sum1(j32) + Ch(j32, j31, j26) + jArr3[i15];
            int i16 = i12 + 4;
            long j33 = jSum14 + this.f27601W[i15] + j23;
            long j34 = j27 + j33;
            long jSum04 = Sum0(jSum03) + Maj(jSum03, jSum02, jSum0) + j33;
            long jSum15 = Sum1(j34) + Ch(j34, j32, j31) + jArr3[i16];
            int i17 = i12 + 5;
            long j35 = jSum15 + this.f27601W[i16] + j26;
            long j36 = jSum0 + j35;
            long jSum05 = Sum0(jSum04) + Maj(jSum04, jSum03, jSum02) + j35;
            long jSum16 = Sum1(j36) + Ch(j36, j34, j32) + jArr3[i17];
            int i18 = i12 + 6;
            long j37 = jSum16 + this.f27601W[i17] + j31;
            long j38 = jSum02 + j37;
            long jSum06 = Sum0(jSum05) + Maj(jSum05, jSum04, jSum03) + j37;
            int i19 = i12 + 7;
            long jSum17 = Sum1(j38) + Ch(j38, j36, j34) + jArr3[i18] + this.f27601W[i18] + j32;
            long j39 = jSum03 + jSum17;
            long jSum07 = Sum0(jSum06) + Maj(jSum06, jSum05, jSum04) + jSum17;
            i12 += 8;
            long jSum18 = Sum1(j39) + Ch(j39, j38, j36) + jArr3[i19] + this.f27601W[i19] + j34;
            long jSum08 = Sum0(jSum07) + Maj(jSum07, jSum06, jSum05) + jSum18;
            i11++;
            j21 = jSum07;
            j16 = jSum06;
            j20 = jSum04 + jSum18;
            j18 = j36;
            j15 = j39;
            j14 = jSum05;
            j19 = jSum08;
            j17 = j38;
        }
        this.H1 += j19;
        this.H2 += j21;
        this.H3 += j16;
        this.H4 += j14;
        this.H5 += j20;
        this.H6 += j15;
        this.H7 += j17;
        this.H8 += j18;
        this.wOff = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.f27601W[i20] = 0;
        }
    }

    public void processLength(long j6, long j10) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.f27601W;
        jArr[14] = j10;
        jArr[15] = j6;
    }

    public void processWord(byte[] bArr, int i10) {
        this.f27601W[this.wOff] = Pack.bigEndianToLong(bArr, i10);
        int i11 = this.wOff + 1;
        this.wOff = i11;
        if (i11 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i10 = 0;
        this.xBufOff = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.f27601W;
            if (i10 == jArr.length) {
                return;
            }
            jArr[i10] = 0;
            i10++;
        }
    }

    public void restoreState(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = iBigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, iBigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.H1 = Pack.bigEndianToLong(bArr, 28);
        this.H2 = Pack.bigEndianToLong(bArr, 36);
        this.H3 = Pack.bigEndianToLong(bArr, 44);
        this.H4 = Pack.bigEndianToLong(bArr, 52);
        this.H5 = Pack.bigEndianToLong(bArr, 60);
        this.H6 = Pack.bigEndianToLong(bArr, 68);
        this.H7 = Pack.bigEndianToLong(bArr, 76);
        this.H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i10 = 0; i10 < this.wOff; i10++) {
            this.f27601W[i10] = Pack.bigEndianToLong(bArr, (i10 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        byte[] bArr = this.xBuf;
        int i10 = this.xBufOff;
        int i11 = i10 + 1;
        this.xBufOff = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    public LongDigest(CryptoServicePurpose cryptoServicePurpose) {
        this.xBuf = new byte[8];
        this.f27601W = new long[80];
        this.purpose = cryptoServicePurpose;
        this.xBufOff = 0;
        reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.xBufOff != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 >= this.xBuf.length) {
            processWord(bArr, i10);
            byte[] bArr2 = this.xBuf;
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.byteCount1 += bArr2.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }

    public LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.f27601W = new long[80];
        this.purpose = longDigest.purpose;
        copyIn(longDigest);
    }
}
