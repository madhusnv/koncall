package p001o;

/* loaded from: classes.dex */
public final class mi8 {

    /* renamed from: a */
    public volatile Boolean f35507a;

    /* renamed from: b */
    public volatile Boolean f35508b;

    /* renamed from: c */
    public volatile Boolean f35509c;

    public mi8() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public final boolean m39112a() {
        Boolean bool = this.f35507a;
        Boolean bool2 = Boolean.TRUE;
        return sq8.m48644c(bool, bool2) && sq8.m48644c(this.f35508b, bool2) && sq8.m48644c(this.f35509c, bool2);
    }

    /* renamed from: b */
    public final void m39113b(Boolean bool) {
        this.f35508b = bool;
    }

    /* renamed from: c */
    public final void m39114c(Boolean bool) {
        this.f35507a = bool;
    }

    /* renamed from: d */
    public final void m39115d(Boolean bool) {
        this.f35509c = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi8)) {
            return false;
        }
        mi8 mi8Var = (mi8) obj;
        return sq8.m48644c(this.f35507a, mi8Var.f35507a) && sq8.m48644c(this.f35508b, mi8Var.f35508b) && sq8.m48644c(this.f35509c, mi8Var.f35509c);
    }

    public int hashCode() {
        return ((((this.f35507a == null ? 0 : this.f35507a.hashCode()) * 31) + (this.f35508b == null ? 0 : this.f35508b.hashCode())) * 31) + (this.f35509c != null ? this.f35509c.hashCode() : 0);
    }

    public String toString() {
        return "InitializationStatus(isSignedIn=" + this.f35507a + ", isInstanceReady=" + this.f35508b + ", isTeamReady=" + this.f35509c + ")";
    }

    public mi8(Boolean bool, Boolean bool2, Boolean bool3) {
        this.f35507a = bool;
        this.f35508b = bool2;
        this.f35509c = bool3;
    }

    public /* synthetic */ mi8(Boolean bool, Boolean bool2, Boolean bool3, int i, id5 id5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
