package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* loaded from: classes3.dex */
public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H */
    private Digest f27736H;

    /* renamed from: g1, reason: collision with root package name */
    private BigInteger f44609g1;

    /* renamed from: g2, reason: collision with root package name */
    private BigInteger f44610g2;

    /* renamed from: p */
    private BigInteger f27737p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f27737p = bigInteger;
        this.f44609g1 = bigInteger2;
        this.f44610g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f27736H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
        return cramerShoupParameters.getP().equals(this.f27737p) && cramerShoupParameters.getG1().equals(this.f44609g1) && cramerShoupParameters.getG2().equals(this.f44610g2);
    }

    public BigInteger getG1() {
        return this.f44609g1;
    }

    public BigInteger getG2() {
        return this.f44610g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f27736H).copy();
    }

    public BigInteger getP() {
        return this.f27737p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
