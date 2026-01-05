package p001o;

import java.util.Map;
import p001o.mdd;
import p001o.ndd;

/* loaded from: classes3.dex */
public abstract class z86 {

    /* renamed from: a */
    public static final Map f56694a = isa.m32681h();

    /* renamed from: a */
    public static final void m58936a(ndd.C15547a c15547a, mdd.C15289c c15289c, rne rneVar) {
        c15547a.m40390h(Boolean.valueOf(c15289c.m38780o()));
        c15547a.m40391i(Boolean.valueOf(c15289c.m38781p()));
    }

    /* renamed from: b */
    public static final ndd m58937b(mdd.C15289c c15289c, rne rneVar) {
        sq8.m48649h(c15289c, "config");
        sq8.m48649h(rneVar, "request");
        ndd.C15548b c15548b = ndd.f36711e;
        ndd.C15547a c15547a = new ndd.C15547a();
        c15547a.m40389g(c15289c.m38777l());
        m58936a(c15547a, c15289c, rneVar);
        l8i l8iVarM38774i = c15289c.m38774i();
        c15547a.m40388f(l8iVarM38774i != null ? l8iVarM38774i.toString() : null);
        nl7 nl7Var = (nl7) f56694a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c15547a, rneVar);
        }
        return c15547a.m40383a();
    }
}
