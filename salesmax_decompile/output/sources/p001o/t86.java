package p001o;

import java.util.Map;
import p001o.xvh;
import p001o.yvh;

/* loaded from: classes3.dex */
public abstract class t86 {

    /* renamed from: a */
    public static final Map f46622a = isa.m32681h();

    /* renamed from: a */
    public static final void m49559a(yvh.C18502a c18502a, xvh.C18256c c18256c, rne rneVar) {
        c18502a.m58388h(Boolean.valueOf(c18256c.m56892p()));
        c18502a.m58389i(Boolean.valueOf(c18256c.m56893q()));
    }

    /* renamed from: b */
    public static final yvh m49560b(xvh.C18256c c18256c, rne rneVar) {
        sq8.m48649h(c18256c, "config");
        sq8.m48649h(rneVar, "request");
        yvh.C18503b c18503b = yvh.f56147e;
        yvh.C18502a c18502a = new yvh.C18502a();
        c18502a.m58387g(c18256c.m56889m());
        m49559a(c18502a, c18256c, rneVar);
        l8i l8iVarM56885i = c18256c.m56885i();
        c18502a.m58386f(l8iVarM56885i != null ? l8iVarM56885i.toString() : null);
        nl7 nl7Var = (nl7) f46622a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c18502a, rneVar);
        }
        return c18502a.m58381a();
    }
}
