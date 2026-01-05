package p001o;

/* loaded from: classes2.dex */
public final class nke {

    /* renamed from: c */
    public static final nke f36977c = new nke(0, false);

    /* renamed from: a */
    public final int f36978a;

    /* renamed from: b */
    public final boolean f36979b;

    public nke(int i, boolean z) {
        this.f36978a = i;
        this.f36979b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nke.class != obj.getClass()) {
            return false;
        }
        nke nkeVar = (nke) obj;
        return this.f36978a == nkeVar.f36978a && this.f36979b == nkeVar.f36979b;
    }

    public int hashCode() {
        return (this.f36978a << 1) + (this.f36979b ? 1 : 0);
    }
}
