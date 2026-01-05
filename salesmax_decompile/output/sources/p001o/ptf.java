package p001o;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.kpb;

/* loaded from: classes3.dex */
public final class ptf implements Map, kpb, wb9 {

    /* renamed from: a */
    public final Map f40551a;

    /* renamed from: o.ptf$a */
    public static final class C16188a extends qre implements nl7 {

        /* renamed from: b */
        public Object f40552b;

        /* renamed from: c */
        public Object f40553c;

        /* renamed from: d */
        public Object f40554d;

        /* renamed from: e */
        public int f40555e;

        /* renamed from: f */
        public /* synthetic */ Object f40556f;

        public C16188a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16188a c16188a = ptf.this.new C16188a(n64Var);
            c16188a.f40556f = obj;
            return c16188a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kef kefVar, n64 n64Var) {
            return ((C16188a) create(kefVar, n64Var)).invokeSuspend(y3i.f54824a);
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
            C16188a c16188a;
            Object objM51918f = uq8.m51918f();
            int i = this.f40555e;
            if (i == 0) {
                wre.m54934b(obj);
                kefVar = (kef) this.f40556f;
                it = ptf.this.entrySet().iterator();
                c16188a = this;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Iterator it2 = (Iterator) this.f40554d;
                Object obj2 = this.f40553c;
                Iterator it3 = (Iterator) this.f40552b;
                kef kefVar2 = (kef) this.f40556f;
                wre.m54934b(obj);
                kefVar = kefVar2;
                Object key = obj2;
                Iterator it4 = it3;
                C16188a c16188a2 = this;
                while (it2.hasNext()) {
                    ci6 ci6Var = new ci6(key, it2.next());
                    c16188a2.f40556f = kefVar;
                    c16188a2.f40552b = it4;
                    c16188a2.f40553c = key;
                    c16188a2.f40554d = it2;
                    c16188a2.f40555e = 1;
                    if (kefVar.mo33661f(ci6Var, c16188a2) == objM51918f) {
                        return objM51918f;
                    }
                }
                it = it4;
                c16188a = c16188a2;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    key = entry.getKey();
                    C16188a c16188a3 = c16188a;
                    it4 = it;
                    it2 = ((List) entry.getValue()).iterator();
                    c16188a2 = c16188a3;
                    while (it2.hasNext()) {
                    }
                    it = it4;
                    c16188a = c16188a2;
                    if (it.hasNext()) {
                        return y3i.f54824a;
                    }
                }
            }
        }
    }

    public ptf(Map map) {
        sq8.m48649h(map, "delegate");
        this.f40551a = map;
    }

    @Override // p001o.kpb
    /* renamed from: E */
    public boolean mo20265E(Object obj, Object obj2) {
        return m44154c(obj).add(obj2);
    }

    /* renamed from: a */
    public boolean m44153a(List list) {
        sq8.m48649h(list, "value");
        return this.f40551a.containsValue(list);
    }

    /* renamed from: c */
    public final List m44154c(Object obj) {
        Object arrayList = get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            put((ptf) obj, arrayList);
        }
        return (List) arrayList;
    }

    @Override // java.util.Map
    public void clear() {
        this.f40551a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f40551a.containsKey(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (azh.m18059l(obj)) {
            return m44153a((List) obj);
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) this.f40551a.get(obj);
    }

    /* renamed from: e */
    public Set m44156e() {
        return this.f40551a.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m44156e();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ptf.class != obj.getClass()) {
            return false;
        }
        return sq8.m48644c(this.f40551a, ((ptf) obj).f40551a);
    }

    /* renamed from: f */
    public Set m44157f() {
        return this.f40551a.keySet();
    }

    /* renamed from: g */
    public int m44158g() {
        return this.f40551a.size();
    }

    /* renamed from: h */
    public Collection m44159h() {
        return this.f40551a.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f40551a.hashCode();
    }

    @Override // p001o.kpb
    /* renamed from: i */
    public ief mo20275i() {
        return mef.m38854b(new C16188a(null));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f40551a.isEmpty();
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public List put(Object obj, List list) {
        sq8.m48649h(list, "value");
        return (List) this.f40551a.put(obj, list);
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m44157f();
    }

    @Override // p001o.kpb
    /* renamed from: l */
    public bob mo20277l() {
        return kpb.C14898a.m36040c(this);
    }

    @Override // p001o.kpb
    /* renamed from: m */
    public boolean mo20278m(Object obj, Collection collection) {
        sq8.m48649h(collection, "values");
        return m44154c(obj).addAll(collection);
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public List remove(Object obj) {
        return (List) this.f40551a.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
        this.f40551a.putAll(map);
    }

    @Override // p001o.kpb
    /* renamed from: q */
    public void mo20281q(Map map) {
        kpb.C14898a.m36038a(this, map);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m44158g();
    }

    public String toString() {
        return this.f40551a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m44159h();
    }

    @Override // java.util.Map, p001o.kpb
    public List put(Object obj, Object obj2) {
        return kpb.C14898a.m36039b(this, obj, obj2);
    }
}
