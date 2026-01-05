package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class xea {

    /* renamed from: c */
    public static final C18128b f53643c = new C18128b(null);

    /* renamed from: a */
    public final List f53644a;

    /* renamed from: b */
    public final String f53645b;

    /* renamed from: o.xea$a */
    public static final class C18127a {

        /* renamed from: a */
        public List f53646a;

        /* renamed from: b */
        public String f53647b;

        /* renamed from: a */
        public final xea m56167a() {
            return new xea(this, null);
        }

        /* renamed from: b */
        public final C18127a m56168b() {
            return this;
        }

        /* renamed from: c */
        public final List m56169c() {
            return this.f53646a;
        }

        /* renamed from: d */
        public final String m56170d() {
            return this.f53647b;
        }

        /* renamed from: e */
        public final void m56171e(List list) {
            this.f53646a = list;
        }

        /* renamed from: f */
        public final void m56172f(String str) {
            this.f53647b = str;
        }
    }

    /* renamed from: o.xea$b */
    public static final class C18128b {
        public C18128b() {
        }

        public /* synthetic */ C18128b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xea(C18127a c18127a, id5 id5Var) {
        this(c18127a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xea.class != obj.getClass()) {
            return false;
        }
        xea xeaVar = (xea) obj;
        return sq8.m48644c(this.f53644a, xeaVar.f53644a) && sq8.m48644c(this.f53645b, xeaVar.f53645b);
    }

    public int hashCode() {
        List list = this.f53644a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f53645b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListLexiconsResponse(");
        sb.append("lexicons=" + this.f53644a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.f53645b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xea(C18127a c18127a) {
        this.f53644a = c18127a.m56169c();
        this.f53645b = c18127a.m56170d();
    }
}
