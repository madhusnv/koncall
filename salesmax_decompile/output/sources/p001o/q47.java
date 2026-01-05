package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class q47 {

    /* renamed from: o.q47$a */
    public static final class C16288a implements z37 {

        /* renamed from: a */
        public final /* synthetic */ nl7 f41276a;

        /* renamed from: b */
        public final /* synthetic */ gge f41277b;

        /* renamed from: o.q47$a$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f41278a;

            /* renamed from: b */
            public /* synthetic */ Object f41279b;

            /* renamed from: c */
            public int f41280c;

            /* renamed from: e */
            public Object f41282e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f41279b = obj;
                this.f41280c |= Integer.MIN_VALUE;
                return C16288a.this.emit(null, this);
            }
        }

        public C16288a(nl7 nl7Var, gge ggeVar) {
            this.f41276a = nl7Var;
            this.f41277b = ggeVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.z37
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Object obj, n64 n64Var) {
            a aVar;
            C16288a c16288a;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f41280c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f41280c = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object objInvoke = aVar.f41279b;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f41280c;
            boolean z = true;
            if (i2 == 0) {
                wre.m54934b(objInvoke);
                nl7 nl7Var = this.f41276a;
                aVar.f41278a = this;
                aVar.f41282e = obj;
                aVar.f41280c = 1;
                bj8.m19245c(6);
                objInvoke = nl7Var.invoke(obj, aVar);
                bj8.m19245c(7);
                if (objInvoke == objM51918f) {
                    return objM51918f;
                }
                c16288a = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f41282e;
                c16288a = (C16288a) aVar.f41278a;
                wre.m54934b(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                c16288a.f41277b.f25106a = obj;
                z = false;
            }
            if (z) {
                return y3i.f54824a;
            }
            throw new y5(c16288a);
        }
    }

    /* renamed from: o.q47$b */
    public static final class C16289b extends o64 {

        /* renamed from: a */
        public Object f41283a;

        /* renamed from: b */
        public Object f41284b;

        /* renamed from: c */
        public Object f41285c;

        /* renamed from: d */
        public /* synthetic */ Object f41286d;

        /* renamed from: e */
        public int f41287e;

        public C16289b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f41286d = obj;
            this.f41287e |= Integer.MIN_VALUE;
            return e47.m24279m(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m44798a(v37 v37Var, nl7 nl7Var, n64 n64Var) {
        C16289b c16289b;
        nl7 nl7Var2;
        gge ggeVar;
        y5 e;
        z37 z37Var;
        Object obj;
        if (n64Var instanceof C16289b) {
            c16289b = (C16289b) n64Var;
            int i = c16289b.f41287e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16289b.f41287e = i - Integer.MIN_VALUE;
            } else {
                c16289b = new C16289b(n64Var);
            }
        }
        Object obj2 = c16289b.f41286d;
        Object objM51918f = uq8.m51918f();
        int i2 = c16289b.f41287e;
        if (i2 == 0) {
            wre.m54934b(obj2);
            gge ggeVar2 = new gge();
            ggeVar2.f25106a = y4c.f54875a;
            z37 c16288a = new C16288a(nl7Var, ggeVar2);
            try {
                c16289b.f41283a = nl7Var;
                c16289b.f41284b = ggeVar2;
                c16289b.f41285c = c16288a;
                c16289b.f41287e = 1;
                if (v37Var.mo9775a(c16288a, c16289b) == objM51918f) {
                    return objM51918f;
                }
                nl7Var2 = nl7Var;
                ggeVar = ggeVar2;
            } catch (y5 e2) {
                nl7Var2 = nl7Var;
                ggeVar = ggeVar2;
                e = e2;
                z37Var = c16288a;
                d47.m22317a(e, z37Var);
                obj = ggeVar.f25106a;
                if (obj != y4c.f54875a) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z37Var = (C16288a) c16289b.f41285c;
            ggeVar = (gge) c16289b.f41284b;
            nl7Var2 = (nl7) c16289b.f41283a;
            try {
                wre.m54934b(obj2);
            } catch (y5 e3) {
                e = e3;
                d47.m22317a(e, z37Var);
                obj = ggeVar.f25106a;
                if (obj != y4c.f54875a) {
                }
            }
        }
        obj = ggeVar.f25106a;
        if (obj != y4c.f54875a) {
            return obj;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + nl7Var2);
    }
}
