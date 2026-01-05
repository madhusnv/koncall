package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class xl5 {

    /* renamed from: a */
    public static final C18177a f53888a = new C18177a(null);

    /* renamed from: b */
    public static final List f53889b = ch3.m21249n(C18178b.f53890c, C18180d.f53893c);

    /* renamed from: o.xl5$a */
    public static final class C18177a {
        public C18177a() {
        }

        public /* synthetic */ C18177a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final xl5 m56447a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "EMAIL") ? C18178b.f53890c : sq8.m48644c(str, "SMS") ? C18180d.f53893c : new C18179c(str);
        }
    }

    /* renamed from: o.xl5$b */
    public static final class C18178b extends xl5 {

        /* renamed from: c */
        public static final C18178b f53890c = new C18178b();

        /* renamed from: d */
        public static final String f53891d = "EMAIL";

        public C18178b() {
            super(null);
        }

        @Override // p001o.xl5
        /* renamed from: a */
        public String mo56446a() {
            return f53891d;
        }

        public String toString() {
            return "Email";
        }
    }

    /* renamed from: o.xl5$c */
    public static final class C18179c extends xl5 {

        /* renamed from: c */
        public final String f53892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18179c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f53892c = str;
        }

        @Override // p001o.xl5
        /* renamed from: a */
        public String mo56446a() {
            return this.f53892c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18179c) && sq8.m48644c(this.f53892c, ((C18179c) obj).f53892c);
        }

        public int hashCode() {
            return this.f53892c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo56446a() + ')';
        }
    }

    /* renamed from: o.xl5$d */
    public static final class C18180d extends xl5 {

        /* renamed from: c */
        public static final C18180d f53893c = new C18180d();

        /* renamed from: d */
        public static final String f53894d = "SMS";

        public C18180d() {
            super(null);
        }

        @Override // p001o.xl5
        /* renamed from: a */
        public String mo56446a() {
            return f53894d;
        }

        public String toString() {
            return "Sms";
        }
    }

    public xl5() {
    }

    public /* synthetic */ xl5(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo56446a();
}
