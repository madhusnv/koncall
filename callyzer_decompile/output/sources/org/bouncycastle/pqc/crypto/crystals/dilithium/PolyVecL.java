package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
class PolyVecL {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).addPoly(polyVecL.getVectorIndex(i10));
        }
    }

    public boolean checkNorm(int i10) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            if (getVectorIndex(i11).checkNorm(i10)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            for (int i11 = 0; i11 < 256; i11++) {
                polyVecL.getVectorIndex(i10).setCoeffIndex(i11, getVectorIndex(i10).getCoeffIndex(i11));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            this.vec[i11].uniformBlocks(bArr, (short) ((i10 << 8) + i11));
        }
    }

    public Poly getVectorIndex(int i10) {
        return this.vec[i10];
    }

    public void invNttToMont() {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i10));
        }
    }

    public void polyVecNtt() {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            this.vec[i10].polyNtt();
        }
    }

    public void reduce() {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).reduce();
        }
    }

    public String toString() {
        String strM4561h = "\n[";
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            strM4561h = strM4561h + "Inner Matrix " + i10 + " " + getVectorIndex(i10).toString();
            if (i10 != this.dilithiumL - 1) {
                strM4561h = AbstractC1452a.m4561h(strM4561h, ",\n");
            }
        }
        return AbstractC1452a.m4561h(strM4561h, "]");
    }

    public void uniformEta(byte[] bArr, short s5) {
        int i10 = 0;
        while (i10 < this.dilithiumL) {
            getVectorIndex(i10).uniformEta(bArr, s5);
            i10++;
            s5 = (short) (s5 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s5) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).uniformGamma1(bArr, (short) ((this.dilithiumL * s5) + i10));
        }
    }

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.vec = new Poly[this.dilithiumL];
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            this.vec[i10] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, ": ");
        sbM11245p.append(toString());
        return sbM11245p.toString();
    }
}
