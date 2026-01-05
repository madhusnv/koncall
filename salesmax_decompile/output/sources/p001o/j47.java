package p001o;

import p001o.vg2;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class j47 {

    /* renamed from: o.j47$a */
    public static final class C14446a extends jgg implements nl7 {

        /* renamed from: a */
        public int f29740a;

        /* renamed from: b */
        public /* synthetic */ Object f29741b;

        /* renamed from: c */
        public final /* synthetic */ long f29742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14446a(long j, n64 n64Var) {
            super(2, n64Var);
            this.f29742c = j;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14446a c14446a = new C14446a(this.f29742c, n64Var);
            c14446a.f29741b = obj;
            return c14446a;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:15:0x0040). Please report as a decompilation issue!!! */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p001o.uq8.m51918f()
                int r1 = r7.f29740a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L11
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
            L11:
                java.lang.Object r1 = r7.f29741b
                o.ljd r1 = (p001o.ljd) r1
                p001o.wre.m54934b(r8)
                goto L3f
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f29741b
                o.ljd r1 = (p001o.ljd) r1
                p001o.wre.m54934b(r8)
                r8 = r7
                goto L51
            L2a:
                p001o.wre.m54934b(r8)
                java.lang.Object r8 = r7.f29741b
                r1 = r8
                o.ljd r1 = (p001o.ljd) r1
                long r5 = r7.f29742c
                r7.f29741b = r1
                r7.f29740a = r4
                java.lang.Object r8 = p001o.nk5.m40720b(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                r8 = r7
            L40:
                o.fdf r4 = r1.mo35785t()
                o.y3i r5 = p001o.y3i.f54824a
                r8.f29741b = r1
                r8.f29740a = r3
                java.lang.Object r4 = r4.mo23475l(r5, r8)
                if (r4 != r0) goto L51
                return r0
            L51:
                long r4 = r8.f29742c
                r8.f29741b = r1
                r8.f29740a = r2
                java.lang.Object r4 = p001o.nk5.m40720b(r4, r8)
                if (r4 != r0) goto L40
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p001o.j47.C14446a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p001o.nl7
        public final Object invoke(ljd ljdVar, n64 n64Var) {
            return ((C14446a) create(ljdVar, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.j47$b */
    public static final class C14447b extends jgg implements ql7 {

        /* renamed from: a */
        public Object f29743a;

        /* renamed from: b */
        public Object f29744b;

        /* renamed from: c */
        public int f29745c;

        /* renamed from: d */
        public /* synthetic */ Object f29746d;

        /* renamed from: e */
        public /* synthetic */ Object f29747e;

        /* renamed from: f */
        public final /* synthetic */ long f29748f;

        /* renamed from: g */
        public final /* synthetic */ v37 f29749g;

        /* renamed from: o.j47$b$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f29750a;

            /* renamed from: b */
            public /* synthetic */ Object f29751b;

            /* renamed from: c */
            public final /* synthetic */ gge f29752c;

            /* renamed from: d */
            public final /* synthetic */ eee f29753d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(gge ggeVar, eee eeeVar, n64 n64Var) {
                super(2, n64Var);
                this.f29752c = ggeVar;
                this.f29753d = eeeVar;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                a aVar = new a(this.f29752c, this.f29753d, n64Var);
                aVar.f29751b = obj;
                return aVar;
            }

            /* renamed from: f */
            public final Object m33184f(Object obj, n64 n64Var) {
                return ((a) create(vg2.m52736b(obj), n64Var)).invokeSuspend(y3i.f54824a);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m33184f(((vg2) obj).m52745k(), (n64) obj2);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) throws Throwable {
                uq8.m51918f();
                if (this.f29750a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                Object objM52745k = ((vg2) this.f29751b).m52745k();
                gge ggeVar = this.f29752c;
                boolean z = objM52745k instanceof vg2.C17576c;
                if (!z) {
                    ggeVar.f25106a = objM52745k;
                }
                eee eeeVar = this.f29753d;
                if (z) {
                    Throwable thM52739e = vg2.m52739e(objM52745k);
                    if (thM52739e != null) {
                        throw thM52739e;
                    }
                    eeeVar.mo23471f(new a93());
                    ggeVar.f25106a = y4c.f54877c;
                }
                return y3i.f54824a;
            }
        }

        /* renamed from: o.j47$b$b */
        public static final class b extends jgg implements nl7 {

            /* renamed from: a */
            public int f29754a;

            /* renamed from: b */
            public final /* synthetic */ gge f29755b;

            /* renamed from: c */
            public final /* synthetic */ z37 f29756c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(gge ggeVar, z37 z37Var, n64 n64Var) {
                super(2, n64Var);
                this.f29755b = ggeVar;
                this.f29756c = z37Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new b(this.f29755b, this.f29756c, n64Var);
            }

            @Override // p001o.nl7
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(y3i y3iVar, n64 n64Var) {
                return ((b) create(y3iVar, n64Var)).invokeSuspend(y3i.f54824a);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f29754a;
                if (i == 0) {
                    wre.m54934b(obj);
                    gge ggeVar = this.f29755b;
                    Object obj2 = ggeVar.f25106a;
                    if (obj2 == null) {
                        return y3i.f54824a;
                    }
                    ggeVar.f25106a = null;
                    z37 z37Var = this.f29756c;
                    if (obj2 == y4c.f54875a) {
                        obj2 = null;
                    }
                    this.f29754a = 1;
                    if (z37Var.emit(obj2, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }
        }

        /* renamed from: o.j47$b$c */
        public static final class c extends jgg implements nl7 {

            /* renamed from: a */
            public int f29757a;

            /* renamed from: b */
            public /* synthetic */ Object f29758b;

            /* renamed from: c */
            public final /* synthetic */ v37 f29759c;

            /* renamed from: o.j47$b$c$a */
            public static final class a implements z37 {

                /* renamed from: a */
                public final /* synthetic */ ljd f29760a;

                /* renamed from: o.j47$b$c$a$a, reason: collision with other inner class name */
                public static final class C19590a extends o64 {

                    /* renamed from: a */
                    public /* synthetic */ Object f29761a;

                    /* renamed from: c */
                    public int f29763c;

                    public C19590a(n64 n64Var) {
                        super(n64Var);
                    }

                    @Override // p001o.vb1
                    public final Object invokeSuspend(Object obj) {
                        this.f29761a = obj;
                        this.f29763c |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(ljd ljdVar) {
                    this.f29760a = ljdVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p001o.z37
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, n64 n64Var) {
                    C19590a c19590a;
                    if (n64Var instanceof C19590a) {
                        c19590a = (C19590a) n64Var;
                        int i = c19590a.f29763c;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c19590a.f29763c = i - Integer.MIN_VALUE;
                        } else {
                            c19590a = new C19590a(n64Var);
                        }
                    }
                    Object obj2 = c19590a.f29761a;
                    Object objM51918f = uq8.m51918f();
                    int i2 = c19590a.f29763c;
                    if (i2 == 0) {
                        wre.m54934b(obj2);
                        ljd ljdVar = this.f29760a;
                        if (obj == null) {
                            obj = y4c.f54875a;
                        }
                        c19590a.f29763c = 1;
                        if (ljdVar.mo23475l(obj, c19590a) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj2);
                    }
                    return y3i.f54824a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(v37 v37Var, n64 n64Var) {
                super(2, n64Var);
                this.f29759c = v37Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                c cVar = new c(this.f29759c, n64Var);
                cVar.f29758b = obj;
                return cVar;
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f29757a;
                if (i == 0) {
                    wre.m54934b(obj);
                    ljd ljdVar = (ljd) this.f29758b;
                    v37 v37Var = this.f29759c;
                    a aVar = new a(ljdVar);
                    this.f29757a = 1;
                    if (v37Var.mo9775a(aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }

            @Override // p001o.nl7
            public final Object invoke(ljd ljdVar, n64 n64Var) {
                return ((c) create(ljdVar, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14447b(long j, v37 v37Var, n64 n64Var) {
            super(3, n64Var);
            this.f29748f = j;
            this.f29749g = v37Var;
        }

        @Override // p001o.ql7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h84 h84Var, z37 z37Var, n64 n64Var) {
            C14447b c14447b = new C14447b(this.f29748f, this.f29749g, n64Var);
            c14447b.f29746d = h84Var;
            c14447b.f29747e = z37Var;
            return c14447b.invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            z37 z37Var;
            eee eeeVarM24280n;
            C14447b c14447b;
            eee eeeVar;
            gge ggeVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f29745c;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f29746d;
                z37 z37Var2 = (z37) this.f29747e;
                eee eeeVarM33883e = jjd.m33883e(h84Var, null, -1, new c(this.f29749g, null), 1, null);
                gge ggeVar2 = new gge();
                z37Var = z37Var2;
                eeeVarM24280n = e47.m24280n(h84Var, this.f29748f);
                c14447b = this;
                eeeVar = eeeVarM33883e;
                ggeVar = ggeVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eeeVarM24280n = (eee) this.f29744b;
                ggeVar = (gge) this.f29743a;
                eeeVar = (eee) this.f29747e;
                z37Var = (z37) this.f29746d;
                wre.m54934b(obj);
                c14447b = this;
            }
            while (ggeVar.f25106a != y4c.f54877c) {
                wbf wbfVar = new wbf(c14447b.getContext());
                wbfVar.mo41924e(eeeVar.mo23474j(), new a(ggeVar, eeeVarM24280n, null));
                wbfVar.mo41924e(eeeVarM24280n.mo23473i(), new b(ggeVar, z37Var, null));
                c14447b.f29746d = z37Var;
                c14447b.f29747e = eeeVar;
                c14447b.f29743a = ggeVar;
                c14447b.f29744b = eeeVarM24280n;
                c14447b.f29745c = 1;
                if (wbfVar.m54183m(c14447b) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public static final eee m33181a(h84 h84Var, long j) {
        return jjd.m33883e(h84Var, null, 0, new C14446a(j, null), 1, null);
    }

    /* renamed from: b */
    public static final v37 m33182b(v37 v37Var, long j) {
        if (j > 0) {
            return c47.m20195b(new C14447b(j, v37Var, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }
}
