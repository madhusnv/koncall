package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* loaded from: classes3.dex */
public class PhotonBeetleDigest implements Digest {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private final int INITIAL_RATE_INBYTES = 16;
    private int RATE_INBYTES = 4;
    private int SQUEEZE_RATE_INBYTES = 16;
    private int STATE_INBYTES = 32;
    private int TAG_INBYTES = 32;
    private int LAST_THREE_BITS_OFFSET = 5;
    private int ROUND = 12;

    /* renamed from: D */
    private int f27609D = 8;
    private int Dq = 3;
    private int Dr = 7;
    private int DSquare = 64;

    /* renamed from: S */
    private int f27610S = 4;
    private int S_1 = 3;
    private byte[][] RC = {new byte[]{1, 3, 7, 14, 13, 11, 6, 12, 9, 2, 5, 10}, new byte[]{0, 2, 6, 15, 12, 10, 7, 13, 8, 3, 4, 11}, new byte[]{2, 0, 4, 13, 14, 8, 5, 15, 10, 1, 6, 9}, new byte[]{6, 4, 0, 9, 10, 12, 1, 11, 14, 5, 2, 13}, new byte[]{14, 12, 8, 1, 2, 4, 9, 3, 6, 13, 10, 5}, new byte[]{15, 13, 9, 0, 3, 5, 8, 2, 7, 12, 11, 4}, new byte[]{13, 15, 11, 2, 1, 7, 10, 0, 5, 14, 9, 6}, new byte[]{9, 11, 15, 6, 5, 3, 14, 4, 1, 10, 13, 2}};
    private byte[][] MixColMatrix = {new byte[]{2, 4, 2, 11, 2, 8, 5, 6}, new byte[]{12, 9, 8, 13, 7, 7, 5, 2}, new byte[]{4, 4, 13, 13, 9, 4, 13, 9}, new byte[]{1, 6, 5, 1, 12, 13, 15, 14}, new byte[]{15, 12, 9, 13, 14, 5, 14, 13}, new byte[]{9, 14, 5, 15, 4, 12, 9, 6}, new byte[]{12, 2, 2, 10, 3, 1, 1, 14}, new byte[]{15, 1, 13, 10, 5, 10, 2, 3}};
    private byte[] sbox = {12, 5, 6, 11, 9, 0, 10, 13, 3, 14, 15, 8, 4, 7, 1, 2};
    private byte[] state = new byte[32];
    private byte[][] state_2d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 8);

    public void PHOTON_Permutation() {
        for (int i10 = 0; i10 < this.DSquare; i10++) {
            this.state_2d[i10 >>> this.Dq][this.Dr & i10] = (byte) (((this.state[i10 >> 1] & 255) >>> ((i10 & 1) * 4)) & 15);
        }
        for (int i11 = 0; i11 < this.ROUND; i11++) {
            for (int i12 = 0; i12 < this.f27609D; i12++) {
                byte[] bArr = this.state_2d[i12];
                bArr[0] = (byte) (bArr[0] ^ this.RC[i12][i11]);
            }
            for (int i13 = 0; i13 < this.f27609D; i13++) {
                for (int i14 = 0; i14 < this.f27609D; i14++) {
                    byte[] bArr2 = this.state_2d[i13];
                    bArr2[i14] = this.sbox[bArr2[i14]];
                }
            }
            int i15 = 1;
            while (true) {
                int i16 = this.f27609D;
                if (i15 >= i16) {
                    break;
                }
                System.arraycopy(this.state_2d[i15], 0, this.state, 0, i16);
                System.arraycopy(this.state, i15, this.state_2d[i15], 0, this.f27609D - i15);
                System.arraycopy(this.state, 0, this.state_2d[i15], this.f27609D - i15, i15);
                i15++;
            }
            for (int i17 = 0; i17 < this.f27609D; i17++) {
                for (int i18 = 0; i18 < this.f27609D; i18++) {
                    byte b10 = 0;
                    for (int i19 = 0; i19 < this.f27609D; i19++) {
                        int i20 = this.MixColMatrix[i18][i19];
                        byte b11 = this.state_2d[i19][i17];
                        int i21 = 0;
                        for (int i22 = 0; i22 < this.f27610S; i22++) {
                            if (((b11 >>> i22) & 1) != 0) {
                                i21 ^= i20;
                            }
                            int i23 = (i20 >>> this.S_1) & 1;
                            i20 <<= 1;
                            if (i23 != 0) {
                                i20 ^= 3;
                            }
                        }
                        b10 = (byte) (b10 ^ (i21 & 15));
                    }
                    this.state[i18] = b10;
                }
                for (int i24 = 0; i24 < this.f27609D; i24++) {
                    this.state_2d[i24][i17] = this.state[i24];
                }
            }
        }
        for (int i25 = 0; i25 < this.DSquare; i25 += 2) {
            byte[][] bArr3 = this.state_2d;
            int i26 = this.Dq;
            byte[] bArr4 = bArr3[i25 >>> i26];
            int i27 = this.Dr;
            this.state[i25 >>> 1] = (byte) (((bArr3[i25 >>> i26][(i25 + 1) & i27] & 15) << 4) | (bArr4[i25 & i27] & 15));
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        if (i10 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int length = byteArray.length;
        if (length == 0) {
            byte[] bArr2 = this.state;
            int i11 = this.STATE_INBYTES - 1;
            bArr2[i11] = (byte) ((1 << this.LAST_THREE_BITS_OFFSET) ^ bArr2[i11]);
        } else {
            byte[] bArr3 = this.state;
            if (length <= 16) {
                System.arraycopy(byteArray, 0, bArr3, 0, length);
                if (length < 16) {
                    byte[] bArr4 = this.state;
                    bArr4[length] = (byte) (bArr4[length] ^ 1);
                }
                byte[] bArr5 = this.state;
                int i12 = this.STATE_INBYTES - 1;
                bArr5[i12] = (byte) (((length >= 16 ? 2 : 1) << this.LAST_THREE_BITS_OFFSET) ^ bArr5[i12]);
            } else {
                System.arraycopy(byteArray, 0, bArr3, 0, 16);
                int i13 = length - 16;
                int i14 = this.RATE_INBYTES;
                int i15 = ((i13 + i14) - 1) / i14;
                int i16 = 0;
                while (true) {
                    int i17 = i15 - 1;
                    PHOTON_Permutation();
                    if (i16 >= i17) {
                        break;
                    }
                    int i18 = this.RATE_INBYTES;
                    Bytes.xorTo(i18, byteArray, (i16 * i18) + 16, this.state, 0);
                    i16++;
                }
                int i19 = this.RATE_INBYTES;
                int i20 = i13 - (i16 * i19);
                Bytes.xorTo(i20, byteArray, (i16 * i19) + 16, this.state, 0);
                int i21 = this.RATE_INBYTES;
                if (i20 < i21) {
                    byte[] bArr6 = this.state;
                    bArr6[i20] = (byte) (bArr6[i20] ^ 1);
                }
                byte[] bArr7 = this.state;
                int i22 = this.STATE_INBYTES - 1;
                bArr7[i22] = (byte) (((i13 % i21 != 0 ? 2 : 1) << this.LAST_THREE_BITS_OFFSET) ^ bArr7[i22]);
            }
        }
        PHOTON_Permutation();
        System.arraycopy(this.state, 0, bArr, i10, this.SQUEEZE_RATE_INBYTES);
        PHOTON_Permutation();
        byte[] bArr8 = this.state;
        int i23 = this.SQUEEZE_RATE_INBYTES;
        System.arraycopy(bArr8, 0, bArr, i10 + i23, this.TAG_INBYTES - i23);
        return this.TAG_INBYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Photon-Beetle Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.TAG_INBYTES;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.buffer.reset();
        Arrays.fill(this.state, (byte) 0);
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
