package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class nfc {

    /* renamed from: a */
    public static final C15570a f36784a = new C15570a(null);

    /* renamed from: b */
    public static final List f36785b = ch3.m21249n(C15571b.f36786c, C15572c.f36788c, C15573d.f36790c, C15574e.f36792c);

    /* renamed from: o.nfc$a */
    public static final class C15570a {
        public C15570a() {
        }

        public /* synthetic */ C15570a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final nfc m40522a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case 407607813:
                    if (str.equals("ROTATE_180")) {
                        return C15572c.f36788c;
                    }
                    break;
                case 407608743:
                    if (str.equals("ROTATE_270")) {
                        return C15573d.f36790c;
                    }
                    break;
                case 742322764:
                    if (str.equals("ROTATE_0")) {
                        return C15571b.f36786c;
                    }
                    break;
                case 1537169531:
                    if (str.equals("ROTATE_90")) {
                        return C15574e.f36792c;
                    }
                    break;
            }
            return new C15575f(str);
        }
    }

    /* renamed from: o.nfc$b */
    public static final class C15571b extends nfc {

        /* renamed from: c */
        public static final C15571b f36786c = new C15571b();

        /* renamed from: d */
        public static final String f36787d = "ROTATE_0";

        public C15571b() {
            super(null);
        }

        public String toString() {
            return "Rotate0";
        }
    }

    /* renamed from: o.nfc$c */
    public static final class C15572c extends nfc {

        /* renamed from: c */
        public static final C15572c f36788c = new C15572c();

        /* renamed from: d */
        public static final String f36789d = "ROTATE_180";

        public C15572c() {
            super(null);
        }

        public String toString() {
            return "Rotate180";
        }
    }

    /* renamed from: o.nfc$d */
    public static final class C15573d extends nfc {

        /* renamed from: c */
        public static final C15573d f36790c = new C15573d();

        /* renamed from: d */
        public static final String f36791d = "ROTATE_270";

        public C15573d() {
            super(null);
        }

        public String toString() {
            return "Rotate270";
        }
    }

    /* renamed from: o.nfc$e */
    public static final class C15574e extends nfc {

        /* renamed from: c */
        public static final C15574e f36792c = new C15574e();

        /* renamed from: d */
        public static final String f36793d = "ROTATE_90";

        public C15574e() {
            super(null);
        }

        public String toString() {
            return "Rotate90";
        }
    }

    /* renamed from: o.nfc$f */
    public static final class C15575f extends nfc {

        /* renamed from: c */
        public final String f36794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15575f(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f36794c = str;
        }

        /* renamed from: a */
        public String m40523a() {
            return this.f36794c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15575f) && sq8.m48644c(this.f36794c, ((C15575f) obj).f36794c);
        }

        public int hashCode() {
            return this.f36794c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m40523a() + ')';
        }
    }

    public nfc() {
    }

    public /* synthetic */ nfc(id5 id5Var) {
        this();
    }
}
