package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ht8 {

    /* renamed from: a */
    public static final C14066a f27523a = new C14066a(null);

    /* renamed from: b */
    public static final List f27524b = ch3.m21249n(C14067b.f27525c, C14068c.f27527c, C14070e.f27530c, C14071f.f27532c);

    /* renamed from: o.ht8$a */
    public static final class C14066a {
        public C14066a() {
        }

        public /* synthetic */ C14066a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final ht8 m31117a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1459625052:
                    if (str.equals("TEXTRACT_ACCESS_DENIED")) {
                        return C14070e.f27530c;
                    }
                    break;
                case -1252939541:
                    if (str.equals("UNSUPPORTED_DOC_TYPE")) {
                        return C14071f.f27532c;
                    }
                    break;
                case -840911443:
                    if (str.equals("DOCUMENT_SIZE_EXCEEDED")) {
                        return C14067b.f27525c;
                    }
                    break;
                case 1536320295:
                    if (str.equals("PAGE_LIMIT_EXCEEDED")) {
                        return C14068c.f27527c;
                    }
                    break;
            }
            return new C14069d(str);
        }
    }

    /* renamed from: o.ht8$b */
    public static final class C14067b extends ht8 {

        /* renamed from: c */
        public static final C14067b f27525c = new C14067b();

        /* renamed from: d */
        public static final String f27526d = "DOCUMENT_SIZE_EXCEEDED";

        public C14067b() {
            super(null);
        }

        public String toString() {
            return "DocumentSizeExceeded";
        }
    }

    /* renamed from: o.ht8$c */
    public static final class C14068c extends ht8 {

        /* renamed from: c */
        public static final C14068c f27527c = new C14068c();

        /* renamed from: d */
        public static final String f27528d = "PAGE_LIMIT_EXCEEDED";

        public C14068c() {
            super(null);
        }

        public String toString() {
            return "PageLimitExceeded";
        }
    }

    /* renamed from: o.ht8$d */
    public static final class C14069d extends ht8 {

        /* renamed from: c */
        public final String f27529c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14069d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f27529c = str;
        }

        /* renamed from: a */
        public String m31118a() {
            return this.f27529c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14069d) && sq8.m48644c(this.f27529c, ((C14069d) obj).f27529c);
        }

        public int hashCode() {
            return this.f27529c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m31118a() + ')';
        }
    }

    /* renamed from: o.ht8$e */
    public static final class C14070e extends ht8 {

        /* renamed from: c */
        public static final C14070e f27530c = new C14070e();

        /* renamed from: d */
        public static final String f27531d = "TEXTRACT_ACCESS_DENIED";

        public C14070e() {
            super(null);
        }

        public String toString() {
            return "TextractAccessDenied";
        }
    }

    /* renamed from: o.ht8$f */
    public static final class C14071f extends ht8 {

        /* renamed from: c */
        public static final C14071f f27532c = new C14071f();

        /* renamed from: d */
        public static final String f27533d = "UNSUPPORTED_DOC_TYPE";

        public C14071f() {
            super(null);
        }

        public String toString() {
            return "UnsupportedDocType";
        }
    }

    public ht8() {
    }

    public /* synthetic */ ht8(id5 id5Var) {
        this();
    }
}
