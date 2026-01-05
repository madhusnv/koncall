package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class y4g {

    /* renamed from: a */
    public final List f54892a;

    /* renamed from: b */
    public final List f54893b;

    public y4g(List list, List list2) {
        sq8.m48649h(list, "state");
        sq8.m48649h(list2, "pendingMutations");
        this.f54892a = list;
        this.f54893b = list2;
    }

    /* renamed from: a */
    public final yba m57207a() {
        return (yba) t2g.m49209e(this.f54892a);
    }

    /* renamed from: b */
    public final int m57208b() {
        return this.f54892a.size();
    }

    /* renamed from: c */
    public final void m57209c(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "mutation");
        this.f54893b.add(xk7Var);
    }

    /* renamed from: d */
    public final void m57210d() {
        Iterator it = this.f54893b.iterator();
        while (it.hasNext()) {
            ((xk7) it.next()).invoke(this.f54892a);
        }
        this.f54893b.clear();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4g)) {
            return false;
        }
        y4g y4gVar = (y4g) obj;
        return sq8.m48644c(this.f54892a, y4gVar.f54892a) && sq8.m48644c(this.f54893b, y4gVar.f54893b);
    }

    public int hashCode() {
        return (this.f54892a.hashCode() * 31) + this.f54893b.hashCode();
    }

    public String toString() {
        return "StateManager(state=" + this.f54892a + ", pendingMutations=" + this.f54893b + ')';
    }

    public /* synthetic */ y4g(List list, List list2, int i, id5 id5Var) {
        this((i & 1) != 0 ? ch3.m21252q(yba.Initial) : list, (i & 2) != 0 ? new ArrayList() : list2);
    }
}
