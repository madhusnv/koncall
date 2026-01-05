package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class gef {

    /* renamed from: a */
    public static final C13692a f25039a = new C13692a(null);

    /* renamed from: b */
    public static final List f25040b = ch3.m21249n(C13693b.f25041c, C13694c.f25043c, C13695d.f25045c, C13696e.f25047c);

    /* renamed from: o.gef$a */
    public static final class C13692a {
        public C13692a() {
        }

        public /* synthetic */ C13692a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final gef m28529a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1732662873:
                    if (str.equals("NEUTRAL")) {
                        return C13695d.f25045c;
                    }
                    break;
                case 73372635:
                    if (str.equals("MIXED")) {
                        return C13693b.f25041c;
                    }
                    break;
                case 1530431993:
                    if (str.equals("POSITIVE")) {
                        return C13696e.f25047c;
                    }
                    break;
                case 1703738421:
                    if (str.equals("NEGATIVE")) {
                        return C13694c.f25043c;
                    }
                    break;
            }
            return new C13697f(str);
        }
    }

    /* renamed from: o.gef$b */
    public static final class C13693b extends gef {

        /* renamed from: c */
        public static final C13693b f25041c = new C13693b();

        /* renamed from: d */
        public static final String f25042d = "MIXED";

        public C13693b() {
            super(null);
        }

        @Override // p001o.gef
        /* renamed from: a */
        public String mo28528a() {
            return f25042d;
        }

        public String toString() {
            return "Mixed";
        }
    }

    /* renamed from: o.gef$c */
    public static final class C13694c extends gef {

        /* renamed from: c */
        public static final C13694c f25043c = new C13694c();

        /* renamed from: d */
        public static final String f25044d = "NEGATIVE";

        public C13694c() {
            super(null);
        }

        @Override // p001o.gef
        /* renamed from: a */
        public String mo28528a() {
            return f25044d;
        }

        public String toString() {
            return "Negative";
        }
    }

    /* renamed from: o.gef$d */
    public static final class C13695d extends gef {

        /* renamed from: c */
        public static final C13695d f25045c = new C13695d();

        /* renamed from: d */
        public static final String f25046d = "NEUTRAL";

        public C13695d() {
            super(null);
        }

        @Override // p001o.gef
        /* renamed from: a */
        public String mo28528a() {
            return f25046d;
        }

        public String toString() {
            return "Neutral";
        }
    }

    /* renamed from: o.gef$e */
    public static final class C13696e extends gef {

        /* renamed from: c */
        public static final C13696e f25047c = new C13696e();

        /* renamed from: d */
        public static final String f25048d = "POSITIVE";

        public C13696e() {
            super(null);
        }

        @Override // p001o.gef
        /* renamed from: a */
        public String mo28528a() {
            return f25048d;
        }

        public String toString() {
            return "Positive";
        }
    }

    /* renamed from: o.gef$f */
    public static final class C13697f extends gef {

        /* renamed from: c */
        public final String f25049c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13697f(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f25049c = str;
        }

        @Override // p001o.gef
        /* renamed from: a */
        public String mo28528a() {
            return this.f25049c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13697f) && sq8.m48644c(this.f25049c, ((C13697f) obj).f25049c);
        }

        public int hashCode() {
            return this.f25049c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo28528a() + ')';
        }
    }

    public gef() {
    }

    public /* synthetic */ gef(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo28528a();
}
