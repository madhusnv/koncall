package p001o;

/* loaded from: classes3.dex */
public abstract class ysb {

    /* renamed from: o.ysb$a */
    public static final class C18482a extends ysb {

        /* renamed from: a */
        public final int f55899a;

        public C18482a(int i) {
            super(null);
            this.f55899a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18482a) && this.f55899a == ((C18482a) obj).f55899a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f55899a);
        }

        public String toString() {
            return "incomplete input needed (" + this.f55899a + ')';
        }
    }

    /* renamed from: o.ysb$b */
    public static final class C18483b extends ysb {

        /* renamed from: a */
        public static final C18483b f55900a = new C18483b();

        public C18483b() {
            super(null);
        }

        public String toString() {
            return "incomplete input";
        }
    }

    public ysb() {
    }

    public /* synthetic */ ysb(id5 id5Var) {
        this();
    }
}
