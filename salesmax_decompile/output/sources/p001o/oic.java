package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class oic {

    /* renamed from: a */
    public static final C15812a f38404a = new C15812a(null);

    /* renamed from: b */
    public static final List f38405b = ch3.m21249n(C15813b.f38406c, C15814c.f38408c, C15815d.f38410c, C15817f.f38413c, C15818g.f38415c);

    /* renamed from: o.oic$a */
    public static final class C15812a {
        public C15812a() {
        }

        public /* synthetic */ C15812a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final oic m42267a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -630263762:
                    if (str.equals("INTERNAL_SERVER_ERROR")) {
                        return C15813b.f38406c;
                    }
                    break;
                case -495995871:
                    if (str.equals("PAGE_SIZE_EXCEEDED")) {
                        return C15815d.f38410c;
                    }
                    break;
                case -333701160:
                    if (str.equals("PAGE_CHARACTERS_EXCEEDED")) {
                        return C15814c.f38408c;
                    }
                    break;
                case 1091368555:
                    if (str.equals("TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED")) {
                        return C15818g.f38415c;
                    }
                    break;
                case 1939388699:
                    if (str.equals("TEXTRACT_BAD_PAGE")) {
                        return C15817f.f38413c;
                    }
                    break;
            }
            return new C15816e(str);
        }
    }

    /* renamed from: o.oic$b */
    public static final class C15813b extends oic {

        /* renamed from: c */
        public static final C15813b f38406c = new C15813b();

        /* renamed from: d */
        public static final String f38407d = "INTERNAL_SERVER_ERROR";

        public C15813b() {
            super(null);
        }

        public String toString() {
            return "InternalServerError";
        }
    }

    /* renamed from: o.oic$c */
    public static final class C15814c extends oic {

        /* renamed from: c */
        public static final C15814c f38408c = new C15814c();

        /* renamed from: d */
        public static final String f38409d = "PAGE_CHARACTERS_EXCEEDED";

        public C15814c() {
            super(null);
        }

        public String toString() {
            return "PageCharactersExceeded";
        }
    }

    /* renamed from: o.oic$d */
    public static final class C15815d extends oic {

        /* renamed from: c */
        public static final C15815d f38410c = new C15815d();

        /* renamed from: d */
        public static final String f38411d = "PAGE_SIZE_EXCEEDED";

        public C15815d() {
            super(null);
        }

        public String toString() {
            return "PageSizeExceeded";
        }
    }

    /* renamed from: o.oic$e */
    public static final class C15816e extends oic {

        /* renamed from: c */
        public final String f38412c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15816e(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f38412c = str;
        }

        /* renamed from: a */
        public String m42268a() {
            return this.f38412c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15816e) && sq8.m48644c(this.f38412c, ((C15816e) obj).f38412c);
        }

        public int hashCode() {
            return this.f38412c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m42268a() + ')';
        }
    }

    /* renamed from: o.oic$f */
    public static final class C15817f extends oic {

        /* renamed from: c */
        public static final C15817f f38413c = new C15817f();

        /* renamed from: d */
        public static final String f38414d = "TEXTRACT_BAD_PAGE";

        public C15817f() {
            super(null);
        }

        public String toString() {
            return "TextractBadPage";
        }
    }

    /* renamed from: o.oic$g */
    public static final class C15818g extends oic {

        /* renamed from: c */
        public static final C15818g f38415c = new C15818g();

        /* renamed from: d */
        public static final String f38416d = "TEXTRACT_PROVISIONED_THROUGHPUT_EXCEEDED";

        public C15818g() {
            super(null);
        }

        public String toString() {
            return "TextractProvisionedThroughputExceeded";
        }
    }

    public oic() {
    }

    public /* synthetic */ oic(id5 id5Var) {
        this();
    }
}
