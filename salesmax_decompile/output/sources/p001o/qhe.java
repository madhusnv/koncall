package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class qhe {

    /* renamed from: c */
    public static final C16409b f42012c = new C16409b(null);

    /* renamed from: a */
    public final List f42013a;

    /* renamed from: b */
    public final the f42014b;

    /* renamed from: o.qhe$a */
    public static final class C16408a {

        /* renamed from: a */
        public List f42015a;

        /* renamed from: b */
        public the f42016b;

        /* renamed from: a */
        public final qhe m45498a() {
            return new qhe(this, null);
        }

        /* renamed from: b */
        public final C16408a m45499b() {
            return this;
        }

        /* renamed from: c */
        public final List m45500c() {
            return this.f42015a;
        }

        /* renamed from: d */
        public final the m45501d() {
            return this.f42016b;
        }

        /* renamed from: e */
        public final void m45502e(List list) {
            this.f42015a = list;
        }

        /* renamed from: f */
        public final void m45503f(the theVar) {
            this.f42016b = theVar;
        }
    }

    /* renamed from: o.qhe$b */
    public static final class C16409b {
        public C16409b() {
        }

        public /* synthetic */ C16409b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ qhe(C16408a c16408a, id5 id5Var) {
        this(c16408a);
    }

    /* renamed from: a */
    public final List m45497a() {
        return this.f42013a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qhe.class != obj.getClass()) {
            return false;
        }
        qhe qheVar = (qhe) obj;
        return sq8.m48644c(this.f42013a, qheVar.f42013a) && sq8.m48644c(this.f42014b, qheVar.f42014b);
    }

    public int hashCode() {
        List list = this.f42013a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        the theVar = this.f42014b;
        return iHashCode + (theVar != null ? theVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Relationship(");
        sb.append("ids=" + this.f42013a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type=");
        sb2.append(this.f42014b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public qhe(C16408a c16408a) {
        this.f42013a = c16408a.m45500c();
        this.f42014b = c16408a.m45501d();
    }
}
