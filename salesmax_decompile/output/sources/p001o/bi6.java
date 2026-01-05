package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class bi6 {

    /* renamed from: a */
    public static final C12417b f16325a = new C12417b(null);

    /* renamed from: b */
    public static final List f16326b = ch3.m21249n(C12416a.f16327c, C12418c.f16329c, C12420e.f16332c, C12421f.f16334c, C12422g.f16336c, C12423h.f16338c, C12424i.f16340c, C12425j.f16342c, C12426k.f16344c);

    /* renamed from: o.bi6$a */
    public static final class C12416a extends bi6 {

        /* renamed from: c */
        public static final C12416a f16327c = new C12416a();

        /* renamed from: d */
        public static final String f16328d = "COLUMN_HEADER";

        public C12416a() {
            super(null);
        }

        public String toString() {
            return "ColumnHeader";
        }
    }

    /* renamed from: o.bi6$b */
    public static final class C12417b {
        public C12417b() {
        }

        public /* synthetic */ C12417b(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final bi6 m19125a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1300711439:
                    if (str.equals("SEMI_STRUCTURED_TABLE")) {
                        return C12420e.f16332c;
                    }
                    break;
                case -741163667:
                    if (str.equals("TABLE_SECTION_TITLE")) {
                        return C12423h.f16338c;
                    }
                    break;
                case -618998169:
                    if (str.equals("TABLE_TITLE")) {
                        return C12425j.f16342c;
                    }
                    break;
                case 74303:
                    if (str.equals("KEY")) {
                        return C12418c.f16329c;
                    }
                    break;
                case 81434961:
                    if (str.equals("VALUE")) {
                        return C12426k.f16344c;
                    }
                    break;
                case 1432359744:
                    if (str.equals("STRUCTURED_TABLE")) {
                        return C12421f.f16334c;
                    }
                    break;
                case 1592823797:
                    if (str.equals("TABLE_SUMMARY")) {
                        return C12424i.f16340c;
                    }
                    break;
                case 1890485068:
                    if (str.equals("TABLE_FOOTER")) {
                        return C12422g.f16336c;
                    }
                    break;
                case 2077048726:
                    if (str.equals("COLUMN_HEADER")) {
                        return C12416a.f16327c;
                    }
                    break;
            }
            return new C12419d(str);
        }
    }

    /* renamed from: o.bi6$c */
    public static final class C12418c extends bi6 {

        /* renamed from: c */
        public static final C12418c f16329c = new C12418c();

        /* renamed from: d */
        public static final String f16330d = "KEY";

        public C12418c() {
            super(null);
        }

        public String toString() {
            return "Key";
        }
    }

    /* renamed from: o.bi6$d */
    public static final class C12419d extends bi6 {

        /* renamed from: c */
        public final String f16331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12419d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f16331c = str;
        }

        /* renamed from: a */
        public String m19126a() {
            return this.f16331c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12419d) && sq8.m48644c(this.f16331c, ((C12419d) obj).f16331c);
        }

        public int hashCode() {
            return this.f16331c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m19126a() + ')';
        }
    }

    /* renamed from: o.bi6$e */
    public static final class C12420e extends bi6 {

        /* renamed from: c */
        public static final C12420e f16332c = new C12420e();

        /* renamed from: d */
        public static final String f16333d = "SEMI_STRUCTURED_TABLE";

        public C12420e() {
            super(null);
        }

        public String toString() {
            return "SemiStructuredTable";
        }
    }

    /* renamed from: o.bi6$f */
    public static final class C12421f extends bi6 {

        /* renamed from: c */
        public static final C12421f f16334c = new C12421f();

        /* renamed from: d */
        public static final String f16335d = "STRUCTURED_TABLE";

        public C12421f() {
            super(null);
        }

        public String toString() {
            return "StructuredTable";
        }
    }

    /* renamed from: o.bi6$g */
    public static final class C12422g extends bi6 {

        /* renamed from: c */
        public static final C12422g f16336c = new C12422g();

        /* renamed from: d */
        public static final String f16337d = "TABLE_FOOTER";

        public C12422g() {
            super(null);
        }

        public String toString() {
            return "TableFooter";
        }
    }

    /* renamed from: o.bi6$h */
    public static final class C12423h extends bi6 {

        /* renamed from: c */
        public static final C12423h f16338c = new C12423h();

        /* renamed from: d */
        public static final String f16339d = "TABLE_SECTION_TITLE";

        public C12423h() {
            super(null);
        }

        public String toString() {
            return "TableSectionTitle";
        }
    }

    /* renamed from: o.bi6$i */
    public static final class C12424i extends bi6 {

        /* renamed from: c */
        public static final C12424i f16340c = new C12424i();

        /* renamed from: d */
        public static final String f16341d = "TABLE_SUMMARY";

        public C12424i() {
            super(null);
        }

        public String toString() {
            return "TableSummary";
        }
    }

    /* renamed from: o.bi6$j */
    public static final class C12425j extends bi6 {

        /* renamed from: c */
        public static final C12425j f16342c = new C12425j();

        /* renamed from: d */
        public static final String f16343d = "TABLE_TITLE";

        public C12425j() {
            super(null);
        }

        public String toString() {
            return "TableTitle";
        }
    }

    /* renamed from: o.bi6$k */
    public static final class C12426k extends bi6 {

        /* renamed from: c */
        public static final C12426k f16344c = new C12426k();

        /* renamed from: d */
        public static final String f16345d = "VALUE";

        public C12426k() {
            super(null);
        }

        public String toString() {
            return "Value";
        }
    }

    public bi6() {
    }

    public /* synthetic */ bi6(id5 id5Var) {
        this();
    }
}
