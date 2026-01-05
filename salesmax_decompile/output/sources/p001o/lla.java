package p001o;

/* loaded from: classes6.dex */
public abstract class lla implements Iterable, sb9 {

    /* renamed from: d */
    public static final C15101a f34009d = new C15101a(null);

    /* renamed from: a */
    public final long f34010a;

    /* renamed from: b */
    public final long f34011b;

    /* renamed from: c */
    public final long f34012c;

    /* renamed from: o.lla$a */
    public static final class C15101a {
        public C15101a() {
        }

        public /* synthetic */ C15101a(id5 id5Var) {
            this();
        }
    }

    public lla(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f34010a = j;
        this.f34011b = cnd.m21479d(j, j2, j3);
        this.f34012c = j3;
    }

    /* renamed from: e */
    public final long m37430e() {
        return this.f34010a;
    }

    /* renamed from: j */
    public final long m37431j() {
        return this.f34011b;
    }

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public jla iterator() {
        return new mla(this.f34010a, this.f34011b, this.f34012c);
    }
}
