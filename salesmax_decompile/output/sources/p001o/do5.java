package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class do5 {

    /* renamed from: b */
    public static final C13008b f20330b = new C13008b(null);

    /* renamed from: a */
    public final List f20331a;

    /* renamed from: o.do5$a */
    public static final class C13007a {

        /* renamed from: a */
        public List f20332a;

        /* renamed from: a */
        public final do5 m23637a() {
            return new do5(this, null);
        }

        /* renamed from: b */
        public final C13007a m23638b() {
            return this;
        }

        /* renamed from: c */
        public final List m23639c() {
            return this.f20332a;
        }

        /* renamed from: d */
        public final void m23640d(List list) {
            this.f20332a = list;
        }
    }

    /* renamed from: o.do5$b */
    public static final class C13008b {
        public C13008b() {
        }

        public /* synthetic */ C13008b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ do5(C13007a c13007a, id5 id5Var) {
        this(c13007a);
    }

    /* renamed from: a */
    public final List m23636a() {
        return this.f20331a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && do5.class == obj.getClass() && sq8.m48644c(this.f20331a, ((do5) obj).f20331a);
    }

    public int hashCode() {
        List list = this.f20331a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "DetectKeyPhrasesResponse(*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public do5(C13007a c13007a) {
        this.f20331a = c13007a.m23639c();
    }
}
