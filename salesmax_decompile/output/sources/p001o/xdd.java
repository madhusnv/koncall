package p001o;

/* loaded from: classes6.dex */
public abstract class xdd {
    /* renamed from: a */
    public static final bn5 m56096a(e9 e9Var, jo3 jo3Var, String str) {
        sq8.m48649h(e9Var, "<this>");
        sq8.m48649h(jo3Var, "decoder");
        bn5 bn5VarMo24527c = e9Var.mo24527c(jo3Var, str);
        if (bn5VarMo24527c != null) {
            return bn5VarMo24527c;
        }
        f9.m26289a(str, e9Var.mo24529e());
        throw new qe9();
    }

    /* renamed from: b */
    public static final iff m56097b(e9 e9Var, h76 h76Var, Object obj) {
        sq8.m48649h(e9Var, "<this>");
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(obj, "value");
        iff iffVarMo24528d = e9Var.mo24528d(h76Var, obj);
        if (iffVarMo24528d != null) {
            return iffVarMo24528d;
        }
        f9.m26290b(kge.m35689b(obj.getClass()), e9Var.mo24529e());
        throw new qe9();
    }
}
