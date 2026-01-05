package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class l5e {

    /* renamed from: a */
    public final List f33293a;

    public l5e(List list) {
        this.f33293a = new ArrayList(list);
    }

    /* renamed from: d */
    public static String m36592d(l5e l5eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = l5eVar.f33293a.iterator();
        while (it.hasNext()) {
            arrayList.add(((j5e) it.next()).getClass().getSimpleName());
        }
        return pnd.m43910a(" | ", arrayList);
    }

    /* renamed from: a */
    public boolean m36593a(Class cls) {
        Iterator it = this.f33293a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((j5e) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public j5e m36594b(Class cls) {
        for (j5e j5eVar : this.f33293a) {
            if (j5eVar.getClass() == cls) {
                return j5eVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public List m36595c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (j5e j5eVar : this.f33293a) {
            if (cls.isAssignableFrom(j5eVar.getClass())) {
                arrayList.add(j5eVar);
            }
        }
        return arrayList;
    }
}
