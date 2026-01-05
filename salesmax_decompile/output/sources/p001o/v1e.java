package p001o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class v1e {

    /* renamed from: c */
    public static final v1e f49762c = new v1e();

    /* renamed from: b */
    public final ConcurrentMap f49764b = new ConcurrentHashMap();

    /* renamed from: a */
    public final p5f f49763a = new zpa();

    /* renamed from: a */
    public static v1e m52231a() {
        return f49762c;
    }

    /* renamed from: b */
    public void m52232b(Object obj, mce mceVar, qp6 qp6Var) {
        m52235e(obj).mo40129h(obj, mceVar, qp6Var);
    }

    /* renamed from: c */
    public n5f m52233c(Class cls, n5f n5fVar) {
        yn8.m58013b(cls, "messageType");
        yn8.m58013b(n5fVar, "schema");
        return (n5f) this.f49764b.putIfAbsent(cls, n5fVar);
    }

    /* renamed from: d */
    public n5f m52234d(Class cls) {
        yn8.m58013b(cls, "messageType");
        n5f n5fVar = (n5f) this.f49764b.get(cls);
        if (n5fVar != null) {
            return n5fVar;
        }
        n5f n5fVarMo42979a = this.f49763a.mo42979a(cls);
        n5f n5fVarM52233c = m52233c(cls, n5fVarMo42979a);
        return n5fVarM52233c != null ? n5fVarM52233c : n5fVarMo42979a;
    }

    /* renamed from: e */
    public n5f m52235e(Object obj) {
        return m52234d(obj.getClass());
    }
}
