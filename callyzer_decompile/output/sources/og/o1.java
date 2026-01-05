package og;

import ba.AbstractC0638h;
import iw.InterfaceC3358a;
import iw.InterfaceC3359b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4406f;
import l7.C4419s;
import l7.C4424x;
import n7.C4964i;
import n7.C4965j;
import rw.C6668r;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o1 {
    /* renamed from: a */
    public static void m10789a(C4424x c4424x, String str, List list, List list2, C6734c c6734c, int i10) {
        int i11 = i10 & 2;
        C6668r c6668r = C6668r.f31943a;
        if (i11 != 0) {
            list = c6668r;
        }
        if ((i10 & 4) != 0) {
            list2 = c6668r;
        }
        l7.o0 o0Var = c4424x.f22141f;
        o0Var.getClass();
        C4965j c4965j = new C4965j((C4964i) o0Var.m9233b(AbstractC0638h.m1854b(C4964i.class)), str, c6734c);
        for (C4406f c4406f : list) {
            ((LinkedHashMap) c4965j.f253c).put(c4406f.f22033a, c4406f.f22034b);
        }
        for (C4419s navDeepLink : list2) {
            AbstractC4154l.m8923f(navDeepLink, "navDeepLink");
            ((ArrayList) c4965j.f254d).add(navDeepLink);
        }
        c4424x.f22143h.add(c4965j.mo186a());
    }

    /* renamed from: b */
    public static Object m10790b(Class cls, Object obj) {
        if (obj instanceof InterfaceC3358a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC3359b) {
            return m10790b(cls, ((InterfaceC3359b) obj).mo1432a());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + InterfaceC3358a.class + " or " + InterfaceC3359b.class);
    }
}
