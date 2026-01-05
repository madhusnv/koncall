package p001o;

/* loaded from: classes6.dex */
public final class u7c extends a9 {

    /* renamed from: b */
    public final ggd f48490b;

    /* renamed from: o.u7c$a */
    public static final class C17323a extends lf1 {

        /* renamed from: f */
        public final ggd f48491f;

        public C17323a(m9c m9cVar, ggd ggdVar) {
            super(m9cVar);
            this.f48491f = ggdVar;
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f33704e != 0) {
                this.f33700a.mo16560e(null);
                return;
            }
            try {
                if (this.f48491f.test(obj)) {
                    this.f33700a.mo16560e(obj);
                }
            } catch (Throwable th) {
                m37058f(th);
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            Object objPoll;
            do {
                objPoll = this.f33702c.poll();
                if (objPoll == null) {
                    break;
                }
            } while (!this.f48491f.test(objPoll));
            return objPoll;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m37059h(i);
        }
    }

    public u7c(x8c x8cVar, ggd ggdVar) {
        super(x8cVar);
        this.f48490b = ggdVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C17323a(m9cVar, this.f48490b));
    }
}
