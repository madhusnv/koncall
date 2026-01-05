package p001o;

import java.util.Map;
import p001o.cg3;
import p001o.dg3;

/* loaded from: classes3.dex */
public abstract class w86 {

    /* renamed from: a */
    public static final Map f51607a = isa.m32681h();

    /* renamed from: a */
    public static final void m54051a(dg3.C12899a c12899a, cg3.C12676c c12676c, rne rneVar) {
        c12899a.m23010h(Boolean.valueOf(c12676c.m21157o()));
        c12899a.m23011i(Boolean.valueOf(c12676c.m21158p()));
    }

    /* renamed from: b */
    public static final dg3 m54052b(cg3.C12676c c12676c, rne rneVar) {
        sq8.m48649h(c12676c, "config");
        sq8.m48649h(rneVar, "request");
        dg3.C12900b c12900b = dg3.f19767e;
        dg3.C12899a c12899a = new dg3.C12899a();
        c12899a.m23009g(c12676c.m21154l());
        m54051a(c12899a, c12676c, rneVar);
        l8i l8iVarM21151i = c12676c.m21151i();
        c12899a.m23008f(l8iVarM21151i != null ? l8iVarM21151i.toString() : null);
        nl7 nl7Var = (nl7) f51607a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c12899a, rneVar);
        }
        return c12899a.m23003a();
    }
}
