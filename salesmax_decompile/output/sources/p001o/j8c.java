package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class j8c extends a9 {

    /* renamed from: b */
    public final rl7 f29962b;

    /* renamed from: o.j8c$a */
    public static final class C14474a extends lf1 {

        /* renamed from: f */
        public final rl7 f29963f;

        public C14474a(m9c m9cVar, rl7 rl7Var) {
            super(m9cVar);
            this.f29963f = rl7Var;
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f33703d) {
                return;
            }
            if (this.f33704e != 0) {
                this.f33700a.mo16560e(null);
                return;
            }
            try {
                Object objApply = this.f29963f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f33700a.mo16560e(objApply);
            } catch (Throwable th) {
                m37058f(th);
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            Object objPoll = this.f33702c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f29963f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m37059h(i);
        }
    }

    public j8c(x8c x8cVar, rl7 rl7Var) {
        super(x8cVar);
        this.f29962b = rl7Var;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C14474a(m9cVar, this.f29962b));
    }
}
