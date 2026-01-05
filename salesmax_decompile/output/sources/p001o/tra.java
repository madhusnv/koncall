package p001o;

import java.util.Iterator;
import java.util.Map;
import p001o.mra;

/* loaded from: classes4.dex */
public class tra implements rra {
    /* renamed from: i */
    public static int m50421i(int i, Object obj, Object obj2) {
        pra praVar = (pra) obj;
        tq.m50332a(obj2);
        if (praVar.isEmpty()) {
            return 0;
        }
        Iterator it = praVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: j */
    public static pra m50422j(Object obj, Object obj2) {
        pra praVarM44079A = (pra) obj;
        pra praVar = (pra) obj2;
        if (!praVar.isEmpty()) {
            if (!praVarM44079A.m44081t()) {
                praVarM44079A = praVarM44079A.m44079A();
            }
            praVarM44079A.m44083y(praVar);
        }
        return praVarM44079A;
    }

    @Override // p001o.rra
    /* renamed from: a */
    public Object mo47093a(Object obj, Object obj2) {
        return m50422j(obj, obj2);
    }

    @Override // p001o.rra
    /* renamed from: b */
    public mra.C15407a mo47094b(Object obj) {
        tq.m50332a(obj);
        throw null;
    }

    @Override // p001o.rra
    /* renamed from: c */
    public Map mo47095c(Object obj) {
        return (pra) obj;
    }

    @Override // p001o.rra
    /* renamed from: d */
    public Object mo47096d(Object obj) {
        return pra.m44076g().m44079A();
    }

    @Override // p001o.rra
    /* renamed from: e */
    public Map mo47097e(Object obj) {
        return (pra) obj;
    }

    @Override // p001o.rra
    /* renamed from: f */
    public Object mo47098f(Object obj) {
        ((pra) obj).m44082u();
        return obj;
    }

    @Override // p001o.rra
    /* renamed from: g */
    public int mo47099g(int i, Object obj, Object obj2) {
        return m50421i(i, obj, obj2);
    }

    @Override // p001o.rra
    /* renamed from: h */
    public boolean mo47100h(Object obj) {
        return !((pra) obj).m44081t();
    }
}
