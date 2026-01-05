package androidx.fragment.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 extends d7.w0 {

    /* renamed from: h */
    public static final m1 f2644h = new m1(0);

    /* renamed from: e */
    public final boolean f2648e;

    /* renamed from: b */
    public final HashMap f2645b = new HashMap();

    /* renamed from: c */
    public final HashMap f2646c = new HashMap();

    /* renamed from: d */
    public final HashMap f2647d = new HashMap();

    /* renamed from: f */
    public boolean f2649f = false;

    /* renamed from: g */
    public boolean f2650g = false;

    public n1(boolean z6) {
        this.f2648e = z6;
    }

    @Override // d7.w0
    /* renamed from: d */
    public final void mo1209d() {
        if (j1.m1152K(3)) {
            toString();
        }
        this.f2649f = true;
    }

    /* renamed from: e */
    public final void m1210e(j0 j0Var) {
        if (this.f2650g) {
            j1.m1152K(2);
            return;
        }
        String str = j0Var.mWho;
        HashMap map = this.f2645b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(j0Var.mWho, j0Var);
        if (j1.m1152K(2)) {
            j0Var.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n1.class == obj.getClass()) {
            n1 n1Var = (n1) obj;
            if (this.f2645b.equals(n1Var.f2645b) && this.f2646c.equals(n1Var.f2646c) && this.f2647d.equals(n1Var.f2647d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void m1211f(String str, boolean z6) {
        HashMap map = this.f2646c;
        n1 n1Var = (n1) map.get(str);
        if (n1Var != null) {
            if (z6) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(n1Var.f2646c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    j1.m1152K(3);
                    n1Var.m1211f((String) obj, true);
                }
            }
            n1Var.mo1209d();
            map.remove(str);
        }
        HashMap map2 = this.f2647d;
        d7.b1 b1Var = (d7.b1) map2.get(str);
        if (b1Var != null) {
            b1Var.m5307a();
            map2.remove(str);
        }
    }

    /* renamed from: g */
    public final void m1212g(j0 j0Var) {
        if (this.f2650g) {
            j1.m1152K(2);
        } else {
            if (this.f2645b.remove(j0Var.mWho) == null || !j1.m1152K(2)) {
                return;
            }
            j0Var.toString();
        }
    }

    public final int hashCode() {
        return this.f2647d.hashCode() + ((this.f2646c.hashCode() + (this.f2645b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f2645b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f2646c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f2647d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
