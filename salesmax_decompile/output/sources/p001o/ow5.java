package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ow5 {

    /* renamed from: a */
    public static final C15900a f38992a = new C15900a(null);

    /* renamed from: b */
    public static final List f38993b = ch3.m21249n(C15901b.f38994c, C15902c.f38996c, C15903d.f38998c, C15904e.f39000c, C15905f.f39002c, C15907h.f39005c, C15908i.f39007c);

    /* renamed from: o.ow5$a */
    public static final class C15900a {
        public C15900a() {
        }

        public /* synthetic */ C15900a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final ow5 m42727a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1700247168:
                    if (str.equals("TEXTRACT_DETECT_DOCUMENT_TEXT_JSON")) {
                        return C15908i.f39007c;
                    }
                    break;
                case -704396118:
                    if (str.equals("NATIVE_PDF")) {
                        return C15903d.f38998c;
                    }
                    break;
                case 69775675:
                    if (str.equals("IMAGE")) {
                        return C15901b.f38994c;
                    }
                    break;
                case 422149603:
                    if (str.equals("SCANNED_PDF")) {
                        return C15905f.f39002c;
                    }
                    break;
                case 659660423:
                    if (str.equals("TEXTRACT_ANALYZE_DOCUMENT_JSON")) {
                        return C15907h.f39005c;
                    }
                    break;
                case 1536396962:
                    if (str.equals("PLAIN_TEXT")) {
                        return C15904e.f39000c;
                    }
                    break;
                case 2084931075:
                    if (str.equals("MS_WORD")) {
                        return C15902c.f38996c;
                    }
                    break;
            }
            return new C15906g(str);
        }
    }

    /* renamed from: o.ow5$b */
    public static final class C15901b extends ow5 {

        /* renamed from: c */
        public static final C15901b f38994c = new C15901b();

        /* renamed from: d */
        public static final String f38995d = "IMAGE";

        public C15901b() {
            super(null);
        }

        public String toString() {
            return "Image";
        }
    }

    /* renamed from: o.ow5$c */
    public static final class C15902c extends ow5 {

        /* renamed from: c */
        public static final C15902c f38996c = new C15902c();

        /* renamed from: d */
        public static final String f38997d = "MS_WORD";

        public C15902c() {
            super(null);
        }

        public String toString() {
            return "MsWord";
        }
    }

    /* renamed from: o.ow5$d */
    public static final class C15903d extends ow5 {

        /* renamed from: c */
        public static final C15903d f38998c = new C15903d();

        /* renamed from: d */
        public static final String f38999d = "NATIVE_PDF";

        public C15903d() {
            super(null);
        }

        public String toString() {
            return "NativePdf";
        }
    }

    /* renamed from: o.ow5$e */
    public static final class C15904e extends ow5 {

        /* renamed from: c */
        public static final C15904e f39000c = new C15904e();

        /* renamed from: d */
        public static final String f39001d = "PLAIN_TEXT";

        public C15904e() {
            super(null);
        }

        public String toString() {
            return "PlainText";
        }
    }

    /* renamed from: o.ow5$f */
    public static final class C15905f extends ow5 {

        /* renamed from: c */
        public static final C15905f f39002c = new C15905f();

        /* renamed from: d */
        public static final String f39003d = "SCANNED_PDF";

        public C15905f() {
            super(null);
        }

        public String toString() {
            return "ScannedPdf";
        }
    }

    /* renamed from: o.ow5$g */
    public static final class C15906g extends ow5 {

        /* renamed from: c */
        public final String f39004c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15906g(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f39004c = str;
        }

        /* renamed from: a */
        public String m42728a() {
            return this.f39004c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15906g) && sq8.m48644c(this.f39004c, ((C15906g) obj).f39004c);
        }

        public int hashCode() {
            return this.f39004c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m42728a() + ')';
        }
    }

    /* renamed from: o.ow5$h */
    public static final class C15907h extends ow5 {

        /* renamed from: c */
        public static final C15907h f39005c = new C15907h();

        /* renamed from: d */
        public static final String f39006d = "TEXTRACT_ANALYZE_DOCUMENT_JSON";

        public C15907h() {
            super(null);
        }

        public String toString() {
            return "TextractAnalyzeDocumentJson";
        }
    }

    /* renamed from: o.ow5$i */
    public static final class C15908i extends ow5 {

        /* renamed from: c */
        public static final C15908i f39007c = new C15908i();

        /* renamed from: d */
        public static final String f39008d = "TEXTRACT_DETECT_DOCUMENT_TEXT_JSON";

        public C15908i() {
            super(null);
        }

        public String toString() {
            return "TextractDetectDocumentTextJson";
        }
    }

    public ow5() {
    }

    public /* synthetic */ ow5(id5 id5Var) {
        this();
    }
}
