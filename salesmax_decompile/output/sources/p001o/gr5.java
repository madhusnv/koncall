package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class gr5 {

    /* renamed from: a */
    public static final C13813a f25681a = new C13813a(null);

    /* renamed from: b */
    public static final List f25682b = ch3.m21249n(C13814b.f25683c, C13815c.f25685c);

    /* renamed from: o.gr5$a */
    public static final class C13813a {
        public C13813a() {
        }

        public /* synthetic */ C13813a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.gr5$b */
    public static final class C13814b extends gr5 {

        /* renamed from: c */
        public static final C13814b f25683c = new C13814b();

        /* renamed from: d */
        public static final String f25684d = "not_remembered";

        public C13814b() {
            super(null);
        }

        @Override // p001o.gr5
        /* renamed from: a */
        public String mo29343a() {
            return f25684d;
        }

        public String toString() {
            return "NotRemembered";
        }
    }

    /* renamed from: o.gr5$c */
    public static final class C13815c extends gr5 {

        /* renamed from: c */
        public static final C13815c f25685c = new C13815c();

        /* renamed from: d */
        public static final String f25686d = "remembered";

        public C13815c() {
            super(null);
        }

        @Override // p001o.gr5
        /* renamed from: a */
        public String mo29343a() {
            return f25686d;
        }

        public String toString() {
            return "Remembered";
        }
    }

    public gr5() {
    }

    public /* synthetic */ gr5(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo29343a();
}
