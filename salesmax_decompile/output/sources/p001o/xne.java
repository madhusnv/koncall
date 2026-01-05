package p001o;

/* loaded from: classes2.dex */
public abstract class xne {

    /* renamed from: o.xne$a */
    public static final class C18198a extends o64 {

        /* renamed from: a */
        public Object f53967a;

        /* renamed from: b */
        public Object f53968b;

        /* renamed from: c */
        public Object f53969c;

        /* renamed from: d */
        public Object f53970d;

        /* renamed from: e */
        public Object f53971e;

        /* renamed from: f */
        public /* synthetic */ Object f53972f;

        /* renamed from: g */
        public int f53973g;

        public C18198a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53972f = obj;
            this.f53973g |= Integer.MIN_VALUE;
            return xne.m56510b(null, null, null, null, null, this);
        }
    }

    /* renamed from: o.xne$b */
    public static final class C18199b extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f53974a;

        /* renamed from: b */
        public int f53975b;

        public C18199b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53974a = obj;
            this.f53975b |= Integer.MIN_VALUE;
            return xne.m56512d(null, null, this);
        }
    }

    /* renamed from: o.xne$c */
    public static final class C18200c extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f53976a;

        /* renamed from: b */
        public int f53977b;

        public C18200c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53976a = obj;
            this.f53977b |= Integer.MIN_VALUE;
            return xne.m56513e(null, null, this);
        }
    }

    /* renamed from: o.xne$d */
    public static final class C18201d extends jgg implements xk7 {

        /* renamed from: a */
        public int f53978a;

        /* renamed from: b */
        public final /* synthetic */ r9d f53979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18201d(r9d r9dVar, n64 n64Var) {
            super(1, n64Var);
            this.f53979b = r9dVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C18201d(this.f53979b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f53978a;
            if (i == 0) {
                wre.m54934b(obj);
                r9d r9dVar = this.f53979b;
                this.f53978a = 1;
                obj = n71.m40193c(r9dVar, null, null, this, 6, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return ((r81) obj).m46332a();
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C18201d) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.xne$e */
    public static final class C18202e extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f53980a;

        /* renamed from: b */
        public int f53981b;

        public C18202e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f53980a = obj;
            this.f53981b |= Integer.MIN_VALUE;
            return xne.m56515g(null, null, this);
        }
    }

    /* renamed from: o.xne$f */
    public static final class C18203f extends jgg implements xk7 {

        /* renamed from: a */
        public int f53982a;

        /* renamed from: b */
        public final /* synthetic */ r9d f53983b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18203f(r9d r9dVar, n64 n64Var) {
            super(1, n64Var);
            this.f53983b = r9dVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C18203f(this.f53983b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f53982a;
            if (i == 0) {
                wre.m54934b(obj);
                r9d r9dVar = this.f53983b;
                this.f53982a = 1;
                obj = n71.m40193c(r9dVar, null, null, this, 6, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return ((r81) obj).m46332a();
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C18203f) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m56510b(ii9 ii9Var, String str, String str2, String str3, r9d r9dVar, n64 n64Var) {
        C18198a c18198a;
        String str4;
        if (n64Var instanceof C18198a) {
            c18198a = (C18198a) n64Var;
            int i = c18198a.f53973g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18198a.f53973g = i - Integer.MIN_VALUE;
            } else {
                c18198a = new C18198a(n64Var);
            }
        }
        Object objM56512d = c18198a.f53972f;
        Object objM51918f = uq8.m51918f();
        int i2 = c18198a.f53973g;
        if (i2 == 0) {
            wre.m54934b(objM56512d);
            c18198a.f53967a = ii9Var;
            c18198a.f53968b = str;
            c18198a.f53969c = str2;
            c18198a.f53970d = str3;
            c18198a.f53971e = r9dVar;
            c18198a.f53973g = 1;
            objM56512d = m56512d(r9dVar, ii9Var, c18198a);
            if (objM56512d == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str4 = (String) c18198a.f53967a;
                wre.m54934b(objM56512d);
                return s81.m47962a((r81) objM56512d, str4);
            }
            r9dVar = (r9d) c18198a.f53971e;
            str3 = (String) c18198a.f53970d;
            str2 = (String) c18198a.f53969c;
            str = (String) c18198a.f53968b;
            ii9Var = (ii9) c18198a.f53967a;
            wre.m54934b(objM56512d);
        }
        if (((Boolean) objM56512d).booleanValue()) {
            return null;
        }
        l8i l8iVarM43157a = p81.m43157a(o81.f37890a, r9dVar, str, str2);
        if (l8iVarM43157a != null) {
            return l8iVarM43157a;
        }
        c18198a.f53967a = str3;
        c18198a.f53968b = null;
        c18198a.f53969c = null;
        c18198a.f53970d = null;
        c18198a.f53971e = null;
        c18198a.f53973g = 2;
        objM56512d = ii9Var.mo32174a(c18198a);
        if (objM56512d == objM51918f) {
            return objM51918f;
        }
        str4 = str3;
        return s81.m47962a((r81) objM56512d, str4);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m56511c(ii9 ii9Var, String str, String str2, String str3, r9d r9dVar, n64 n64Var, int i, Object obj) {
        if ((i & 16) != 0) {
            r9dVar = r9d.f43250a.m46382a();
        }
        return m56510b(ii9Var, str, str2, str3, r9dVar, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m56512d(r9d r9dVar, ii9 ii9Var, n64 n64Var) {
        C18199b c18199b;
        Boolean boolM33401g;
        if (n64Var instanceof C18199b) {
            c18199b = (C18199b) n64Var;
            int i = c18199b.f53975b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18199b.f53975b = i - Integer.MIN_VALUE;
            } else {
                c18199b = new C18199b(n64Var);
            }
        }
        Object objMo32174a = c18199b.f53974a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18199b.f53975b;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            boolM33401g = (Boolean) bj6.m19237f(o81.f37890a.m41740m(), r9dVar);
            if (boolM33401g == null) {
                c18199b.f53975b = 1;
                objMo32174a = ii9Var.mo32174a(c18199b);
                if (objMo32174a == objM51918f) {
                    return objM51918f;
                }
            }
            return ml1.m39301a(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(objMo32174a);
        boolM33401g = j81.m33401g(((r81) objMo32174a).m46332a());
        boolean zBooleanValue = boolM33401g != null ? boolM33401g.booleanValue() : false;
        return ml1.m39301a(zBooleanValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m56513e(r9d r9dVar, ii9 ii9Var, n64 n64Var) {
        C18200c c18200c;
        if (n64Var instanceof C18200c) {
            c18200c = (C18200c) n64Var;
            int i = c18200c.f53977b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18200c.f53977b = i - Integer.MIN_VALUE;
            } else {
                c18200c = new C18200c(n64Var);
            }
        }
        Object objMo32174a = c18200c.f53976a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18200c.f53977b;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            Boolean bool = (Boolean) bj6.m19237f(o81.f37890a.m41751x(), r9dVar);
            if (bool != null) {
                return bool;
            }
            c18200c.f53977b = 1;
            objMo32174a = ii9Var.mo32174a(c18200c);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo32174a);
        }
        return j81.m33412r((vq3) objMo32174a);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m56514f(r9d r9dVar, ii9 ii9Var, n64 n64Var, int i, Object obj) {
        if ((i & 1) != 0) {
            r9dVar = r9d.f43250a.m46382a();
        }
        if ((i & 2) != 0) {
            ii9Var = ki9.m35729a(new C18201d(r9dVar, null));
        }
        return m56513e(r9dVar, ii9Var, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m56515g(r9d r9dVar, ii9 ii9Var, n64 n64Var) {
        C18202e c18202e;
        if (n64Var instanceof C18202e) {
            c18202e = (C18202e) n64Var;
            int i = c18202e.f53981b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18202e.f53981b = i - Integer.MIN_VALUE;
            } else {
                c18202e = new C18202e(n64Var);
            }
        }
        Object objMo32174a = c18202e.f53980a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18202e.f53981b;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            Boolean bool = (Boolean) bj6.m19237f(o81.f37890a.m41752y(), r9dVar);
            if (bool != null) {
                return bool;
            }
            c18202e.f53981b = 1;
            objMo32174a = ii9Var.mo32174a(c18202e);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo32174a);
        }
        return j81.m33413s((vq3) objMo32174a);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m56516h(r9d r9dVar, ii9 ii9Var, n64 n64Var, int i, Object obj) {
        if ((i & 1) != 0) {
            r9dVar = r9d.f43250a.m46382a();
        }
        if ((i & 2) != 0) {
            ii9Var = ki9.m35729a(new C18203f(r9dVar, null));
        }
        return m56515g(r9dVar, ii9Var, n64Var);
    }
}
