package p001o;

/* loaded from: classes6.dex */
public final class k4g implements imf {

    /* renamed from: o.k4g$a */
    public static final class C14710a extends jgg implements nl7 {

        /* renamed from: a */
        public int f31460a;

        /* renamed from: b */
        public /* synthetic */ Object f31461b;

        /* renamed from: c */
        public final /* synthetic */ q4g f31462c;

        /* renamed from: o.k4g$a$a */
        public static final class a implements z37 {

            /* renamed from: a */
            public final /* synthetic */ dge f31463a;

            /* renamed from: b */
            public final /* synthetic */ z37 f31464b;

            /* renamed from: o.k4g$a$a$a, reason: collision with other inner class name */
            public static final class C19591a extends o64 {

                /* renamed from: a */
                public /* synthetic */ Object f31465a;

                /* renamed from: c */
                public int f31467c;

                public C19591a(n64 n64Var) {
                    super(n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    this.f31465a = obj;
                    this.f31467c |= Integer.MIN_VALUE;
                    return a.this.m34970a(0, this);
                }
            }

            public a(dge dgeVar, z37 z37Var) {
                this.f31463a = dgeVar;
                this.f31464b = z37Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object m34970a(int i, n64 n64Var) {
                C19591a c19591a;
                if (n64Var instanceof C19591a) {
                    c19591a = (C19591a) n64Var;
                    int i2 = c19591a.f31467c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c19591a.f31467c = i2 - Integer.MIN_VALUE;
                    } else {
                        c19591a = new C19591a(n64Var);
                    }
                }
                Object obj = c19591a.f31465a;
                Object objM51918f = uq8.m51918f();
                int i3 = c19591a.f31467c;
                if (i3 == 0) {
                    wre.m54934b(obj);
                    if (i > 0) {
                        dge dgeVar = this.f31463a;
                        if (!dgeVar.f19803a) {
                            dgeVar.f19803a = true;
                            z37 z37Var = this.f31464b;
                            gmf gmfVar = gmf.START;
                            c19591a.f31467c = 1;
                            if (z37Var.emit(gmfVar, c19591a) == objM51918f) {
                                return objM51918f;
                            }
                        }
                    }
                    return y3i.f54824a;
                }
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return y3i.f54824a;
            }

            @Override // p001o.z37
            public /* bridge */ /* synthetic */ Object emit(Object obj, n64 n64Var) {
                return m34970a(((Number) obj).intValue(), n64Var);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14710a(q4g q4gVar, n64 n64Var) {
            super(2, n64Var);
            this.f31462c = q4gVar;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14710a c14710a = new C14710a(this.f31462c, n64Var);
            c14710a.f31461b = obj;
            return c14710a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f31460a;
            if (i == 0) {
                wre.m54934b(obj);
                z37 z37Var = (z37) this.f31461b;
                dge dgeVar = new dge();
                q4g q4gVar = this.f31462c;
                a aVar = new a(dgeVar, z37Var);
                this.f31460a = 1;
                if (q4gVar.mo9775a(aVar, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            throw new qe9();
        }

        @Override // p001o.nl7
        public final Object invoke(z37 z37Var, n64 n64Var) {
            return ((C14710a) create(z37Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @Override // p001o.imf
    /* renamed from: a */
    public v37 mo32413a(q4g q4gVar) {
        return e47.m24281o(new C14710a(q4gVar, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
