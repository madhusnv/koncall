package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p001o.aff;
import p001o.u6f;

/* loaded from: classes3.dex */
public abstract class ze7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final tff m59334a() {
        return new ye7(new t6f(), null, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: g */
    public static final void m59340g(t6f t6fVar, Number number) {
        u6f.C17307a.m51045b(t6fVar, number.toString(), 0, 0, 6, null);
    }

    /* renamed from: h */
    public static final h7f m59341h(h7f h7fVar, String str) {
        Set setM29948c = h7fVar.m29948c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM29948c) {
            if (!(((hu6) obj) instanceof ue7)) {
                arrayList.add(obj);
            }
        }
        Set setU0 = kh3.U0(arrayList);
        setU0.add(new ue7(str));
        return new h7f(h7fVar.m29947b(), setU0);
    }

    /* renamed from: i */
    public static final String m59342i(String str) {
        return e3d.f20909h.m24246c().mo24241a(str);
    }

    /* renamed from: j */
    public static final String m59343j(h7f h7fVar) {
        Object next;
        Iterator it = h7fVar.m29948c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((hu6) next).getClass() == ue7.class) {
                break;
            }
        }
        hu6 hu6Var = (hu6) next;
        if (hu6Var != null) {
            return ((ue7) hu6Var).m51399a();
        }
        throw new IllegalArgumentException(("Expected to find trait " + kge.m35689b(ue7.class) + " in " + h7fVar + " but was not present.").toString());
    }

    /* renamed from: k */
    public static final h7f m59344k(b5e b5eVar) {
        return new h7f(aff.C12163j.f14622a, new ue7(b5eVar.m18171a()));
    }
}
