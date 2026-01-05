package p001o;

/* loaded from: classes6.dex */
public abstract class a64 {
    /* renamed from: a */
    public static final ob9 m16511a(uef uefVar) {
        sq8.m48649h(uefVar, "<this>");
        if (uefVar instanceof d64) {
            return ((d64) uefVar).f19138b;
        }
        if (uefVar instanceof vef) {
            return m16511a(((vef) uefVar).m52676j());
        }
        return null;
    }

    /* renamed from: b */
    public static final uef m16512b(wff wffVar, uef uefVar) {
        dc9 dc9VarM54336c;
        sq8.m48649h(wffVar, "<this>");
        sq8.m48649h(uefVar, "descriptor");
        ob9 ob9VarM16511a = m16511a(uefVar);
        if (ob9VarM16511a == null || (dc9VarM54336c = wff.m54336c(wffVar, ob9VarM16511a, null, 2, null)) == null) {
            return null;
        }
        return dc9VarM54336c.getDescriptor();
    }

    /* renamed from: c */
    public static final uef m16513c(uef uefVar, ob9 ob9Var) {
        sq8.m48649h(uefVar, "<this>");
        sq8.m48649h(ob9Var, "context");
        return new d64(uefVar, ob9Var);
    }
}
