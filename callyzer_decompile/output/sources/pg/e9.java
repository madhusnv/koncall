package pg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5178p;
import rb.C6488a;
import rb.C6489b;
import rw.AbstractC6662l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e9 {
    /* renamed from: a */
    public static final boolean m11603a(qr.g0 g0Var) {
        AbstractC4154l.m8923f(g0Var, "<this>");
        return AbstractC6662l.m12710M(new ur.x0[]{ur.p0.f36251c, ur.u0.f36264c, ur.s0.f36260c, ur.v0.f36268c}).contains(g0Var.m12282b());
    }

    /* renamed from: b */
    public static final boolean m11604b(qr.g0 g0Var, ur.x0... x0VarArr) {
        AbstractC4154l.m8923f(g0Var, "<this>");
        return AbstractC6662l.m12713c(x0VarArr, g0Var.m12282b());
    }

    /* renamed from: c */
    public static final ArrayList m11605c(List authSchemePreference, List authOptions) {
        AbstractC4154l.m8923f(authSchemePreference, "authSchemePreference");
        AbstractC4154l.m8923f(authOptions, "authOptions");
        ArrayList arrayList = new ArrayList();
        Iterator it = authSchemePreference.iterator();
        while (it.hasNext()) {
            String str = ((C6489b) it.next()).f31167a;
            String strM10115Z = AbstractC5178p.m10115Z('#', str, str);
            Iterator it2 = authOptions.iterator();
            Object obj = null;
            boolean z6 = false;
            Object obj2 = null;
            while (true) {
                if (it2.hasNext()) {
                    Object next = it2.next();
                    String str2 = ((C6488a) next).f31165a;
                    if (AbstractC5178p.m10115Z('#', str2, str2).equals(strM10115Z)) {
                        if (z6) {
                            break;
                        }
                        z6 = true;
                        obj2 = next;
                    }
                } else if (z6) {
                    obj = obj2;
                }
            }
            C6488a c6488a = (C6488a) obj;
            if (c6488a != null) {
                arrayList.add(c6488a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : authOptions) {
            if (!arrayList.contains((C6488a) obj3)) {
                arrayList2.add(obj3);
            }
        }
        return AbstractC6663m.m12754R(arrayList, arrayList2);
    }
}
