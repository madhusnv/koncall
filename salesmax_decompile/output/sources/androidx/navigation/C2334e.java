package androidx.navigation;

import androidx.lifecycle.b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.dxi;
import p001o.esb;
import p001o.id5;
import p001o.kxi;
import p001o.sq8;

/* renamed from: androidx.navigation.e */
/* loaded from: classes2.dex */
public final class C2334e extends dxi implements esb {

    /* renamed from: c */
    public static final b f9519c = new b(null);

    /* renamed from: d */
    public static final b0.InterfaceC2131c f9520d = new a();

    /* renamed from: b */
    public final Map f9521b = new LinkedHashMap();

    /* renamed from: androidx.navigation.e$a */
    public static final class a implements b0.InterfaceC2131c {
        @Override // androidx.lifecycle.b0.InterfaceC2131c
        /* renamed from: c */
        public dxi mo6367c(Class cls) {
            sq8.m48649h(cls, "modelClass");
            return new C2334e();
        }
    }

    /* renamed from: androidx.navigation.e$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final C2334e m8644a(kxi kxiVar) {
            sq8.m48649h(kxiVar, "viewModelStore");
            return (C2334e) new b0(kxiVar, C2334e.f9520d, null, 4, null).m6505a(C2334e.class);
        }
    }

    @Override // p001o.esb
    /* renamed from: a */
    public kxi mo8642a(String str) {
        sq8.m48649h(str, "backStackEntryId");
        kxi kxiVar = (kxi) this.f9521b.get(str);
        if (kxiVar != null) {
            return kxiVar;
        }
        kxi kxiVar2 = new kxi();
        this.f9521b.put(str, kxiVar2);
        return kxiVar2;
    }

    @Override // p001o.dxi
    /* renamed from: e */
    public void mo6354e() {
        Iterator it = this.f9521b.values().iterator();
        while (it.hasNext()) {
            ((kxi) it.next()).m36299a();
        }
        this.f9521b.clear();
    }

    /* renamed from: g */
    public final void m8643g(String str) {
        sq8.m48649h(str, "backStackEntryId");
        kxi kxiVar = (kxi) this.f9521b.remove(str);
        if (kxiVar != null) {
            kxiVar.m36299a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f9521b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }
}
