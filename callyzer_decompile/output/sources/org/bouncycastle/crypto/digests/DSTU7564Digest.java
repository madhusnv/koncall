package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class DSTU7564Digest implements ExtendedDigest, Memoable {
    private static final int NB_1024 = 16;
    private static final int NB_512 = 8;
    private static final int NR_1024 = 14;
    private static final int NR_512 = 10;
    private static final byte[] S0 = {-88, 67, 95, 6, 107, 117, 108, 89, 113, -33, -121, -107, 23, -16, -40, 9, 109, -13, 29, -53, -55, 77, 44, -81, 121, -32, -105, -3, 111, 75, 69, 57, 62, -35, -93, 79, -76, -74, -102, 14, 31, -65, 21, -31, 73, -46, -109, -58, -110, 114, -98, 97, -47, 99, -6, -18, -12, 25, -43, -83, 88, -92, -69, -95, -36, -14, -125, 55, 66, -28, 122, 50, -100, -52, -85, 74, -113, 110, 4, 39, 46, -25, -30, 90, -106, 22, 35, 43, -62, 101, 102, 15, PSSSigner.TRAILER_IMPLICIT, -87, 71, 65, 52, 72, -4, -73, 106, -120, -91, 83, -122, -7, 91, -37, 56, 123, -61, 30, 34, 51, 36, 40, 54, -57, -78, 59, -114, 119, -70, -11, 20, -97, 8, 85, -101, 76, -2, 96, 92, -38, 24, 70, -51, 125, 33, -80, 63, 27, -119, -1, -21, -124, 105, 58, -99, -41, -45, 112, 103, 64, -75, -34, 93, 48, -111, -79, 120, 17, 1, -27, 0, 104, -104, -96, -59, 2, -90, 116, 45, 11, -94, 118, -77, -66, -50, -67, -82, -23, -118, 49, 28, -20, -15, -103, -108, -86, -10, 38, 47, -17, -24, -116, 53, 3, -44, 127, -5, 5, -63, 94, -112, 32, 61, -126, -9, -22, 10, 13, 126, -8, 80, 26, -60, 7, 87, -72, 60, 98, -29, -56, -84, 82, 100, 16, -48, -39, 19, 12, 18, 41, 81, -71, -49, -42, 115, -115, -127, 84, -64, -19, 78, 68, -89, 42, -123, 37, -26, -54, 124, -117, 86, -128};
    private static final byte[] S1 = {-50, -69, -21, -110, -22, -53, 19, -63, -23, 58, -42, -78, -46, -112, 23, -8, 66, 21, 86, -76, 101, 28, -120, 67, -59, 92, 54, -70, -11, 87, 103, -115, 49, -10, 100, 88, -98, -12, 34, -86, 117, 15, 2, -79, -33, 109, 115, 77, 124, 38, 46, -9, 8, 93, 68, 62, -97, 20, -56, -82, 84, 16, -40, PSSSigner.TRAILER_IMPLICIT, 26, 107, 105, -13, -67, 51, -85, -6, -47, -101, 104, 78, 22, -107, -111, -18, 76, 99, -114, 91, -52, 60, 25, -95, -127, 73, 123, -39, 111, 55, 96, -54, -25, 43, 72, -3, -106, 69, -4, 65, 18, 13, 121, -27, -119, -116, -29, 32, 48, -36, -73, 108, 74, -75, 63, -105, -44, 98, 45, 6, -92, -91, -125, 95, 42, -38, -55, 0, 126, -94, 85, -65, 17, -43, -100, -49, 14, 10, 61, 81, 125, -109, 27, -2, -60, 71, 9, -122, 11, -113, -99, 106, 7, -71, -80, -104, 24, 50, 113, 75, -17, 59, 112, -96, -28, 64, -1, -61, -87, -26, 120, -7, -117, 70, -128, 30, 56, -31, -72, -88, -32, 12, 35, 118, 29, 37, 36, 5, -15, 110, -108, 40, -102, -124, -24, -93, 79, 119, -45, -123, -30, 82, -14, -126, 80, 122, 47, 116, 83, -77, 97, -81, 57, 53, -34, -51, 31, -103, -84, -83, 114, 44, -35, -48, -121, -66, 94, -90, -20, 4, -58, 3, 52, -5, -37, 89, -74, -62, 1, -16, 90, -19, -89, 102, 33, 127, -118, 39, -57, -64, 41, -41};
    private static final byte[] S2 = {-109, -39, -102, -75, -104, 34, 69, -4, -70, 106, -33, 2, -97, -36, 81, 89, 74, 23, 43, -62, -108, -12, -69, -93, 98, -28, 113, -44, -51, 112, 22, -31, 73, 60, -64, -40, 92, -101, -83, -123, 83, -95, 122, -56, 45, -32, -47, 114, -90, 44, -60, -29, 118, 120, -73, -76, 9, 59, 14, 65, 76, -34, -78, -112, 37, -91, -41, 3, 17, 0, -61, 46, -110, -17, 78, 18, -99, 125, -53, 53, 16, -43, 79, -98, 77, -87, 85, -58, -48, 123, 24, -105, -45, 54, -26, 72, 86, -127, -113, 119, -52, -100, -71, -30, -84, -72, 47, 21, -92, 124, -38, 56, 30, 11, 5, -42, 20, 110, 108, 126, 102, -3, -79, -27, 96, -81, 94, 51, -121, -55, -16, 93, 109, 63, -120, -115, -57, -9, 29, -23, -20, -19, -128, 41, 39, -49, -103, -88, 80, 15, 55, 36, 40, 48, -107, -46, 62, 91, 64, -125, -77, 105, 87, 31, 7, 28, -118, PSSSigner.TRAILER_IMPLICIT, 32, -21, -50, -114, -85, -18, 49, -94, 115, -7, -54, 58, 26, -5, 13, -63, -2, -6, -14, 111, -67, -106, -35, 67, 82, -74, 8, -13, -82, -66, 25, -119, 50, 38, -80, -22, 75, 100, -124, -126, 107, -11, 121, -65, 1, 95, 117, 99, 27, 35, 61, 104, 42, 101, -24, -111, -10, -1, 19, 88, -15, 71, 10, 127, -59, -89, -25, 97, 90, 6, 70, 68, 66, 4, -96, -37, 57, -122, 84, -86, -116, 52, 33, -117, -8, 12, 116, 103};
    private static final byte[] S3 = {104, -115, -54, 77, 115, 75, 78, 42, -44, 82, 38, -77, 84, 30, 25, 31, 34, 3, 70, 61, 45, 74, 83, -125, 19, -118, -73, -43, 37, 121, -11, -67, 88, 47, 13, 2, -19, 81, -98, 17, -14, 62, 85, 94, -47, 22, 60, 102, 112, 93, -13, 69, 64, -52, -24, -108, 86, 8, -50, 26, 58, -46, -31, -33, -75, 56, 110, 14, -27, -12, -7, -122, -23, 79, -42, -123, 35, -49, 50, -103, 49, 20, -82, -18, -56, 72, -45, 48, -95, -110, 65, -79, 24, -60, 44, 113, 114, 68, 21, -3, 55, -66, 95, -86, -101, -120, -40, -85, -119, -100, -6, 96, -22, PSSSigner.TRAILER_IMPLICIT, 98, 12, 36, -90, -88, -20, 103, 32, -37, 124, 40, -35, -84, 91, 52, 126, 16, -15, 123, -113, 99, -96, 5, -102, 67, 119, 33, -65, 39, 9, -61, -97, -74, -41, 41, -62, -21, -64, -92, -117, -116, 29, -5, -1, -63, -78, -105, 46, -8, 101, -10, 117, 7, 4, 73, 51, -28, -39, -71, -48, 66, -57, 108, -112, 0, -114, 111, 80, 1, -59, -38, 71, 63, -51, 105, -94, -30, 122, -89, -58, -109, 15, 10, 6, -26, 43, -106, -93, 28, -81, 106, 18, -124, 57, -25, -80, -126, -9, -2, -99, -121, 92, -127, 53, -34, -76, -91, -4, -128, -17, -53, -69, 107, 118, -70, 90, 125, 120, 11, -107, -29, -83, 116, -104, 59, 54, 100, 109, -36, -16, 89, -87, 76, 23, 127, -111, -72, -55, 87, 27, -32, 97};
    private int blockSize;
    private byte[] buf;
    private int bufOff;
    private int columns;
    private int hashSize;
    private long inputBlocks;
    private final CryptoServicePurpose purpose;
    private int rounds;
    private long[] state;
    private long[] tempState1;
    private long[] tempState2;

    public DSTU7564Digest(int i10) {
        this(i10, CryptoServicePurpose.ANY);
    }

    /* renamed from: P */
    private void m11186P(long[] jArr) {
        for (int i10 = 0; i10 < this.rounds; i10++) {
            long j6 = i10;
            for (int i11 = 0; i11 < this.columns; i11++) {
                jArr[i11] = jArr[i11] ^ j6;
                j6 += 16;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    /* renamed from: Q */
    private void m11187Q(long[] jArr) {
        for (int i10 = 0; i10 < this.rounds; i10++) {
            long j6 = ((((this.columns - 1) << 4) ^ i10) << 56) | 67818912035696883L;
            for (int i11 = 0; i11 < this.columns; i11++) {
                jArr[i11] = jArr[i11] + j6;
                j6 -= 1152921504606846976L;
            }
            shiftRows(jArr);
            subBytes(jArr);
            mixColumns(jArr);
        }
    }

    private void copyIn(DSTU7564Digest dSTU7564Digest) {
        this.hashSize = dSTU7564Digest.hashSize;
        this.blockSize = dSTU7564Digest.blockSize;
        this.rounds = dSTU7564Digest.rounds;
        int i10 = this.columns;
        if (i10 <= 0 || i10 != dSTU7564Digest.columns) {
            this.columns = dSTU7564Digest.columns;
            this.state = Arrays.clone(dSTU7564Digest.state);
            int i11 = this.columns;
            this.tempState1 = new long[i11];
            this.tempState2 = new long[i11];
            this.buf = Arrays.clone(dSTU7564Digest.buf);
        } else {
            System.arraycopy(dSTU7564Digest.state, 0, this.state, 0, i10);
            System.arraycopy(dSTU7564Digest.buf, 0, this.buf, 0, this.blockSize);
        }
        this.inputBlocks = dSTU7564Digest.inputBlocks;
        this.bufOff = dSTU7564Digest.bufOff;
    }

    private static long mixColumn(long j6) {
        long j10 = ((9187201950435737471L & j6) << 1) ^ (((j6 & (-9187201950435737472L)) >>> 7) * 29);
        long jRotate = rotate(8, j6) ^ j6;
        long jRotate2 = (jRotate ^ rotate(16, jRotate)) ^ rotate(48, j6);
        long j11 = (j6 ^ jRotate2) ^ j10;
        return ((rotate(32, (((j11 & 4629771061636907072L) >>> 6) * 29) ^ (((((-9187201950435737472L) & j11) >>> 6) * 29) ^ ((4557430888798830399L & j11) << 2))) ^ jRotate2) ^ rotate(40, j10)) ^ rotate(48, j10);
    }

    private void mixColumns(long[] jArr) {
        for (int i10 = 0; i10 < this.columns; i10++) {
            jArr[i10] = mixColumn(jArr[i10]);
        }
    }

    private void processBlock(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this.columns; i11++) {
            long jLittleEndianToLong = Pack.littleEndianToLong(bArr, i10);
            i10 += 8;
            this.tempState1[i11] = this.state[i11] ^ jLittleEndianToLong;
            this.tempState2[i11] = jLittleEndianToLong;
        }
        m11186P(this.tempState1);
        m11187Q(this.tempState2);
        for (int i12 = 0; i12 < this.columns; i12++) {
            long[] jArr = this.state;
            jArr[i12] = jArr[i12] ^ (this.tempState1[i12] ^ this.tempState2[i12]);
        }
    }

    private static long rotate(int i10, long j6) {
        return (j6 << (-i10)) | (j6 >>> i10);
    }

    private void shiftRows(long[] jArr) {
        int i10 = this.columns;
        if (i10 == 8) {
            long j6 = jArr[0];
            long j10 = jArr[1];
            long j11 = jArr[2];
            long j12 = jArr[3];
            long j13 = jArr[4];
            long j14 = jArr[5];
            long j15 = jArr[6];
            long j16 = jArr[7];
            long j17 = (j6 ^ j13) & (-4294967296L);
            long j18 = j6 ^ j17;
            long j19 = j13 ^ j17;
            long j20 = (j10 ^ j14) & 72057594021150720L;
            long j21 = j10 ^ j20;
            long j22 = j14 ^ j20;
            long j23 = (j11 ^ j15) & 281474976645120L;
            long j24 = j11 ^ j23;
            long j25 = j15 ^ j23;
            long j26 = (j12 ^ j16) & 1099511627520L;
            long j27 = j12 ^ j26;
            long j28 = j16 ^ j26;
            long j29 = (j18 ^ j24) & (-281470681808896L);
            long j30 = j18 ^ j29;
            long j31 = j24 ^ j29;
            long j32 = (j21 ^ j27) & 72056494543077120L;
            long j33 = j21 ^ j32;
            long j34 = j27 ^ j32;
            long j35 = (j19 ^ j25) & (-281470681808896L);
            long j36 = j19 ^ j35;
            long j37 = j25 ^ j35;
            long j38 = (j22 ^ j28) & 72056494543077120L;
            long j39 = j22 ^ j38;
            long j40 = j28 ^ j38;
            long j41 = (j30 ^ j33) & (-71777214294589696L);
            long j42 = j30 ^ j41;
            long j43 = j33 ^ j41;
            long j44 = (j31 ^ j34) & (-71777214294589696L);
            long j45 = j31 ^ j44;
            long j46 = j34 ^ j44;
            long j47 = (j36 ^ j39) & (-71777214294589696L);
            long j48 = (j37 ^ j40) & (-71777214294589696L);
            jArr[0] = j42;
            jArr[1] = j43;
            jArr[2] = j45;
            jArr[3] = j46;
            jArr[4] = j36 ^ j47;
            jArr[5] = j39 ^ j47;
            jArr[6] = j37 ^ j48;
            jArr[7] = j40 ^ j48;
            return;
        }
        if (i10 != 16) {
            throw new IllegalStateException("unsupported state size: only 512/1024 are allowed");
        }
        long j49 = jArr[0];
        long j50 = jArr[1];
        long j51 = jArr[2];
        long j52 = jArr[3];
        long j53 = jArr[4];
        long j54 = jArr[5];
        long j55 = jArr[6];
        long j56 = jArr[7];
        long j57 = jArr[8];
        long j58 = jArr[9];
        long j59 = jArr[10];
        long j60 = jArr[11];
        long j61 = jArr[12];
        long j62 = jArr[13];
        long j63 = jArr[14];
        long j64 = jArr[15];
        long j65 = (j49 ^ j57) & (-72057594037927936L);
        long j66 = j49 ^ j65;
        long j67 = j57 ^ j65;
        long j68 = (j50 ^ j58) & (-72057594037927936L);
        long j69 = j50 ^ j68;
        long j70 = j58 ^ j68;
        long j71 = (j51 ^ j59) & (-281474976710656L);
        long j72 = j51 ^ j71;
        long j73 = j59 ^ j71;
        long j74 = (j52 ^ j60) & (-1099511627776L);
        long j75 = j52 ^ j74;
        long j76 = j60 ^ j74;
        long j77 = (j53 ^ j61) & (-4294967296L);
        long j78 = j53 ^ j77;
        long j79 = j61 ^ j77;
        long j80 = (j54 ^ j62) & 72057594021150720L;
        long j81 = j54 ^ j80;
        long j82 = j62 ^ j80;
        long j83 = (j55 ^ j63) & 72057594037862400L;
        long j84 = j55 ^ j83;
        long j85 = j63 ^ j83;
        long j86 = (j56 ^ j64) & 72057594037927680L;
        long j87 = j56 ^ j86;
        long j88 = j64 ^ j86;
        long j89 = (j66 ^ j78) & 72057589742960640L;
        long j90 = j66 ^ j89;
        long j91 = j78 ^ j89;
        long j92 = (j69 ^ j81) & (-16777216);
        long j93 = j69 ^ j92;
        long j94 = j81 ^ j92;
        long j95 = (j72 ^ j84) & (-71776119061282816L);
        long j96 = j72 ^ j95;
        long j97 = j84 ^ j95;
        long j98 = (j75 ^ j87) & (-72056494526300416L);
        long j99 = j75 ^ j98;
        long j100 = j87 ^ j98;
        long j101 = (j67 ^ j79) & 72057589742960640L;
        long j102 = j67 ^ j101;
        long j103 = j79 ^ j101;
        long j104 = (j70 ^ j82) & (-16777216);
        long j105 = j70 ^ j104;
        long j106 = j82 ^ j104;
        long j107 = (j73 ^ j85) & (-71776119061282816L);
        long j108 = j73 ^ j107;
        long j109 = j85 ^ j107;
        long j110 = (j76 ^ j88) & (-72056494526300416L);
        long j111 = j76 ^ j110;
        long j112 = j88 ^ j110;
        long j113 = (j90 ^ j96) & (-281470681808896L);
        long j114 = j90 ^ j113;
        long j115 = j96 ^ j113;
        long j116 = (j93 ^ j99) & 72056494543077120L;
        long j117 = j93 ^ j116;
        long j118 = j99 ^ j116;
        long j119 = (j91 ^ j97) & (-281470681808896L);
        long j120 = j91 ^ j119;
        long j121 = j97 ^ j119;
        long j122 = (j94 ^ j100) & 72056494543077120L;
        long j123 = j94 ^ j122;
        long j124 = j100 ^ j122;
        long j125 = (j102 ^ j108) & (-281470681808896L);
        long j126 = j102 ^ j125;
        long j127 = j108 ^ j125;
        long j128 = (j105 ^ j111) & 72056494543077120L;
        long j129 = j105 ^ j128;
        long j130 = j111 ^ j128;
        long j131 = (j103 ^ j109) & (-281470681808896L);
        long j132 = j103 ^ j131;
        long j133 = j109 ^ j131;
        long j134 = (j106 ^ j112) & 72056494543077120L;
        long j135 = j106 ^ j134;
        long j136 = j112 ^ j134;
        long j137 = (j114 ^ j117) & (-71777214294589696L);
        long j138 = j114 ^ j137;
        long j139 = j117 ^ j137;
        long j140 = (j115 ^ j118) & (-71777214294589696L);
        long j141 = j115 ^ j140;
        long j142 = j118 ^ j140;
        long j143 = (j120 ^ j123) & (-71777214294589696L);
        long j144 = j120 ^ j143;
        long j145 = j123 ^ j143;
        long j146 = (j121 ^ j124) & (-71777214294589696L);
        long j147 = j121 ^ j146;
        long j148 = j124 ^ j146;
        long j149 = (j126 ^ j129) & (-71777214294589696L);
        long j150 = j126 ^ j149;
        long j151 = j129 ^ j149;
        long j152 = (j127 ^ j130) & (-71777214294589696L);
        long j153 = j127 ^ j152;
        long j154 = j130 ^ j152;
        long j155 = (j132 ^ j135) & (-71777214294589696L);
        long j156 = (j133 ^ j136) & (-71777214294589696L);
        jArr[0] = j138;
        jArr[1] = j139;
        jArr[2] = j141;
        jArr[3] = j142;
        jArr[4] = j144;
        jArr[5] = j145;
        jArr[6] = j147;
        jArr[7] = j148;
        jArr[8] = j150;
        jArr[9] = j151;
        jArr[10] = j153;
        jArr[11] = j154;
        jArr[12] = j132 ^ j155;
        jArr[13] = j135 ^ j155;
        jArr[14] = j133 ^ j156;
        jArr[15] = j136 ^ j156;
    }

    private void subBytes(long[] jArr) {
        for (int i10 = 0; i10 < this.columns; i10++) {
            long j6 = jArr[i10];
            int i11 = (int) j6;
            int i12 = (int) (j6 >>> 32);
            byte[] bArr = S0;
            byte b10 = bArr[i11 & 255];
            byte[] bArr2 = S1;
            byte b11 = bArr2[(i11 >>> 8) & 255];
            byte[] bArr3 = S2;
            byte b12 = bArr3[(i11 >>> 16) & 255];
            int i13 = (S3[i11 >>> 24] << 24) | (b10 & 255) | ((b11 & 255) << 8) | ((b12 & 255) << 16);
            byte b13 = bArr[i12 & 255];
            byte b14 = bArr2[(i12 >>> 8) & 255];
            byte b15 = bArr3[(i12 >>> 16) & 255];
            jArr[i10] = (i13 & 4294967295L) | (((r10[i12 >>> 24] << 24) | (((b13 & 255) | ((b14 & 255) << 8)) | ((b15 & 255) << 16))) << 32);
        }
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new DSTU7564Digest(this);
    }

    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        int i12;
        int i13 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i14 = i13 + 1;
        this.bufOff = i14;
        bArr2[i13] = -128;
        int i15 = this.blockSize - 12;
        int i16 = 0;
        if (i14 > i15) {
            while (true) {
                int i17 = this.bufOff;
                if (i17 >= this.blockSize) {
                    break;
                }
                byte[] bArr3 = this.buf;
                this.bufOff = i17 + 1;
                bArr3[i17] = 0;
            }
            this.bufOff = 0;
            processBlock(this.buf, 0);
        }
        while (true) {
            i11 = this.bufOff;
            if (i11 >= i15) {
                break;
            }
            byte[] bArr4 = this.buf;
            this.bufOff = i11 + 1;
            bArr4[i11] = 0;
        }
        long j6 = (((this.inputBlocks & 4294967295L) * this.blockSize) + i13) << 3;
        Pack.intToLittleEndian((int) j6, this.buf, i11);
        int i18 = this.bufOff + 4;
        this.bufOff = i18;
        Pack.longToLittleEndian((j6 >>> 32) + (((this.inputBlocks >>> 32) * this.blockSize) << 3), this.buf, i18);
        processBlock(this.buf, 0);
        System.arraycopy(this.state, 0, this.tempState1, 0, this.columns);
        m11186P(this.tempState1);
        while (true) {
            i12 = this.columns;
            if (i16 >= i12) {
                break;
            }
            long[] jArr = this.state;
            jArr[i16] = jArr[i16] ^ this.tempState1[i16];
            i16++;
        }
        for (int i19 = i12 - (this.hashSize >>> 3); i19 < this.columns; i19++) {
            Pack.longToLittleEndian(this.state[i19], bArr, i10);
            i10 += 8;
        }
        reset();
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "DSTU7564";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.hashSize;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, 0L);
        this.state[0] = this.blockSize;
        this.inputBlocks = 0L;
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        byte[] bArr = this.buf;
        int i10 = this.bufOff;
        int i11 = i10 + 1;
        this.bufOff = i11;
        bArr[i10] = b10;
        if (i11 == this.blockSize) {
            processBlock(bArr, 0);
            this.bufOff = 0;
            this.inputBlocks++;
        }
    }

    public DSTU7564Digest(int i10, CryptoServicePurpose cryptoServicePurpose) {
        int i11;
        this.purpose = cryptoServicePurpose;
        if (i10 != 256 && i10 != 384 && i10 != 512) {
            throw new IllegalArgumentException("Hash size is not recommended. Use 256/384/512 instead");
        }
        this.hashSize = i10 >>> 3;
        if (i10 > 256) {
            this.columns = 16;
            i11 = 14;
        } else {
            this.columns = 8;
            i11 = 10;
        }
        this.rounds = i11;
        int i12 = this.columns;
        int i13 = i12 << 3;
        this.blockSize = i13;
        long[] jArr = new long[i12];
        this.state = jArr;
        jArr[0] = i13;
        this.tempState1 = new long[i12];
        this.tempState2 = new long[i12];
        this.buf = new byte[i13];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((DSTU7564Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.bufOff != 0 && i11 > 0) {
            update(bArr[i10]);
            i11--;
            i10++;
        }
        if (i11 > 0) {
            while (i11 >= this.blockSize) {
                processBlock(bArr, i10);
                int i12 = this.blockSize;
                i10 += i12;
                i11 -= i12;
                this.inputBlocks++;
            }
            while (i11 > 0) {
                update(bArr[i10]);
                i11--;
                i10++;
            }
        }
    }

    public DSTU7564Digest(DSTU7564Digest dSTU7564Digest) {
        this.purpose = dSTU7564Digest.purpose;
        copyIn(dSTU7564Digest);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
