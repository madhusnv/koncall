package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ohg {

    /* renamed from: a */
    public static final C15802a f38367a = new C15802a(null);

    /* renamed from: b */
    public static final List f38368b = ch3.m21249n(C15803b.f38369c, C15804c.f38371c, C15805d.f38373c, C15806e.f38375c, C15807f.f38377c, C15808g.f38379c);

    /* renamed from: o.ohg$a */
    public static final class C15802a {
        public C15802a() {
        }

        public /* synthetic */ C15802a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ohg m42250a(String str) {
            sq8.m48649h(str, "value");
            int iHashCode = str.hashCode();
            if (iHashCode != 3201) {
                if (iHashCode != 3241) {
                    if (iHashCode != 3246) {
                        if (iHashCode != 3276) {
                            if (iHashCode != 3371) {
                                if (iHashCode == 3588 && str.equals("pt")) {
                                    return C15808g.f38379c;
                                }
                            } else if (str.equals("it")) {
                                return C15807f.f38377c;
                            }
                        } else if (str.equals("fr")) {
                            return C15806e.f38375c;
                        }
                    } else if (str.equals("es")) {
                        return C15805d.f38373c;
                    }
                } else if (str.equals("en")) {
                    return C15804c.f38371c;
                }
            } else if (str.equals("de")) {
                return C15803b.f38369c;
            }
            return new C15809h(str);
        }
    }

    /* renamed from: o.ohg$b */
    public static final class C15803b extends ohg {

        /* renamed from: c */
        public static final C15803b f38369c = new C15803b();

        /* renamed from: d */
        public static final String f38370d = "de";

        public C15803b() {
            super(null);
        }

        @Override // p001o.ohg
        /* renamed from: a */
        public String mo42249a() {
            return f38370d;
        }

        public String toString() {
            return "De";
        }
    }

    /* renamed from: o.ohg$c */
    public static final class C15804c extends ohg {

        /* renamed from: c */
        public static final C15804c f38371c = new C15804c();

        /* renamed from: d */
        public static final String f38372d = "en";

        public C15804c() {
            super(null);
        }

        @Override // p001o.ohg
        /* renamed from: a */
        public String mo42249a() {
            return f38372d;
        }

        public String toString() {
            return "En";
        }
    }

    /* renamed from: o.ohg$d */
    public static final class C15805d extends ohg {

        /* renamed from: c */
        public static final C15805d f38373c = new C15805d();

        /* renamed from: d */
        public static final String f38374d = "es";

        public C15805d() {
            super(null);
        }

        @Override // p001o.ohg
        /* renamed from: a */
        public String mo42249a() {
            return f38374d;
        }

        public String toString() {
            return "Es";
        }
    }

    /* renamed from: o.ohg$e */
    public static final class C15806e extends ohg {

        /* renamed from: c */
        public static final C15806e f38375c = new C15806e();

        /* renamed from: d */
        public static final String f38376d = "fr";

        public C15806e() {
            super(null);
        }

        @Override // p001o.ohg
        /* renamed from: a */
        public String mo42249a() {
            return f38376d;
        }

        public String toString() {
            return "Fr";
        }
    }

    /* renamed from: o.ohg$f */
    public static final class C15807f extends ohg {

        /* renamed from: c */
        public static final C15807f f38377c = new C15807f();

        /* renamed from: d */
        public static final String f38378d = "it";

        public C15807f() {
            super(null);
        }

        @Override // p001o.ohg
        /* renamed from: a */
        public String mo42249a() {
            return f38378d;
        }

        public String toString() {
            return "It";
        }
    }

    /* renamed from: o.ohg$g */
    public static final class C15808g extends ohg {

        /* renamed from: c */
        public static final C15808g f38379c = new C15808g();

        /* renamed from: d */
        public static final String f38380d = "pt";

        public C15808g() {
            super(null);
        }

        @Override // p001o.ohg
        /* renamed from: a */
        public String mo42249a() {
            return f38380d;
        }

        public String toString() {
            return "Pt";
        }
    }

    /* renamed from: o.ohg$h */
    public static final class C15809h extends ohg {

        /* renamed from: c */
        public final String f38381c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15809h(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f38381c = str;
        }

        @Override // p001o.ohg
        /* renamed from: a */
        public String mo42249a() {
            return this.f38381c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15809h) && sq8.m48644c(this.f38381c, ((C15809h) obj).f38381c);
        }

        public int hashCode() {
            return this.f38381c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo42249a() + ')';
        }
    }

    public ohg() {
    }

    public /* synthetic */ ohg(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo42249a();
}
