package p001o;

/* loaded from: classes6.dex */
public final class o8c extends x6c {

    /* renamed from: a */
    public final int f37930a;

    /* renamed from: b */
    public final long f37931b;

    /* renamed from: o.o8c$a */
    public static final class C15734a extends nf1 {

        /* renamed from: a */
        public final m9c f37932a;

        /* renamed from: b */
        public final long f37933b;

        /* renamed from: c */
        public long f37934c;

        /* renamed from: d */
        public boolean f37935d;

        public C15734a(m9c m9cVar, long j, long j2) {
            this.f37932a = m9cVar;
            this.f37934c = j;
            this.f37933b = j2;
        }

        @Override // p001o.rtf
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer poll() {
            long j = this.f37934c;
            if (j != this.f37933b) {
                this.f37934c = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        @Override // p001o.rtf
        public void clear() {
            this.f37934c = this.f37933b;
            lazySet(1);
        }

        @Override // p001o.su5
        public void dispose() {
            set(1);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return this.f37934c == this.f37933b;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f37935d = true;
            return 1;
        }

        public void run() {
            if (this.f37935d) {
                return;
            }
            m9c m9cVar = this.f37932a;
            long j = this.f37933b;
            for (long j2 = this.f37934c; j2 != j && get() == 0; j2++) {
                m9cVar.mo16560e(Integer.valueOf((int) j2));
            }
            if (get() == 0) {
                lazySet(1);
                m9cVar.onComplete();
            }
        }
    }

    public o8c(int i, int i2) {
        this.f37930a = i;
        this.f37931b = i + i2;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C15734a c15734a = new C15734a(m9cVar, this.f37930a, this.f37931b);
        m9cVar.mo16559a(c15734a);
        c15734a.run();
    }
}
