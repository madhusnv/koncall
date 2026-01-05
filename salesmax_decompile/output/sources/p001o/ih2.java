package p001o;

/* loaded from: classes6.dex */
public abstract class ih2 implements Iterable, sb9 {

    /* renamed from: d */
    public static final C14291a f28656d = new C14291a(null);

    /* renamed from: a */
    public final char f28657a;

    /* renamed from: b */
    public final char f28658b;

    /* renamed from: c */
    public final int f28659c;

    /* renamed from: o.ih2$a */
    public static final class C14291a {
        public C14291a() {
        }

        public /* synthetic */ C14291a(id5 id5Var) {
            this();
        }
    }

    public ih2(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f28657a = c;
        this.f28658b = (char) cnd.m21478c(c, c2, i);
        this.f28659c = i;
    }

    /* renamed from: e */
    public final char m32122e() {
        return this.f28657a;
    }

    /* renamed from: j */
    public final char m32123j() {
        return this.f28658b;
    }

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public fh2 iterator() {
        return new jh2(this.f28657a, this.f28658b, this.f28659c);
    }
}
