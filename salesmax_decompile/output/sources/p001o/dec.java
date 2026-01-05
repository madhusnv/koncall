package p001o;

/* loaded from: classes3.dex */
public final class dec {

    /* renamed from: a */
    public final ob9 f19669a;

    /* renamed from: b */
    public final ob9 f19670b;

    public dec(ob9 ob9Var, ob9 ob9Var2) {
        sq8.m48649h(ob9Var, "inputType");
        sq8.m48649h(ob9Var2, "outputType");
        this.f19669a = ob9Var;
        this.f19670b = ob9Var2;
    }

    /* renamed from: a */
    public final ob9 m22903a() {
        return this.f19669a;
    }

    /* renamed from: b */
    public final ob9 m22904b() {
        return this.f19670b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dec)) {
            return false;
        }
        dec decVar = (dec) obj;
        return sq8.m48644c(this.f19669a, decVar.f19669a) && sq8.m48644c(this.f19670b, decVar.f19670b);
    }

    public int hashCode() {
        return (this.f19669a.hashCode() * 31) + this.f19670b.hashCode();
    }

    public String toString() {
        return "OperationTypeInfo(inputType=" + this.f19669a + ", outputType=" + this.f19670b + ')';
    }
}
