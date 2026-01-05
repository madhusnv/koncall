package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w0f implements v0f {

    /* renamed from: a */
    public final xk7 f51244a;

    /* renamed from: b */
    public final Map f51245b;

    /* renamed from: c */
    public final Map f51246c;

    public w0f(Map map, xk7 xk7Var) {
        Map mapM32696w;
        sq8.m48649h(xk7Var, "canBeSaved");
        this.f51244a = xk7Var;
        this.f51245b = (map == null || (mapM32696w = isa.m32696w(map)) == null) ? new LinkedHashMap() : mapM32696w;
        this.f51246c = new LinkedHashMap();
    }

    @Override // p001o.v0f
    /* renamed from: a */
    public Map mo19852a() {
        Map mapM32696w = isa.m32696w(this.f51245b);
        for (Map.Entry entry : this.f51246c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((uk7) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!m53760b(objInvoke)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    mapM32696w.put(str, ch3.m21242g(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((uk7) list.get(i)).invoke();
                    if (objInvoke2 != null && !m53760b(objInvoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mapM32696w.put(str, arrayList);
            }
        }
        return mapM32696w;
    }

    /* renamed from: b */
    public boolean m53760b(Object obj) {
        sq8.m48649h(obj, "value");
        return ((Boolean) this.f51244a.invoke(obj)).booleanValue();
    }
}
