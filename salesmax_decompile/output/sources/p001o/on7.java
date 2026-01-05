package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class on7 {

    /* renamed from: a */
    public static final C15845a f38621a = new C15845a(null);

    /* renamed from: b */
    public static final List f38622b = ch3.m21249n(C15846b.f38623c, C15847c.f38625c);

    /* renamed from: o.on7$a */
    public static final class C15845a {
        public C15845a() {
        }

        public /* synthetic */ C15845a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final on7 m42461a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "Female") ? C15846b.f38623c : sq8.m48644c(str, "Male") ? C15847c.f38625c : new C15848d(str);
        }
    }

    /* renamed from: o.on7$b */
    public static final class C15846b extends on7 {

        /* renamed from: c */
        public static final C15846b f38623c = new C15846b();

        /* renamed from: d */
        public static final String f38624d = "Female";

        public C15846b() {
            super(null);
        }

        public String toString() {
            return "Female";
        }
    }

    /* renamed from: o.on7$c */
    public static final class C15847c extends on7 {

        /* renamed from: c */
        public static final C15847c f38625c = new C15847c();

        /* renamed from: d */
        public static final String f38626d = "Male";

        public C15847c() {
            super(null);
        }

        public String toString() {
            return "Male";
        }
    }

    /* renamed from: o.on7$d */
    public static final class C15848d extends on7 {

        /* renamed from: c */
        public final String f38627c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15848d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f38627c = str;
        }

        /* renamed from: a */
        public String m42462a() {
            return this.f38627c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15848d) && sq8.m48644c(this.f38627c, ((C15848d) obj).f38627c);
        }

        public int hashCode() {
            return this.f38627c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m42462a() + ')';
        }
    }

    public on7() {
    }

    public /* synthetic */ on7(id5 id5Var) {
        this();
    }
}
