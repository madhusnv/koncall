package p001o;

/* loaded from: classes3.dex */
public abstract class dx7 {

    /* renamed from: o.dx7$a */
    public static final class C13050a extends dx7 {

        /* renamed from: a */
        public static final C13050a f20620a = new C13050a();

        public C13050a() {
            super(null);
        }
    }

    /* renamed from: o.dx7$b */
    public static final class C13051b extends AbstractC13052c {

        /* renamed from: b */
        public static final C13051b f20621b = new C13051b();

        public C13051b() {
            super("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", null);
        }
    }

    /* renamed from: o.dx7$c */
    public static abstract class AbstractC13052c extends dx7 {

        /* renamed from: a */
        public final String f20622a;

        public /* synthetic */ AbstractC13052c(String str, id5 id5Var) {
            this(str);
        }

        /* renamed from: a */
        public String m23921a() {
            return this.f20622a;
        }

        public AbstractC13052c(String str) {
            super(null);
            this.f20622a = str;
        }
    }

    /* renamed from: o.dx7$d */
    public static final class C13053d extends AbstractC13052c {

        /* renamed from: b */
        public static final C13053d f20623b = new C13053d();

        public C13053d() {
            super("STREAMING-AWS4-HMAC-SHA256-PAYLOAD", null);
        }
    }

    /* renamed from: o.dx7$e */
    public static final class C13054e extends AbstractC13052c {

        /* renamed from: b */
        public static final C13054e f20624b = new C13054e();

        public C13054e() {
            super("STREAMING-AWS4-HMAC-SHA256-PAYLOAD-TRAILER", null);
        }
    }

    /* renamed from: o.dx7$f */
    public static final class C13055f extends AbstractC13052c {

        /* renamed from: b */
        public static final C13055f f20625b = new C13055f();

        public C13055f() {
            super("STREAMING-UNSIGNED-PAYLOAD-TRAILER", null);
        }
    }

    /* renamed from: o.dx7$g */
    public static final class C13056g extends AbstractC13052c {

        /* renamed from: b */
        public static final C13056g f20626b = new C13056g();

        public C13056g() {
            super("UNSIGNED-PAYLOAD", null);
        }
    }

    public dx7() {
    }

    public /* synthetic */ dx7(id5 id5Var) {
        this();
    }
}
