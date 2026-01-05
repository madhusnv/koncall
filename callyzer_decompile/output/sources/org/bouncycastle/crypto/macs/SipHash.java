package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class SipHash implements Mac {

    /* renamed from: c */
    protected final int f27699c;

    /* renamed from: d */
    protected final int f27700d;

    /* renamed from: k0, reason: collision with root package name */
    protected long f44598k0;

    /* renamed from: k1, reason: collision with root package name */
    protected long f44599k1;

    /* renamed from: m */
    protected long f27701m;

    /* renamed from: v0, reason: collision with root package name */
    protected long f44600v0;

    /* renamed from: v1, reason: collision with root package name */
    protected long f44601v1;

    /* renamed from: v2, reason: collision with root package name */
    protected long f44602v2;

    /* renamed from: v3, reason: collision with root package name */
    protected long f44603v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f27701m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f27699c = 2;
        this.f27700d = 4;
    }

    public static long rotateLeft(long j6, int i10) {
        return (j6 >>> (-i10)) | (j6 << i10);
    }

    public void applySipRounds(int i10) {
        long jRotateLeft = this.f44600v0;
        long jRotateLeft2 = this.f44601v1;
        long jRotateLeft3 = this.f44602v2;
        long jRotateLeft4 = this.f44603v3;
        for (int i11 = 0; i11 < i10; i11++) {
            long j6 = jRotateLeft + jRotateLeft2;
            long j10 = jRotateLeft3 + jRotateLeft4;
            long jRotateLeft5 = rotateLeft(jRotateLeft2, 13) ^ j6;
            long jRotateLeft6 = rotateLeft(jRotateLeft4, 16) ^ j10;
            long j11 = j10 + jRotateLeft5;
            jRotateLeft = rotateLeft(j6, 32) + jRotateLeft6;
            jRotateLeft2 = rotateLeft(jRotateLeft5, 17) ^ j11;
            jRotateLeft4 = rotateLeft(jRotateLeft6, 21) ^ jRotateLeft;
            jRotateLeft3 = rotateLeft(j11, 32);
        }
        this.f44600v0 = jRotateLeft;
        this.f44601v1 = jRotateLeft2;
        this.f44602v2 = jRotateLeft3;
        this.f44603v3 = jRotateLeft4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        Pack.longToLittleEndian(doFinal(), bArr, i10);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f27699c + "-" + this.f27700d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f44598k0 = Pack.littleEndianToLong(key, 0);
        this.f44599k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.f44603v3 ^= this.f27701m;
        applySipRounds(this.f27699c);
        this.f44600v0 ^= this.f27701m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j6 = this.f44598k0;
        this.f44600v0 = 8317987319222330741L ^ j6;
        long j10 = this.f44599k1;
        this.f44601v1 = 7237128888997146477L ^ j10;
        this.f44602v2 = j6 ^ 7816392313619706465L;
        this.f44603v3 = 8387220255154660723L ^ j10;
        this.f27701m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        this.f27701m = (this.f27701m >>> 8) | ((b10 & 255) << 56);
        int i10 = this.wordPos + 1;
        this.wordPos = i10;
        if (i10 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i10, int i11) {
        this.f27701m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f27699c = i10;
        this.f27700d = i11;
    }

    public long doFinal() {
        this.f27701m = ((this.f27701m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.f44602v2 ^= 255;
        applySipRounds(this.f27700d);
        long j6 = ((this.f44600v0 ^ this.f44601v1) ^ this.f44602v2) ^ this.f44603v3;
        reset();
        return j6;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = i11 & (-8);
        int i13 = this.wordPos;
        char c2 = '8';
        long j6 = 255;
        int i14 = 0;
        if (i13 == 0) {
            while (i14 < i12) {
                this.f27701m = Pack.littleEndianToLong(bArr, i10 + i14);
                processMessageWord();
                i14 += 8;
            }
            while (i14 < i11) {
                long j10 = this.f27701m >>> 8;
                this.f27701m = j10;
                this.f27701m = j10 | ((bArr[i10 + i14] & 255) << 56);
                i14++;
            }
            this.wordPos = i11 - i12;
            return;
        }
        int i15 = i13 << 3;
        int i16 = 0;
        while (i16 < i12) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i10 + i16);
            this.f27701m = (this.f27701m >>> (-i15)) | (jLittleEndianToLong << i15);
            processMessageWord();
            this.f27701m = jLittleEndianToLong;
            i16 += 8;
            c2 = c2;
            j6 = j6;
        }
        char c10 = c2;
        long j11 = j6;
        while (i16 < i11) {
            long j12 = this.f27701m >>> 8;
            this.f27701m = j12;
            this.f27701m = j12 | ((bArr[i10 + i16] & j11) << c10);
            int i17 = this.wordPos + 1;
            this.wordPos = i17;
            if (i17 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i16++;
        }
    }
}
