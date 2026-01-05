package p001o;

/* loaded from: classes2.dex */
public final class bb {

    /* renamed from: a */
    public final String f15832a;

    /* renamed from: b */
    public final tl7 f15833b;

    public bb(String str, tl7 tl7Var) {
        this.f15832a = str;
        this.f15833b = tl7Var;
    }

    /* renamed from: a */
    public final tl7 m18511a() {
        return this.f15833b;
    }

    /* renamed from: b */
    public final String m18512b() {
        return this.f15832a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return sq8.m48644c(this.f15832a, bbVar.f15832a) && sq8.m48644c(this.f15833b, bbVar.f15833b);
    }

    public int hashCode() {
        String str = this.f15832a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        tl7 tl7Var = this.f15833b;
        return iHashCode + (tl7Var != null ? tl7Var.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f15832a + ", action=" + this.f15833b + ')';
    }
}
