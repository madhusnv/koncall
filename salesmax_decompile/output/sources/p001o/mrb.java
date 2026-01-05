package p001o;

/* loaded from: classes6.dex */
public abstract class mrb extends ajg {
    /* renamed from: Z */
    public abstract String mo20418Z(String str, String str2);

    public String a0(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return uefVar.mo16763e(i);
    }

    @Override // p001o.ajg
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String mo17234V(uef uefVar, int i) {
        sq8.m48649h(uefVar, "<this>");
        return c0(a0(uefVar, i));
    }

    public final String c0(String str) {
        sq8.m48649h(str, "nestedName");
        String str2 = (String) m17233U();
        if (str2 == null) {
            str2 = "";
        }
        return mo20418Z(str2, str);
    }
}
