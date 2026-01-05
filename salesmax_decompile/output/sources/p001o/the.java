package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class the {

    /* renamed from: a */
    public static final C17115c f47134a = new C17115c(null);

    /* renamed from: b */
    public static final List f47135b = ch3.m21249n(C17113a.f47136c, C17114b.f47138c, C17116d.f47140c, C17117e.f47142c, C17119g.f47145c, C17120h.f47147c, C17121i.f47149c, C17122j.f47151c, C17123k.f47153c);

    /* renamed from: o.the$a */
    public static final class C17113a extends the {

        /* renamed from: c */
        public static final C17113a f47136c = new C17113a();

        /* renamed from: d */
        public static final String f47137d = "ANSWER";

        public C17113a() {
            super(null);
        }

        public String toString() {
            return "Answer";
        }
    }

    /* renamed from: o.the$b */
    public static final class C17114b extends the {

        /* renamed from: c */
        public static final C17114b f47138c = new C17114b();

        /* renamed from: d */
        public static final String f47139d = "CHILD";

        public C17114b() {
            super(null);
        }

        public String toString() {
            return "Child";
        }
    }

    /* renamed from: o.the$c */
    public static final class C17115c {
        public C17115c() {
        }

        public /* synthetic */ C17115c(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final the m49895a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1452933483:
                    if (str.equals("MERGED_CELL")) {
                        return C17117e.f47142c;
                    }
                    break;
                case -1025329396:
                    if (str.equals("COMPLEX_FEATURES")) {
                        return C17116d.f47140c;
                    }
                    break;
                case -618998169:
                    if (str.equals("TABLE_TITLE")) {
                        return C17121i.f47149c;
                    }
                    break;
                case 64093436:
                    if (str.equals("CHILD")) {
                        return C17114b.f47138c;
                    }
                    break;
                case 79578030:
                    if (str.equals("TABLE")) {
                        return C17119g.f47145c;
                    }
                    break;
                case 79833656:
                    if (str.equals("TITLE")) {
                        return C17122j.f47151c;
                    }
                    break;
                case 81434961:
                    if (str.equals("VALUE")) {
                        return C17123k.f47153c;
                    }
                    break;
                case 1890485068:
                    if (str.equals("TABLE_FOOTER")) {
                        return C17120h.f47147c;
                    }
                    break;
                case 1935487934:
                    if (str.equals("ANSWER")) {
                        return C17113a.f47136c;
                    }
                    break;
            }
            return new C17118f(str);
        }
    }

    /* renamed from: o.the$d */
    public static final class C17116d extends the {

        /* renamed from: c */
        public static final C17116d f47140c = new C17116d();

        /* renamed from: d */
        public static final String f47141d = "COMPLEX_FEATURES";

        public C17116d() {
            super(null);
        }

        public String toString() {
            return "ComplexFeatures";
        }
    }

    /* renamed from: o.the$e */
    public static final class C17117e extends the {

        /* renamed from: c */
        public static final C17117e f47142c = new C17117e();

        /* renamed from: d */
        public static final String f47143d = "MERGED_CELL";

        public C17117e() {
            super(null);
        }

        public String toString() {
            return "MergedCell";
        }
    }

    /* renamed from: o.the$f */
    public static final class C17118f extends the {

        /* renamed from: c */
        public final String f47144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17118f(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f47144c = str;
        }

        /* renamed from: a */
        public String m49896a() {
            return this.f47144c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17118f) && sq8.m48644c(this.f47144c, ((C17118f) obj).f47144c);
        }

        public int hashCode() {
            return this.f47144c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m49896a() + ')';
        }
    }

    /* renamed from: o.the$g */
    public static final class C17119g extends the {

        /* renamed from: c */
        public static final C17119g f47145c = new C17119g();

        /* renamed from: d */
        public static final String f47146d = "TABLE";

        public C17119g() {
            super(null);
        }

        public String toString() {
            return "Table";
        }
    }

    /* renamed from: o.the$h */
    public static final class C17120h extends the {

        /* renamed from: c */
        public static final C17120h f47147c = new C17120h();

        /* renamed from: d */
        public static final String f47148d = "TABLE_FOOTER";

        public C17120h() {
            super(null);
        }

        public String toString() {
            return "TableFooter";
        }
    }

    /* renamed from: o.the$i */
    public static final class C17121i extends the {

        /* renamed from: c */
        public static final C17121i f47149c = new C17121i();

        /* renamed from: d */
        public static final String f47150d = "TABLE_TITLE";

        public C17121i() {
            super(null);
        }

        public String toString() {
            return "TableTitle";
        }
    }

    /* renamed from: o.the$j */
    public static final class C17122j extends the {

        /* renamed from: c */
        public static final C17122j f47151c = new C17122j();

        /* renamed from: d */
        public static final String f47152d = "TITLE";

        public C17122j() {
            super(null);
        }

        public String toString() {
            return "Title";
        }
    }

    /* renamed from: o.the$k */
    public static final class C17123k extends the {

        /* renamed from: c */
        public static final C17123k f47153c = new C17123k();

        /* renamed from: d */
        public static final String f47154d = "VALUE";

        public C17123k() {
            super(null);
        }

        public String toString() {
            return "Value";
        }
    }

    public the() {
    }

    public /* synthetic */ the(id5 id5Var) {
        this();
    }
}
