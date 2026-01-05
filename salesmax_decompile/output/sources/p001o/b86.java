package p001o;

import p001o.l8i;

/* loaded from: classes3.dex */
public final class b86 {

    /* renamed from: a */
    public final l8i f15669a;

    /* renamed from: b */
    public final xri f15670b;

    /* renamed from: c */
    public final qx0 f15671c;

    public b86(l8i l8iVar, xri xriVar, qx0 qx0Var) {
        sq8.m48649h(l8iVar, "uri");
        sq8.m48649h(qx0Var, "attributes");
        this.f15669a = l8iVar;
        this.f15670b = xriVar;
        this.f15671c = qx0Var;
    }

    /* renamed from: a */
    public final qx0 m18275a() {
        return this.f15671c;
    }

    /* renamed from: b */
    public final xri m18276b() {
        return this.f15670b;
    }

    /* renamed from: c */
    public final l8i m18277c() {
        return this.f15669a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b86) {
            b86 b86Var = (b86) obj;
            if (sq8.m48644c(this.f15669a, b86Var.f15669a) && sq8.m48644c(this.f15670b, b86Var.f15670b) && sq8.m48644c(this.f15671c, b86Var.f15671c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f15669a.hashCode() * 31;
        xri xriVar = this.f15670b;
        return ((iHashCode + (xriVar != null ? xriVar.hashCode() : 0)) * 31) + this.f15671c.hashCode();
    }

    public String toString() {
        return "Endpoint(uri=" + this.f15669a + ", headers=" + this.f15670b + ", attributes=" + this.f15671c + ')';
    }

    public /* synthetic */ b86(l8i l8iVar, xri xriVar, qx0 qx0Var, int i, id5 id5Var) {
        this(l8iVar, (i & 2) != 0 ? null : xriVar, (i & 4) != 0 ? tx0.m50736a() : qx0Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b86(String str) {
        this(l8i.C15037b.m36787m(l8i.f33466k, str, null, 2, null), null, 2, 0 == true ? 1 : 0);
        sq8.m48649h(str, "uri");
    }

    public /* synthetic */ b86(l8i l8iVar, xri xriVar, int i, id5 id5Var) {
        this(l8iVar, (i & 2) != 0 ? null : xriVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b86(l8i l8iVar, xri xriVar) {
        this(l8iVar, xriVar, tx0.m50736a());
        sq8.m48649h(l8iVar, "uri");
    }
}
