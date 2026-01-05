package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public final class Kangaroo {
    private static final int DIGESTLEN = 32;

    public static abstract class KangarooBase implements ExtendedDigest, Xof {
        private static final int BLKSIZE = 8192;
        private final CryptoServicePurpose purpose;
        private final byte[] singleByte = new byte[1];
        private boolean squeezing;
        private final int theChainLen;
        private int theCurrNode;
        private final KangarooSponge theLeaf;
        private byte[] thePersonal;
        private int theProcessed;
        private final KangarooSponge theTree;
        private static final byte[] SINGLE = {7};
        private static final byte[] INTERMEDIATE = {11};
        private static final byte[] FINAL = {-1, -1, 6};
        private static final byte[] FIRST = {3, 0, 0, 0, 0, 0, 0, 0};

        public KangarooBase(int i10, int i11, int i12, CryptoServicePurpose cryptoServicePurpose) {
            this.theTree = new KangarooSponge(i10, i11);
            this.theLeaf = new KangarooSponge(i10, i11);
            this.theChainLen = i10 >> 2;
            buildPersonal(null);
            this.purpose = cryptoServicePurpose;
            CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i10, cryptoServicePurpose));
        }

        private void buildPersonal(byte[] bArr) {
            int length = bArr == null ? 0 : bArr.length;
            byte[] bArrLengthEncode = lengthEncode(length);
            byte[] bArrCopyOf = bArr == null ? new byte[bArrLengthEncode.length + length] : Arrays.copyOf(bArr, bArrLengthEncode.length + length);
            this.thePersonal = bArrCopyOf;
            System.arraycopy(bArrLengthEncode, 0, bArrCopyOf, length, bArrLengthEncode.length);
        }

        private static byte[] lengthEncode(long j6) {
            byte b10;
            if (j6 != 0) {
                long j10 = j6;
                b10 = 1;
                while (true) {
                    j10 >>= 8;
                    if (j10 == 0) {
                        break;
                    }
                    b10 = (byte) (b10 + 1);
                }
            } else {
                b10 = 0;
            }
            byte[] bArr = new byte[b10 + 1];
            bArr[b10] = b10;
            for (int i10 = 0; i10 < b10; i10++) {
                bArr[i10] = (byte) (j6 >> (((b10 - i10) - 1) * 8));
            }
            return bArr;
        }

        private void processData(byte[] bArr, int i10, int i11) {
            if (this.squeezing) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            KangarooSponge kangarooSponge = this.theCurrNode == 0 ? this.theTree : this.theLeaf;
            int i12 = 8192 - this.theProcessed;
            if (i12 >= i11) {
                kangarooSponge.absorb(bArr, i10, i11);
                this.theProcessed += i11;
                return;
            }
            if (i12 > 0) {
                kangarooSponge.absorb(bArr, i10, i12);
                this.theProcessed += i12;
            }
            while (i12 < i11) {
                if (this.theProcessed == BLKSIZE) {
                    switchLeaf(true);
                }
                int iMin = Math.min(i11 - i12, BLKSIZE);
                this.theLeaf.absorb(bArr, i10 + i12, iMin);
                this.theProcessed += iMin;
                i12 += iMin;
            }
        }

        private void switchFinal() {
            switchLeaf(false);
            byte[] bArrLengthEncode = lengthEncode(this.theCurrNode);
            this.theTree.absorb(bArrLengthEncode, 0, bArrLengthEncode.length);
            KangarooSponge kangarooSponge = this.theTree;
            byte[] bArr = FINAL;
            kangarooSponge.absorb(bArr, 0, bArr.length);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchLeaf(boolean z6) {
            if (this.theCurrNode == 0) {
                KangarooSponge kangarooSponge = this.theTree;
                byte[] bArr = FIRST;
                kangarooSponge.absorb(bArr, 0, bArr.length);
            } else {
                KangarooSponge kangarooSponge2 = this.theLeaf;
                byte[] bArr2 = INTERMEDIATE;
                kangarooSponge2.absorb(bArr2, 0, bArr2.length);
                int i10 = this.theChainLen;
                byte[] bArr3 = new byte[i10];
                this.theLeaf.squeeze(bArr3, 0, i10);
                this.theTree.absorb(bArr3, 0, this.theChainLen);
                this.theLeaf.initSponge();
            }
            if (z6) {
                this.theCurrNode++;
            }
            this.theProcessed = 0;
        }

        private void switchSingle() {
            this.theTree.absorb(SINGLE, 0, 1);
            this.theTree.padAndSwitchToSqueezingPhase();
        }

        private void switchToSqueezing() {
            byte[] bArr = this.thePersonal;
            processData(bArr, 0, bArr.length);
            if (this.theCurrNode == 0) {
                switchSingle();
            } else {
                switchFinal();
            }
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i10) {
            return doFinal(bArr, i10, getDigestSize());
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doOutput(byte[] bArr, int i10, int i11) {
            if (!this.squeezing) {
                switchToSqueezing();
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Invalid output length");
            }
            this.theTree.squeeze(bArr, i10, i11);
            return i11;
        }

        @Override // org.bouncycastle.crypto.ExtendedDigest
        public int getByteLength() {
            return this.theTree.theRateBytes;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.theChainLen >> 1;
        }

        public void init(KangarooParameters kangarooParameters) {
            buildPersonal(kangarooParameters.getPersonalisation());
            reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.theTree.initSponge();
            this.theLeaf.initSponge();
            this.theCurrNode = 0;
            this.theProcessed = 0;
            this.squeezing = false;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b10) {
            byte[] bArr = this.singleByte;
            bArr[0] = b10;
            update(bArr, 0, 1);
        }

        @Override // org.bouncycastle.crypto.Xof
        public int doFinal(byte[] bArr, int i10, int i11) {
            if (this.squeezing) {
                throw new IllegalStateException("Already outputting");
            }
            int iDoOutput = doOutput(bArr, i10, i11);
            reset();
            return iDoOutput;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i10, int i11) {
            processData(bArr, i10, i11);
        }
    }

    public static class KangarooParameters implements CipherParameters {
        private byte[] thePersonal;

        public static class Builder {
            private byte[] thePersonal;

            public KangarooParameters build() {
                KangarooParameters kangarooParameters = new KangarooParameters();
                byte[] bArr = this.thePersonal;
                if (bArr != null) {
                    kangarooParameters.thePersonal = bArr;
                }
                return kangarooParameters;
            }

            public Builder setPersonalisation(byte[] bArr) {
                this.thePersonal = Arrays.clone(bArr);
                return this;
            }
        }

        public byte[] getPersonalisation() {
            return Arrays.clone(this.thePersonal);
        }
    }

    public static class KangarooSponge {
        private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
        private int bytesInQueue;
        private boolean squeezing;
        private final byte[] theQueue;
        private final int theRateBytes;
        private final int theRounds;
        private final long[] theState = new long[25];

        public KangarooSponge(int i10, int i11) {
            int i12 = (1600 - (i10 << 1)) >> 3;
            this.theRateBytes = i12;
            this.theRounds = i11;
            this.theQueue = new byte[i12];
            initSponge();
        }

        private void KangarooAbsorb(byte[] bArr, int i10) {
            int i11 = this.theRateBytes >> 3;
            for (int i12 = 0; i12 < i11; i12++) {
                long[] jArr = this.theState;
                jArr[i12] = jArr[i12] ^ Pack.littleEndianToLong(bArr, i10);
                i10 += 8;
            }
            KangarooPermutation();
        }

        private void KangarooExtract() {
            Pack.longToLittleEndian(this.theState, 0, this.theRateBytes >> 3, this.theQueue, 0);
        }

        private void KangarooPermutation() {
            KangarooSponge kangarooSponge = this;
            long[] jArr = kangarooSponge.theState;
            long j6 = jArr[0];
            long j10 = jArr[1];
            long j11 = jArr[2];
            char c2 = 3;
            long j12 = jArr[3];
            char c10 = 4;
            long j13 = jArr[4];
            long j14 = jArr[5];
            long j15 = jArr[6];
            long j16 = jArr[7];
            long j17 = jArr[8];
            long j18 = jArr[9];
            long j19 = jArr[10];
            long j20 = jArr[11];
            long j21 = jArr[12];
            long j22 = jArr[13];
            long j23 = jArr[14];
            long j24 = jArr[15];
            long j25 = jArr[16];
            long j26 = jArr[17];
            long j27 = jArr[18];
            long j28 = jArr[19];
            long j29 = jArr[20];
            long j30 = jArr[21];
            long j31 = jArr[22];
            long j32 = jArr[23];
            long j33 = jArr[24];
            int length = KeccakRoundConstants.length - kangarooSponge.theRounds;
            int i10 = 0;
            while (i10 < kangarooSponge.theRounds) {
                long j34 = (((j6 ^ j14) ^ j19) ^ j24) ^ j29;
                long j35 = (((j10 ^ j15) ^ j20) ^ j25) ^ j30;
                long j36 = (((j11 ^ j16) ^ j21) ^ j26) ^ j31;
                long j37 = (((j12 ^ j17) ^ j22) ^ j27) ^ j32;
                long j38 = (((j13 ^ j18) ^ j23) ^ j28) ^ j33;
                long j39 = ((j35 << 1) | (j35 >>> (-1))) ^ j38;
                long j40 = ((j36 << 1) | (j36 >>> (-1))) ^ j34;
                long j41 = ((j37 << 1) | (j37 >>> (-1))) ^ j35;
                long j42 = ((j38 << 1) | (j38 >>> (-1))) ^ j36;
                long j43 = ((j34 << 1) | (j34 >>> (-1))) ^ j37;
                long j44 = j6 ^ j39;
                long j45 = j14 ^ j39;
                long j46 = j19 ^ j39;
                long j47 = j24 ^ j39;
                long j48 = j29 ^ j39;
                long j49 = j10 ^ j40;
                long j50 = j15 ^ j40;
                long j51 = j20 ^ j40;
                long j52 = j25 ^ j40;
                long j53 = j30 ^ j40;
                long j54 = j11 ^ j41;
                long j55 = j16 ^ j41;
                long j56 = j21 ^ j41;
                long j57 = j26 ^ j41;
                long j58 = j31 ^ j41;
                long j59 = j12 ^ j42;
                long j60 = j17 ^ j42;
                long j61 = j22 ^ j42;
                long j62 = j27 ^ j42;
                long j63 = j32 ^ j42;
                long j64 = j13 ^ j43;
                long j65 = j18 ^ j43;
                long j66 = j23 ^ j43;
                long j67 = j28 ^ j43;
                long j68 = j33 ^ j43;
                long j69 = (j49 << 1) | (j49 >>> 63);
                char c11 = c2;
                long j70 = (j50 << 44) | (j50 >>> 20);
                char c12 = c10;
                long j71 = (j65 << 20) | (j65 >>> 44);
                long j72 = (j58 << 61) | (j58 >>> c11);
                long j73 = (j66 << 39) | (j66 >>> 25);
                long j74 = (j48 << 18) | (j48 >>> 46);
                int i11 = i10;
                long j75 = (j54 << 62) | (j54 >>> 2);
                long j76 = (j56 << 43) | (j56 >>> 21);
                long j77 = (j61 << 25) | (j61 >>> 39);
                long j78 = (j67 << 8) | (j67 >>> 56);
                long j79 = (j63 << 56) | (j63 >>> 8);
                long j80 = (j47 << 41) | (j47 >>> 23);
                long j81 = (j64 << 27) | (j64 >>> 37);
                long j82 = (j68 << 14) | (j68 >>> 50);
                long j83 = (j53 << 2) | (j53 >>> 62);
                long j84 = (j60 << 55) | (j60 >>> 9);
                long j85 = (j52 << 45) | (j52 >>> 19);
                long j86 = (j45 << 36) | (j45 >>> 28);
                long j87 = (j59 << 28) | (j59 >>> 36);
                long j88 = (j62 << 21) | (j62 >>> 43);
                long j89 = (j57 << 15) | (j57 >>> 49);
                long j90 = (j51 << 10) | (j51 >>> 54);
                long j91 = (j55 << 6) | (j55 >>> 58);
                long j92 = (j46 << c11) | (j46 >>> 61);
                long j93 = ((~j70) & j76) ^ j44;
                long j94 = ((~j76) & j88) ^ j70;
                long j95 = j76 ^ ((~j88) & j82);
                long j96 = j88 ^ ((~j82) & j44);
                long j97 = ((~j44) & j70) ^ j82;
                long j98 = j87 ^ ((~j71) & j92);
                long j99 = ((~j92) & j85) ^ j71;
                int i12 = length;
                long j100 = ((~j85) & j72) ^ j92;
                j17 = j85 ^ ((~j72) & j87);
                long j101 = ((~j87) & j71) ^ j72;
                j19 = j69 ^ ((~j91) & j77);
                long j102 = ((~j77) & j78) ^ j91;
                long j103 = ((~j78) & j74) ^ j77;
                j22 = j78 ^ ((~j74) & j69);
                long j104 = ((~j69) & j91) ^ j74;
                long j105 = j81 ^ ((~j86) & j90);
                long j106 = ((~j90) & j89) ^ j86;
                long j107 = j90 ^ ((~j89) & j79);
                long j108 = j89 ^ ((~j79) & j81);
                long j109 = j79 ^ ((~j81) & j86);
                long j110 = j75 ^ ((~j84) & j73);
                long j111 = ((~j73) & j80) ^ j84;
                long j112 = j73 ^ ((~j80) & j83);
                j32 = j80 ^ ((~j83) & j75);
                j33 = j83 ^ ((~j75) & j84);
                j6 = j93 ^ KeccakRoundConstants[i12 + i11];
                j21 = j103;
                j16 = j100;
                jArr = jArr;
                c2 = c11;
                j15 = j99;
                length = i12;
                j28 = j109;
                j25 = j106;
                j20 = j102;
                j27 = j108;
                j23 = j104;
                j29 = j110;
                j30 = j111;
                j31 = j112;
                j18 = j101;
                j13 = j97;
                j26 = j107;
                j24 = j105;
                j12 = j96;
                c10 = c12;
                j14 = j98;
                j11 = j95;
                j10 = j94;
                i10 = i11 + 1;
                kangarooSponge = this;
            }
            long[] jArr2 = jArr;
            jArr2[0] = j6;
            jArr2[1] = j10;
            jArr2[2] = j11;
            jArr2[c2] = j12;
            jArr2[c10] = j13;
            jArr2[5] = j14;
            jArr2[6] = j15;
            jArr2[7] = j16;
            jArr2[8] = j17;
            jArr2[9] = j18;
            jArr2[10] = j19;
            jArr2[11] = j20;
            jArr2[12] = j21;
            jArr2[13] = j22;
            jArr2[14] = j23;
            jArr2[15] = j24;
            jArr2[16] = j25;
            jArr2[17] = j26;
            jArr2[18] = j27;
            jArr2[19] = j28;
            jArr2[20] = j29;
            jArr2[21] = j30;
            jArr2[22] = j31;
            jArr2[23] = j32;
            jArr2[24] = j33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void absorb(byte[] bArr, int i10, int i11) {
            int i12;
            if (this.squeezing) {
                throw new IllegalStateException("attempt to absorb while squeezing");
            }
            int i13 = 0;
            while (i13 < i11) {
                int i14 = this.bytesInQueue;
                if (i14 != 0 || i13 > i11 - this.theRateBytes) {
                    int iMin = Math.min(this.theRateBytes - i14, i11 - i13);
                    System.arraycopy(bArr, i10 + i13, this.theQueue, this.bytesInQueue, iMin);
                    int i15 = this.bytesInQueue + iMin;
                    this.bytesInQueue = i15;
                    i13 += iMin;
                    if (i15 == this.theRateBytes) {
                        KangarooAbsorb(this.theQueue, 0);
                        this.bytesInQueue = 0;
                    }
                } else {
                    do {
                        KangarooAbsorb(bArr, i10 + i13);
                        i12 = this.theRateBytes;
                        i13 += i12;
                    } while (i13 <= i11 - i12);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void initSponge() {
            Arrays.fill(this.theState, 0L);
            Arrays.fill(this.theQueue, (byte) 0);
            this.bytesInQueue = 0;
            this.squeezing = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void padAndSwitchToSqueezingPhase() {
            int i10 = this.bytesInQueue;
            while (true) {
                int i11 = this.theRateBytes;
                if (i10 >= i11) {
                    byte[] bArr = this.theQueue;
                    int i12 = i11 - 1;
                    bArr[i12] = (byte) (bArr[i12] ^ 128);
                    KangarooAbsorb(bArr, 0);
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                    this.squeezing = true;
                    return;
                }
                this.theQueue[i10] = 0;
                i10++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void squeeze(byte[] bArr, int i10, int i11) {
            if (!this.squeezing) {
                padAndSwitchToSqueezingPhase();
            }
            int i12 = 0;
            while (i12 < i11) {
                if (this.bytesInQueue == 0) {
                    KangarooPermutation();
                    KangarooExtract();
                    this.bytesInQueue = this.theRateBytes;
                }
                int iMin = Math.min(this.bytesInQueue, i11 - i12);
                System.arraycopy(this.theQueue, this.theRateBytes - this.bytesInQueue, bArr, i10 + i12, iMin);
                this.bytesInQueue -= iMin;
                i12 += iMin;
            }
        }
    }

    public static class KangarooTwelve extends KangarooBase {
        public KangarooTwelve() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i10) {
            return super.doFinal(bArr, i10);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i10, int i11) {
            return super.doOutput(bArr, i10, i11);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "KangarooTwelve";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b10) {
            super.update(b10);
        }

        public KangarooTwelve(int i10, CryptoServicePurpose cryptoServicePurpose) {
            super(128, 12, i10, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i10, int i11) {
            return super.doFinal(bArr, i10, i11);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i10, int i11) {
            super.update(bArr, i10, i11);
        }

        public KangarooTwelve(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }

    public static class MarsupilamiFourteen extends KangarooBase {
        public MarsupilamiFourteen() {
            this(32, CryptoServicePurpose.ANY);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i10) {
            return super.doFinal(bArr, i10);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doOutput(byte[] bArr, int i10, int i11) {
            return super.doOutput(bArr, i10, i11);
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return "MarsupilamiFourteen";
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.ExtendedDigest
        public /* bridge */ /* synthetic */ int getByteLength() {
            return super.getByteLength();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ int getDigestSize() {
            return super.getDigestSize();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase
        public /* bridge */ /* synthetic */ void init(KangarooParameters kangarooParameters) {
            super.init(kangarooParameters);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte b10) {
            super.update(b10);
        }

        public MarsupilamiFourteen(int i10, CryptoServicePurpose cryptoServicePurpose) {
            super(256, 14, i10, cryptoServicePurpose);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Xof
        public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i10, int i11) {
            return super.doFinal(bArr, i10, i11);
        }

        @Override // org.bouncycastle.crypto.digests.Kangaroo.KangarooBase, org.bouncycastle.crypto.Digest
        public /* bridge */ /* synthetic */ void update(byte[] bArr, int i10, int i11) {
            super.update(bArr, i10, i11);
        }

        public MarsupilamiFourteen(CryptoServicePurpose cryptoServicePurpose) {
            this(32, cryptoServicePurpose);
        }
    }
}
