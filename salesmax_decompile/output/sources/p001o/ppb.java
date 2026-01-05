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
public final class ppb implements kpb {

    /* renamed from: a */
    public final kpb f40380a;

    /* renamed from: b */
    public final xk7 f40381b;

    /* renamed from: c */
    public final xk7 f40382c;

    /* renamed from: d */
    public final xk7 f40383d;

    /* renamed from: e */
    public final xk7 f40384e;

    /* renamed from: f */
    public final xk7 f40385f;

    /* renamed from: g */
    public final xk7 f40386g;

    /* renamed from: o.ppb$a */
    public /* synthetic */ class C16155a extends dm7 implements xk7 {
        public C16155a(Object obj) {
            super(1, obj, ppb.class, "fwdEntryView", "fwdEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final zob invoke(Map.Entry entry) {
            sq8.m48649h(entry, "p0");
            return ((ppb) this.receiver).m44019n(entry);
        }
    }

    /* renamed from: o.ppb$b */
    public /* synthetic */ class C16156b extends dm7 implements xk7 {
        public C16156b(Object obj) {
            super(1, obj, ppb.class, "revEntryView", "revEntryView(Ljava/util/Map$Entry;)Laws/smithy/kotlin/runtime/collections/views/MutableEntryView;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final zob invoke(Map.Entry entry) {
            sq8.m48649h(entry, "p0");
            return ((ppb) this.receiver).m44027y(entry);
        }
    }

    public ppb(kpb kpbVar, xk7 xk7Var, xk7 xk7Var2, xk7 xk7Var3, xk7 xk7Var4) {
        sq8.m48649h(kpbVar, "src");
        sq8.m48649h(xk7Var, "kSrc2Dest");
        sq8.m48649h(xk7Var2, "kDest2Src");
        sq8.m48649h(xk7Var3, "vSrc2Dest");
        sq8.m48649h(xk7Var4, "vDest2Src");
        this.f40380a = kpbVar;
        this.f40381b = xk7Var;
        this.f40382c = xk7Var2;
        this.f40383d = xk7Var3;
        this.f40384e = xk7Var4;
        this.f40385f = new xk7() { // from class: o.mpb
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return ppb.m44010B(this.f35848a, (List) obj);
            }
        };
        this.f40386g = new xk7() { // from class: o.npb
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return ppb.m44009A(this.f37138a, (List) obj);
            }
        };
    }

    /* renamed from: A */
    public static final List m44009A(ppb ppbVar, List list) {
        sq8.m48649h(list, "it");
        ArrayList arrayList = new ArrayList();
        xk7 xk7Var = ppbVar.f40384e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(xk7Var.invoke(it.next()));
        }
        return arrayList;
    }

    /* renamed from: B */
    public static final gpb m44010B(ppb ppbVar, List list) {
        sq8.m48649h(list, "it");
        return d74.m22402f(list, ppbVar.f40383d, ppbVar.f40384e);
    }

    /* renamed from: e */
    public static final ci6 m44014e(ppb ppbVar, Map.Entry entry) {
        sq8.m48649h(entry, "<destruct>");
        return new ci6(ppbVar.f40381b.invoke(entry.getKey()), ppbVar.f40383d.invoke(entry.getValue()));
    }

    @Override // p001o.kpb
    /* renamed from: E */
    public boolean mo20265E(Object obj, Object obj2) {
        return m44018k(obj).add(obj2);
    }

    @Override // java.util.Map
    public void clear() {
        this.f40380a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f40380a.containsKey(this.f40382c.invoke(obj));
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (azh.m18059l(obj)) {
            return m44017h((List) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m44021r();
    }

    /* renamed from: h */
    public boolean m44017h(List list) {
        sq8.m48649h(list, "value");
        return this.f40380a.containsValue(this.f40386g.invoke(list));
    }

    @Override // p001o.kpb
    /* renamed from: i */
    public ief mo20275i() {
        return qef.m45319v(this.f40380a.mo20275i(), new xk7() { // from class: o.opb
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return ppb.m44014e(this.f38702a, (Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f40380a.isEmpty();
    }

    /* renamed from: k */
    public final List m44018k(Object obj) {
        List list = (List) get(obj);
        if (list != null) {
            return list;
        }
        this.f40380a.put((kpb) this.f40382c.invoke(obj), (Object) new ArrayList());
        return (List) isa.m32682i(this, obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m44022s();
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
        return m44018k(obj).addAll(collection);
    }

    /* renamed from: n */
    public final zob m44019n(Map.Entry entry) {
        return new zob(entry, this.f40381b, this.f40385f, this.f40386g);
    }

    @Override // java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        List list = (List) this.f40380a.get(this.f40382c.invoke(obj));
        if (list != null) {
            return (List) this.f40385f.invoke(list);
        }
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
        for (Map.Entry entry : map.entrySet()) {
            this.f40380a.put((kpb) this.f40382c.invoke(entry.getKey()), this.f40386g.invoke((List) entry.getValue()));
        }
    }

    @Override // p001o.kpb
    /* renamed from: q */
    public void mo20281q(Map map) {
        kpb.C14898a.m36038a(this, map);
    }

    /* renamed from: r */
    public Set m44021r() {
        return d74.m22404h(this.f40380a.entrySet(), new C16155a(this), new C16156b(this));
    }

    /* renamed from: s */
    public Set m44022s() {
        return d74.m22404h(this.f40380a.keySet(), this.f40381b, this.f40382c);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m44023t();
    }

    /* renamed from: t */
    public int m44023t() {
        return this.f40380a.size();
    }

    /* renamed from: u */
    public Collection m44024u() {
        return d74.m22399c(this.f40380a.values(), this.f40385f, this.f40386g);
    }

    @Override // java.util.Map
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List put(Object obj, List list) {
        sq8.m48649h(list, "value");
        List list2 = (List) this.f40380a.put((kpb) this.f40382c.invoke(obj), this.f40386g.invoke(list));
        if (list2 != null) {
            return (List) this.f40385f.invoke(list2);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m44024u();
    }

    @Override // java.util.Map
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public List remove(Object obj) {
        List list = (List) this.f40380a.remove(this.f40382c.invoke(obj));
        if (list != null) {
            return (List) this.f40385f.invoke(list);
        }
        return null;
    }

    /* renamed from: y */
    public final zob m44027y(Map.Entry entry) {
        return new zob(entry, this.f40382c, this.f40386g, this.f40385f);
    }

    @Override // p001o.kpb, java.util.Map
    public List put(Object obj, Object obj2) {
        return kpb.C14898a.m36039b(this, obj, obj2);
    }
}
