package p001o;

import java.util.Map;
import p001o.kg3;
import p001o.lg3;

/* loaded from: classes3.dex */
public abstract class x86 {

    /* renamed from: a */
    public static final Map f53340a = isa.m32681h();

    /* renamed from: a */
    public static final void m55811a(lg3.C15070a c15070a, kg3.C14827c c14827c, rne rneVar) {
        c15070a.m37150h(Boolean.valueOf(c14827c.m35667o()));
        c15070a.m37151i(Boolean.valueOf(c14827c.m35668p()));
    }

    /* renamed from: b */
    public static final lg3 m55812b(kg3.C14827c c14827c, rne rneVar) {
        sq8.m48649h(c14827c, "config");
        sq8.m48649h(rneVar, "request");
        lg3.C15071b c15071b = lg3.f33744e;
        lg3.C15070a c15070a = new lg3.C15070a();
        c15070a.m37149g(c14827c.m35664l());
        m55811a(c15070a, c14827c, rneVar);
        l8i l8iVarM35661i = c14827c.m35661i();
        c15070a.m37148f(l8iVarM35661i != null ? l8iVarM35661i.toString() : null);
        nl7 nl7Var = (nl7) f53340a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c15070a, rneVar);
        }
        return c15070a.m37143a();
    }
}
