package p001o;

/* loaded from: classes6.dex */
public final class msa {

    /* renamed from: a */
    public final int f35913a;

    /* renamed from: b */
    public final int f35914b;

    /* renamed from: c */
    public final int f35915c;

    /* renamed from: d */
    public final int f35916d;

    public msa(int i, int i2, int i3, int i4) {
        this.f35913a = i;
        this.f35914b = i2;
        this.f35915c = i3;
        this.f35916d = i4;
    }

    /* renamed from: a */
    public final int m39613a() {
        return this.f35916d;
    }

    /* renamed from: b */
    public final int m39614b() {
        return this.f35915c;
    }

    /* renamed from: c */
    public final int m39615c() {
        return this.f35913a;
    }

    /* renamed from: d */
    public final int m39616d() {
        return this.f35914b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msa)) {
            return false;
        }
        msa msaVar = (msa) obj;
        return this.f35913a == msaVar.f35913a && this.f35914b == msaVar.f35914b && this.f35915c == msaVar.f35915c && this.f35916d == msaVar.f35916d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f35913a) * 31) + Integer.hashCode(this.f35914b)) * 31) + Integer.hashCode(this.f35915c)) * 31) + Integer.hashCode(this.f35916d);
    }

    public String toString() {
        return "MarginValues(start=" + this.f35913a + ", top=" + this.f35914b + ", end=" + this.f35915c + ", bottom=" + this.f35916d + ")";
    }

    public /* synthetic */ msa(int i, int i2, int i3, int i4, int i5, id5 id5Var) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
