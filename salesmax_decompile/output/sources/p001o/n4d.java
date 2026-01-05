package p001o;

import p001o.o4d;

/* loaded from: classes2.dex */
public final class n4d extends r4d implements o4d {

    /* renamed from: f */
    public static final C15491b f36363f = new C15491b(null);

    /* renamed from: g */
    public static final n4d f36364g;

    /* renamed from: o.n4d$a */
    public static final class C15490a extends t4d implements o4d.InterfaceC15711a {

        /* renamed from: g */
        public n4d f36365g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15490a(n4d n4dVar) {
            super(n4dVar);
            sq8.m48649h(n4dVar, "map");
            this.f36365g = n4dVar;
        }

        @Override // p001o.t4d, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof ip3) {
                return m40068o((ip3) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof p4g) {
                return m40069r((p4g) obj);
            }
            return false;
        }

        @Override // p001o.t4d, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof ip3) {
                return m40070s((ip3) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof ip3) ? obj2 : m40071t((ip3) obj, (p4g) obj2);
        }

        @Override // p001o.t4d, p001o.h5d.InterfaceC13853a
        /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public n4d build() {
            n4d n4dVar;
            if (m49286d() == this.f36365g.m46210t()) {
                n4dVar = this.f36365g;
            } else {
                m49290h(new sob());
                n4dVar = new n4d(m49286d(), size());
            }
            this.f36365g = n4dVar;
            return n4dVar;
        }

        /* renamed from: o */
        public /* bridge */ boolean m40068o(ip3 ip3Var) {
            return super.containsKey(ip3Var);
        }

        /* renamed from: r */
        public /* bridge */ boolean m40069r(p4g p4gVar) {
            return super.containsValue(p4gVar);
        }

        @Override // p001o.t4d, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof ip3) {
                return m40072u((ip3) obj);
            }
            return null;
        }

        /* renamed from: s */
        public /* bridge */ p4g m40070s(ip3 ip3Var) {
            return (p4g) super.get(ip3Var);
        }

        /* renamed from: t */
        public /* bridge */ p4g m40071t(ip3 ip3Var, p4g p4gVar) {
            return (p4g) super.getOrDefault(ip3Var, p4gVar);
        }

        /* renamed from: u */
        public /* bridge */ p4g m40072u(ip3 ip3Var) {
            return (p4g) super.remove(ip3Var);
        }
    }

    /* renamed from: o.n4d$b */
    public static final class C15491b {
        public C15491b() {
        }

        public /* synthetic */ C15491b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final n4d m40073a() {
            return n4d.f36364g;
        }
    }

    static {
        mxh mxhVarM39811a = mxh.f36081e.m39811a();
        sq8.m48647f(mxhVarM39811a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        f36364g = new n4d(mxhVarM39811a, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4d(mxh mxhVar, int i) {
        super(mxhVar, i);
        sq8.m48649h(mxhVar, "node");
    }

    @Override // p001o.r4d
    /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C15490a mo40065o() {
        return new C15490a(this);
    }

    /* renamed from: B */
    public /* bridge */ boolean m40061B(ip3 ip3Var) {
        return super.containsKey(ip3Var);
    }

    /* renamed from: C */
    public /* bridge */ boolean m40062C(p4g p4gVar) {
        return super.containsValue(p4gVar);
    }

    /* renamed from: D */
    public /* bridge */ p4g m40063D(ip3 ip3Var) {
        return (p4g) super.get(ip3Var);
    }

    /* renamed from: F */
    public /* bridge */ p4g m40064F(ip3 ip3Var, p4g p4gVar) {
        return (p4g) super.getOrDefault(ip3Var, p4gVar);
    }

    @Override // p001o.r4d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ip3) {
            return m40061B((ip3) obj);
        }
        return false;
    }

    @Override // p001o.k8, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof p4g) {
            return m40062C((p4g) obj);
        }
        return false;
    }

    @Override // p001o.r4d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof ip3) {
            return m40063D((ip3) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ip3) ? obj2 : m40064F((ip3) obj, (p4g) obj2);
    }
}
