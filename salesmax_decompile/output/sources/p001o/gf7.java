package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class gf7 {

    /* renamed from: a */
    public static final C13698a f25063a = new C13698a(null);

    /* renamed from: b */
    public static final List f25064b = ch3.m21249n(C13699b.f25065c, C13700c.f25067c);

    /* renamed from: o.gf7$a */
    public static final class C13698a {
        public C13698a() {
        }

        public /* synthetic */ C13698a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final gf7 m28553a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "FORMAL") ? C13699b.f25065c : sq8.m48644c(str, "INFORMAL") ? C13700c.f25067c : new C13701d(str);
        }
    }

    /* renamed from: o.gf7$b */
    public static final class C13699b extends gf7 {

        /* renamed from: c */
        public static final C13699b f25065c = new C13699b();

        /* renamed from: d */
        public static final String f25066d = "FORMAL";

        public C13699b() {
            super(null);
        }

        @Override // p001o.gf7
        /* renamed from: a */
        public String mo28552a() {
            return f25066d;
        }

        public String toString() {
            return "Formal";
        }
    }

    /* renamed from: o.gf7$c */
    public static final class C13700c extends gf7 {

        /* renamed from: c */
        public static final C13700c f25067c = new C13700c();

        /* renamed from: d */
        public static final String f25068d = "INFORMAL";

        public C13700c() {
            super(null);
        }

        @Override // p001o.gf7
        /* renamed from: a */
        public String mo28552a() {
            return f25068d;
        }

        public String toString() {
            return "Informal";
        }
    }

    /* renamed from: o.gf7$d */
    public static final class C13701d extends gf7 {

        /* renamed from: c */
        public final String f25069c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13701d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f25069c = str;
        }

        @Override // p001o.gf7
        /* renamed from: a */
        public String mo28552a() {
            return this.f25069c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13701d) && sq8.m48644c(this.f25069c, ((C13701d) obj).f25069c);
        }

        public int hashCode() {
            return this.f25069c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo28552a() + ')';
        }
    }

    public gf7() {
    }

    public /* synthetic */ gf7(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo28552a();
}
