package org.bouncycastle.crypto.params;

/* loaded from: classes3.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c */
    private int f27772c;
    private long cL;

    /* renamed from: x0, reason: collision with root package name */
    private int f44616x0;
    private long x0L;

    public GOST3410ValidationParameters(int i10, int i11) {
        this.f44616x0 = i10;
        this.f27772c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f27772c == this.f27772c && gOST3410ValidationParameters.f44616x0 == this.f44616x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f27772c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f44616x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i10 = this.f44616x0 ^ this.f27772c;
        long j6 = this.x0L;
        int i11 = (i10 ^ ((int) j6)) ^ ((int) (j6 >> 32));
        long j10 = this.cL;
        return (i11 ^ ((int) j10)) ^ ((int) (j10 >> 32));
    }

    public GOST3410ValidationParameters(long j6, long j10) {
        this.x0L = j6;
        this.cL = j10;
    }
}
