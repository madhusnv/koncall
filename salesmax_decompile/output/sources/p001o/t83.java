package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class t83 {

    /* renamed from: a */
    public static final C17022a f46609a = new C17022a(null);

    /* renamed from: b */
    public static final List f46610b = ch3.m21249n(C17023b.f46611c, C17024c.f46613c, C17026e.f46616c, C17027f.f46618c);

    /* renamed from: o.t83$a */
    public static final class C17022a {
        public C17022a() {
        }

        public /* synthetic */ C17022a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final t83 m49557a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1850268089:
                    if (str.equals("SHA256")) {
                        return C17027f.f46618c;
                    }
                    break;
                case 2543909:
                    if (str.equals("SHA1")) {
                        return C17026e.f46616c;
                    }
                    break;
                case 64384787:
                    if (str.equals("CRC32")) {
                        return C17023b.f46611c;
                    }
                    break;
                case 1995928464:
                    if (str.equals("CRC32C")) {
                        return C17024c.f46613c;
                    }
                    break;
            }
            return new C17025d(str);
        }
    }

    /* renamed from: o.t83$b */
    public static final class C17023b extends t83 {

        /* renamed from: c */
        public static final C17023b f46611c = new C17023b();

        /* renamed from: d */
        public static final String f46612d = "CRC32";

        public C17023b() {
            super(null);
        }

        @Override // p001o.t83
        /* renamed from: a */
        public String mo49556a() {
            return f46612d;
        }

        public String toString() {
            return "Crc32";
        }
    }

    /* renamed from: o.t83$c */
    public static final class C17024c extends t83 {

        /* renamed from: c */
        public static final C17024c f46613c = new C17024c();

        /* renamed from: d */
        public static final String f46614d = "CRC32C";

        public C17024c() {
            super(null);
        }

        @Override // p001o.t83
        /* renamed from: a */
        public String mo49556a() {
            return f46614d;
        }

        public String toString() {
            return "Crc32C";
        }
    }

    /* renamed from: o.t83$d */
    public static final class C17025d extends t83 {

        /* renamed from: c */
        public final String f46615c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17025d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f46615c = str;
        }

        @Override // p001o.t83
        /* renamed from: a */
        public String mo49556a() {
            return this.f46615c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17025d) && sq8.m48644c(this.f46615c, ((C17025d) obj).f46615c);
        }

        public int hashCode() {
            return this.f46615c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo49556a() + ')';
        }
    }

    /* renamed from: o.t83$e */
    public static final class C17026e extends t83 {

        /* renamed from: c */
        public static final C17026e f46616c = new C17026e();

        /* renamed from: d */
        public static final String f46617d = "SHA1";

        public C17026e() {
            super(null);
        }

        @Override // p001o.t83
        /* renamed from: a */
        public String mo49556a() {
            return f46617d;
        }

        public String toString() {
            return "Sha1";
        }
    }

    /* renamed from: o.t83$f */
    public static final class C17027f extends t83 {

        /* renamed from: c */
        public static final C17027f f46618c = new C17027f();

        /* renamed from: d */
        public static final String f46619d = "SHA256";

        public C17027f() {
            super(null);
        }

        @Override // p001o.t83
        /* renamed from: a */
        public String mo49556a() {
            return f46619d;
        }

        public String toString() {
            return "Sha256";
        }
    }

    public t83() {
    }

    public /* synthetic */ t83(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo49556a();
}
