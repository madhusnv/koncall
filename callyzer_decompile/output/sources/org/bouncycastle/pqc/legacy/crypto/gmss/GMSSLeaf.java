package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* renamed from: i */
    private int f28132i;

    /* renamed from: j */
    private int f28133j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* renamed from: w */
    private int f28134w;

    public GMSSLeaf(Digest digest, int i10, int i11) {
        this.f28134w = i10;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d2 = i10;
        this.keysize = ((int) Math.ceil((r7 << 3) / d2)) + ((int) Math.ceil(getLog((r7 << i10) + 1) / d2));
        this.two_power_w = 1 << i10;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i11);
        int i12 = this.mdsize;
        this.seed = new byte[i12];
        this.leaf = new byte[i12];
        this.privateKeyOTS = new byte[i12];
        this.concHashs = new byte[i12 * this.keysize];
    }

    private int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i10 = 0; i10 < this.steps + 10000; i10++) {
            int i11 = this.f28132i;
            if (i11 == this.keysize && this.f28133j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i11 == 0 || this.f28133j == this.two_power_w - 1) {
                this.f28132i = i11 + 1;
                this.f28133j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i12 = this.f28133j + 1;
                this.f28133j = i12;
                if (i12 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i13 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f28132i - 1) * i13, i13);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + " " + this.f28132i + " " + this.f28133j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.privateKeyOTS, this.seed, this.concHashs, this.leaf};
    }

    public int[] getStatInt() {
        return new int[]{this.f28132i, this.f28133j, this.steps, this.f28134w};
    }

    public void initLeafCalc(byte[] bArr) {
        this.f28132i = 0;
        this.f28133j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String strM11233d = "";
        for (int i10 = 0; i10 < 4; i10++) {
            strM11233d = AbstractC5601a.m11233d(getStatInt()[i10], " ", AbstractC1452a.m4568o(strM11233d));
        }
        StringBuilder sbM11245p = AbstractC5601a.m11245p(strM11233d, " ");
        sbM11245p.append(this.mdsize);
        sbM11245p.append(" ");
        sbM11245p.append(this.keysize);
        sbM11245p.append(" ");
        String strM11233d2 = AbstractC5601a.m11233d(this.two_power_w, " ", sbM11245p);
        byte[][] statByte = getStatByte();
        for (int i11 = 0; i11 < 4; i11++) {
            strM11233d2 = statByte[i11] != null ? AbstractC1452a.m4564k(AbstractC1452a.m4568o(strM11233d2), new String(Hex.encode(statByte[i11])), " ") : AbstractC1452a.m4561h(strM11233d2, "null ");
        }
        return strM11233d2;
    }

    public GMSSLeaf(Digest digest, int i10, int i11, byte[] bArr) {
        this.f28134w = i10;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d2 = i10;
        this.keysize = ((int) Math.ceil((r7 << 3) / d2)) + ((int) Math.ceil(getLog((r7 << i10) + 1) / d2));
        this.two_power_w = 1 << i10;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i11);
        int i12 = this.mdsize;
        this.seed = new byte[i12];
        this.leaf = new byte[i12];
        this.privateKeyOTS = new byte[i12];
        this.concHashs = new byte[i12 * this.keysize];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f28132i = iArr[0];
        this.f28133j = iArr[1];
        this.steps = iArr[2];
        this.f28134w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.keysize = ((int) Math.ceil((r9 << 3) / this.f28134w)) + ((int) Math.ceil(getLog((r9 << this.f28134w) + 1) / this.f28134w));
        this.two_power_w = 1 << this.f28134w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f28132i = gMSSLeaf.f28132i;
        this.f28133j = gMSSLeaf.f28133j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f28134w = gMSSLeaf.f28134w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
