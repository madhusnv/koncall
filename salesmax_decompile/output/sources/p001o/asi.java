package p001o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.xri;

/* loaded from: classes3.dex */
public abstract class asi implements xri {

    /* renamed from: c */
    public final boolean f15206c;

    /* renamed from: d */
    public final Map f15207d;

    public asi(boolean z, Map map) {
        sq8.m48649h(map, "initialValues");
        this.f15206c = z;
        Map mapM17775e = m17775e(map);
        if (mo17771a()) {
            oe2 oe2Var = new oe2();
            oe2Var.putAll(mapM17775e);
            mapM17775e = oe2Var;
        }
        this.f15207d = mapM17775e;
    }

    @Override // p001o.xri
    /* renamed from: a */
    public boolean mo17771a() {
        return this.f15206c;
    }

    @Override // p001o.xri
    /* renamed from: b */
    public Set mo17772b() {
        return this.f15207d.entrySet();
    }

    @Override // p001o.xri
    /* renamed from: c */
    public List mo17773c(String str) {
        sq8.m48649h(str, "name");
        return (List) this.f15207d.get(str);
    }

    @Override // p001o.xri
    public boolean contains(String str) {
        sq8.m48649h(str, "name");
        return this.f15207d.containsKey(str);
    }

    @Override // p001o.xri
    /* renamed from: d */
    public void mo17774d(nl7 nl7Var) {
        xri.C18232a.m56731a(this, nl7Var);
    }

    /* renamed from: e */
    public final Map m17775e(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(hsa.m31055e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), kh3.Q0((List) entry.getValue()));
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof xri)) {
            return false;
        }
        xri xriVar = (xri) obj;
        if (mo17771a() != xriVar.mo17771a()) {
            return false;
        }
        Set setNames = names();
        if (setNames.size() != xriVar.names().size()) {
            return false;
        }
        Set<String> set = setNames;
        if ((set instanceof Collection) && set.isEmpty()) {
            z = true;
        } else {
            for (String str : set) {
                if (!sq8.m48644c(mo17773c(str), xriVar.mo17773c(str))) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // p001o.xri
    public Object get(String str) {
        return xri.C18232a.m56732b(this, str);
    }

    @Override // p001o.xri
    public boolean isEmpty() {
        return this.f15207d.isEmpty();
    }

    @Override // p001o.xri
    public Set names() {
        return this.f15207d.keySet();
    }
}
