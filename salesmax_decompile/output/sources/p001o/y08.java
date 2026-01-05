package p001o;

/* loaded from: classes3.dex */
public abstract class y08 {

    /* renamed from: a */
    public static final C18290a f54673a = new C18290a(null);

    /* renamed from: o.y08$a */
    public static final class C18290a {
        public C18290a() {
        }

        public /* synthetic */ C18290a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final y08 m57086a(String str) {
            sq8.m48649h(str, "host");
            return a18.m16325b(str);
        }
    }

    /* renamed from: o.y08$b */
    public static final class C18291b extends y08 {

        /* renamed from: b */
        public final String f54674b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18291b(String str) {
            super(null);
            sq8.m48649h(str, "name");
            this.f54674b = str;
        }

        /* renamed from: a */
        public final String m57087a() {
            return this.f54674b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18291b) && sq8.m48644c(this.f54674b, ((C18291b) obj).f54674b);
        }

        public int hashCode() {
            return this.f54674b.hashCode();
        }

        public String toString() {
            return this.f54674b;
        }
    }

    /* renamed from: o.y08$c */
    public static final class C18292c extends y08 {

        /* renamed from: b */
        public final vv8 f54675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18292c(vv8 vv8Var) {
            super(null);
            sq8.m48649h(vv8Var, "address");
            this.f54675b = vv8Var;
        }

        /* renamed from: a */
        public final vv8 m57088a() {
            return this.f54675b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18292c) && sq8.m48644c(this.f54675b, ((C18292c) obj).f54675b);
        }

        public int hashCode() {
            return this.f54675b.hashCode();
        }

        public String toString() {
            return this.f54675b.toString();
        }
    }

    public y08() {
    }

    public /* synthetic */ y08(id5 id5Var) {
        this();
    }
}
