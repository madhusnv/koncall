package p001o;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fm5 {

    /* renamed from: a */
    public final boolean f23633a;

    /* renamed from: b */
    public final gi9 f23634b = si9.m48361b(cj9.NONE, C13484b.f23637a);

    /* renamed from: c */
    public final Comparator f23635c;

    /* renamed from: d */
    public final lxh f23636d;

    /* renamed from: o.fm5$a */
    public static final class C13483a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(zh9 zh9Var, zh9 zh9Var2) {
            sq8.m48649h(zh9Var, "l1");
            sq8.m48649h(zh9Var2, "l2");
            int iM48651j = sq8.m48651j(zh9Var.m59448z(), zh9Var2.m59448z());
            return iM48651j != 0 ? iM48651j : sq8.m48651j(zh9Var.hashCode(), zh9Var2.hashCode());
        }
    }

    /* renamed from: o.fm5$b */
    public static final class C13484b extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C13484b f23637a = new C13484b();

        public C13484b() {
            super(0);
        }

        @Override // p001o.uk7
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public fm5(boolean z) {
        this.f23633a = z;
        C13483a c13483a = new C13483a();
        this.f23635c = c13483a;
        this.f23636d = new lxh(c13483a);
    }

    /* renamed from: a */
    public final void m27036a(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        if (!zh9Var.s0()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f23633a) {
            Integer num = (Integer) m27038c().get(zh9Var);
            if (num == null) {
                m27038c().put(zh9Var, Integer.valueOf(zh9Var.m59448z()));
            } else {
                if (!(num.intValue() == zh9Var.m59448z())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        this.f23636d.add(zh9Var);
    }

    /* renamed from: b */
    public final boolean m27037b(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        boolean zContains = this.f23636d.contains(zh9Var);
        if (this.f23633a) {
            if (!(zContains == m27038c().containsKey(zh9Var))) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return zContains;
    }

    /* renamed from: c */
    public final Map m27038c() {
        return (Map) this.f23634b.getValue();
    }

    /* renamed from: d */
    public final boolean m27039d() {
        return this.f23636d.isEmpty();
    }

    /* renamed from: e */
    public final zh9 m27040e() {
        zh9 zh9Var = (zh9) this.f23636d.first();
        sq8.m48648g(zh9Var, "node");
        m27041f(zh9Var);
        return zh9Var;
    }

    /* renamed from: f */
    public final boolean m27041f(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        if (!zh9Var.s0()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zRemove = this.f23636d.remove(zh9Var);
        if (this.f23633a) {
            Integer num = (Integer) m27038c().remove(zh9Var);
            if (zRemove) {
                if (!(num != null && num.intValue() == zh9Var.m59448z())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                if (!(num == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        return zRemove;
    }

    public String toString() {
        String string = this.f23636d.toString();
        sq8.m48648g(string, "set.toString()");
        return string;
    }
}
