package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class k0g {

    /* renamed from: a */
    public static final C14692a f31337a = new C14692a(null);

    /* renamed from: b */
    public static final List f31338b = ch3.m21249n(C14694c.f31340c, C14695d.f31342c, C14696e.f31344c, C14697f.f31346c);

    /* renamed from: o.k0g$a */
    public static final class C14692a {
        public C14692a() {
        }

        public /* synthetic */ C14692a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final k0g m34847a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -816231267:
                    if (str.equals("viseme")) {
                        return C14696e.f31344c;
                    }
                    break;
                case 3539967:
                    if (str.equals("ssml")) {
                        return C14695d.f31342c;
                    }
                    break;
                case 3655434:
                    if (str.equals("word")) {
                        return C14697f.f31346c;
                    }
                    break;
                case 1262736995:
                    if (str.equals("sentence")) {
                        return C14694c.f31340c;
                    }
                    break;
            }
            return new C14693b(str);
        }
    }

    /* renamed from: o.k0g$b */
    public static final class C14693b extends k0g {

        /* renamed from: c */
        public final String f31339c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14693b(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f31339c = str;
        }

        @Override // p001o.k0g
        /* renamed from: a */
        public String mo34846a() {
            return this.f31339c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14693b) && sq8.m48644c(this.f31339c, ((C14693b) obj).f31339c);
        }

        public int hashCode() {
            return this.f31339c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo34846a() + ')';
        }
    }

    /* renamed from: o.k0g$c */
    public static final class C14694c extends k0g {

        /* renamed from: c */
        public static final C14694c f31340c = new C14694c();

        /* renamed from: d */
        public static final String f31341d = "sentence";

        public C14694c() {
            super(null);
        }

        @Override // p001o.k0g
        /* renamed from: a */
        public String mo34846a() {
            return f31341d;
        }

        public String toString() {
            return "Sentence";
        }
    }

    /* renamed from: o.k0g$d */
    public static final class C14695d extends k0g {

        /* renamed from: c */
        public static final C14695d f31342c = new C14695d();

        /* renamed from: d */
        public static final String f31343d = "ssml";

        public C14695d() {
            super(null);
        }

        @Override // p001o.k0g
        /* renamed from: a */
        public String mo34846a() {
            return f31343d;
        }

        public String toString() {
            return "Ssml";
        }
    }

    /* renamed from: o.k0g$e */
    public static final class C14696e extends k0g {

        /* renamed from: c */
        public static final C14696e f31344c = new C14696e();

        /* renamed from: d */
        public static final String f31345d = "viseme";

        public C14696e() {
            super(null);
        }

        @Override // p001o.k0g
        /* renamed from: a */
        public String mo34846a() {
            return f31345d;
        }

        public String toString() {
            return "Viseme";
        }
    }

    /* renamed from: o.k0g$f */
    public static final class C14697f extends k0g {

        /* renamed from: c */
        public static final C14697f f31346c = new C14697f();

        /* renamed from: d */
        public static final String f31347d = "word";

        public C14697f() {
            super(null);
        }

        @Override // p001o.k0g
        /* renamed from: a */
        public String mo34846a() {
            return f31347d;
        }

        public String toString() {
            return "Word";
        }
    }

    public k0g() {
    }

    public /* synthetic */ k0g(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo34846a();
}
