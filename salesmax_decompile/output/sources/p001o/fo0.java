package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class fo0 {

    /* renamed from: a */
    public static final C13496b f23748a = new C13496b(null);

    /* renamed from: b */
    public static final List f23749b = ch3.m21249n(C13495a.f23750c, C13497c.f23752c);

    /* renamed from: o.fo0$a */
    public static final class C13495a extends fo0 {

        /* renamed from: c */
        public static final C13495a f23750c = new C13495a();

        /* renamed from: d */
        public static final String f23751d = "ARCHIVE_ACCESS";

        public C13495a() {
            super(null);
        }

        public String toString() {
            return "ArchiveAccess";
        }
    }

    /* renamed from: o.fo0$b */
    public static final class C13496b {
        public C13496b() {
        }

        public /* synthetic */ C13496b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final fo0 m27163a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "ARCHIVE_ACCESS") ? C13495a.f23750c : sq8.m48644c(str, "DEEP_ARCHIVE_ACCESS") ? C13497c.f23752c : new C13498d(str);
        }
    }

    /* renamed from: o.fo0$c */
    public static final class C13497c extends fo0 {

        /* renamed from: c */
        public static final C13497c f23752c = new C13497c();

        /* renamed from: d */
        public static final String f23753d = "DEEP_ARCHIVE_ACCESS";

        public C13497c() {
            super(null);
        }

        public String toString() {
            return "DeepArchiveAccess";
        }
    }

    /* renamed from: o.fo0$d */
    public static final class C13498d extends fo0 {

        /* renamed from: c */
        public final String f23754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13498d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f23754c = str;
        }

        /* renamed from: a */
        public String m27164a() {
            return this.f23754c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13498d) && sq8.m48644c(this.f23754c, ((C13498d) obj).f23754c);
        }

        public int hashCode() {
            return this.f23754c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m27164a() + ')';
        }
    }

    public fo0() {
    }

    public /* synthetic */ fo0(id5 id5Var) {
        this();
    }
}
