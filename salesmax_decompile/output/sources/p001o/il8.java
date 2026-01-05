package p001o;

/* loaded from: classes6.dex */
public class il8 implements Iterable, sb9 {

    /* renamed from: d */
    public static final C14312a f28814d = new C14312a(null);

    /* renamed from: a */
    public final int f28815a;

    /* renamed from: b */
    public final int f28816b;

    /* renamed from: c */
    public final int f28817c;

    /* renamed from: o.il8$a */
    public static final class C14312a {
        public C14312a() {
        }

        public /* synthetic */ C14312a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final il8 m32264a(int i, int i2, int i3) {
            return new il8(i, i2, i3);
        }
    }

    public il8(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f28815a = i;
        this.f28816b = cnd.m21478c(i, i2, i3);
        this.f28817c = i3;
    }

    /* renamed from: e */
    public final int m32260e() {
        return this.f28815a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof il8) {
            if (!isEmpty() || !((il8) obj).isEmpty()) {
                il8 il8Var = (il8) obj;
                if (this.f28815a != il8Var.f28815a || this.f28816b != il8Var.f28816b || this.f28817c != il8Var.f28817c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f28815a * 31) + this.f28816b) * 31) + this.f28817c;
    }

    public boolean isEmpty() {
        if (this.f28817c > 0) {
            if (this.f28815a > this.f28816b) {
                return true;
            }
        } else if (this.f28815a < this.f28816b) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int m32261j() {
        return this.f28816b;
    }

    /* renamed from: n */
    public final int m32262n() {
        return this.f28817c;
    }

    @Override // java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public dl8 iterator() {
        return new jl8(this.f28815a, this.f28816b, this.f28817c);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f28817c > 0) {
            sb = new StringBuilder();
            sb.append(this.f28815a);
            sb.append("..");
            sb.append(this.f28816b);
            sb.append(" step ");
            i = this.f28817c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f28815a);
            sb.append(" downTo ");
            sb.append(this.f28816b);
            sb.append(" step ");
            i = -this.f28817c;
        }
        sb.append(i);
        return sb.toString();
    }
}
