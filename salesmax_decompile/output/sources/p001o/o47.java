package p001o;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class o47 {

    /* renamed from: o.o47$a */
    public static final class C15705a implements v37 {

        /* renamed from: a */
        public final /* synthetic */ v37 f37729a;

        /* renamed from: b */
        public final /* synthetic */ int f37730b;

        public C15705a(v37 v37Var, int i) {
            this.f37729a = v37Var;
            this.f37730b = i;
        }

        @Override // p001o.v37
        /* renamed from: a */
        public Object mo9775a(z37 z37Var, n64 n64Var) {
            Object objMo9775a = this.f37729a.mo9775a(new C15706b(new ege(), this.f37730b, z37Var), n64Var);
            return objMo9775a == uq8.m51918f() ? objMo9775a : y3i.f54824a;
        }
    }

    /* renamed from: o.o47$b */
    public static final class C15706b implements z37 {

        /* renamed from: a */
        public final /* synthetic */ ege f37731a;

        /* renamed from: b */
        public final /* synthetic */ int f37732b;

        /* renamed from: c */
        public final /* synthetic */ z37 f37733c;

        /* renamed from: o.o47$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public /* synthetic */ Object f37734a;

            /* renamed from: c */
            public int f37736c;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f37734a = obj;
                this.f37736c |= Integer.MIN_VALUE;
                return C15706b.this.emit(null, this);
            }
        }

        public C15706b(ege egeVar, int i, z37 z37Var) {
            this.f37731a = egeVar;
            this.f37732b = i;
            this.f37733c = z37Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.z37
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, n64 n64Var) {
            a aVar;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f37736c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f37736c = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj2 = aVar.f37734a;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f37736c;
            if (i2 == 0) {
                wre.m54934b(obj2);
                ege egeVar = this.f37731a;
                int i3 = egeVar.f21602a;
                if (i3 < this.f37732b) {
                    egeVar.f21602a = i3 + 1;
                    return y3i.f54824a;
                }
                z37 z37Var = this.f37733c;
                aVar.f37736c = 1;
                if (z37Var.emit(obj, aVar) == objM51918f) {
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

    /* renamed from: o.o47$c */
    public static final class C15707c implements v37 {

        /* renamed from: a */
        public final /* synthetic */ v37 f37737a;

        /* renamed from: b */
        public final /* synthetic */ nl7 f37738b;

        public C15707c(v37 v37Var, nl7 nl7Var) {
            this.f37737a = v37Var;
            this.f37738b = nl7Var;
        }

        @Override // p001o.v37
        /* renamed from: a */
        public Object mo9775a(z37 z37Var, n64 n64Var) {
            Object objMo9775a = this.f37737a.mo9775a(new C15708d(new dge(), z37Var, this.f37738b), n64Var);
            return objMo9775a == uq8.m51918f() ? objMo9775a : y3i.f54824a;
        }
    }

    /* renamed from: o.o47$d */
    public static final class C15708d implements z37 {

        /* renamed from: a */
        public final /* synthetic */ dge f37739a;

        /* renamed from: b */
        public final /* synthetic */ z37 f37740b;

        /* renamed from: c */
        public final /* synthetic */ nl7 f37741c;

        /* renamed from: o.o47$d$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f37742a;

            /* renamed from: b */
            public Object f37743b;

            /* renamed from: c */
            public /* synthetic */ Object f37744c;

            /* renamed from: e */
            public int f37746e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f37744c = obj;
                this.f37746e |= Integer.MIN_VALUE;
                return C15708d.this.emit(null, this);
            }
        }

        public C15708d(dge dgeVar, z37 z37Var, nl7 nl7Var) {
            this.f37739a = dgeVar;
            this.f37740b = z37Var;
            this.f37741c = nl7Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.z37
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, n64 n64Var) {
            a aVar;
            C15708d c15708d;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f37746e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f37746e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object objInvoke = aVar.f37744c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f37746e;
            if (i2 == 0) {
                wre.m54934b(objInvoke);
                if (this.f37739a.f19803a) {
                    z37 z37Var = this.f37740b;
                    aVar.f37746e = 1;
                    if (z37Var.emit(obj, aVar) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                nl7 nl7Var = this.f37741c;
                aVar.f37742a = this;
                aVar.f37743b = obj;
                aVar.f37746e = 2;
                objInvoke = nl7Var.invoke(obj, aVar);
                if (objInvoke == objM51918f) {
                    return objM51918f;
                }
                c15708d = this;
                if (!((Boolean) objInvoke).booleanValue()) {
                }
            } else {
                if (i2 == 1) {
                    wre.m54934b(objInvoke);
                    return y3i.f54824a;
                }
                if (i2 == 2) {
                    obj = aVar.f37743b;
                    c15708d = (C15708d) aVar.f37742a;
                    wre.m54934b(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return y3i.f54824a;
                    }
                    c15708d.f37739a.f19803a = true;
                    z37 z37Var2 = c15708d.f37740b;
                    aVar.f37742a = null;
                    aVar.f37743b = null;
                    aVar.f37746e = 3;
                    if (z37Var2.emit(obj, aVar) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objInvoke);
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.o47$e */
    public static final class C15709e implements v37 {

        /* renamed from: a */
        public final /* synthetic */ v37 f37747a;

        /* renamed from: b */
        public final /* synthetic */ nl7 f37748b;

        /* renamed from: o.o47$e$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public /* synthetic */ Object f37749a;

            /* renamed from: b */
            public int f37750b;

            /* renamed from: d */
            public Object f37752d;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f37749a = obj;
                this.f37750b |= Integer.MIN_VALUE;
                return C15709e.this.mo9775a(null, this);
            }
        }

        public C15709e(v37 v37Var, nl7 nl7Var) {
            this.f37747a = v37Var;
            this.f37748b = nl7Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.v37
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo9775a(z37 z37Var, n64 n64Var) {
            a aVar;
            C15710f c15710f;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f37750b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f37750b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj = aVar.f37749a;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f37750b;
            if (i2 == 0) {
                wre.m54934b(obj);
                v37 v37Var = this.f37747a;
                C15710f c15710f2 = new C15710f(this.f37748b, z37Var);
                try {
                    aVar.f37752d = c15710f2;
                    aVar.f37750b = 1;
                    if (v37Var.mo9775a(c15710f2, aVar) == objM51918f) {
                        return objM51918f;
                    }
                } catch (y5 e) {
                    e = e;
                    c15710f = c15710f2;
                    d47.m22317a(e, c15710f);
                    return y3i.f54824a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c15710f = (C15710f) aVar.f37752d;
                try {
                    wre.m54934b(obj);
                } catch (y5 e2) {
                    e = e2;
                    d47.m22317a(e, c15710f);
                    return y3i.f54824a;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.o47$f */
    public static final class C15710f implements z37 {

        /* renamed from: a */
        public final /* synthetic */ nl7 f37753a;

        /* renamed from: b */
        public final /* synthetic */ z37 f37754b;

        /* renamed from: o.o47$f$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f37755a;

            /* renamed from: b */
            public /* synthetic */ Object f37756b;

            /* renamed from: c */
            public int f37757c;

            /* renamed from: e */
            public Object f37759e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f37756b = obj;
                this.f37757c |= Integer.MIN_VALUE;
                return C15710f.this.emit(null, this);
            }
        }

        public C15710f(nl7 nl7Var, z37 z37Var) {
            this.f37753a = nl7Var;
            this.f37754b = z37Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.z37
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Object obj, n64 n64Var) {
            a aVar;
            Object obj2;
            Object obj3;
            C15710f c15710f;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f37757c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f37757c = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj4 = aVar.f37756b;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f37757c;
            boolean z = true;
            if (i2 == 0) {
                wre.m54934b(obj4);
                nl7 nl7Var = this.f37753a;
                aVar.f37755a = this;
                aVar.f37759e = obj;
                aVar.f37757c = 1;
                bj8.m19245c(6);
                Object objInvoke = nl7Var.invoke(obj, aVar);
                bj8.m19245c(7);
                if (objInvoke == objM51918f) {
                    return objM51918f;
                }
                obj2 = objInvoke;
                obj3 = obj;
                c15710f = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c15710f = (C15710f) aVar.f37755a;
                    wre.m54934b(obj4);
                    if (z) {
                        throw new y5(c15710f);
                    }
                    return y3i.f54824a;
                }
                Object obj5 = aVar.f37759e;
                C15710f c15710f2 = (C15710f) aVar.f37755a;
                wre.m54934b(obj4);
                obj3 = obj5;
                c15710f = c15710f2;
                obj2 = obj4;
            }
            if (((Boolean) obj2).booleanValue()) {
                z37 z37Var = c15710f.f37754b;
                aVar.f37755a = c15710f;
                aVar.f37759e = null;
                aVar.f37757c = 2;
                if (z37Var.emit(obj3, aVar) == objM51918f) {
                    return objM51918f;
                }
            } else {
                z = false;
            }
            if (z) {
            }
        }
    }

    /* renamed from: a */
    public static final v37 m41518a(v37 v37Var, int i) {
        if (i >= 0) {
            return new C15705a(v37Var, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    /* renamed from: b */
    public static final v37 m41519b(v37 v37Var, nl7 nl7Var) {
        return new C15707c(v37Var, nl7Var);
    }

    /* renamed from: c */
    public static final v37 m41520c(v37 v37Var, nl7 nl7Var) {
        return new C15709e(v37Var, nl7Var);
    }
}
