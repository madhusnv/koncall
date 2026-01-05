package p001o;

import java.util.Map;
import p001o.aag;
import p001o.z9g;

/* loaded from: classes2.dex */
public abstract class v86 {

    /* renamed from: a */
    public static final Map f50010a = isa.m32681h();

    /* renamed from: a */
    public static final void m52454a(aag.C12122a c12122a, z9g.C18593c c18593c, rne rneVar) {
        c12122a.m16785i(Boolean.valueOf(c18593c.m59019o()));
        c12122a.m16786j(Boolean.valueOf(c18593c.m59020p()));
        c12122a.m16787k(Boolean.FALSE);
    }

    /* renamed from: b */
    public static final aag m52455b(z9g.C18593c c18593c, rne rneVar) {
        sq8.m48649h(c18593c, "config");
        sq8.m48649h(rneVar, "request");
        aag.C12123b c12123b = aag.f14394f;
        aag.C12122a c12122a = new aag.C12122a();
        c12122a.m16784h(c18593c.m59016l());
        m52454a(c12122a, c18593c, rneVar);
        l8i l8iVarM59013i = c18593c.m59013i();
        c12122a.m16783g(l8iVarM59013i != null ? l8iVarM59013i.toString() : null);
        nl7 nl7Var = (nl7) f50010a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c12122a, rneVar);
        }
        return c12122a.m16777a();
    }
}
