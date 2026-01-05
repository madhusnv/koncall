package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p001o.c5e;
import p001o.e3d;
import p001o.p8i;

/* loaded from: classes3.dex */
public final class c5e implements bob {

    /* renamed from: c */
    public static final C12568b f17362c = new C12568b(null);

    /* renamed from: d */
    public static final c5e f17363d = new C12567a().m20270d();

    /* renamed from: a */
    public final bob f17364a;

    /* renamed from: b */
    public final boolean f17365b;

    /* renamed from: o.c5e$b */
    public static final class C12568b {
        public C12568b() {
        }

        public /* synthetic */ C12568b(id5 id5Var) {
            this();
        }

        /* renamed from: e */
        public static final CharSequence m20297e(xk7 xk7Var, Map.Entry entry) {
            sq8.m48649h(entry, "<destruct>");
            return ((String) xk7Var.invoke((y66) entry.getKey())) + '=' + ((String) xk7Var.invoke((y66) entry.getValue()));
        }

        /* renamed from: c */
        public final String m20298c(ief iefVar, boolean z) {
            return m20299d(iefVar, z, new wrd() { // from class: o.c5e.b.a
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57311c();
                }
            });
        }

        /* renamed from: d */
        public final String m20299d(ief iefVar, boolean z, final xk7 xk7Var) {
            return qef.m45317t(iefVar, "&", (z || qef.m45306i(iefVar)) ? "?" : "", null, 0, null, new xk7() { // from class: o.d5e
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return c5e.C12568b.m20297e(xk7Var, (Map.Entry) obj);
                }
            }, 28, null);
        }
    }

    public /* synthetic */ c5e(bob bobVar, boolean z, id5 id5Var) {
        this(bobVar, z);
    }

    /* renamed from: a */
    public boolean m20251a(y66 y66Var) {
        sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
        return this.f17364a.containsKey(y66Var);
    }

    /* renamed from: c */
    public boolean m20252c(List list) {
        sq8.m48649h(list, "value");
        return this.f17364a.containsValue(list);
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
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof y66) {
            return m20251a((y66) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof List) {
            return m20252c((List) obj);
        }
        return false;
    }

    /* renamed from: d */
    public List m20253d(y66 y66Var) {
        sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
        return (List) this.f17364a.get(y66Var);
    }

    /* renamed from: e */
    public Set m20254e() {
        return this.f17364a.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m20254e();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c5e.class != obj.getClass()) {
            return false;
        }
        c5e c5eVar = (c5e) obj;
        return sq8.m48644c(this.f17364a, c5eVar.f17364a) && this.f17365b == c5eVar.f17365b;
    }

    /* renamed from: f */
    public final boolean m20255f() {
        return this.f17365b;
    }

    /* renamed from: g */
    public Set m20256g() {
        return this.f17364a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof y66) {
            return m20253d((y66) obj);
        }
        return null;
    }

    /* renamed from: h */
    public int m20257h() {
        return this.f17364a.size();
    }

    @Override // java.util.Map
    public int hashCode() {
        return (this.f17364a.hashCode() * 31) + Boolean.hashCode(this.f17365b);
    }

    @Override // p001o.bob
    /* renamed from: i */
    public ief mo19497i() {
        return this.f17364a.mo19497i();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f17364a.isEmpty();
    }

    /* renamed from: k */
    public Collection m20258k() {
        return this.f17364a.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m20256g();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public List remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: o */
    public final C12567a m20260o() {
        return new C12567a(this.f17364a.mo19498z(), this.f17365b);
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
        return m20257h();
    }

    public String toString() {
        return f17362c.m20298c(this.f17364a.mo19497i(), this.f17365b);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m20258k();
    }

    @Override // p001o.bob
    /* renamed from: z */
    public kpb mo19498z() {
        return this.f17364a.mo19498z();
    }

    public c5e(bob bobVar, boolean z) {
        this.f17364a = bobVar;
        this.f17365b = z;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: o.c5e$a */
    public static final class C12567a implements kpb {

        /* renamed from: a */
        public final kpb f17366a;

        /* renamed from: b */
        public boolean f17367b;

        /* renamed from: c */
        public final kpb f17368c;

        /* renamed from: d */
        public final kpb f17369d;

        /* renamed from: o.c5e$a$b */
        public /* synthetic */ class b extends dm7 implements xk7 {
            public b(Object obj) {
                super(1, obj, m76.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24242b(str);
            }
        }

        /* renamed from: o.c5e$a$d */
        public /* synthetic */ class d extends dm7 implements xk7 {
            public d(Object obj) {
                super(1, obj, m76.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24242b(str);
            }
        }

        /* renamed from: o.c5e$a$f */
        public /* synthetic */ class f extends dm7 implements xk7 {
            public f(Object obj) {
                super(1, obj, m76.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24242b(str);
            }
        }

        /* renamed from: o.c5e$a$h */
        public /* synthetic */ class h extends dm7 implements xk7 {
            public h(Object obj) {
                super(1, obj, m76.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24242b(str);
            }
        }

        /* renamed from: o.c5e$a$j */
        public /* synthetic */ class j extends dm7 implements xk7 {
            public j(Object obj) {
                super(1, obj, m76.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24243c(str);
            }
        }

        /* renamed from: o.c5e$a$l */
        public /* synthetic */ class l extends dm7 implements xk7 {
            public l(Object obj) {
                super(1, obj, m76.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24243c(str);
            }
        }

        public C12567a(kpb kpbVar, boolean z) {
            sq8.m48649h(kpbVar, "delegate");
            this.f17366a = kpbVar;
            this.f17367b = z;
            a aVar = new wrd() { // from class: o.c5e.a.a
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57310b();
                }
            };
            e3d.C13097a c13097a = e3d.f20909h;
            this.f17368c = d74.m22403g(this, aVar, new b(c13097a.m24250g()), new wrd() { // from class: o.c5e.a.c
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57310b();
                }
            }, new d(c13097a.m24250g()));
            this.f17369d = d74.m22403g(this, new wrd() { // from class: o.c5e.a.i
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57311c();
                }
            }, new j(c13097a.m24250g()), new wrd() { // from class: o.c5e.a.k
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57311c();
                }
            }, new l(c13097a.m24250g()));
        }

        /* renamed from: A */
        public final void m20261A(String str) {
            sq8.m48649h(str, "encoded");
            m20262B(this.f17369d, str);
        }

        /* renamed from: B */
        public final void m20262B(kpb kpbVar, String str) {
            String str2;
            clear();
            this.f17367b = sq8.m48644c(str, "?");
            String strU0 = f9g.u0(str, "?");
            if (strU0.length() > 0) {
                List<String> listD0 = f9g.D0(strU0, new String[]{"&"}, false, 0, 6, null);
                ArrayList<hwc> arrayList = new ArrayList(dh3.m23088v(listD0, 10));
                for (String str3 : listD0) {
                    List listD02 = f9g.D0(str3, new String[]{"="}, false, 0, 6, null);
                    String str4 = (String) listD02.get(0);
                    int size = listD02.size();
                    if (size == 1) {
                        str2 = "";
                    } else {
                        if (size != 2) {
                            throw new IllegalArgumentException("invalid query string segment " + str3);
                        }
                        str2 = (String) listD02.get(1);
                    }
                    arrayList.add(vyh.m53620a(str4, str2));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (hwc hwcVar : arrayList) {
                    String str5 = (String) hwcVar.m31229c();
                    Object arrayList2 = linkedHashMap.get(str5);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(str5, arrayList2);
                    }
                    ((List) arrayList2).add((String) hwcVar.m31230d());
                }
                kpbVar.mo20281q(linkedHashMap);
            }
        }

        @Override // java.util.Map
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public List put(y66 y66Var, List list) {
            sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
            sq8.m48649h(list, "value");
            return (List) this.f17366a.put((kpb) y66Var, (y66) list);
        }

        @Override // p001o.kpb, java.util.Map
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public List put(y66 y66Var, y66 y66Var2) {
            sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
            sq8.m48649h(y66Var2, "value");
            return this.f17366a.put((Object) y66Var, (Object) y66Var2);
        }

        /* renamed from: F */
        public List m20266F(y66 y66Var) {
            sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
            return (List) this.f17366a.remove(y66Var);
        }

        /* renamed from: G */
        public final void m20267G(String str) {
            sq8.m48649h(str, "value");
            m20261A(str);
        }

        @Override // p001o.kpb
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo20265E(y66 y66Var, y66 y66Var2) {
            sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
            sq8.m48649h(y66Var2, "value");
            return this.f17366a.mo20265E(y66Var, y66Var2);
        }

        @Override // p001o.kpb
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean mo20278m(y66 y66Var, Collection collection) {
            sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
            sq8.m48649h(collection, "values");
            return this.f17366a.mo20278m(y66Var, collection);
        }

        @Override // java.util.Map
        public void clear() {
            this.f17366a.clear();
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof y66) {
                return m20271e((y66) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (azh.m18059l(obj)) {
                return m20272f((List) obj);
            }
            return false;
        }

        /* renamed from: d */
        public final c5e m20270d() {
            return new c5e(this.f17366a.mo20277l(), this.f17367b, null);
        }

        /* renamed from: e */
        public boolean m20271e(y66 y66Var) {
            sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
            return this.f17366a.containsKey(y66Var);
        }

        @Override // java.util.Map
        public final /* bridge */ Set entrySet() {
            return m20283s();
        }

        /* renamed from: f */
        public boolean m20272f(List list) {
            sq8.m48649h(list, "value");
            return this.f17366a.containsValue(list);
        }

        /* renamed from: g */
        public final void m20273g(C12567a c12567a) {
            sq8.m48649h(c12567a, "other");
            clear();
            for (Map.Entry entry : c12567a.entrySet()) {
                put((C12567a) entry.getKey(), (Object) kh3.T0((List) entry.getValue()));
            }
            this.f17367b = c12567a.f17367b;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof y66) {
                return m20279n((y66) obj);
            }
            return null;
        }

        /* renamed from: h */
        public final void m20274h(c5e c5eVar) {
            sq8.m48649h(c5eVar, "other");
            clear();
            for (Map.Entry entry : c5eVar.entrySet()) {
                put((C12567a) entry.getKey(), (Object) kh3.T0((List) entry.getValue()));
            }
            this.f17367b = c5eVar.m20255f();
        }

        @Override // p001o.kpb
        /* renamed from: i */
        public ief mo20275i() {
            return this.f17366a.mo20275i();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f17366a.isEmpty();
        }

        /* renamed from: k */
        public final void m20276k(m76 m76Var, xk7 xk7Var) {
            sq8.m48649h(m76Var, "encoding");
            sq8.m48649h(xk7Var, "block");
            xk7Var.invoke(sq8.m48644c(m76Var, e3d.f20909h.m24250g()) ? this.f17368c : d74.m22403g(this, new wrd() { // from class: o.c5e.a.e
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57310b();
                }
            }, new f(m76Var), new wrd() { // from class: o.c5e.a.g
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57310b();
                }
            }, new h(m76Var)));
        }

        @Override // java.util.Map
        public final /* bridge */ Set keySet() {
            return m20284t();
        }

        @Override // p001o.kpb
        /* renamed from: l */
        public bob mo20277l() {
            return this.f17366a.mo20277l();
        }

        /* renamed from: n */
        public List m20279n(y66 y66Var) {
            sq8.m48649h(y66Var, TransferTable.COLUMN_KEY);
            return (List) this.f17366a.get(y66Var);
        }

        /* renamed from: o */
        public final kpb m20280o() {
            return this.f17368c;
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
            this.f17366a.putAll(map);
        }

        @Override // p001o.kpb
        /* renamed from: q */
        public void mo20281q(Map map) {
            sq8.m48649h(map, "other");
            this.f17366a.mo20281q(map);
        }

        /* renamed from: r */
        public final String m20282r() {
            return c5e.f17362c.m20298c(this.f17366a.mo20275i(), this.f17367b);
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof y66) {
                return m20266F((y66) obj);
            }
            return null;
        }

        /* renamed from: s */
        public Set m20283s() {
            return this.f17366a.entrySet();
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return m20285u();
        }

        /* renamed from: t */
        public Set m20284t() {
            return this.f17366a.keySet();
        }

        /* renamed from: u */
        public int m20285u() {
            return this.f17366a.size();
        }

        /* renamed from: v */
        public Collection m20286v() {
            return this.f17366a.values();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection values() {
            return m20286v();
        }

        /* renamed from: w */
        public final void m20287w(String str, p8i p8iVar) {
            sq8.m48649h(str, "value");
            sq8.m48649h(p8iVar, "encoding");
            if (p8iVar.m43191b(p8i.C16029e.f39612e)) {
                m20261A(str);
            } else {
                m20288y(str);
            }
        }

        /* renamed from: y */
        public final void m20288y(String str) {
            sq8.m48649h(str, "decoded");
            m20262B(this.f17368c, str);
        }

        public /* synthetic */ C12567a(kpb kpbVar, boolean z, int i2, id5 id5Var) {
            this(kpbVar, (i2 & 2) != 0 ? false : z);
        }

        public C12567a() {
            this(lpb.m37590a(new hwc[0]), false, 2, null);
        }
    }
}
