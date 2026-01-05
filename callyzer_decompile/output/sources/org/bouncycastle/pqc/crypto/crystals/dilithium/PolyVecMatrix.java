package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.sun.mail.util.AbstractC1452a;

/* loaded from: classes3.dex */
class PolyVecMatrix {
    private final int dilithiumK;
    private final int dilithiumL;
    private final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            this.mat[i10] = new PolyVecL(dilithiumEngine);
        }
    }

    private String addString() {
        String strM4561h = "[";
        int i10 = 0;
        while (i10 < this.dilithiumK) {
            StringBuilder sbM4568o = AbstractC1452a.m4568o(strM4561h + "Outer Matrix " + i10 + " [");
            sbM4568o.append(this.mat[i10].toString());
            String string = sbM4568o.toString();
            strM4561h = i10 == this.dilithiumK + (-1) ? AbstractC1452a.m4561h(string, "]\n") : AbstractC1452a.m4561h(string, "],\n");
            i10++;
        }
        return AbstractC1452a.m4561h(strM4561h, "]\n");
    }

    public void expandMatrix(byte[] bArr) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            for (int i11 = 0; i11 < this.dilithiumL; i11++) {
                this.mat[i10].getVectorIndex(i11).uniformBlocks(bArr, (short) ((i10 << 8) + i11));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            polyVecK.getVectorIndex(i10).pointwiseAccountMontgomery(this.mat[i10], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
