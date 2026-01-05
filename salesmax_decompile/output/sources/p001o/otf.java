package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p001o.bob;

/* loaded from: classes3.dex */
public final class otf implements bob, Map, sb9 {

    /* renamed from: a */
    public final Map f38895a;

    /* renamed from: o.otf$a */
    public static final class C15893a extends qre implements nl7 {

        /* renamed from: b */
        public Object f38896b;

        /* renamed from: c */
        public Object f38897c;

        /* renamed from: d */
        public Object f38898d;

        /* renamed from: e */
        public int f38899e;

        /* renamed from: f */
        public /* synthetic */ Object f38900f;

        public C15893a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C15893a c15893a = otf.this.new C15893a(n64Var);
            c15893a.f38900f = obj;
            return c15893a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kef kefVar, n64 n64Var) {
            return ((C15893a) create(kefVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:12:0x005b). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kef kefVar;
            Iterator it;
            C15893a c15893a;
            Object objM51918f = uq8.m51918f();
            int i = this.f38899e;
            if (i == 0) {
                wre.m54934b(obj);
                kefVar = (kef) this.f38900f;
                it = otf.this.entrySet().iterator();
                c15893a = this;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it2 = (Iterator) this.f38898d;
                Object obj2 = this.f38897c;
                Iterator it3 = (Iterator) this.f38896b;
                kef kefVar2 = (kef) this.f38900f;
                wre.m54934b(obj);
                kefVar = kefVar2;
                Object key = obj2;
                Iterator it4 = it3;
                C15893a c15893a2 = this;
                while (it2.hasNext()) {
                    ci6 ci6Var = new ci6(key, it2.next());
                    c15893a2.f38900f = kefVar;
                    c15893a2.f38896b = it4;
                    c15893a2.f38897c = key;
                    c15893a2.f38898d = it2;
                    c15893a2.f38899e = 1;
                    if (kefVar.mo33661f(ci6Var, c15893a2) == objM51918f) {
                        return objM51918f;
                    }
                }
                it = it4;
                c15893a = c15893a2;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    key = entry.getKey();
                    C15893a c15893a3 = c15893a;
                    it4 = it;
                    it2 = ((List) entry.getValue()).iterator();
                    c15893a2 = c15893a3;
                    while (it2.hasNext()) {
                    }
                    it = it4;
                    c15893a = c15893a2;
                    if (it.hasNext()) {
                        return y3i.f54824a;
                    }
                }
            }
        }
    }

    public otf(Map map) {
        sq8.m48649h(map, "delegate");
        this.f38895a = map;
    }

    /* renamed from: a */
    public boolean m42674a(List list) {
        sq8.m48649h(list, "value");
        return this.f38895a.containsValue(list);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) this.f38895a.get(obj);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f38895a.containsKey(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof List) {
            return m42674a((List) obj);
        }
        return false;
    }

    /* renamed from: d */
    public Set m42676d() {
        return this.f38895a.entrySet();
    }

    /* renamed from: e */
    public Set m42677e() {
        return this.f38895a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m42676d();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || otf.class != obj.getClass()) {
            return false;
        }
        return sq8.m48644c(this.f38895a, ((otf) obj).f38895a);
    }

    /* renamed from: f */
    public int m42678f() {
        return this.f38895a.size();
    }

    /* renamed from: g */
    public Collection m42679g() {
        return this.f38895a.values();
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f38895a.hashCode();
    }

    @Override // p001o.bob
    /* renamed from: i */
    public ief mo19497i() {
        return mef.m38854b(new C15893a(null));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f38895a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m42677e();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m42678f();
    }

    public String toString() {
        return this.f38895a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m42679g();
    }

    @Override // p001o.bob
    /* renamed from: z */
    public kpb mo19498z() {
        return bob.C12466a.m19499a(this);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
