package p001o;

import java.util.Map;
import p001o.up3;
import p001o.vp3;

/* loaded from: classes3.dex */
public abstract class y86 {

    /* renamed from: a */
    public static final Map f55057a = isa.m32681h();

    /* renamed from: a */
    public static final void m57367a(vp3.C17642a c17642a, up3.C17430c c17430c, rne rneVar) {
        c17642a.m53171h(Boolean.valueOf(c17430c.m51889p()));
        c17642a.m53172i(Boolean.valueOf(c17430c.m51890q()));
    }

    /* renamed from: b */
    public static final vp3 m57368b(up3.C17430c c17430c, rne rneVar) {
        sq8.m48649h(c17430c, "config");
        sq8.m48649h(rneVar, "request");
        vp3.C17643b c17643b = vp3.f50679e;
        vp3.C17642a c17642a = new vp3.C17642a();
        c17642a.m53170g(c17430c.m51886m());
        m57367a(c17642a, c17430c, rneVar);
        l8i l8iVarM51882i = c17430c.m51882i();
        c17642a.m53169f(l8iVarM51882i != null ? l8iVarM51882i.toString() : null);
        nl7 nl7Var = (nl7) f55057a.get((String) tx0.m50737b(rneVar.m47005a(), e7f.f21127a.m24497d()));
        if (nl7Var != null) {
            nl7Var.invoke(c17642a, rneVar);
        }
        return c17642a.m53164a();
    }
}
