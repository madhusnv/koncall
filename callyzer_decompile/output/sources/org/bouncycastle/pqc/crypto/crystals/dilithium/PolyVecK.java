package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* loaded from: classes3.dex */
class PolyVecK {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecK() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).addPoly(polyVecK.getVectorIndex(i10));
        }
    }

    public boolean checkNorm(int i10) {
        for (int i11 = 0; i11 < this.dilithiumK; i11++) {
            if (getVectorIndex(i11).checkNorm(i10)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).decompose(polyVecK.getVectorIndex(i10));
        }
    }

    public Poly getVectorIndex(int i10) {
        return this.vec[i10];
    }

    public void invNttToMont() {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            iPolyMakeHint += getVectorIndex(i10).polyMakeHint(polyVecK.getVectorIndex(i10), polyVecK2.getVectorIndex(i10));
        }
        return iPolyMakeHint;
    }

    public byte[] packW1() {
        byte[] bArr = new byte[this.dilithiumK * this.engine.getDilithiumPolyW1PackedBytes()];
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            System.arraycopy(getVectorIndex(i10).w1Pack(), 0, bArr, this.engine.getDilithiumPolyW1PackedBytes() * i10, this.engine.getDilithiumPolyW1PackedBytes());
        }
        return bArr;
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i10));
        }
    }

    public void polyVecNtt() {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            this.vec[i10].polyNtt();
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).power2Round(polyVecK.getVectorIndex(i10));
        }
    }

    public void reduce() {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).reduce();
        }
    }

    public void setVectorIndex(int i10, Poly poly) {
        this.vec[i10] = poly;
    }

    public void shiftLeft() {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).subtract(polyVecK.getVectorIndex(i10));
        }
    }

    public String toString() {
        String strM4561h = "[";
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            strM4561h = strM4561h + i10 + " " + getVectorIndex(i10).toString();
            if (i10 != this.dilithiumK - 1) {
                strM4561h = AbstractC1452a.m4561h(strM4561h, ",\n");
            }
        }
        return AbstractC1452a.m4561h(strM4561h, "]");
    }

    public void uniformEta(byte[] bArr, short s5) {
        int i10 = 0;
        while (i10 < this.dilithiumK) {
            getVectorIndex(i10).uniformEta(bArr, s5);
            i10++;
            s5 = (short) (s5 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            getVectorIndex(i10).polyUseHint(polyVecK.getVectorIndex(i10), polyVecK2.getVectorIndex(i10));
        }
    }

    public PolyVecK(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.vec = new Poly[this.dilithiumK];
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            this.vec[i10] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder sbM11245p = AbstractC5601a.m11245p(str, ": ");
        sbM11245p.append(toString());
        return sbM11245p.toString();
    }
}
