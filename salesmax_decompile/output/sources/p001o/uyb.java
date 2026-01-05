package p001o;

/* loaded from: classes2.dex */
public abstract class uyb {

    /* renamed from: o.uyb$a */
    public static final class C17485a extends uyb {

        /* renamed from: a */
        public final String f49654a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17485a(String str) {
            super(null);
            sq8.m48649h(str, "name");
            this.f49654a = str;
        }

        /* renamed from: a */
        public final String m52158a() {
            return this.f49654a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C17485a) && sq8.m48644c(this.f49654a, ((C17485a) obj).f49654a);
        }

        public int hashCode() {
            return this.f49654a.hashCode();
        }

        public String toString() {
            return "Named(name=" + this.f49654a + ')';
        }
    }

    /* renamed from: o.uyb$b */
    public static final class C17486b extends uyb {

        /* renamed from: a */
        public static final C17486b f49655a = new C17486b();

        public C17486b() {
            super(null);
        }
    }

    public uyb() {
    }

    public /* synthetic */ uyb(id5 id5Var) {
        this();
    }
}
