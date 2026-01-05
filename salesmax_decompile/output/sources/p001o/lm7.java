package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p001o.l8i;
import p001o.y08;

/* loaded from: classes3.dex */
public abstract class lm7 {
    /* renamed from: a */
    public static final boolean m37466a(String str, boolean z) {
        if (str == null) {
            return false;
        }
        if (!z) {
            return aih.m17197g(str);
        }
        List listC0 = f9g.C0(str, new char[]{'.'}, false, 0, 6, null);
        if (!(listC0 instanceof Collection) || !listC0.isEmpty()) {
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                if (!aih.m17197g((String) it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final m8i m37467b(String str) {
        if (str == null) {
            return null;
        }
        try {
            l8i l8iVarM36787m = l8i.C15037b.m36787m(l8i.f33466k, str, null, 2, null);
            StringBuilder sb = new StringBuilder();
            sb.append(a18.m16326c(l8iVarM36787m.m36755b()));
            if (l8iVarM36787m.m36758e() != l8iVarM36787m.m36759f().m16521d()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(':');
                sb2.append(l8iVarM36787m.m36758e());
                sb.append(sb2.toString());
            }
            String string = sb.toString();
            sq8.m48648g(string, "toString(...)");
            String string2 = l8iVarM36787m.m36757d().toString();
            return new m8i(l8iVarM36787m.m36759f().m16522e(), string, string2, bih.m19216b(string2, "/"), l8iVarM36787m.m36755b() instanceof y08.C18292c);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static final String m37468c(String str, int i, int i2, boolean z) {
        if (str == null || i >= i2 || i2 > str.length()) {
            return null;
        }
        return z ? f9g.L0(str, bce.m18616s(str.length() - i2, str.length() - i)) : f9g.L0(str, bce.m18616s(i, i2));
    }

    /* renamed from: d */
    public static final String m37469d(String str) {
        sq8.m48649h(str, "value");
        return e3d.f20909h.m24252i().mo24241a(str);
    }
}
