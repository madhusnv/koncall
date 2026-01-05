package p001o;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class r57 extends o7 {

    /* renamed from: c */
    public final rl7 f43022c;

    /* renamed from: o.r57$a */
    public static final class C16540a extends kf1 {

        /* renamed from: f */
        public final rl7 f43023f;

        public C16540a(kq3 kq3Var, rl7 rl7Var) {
            super(kq3Var);
            this.f43023f = rl7Var;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f32132d) {
                return;
            }
            if (this.f32133e != 0) {
                this.f32129a.mo18166e(null);
                return;
            }
            try {
                Object objApply = this.f43023f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f32129a.mo18166e(objApply);
            } catch (Throwable th) {
                m35567d(th);
            }
        }

        @Override // p001o.kq3
        /* renamed from: f */
        public boolean mo20248f(Object obj) {
            if (this.f32132d) {
                return true;
            }
            if (this.f32133e != 0) {
                this.f32129a.mo20248f(null);
                return true;
            }
            try {
                Object objApply = this.f43023f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return this.f32129a.mo20248f(objApply);
            } catch (Throwable th) {
                m35567d(th);
                return true;
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            Object objPoll = this.f32131c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f43023f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m35568g(i);
        }
    }

    /* renamed from: o.r57$b */
    public static final class C16541b extends mf1 {

        /* renamed from: f */
        public final rl7 f43024f;

        public C16541b(qag qagVar, rl7 rl7Var) {
            super(qagVar);
            this.f43024f = rl7Var;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f35327d) {
                return;
            }
            if (this.f35328e != 0) {
                this.f35324a.mo18166e(null);
                return;
            }
            try {
                Object objApply = this.f43024f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                this.f35324a.mo18166e(objApply);
            } catch (Throwable th) {
                m38867d(th);
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            Object objPoll = this.f35326c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f43024f.apply(objPoll);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            return objApply;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m38868g(i);
        }
    }

    public r57(s47 s47Var, rl7 rl7Var) {
        super(s47Var);
        this.f43022c = rl7Var;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        if (qagVar instanceof kq3) {
            this.f37840b.b0(new C16540a((kq3) qagVar, this.f43022c));
        } else {
            this.f37840b.b0(new C16541b(qagVar, this.f43022c));
        }
    }
}
