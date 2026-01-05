package p001o;

import java.util.Map;
import p001o.c2g;
import p001o.d2g;

/* loaded from: classes2.dex */
public abstract class u86 {

    /* renamed from: a */
    public static final Map f48553a = isa.m32681h();

    /* renamed from: a */
    public static final void m51204a(d2g.C12787a c12787a, c2g.C12539c c12539c, rne rneVar) {
        c12787a.m22288h(Boolean.valueOf(c12539c.m20123o()));
        c12787a.m22289i(Boolean.valueOf(c12539c.m20124p()));
    }

    /* renamed from: b */
    public static final d2g m51205b(c2g.C12539c c12539c, rne rneVar) {
        sq8.m48649h(c12539c, "config");
        sq8.m48649h(rneVar, "request");
        d2g.C12788b c12788b = d2g.f19037e;
        d2g.C12787a c12787a = new d2g.C12787a();
        c12787a.m22287g(c12539c.m20120l());
        m51204a(c12787a, c12539c, rneVar);
        l8i l8iVarM20117i = c12539c.m20117i();
        c12787a.m22286f(l8iVarM20117i != null ? l8iVarM20117i.toString() : null);
        nl7 nl7Var = (nl7) f48553a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c12787a, rneVar);
        }
        return c12787a.m22281a();
    }
}
