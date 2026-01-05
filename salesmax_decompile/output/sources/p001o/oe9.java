package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class oe9 {

    /* renamed from: a */
    public static final C15771a f38216a = new C15771a(null);

    /* renamed from: b */
    public static final List f38217b = ch3.m21249n(C15772b.f38218c, C15773c.f38220c, C15774d.f38222c, C15776f.f38225c);

    /* renamed from: o.oe9$a */
    public static final class C15771a {
        public C15771a() {
        }

        public /* synthetic */ C15771a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* renamed from: a */
        public final oe9 m42120a(String str) {
            sq8.m48649h(str, "value");
            switch (str.hashCode()) {
                case -1616918290:
                    if (str.equals("Nonbinary")) {
                        return C15774d.f38222c;
                    }
                    break;
                case -151361098:
                    if (str.equals("Unlisted")) {
                        return C15776f.f38225c;
                    }
                    break;
                case 2390573:
                    if (str.equals("Male")) {
                        return C15773c.f38220c;
                    }
                    break;
                case 2100660076:
                    if (str.equals("Female")) {
                        return C15772b.f38218c;
                    }
                    break;
            }
            return new C15775e(str);
        }
    }

    /* renamed from: o.oe9$b */
    public static final class C15772b extends oe9 {

        /* renamed from: c */
        public static final C15772b f38218c = new C15772b();

        /* renamed from: d */
        public static final String f38219d = "Female";

        public C15772b() {
            super(null);
        }

        public String toString() {
            return "Female";
        }
    }

    /* renamed from: o.oe9$c */
    public static final class C15773c extends oe9 {

        /* renamed from: c */
        public static final C15773c f38220c = new C15773c();

        /* renamed from: d */
        public static final String f38221d = "Male";

        public C15773c() {
            super(null);
        }

        public String toString() {
            return "Male";
        }
    }

    /* renamed from: o.oe9$d */
    public static final class C15774d extends oe9 {

        /* renamed from: c */
        public static final C15774d f38222c = new C15774d();

        /* renamed from: d */
        public static final String f38223d = "Nonbinary";

        public C15774d() {
            super(null);
        }

        public String toString() {
            return "Nonbinary";
        }
    }

    /* renamed from: o.oe9$e */
    public static final class C15775e extends oe9 {

        /* renamed from: c */
        public final String f38224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15775e(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f38224c = str;
        }

        /* renamed from: a */
        public String m42121a() {
            return this.f38224c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C15775e) && sq8.m48644c(this.f38224c, ((C15775e) obj).f38224c);
        }

        public int hashCode() {
            return this.f38224c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + m42121a() + ')';
        }
    }

    /* renamed from: o.oe9$f */
    public static final class C15776f extends oe9 {

        /* renamed from: c */
        public static final C15776f f38225c = new C15776f();

        /* renamed from: d */
        public static final String f38226d = "Unlisted";

        public C15776f() {
            super(null);
        }

        public String toString() {
            return "Unlisted";
        }
    }

    public oe9() {
    }

    public /* synthetic */ oe9(id5 id5Var) {
        this();
    }
}
