package p001o;

import ai.salesmax.model.LeadsSummary;

/* loaded from: classes.dex */
public final class bs1 {

    /* renamed from: a */
    public LeadsSummary f16741a;

    /* renamed from: b */
    public boolean f16742b;

    /* renamed from: c */
    public boolean f16743c;

    /* renamed from: d */
    public Long f16744d;

    /* renamed from: e */
    public boolean f16745e;

    /* renamed from: f */
    public String f16746f;

    /* renamed from: o.bs1$a */
    public static final class C12483a {

        /* renamed from: a */
        public LeadsSummary f16747a;

        /* renamed from: b */
        public boolean f16748b;

        /* renamed from: c */
        public boolean f16749c;

        /* renamed from: d */
        public boolean f16750d;

        /* renamed from: e */
        public Long f16751e;

        /* renamed from: c */
        public static /* synthetic */ C12483a m19674c(C12483a c12483a, LeadsSummary leadsSummary, Long l, int i, Object obj) {
            if ((i & 2) != 0) {
                l = null;
            }
            return c12483a.m19676b(leadsSummary, l);
        }

        /* renamed from: a */
        public final bs1 m19675a() {
            return new bs1(this.f16747a, this.f16748b, this.f16749c, this.f16751e, this.f16750d, null, 32, null);
        }

        /* renamed from: b */
        public final C12483a m19676b(LeadsSummary leadsSummary, Long l) {
            this.f16747a = leadsSummary;
            this.f16748b = true;
            if (l == null) {
                l = Long.valueOf(System.currentTimeMillis());
            }
            this.f16751e = l;
            return this;
        }

        /* renamed from: d */
        public final C12483a m19677d(Boolean bool) {
            if (bool != null) {
                this.f16750d = bool.booleanValue();
            }
            return this;
        }

        /* renamed from: e */
        public final C12483a m19678e(Boolean bool) {
            if (bool != null) {
                this.f16749c = bool.booleanValue();
            }
            return this;
        }
    }

    public bs1(LeadsSummary leadsSummary, boolean z, boolean z2, Long l, boolean z3, String str) {
        this.f16741a = leadsSummary;
        this.f16742b = z;
        this.f16743c = z2;
        this.f16744d = l;
        this.f16745e = z3;
        this.f16746f = str;
    }

    /* renamed from: a */
    public final LeadsSummary m19668a() {
        return this.f16741a;
    }

    /* renamed from: b */
    public final boolean m19669b() {
        return this.f16745e;
    }

    /* renamed from: c */
    public final boolean m19670c() {
        return this.f16743c;
    }

    /* renamed from: d */
    public final Long m19671d() {
        return this.f16744d;
    }

    /* renamed from: e */
    public final String m19672e() {
        return this.f16746f;
    }

    /* renamed from: f */
    public final boolean m19673f() {
        return this.f16742b;
    }

    public /* synthetic */ bs1(LeadsSummary leadsSummary, boolean z, boolean z2, Long l, boolean z3, String str, int i, id5 id5Var) {
        this(leadsSummary, z, z2, l, z3, (i & 32) != 0 ? null : str);
    }
}
