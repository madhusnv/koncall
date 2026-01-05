package p001o;

import androidx.navigation.AbstractC2341h;
import androidx.navigation.C2342i;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class jj0 {

    /* renamed from: a */
    public final Set f30496a;

    /* renamed from: b */
    public final ndc f30497b;

    /* renamed from: o.jj0$a */
    public static final class C14548a {

        /* renamed from: a */
        public final Set f30498a;

        /* renamed from: b */
        public ndc f30499b;

        public C14548a(C2342i c2342i) {
            sq8.m48649h(c2342i, "navGraph");
            HashSet hashSet = new HashSet();
            this.f30498a = hashSet;
            hashSet.add(Integer.valueOf(C2342i.f9625X.m8788b(c2342i).m8753A()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final jj0 m33874a() {
            return new jj0(this.f30498a, this.f30499b, null, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: o.jj0$b */
    public interface InterfaceC14549b {
    }

    public /* synthetic */ jj0(Set set, ndc ndcVar, InterfaceC14549b interfaceC14549b, id5 id5Var) {
        this(set, ndcVar, interfaceC14549b);
    }

    /* renamed from: a */
    public final InterfaceC14549b m33871a() {
        return null;
    }

    /* renamed from: b */
    public final ndc m33872b() {
        return this.f30497b;
    }

    /* renamed from: c */
    public final boolean m33873c(AbstractC2341h abstractC2341h) {
        boolean z;
        sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
        Iterator it = AbstractC2341h.f9602x.m8776c(abstractC2341h).iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            AbstractC2341h abstractC2341h2 = (AbstractC2341h) it.next();
            if (this.f30496a.contains(Integer.valueOf(abstractC2341h2.m8753A())) && (!(abstractC2341h2 instanceof C2342i) || abstractC2341h.m8753A() == C2342i.f9625X.m8788b((C2342i) abstractC2341h2).m8753A())) {
                z = true;
            }
        } while (!z);
        return true;
    }

    public jj0(Set set, ndc ndcVar, InterfaceC14549b interfaceC14549b) {
        this.f30496a = set;
        this.f30497b = ndcVar;
    }
}
