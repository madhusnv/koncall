package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class q7f {

    /* renamed from: a */
    public final List f41433a;

    public q7f(List list) {
        sq8.m48649h(list, "resources");
        this.f41433a = list;
    }

    /* renamed from: a */
    public final void m44936a(n7f n7fVar) {
        sq8.m48649h(n7fVar, "resource");
        n7fVar.mo40231c();
        this.f41433a.add(n7fVar);
    }

    /* renamed from: b */
    public final void m44937b() {
        Iterator it = this.f41433a.iterator();
        while (it.hasNext()) {
            ((n7f) it.next()).mo40230a();
        }
    }

    public /* synthetic */ q7f(List list, int i, id5 id5Var) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
