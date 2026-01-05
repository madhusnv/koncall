package p001o;

/* loaded from: classes6.dex */
public final class j7c extends a9 {

    /* renamed from: b */
    public final rl7 f29922b;

    /* renamed from: c */
    public final kh1 f29923c;

    /* renamed from: o.j7c$a */
    public static final class C14470a extends lf1 {

        /* renamed from: f */
        public final rl7 f29924f;

        /* renamed from: g */
        public final kh1 f29925g;

        /* renamed from: h */
        public Object f29926h;

        /* renamed from: q */
        public boolean f29927q;

        public C14470a(m9c m9cVar, rl7 rl7Var, kh1 kh1Var) {
            super(m9cVar);
            this.f29924f = rl7Var;
            this.f29925g = kh1Var;
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f33703d) {
                return;
            }
            if (this.f33704e != 0) {
                this.f33700a.mo16560e(obj);
                return;
            }
            try {
                Object objApply = this.f29924f.apply(obj);
                if (this.f29927q) {
                    boolean zMo35039a = this.f29925g.mo35039a(this.f29926h, objApply);
                    this.f29926h = objApply;
                    if (zMo35039a) {
                        return;
                    }
                } else {
                    this.f29927q = true;
                    this.f29926h = objApply;
                }
                this.f33700a.mo16560e(obj);
            } catch (Throwable th) {
                m37058f(th);
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            while (true) {
                Object objPoll = this.f33702c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f29924f.apply(objPoll);
                if (!this.f29927q) {
                    this.f29927q = true;
                    this.f29926h = objApply;
                    return objPoll;
                }
                if (!this.f29925g.mo35039a(this.f29926h, objApply)) {
                    this.f29926h = objApply;
                    return objPoll;
                }
                this.f29926h = objApply;
            }
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m37059h(i);
        }
    }

    public j7c(x8c x8cVar, rl7 rl7Var, kh1 kh1Var) {
        super(x8cVar);
        this.f29922b = rl7Var;
        this.f29923c = kh1Var;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C14470a(m9cVar, this.f29922b, this.f29923c));
    }
}
