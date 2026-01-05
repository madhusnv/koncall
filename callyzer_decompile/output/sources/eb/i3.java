package eb;

import iz.C3389v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import pg.ba;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a */
    public ArrayList f9339a;

    public i3(List list) {
        this.f9339a = new ArrayList(list);
    }

    /* renamed from: j */
    public static String m5722j(i3 i3Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = i3Var.f9339a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            arrayList.add(((i0.s1) obj).getClass().getSimpleName());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " | ");
            }
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public void m5723a(String name, String value) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        ba.m11554b(name);
        ba.m11555c(value, name);
        ba.m11553a(this, name, value);
    }

    /* renamed from: b */
    public void m5724b(String name, String value) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        ba.m11553a(this, name, value);
    }

    /* renamed from: c */
    public void m5725c(Object obj) {
        ArrayList arrayList = this.f9339a;
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* renamed from: d */
    public void m5726d(String name, String value) {
        AbstractC4154l.m8923f(name, "name");
        AbstractC4154l.m8923f(value, "value");
        ba.m11554b(name);
        m5724b(name, value);
    }

    /* renamed from: e */
    public C3389v m5727e() {
        return new C3389v((String[]) this.f9339a.toArray(new String[0]));
    }

    /* renamed from: f */
    public boolean m5728f(Class cls) {
        ArrayList arrayList = this.f9339a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (cls.isAssignableFrom(((i0.s1) obj).getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public i0.s1 m5729g(Class cls) {
        ArrayList arrayList = this.f9339a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0.s1 s1Var = (i0.s1) obj;
            if (s1Var.getClass() == cls) {
                return s1Var;
            }
        }
        return null;
    }

    /* renamed from: h */
    public ArrayList m5730h(Class cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f9339a;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            i0.s1 s1Var = (i0.s1) obj;
            if (cls.isAssignableFrom(s1Var.getClass())) {
                arrayList.add(s1Var);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public void m5731i(String str) {
        ArrayList arrayList = this.f9339a;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public i3(int i10) {
        switch (i10) {
            case 3:
                this.f9339a = new ArrayList(2);
                break;
            default:
                this.f9339a = new ArrayList(20);
                break;
        }
    }
}
