package p001o;

/* loaded from: classes6.dex */
public final class kh2 extends ih2 implements xb3 {

    /* renamed from: e */
    public static final C14832a f32244e = new C14832a(null);

    /* renamed from: f */
    public static final kh2 f32245f = new kh2(1, 0);

    /* renamed from: o.kh2$a */
    public static final class C14832a {
        public C14832a() {
        }

        public /* synthetic */ C14832a(id5 id5Var) {
            this();
        }
    }

    public kh2(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof kh2) {
            if (!isEmpty() || !((kh2) obj).isEmpty()) {
                kh2 kh2Var = (kh2) obj;
                if (m32122e() != kh2Var.m32122e() || m32123j() != kh2Var.m32123j()) {
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
        return (m32122e() * 31) + m32123j();
    }

    @Override // p001o.xb3
    public boolean isEmpty() {
        return sq8.m48651j(m32122e(), m32123j()) > 0;
    }

    /* renamed from: o */
    public boolean m35702o(char c) {
        return sq8.m48651j(m32122e(), c) <= 0 && sq8.m48651j(c, m32123j()) <= 0;
    }

    @Override // p001o.xb3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Character getEndInclusive() {
        return Character.valueOf(m32123j());
    }

    @Override // p001o.xb3
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Character getStart() {
        return Character.valueOf(m32122e());
    }

    public String toString() {
        return m32122e() + ".." + m32123j();
    }
}
