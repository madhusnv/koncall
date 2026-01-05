package p001o;

/* loaded from: classes6.dex */
public final class a67 extends s47 {

    /* renamed from: b */
    public final int f14196b;

    /* renamed from: c */
    public final int f14197c;

    /* renamed from: o.a67$a */
    public static abstract class AbstractC12098a extends tf1 {

        /* renamed from: a */
        public final int f14198a;

        /* renamed from: b */
        public int f14199b;

        /* renamed from: c */
        public volatile boolean f14200c;

        public AbstractC12098a(int i, int i2) {
            this.f14199b = i;
            this.f14198a = i2;
        }

        /* renamed from: a */
        public abstract void mo16514a();

        @Override // p001o.rtf
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer poll() {
            int i = this.f14199b;
            if (i == this.f14198a) {
                return null;
            }
            this.f14199b = i + 1;
            return Integer.valueOf(i);
        }

        /* renamed from: c */
        public abstract void mo16516c(long j);

        @Override // p001o.rag
        public final void cancel() {
            this.f14200c = true;
        }

        @Override // p001o.rtf
        public final void clear() {
            this.f14199b = this.f14198a;
        }

        @Override // p001o.rtf
        public final boolean isEmpty() {
            return this.f14199b == this.f14198a;
        }

        @Override // p001o.rag
        public final void request(long j) {
            if (wag.validate(j) && ka1.m35216a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo16514a();
                } else {
                    mo16516c(j);
                }
            }
        }

        @Override // p001o.f5e
        public final int requestFusion(int i) {
            return i & 1;
        }
    }

    /* renamed from: o.a67$b */
    public static final class C12099b extends AbstractC12098a {

        /* renamed from: d */
        public final kq3 f14201d;

        public C12099b(kq3 kq3Var, int i, int i2) {
            super(i, i2);
            this.f14201d = kq3Var;
        }

        @Override // p001o.a67.AbstractC12098a
        /* renamed from: a */
        public void mo16514a() {
            int i = this.f14198a;
            kq3 kq3Var = this.f14201d;
            for (int i2 = this.f14199b; i2 != i; i2++) {
                if (this.f14200c) {
                    return;
                }
                kq3Var.mo20248f(Integer.valueOf(i2));
            }
            if (this.f14200c) {
                return;
            }
            kq3Var.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            r9.f14199b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // p001o.a67.AbstractC12098a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo16516c(long j) {
            int i = this.f14198a;
            int i2 = this.f14199b;
            kq3 kq3Var = this.f14201d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.f14200c) {
                                return;
                            }
                            kq3Var.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f14200c) {
                            return;
                        }
                        if (kq3Var.mo20248f(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: o.a67$c */
    public static final class C12100c extends AbstractC12098a {

        /* renamed from: d */
        public final qag f14202d;

        public C12100c(qag qagVar, int i, int i2) {
            super(i, i2);
            this.f14202d = qagVar;
        }

        @Override // p001o.a67.AbstractC12098a
        /* renamed from: a */
        public void mo16514a() {
            int i = this.f14198a;
            qag qagVar = this.f14202d;
            for (int i2 = this.f14199b; i2 != i; i2++) {
                if (this.f14200c) {
                    return;
                }
                qagVar.mo18166e(Integer.valueOf(i2));
            }
            if (this.f14200c) {
                return;
            }
            qagVar.onComplete();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        
            r9.f14199b = r1;
            r10 = addAndGet(-r5);
         */
        @Override // p001o.a67.AbstractC12098a
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo16516c(long j) {
            int i = this.f14198a;
            int i2 = this.f14199b;
            qag qagVar = this.f14202d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.f14200c) {
                                return;
                            }
                            qagVar.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f14200c) {
                            return;
                        }
                        qagVar.mo18166e(Integer.valueOf(i2));
                        j2++;
                        i2++;
                    }
                }
            } while (j != 0);
        }
    }

    public a67(int i, int i2) {
        this.f14196b = i;
        this.f14197c = i + i2;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        if (qagVar instanceof kq3) {
            qagVar.mo18165b(new C12099b((kq3) qagVar, this.f14196b, this.f14197c));
        } else {
            qagVar.mo18165b(new C12100c(qagVar, this.f14196b, this.f14197c));
        }
    }
}
