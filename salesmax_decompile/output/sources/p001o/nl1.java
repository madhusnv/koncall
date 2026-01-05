package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class nl1 {

    /* renamed from: a */
    public static final C15600a f36988a = new C15600a(null);

    /* renamed from: b */
    public static final List f36989b = bh3.m18963e(C15601b.f36990c);

    /* renamed from: o.nl1$a */
    public static final class C15600a {
        public C15600a() {
        }

        public /* synthetic */ C15600a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final nl1 m40742a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "ON") ? C15601b.f36990c : new C15602c(str);
        }
    }

    /* renamed from: o.nl1$b */
    public static final class C15601b extends nl1 {

        /* renamed from: c */
        public static final C15601b f36990c = new C15601b();

        /* renamed from: d */
        public static final String f36991d = "ON";

        public C15601b() {
            super(null);
        }

        @Override // p001o.nl1
        /* renamed from: a */
        public String mo40741a() {
            return f36991d;
        }

        public String toString() {
            return "On";
        }
    }

    /* renamed from: o.nl1$c */
    public static final class C15602c extends nl1 {

        /* renamed from: c */
        public final String f36992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15602c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f36992c = str;
        }

        @Override // p001o.nl1
        /* renamed from: a */
        public String mo40741a() {
            return this.f36992c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15602c) && sq8.m48644c(this.f36992c, ((C15602c) obj).f36992c);
        }

        public int hashCode() {
            return this.f36992c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo40741a() + ')';
        }
    }

    public nl1() {
    }

    public /* synthetic */ nl1(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo40741a();
}
