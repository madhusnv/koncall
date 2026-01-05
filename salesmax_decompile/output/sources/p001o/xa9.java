package p001o;

/* loaded from: classes3.dex */
public abstract class xa9 {

    /* renamed from: o.xa9$a */
    public static final class C18085a extends xa9 {

        /* renamed from: a */
        public static final C18085a f53423a = new C18085a();

        public C18085a() {
            super(null);
        }
    }

    /* renamed from: o.xa9$b */
    public static final class C18086b extends xa9 {

        /* renamed from: a */
        public static final C18086b f53424a = new C18086b();

        public C18086b() {
            super(null);
        }
    }

    /* renamed from: o.xa9$c */
    public static final class C18087c extends xa9 {

        /* renamed from: a */
        public final boolean f53425a;

        public C18087c(boolean z) {
            super(null);
            this.f53425a = z;
        }

        /* renamed from: a */
        public final boolean m55891a() {
            return this.f53425a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18087c) && this.f53425a == ((C18087c) obj).f53425a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f53425a);
        }

        @Override // p001o.xa9
        public String toString() {
            return "Bool(value=" + this.f53425a + ')';
        }
    }

    /* renamed from: o.xa9$d */
    public static final class C18088d extends xa9 {

        /* renamed from: a */
        public static final C18088d f53426a = new C18088d();

        public C18088d() {
            super(null);
        }
    }

    /* renamed from: o.xa9$e */
    public static final class C18089e extends xa9 {

        /* renamed from: a */
        public static final C18089e f53427a = new C18089e();

        public C18089e() {
            super(null);
        }
    }

    /* renamed from: o.xa9$f */
    public static final class C18090f extends xa9 {

        /* renamed from: a */
        public static final C18090f f53428a = new C18090f();

        public C18090f() {
            super(null);
        }
    }

    /* renamed from: o.xa9$g */
    public static final class C18091g extends xa9 {

        /* renamed from: a */
        public final String f53429a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18091g(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f53429a = str;
        }

        /* renamed from: a */
        public final String m55892a() {
            return this.f53429a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18091g) && sq8.m48644c(this.f53429a, ((C18091g) obj).f53429a);
        }

        public int hashCode() {
            return this.f53429a.hashCode();
        }

        @Override // p001o.xa9
        public String toString() {
            return "Name(value=" + this.f53429a + ')';
        }
    }

    /* renamed from: o.xa9$h */
    public static final class C18092h extends xa9 {

        /* renamed from: a */
        public static final C18092h f53430a = new C18092h();

        public C18092h() {
            super(null);
        }
    }

    /* renamed from: o.xa9$i */
    public static final class C18093i extends xa9 {

        /* renamed from: a */
        public final String f53431a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18093i(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f53431a = str;
        }

        /* renamed from: a */
        public final String m55893a() {
            return this.f53431a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18093i) && sq8.m48644c(this.f53431a, ((C18093i) obj).f53431a);
        }

        public int hashCode() {
            return this.f53431a.hashCode();
        }

        @Override // p001o.xa9
        public String toString() {
            return "Number(value=" + this.f53431a + ')';
        }
    }

    /* renamed from: o.xa9$j */
    public static final class C18094j extends xa9 {

        /* renamed from: a */
        public final String f53432a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18094j(String str) {
            super(null);
            sq8.m48649h(str, "value");
            this.f53432a = str;
        }

        /* renamed from: a */
        public final String m55894a() {
            return this.f53432a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18094j) && sq8.m48644c(this.f53432a, ((C18094j) obj).f53432a);
        }

        public int hashCode() {
            return this.f53432a.hashCode();
        }

        @Override // p001o.xa9
        public String toString() {
            return "String(value=" + this.f53432a + ')';
        }
    }

    public xa9() {
    }

    public /* synthetic */ xa9(id5 id5Var) {
        this();
    }

    public String toString() {
        if (sq8.m48644c(this, C18085a.f53423a)) {
            return "BeginArray";
        }
        if (sq8.m48644c(this, C18088d.f53426a)) {
            return "EndArray";
        }
        if (sq8.m48644c(this, C18086b.f53424a)) {
            return "BeginObject";
        }
        if (sq8.m48644c(this, C18090f.f53428a)) {
            return "EndObject";
        }
        if (this instanceof C18091g) {
            return "Name(" + ((C18091g) this).m55892a() + ')';
        }
        if (this instanceof C18094j) {
            return "String(" + ((C18094j) this).m55894a() + ')';
        }
        if (this instanceof C18093i) {
            return "Number(" + ((C18093i) this).m55893a() + ')';
        }
        if (this instanceof C18087c) {
            return "Bool(" + ((C18087c) this).m55891a() + ')';
        }
        if (sq8.m48644c(this, C18092h.f53430a)) {
            return "Null";
        }
        if (sq8.m48644c(this, C18089e.f53427a)) {
            return "EndDocument";
        }
        throw new szb();
    }
}
