package p001o;

/* loaded from: classes6.dex */
public abstract class sed {

    /* renamed from: o.sed$a */
    public static final class C16819a extends sed {

        /* renamed from: a */
        public final float f45320a;

        /* renamed from: b */
        public final float f45321b;

        public C16819a(float f, float f2) {
            super(null);
            this.f45320a = f;
            this.f45321b = f2;
        }

        /* renamed from: a */
        public final float m48280a() {
            return this.f45320a;
        }

        /* renamed from: b */
        public final float m48281b() {
            return this.f45321b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16819a)) {
                return false;
            }
            C16819a c16819a = (C16819a) obj;
            return Float.compare(this.f45320a, c16819a.f45320a) == 0 && Float.compare(this.f45321b, c16819a.f45321b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f45320a) * 31) + Float.hashCode(this.f45321b);
        }

        public String toString() {
            return "Absolute(x=" + this.f45320a + ", y=" + this.f45321b + ")";
        }
    }

    /* renamed from: o.sed$b */
    public static final class C16820b extends sed {

        /* renamed from: a */
        public final double f45322a;

        /* renamed from: b */
        public final double f45323b;

        public C16820b(double d, double d2) {
            super(null);
            this.f45322a = d;
            this.f45323b = d2;
        }

        /* renamed from: a */
        public final double m48282a() {
            return this.f45322a;
        }

        /* renamed from: b */
        public final double m48283b() {
            return this.f45323b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16820b)) {
                return false;
            }
            C16820b c16820b = (C16820b) obj;
            return Double.compare(this.f45322a, c16820b.f45322a) == 0 && Double.compare(this.f45323b, c16820b.f45323b) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.f45322a) * 31) + Double.hashCode(this.f45323b);
        }

        public String toString() {
            return "Relative(x=" + this.f45322a + ", y=" + this.f45323b + ")";
        }
    }

    public sed() {
    }

    public /* synthetic */ sed(id5 id5Var) {
        this();
    }
}
