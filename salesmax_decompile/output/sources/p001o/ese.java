package p001o;

/* loaded from: classes3.dex */
public abstract class ese {

    /* renamed from: o.ese$a */
    public static final class C13254a extends ese {

        /* renamed from: a */
        public final fse f22116a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13254a(fse fseVar) {
            super(null);
            sq8.m48649h(fseVar, "reason");
            this.f22116a = fseVar;
        }

        /* renamed from: a */
        public final fse m25527a() {
            return this.f22116a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13254a) && this.f22116a == ((C13254a) obj).f22116a;
        }

        public int hashCode() {
            return this.f22116a.hashCode();
        }

        public String toString() {
            return "RetryError(reason=" + this.f22116a + ')';
        }
    }

    /* renamed from: o.ese$b */
    public static final class C13255b extends ese {

        /* renamed from: a */
        public static final C13255b f22117a = new C13255b();

        public C13255b() {
            super(null);
        }
    }

    /* renamed from: o.ese$c */
    public static final class C13256c extends ese {

        /* renamed from: a */
        public static final C13256c f22118a = new C13256c();

        public C13256c() {
            super(null);
        }
    }

    public ese() {
    }

    public /* synthetic */ ese(id5 id5Var) {
        this();
    }
}
