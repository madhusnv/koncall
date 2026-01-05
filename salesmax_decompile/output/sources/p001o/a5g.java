package p001o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a5g {

    /* renamed from: a */
    public final uxf f14160a;

    /* renamed from: b */
    public final Iterator f14161b;

    /* renamed from: c */
    public int f14162c;

    /* renamed from: d */
    public Map.Entry f14163d;

    /* renamed from: e */
    public Map.Entry f14164e;

    public a5g(uxf uxfVar, Iterator it) {
        sq8.m48649h(uxfVar, "map");
        sq8.m48649h(it, "iterator");
        this.f14160a = uxfVar;
        this.f14161b = it;
        this.f14162c = uxfVar.m52108e();
        m16442f();
    }

    /* renamed from: f */
    public final void m16442f() {
        this.f14163d = this.f14164e;
        this.f14164e = this.f14161b.hasNext() ? (Map.Entry) this.f14161b.next() : null;
    }

    /* renamed from: g */
    public final Map.Entry m16443g() {
        return this.f14163d;
    }

    public final boolean hasNext() {
        return this.f14164e != null;
    }

    /* renamed from: j */
    public final uxf m16444j() {
        return this.f14160a;
    }

    /* renamed from: k */
    public final Map.Entry m16445k() {
        return this.f14164e;
    }

    public final void remove() {
        if (m16444j().m52108e() != this.f14162c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f14163d;
        if (entry == null) {
            throw new IllegalStateException();
        }
        this.f14160a.remove(entry.getKey());
        this.f14163d = null;
        y3i y3iVar = y3i.f54824a;
        this.f14162c = m16444j().m52108e();
    }
}
