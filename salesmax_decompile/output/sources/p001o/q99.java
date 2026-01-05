package p001o;

/* loaded from: classes6.dex */
public final class q99 extends ea9 {

    /* renamed from: a */
    public final boolean f41512a;

    /* renamed from: b */
    public final uef f41513b;

    /* renamed from: c */
    public final String f41514c;

    public /* synthetic */ q99(Object obj, boolean z, uef uefVar, int i, id5 id5Var) {
        this(obj, z, (i & 4) != 0 ? null : uefVar);
    }

    @Override // p001o.ea9
    /* renamed from: d */
    public String mo24656d() {
        return this.f41514c;
    }

    /* renamed from: e */
    public final uef m45032e() {
        return this.f41513b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q99.class != obj.getClass()) {
            return false;
        }
        q99 q99Var = (q99) obj;
        return m45033n() == q99Var.m45033n() && sq8.m48644c(mo24656d(), q99Var.mo24656d());
    }

    public int hashCode() {
        return (Boolean.hashCode(m45033n()) * 31) + mo24656d().hashCode();
    }

    /* renamed from: n */
    public boolean m45033n() {
        return this.f41512a;
    }

    @Override // p001o.ea9
    public String toString() {
        if (!m45033n()) {
            return mo24656d();
        }
        StringBuilder sb = new StringBuilder();
        o8g.m41773c(sb, mo24656d());
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q99(Object obj, boolean z, uef uefVar) {
        super(null);
        sq8.m48649h(obj, "body");
        this.f41512a = z;
        this.f41513b = uefVar;
        this.f41514c = obj.toString();
        if (uefVar != null && !uefVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
