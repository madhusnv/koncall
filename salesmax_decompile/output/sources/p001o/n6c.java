package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class n6c {

    /* renamed from: a */
    public static final C15511a f36441a = new C15511a(null);

    /* renamed from: b */
    public static final List f36442b = ch3.m21249n(C15512b.f36443c, C15513c.f36445c);

    /* renamed from: o.n6c$a */
    public static final class C15511a {
        public C15511a() {
        }

        public /* synthetic */ C15511a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final n6c m40145a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "COMPLIANCE") ? C15512b.f36443c : sq8.m48644c(str, "GOVERNANCE") ? C15513c.f36445c : new C15514d(str);
        }
    }

    /* renamed from: o.n6c$b */
    public static final class C15512b extends n6c {

        /* renamed from: c */
        public static final C15512b f36443c = new C15512b();

        /* renamed from: d */
        public static final String f36444d = "COMPLIANCE";

        public C15512b() {
            super(null);
        }

        @Override // p001o.n6c
        /* renamed from: a */
        public String mo40144a() {
            return f36444d;
        }

        public String toString() {
            return "Compliance";
        }
    }

    /* renamed from: o.n6c$c */
    public static final class C15513c extends n6c {

        /* renamed from: c */
        public static final C15513c f36445c = new C15513c();

        /* renamed from: d */
        public static final String f36446d = "GOVERNANCE";

        public C15513c() {
            super(null);
        }

        @Override // p001o.n6c
        /* renamed from: a */
        public String mo40144a() {
            return f36446d;
        }

        public String toString() {
            return "Governance";
        }
    }

    /* renamed from: o.n6c$d */
    public static final class C15514d extends n6c {

        /* renamed from: c */
        public final String f36447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15514d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f36447c = str;
        }

        @Override // p001o.n6c
        /* renamed from: a */
        public String mo40144a() {
            return this.f36447c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15514d) && sq8.m48644c(this.f36447c, ((C15514d) obj).f36447c);
        }

        public int hashCode() {
            return this.f36447c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo40144a() + ')';
        }
    }

    public n6c() {
    }

    public /* synthetic */ n6c(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo40144a();
}
