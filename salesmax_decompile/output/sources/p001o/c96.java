package p001o;

import java.util.Map;
import p001o.njh;
import p001o.ojh;

/* loaded from: classes3.dex */
public abstract class c96 {

    /* renamed from: a */
    public static final Map f17527a = isa.m32681h();

    /* renamed from: a */
    public static final void m20508a(ojh.C15822a c15822a, njh.C15595c c15595c, rne rneVar) {
        c15822a.m42310h(Boolean.valueOf(c15595c.m40699p()));
        c15822a.m42311i(Boolean.valueOf(c15595c.m40700q()));
    }

    /* renamed from: b */
    public static final ojh m20509b(njh.C15595c c15595c, rne rneVar) {
        sq8.m48649h(c15595c, "config");
        sq8.m48649h(rneVar, "request");
        ojh.C15823b c15823b = ojh.f38457e;
        ojh.C15822a c15822a = new ojh.C15822a();
        c15822a.m42309g(c15595c.m40696m());
        m20508a(c15822a, c15595c, rneVar);
        l8i l8iVarM40692i = c15595c.m40692i();
        c15822a.m42308f(l8iVarM40692i != null ? l8iVarM40692i.toString() : null);
        nl7 nl7Var = (nl7) f17527a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c15822a, rneVar);
        }
        return c15822a.m42303a();
    }
}
