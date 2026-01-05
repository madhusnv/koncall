package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class ln5 {

    /* renamed from: b */
    public static final C15109b f34108b = new C15109b(null);

    /* renamed from: a */
    public final List f34109a;

    /* renamed from: o.ln5$a */
    public static final class C15108a {

        /* renamed from: a */
        public List f34110a;

        /* renamed from: a */
        public final ln5 m37513a() {
            return new ln5(this, null);
        }

        /* renamed from: b */
        public final C15108a m37514b() {
            return this;
        }

        /* renamed from: c */
        public final List m37515c() {
            return this.f34110a;
        }

        /* renamed from: d */
        public final void m37516d(List list) {
            this.f34110a = list;
        }
    }

    /* renamed from: o.ln5$b */
    public static final class C15109b {
        public C15109b() {
        }

        public /* synthetic */ C15109b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ln5(C15108a c15108a, id5 id5Var) {
        this(c15108a);
    }

    /* renamed from: a */
    public final List m37512a() {
        return this.f34109a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ln5.class == obj.getClass() && sq8.m48644c(this.f34109a, ((ln5) obj).f34109a);
    }

    public int hashCode() {
        List list = this.f34109a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "DetectDominantLanguageResponse(*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public ln5(C15108a c15108a) {
        this.f34109a = c15108a.m37515c();
    }
}
