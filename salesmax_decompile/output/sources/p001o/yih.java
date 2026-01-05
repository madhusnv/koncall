package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class yih {

    /* renamed from: a */
    public static final C18414a f55559a = new C18414a(null);

    /* renamed from: b */
    public static final List f55560b = ch3.m21249n(C18416c.f55562c, C18417d.f55564c);

    /* renamed from: o.yih$a */
    public static final class C18414a {
        public C18414a() {
        }

        public /* synthetic */ C18414a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final yih m57857a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "ssml") ? C18416c.f55562c : sq8.m48644c(str, "text") ? C18417d.f55564c : new C18415b(str);
        }
    }

    /* renamed from: o.yih$b */
    public static final class C18415b extends yih {

        /* renamed from: c */
        public final String f55561c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18415b(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f55561c = str;
        }

        @Override // p001o.yih
        /* renamed from: a */
        public String mo57856a() {
            return this.f55561c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18415b) && sq8.m48644c(this.f55561c, ((C18415b) obj).f55561c);
        }

        public int hashCode() {
            return this.f55561c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo57856a() + ')';
        }
    }

    /* renamed from: o.yih$c */
    public static final class C18416c extends yih {

        /* renamed from: c */
        public static final C18416c f55562c = new C18416c();

        /* renamed from: d */
        public static final String f55563d = "ssml";

        public C18416c() {
            super(null);
        }

        @Override // p001o.yih
        /* renamed from: a */
        public String mo57856a() {
            return f55563d;
        }

        public String toString() {
            return "Ssml";
        }
    }

    /* renamed from: o.yih$d */
    public static final class C18417d extends yih {

        /* renamed from: c */
        public static final C18417d f55564c = new C18417d();

        /* renamed from: d */
        public static final String f55565d = "text";

        public C18417d() {
            super(null);
        }

        @Override // p001o.yih
        /* renamed from: a */
        public String mo57856a() {
            return f55565d;
        }

        public String toString() {
            return "Text";
        }
    }

    public yih() {
    }

    public /* synthetic */ yih(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo57856a();
}
