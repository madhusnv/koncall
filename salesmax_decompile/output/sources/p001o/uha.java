package p001o;

import java.util.LinkedHashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class uha {
    /* renamed from: a */
    public static pha m51586a(pha phaVar, pha phaVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < phaVar.m43687f() + phaVar2.m43687f()) {
            Locale localeM43685c = i < phaVar.m43687f() ? phaVar.m43685c(i) : phaVar2.m43685c(i - phaVar.m43687f());
            if (localeM43685c != null) {
                linkedHashSet.add(localeM43685c);
            }
            i++;
        }
        return pha.m43681a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* renamed from: b */
    public static pha m51587b(pha phaVar, pha phaVar2) {
        return (phaVar == null || phaVar.m43686e()) ? pha.m43683d() : m51586a(phaVar, phaVar2);
    }
}
