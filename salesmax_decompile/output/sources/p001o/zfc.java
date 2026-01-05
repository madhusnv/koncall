package p001o;

/* loaded from: classes3.dex */
public abstract class zfc {

    /* renamed from: o.zfc$a */
    public static final class C18629a extends zfc {

        /* renamed from: a */
        public final int f57133a;

        /* renamed from: b */
        public final Throwable f57134b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18629a(int i, Throwable th) {
            super(null);
            sq8.m48649h(th, "exception");
            this.f57133a = i;
            this.f57134b = th;
        }

        /* renamed from: a */
        public final Throwable m59377a() {
            return this.f57134b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18629a)) {
                return false;
            }
            C18629a c18629a = (C18629a) obj;
            return this.f57133a == c18629a.f57133a && sq8.m48644c(this.f57134b, c18629a.f57134b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f57133a) * 31) + this.f57134b.hashCode();
        }

        public String toString() {
            return "Exception(attempts=" + this.f57133a + ", exception=" + this.f57134b + ')';
        }
    }

    /* renamed from: o.zfc$b */
    public static final class C18630b extends zfc {

        /* renamed from: a */
        public final int f57135a;

        /* renamed from: b */
        public final Object f57136b;

        public C18630b(int i, Object obj) {
            super(null);
            this.f57135a = i;
            this.f57136b = obj;
        }

        /* renamed from: a */
        public final Object m59378a() {
            return this.f57136b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18630b)) {
                return false;
            }
            C18630b c18630b = (C18630b) obj;
            return this.f57135a == c18630b.f57135a && sq8.m48644c(this.f57136b, c18630b.f57136b);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f57135a) * 31;
            Object obj = this.f57136b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Response(attempts=" + this.f57135a + ", response=" + this.f57136b + ')';
        }
    }

    public zfc() {
    }

    public /* synthetic */ zfc(id5 id5Var) {
        this();
    }
}
