package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class ISAPDigest implements Digest {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    /* renamed from: t0, reason: collision with root package name */
    private long f44516t0;

    /* renamed from: t1, reason: collision with root package name */
    private long f44517t1;

    /* renamed from: t2, reason: collision with root package name */
    private long f44518t2;

    /* renamed from: t3, reason: collision with root package name */
    private long f44519t3;

    /* renamed from: t4, reason: collision with root package name */
    private long f44520t4;

    /* renamed from: x0, reason: collision with root package name */
    private long f44521x0;

    /* renamed from: x1, reason: collision with root package name */
    private long f44522x1;

    /* renamed from: x2, reason: collision with root package name */
    private long f44523x2;
    private long x3;

    /* renamed from: x4, reason: collision with root package name */
    private long f44524x4;

    private void P12() {
        ROUND(240L);
        ROUND(225L);
        ROUND(210L);
        ROUND(195L);
        ROUND(180L);
        ROUND(165L);
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long ROTR(long j6, long j10) {
        return (j6 << ((int) (64 - j10))) | (j6 >>> ((int) j10));
    }

    private void ROUND(long j6) {
        long j10 = this.f44521x0;
        long j11 = this.f44522x1;
        long j12 = this.f44523x2;
        long j13 = this.x3;
        long j14 = this.f44524x4;
        long j15 = ((((j10 ^ j11) ^ j12) ^ j13) ^ j6) ^ ((((j10 ^ j12) ^ j14) ^ j6) & j11);
        this.f44516t0 = j15;
        this.f44517t1 = ((((j10 ^ j12) ^ j13) ^ j14) ^ j6) ^ (((j11 ^ j12) ^ j6) & (j11 ^ j13));
        this.f44518t2 = (((j11 ^ j12) ^ j14) ^ j6) ^ (j13 & j14);
        this.f44519t3 = ((j12 ^ (j10 ^ j11)) ^ j6) ^ ((~j10) & (j13 ^ j14));
        this.f44520t4 = ((j10 ^ j14) & j11) ^ ((j11 ^ j13) ^ j14);
        this.f44521x0 = (ROTR(j15, 19L) ^ j15) ^ ROTR(this.f44516t0, 28L);
        long j16 = this.f44517t1;
        this.f44522x1 = (j16 ^ ROTR(j16, 39L)) ^ ROTR(this.f44517t1, 61L);
        long j17 = this.f44518t2;
        this.f44523x2 = ~((j17 ^ ROTR(j17, 1L)) ^ ROTR(this.f44518t2, 6L));
        long j18 = this.f44519t3;
        this.x3 = (j18 ^ ROTR(j18, 10L)) ^ ROTR(this.f44519t3, 17L);
        long j19 = this.f44520t4;
        this.f44524x4 = (j19 ^ ROTR(j19, 7L)) ^ ROTR(this.f44520t4, 41L);
    }

    public long U64BIG(long j6) {
        return (ROTR(j6, 56L) & 1095216660735L) | (ROTR(j6, 8L) & (-72057589759737856L)) | (ROTR(j6, 24L) & 71776119077928960L) | (ROTR(j6, 40L) & 280375465148160L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (i10 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        this.f44520t4 = 0L;
        this.f44519t3 = 0L;
        this.f44518t2 = 0L;
        this.f44517t1 = 0L;
        this.f44516t0 = 0L;
        this.f44521x0 = -1255492011513352131L;
        this.f44522x1 = -8380609354527731710L;
        this.f44523x2 = -5437372128236807582L;
        this.x3 = 4834782570098516968L;
        this.f44524x4 = 3787428097924915520L;
        byte[] byteArray = this.buffer.toByteArray();
        int length = byteArray.length;
        int i11 = length >> 3;
        long[] jArr = new long[i11];
        int i12 = 0;
        Pack.littleEndianToLong(byteArray, 0, jArr, 0, i11);
        int i13 = 0;
        while (length >= 8) {
            this.f44521x0 ^= U64BIG(jArr[i13]);
            P12();
            length -= 8;
            i13++;
        }
        long j6 = this.f44521x0;
        int i14 = (7 - length) << 3;
        long j10 = 128;
        while (true) {
            this.f44521x0 = j6 ^ (j10 << i14);
            if (length <= 0) {
                break;
            }
            j6 = this.f44521x0;
            length--;
            j10 = byteArray[(i13 << 3) + length] & 255;
            i14 = (7 - length) << 3;
        }
        P12();
        long[] jArr2 = new long[4];
        while (true) {
            long jU64BIG = U64BIG(this.f44521x0);
            if (i12 >= 3) {
                jArr2[i12] = jU64BIG;
                Pack.longToLittleEndian(jArr2, bArr, i10);
                this.buffer.reset();
                return 32;
            }
            jArr2[i12] = jU64BIG;
            P12();
            i12++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "ISAP Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.buffer.reset();
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
