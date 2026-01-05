package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.y08;

/* loaded from: classes3.dex */
public abstract class a18 {
    /* renamed from: b */
    public static final y08 m16325b(String str) {
        vv8 vv8VarM17198h = aih.m17198h(str);
        if (vv8VarM17198h == null) {
            vv8VarM17198h = aih.m17199i(str);
        }
        if (vv8VarM17198h != null) {
            return new y08.C18292c(vv8VarM17198h);
        }
        boolean z = true;
        List listC0 = f9g.C0(str, new char[]{'.'}, false, 0, 6, null);
        if (!(listC0 instanceof Collection) || !listC0.isEmpty()) {
            Iterator it = listC0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!aih.m17197g((String) it.next())) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return new y08.C18291b(str);
        }
        throw new IllegalArgumentException(str + " is not a valid inet host");
    }

    /* renamed from: c */
    public static final String m16326c(y08 y08Var) {
        sq8.m48649h(y08Var, "<this>");
        if (!(y08Var instanceof y08.C18292c)) {
            if (y08Var instanceof y08.C18291b) {
                return ((y08.C18291b) y08Var).m57087a();
            }
            throw new szb();
        }
        y08.C18292c c18292c = (y08.C18292c) y08Var;
        if (!(c18292c.m57088a() instanceof aw8)) {
            return c18292c.m57088a().toString();
        }
        String str = '[' + e3d.f20909h.m24248e().mo24241a(((aw8) c18292c.m57088a()).toString()) + ']';
        sq8.m48648g(str, "toString(...)");
        return str;
    }
}
