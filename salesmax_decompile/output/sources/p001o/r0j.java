package p001o;

/* loaded from: classes2.dex */
public class r0j implements u72 {

    /* renamed from: a */
    public final u72 f42673a;

    /* renamed from: b */
    public final wig f42674b;

    /* renamed from: c */
    public final long f42675c;

    public r0j(wig wigVar, u72 u72Var) {
        this(u72Var, wigVar, -1L);
    }

    @Override // p001o.u72
    /* renamed from: a */
    public wig mo46018a() {
        return this.f42674b;
    }

    @Override // p001o.u72
    /* renamed from: c */
    public s72 mo46019c() {
        u72 u72Var = this.f42673a;
        return u72Var != null ? u72Var.mo46019c() : s72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: d */
    public q72 mo46020d() {
        u72 u72Var = this.f42673a;
        return u72Var != null ? u72Var.mo46020d() : q72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: f */
    public m72 mo46021f() {
        u72 u72Var = this.f42673a;
        return u72Var != null ? u72Var.mo46021f() : m72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: g */
    public p72 mo46022g() {
        u72 u72Var = this.f42673a;
        return u72Var != null ? u72Var.mo46022g() : p72.UNKNOWN;
    }

    @Override // p001o.u72
    public long getTimestamp() {
        u72 u72Var = this.f42673a;
        if (u72Var != null) {
            return u72Var.getTimestamp();
        }
        long j = this.f42675c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // p001o.u72
    /* renamed from: h */
    public r72 mo46023h() {
        u72 u72Var = this.f42673a;
        return u72Var != null ? u72Var.mo46023h() : r72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: i */
    public o72 mo46024i() {
        u72 u72Var = this.f42673a;
        return u72Var != null ? u72Var.mo46024i() : o72.UNKNOWN;
    }

    @Override // p001o.u72
    /* renamed from: j */
    public n72 mo46025j() {
        u72 u72Var = this.f42673a;
        return u72Var != null ? u72Var.mo46025j() : n72.UNKNOWN;
    }

    public r0j(wig wigVar, long j) {
        this(null, wigVar, j);
    }

    public r0j(u72 u72Var, wig wigVar, long j) {
        this.f42673a = u72Var;
        this.f42674b = wigVar;
        this.f42675c = j;
    }
}
