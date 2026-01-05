package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class vke {

    /* renamed from: a */
    public static final C17605a f50471a = new C17605a(null);

    /* renamed from: b */
    public static final List f50472b = ch3.m21249n(C17606b.f50473c, C17607c.f50475c, C17608d.f50477c, C17609e.f50479c, C17610f.f50481c);

    /* renamed from: o.vke$a */
    public static final class C17605a {
        public C17605a() {
        }

        public /* synthetic */ C17605a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final vke m52901a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case 35394935:
                    if (str.equals("PENDING")) {
                        return C17609e.f50479c;
                    }
                    break;
                case 183181625:
                    if (str.equals("COMPLETE")) {
                        return C17606b.f50473c;
                    }
                    break;
                case 1383663147:
                    if (str.equals("COMPLETED")) {
                        return C17607c.f50475c;
                    }
                    break;
                case 1812487320:
                    if (str.equals("REPLICA")) {
                        return C17610f.f50481c;
                    }
                    break;
                case 2066319421:
                    if (str.equals("FAILED")) {
                        return C17608d.f50477c;
                    }
                    break;
            }
            return new C17611g(str);
        }
    }

    /* renamed from: o.vke$b */
    public static final class C17606b extends vke {

        /* renamed from: c */
        public static final C17606b f50473c = new C17606b();

        /* renamed from: d */
        public static final String f50474d = "COMPLETE";

        public C17606b() {
            super(null);
        }

        public String toString() {
            return "Complete";
        }
    }

    /* renamed from: o.vke$c */
    public static final class C17607c extends vke {

        /* renamed from: c */
        public static final C17607c f50475c = new C17607c();

        /* renamed from: d */
        public static final String f50476d = "COMPLETED";

        public C17607c() {
            super(null);
        }

        public String toString() {
            return "Completed";
        }
    }

    /* renamed from: o.vke$d */
    public static final class C17608d extends vke {

        /* renamed from: c */
        public static final C17608d f50477c = new C17608d();

        /* renamed from: d */
        public static final String f50478d = "FAILED";

        public C17608d() {
            super(null);
        }

        public String toString() {
            return "Failed";
        }
    }

    /* renamed from: o.vke$e */
    public static final class C17609e extends vke {

        /* renamed from: c */
        public static final C17609e f50479c = new C17609e();

        /* renamed from: d */
        public static final String f50480d = "PENDING";

        public C17609e() {
            super(null);
        }

        public String toString() {
            return "Pending";
        }
    }

    /* renamed from: o.vke$f */
    public static final class C17610f extends vke {

        /* renamed from: c */
        public static final C17610f f50481c = new C17610f();

        /* renamed from: d */
        public static final String f50482d = "REPLICA";

        public C17610f() {
            super(null);
        }

        public String toString() {
            return "Replica";
        }
    }

    /* renamed from: o.vke$g */
    public static final class C17611g extends vke {

        /* renamed from: c */
        public final String f50483c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17611g(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f50483c = str;
        }

        /* renamed from: a */
        public String m52902a() {
            return this.f50483c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17611g) && sq8.m48644c(this.f50483c, ((C17611g) obj).f50483c);
        }

        public int hashCode() {
            return this.f50483c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m52902a() + ')';
        }
    }

    public vke() {
    }

    public /* synthetic */ vke(id5 id5Var) {
        this();
    }
}
