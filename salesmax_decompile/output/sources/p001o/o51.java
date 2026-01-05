package p001o;

import p001o.ueg;

/* loaded from: classes2.dex */
public final class o51 extends ueg.AbstractC17371b {

    /* renamed from: a */
    public final int f37777a;

    /* renamed from: b */
    public final int f37778b;

    /* renamed from: c */
    public final boolean f37779c;

    /* renamed from: d */
    public final boolean f37780d;

    public o51(int i, int i2, boolean z, boolean z2) {
        this.f37777a = i;
        this.f37778b = i2;
        this.f37779c = z;
        this.f37780d = z2;
    }

    @Override // p001o.ueg.AbstractC17371b
    /* renamed from: a */
    public int mo41606a() {
        return this.f37777a;
    }

    @Override // p001o.ueg.AbstractC17371b
    /* renamed from: b */
    public int mo41607b() {
        return this.f37778b;
    }

    @Override // p001o.ueg.AbstractC17371b
    /* renamed from: c */
    public boolean mo41608c() {
        return this.f37779c;
    }

    @Override // p001o.ueg.AbstractC17371b
    /* renamed from: d */
    public boolean mo41609d() {
        return this.f37780d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ueg.AbstractC17371b)) {
            return false;
        }
        ueg.AbstractC17371b abstractC17371b = (ueg.AbstractC17371b) obj;
        return this.f37777a == abstractC17371b.mo41606a() && this.f37778b == abstractC17371b.mo41607b() && this.f37779c == abstractC17371b.mo41608c() && this.f37780d == abstractC17371b.mo41609d();
    }

    public int hashCode() {
        return ((((((this.f37777a ^ 1000003) * 1000003) ^ this.f37778b) * 1000003) ^ (this.f37779c ? 1231 : 1237)) * 1000003) ^ (this.f37780d ? 1231 : 1237);
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f37777a + ", requiredMaxBitDepth=" + this.f37778b + ", previewStabilizationOn=" + this.f37779c + ", ultraHdrOn=" + this.f37780d + "}";
    }
}
