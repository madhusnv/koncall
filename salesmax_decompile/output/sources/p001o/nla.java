package p001o;

/* loaded from: classes6.dex */
public final class nla extends lla implements xb3 {

    /* renamed from: e */
    public static final C15604a f36995e = new C15604a(null);

    /* renamed from: f */
    public static final nla f36996f = new nla(1, 0);

    /* renamed from: o.nla$a */
    public static final class C15604a {
        public C15604a() {
        }

        public /* synthetic */ C15604a(id5 id5Var) {
            this();
        }
    }

    public nla(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof nla) {
            if (!isEmpty() || !((nla) obj).isEmpty()) {
                nla nlaVar = (nla) obj;
                if (m37430e() != nlaVar.m37430e() || m37431j() != nlaVar.m37431j()) {
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
        return (int) ((31 * (m37430e() ^ (m37430e() >>> 32))) + (m37431j() ^ (m37431j() >>> 32)));
    }

    @Override // p001o.xb3
    public boolean isEmpty() {
        return m37430e() > m37431j();
    }

    @Override // p001o.xb3
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(m37431j());
    }

    @Override // p001o.xb3
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(m37430e());
    }

    public String toString() {
        return m37430e() + ".." + m37431j();
    }
}
