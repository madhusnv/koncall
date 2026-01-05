package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class ajh {

    /* renamed from: a */
    public static final C12199a f14860a = new C12199a(null);

    /* renamed from: b */
    public static final List f14861b = ch3.m21249n(C12200b.f14862c, C12202d.f14865c);

    /* renamed from: o.ajh$a */
    public static final class C12199a {
        public C12199a() {
        }

        public /* synthetic */ C12199a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ajh m17259a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "LINE") ? C12200b.f14862c : sq8.m48644c(str, "WORD") ? C12202d.f14865c : new C12201c(str);
        }
    }

    /* renamed from: o.ajh$b */
    public static final class C12200b extends ajh {

        /* renamed from: c */
        public static final C12200b f14862c = new C12200b();

        /* renamed from: d */
        public static final String f14863d = "LINE";

        public C12200b() {
            super(null);
        }

        @Override // p001o.ajh
        /* renamed from: a */
        public String mo17258a() {
            return f14863d;
        }

        public String toString() {
            return "Line";
        }
    }

    /* renamed from: o.ajh$c */
    public static final class C12201c extends ajh {

        /* renamed from: c */
        public final String f14864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12201c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f14864c = str;
        }

        @Override // p001o.ajh
        /* renamed from: a */
        public String mo17258a() {
            return this.f14864c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12201c) && sq8.m48644c(this.f14864c, ((C12201c) obj).f14864c);
        }

        public int hashCode() {
            return this.f14864c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo17258a() + ')';
        }
    }

    /* renamed from: o.ajh$d */
    public static final class C12202d extends ajh {

        /* renamed from: c */
        public static final C12202d f14865c = new C12202d();

        /* renamed from: d */
        public static final String f14866d = "WORD";

        public C12202d() {
            super(null);
        }

        @Override // p001o.ajh
        /* renamed from: a */
        public String mo17258a() {
            return f14866d;
        }

        public String toString() {
            return "Word";
        }
    }

    public ajh() {
    }

    public /* synthetic */ ajh(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo17258a();
}
