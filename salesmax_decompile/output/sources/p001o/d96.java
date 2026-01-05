package p001o;

import java.util.Map;
import p001o.q1g;
import p001o.v1g;

/* loaded from: classes2.dex */
public abstract class d96 {

    /* renamed from: a */
    public static final Map f19406a = isa.m32681h();

    /* renamed from: a */
    public static final void m22615a(v1g.C17498a c17498a, q1g.C16272c c16272c, rne rneVar) {
        c17498a.m52276h(Boolean.valueOf(c16272c.m44721o()));
        c17498a.m52277i(Boolean.valueOf(c16272c.m44722p()));
    }

    /* renamed from: b */
    public static final v1g m22616b(q1g.C16272c c16272c, rne rneVar) {
        sq8.m48649h(c16272c, "config");
        sq8.m48649h(rneVar, "request");
        v1g.C17499b c17499b = v1g.f49765e;
        v1g.C17498a c17498a = new v1g.C17498a();
        c17498a.m52275g(c16272c.m44718l());
        m22615a(c17498a, c16272c, rneVar);
        l8i l8iVarM44715i = c16272c.m44715i();
        c17498a.m52274f(l8iVarM44715i != null ? l8iVarM44715i.toString() : null);
        nl7 nl7Var = (nl7) f19406a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c17498a, rneVar);
        }
        return c17498a.m52269a();
    }
}
