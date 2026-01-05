package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class rn8 {

    /* renamed from: a */
    public static final C16633b f43848a = new C16633b(null);

    /* renamed from: b */
    public static final List f43849b = ch3.m21249n(C16632a.f43850c, C16634c.f43852c);

    /* renamed from: o.rn8$a */
    public static final class C16632a extends rn8 {

        /* renamed from: c */
        public static final C16632a f43850c = new C16632a();

        /* renamed from: d */
        public static final String f43851d = "ARCHIVE_ACCESS";

        public C16632a() {
            super(null);
        }

        public String toString() {
            return "ArchiveAccess";
        }
    }

    /* renamed from: o.rn8$b */
    public static final class C16633b {
        public C16633b() {
        }

        public /* synthetic */ C16633b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final rn8 m47002a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "ARCHIVE_ACCESS") ? C16632a.f43850c : sq8.m48644c(str, "DEEP_ARCHIVE_ACCESS") ? C16634c.f43852c : new C16635d(str);
        }
    }

    /* renamed from: o.rn8$c */
    public static final class C16634c extends rn8 {

        /* renamed from: c */
        public static final C16634c f43852c = new C16634c();

        /* renamed from: d */
        public static final String f43853d = "DEEP_ARCHIVE_ACCESS";

        public C16634c() {
            super(null);
        }

        public String toString() {
            return "DeepArchiveAccess";
        }
    }

    /* renamed from: o.rn8$d */
    public static final class C16635d extends rn8 {

        /* renamed from: c */
        public final String f43854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16635d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f43854c = str;
        }

        /* renamed from: a */
        public String m47003a() {
            return this.f43854c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16635d) && sq8.m48644c(this.f43854c, ((C16635d) obj).f43854c);
        }

        public int hashCode() {
            return this.f43854c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m47003a() + ')';
        }
    }

    public rn8() {
    }

    public /* synthetic */ rn8(id5 id5Var) {
        this();
    }
}
