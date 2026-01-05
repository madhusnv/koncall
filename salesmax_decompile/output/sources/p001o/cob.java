package p001o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class cob extends HashMap implements Cloneable {
    public cob(int i) {
        super(i);
    }

    /* renamed from: a */
    public void m21555a(Object obj, Object obj2) {
        Object obj3 = super.get(obj);
        Object objM49909a = ti9.m49909a(obj3, obj2);
        if (obj3 != objM49909a) {
            super.put(obj, objM49909a);
        }
    }

    /* renamed from: c */
    public Object m21556c(Object obj, int i) {
        Object obj2 = super.get(obj);
        if (i == 0 && ti9.m49917k(obj2) == 0) {
            return null;
        }
        return ti9.m49913g(obj2, i);
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public Object clone() {
        cob cobVar = (cob) super.clone();
        Iterator it = cobVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.setValue(ti9.m49912f(entry.getValue()));
        }
        return cobVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2 = super.get(obj);
        int iM49917k = ti9.m49917k(obj2);
        if (iM49917k != 0) {
            return iM49917k != 1 ? ti9.m49915i(obj2, true) : ti9.m49913g(obj2, 0);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return super.put(obj, ti9.m49909a(null, obj2));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        boolean z = map instanceof cob;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                super.put(entry.getKey(), ti9.m49912f(entry.getValue()));
            } else {
                put(entry.getKey(), entry.getValue());
            }
        }
    }
}
