package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class gwh {

    /* renamed from: f */
    public static final C13831b f25893f = new C13831b(null);

    /* renamed from: a */
    public final jwh f25894a;

    /* renamed from: b */
    public final String f25895b;

    /* renamed from: c */
    public final String f25896c;

    /* renamed from: d */
    public final List f25897d;

    /* renamed from: e */
    public final String f25898e;

    /* renamed from: o.gwh$a */
    public static final class C13830a {

        /* renamed from: a */
        public jwh f25899a;

        /* renamed from: b */
        public String f25900b;

        /* renamed from: c */
        public String f25901c;

        /* renamed from: d */
        public List f25902d;

        /* renamed from: e */
        public String f25903e;

        /* renamed from: a */
        public final gwh m29613a() {
            return new gwh(this, null);
        }

        /* renamed from: b */
        public final jwh m29614b() {
            return this.f25899a;
        }

        /* renamed from: c */
        public final String m29615c() {
            return this.f25900b;
        }

        /* renamed from: d */
        public final String m29616d() {
            return this.f25901c;
        }

        /* renamed from: e */
        public final List m29617e() {
            return this.f25902d;
        }

        /* renamed from: f */
        public final String m29618f() {
            return this.f25903e;
        }

        /* renamed from: g */
        public final void m29619g(String str) {
            this.f25900b = str;
        }

        /* renamed from: h */
        public final void m29620h(String str) {
            this.f25901c = str;
        }

        /* renamed from: i */
        public final void m29621i(String str) {
            this.f25903e = str;
        }
    }

    /* renamed from: o.gwh$b */
    public static final class C13831b {
        public C13831b() {
        }

        public /* synthetic */ C13831b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gwh(C13830a c13830a, id5 id5Var) {
        this(c13830a);
    }

    /* renamed from: a */
    public final jwh m29608a() {
        return this.f25894a;
    }

    /* renamed from: b */
    public final String m29609b() {
        return this.f25895b;
    }

    /* renamed from: c */
    public final String m29610c() {
        return this.f25896c;
    }

    /* renamed from: d */
    public final List m29611d() {
        return this.f25897d;
    }

    /* renamed from: e */
    public final String m29612e() {
        return this.f25898e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gwh.class != obj.getClass()) {
            return false;
        }
        gwh gwhVar = (gwh) obj;
        return sq8.m48644c(this.f25894a, gwhVar.f25894a) && sq8.m48644c(this.f25895b, gwhVar.f25895b) && sq8.m48644c(this.f25896c, gwhVar.f25896c) && sq8.m48644c(this.f25897d, gwhVar.f25897d) && sq8.m48644c(this.f25898e, gwhVar.f25898e);
    }

    public int hashCode() {
        jwh jwhVar = this.f25894a;
        int iHashCode = (jwhVar != null ? jwhVar.hashCode() : 0) * 31;
        String str = this.f25895b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25896c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.f25897d;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f25898e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TranslateTextRequest(");
        sb.append("settings=" + this.f25894a + ',');
        sb.append("sourceLanguageCode=" + this.f25895b + ',');
        sb.append("targetLanguageCode=" + this.f25896c + ',');
        sb.append("terminologyNames=" + this.f25897d + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("text=");
        sb2.append(this.f25898e);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gwh(C13830a c13830a) {
        this.f25894a = c13830a.m29614b();
        this.f25895b = c13830a.m29615c();
        this.f25896c = c13830a.m29616d();
        this.f25897d = c13830a.m29617e();
        this.f25898e = c13830a.m29618f();
    }
}
