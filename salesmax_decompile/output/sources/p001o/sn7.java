package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class sn7 {

    /* renamed from: a */
    public static final C16873a f45667a = new C16873a(null);

    /* renamed from: b */
    public static final List f45668b = ch3.m21249n(C16874b.f45669c, C16875c.f45671c);

    /* renamed from: o.sn7$a */
    public static final class C16873a {
        public C16873a() {
        }

        public /* synthetic */ C16873a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final sn7 m48562a(String str) {
            sq8.m48649h(str, "value");
            return sq8.m48644c(str, "Female") ? C16874b.f45669c : sq8.m48644c(str, "Male") ? C16875c.f45671c : new C16876d(str);
        }
    }

    /* renamed from: o.sn7$b */
    public static final class C16874b extends sn7 {

        /* renamed from: c */
        public static final C16874b f45669c = new C16874b();

        /* renamed from: d */
        public static final String f45670d = "Female";

        public C16874b() {
            super(null);
        }

        @Override // p001o.sn7
        /* renamed from: a */
        public String mo48561a() {
            return f45670d;
        }

        public String toString() {
            return "Female";
        }
    }

    /* renamed from: o.sn7$c */
    public static final class C16875c extends sn7 {

        /* renamed from: c */
        public static final C16875c f45671c = new C16875c();

        /* renamed from: d */
        public static final String f45672d = "Male";

        public C16875c() {
            super(null);
        }

        @Override // p001o.sn7
        /* renamed from: a */
        public String mo48561a() {
            return f45672d;
        }

        public String toString() {
            return "Male";
        }
    }

    /* renamed from: o.sn7$d */
    public static final class C16876d extends sn7 {

        /* renamed from: c */
        public final String f45673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16876d(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f45673c = str;
        }

        @Override // p001o.sn7
        /* renamed from: a */
        public String mo48561a() {
            return this.f45673c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16876d) && sq8.m48644c(this.f45673c, ((C16876d) obj).f45673c);
        }

        public int hashCode() {
            return this.f45673c.hashCode();
        }

        public String toString() {
            return "SdkUnknown(" + mo48561a() + ')';
        }
    }

    public sn7() {
    }

    public /* synthetic */ sn7(id5 id5Var) {
        this();
    }

    /* renamed from: a */
    public abstract String mo48561a();
}
