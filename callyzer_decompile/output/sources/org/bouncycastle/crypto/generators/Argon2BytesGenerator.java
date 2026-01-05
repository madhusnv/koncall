package org.bouncycastle.crypto.generators;

import mm.AbstractC4801l;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.Argon2Parameters;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
public class Argon2BytesGenerator {
    private static final int ARGON2_ADDRESSES_IN_BLOCK = 128;
    private static final int ARGON2_BLOCK_SIZE = 1024;
    private static final int ARGON2_PREHASH_DIGEST_LENGTH = 64;
    private static final int ARGON2_PREHASH_SEED_LENGTH = 72;
    private static final int ARGON2_QWORDS_IN_BLOCK = 128;
    private static final int ARGON2_SYNC_POINTS = 4;
    private static final long M32L = 4294967295L;
    private static final int MAX_PARALLELISM = 16777216;
    private static final int MIN_ITERATIONS = 1;
    private static final int MIN_OUTLEN = 4;
    private static final int MIN_PARALLELISM = 1;
    private static final byte[] ZERO_BYTES = new byte[4];
    private int laneLength;
    private Block[] memory;
    private Argon2Parameters parameters;
    private int segmentLength;

    public static class Block {
        private static final int SIZE = 128;

        /* renamed from: v */
        private final long[] f27681v;

        private Block() {
            this.f27681v = new long[128];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void copyBlock(Block block) {
            System.arraycopy(block.f27681v, 0, this.f27681v, 0, 128);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xor(Block block, Block block2) {
            long[] jArr = this.f27681v;
            long[] jArr2 = block.f27681v;
            long[] jArr3 = block2.f27681v;
            for (int i10 = 0; i10 < 128; i10++) {
                jArr[i10] = jArr2[i10] ^ jArr3[i10];
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block) {
            long[] jArr = this.f27681v;
            long[] jArr2 = block.f27681v;
            for (int i10 = 0; i10 < 128; i10++) {
                jArr[i10] = jArr[i10] ^ jArr2[i10];
            }
        }

        public Block clear() {
            Arrays.fill(this.f27681v, 0L);
            return this;
        }

        public void fromBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("input shorter than blocksize");
            }
            Pack.littleEndianToLong(bArr, 0, this.f27681v);
        }

        public void toBytes(byte[] bArr) {
            if (bArr.length < 1024) {
                throw new IllegalArgumentException("output shorter than blocksize");
            }
            Pack.longToLittleEndian(this.f27681v, bArr, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void xorWith(Block block, Block block2) {
            long[] jArr = this.f27681v;
            long[] jArr2 = block.f27681v;
            long[] jArr3 = block2.f27681v;
            for (int i10 = 0; i10 < 128; i10++) {
                jArr[i10] = jArr[i10] ^ (jArr2[i10] ^ jArr3[i10]);
            }
        }
    }

    public static class FillBlock {

        /* renamed from: R */
        Block f27682R;

        /* renamed from: Z */
        Block f27683Z;
        Block addressBlock;
        Block inputBlock;

        private FillBlock() {
            this.f27682R = new Block();
            this.f27683Z = new Block();
            this.addressBlock = new Block();
            this.inputBlock = new Block();
        }

        private void applyBlake() {
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = i10 * 16;
                Argon2BytesGenerator.roundFunction(this.f27683Z, i11, i11 + 1, i11 + 2, i11 + 3, i11 + 4, i11 + 5, i11 + 6, i11 + 7, i11 + 8, i11 + 9, i11 + 10, i11 + 11, i11 + 12, i11 + 13, i11 + 14, i11 + 15);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = i12 * 2;
                Argon2BytesGenerator.roundFunction(this.f27683Z, i13, i13 + 1, i13 + 16, i13 + 17, i13 + 32, i13 + 33, i13 + 48, i13 + 49, i13 + 64, i13 + 65, i13 + 80, i13 + 81, i13 + 96, i13 + 97, i13 + 112, i13 + 113);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2) {
            this.f27683Z.copyBlock(block);
            applyBlake();
            block2.xor(block, this.f27683Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlockWithXor(Block block, Block block2, Block block3) {
            this.f27682R.xor(block, block2);
            this.f27683Z.copyBlock(this.f27682R);
            applyBlake();
            block3.xorWith(this.f27682R, this.f27683Z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillBlock(Block block, Block block2, Block block3) {
            this.f27682R.xor(block, block2);
            this.f27683Z.copyBlock(this.f27682R);
            applyBlake();
            block3.xor(this.f27682R, this.f27683Z);
        }
    }

    public static class Position {
        int lane;
        int pass;
        int slice;
    }

    /* renamed from: F */
    private static void m11220F(long[] jArr, int i10, int i11, int i12, int i13) {
        quarterRound(jArr, i10, i11, i13, 32);
        quarterRound(jArr, i12, i13, i11, 24);
        quarterRound(jArr, i10, i11, i13, 16);
        quarterRound(jArr, i12, i13, i11, 63);
    }

    private static void addByteString(byte[] bArr, Digest digest, byte[] bArr2) {
        if (bArr2 == null) {
            digest.update(ZERO_BYTES, 0, 4);
            return;
        }
        Pack.intToLittleEndian(bArr2.length, bArr, 0);
        digest.update(bArr, 0, 4);
        digest.update(bArr2, 0, bArr2.length);
    }

    private void digest(byte[] bArr, byte[] bArr2, int i10, int i11) {
        Block block = this.memory[this.laneLength - 1];
        for (int i12 = 1; i12 < this.parameters.getLanes(); i12++) {
            int i13 = this.laneLength;
            block.xorWith(this.memory[(i13 - 1) + (i12 * i13)]);
        }
        block.toBytes(bArr);
        hash(bArr, bArr2, i10, i11);
    }

    private void doInit(Argon2Parameters argon2Parameters) {
        int memory = argon2Parameters.getMemory();
        if (memory < argon2Parameters.getLanes() * 8) {
            memory = argon2Parameters.getLanes() * 8;
        }
        int lanes = memory / (argon2Parameters.getLanes() * 4);
        this.segmentLength = lanes;
        this.laneLength = lanes * 4;
        initMemory(argon2Parameters.getLanes() * 4 * lanes);
    }

    private void fillFirstBlocks(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[ARGON2_PREHASH_SEED_LENGTH];
        System.arraycopy(bArr2, 0, bArr3, 0, 64);
        bArr3[64] = 1;
        for (int i10 = 0; i10 < this.parameters.getLanes(); i10++) {
            Pack.intToLittleEndian(i10, bArr2, 68);
            Pack.intToLittleEndian(i10, bArr3, 68);
            hash(bArr2, bArr, 0, 1024);
            this.memory[this.laneLength * i10].fromBytes(bArr);
            hash(bArr3, bArr, 0, 1024);
            this.memory[(this.laneLength * i10) + 1].fromBytes(bArr);
        }
    }

    private void fillMemoryBlocks() {
        FillBlock fillBlock = new FillBlock();
        Position position = new Position();
        for (int i10 = 0; i10 < this.parameters.getIterations(); i10++) {
            position.pass = i10;
            for (int i11 = 0; i11 < 4; i11++) {
                position.slice = i11;
                for (int i12 = 0; i12 < this.parameters.getLanes(); i12++) {
                    position.lane = i12;
                    fillSegment(fillBlock, position);
                }
            }
        }
    }

    private void fillSegment(FillBlock fillBlock, Position position) {
        Block blockClear;
        Block blockClear2;
        FillBlock fillBlock2 = fillBlock;
        Position position2 = position;
        boolean zIsDataIndependentAddressing = isDataIndependentAddressing(position2);
        int startingIndex = getStartingIndex(position2);
        int iM11230a = AbstractC5601a.m11230a(position2.slice, this.segmentLength, position2.lane * this.laneLength, startingIndex);
        int prevOffset = getPrevOffset(iM11230a);
        if (zIsDataIndependentAddressing) {
            blockClear = fillBlock2.addressBlock.clear();
            blockClear2 = fillBlock2.inputBlock.clear();
            initAddressBlocks(fillBlock2, position2, blockClear2, blockClear);
        } else {
            blockClear = null;
            blockClear2 = null;
        }
        boolean zIsWithXor = isWithXor(position2);
        while (true) {
            int i10 = iM11230a;
            if (startingIndex >= this.segmentLength) {
                return;
            }
            Block block = blockClear;
            int i11 = prevOffset;
            Block block2 = blockClear2;
            long pseudoRandom = getPseudoRandom(fillBlock2, startingIndex, block, block2, i11, zIsDataIndependentAddressing);
            boolean z6 = zIsDataIndependentAddressing;
            FillBlock fillBlock3 = fillBlock2;
            int refLane = getRefLane(position2, pseudoRandom);
            int refColumn = getRefColumn(position2, startingIndex, pseudoRandom, refLane == position2.lane);
            Block[] blockArr = this.memory;
            Block block3 = blockArr[i11];
            Block block4 = blockArr[(this.laneLength * refLane) + refColumn];
            Block block5 = blockArr[i10];
            if (zIsWithXor) {
                fillBlock3.fillBlockWithXor(block3, block4, block5);
            } else {
                fillBlock3.fillBlock(block3, block4, block5);
            }
            iM11230a = i10 + 1;
            startingIndex++;
            position2 = position;
            fillBlock2 = fillBlock3;
            zIsDataIndependentAddressing = z6;
            prevOffset = i10;
            blockClear = block;
            blockClear2 = block2;
        }
    }

    private int getPrevOffset(int i10) {
        return i10 % this.laneLength == 0 ? (i10 + r0) - 1 : i10 - 1;
    }

    private long getPseudoRandom(FillBlock fillBlock, int i10, Block block, Block block2, int i11, boolean z6) {
        if (!z6) {
            return this.memory[i11].f27681v[0];
        }
        int i12 = i10 % 128;
        if (i12 == 0) {
            nextAddresses(fillBlock, block2, block);
        }
        return block.f27681v[i12];
    }

    private int getRefColumn(Position position, int i10, long j6, boolean z6) {
        int i11;
        int i12;
        int i13 = position.pass;
        int i14 = 0;
        int i15 = position.slice;
        if (i13 != 0) {
            int i16 = this.segmentLength;
            int i17 = this.laneLength;
            int i18 = ((i15 + 1) * i16) % i17;
            int i19 = i17 - i16;
            if (z6) {
                i11 = (i19 + i10) - 1;
            } else {
                i11 = i19 + (i10 != 0 ? 0 : -1);
            }
            i14 = i18;
            i12 = i11;
        } else if (z6) {
            i12 = ((i15 * this.segmentLength) + i10) - 1;
        } else {
            i12 = (i15 * this.segmentLength) + (i10 != 0 ? 0 : -1);
        }
        long j10 = j6 & M32L;
        return ((int) (i14 + ((i12 - 1) - ((i12 * ((j10 * j10) >>> 32)) >>> 32)))) % this.laneLength;
    }

    private int getRefLane(Position position, long j6) {
        return (position.pass == 0 && position.slice == 0) ? position.lane : (int) ((j6 >>> 32) % this.parameters.getLanes());
    }

    private static int getStartingIndex(Position position) {
        return (position.pass == 0 && position.slice == 0) ? 2 : 0;
    }

    private void hash(byte[] bArr, byte[] bArr2, int i10, int i11) {
        byte[] bArr3 = new byte[4];
        Pack.intToLittleEndian(i11, bArr3, 0);
        if (i11 <= 64) {
            Blake2bDigest blake2bDigest = new Blake2bDigest(i11 * 8);
            blake2bDigest.update(bArr3, 0, 4);
            blake2bDigest.update(bArr, 0, bArr.length);
            blake2bDigest.doFinal(bArr2, i10);
            return;
        }
        Blake2bDigest blake2bDigest2 = new Blake2bDigest(512);
        byte[] bArr4 = new byte[64];
        blake2bDigest2.update(bArr3, 0, 4);
        blake2bDigest2.update(bArr, 0, bArr.length);
        blake2bDigest2.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, i10, 32);
        int i12 = i10 + 32;
        int i13 = 2;
        int i14 = ((i11 + 31) / 32) - 2;
        while (i13 <= i14) {
            blake2bDigest2.update(bArr4, 0, 64);
            blake2bDigest2.doFinal(bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i12, 32);
            i13++;
            i12 += 32;
        }
        Blake2bDigest blake2bDigest3 = new Blake2bDigest((i11 - (i14 * 32)) * 8);
        blake2bDigest3.update(bArr4, 0, 64);
        blake2bDigest3.doFinal(bArr2, i12);
    }

    private void initAddressBlocks(FillBlock fillBlock, Position position, Block block, Block block2) {
        block.f27681v[0] = intToLong(position.pass);
        block.f27681v[1] = intToLong(position.lane);
        block.f27681v[2] = intToLong(position.slice);
        block.f27681v[3] = intToLong(this.memory.length);
        block.f27681v[4] = intToLong(this.parameters.getIterations());
        block.f27681v[5] = intToLong(this.parameters.getType());
        if (position.pass == 0 && position.slice == 0) {
            nextAddresses(fillBlock, block, block2);
        }
    }

    private void initMemory(int i10) {
        this.memory = new Block[i10];
        int i11 = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i11 >= blockArr.length) {
                return;
            }
            blockArr[i11] = new Block();
            i11++;
        }
    }

    private void initialize(byte[] bArr, byte[] bArr2, int i10) {
        Blake2bDigest blake2bDigest = new Blake2bDigest(512);
        Pack.intToLittleEndian(new int[]{this.parameters.getLanes(), i10, this.parameters.getMemory(), this.parameters.getIterations(), this.parameters.getVersion(), this.parameters.getType()}, bArr, 0);
        blake2bDigest.update(bArr, 0, 24);
        addByteString(bArr, blake2bDigest, bArr2);
        addByteString(bArr, blake2bDigest, this.parameters.getSalt());
        addByteString(bArr, blake2bDigest, this.parameters.getSecret());
        addByteString(bArr, blake2bDigest, this.parameters.getAdditional());
        byte[] bArr3 = new byte[ARGON2_PREHASH_SEED_LENGTH];
        blake2bDigest.doFinal(bArr3, 0);
        fillFirstBlocks(bArr, bArr3);
    }

    private long intToLong(int i10) {
        return i10 & M32L;
    }

    private boolean isDataIndependentAddressing(Position position) {
        return this.parameters.getType() == 1 || (this.parameters.getType() == 2 && position.pass == 0 && position.slice < 2);
    }

    private boolean isWithXor(Position position) {
        return (position.pass == 0 || this.parameters.getVersion() == 16) ? false : true;
    }

    private void nextAddresses(FillBlock fillBlock, Block block, Block block2) {
        long[] jArr = block.f27681v;
        jArr[6] = jArr[6] + 1;
        fillBlock.fillBlock(block, block2);
        fillBlock.fillBlock(block2, block2);
    }

    private static void quarterRound(long[] jArr, int i10, int i11, int i12, int i13) {
        long j6 = jArr[i10];
        long j10 = jArr[i11];
        long j11 = jArr[i12];
        long jM9729c = AbstractC4801l.m9729c((j6 & M32L) * 2, M32L & j10, j10, j6);
        long jRotateRight = Longs.rotateRight(j11 ^ jM9729c, i13);
        jArr[i10] = jM9729c;
        jArr[i12] = jRotateRight;
    }

    private void reset() {
        if (this.memory == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            Block[] blockArr = this.memory;
            if (i10 >= blockArr.length) {
                return;
            }
            Block block = blockArr[i10];
            if (block != null) {
                block.clear();
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void roundFunction(Block block, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        long[] jArr = block.f27681v;
        m11220F(jArr, i10, i14, i18, i22);
        m11220F(jArr, i11, i15, i19, i23);
        m11220F(jArr, i12, i16, i20, i24);
        m11220F(jArr, i13, i17, i21, i25);
        m11220F(jArr, i10, i15, i20, i25);
        m11220F(jArr, i11, i16, i21, i22);
        m11220F(jArr, i12, i17, i18, i23);
        m11220F(jArr, i13, i14, i19, i24);
    }

    public int generateBytes(byte[] bArr, byte[] bArr2) {
        return generateBytes(bArr, bArr2, 0, bArr2.length);
    }

    public void init(Argon2Parameters argon2Parameters) {
        this.parameters = argon2Parameters;
        if (argon2Parameters.getLanes() < 1) {
            throw new IllegalStateException("lanes must be greater than 1");
        }
        if (argon2Parameters.getLanes() > MAX_PARALLELISM) {
            throw new IllegalStateException("lanes must be less than 16777216");
        }
        if (argon2Parameters.getMemory() >= argon2Parameters.getLanes() * 2) {
            if (argon2Parameters.getIterations() < 1) {
                throw new IllegalStateException("iterations is less than: 1");
            }
            doInit(argon2Parameters);
        } else {
            throw new IllegalStateException("memory is less than: " + (argon2Parameters.getLanes() * 2) + " expected " + (argon2Parameters.getLanes() * 2));
        }
    }

    public int generateBytes(byte[] bArr, byte[] bArr2, int i10, int i11) {
        if (i11 < 4) {
            throw new IllegalStateException("output length less than 4");
        }
        byte[] bArr3 = new byte[1024];
        initialize(bArr3, bArr, i11);
        fillMemoryBlocks();
        digest(bArr3, bArr2, i10, i11);
        reset();
        return i11;
    }

    public int generateBytes(char[] cArr, byte[] bArr) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr);
    }

    public int generateBytes(char[] cArr, byte[] bArr, int i10, int i11) {
        return generateBytes(this.parameters.getCharToByteConverter().convert(cArr), bArr, i10, i11);
    }
}
