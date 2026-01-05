package sq;

import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n3 {

    /* renamed from: a */
    public final int f33088a;

    /* renamed from: b */
    public final f3 f33089b;

    /* renamed from: c */
    public final C6734c f33090c;

    public n3(int i10, f3 f3Var, C6734c c6734c) {
        this.f33088a = i10;
        this.f33089b = f3Var;
        this.f33090c = c6734c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.f33088a == n3Var.f33088a && this.f33089b.equals(n3Var.f33089b) && this.f33090c.equals(n3Var.f33090c);
    }

    public final int hashCode() {
        return this.f33090c.hashCode() + ((this.f33089b.hashCode() + (Integer.hashCode(this.f33088a) * 31)) * 31);
    }

    public final String toString() {
        return "TabWithIconItem(name=" + this.f33088a + ", icon=" + this.f33089b + ", screenCompose=" + this.f33090c + ")";
    }
}
