package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* renamed from: h0, reason: collision with root package name */
    private int f44580h0;

    /* renamed from: h1, reason: collision with root package name */
    private int f44581h1;

    /* renamed from: h2, reason: collision with root package name */
    private int f44582h2;

    /* renamed from: h3, reason: collision with root package name */
    private int f44583h3;

    /* renamed from: h4, reason: collision with root package name */
    private int f44584h4;

    /* renamed from: k0, reason: collision with root package name */
    private int f44585k0;

    /* renamed from: k1, reason: collision with root package name */
    private int f44586k1;

    /* renamed from: k2, reason: collision with root package name */
    private int f44587k2;

    /* renamed from: k3, reason: collision with root package name */
    private int f44588k3;

    /* renamed from: r0, reason: collision with root package name */
    private int f44589r0;

    /* renamed from: r1, reason: collision with root package name */
    private int f44590r1;

    /* renamed from: r2, reason: collision with root package name */
    private int f44591r2;

    /* renamed from: r3, reason: collision with root package name */
    private int f44592r3;

    /* renamed from: r4, reason: collision with root package name */
    private int f44593r4;

    /* renamed from: s1, reason: collision with root package name */
    private int f44594s1;

    /* renamed from: s2, reason: collision with root package name */
    private int f44595s2;

    /* renamed from: s3, reason: collision with root package name */
    private int f44596s3;

    /* renamed from: s4, reason: collision with root package name */
    private int f44597s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i10, int i11) {
        return (i10 & 4294967295L) * i11;
    }

    private void processBlock() {
        int i10 = this.currentBlockOffset;
        if (i10 < 16) {
            this.currentBlock[i10] = 1;
            for (int i11 = i10 + 1; i11 < 16; i11++) {
                this.currentBlock[i11] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j6 = jLittleEndianToInt & 4294967295L;
        long jLittleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & 4294967295L;
        long jLittleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & 4294967295L;
        long jLittleEndianToInt4 = 4294967295L & Pack.littleEndianToInt(this.currentBlock, 12);
        int i12 = (int) (this.f44580h0 + (jLittleEndianToInt & 67108863));
        this.f44580h0 = i12;
        this.f44581h1 = (int) (this.f44581h1 + ((((jLittleEndianToInt2 << 32) | j6) >>> 26) & 67108863));
        this.f44582h2 = (int) (this.f44582h2 + (((jLittleEndianToInt2 | (jLittleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f44583h3 = (int) (this.f44583h3 + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i13 = (int) (this.f44584h4 + (jLittleEndianToInt4 >>> 8));
        this.f44584h4 = i13;
        if (this.currentBlockOffset == 16) {
            this.f44584h4 = i13 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i12, this.f44589r0) + mul32x32_64(this.f44581h1, this.f44597s4) + mul32x32_64(this.f44582h2, this.f44596s3) + mul32x32_64(this.f44583h3, this.f44595s2) + mul32x32_64(this.f44584h4, this.f44594s1);
        long jMul32x32_642 = mul32x32_64(this.f44580h0, this.f44590r1) + mul32x32_64(this.f44581h1, this.f44589r0) + mul32x32_64(this.f44582h2, this.f44597s4) + mul32x32_64(this.f44583h3, this.f44596s3) + mul32x32_64(this.f44584h4, this.f44595s2);
        long jMul32x32_643 = mul32x32_64(this.f44580h0, this.f44591r2) + mul32x32_64(this.f44581h1, this.f44590r1) + mul32x32_64(this.f44582h2, this.f44589r0) + mul32x32_64(this.f44583h3, this.f44597s4) + mul32x32_64(this.f44584h4, this.f44596s3);
        long jMul32x32_644 = mul32x32_64(this.f44580h0, this.f44592r3) + mul32x32_64(this.f44581h1, this.f44591r2) + mul32x32_64(this.f44582h2, this.f44590r1) + mul32x32_64(this.f44583h3, this.f44589r0) + mul32x32_64(this.f44584h4, this.f44597s4);
        long jMul32x32_645 = mul32x32_64(this.f44580h0, this.f44593r4) + mul32x32_64(this.f44581h1, this.f44592r3) + mul32x32_64(this.f44582h2, this.f44591r2) + mul32x32_64(this.f44583h3, this.f44590r1) + mul32x32_64(this.f44584h4, this.f44589r0);
        long j10 = jMul32x32_642 + (jMul32x32_64 >>> 26);
        long j11 = jMul32x32_643 + (j10 >>> 26);
        this.f44582h2 = ((int) j11) & 67108863;
        long j12 = jMul32x32_644 + (j11 >>> 26);
        this.f44583h3 = ((int) j12) & 67108863;
        long j13 = jMul32x32_645 + (j12 >>> 26);
        this.f44584h4 = ((int) j13) & 67108863;
        int i14 = (((int) (j13 >>> 26)) * 5) + (((int) jMul32x32_64) & 67108863);
        this.f44581h1 = (((int) j10) & 67108863) + (i14 >>> 26);
        this.f44580h0 = i14 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i10 = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f44589r0 = 67108863 & iLittleEndianToInt;
        int i11 = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.f44590r1 = i11;
        int i12 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.f44591r2 = i12;
        int i13 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.f44592r3 = i13;
        int i14 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.f44593r4 = i14;
        this.f44594s1 = i11 * 5;
        this.f44595s2 = i12 * 5;
        this.f44596s3 = i13 * 5;
        this.f44597s4 = i14 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i10 = 0;
            bArr = bArr3;
        }
        this.f44585k0 = Pack.littleEndianToInt(bArr, i10);
        this.f44586k1 = Pack.littleEndianToInt(bArr, i10 + 4);
        this.f44587k2 = Pack.littleEndianToInt(bArr, i10 + 8);
        this.f44588k3 = Pack.littleEndianToInt(bArr, i10 + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        if (i10 + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i11 = this.f44581h1;
        int i12 = this.f44580h0;
        int i13 = i11 + (i12 >>> 26);
        int i14 = this.f44582h2 + (i13 >>> 26);
        int i15 = this.f44583h3 + (i14 >>> 26);
        int i16 = i14 & 67108863;
        int i17 = this.f44584h4 + (i15 >>> 26);
        int i18 = i15 & 67108863;
        int i19 = ((i17 >>> 26) * 5) + (i12 & 67108863);
        int i20 = i17 & 67108863;
        int i21 = (i13 & 67108863) + (i19 >>> 26);
        int i22 = i19 & 67108863;
        int i23 = i22 + 5;
        int i24 = (i23 >>> 26) + i21;
        int i25 = (i24 >>> 26) + i16;
        int i26 = (i25 >>> 26) + i18;
        int i27 = 67108863 & i26;
        int i28 = ((i26 >>> 26) + i20) - 67108864;
        int i29 = (i28 >>> 31) - 1;
        int i30 = ~i29;
        this.f44580h0 = (i22 & i30) | (i23 & 67108863 & i29);
        this.f44581h1 = (i21 & i30) | (i24 & 67108863 & i29);
        this.f44582h2 = (i16 & i30) | (i25 & 67108863 & i29);
        this.f44583h3 = (i27 & i29) | (i18 & i30);
        this.f44584h4 = (i20 & i30) | (i28 & i29);
        long j6 = (((r3 << 26) | r8) & 4294967295L) + (this.f44585k0 & 4294967295L);
        long j10 = (((r3 >>> 6) | (r6 << 20)) & 4294967295L) + (this.f44586k1 & 4294967295L);
        Pack.intToLittleEndian((int) j6, bArr, i10);
        long j11 = j10 + (j6 >>> 32);
        Pack.intToLittleEndian((int) j11, bArr, i10 + 4);
        long j12 = (((r6 >>> 12) | (r5 << 14)) & 4294967295L) + (this.f44587k2 & 4294967295L) + (j11 >>> 32);
        Pack.intToLittleEndian((int) j12, bArr, i10 + 8);
        Pack.intToLittleEndian((int) ((((r5 >>> 18) | (r4 << 8)) & 4294967295L) + (this.f44588k3 & 4294967295L) + (j12 >>> 32)), bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        byte[] iv2;
        if (this.cipher == null) {
            iv2 = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), iv2);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f44584h4 = 0;
        this.f44583h3 = 0;
        this.f44582h2 = 0;
        this.f44581h1 = 0;
        this.f44580h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        byte[] bArr = this.singleByte;
        bArr[0] = b10;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i11 > i12) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i11 - i12, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i12 + i10, this.currentBlock, this.currentBlockOffset, iMin);
            i12 += iMin;
            this.currentBlockOffset += iMin;
        }
    }
}
