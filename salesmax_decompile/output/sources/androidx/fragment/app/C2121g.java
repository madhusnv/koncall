package androidx.fragment.app;

import androidx.lifecycle.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p001o.dxi;
import p001o.kxi;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes2.dex */
public final class C2121g extends dxi {

    /* renamed from: i */
    public static final b0.InterfaceC2131c f7559i = new a();

    /* renamed from: e */
    public final boolean f7563e;

    /* renamed from: b */
    public final HashMap f7560b = new HashMap();

    /* renamed from: c */
    public final HashMap f7561c = new HashMap();

    /* renamed from: d */
    public final HashMap f7562d = new HashMap();

    /* renamed from: f */
    public boolean f7564f = false;

    /* renamed from: g */
    public boolean f7565g = false;

    /* renamed from: h */
    public boolean f7566h = false;

    /* renamed from: androidx.fragment.app.g$a */
    public class a implements b0.InterfaceC2131c {
        @Override // androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: c */
        public dxi mo6367c(Class cls) {
            return new C2121g(true);
        }
    }

    public C2121g(boolean z) {
        this.f7563e = z;
    }

    /* renamed from: l */
    public static C2121g m6353l(kxi kxiVar) {
        return (C2121g) new b0(kxiVar, f7559i).m6505a(C2121g.class);
    }

    @Override // p001o.dxi
    /* renamed from: e */
    public void mo6354e() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.f7564f = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2121g.class != obj.getClass()) {
            return false;
        }
        C2121g c2121g = (C2121g) obj;
        return this.f7560b.equals(c2121g.f7560b) && this.f7561c.equals(c2121g.f7561c) && this.f7562d.equals(c2121g.f7562d);
    }

    /* renamed from: f */
    public void m6355f(Fragment fragment) {
        if (this.f7566h) {
            FragmentManager.P0(2);
            return;
        }
        if (this.f7560b.containsKey(fragment.mWho)) {
            return;
        }
        this.f7560b.put(fragment.mWho, fragment);
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
        }
    }

    /* renamed from: g */
    public void m6356g(Fragment fragment, boolean z) {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
        }
        m6358i(fragment.mWho, z);
    }

    /* renamed from: h */
    public void m6357h(String str, boolean z) {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        m6358i(str, z);
    }

    public int hashCode() {
        return (((this.f7560b.hashCode() * 31) + this.f7561c.hashCode()) * 31) + this.f7562d.hashCode();
    }

    /* renamed from: i */
    public final void m6358i(String str, boolean z) {
        C2121g c2121g = (C2121g) this.f7561c.get(str);
        if (c2121g != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c2121g.f7561c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c2121g.m6357h((String) it.next(), true);
                }
            }
            c2121g.mo6354e();
            this.f7561c.remove(str);
        }
        kxi kxiVar = (kxi) this.f7562d.get(str);
        if (kxiVar != null) {
            kxiVar.m36299a();
            this.f7562d.remove(str);
        }
    }

    /* renamed from: j */
    public Fragment m6359j(String str) {
        return (Fragment) this.f7560b.get(str);
    }

    /* renamed from: k */
    public C2121g m6360k(Fragment fragment) {
        C2121g c2121g = (C2121g) this.f7561c.get(fragment.mWho);
        if (c2121g != null) {
            return c2121g;
        }
        C2121g c2121g2 = new C2121g(this.f7563e);
        this.f7561c.put(fragment.mWho, c2121g2);
        return c2121g2;
    }

    /* renamed from: m */
    public Collection m6361m() {
        return new ArrayList(this.f7560b.values());
    }

    /* renamed from: n */
    public kxi m6362n(Fragment fragment) {
        kxi kxiVar = (kxi) this.f7562d.get(fragment.mWho);
        if (kxiVar != null) {
            return kxiVar;
        }
        kxi kxiVar2 = new kxi();
        this.f7562d.put(fragment.mWho, kxiVar2);
        return kxiVar2;
    }

    /* renamed from: o */
    public boolean m6363o() {
        return this.f7564f;
    }

    /* renamed from: p */
    public void m6364p(Fragment fragment) {
        if (this.f7566h) {
            FragmentManager.P0(2);
            return;
        }
        if ((this.f7560b.remove(fragment.mWho) != null) && FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
        }
    }

    /* renamed from: q */
    public void m6365q(boolean z) {
        this.f7566h = z;
    }

    /* renamed from: r */
    public boolean m6366r(Fragment fragment) {
        if (this.f7560b.containsKey(fragment.mWho)) {
            return this.f7563e ? this.f7564f : !this.f7565g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f7560b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f7561c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f7562d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
