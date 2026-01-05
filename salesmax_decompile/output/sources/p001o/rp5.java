package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class rp5 {

    /* renamed from: c */
    public static final C16647b f43927c = new C16647b(null);

    /* renamed from: a */
    public final List f43928a;

    /* renamed from: b */
    public final String f43929b;

    /* renamed from: o.rp5$a */
    public static final class C16646a {

        /* renamed from: a */
        public List f43930a;

        /* renamed from: b */
        public String f43931b;

        /* renamed from: a */
        public final rp5 m47048a() {
            return new rp5(this, null);
        }

        /* renamed from: b */
        public final C16646a m47049b() {
            return this;
        }

        /* renamed from: c */
        public final List m47050c() {
            return this.f43930a;
        }

        /* renamed from: d */
        public final String m47051d() {
            return this.f43931b;
        }

        /* renamed from: e */
        public final void m47052e(List list) {
            this.f43930a = list;
        }

        /* renamed from: f */
        public final void m47053f(String str) {
            this.f43931b = str;
        }
    }

    /* renamed from: o.rp5$b */
    public static final class C16647b {
        public C16647b() {
        }

        public /* synthetic */ C16647b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ rp5(C16646a c16646a, id5 id5Var) {
        this(c16646a);
    }

    /* renamed from: a */
    public final List m47047a() {
        return this.f43928a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rp5.class != obj.getClass()) {
            return false;
        }
        rp5 rp5Var = (rp5) obj;
        return sq8.m48644c(this.f43928a, rp5Var.f43928a) && sq8.m48644c(this.f43929b, rp5Var.f43929b);
    }

    public int hashCode() {
        List list = this.f43928a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f43929b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectTextResponse(");
        sb.append("textDetections=" + this.f43928a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("textModelVersion=");
        sb2.append(this.f43929b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public rp5(C16646a c16646a) {
        this.f43928a = c16646a.m47050c();
        this.f43929b = c16646a.m47051d();
    }
}
