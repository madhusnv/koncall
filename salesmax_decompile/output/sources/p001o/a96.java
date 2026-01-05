package p001o;

import java.util.Map;
import p001o.lhe;
import p001o.mhe;

/* loaded from: classes3.dex */
public abstract class a96 {

    /* renamed from: a */
    public static final Map f14312a = isa.m32681h();

    /* renamed from: a */
    public static final void m16696a(mhe.C15326a c15326a, lhe.C15078c c15078c, rne rneVar) {
        c15326a.m39082h(Boolean.valueOf(c15078c.m37242p()));
        c15326a.m39083i(Boolean.valueOf(c15078c.m37243q()));
    }

    /* renamed from: b */
    public static final mhe m16697b(lhe.C15078c c15078c, rne rneVar) {
        sq8.m48649h(c15078c, "config");
        sq8.m48649h(rneVar, "request");
        mhe.C15327b c15327b = mhe.f35485e;
        mhe.C15326a c15326a = new mhe.C15326a();
        c15326a.m39081g(c15078c.m37239m());
        m16696a(c15326a, c15078c, rneVar);
        l8i l8iVarM37235i = c15078c.m37235i();
        c15326a.m39080f(l8iVarM37235i != null ? l8iVarM37235i.toString() : null);
        nl7 nl7Var = (nl7) f14312a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c15326a, rneVar);
        }
        return c15326a.m39075a();
    }
}
