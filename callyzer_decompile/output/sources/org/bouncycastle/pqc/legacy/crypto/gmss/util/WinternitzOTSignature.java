package org.bouncycastle.pqc.legacy.crypto.gmss.util;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes3.dex */
public class WinternitzOTSignature {
    private int checksumsize;
    private GMSSRandom gmssRandom;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[][] privateKeyOTS;

    /* renamed from: w */
    private int f28142w;

    public WinternitzOTSignature(byte[] bArr, Digest digest, int i10) {
        this.f28142w = i10;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        int i11 = (((r3 << 3) + i10) - 1) / i10;
        this.messagesize = i11;
        this.checksumsize = getLog((i11 << i10) + 1);
        int i12 = (((r3 + i10) - 1) / i10) + this.messagesize;
        this.keysize = i12;
        this.privateKeyOTS = new byte[i12][];
        int i13 = this.mdsize;
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        for (int i14 = 0; i14 < this.keysize; i14++) {
            this.privateKeyOTS[i14] = this.gmssRandom.nextSeed(bArr2);
        }
    }

    private void hashPrivateKeyBlock(int i10, int i11, byte[] bArr, int i12) {
        if (i11 < 1) {
            System.arraycopy(this.privateKeyOTS[i10], 0, bArr, i12, this.mdsize);
            return;
        }
        this.messDigestOTS.update(this.privateKeyOTS[i10], 0, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr, i12);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr, i12, this.mdsize);
            }
        }
    }

    public int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    public byte[][] getPrivateKey() {
        return this.privateKeyOTS;
    }

    public byte[] getPublicKey() {
        int i10 = this.keysize * this.mdsize;
        byte[] bArr = new byte[i10];
        int i11 = (1 << this.f28142w) - 1;
        int i12 = 0;
        for (int i13 = 0; i13 < this.keysize; i13++) {
            hashPrivateKeyBlock(i13, i11, bArr, i12);
            i12 += this.mdsize;
        }
        this.messDigestOTS.update(bArr, 0, i10);
        byte[] bArr2 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr2, 0);
        return bArr2;
    }

    public byte[] getSignature(byte[] bArr) {
        int i10;
        int i11 = this.keysize;
        int i12 = this.mdsize;
        byte[] bArr2 = new byte[i11 * i12];
        byte[] bArr3 = new byte[i12];
        int i13 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i14 = this.f28142w;
        char c2 = '\b';
        boolean z6 = true;
        if (8 % i14 == 0) {
            int i15 = 8 / i14;
            int i16 = (1 << i14) - 1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i12; i19++) {
                for (int i20 = 0; i20 < i15; i20++) {
                    int i21 = bArr3[i19] & i16;
                    i17 += i21;
                    hashPrivateKeyBlock(i18, i21, bArr2, this.mdsize * i18);
                    bArr3[i19] = (byte) (bArr3[i19] >>> this.f28142w);
                    i18++;
                }
            }
            int i22 = (this.messagesize << this.f28142w) - i17;
            while (i13 < this.checksumsize) {
                hashPrivateKeyBlock(i18, i22 & i16, bArr2, this.mdsize * i18);
                int i23 = this.f28142w;
                i22 >>>= i23;
                i18++;
                i13 += i23;
            }
        } else if (i14 < 8) {
            int i24 = this.mdsize / i14;
            int i25 = (1 << i14) - 1;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i26 < i24) {
                boolean z10 = z6;
                long j6 = 0;
                for (int i30 = 0; i30 < this.f28142w; i30++) {
                    j6 ^= (bArr3[i27] & 255) << (i30 << 3);
                    i27++;
                }
                long j10 = j6;
                for (int i31 = 0; i31 < 8; i31++) {
                    int i32 = ((int) j10) & i25;
                    i29 += i32;
                    hashPrivateKeyBlock(i28, i32, bArr2, this.mdsize * i28);
                    j10 >>>= this.f28142w;
                    i28++;
                }
                i26++;
                z6 = z10;
            }
            int i33 = this.mdsize % this.f28142w;
            long j11 = 0;
            for (int i34 = 0; i34 < i33; i34++) {
                j11 ^= (bArr3[i27] & 255) << (i34 << 3);
                i27++;
            }
            int i35 = i33 << 3;
            int i36 = 0;
            while (i36 < i35) {
                int i37 = ((int) j11) & i25;
                i29 += i37;
                hashPrivateKeyBlock(i28, i37, bArr2, this.mdsize * i28);
                int i38 = this.f28142w;
                j11 >>>= i38;
                i28++;
                i36 += i38;
            }
            int i39 = (this.messagesize << this.f28142w) - i29;
            while (i13 < this.checksumsize) {
                hashPrivateKeyBlock(i28, i39 & i25, bArr2, this.mdsize * i28);
                int i40 = this.f28142w;
                i39 >>>= i40;
                i28++;
                i13 += i40;
            }
        } else if (i14 < 57) {
            int i41 = this.mdsize;
            int i42 = (i41 << 3) - i14;
            int i43 = (1 << i14) - 1;
            byte[] bArr4 = new byte[i41];
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            while (i44 <= i42) {
                int i47 = i44 % 8;
                char c10 = c2;
                i44 += this.f28142w;
                int i48 = 0;
                long j12 = 0;
                for (int i49 = i44 >>> 3; i49 < ((i44 + 7) >>> 3); i49++) {
                    j12 ^= (bArr3[i49] & 255) << (i48 << 3);
                    i48++;
                }
                long j13 = (j12 >>> i47) & i43;
                i46 = (int) (i46 + j13);
                System.arraycopy(this.privateKeyOTS[i45], 0, bArr4, 0, this.mdsize);
                while (j13 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i41);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j13--;
                }
                int i50 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i45 * i50, i50);
                i45++;
                c2 = c10;
            }
            int i51 = i44 >>> 3;
            if (i51 < this.mdsize) {
                int i52 = i44 % 8;
                int i53 = 0;
                long j14 = 0;
                while (true) {
                    i10 = this.mdsize;
                    if (i51 >= i10) {
                        break;
                    }
                    j14 ^= (bArr3[i51] & 255) << (i53 << 3);
                    i53++;
                    i51++;
                }
                long j15 = (j14 >>> i52) & i43;
                i46 = (int) (i46 + j15);
                System.arraycopy(this.privateKeyOTS[i45], 0, bArr4, 0, i10);
                while (j15 > 0) {
                    this.messDigestOTS.update(bArr4, 0, i41);
                    this.messDigestOTS.doFinal(bArr4, 0);
                    j15--;
                }
                int i54 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i45 * i54, i54);
                i45++;
            }
            int i55 = (this.messagesize << this.f28142w) - i46;
            int i56 = 0;
            while (i56 < this.checksumsize) {
                System.arraycopy(this.privateKeyOTS[i45], 0, bArr4, 0, this.mdsize);
                for (long j16 = i55 & i43; j16 > 0; j16--) {
                    this.messDigestOTS.update(bArr4, 0, i41);
                    this.messDigestOTS.doFinal(bArr4, 0);
                }
                int i57 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr2, i45 * i57, i57);
                int i58 = this.f28142w;
                i55 >>>= i58;
                i45++;
                i56 += i58;
            }
        }
        return bArr2;
    }
}
