package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p001o.e3d;
import p001o.p8i;

/* loaded from: classes3.dex */
public final class s8i {

    /* renamed from: c */
    public static final C16784b f44985c = new C16784b(null);

    /* renamed from: d */
    public static final s8i f44986d = new C16783a().m48004a();

    /* renamed from: a */
    public final List f44987a;

    /* renamed from: b */
    public final boolean f44988b;

    /* renamed from: o.s8i$b */
    public static final class C16784b {
        public C16784b() {
        }

        public /* synthetic */ C16784b(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final String m48023b(List list, boolean z) {
            return m48024c(list, z, new wrd() { // from class: o.s8i.b.a
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57311c();
                }
            });
        }

        /* renamed from: c */
        public final String m48024c(List list, boolean z, xk7 xk7Var) {
            return kh3.p0(list, "/", list.isEmpty() ? "" : "/", z ? "/" : "", 0, null, xk7Var, 24, null);
        }
    }

    public /* synthetic */ s8i(List list, boolean z, id5 id5Var) {
        this(list, z);
    }

    /* renamed from: a */
    public final String m48000a() {
        return f44985c.m48023b(this.f44987a, this.f44988b);
    }

    /* renamed from: b */
    public final List m48001b() {
        return this.f44987a;
    }

    /* renamed from: c */
    public final boolean m48002c() {
        return this.f44988b;
    }

    /* renamed from: d */
    public final C16783a m48003d() {
        return new C16783a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s8i.class != obj.getClass()) {
            return false;
        }
        s8i s8iVar = (s8i) obj;
        return sq8.m48644c(this.f44987a, s8iVar.f44987a) && this.f44988b == s8iVar.f44988b;
    }

    public int hashCode() {
        return (this.f44987a.hashCode() * 31) + Boolean.hashCode(this.f44988b);
    }

    public String toString() {
        return m48000a();
    }

    public s8i(List list, boolean z) {
        this.f44987a = list;
        this.f44988b = z;
    }

    /* renamed from: o.s8i$a */
    public static final class C16783a {

        /* renamed from: a */
        public final List f44989a;

        /* renamed from: b */
        public final List f44990b;

        /* renamed from: c */
        public final List f44991c;

        /* renamed from: d */
        public boolean f44992d;

        /* renamed from: o.s8i$a$b */
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

        /* renamed from: o.s8i$a$d */
        public /* synthetic */ class d extends dm7 implements xk7 {
            public d(Object obj) {
                super(1, obj, m76.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24243c(str);
            }
        }

        /* renamed from: o.s8i$a$e */
        public /* synthetic */ class e extends dm7 implements xk7 {
            public e(Object obj) {
                super(1, obj, m76.class, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24242b(str);
            }
        }

        /* renamed from: o.s8i$a$f */
        public /* synthetic */ class f extends dm7 implements xk7 {
            public f(Object obj) {
                super(1, obj, m76.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
            }

            @Override // p001o.xk7
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final y66 invoke(String str) {
                sq8.m48649h(str, "p0");
                return ((m76) this.receiver).mo24243c(str);
            }
        }

        public C16783a(s8i s8iVar) {
            List listM48001b;
            List arrayList = (s8iVar == null || (listM48001b = s8iVar.m48001b()) == null || (arrayList = kh3.T0(listM48001b)) == null) ? new ArrayList() : arrayList;
            this.f44989a = arrayList;
            a aVar = new wrd() { // from class: o.s8i.a.a
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57310b();
                }
            };
            e3d.C13097a c13097a = e3d.f20909h;
            this.f44990b = d74.m22402f(arrayList, aVar, new b(c13097a.m24249f()));
            this.f44991c = d74.m22402f(arrayList, new wrd() { // from class: o.s8i.a.c
                @Override // p001o.cc9
                public Object get(Object obj) {
                    return ((y66) obj).m57311c();
                }
            }, new d(c13097a.m24249f()));
            this.f44992d = s8iVar != null ? s8iVar.m48002c() : false;
        }

        /* renamed from: a */
        public final s8i m48004a() {
            return new s8i(kh3.Q0(this.f44989a), this.f44992d, null);
        }

        /* renamed from: b */
        public final void m48005b(C16783a c16783a) {
            sq8.m48649h(c16783a, "other");
            this.f44989a.clear();
            this.f44989a.addAll(c16783a.f44989a);
            this.f44992d = c16783a.f44992d;
        }

        /* renamed from: c */
        public final void m48006c(s8i s8iVar) {
            sq8.m48649h(s8iVar, "other");
            this.f44989a.clear();
            this.f44989a.addAll(s8iVar.m48001b());
            this.f44992d = s8iVar.m48002c();
        }

        /* renamed from: d */
        public final void m48007d(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            xk7Var.invoke(this.f44991c);
        }

        /* renamed from: e */
        public final String m48008e() {
            return s8i.f44985c.m48023b(this.f44989a, this.f44992d);
        }

        /* renamed from: f */
        public final List m48009f() {
            return this.f44989a;
        }

        /* renamed from: g */
        public final boolean m48010g() {
            return this.f44992d;
        }

        /* renamed from: h */
        public final void m48011h() {
            ListIterator listIterator = this.f44989a.listIterator();
            while (listIterator.hasNext()) {
                String strM57310b = ((y66) listIterator.next()).m57310b();
                int iHashCode = strM57310b.hashCode();
                if (iHashCode != 0) {
                    if (iHashCode != 46) {
                        if (iHashCode == 1472 && strM57310b.equals("..")) {
                            listIterator.remove();
                            if (!listIterator.hasPrevious()) {
                                throw new IllegalStateException("Cannot normalize because \"..\" has no parent".toString());
                            }
                            listIterator.previous();
                            listIterator.remove();
                        }
                    } else if (strM57310b.equals(".")) {
                        listIterator.remove();
                    }
                } else if (strM57310b.equals("")) {
                    listIterator.remove();
                }
            }
            if (this.f44989a.isEmpty()) {
                this.f44992d = true;
            }
        }

        /* renamed from: i */
        public final void m48012i(String str, xk7 xk7Var) {
            this.f44989a.clear();
            if (sq8.m48644c(str, "")) {
                this.f44992d = false;
                return;
            }
            if (sq8.m48644c(str, "/")) {
                this.f44992d = true;
                return;
            }
            String strU0 = f9g.u0(str, "/");
            boolean zM26309S = f9g.m26309S(strU0, '/', false, 2, null);
            this.f44992d = zM26309S;
            if (zM26309S) {
                strU0 = f9g.v0(strU0, "/");
            }
            List listC0 = f9g.C0(strU0, new char[]{'/'}, false, 0, 6, null);
            List list = this.f44989a;
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                list.add(xk7Var.invoke(it.next()));
            }
        }

        /* renamed from: j */
        public final void m48013j(String str, p8i p8iVar) {
            sq8.m48649h(str, "text");
            sq8.m48649h(p8iVar, "encoding");
            if (p8iVar.m43191b(p8i.C16028d.f39611e)) {
                m48015l(str);
            } else {
                m48014k(str);
            }
        }

        /* renamed from: k */
        public final void m48014k(String str) {
            sq8.m48649h(str, "decoded");
            m48012i(str, new e(e3d.f20909h.m24249f()));
        }

        /* renamed from: l */
        public final void m48015l(String str) {
            sq8.m48649h(str, "encoded");
            m48012i(str, new f(e3d.f20909h.m24249f()));
        }

        /* renamed from: m */
        public final void m48016m(String str) {
            sq8.m48649h(str, "value");
            m48015l(str);
        }

        /* renamed from: n */
        public final void m48017n(boolean z) {
            this.f44992d = z;
        }

        public C16783a() {
            this(null);
        }
    }
}
