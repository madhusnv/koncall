package p001o;

import android.graphics.Matrix;

/* loaded from: classes2.dex */
public final class s41 extends lf8 {

    /* renamed from: a */
    public final wig f44740a;

    /* renamed from: b */
    public final long f44741b;

    /* renamed from: c */
    public final int f44742c;

    /* renamed from: d */
    public final Matrix f44743d;

    public s41(wig wigVar, long j, int i, Matrix matrix) {
        if (wigVar == null) {
            throw new NullPointerException("Null tagBundle");
        }
        this.f44740a = wigVar;
        this.f44741b = j;
        this.f44742c = i;
        if (matrix == null) {
            throw new NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.f44743d = matrix;
    }

    @Override // p001o.lf8, p001o.jd8
    /* renamed from: a */
    public wig mo17845a() {
        return this.f44740a;
    }

    @Override // p001o.lf8
    /* renamed from: d */
    public int mo37119d() {
        return this.f44742c;
    }

    @Override // p001o.lf8
    /* renamed from: e */
    public Matrix mo37120e() {
        return this.f44743d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lf8)) {
            return false;
        }
        lf8 lf8Var = (lf8) obj;
        return this.f44740a.equals(lf8Var.mo17845a()) && this.f44741b == lf8Var.getTimestamp() && this.f44742c == lf8Var.mo37119d() && this.f44743d.equals(lf8Var.mo37120e());
    }

    @Override // p001o.lf8, p001o.jd8
    public long getTimestamp() {
        return this.f44741b;
    }

    public int hashCode() {
        int iHashCode = (this.f44740a.hashCode() ^ 1000003) * 1000003;
        long j = this.f44741b;
        return ((((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f44742c) * 1000003) ^ this.f44743d.hashCode();
    }

    public String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.f44740a + ", timestamp=" + this.f44741b + ", rotationDegrees=" + this.f44742c + ", sensorToBufferTransformMatrix=" + this.f44743d + "}";
    }
}
