package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class cj1 {

    /* renamed from: a */
    public static final C12690a f18233a = new C12690a(null);

    /* renamed from: b */
    public static final List f18234b = ch3.m21249n(C12691b.f18235c, C12693d.f18238c);

    /* renamed from: o.cj1$a */
    public static final class C12690a {
        public C12690a() {
        }

        public /* synthetic */ C12690a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final cj1 m21315a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "LINE") ? C12691b.f18235c : sq8.m48644c(str, "WORD") ? C12693d.f18238c : new C12692c(str);
        }
    }

    /* renamed from: o.cj1$b */
    public static final class C12691b extends cj1 {

        /* renamed from: c */
        public static final C12691b f18235c = new C12691b();

        /* renamed from: d */
        public static final String f18236d = "LINE";

        public C12691b() {
            super(null);
        }

        public String toString() {
            return "Line";
        }
    }

    /* renamed from: o.cj1$c */
    public static final class C12692c extends cj1 {

        /* renamed from: c */
        public final String f18237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12692c(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f18237c = str;
        }

        /* renamed from: a */
        public String m21316a() {
            return this.f18237c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12692c) && sq8.m48644c(this.f18237c, ((C12692c) obj).f18237c);
        }

        public int hashCode() {
            return this.f18237c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m21316a() + ')';
        }
    }

    /* renamed from: o.cj1$d */
    public static final class C12693d extends cj1 {

        /* renamed from: c */
        public static final C12693d f18238c = new C12693d();

        /* renamed from: d */
        public static final String f18239d = "WORD";

        public C12693d() {
            super(null);
        }

        public String toString() {
            return "Word";
        }
    }

    public cj1() {
    }

    public /* synthetic */ cj1(id5 id5Var) {
        this();
    }
}
