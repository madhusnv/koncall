package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class zri {

    /* renamed from: a */
    public final boolean f57578a;

    /* renamed from: b */
    public final Map f57579b;

    public zri(boolean z, int i) {
        this.f57578a = z;
        this.f57579b = z ? new oe2() : new LinkedHashMap(i);
    }

    /* renamed from: f */
    public static final y3i m59795f(zri zriVar, String str, List list) {
        sq8.m48649h(str, "name");
        sq8.m48649h(list, "values");
        zriVar.m59797d(str, list);
        return y3i.f54824a;
    }

    /* renamed from: c */
    public final void m59796c(String str, Object obj) {
        sq8.m48649h(str, "name");
        m59802j(str, 1).add(obj);
    }

    /* renamed from: d */
    public final void m59797d(String str, Iterable iterable) {
        sq8.m48649h(str, "name");
        sq8.m48649h(iterable, "values");
        Collection collection = iterable instanceof Collection ? (Collection) iterable : null;
        List listM59802j = m59802j(str, collection != null ? collection.size() : 2);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            listM59802j.add(it.next());
        }
    }

    /* renamed from: e */
    public final void m59798e(xri xriVar) {
        sq8.m48649h(xriVar, "valuesMap");
        xriVar.mo17774d(new nl7() { // from class: o.yri
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return zri.m59795f(this.f55860a, (String) obj, (List) obj2);
            }
        });
    }

    /* renamed from: g */
    public final void m59799g(String str, Iterable iterable) {
        Set setM40664e;
        sq8.m48649h(str, "name");
        sq8.m48649h(iterable, "values");
        List list = (List) this.f57579b.get(str);
        if (list == null || (setM40664e = kh3.V0(list)) == null) {
            setM40664e = nif.m40664e();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!setM40664e.contains(obj)) {
                arrayList.add(obj);
            }
        }
        m59797d(str, arrayList);
    }

    /* renamed from: h */
    public final void m59800h() {
        this.f57579b.clear();
    }

    /* renamed from: i */
    public final boolean m59801i(String str) {
        sq8.m48649h(str, "name");
        return this.f57579b.containsKey(str);
    }

    /* renamed from: j */
    public final List m59802j(String str, int i) {
        List list = (List) this.f57579b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(i);
        this.f57579b.put(str, arrayList);
        return arrayList;
    }

    /* renamed from: k */
    public final Set m59803k() {
        return this.f57579b.entrySet();
    }

    /* renamed from: l */
    public final Object m59804l(String str) {
        sq8.m48649h(str, "name");
        List listM59805m = m59805m(str);
        if (listM59805m != null) {
            return kh3.h0(listM59805m);
        }
        return null;
    }

    /* renamed from: m */
    public final List m59805m(String str) {
        sq8.m48649h(str, "name");
        return (List) this.f57579b.get(str);
    }

    /* renamed from: n */
    public final Map m59806n() {
        return this.f57579b;
    }

    /* renamed from: o */
    public final boolean m59807o() {
        return this.f57579b.isEmpty();
    }

    /* renamed from: p */
    public final Set m59808p() {
        return this.f57579b.keySet();
    }

    /* renamed from: q */
    public final List m59809q(String str) {
        sq8.m48649h(str, "name");
        return (List) this.f57579b.remove(str);
    }

    /* renamed from: r */
    public final void m59810r(String str, Object obj) {
        sq8.m48649h(str, "name");
        List listM59802j = m59802j(str, 1);
        listM59802j.clear();
        listM59802j.add(obj);
    }

    /* renamed from: s */
    public final void m59811s(String str, Object obj) {
        sq8.m48649h(str, "name");
        if (this.f57579b.containsKey(str)) {
            return;
        }
        m59810r(str, obj);
    }
}
