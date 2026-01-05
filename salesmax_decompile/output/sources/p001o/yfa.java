package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class yfa {

    /* renamed from: c */
    public static final C18400b f55466c = new C18400b(null);

    /* renamed from: a */
    public final List f55467a;

    /* renamed from: b */
    public final String f55468b;

    /* renamed from: o.yfa$a */
    public static final class C18399a {

        /* renamed from: a */
        public List f55469a;

        /* renamed from: b */
        public String f55470b;

        /* renamed from: a */
        public final yfa m57757a() {
            return new yfa(this, null);
        }

        /* renamed from: b */
        public final C18399a m57758b() {
            if (this.f55469a == null) {
                this.f55469a = ch3.m21246k();
            }
            return this;
        }

        /* renamed from: c */
        public final List m57759c() {
            return this.f55469a;
        }

        /* renamed from: d */
        public final String m57760d() {
            return this.f55470b;
        }

        /* renamed from: e */
        public final void m57761e(List list) {
            this.f55469a = list;
        }

        /* renamed from: f */
        public final void m57762f(String str) {
            this.f55470b = str;
        }
    }

    /* renamed from: o.yfa$b */
    public static final class C18400b {
        public C18400b() {
        }

        public /* synthetic */ C18400b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ yfa(C18399a c18399a, id5 id5Var) {
        this(c18399a);
    }

    /* renamed from: a */
    public final List m57755a() {
        return this.f55467a;
    }

    /* renamed from: b */
    public final String m57756b() {
        return this.f55468b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yfa.class != obj.getClass()) {
            return false;
        }
        yfa yfaVar = (yfa) obj;
        return sq8.m48644c(this.f55467a, yfaVar.f55467a) && sq8.m48644c(this.f55468b, yfaVar.f55468b);
    }

    public int hashCode() {
        int iHashCode = this.f55467a.hashCode() * 31;
        String str = this.f55468b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListWebAuthnCredentialsResponse(");
        sb.append("credentials=" + this.f55467a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.f55468b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public yfa(C18399a c18399a) {
        List listM57759c = c18399a.m57759c();
        if (listM57759c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for credentials".toString());
        }
        this.f55467a = listM57759c;
        this.f55468b = c18399a.m57760d();
    }
}
