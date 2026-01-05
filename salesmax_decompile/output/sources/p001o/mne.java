package p001o;

/* loaded from: classes2.dex */
public final class mne {

    /* renamed from: a */
    public final mp0 f35754a;

    /* renamed from: b */
    public final one f35755b;

    /* renamed from: c */
    public final int f35756c;

    public mne(mp0 mp0Var, one oneVar, lne lneVar, int i) {
        this.f35754a = mp0Var;
        this.f35755b = oneVar;
        this.f35756c = i;
    }

    /* renamed from: a */
    public int m39396a() {
        return this.f35756c;
    }

    /* renamed from: b */
    public mp0 m39397b() {
        return this.f35754a;
    }

    /* renamed from: c */
    public lne m39398c() {
        return null;
    }

    /* renamed from: d */
    public one m39399d() {
        return this.f35755b;
    }

    /* renamed from: o.mne$a */
    public static final class C15369a {

        /* renamed from: a */
        public mp0 f35757a;

        /* renamed from: b */
        public one f35758b;

        /* renamed from: c */
        public int f35759c;

        public C15369a() {
            this.f35757a = mp0.f35798c;
            this.f35758b = null;
            this.f35759c = 0;
        }

        /* renamed from: b */
        public static C15369a m39400b(mne mneVar) {
            return new C15369a(mneVar);
        }

        /* renamed from: a */
        public mne m39401a() {
            return new mne(this.f35757a, this.f35758b, null, this.f35759c);
        }

        /* renamed from: c */
        public C15369a m39402c(int i) {
            this.f35759c = i;
            return this;
        }

        /* renamed from: d */
        public C15369a m39403d(mp0 mp0Var) {
            this.f35757a = mp0Var;
            return this;
        }

        /* renamed from: e */
        public C15369a m39404e(one oneVar) {
            this.f35758b = oneVar;
            return this;
        }

        public C15369a(mne mneVar) {
            this.f35757a = mp0.f35798c;
            this.f35758b = null;
            this.f35759c = 0;
            this.f35757a = mneVar.m39397b();
            this.f35758b = mneVar.m39399d();
            mneVar.m39398c();
            this.f35759c = mneVar.m39396a();
        }
    }
}
