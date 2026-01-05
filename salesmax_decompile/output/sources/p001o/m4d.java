package p001o;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class m4d implements Serializable {

    /* renamed from: b */
    public static final C15221a f34780b = new C15221a(null);

    /* renamed from: a */
    public final HashMap f34781a;

    /* renamed from: o.m4d$a */
    public static final class C15221a {
        public C15221a() {
        }

        public /* synthetic */ C15221a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.m4d$b */
    public static final class C15222b implements Serializable {

        /* renamed from: b */
        public static final a f34782b = new a(null);

        /* renamed from: a */
        public final HashMap f34783a;

        /* renamed from: o.m4d$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C15222b(HashMap map) {
            sq8.m48649h(map, "proxyEvents");
            this.f34783a = map;
        }

        private final Object readResolve() {
            return new m4d(this.f34783a);
        }
    }

    public m4d() {
        this.f34781a = new HashMap();
    }

    private final Object writeReplace() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return new C15222b(this.f34781a);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: a */
    public final void m38352a(ua uaVar, List list) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(uaVar, "accessTokenAppIdPair");
            sq8.m48649h(list, "appEvents");
            if (!this.f34781a.containsKey(uaVar)) {
                this.f34781a.put(uaVar, kh3.T0(list));
                return;
            }
            List list2 = (List) this.f34781a.get(uaVar);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: b */
    public final Set m38353b() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            Set setEntrySet = this.f34781a.entrySet();
            sq8.m48648g(setEntrySet, "events.entries");
            return setEntrySet;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public m4d(HashMap map) {
        sq8.m48649h(map, "appEventMap");
        HashMap map2 = new HashMap();
        this.f34781a = map2;
        map2.putAll(map);
    }
}
