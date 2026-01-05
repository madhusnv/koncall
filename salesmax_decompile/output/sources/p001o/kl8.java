package p001o;

/* loaded from: classes6.dex */
public final class kl8 extends il8 implements xb3 {

    /* renamed from: e */
    public static final C14856a f32367e = new C14856a(null);

    /* renamed from: f */
    public static final kl8 f32368f = new kl8(1, 0);

    /* renamed from: o.kl8$a */
    public static final class C14856a {
        public C14856a() {
        }

        public /* synthetic */ C14856a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kl8 m35832a() {
            return kl8.f32368f;
        }
    }

    public kl8(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // p001o.il8
    public boolean equals(Object obj) {
        if (obj instanceof kl8) {
            if (!isEmpty() || !((kl8) obj).isEmpty()) {
                kl8 kl8Var = (kl8) obj;
                if (m32260e() != kl8Var.m32260e() || m32261j() != kl8Var.m32261j()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p001o.il8
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m32260e() * 31) + m32261j();
    }

    @Override // p001o.il8, p001o.xb3
    public boolean isEmpty() {
        return m32260e() > m32261j();
    }

    /* renamed from: r */
    public boolean m35829r(int i) {
        return m32260e() <= i && i <= m32261j();
    }

    @Override // p001o.il8
    public String toString() {
        return m32260e() + ".." + m32261j();
    }

    @Override // p001o.xb3
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(m32261j());
    }

    @Override // p001o.xb3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(m32260e());
    }
}
