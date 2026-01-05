package p001o;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zr1 {

    /* renamed from: c */
    public static final C18698a f57558c = new C18698a(null);

    /* renamed from: d */
    public static final int f57559d = 8;

    /* renamed from: e */
    public static final zr1 f57560e = new zr1();

    /* renamed from: a */
    public volatile ConcurrentHashMap f57561a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Object f57562b = new Object();

    /* renamed from: o.zr1$a */
    public static final class C18698a {
        public C18698a() {
        }

        public /* synthetic */ C18698a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final zr1 m59786a() {
            return zr1.f57560e;
        }
    }

    /* renamed from: b */
    public final List m59784b(String str) {
        List list;
        sq8.m48649h(str, "name");
        synchronized (this.f57562b) {
            list = (List) this.f57561a.get(str);
        }
        return list;
    }

    /* renamed from: c */
    public final void m59785c(String str, List list) {
        sq8.m48649h(str, "name");
        sq8.m48649h(list, "addresses");
        synchronized (this.f57562b) {
            this.f57561a.put(str, list);
            y3i y3iVar = y3i.f54824a;
        }
    }
}
