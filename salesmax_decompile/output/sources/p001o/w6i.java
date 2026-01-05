package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class w6i {

    /* renamed from: b */
    public static final C17787b f51546b = new C17787b(null);

    /* renamed from: a */
    public final List f51547a;

    /* renamed from: o.w6i$a */
    public static final class C17786a {

        /* renamed from: a */
        public List f51548a;

        /* renamed from: a */
        public final w6i m54010a() {
            return new w6i(this, null);
        }

        /* renamed from: b */
        public final C17786a m54011b() {
            return this;
        }

        /* renamed from: c */
        public final List m54012c() {
            return this.f51548a;
        }

        /* renamed from: d */
        public final void m54013d(List list) {
            this.f51548a = list;
        }
    }

    /* renamed from: o.w6i$b */
    public static final class C17787b {
        public C17787b() {
        }

        public /* synthetic */ C17787b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ w6i(C17786a c17786a, id5 id5Var) {
        this(c17786a);
    }

    /* renamed from: a */
    public final List m54009a() {
        return this.f51547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && w6i.class == obj.getClass() && sq8.m48644c(this.f51547a, ((w6i) obj).f51547a);
    }

    public int hashCode() {
        List list = this.f51547a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateUserAttributesResponse(");
        sb.append("codeDeliveryDetailsList=" + this.f51547a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public w6i(C17786a c17786a) {
        this.f51547a = c17786a.m54012c();
    }
}
