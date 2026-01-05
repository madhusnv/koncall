package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public final class l4g implements imf {

    /* renamed from: b */
    public final long f33249b;

    /* renamed from: c */
    public final long f33250c;

    /* renamed from: o.l4g$a */
    public static final class C14997a extends jgg implements ql7 {

        /* renamed from: a */
        public int f33251a;

        /* renamed from: b */
        public /* synthetic */ Object f33252b;

        /* renamed from: c */
        public /* synthetic */ int f33253c;

        public C14997a(n64 n64Var) {
            super(3, n64Var);
        }

        /* renamed from: f */
        public final Object m36560f(z37 z37Var, int i, n64 n64Var) {
            C14997a c14997a = l4g.this.new C14997a(n64Var);
            c14997a.f33252b = z37Var;
            c14997a.f33253c = i;
            return c14997a.invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.ql7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m36560f((z37) obj, ((Number) obj2).intValue(), (n64) obj3);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            z37 z37Var;
            long j;
            gmf gmfVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f33251a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        z37Var = (z37) this.f33252b;
                        wre.m54934b(obj);
                        if (l4g.this.f33250c > 0) {
                            gmf gmfVar2 = gmf.STOP;
                            this.f33252b = z37Var;
                            this.f33251a = 3;
                            if (z37Var.emit(gmfVar2, this) == objM51918f) {
                                return objM51918f;
                            }
                            j = l4g.this.f33250c;
                            this.f33252b = z37Var;
                            this.f33251a = 4;
                            if (nk5.m40720b(j, this) == objM51918f) {
                            }
                        }
                        gmfVar = gmf.STOP_AND_RESET_REPLAY_CACHE;
                        this.f33252b = null;
                        this.f33251a = 5;
                        if (z37Var.emit(gmfVar, this) == objM51918f) {
                        }
                    } else if (i == 3) {
                        z37Var = (z37) this.f33252b;
                        wre.m54934b(obj);
                        j = l4g.this.f33250c;
                        this.f33252b = z37Var;
                        this.f33251a = 4;
                        if (nk5.m40720b(j, this) == objM51918f) {
                            return objM51918f;
                        }
                        gmfVar = gmf.STOP_AND_RESET_REPLAY_CACHE;
                        this.f33252b = null;
                        this.f33251a = 5;
                        if (z37Var.emit(gmfVar, this) == objM51918f) {
                        }
                    } else if (i == 4) {
                        z37Var = (z37) this.f33252b;
                        wre.m54934b(obj);
                        gmfVar = gmf.STOP_AND_RESET_REPLAY_CACHE;
                        this.f33252b = null;
                        this.f33251a = 5;
                        if (z37Var.emit(gmfVar, this) == objM51918f) {
                            return objM51918f;
                        }
                    } else if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                wre.m54934b(obj);
            } else {
                wre.m54934b(obj);
                z37Var = (z37) this.f33252b;
                if (this.f33253c > 0) {
                    gmf gmfVar3 = gmf.START;
                    this.f33251a = 1;
                    if (z37Var.emit(gmfVar3, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    long j2 = l4g.this.f33249b;
                    this.f33252b = z37Var;
                    this.f33251a = 2;
                    if (nk5.m40720b(j2, this) == objM51918f) {
                        return objM51918f;
                    }
                    if (l4g.this.f33250c > 0) {
                    }
                    gmfVar = gmf.STOP_AND_RESET_REPLAY_CACHE;
                    this.f33252b = null;
                    this.f33251a = 5;
                    if (z37Var.emit(gmfVar, this) == objM51918f) {
                    }
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.l4g$b */
    public static final class C14998b extends jgg implements nl7 {

        /* renamed from: a */
        public int f33255a;

        /* renamed from: b */
        public /* synthetic */ Object f33256b;

        public C14998b(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14998b c14998b = new C14998b(n64Var);
            c14998b.f33256b = obj;
            return c14998b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gmf gmfVar, n64 n64Var) {
            return ((C14998b) create(gmfVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f33255a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return ml1.m39301a(((gmf) this.f33256b) != gmf.START);
        }
    }

    public l4g(long j, long j2) {
        this.f33249b = j;
        this.f33250c = j2;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        }
        if (j2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
    }

    @Override // p001o.imf
    /* renamed from: a */
    public v37 mo32413a(q4g q4gVar) {
        return e47.m24274h(e47.m24276j(e47.m24288v(q4gVar, new C14997a(null)), new C14998b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof l4g) {
            l4g l4gVar = (l4g) obj;
            if (this.f33249b == l4gVar.f33249b && this.f33250c == l4gVar.f33250c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f33249b) * 31) + Long.hashCode(this.f33250c);
    }

    public String toString() {
        List listM18962d = bh3.m18962d(2);
        if (this.f33249b > 0) {
            listM18962d.add("stopTimeout=" + this.f33249b + "ms");
        }
        if (this.f33250c < Long.MAX_VALUE) {
            listM18962d.add("replayExpiration=" + this.f33250c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + kh3.p0(bh3.m18959a(listM18962d), null, null, null, 0, null, null, 63, null) + ')';
    }
}
