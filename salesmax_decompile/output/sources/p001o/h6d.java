package p001o;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class h6d extends o9 implements j6d {

    /* renamed from: e */
    public static final C13864a f26251e = new C13864a(null);

    /* renamed from: f */
    public static final h6d f26252f;

    /* renamed from: b */
    public final Object f26253b;

    /* renamed from: c */
    public final Object f26254c;

    /* renamed from: d */
    public final r4d f26255d;

    /* renamed from: o.h6d$a */
    public static final class C13864a {
        public C13864a() {
        }

        public /* synthetic */ C13864a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final j6d m29840a() {
            return h6d.f26252f;
        }
    }

    static {
        x76 x76Var = x76.f53298a;
        f26252f = new h6d(x76Var, x76Var, r4d.f42977d.m46214a());
    }

    public h6d(Object obj, Object obj2, r4d r4dVar) {
        sq8.m48649h(r4dVar, "hashMap");
        this.f26253b = obj;
        this.f26254c = obj2;
        this.f26255d = r4dVar;
    }

    @Override // java.util.Collection, java.util.Set, p001o.j6d
    public j6d add(Object obj) {
        if (this.f26255d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new h6d(obj, obj, this.f26255d.m46212v(obj, new cea()));
        }
        Object obj2 = this.f26254c;
        Object obj3 = this.f26255d.get(obj2);
        sq8.m48646e(obj3);
        return new h6d(this.f26253b, obj, this.f26255d.m46212v(obj2, ((cea) obj3).m21070e(obj)).m46212v(obj, new cea(obj2)));
    }

    @Override // p001o.b7, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f26255d.containsKey(obj);
    }

    @Override // p001o.b7
    /* renamed from: d */
    public int mo18169d() {
        return this.f26255d.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new i6d(this.f26253b, this.f26255d);
    }

    @Override // java.util.Collection, java.util.Set, p001o.j6d
    public j6d remove(Object obj) {
        cea ceaVar = (cea) this.f26255d.get(obj);
        if (ceaVar == null) {
            return this;
        }
        r4d r4dVarM46213w = this.f26255d.m46213w(obj);
        if (ceaVar.m21067b()) {
            Object obj2 = r4dVarM46213w.get(ceaVar.m21069d());
            sq8.m48646e(obj2);
            r4dVarM46213w = r4dVarM46213w.m46212v(ceaVar.m21069d(), ((cea) obj2).m21070e(ceaVar.m21068c()));
        }
        if (ceaVar.m21066a()) {
            Object obj3 = r4dVarM46213w.get(ceaVar.m21068c());
            sq8.m48646e(obj3);
            r4dVarM46213w = r4dVarM46213w.m46212v(ceaVar.m21068c(), ((cea) obj3).m21071f(ceaVar.m21069d()));
        }
        return new h6d(!ceaVar.m21067b() ? ceaVar.m21068c() : this.f26253b, !ceaVar.m21066a() ? ceaVar.m21069d() : this.f26254c, r4dVarM46213w);
    }
}
