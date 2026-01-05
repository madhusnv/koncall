package p001o;

/* loaded from: classes6.dex */
public abstract class rmh {

    /* renamed from: o.rmh$a */
    public static final class C16628a extends o64 {

        /* renamed from: a */
        public long f43822a;

        /* renamed from: b */
        public Object f43823b;

        /* renamed from: c */
        public Object f43824c;

        /* renamed from: d */
        public /* synthetic */ Object f43825d;

        /* renamed from: e */
        public int f43826e;

        public C16628a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f43825d = obj;
            this.f43826e |= Integer.MIN_VALUE;
            return rmh.m46985d(0L, null, this);
        }
    }

    /* renamed from: a */
    public static final omh m46982a(long j, mk5 mk5Var, p69 p69Var) {
        return new omh("Timed out waiting for " + j + " ms", p69Var);
    }

    /* renamed from: b */
    public static final Object m46983b(pmh pmhVar, nl7 nl7Var) {
        z69.m58843h(pmhVar, nk5.m40722d(pmhVar.f22801d.getContext()).mo26963t(pmhVar.f40278e, pmhVar, pmhVar.getContext()));
        return i3i.m31475c(pmhVar, pmhVar, nl7Var);
    }

    /* renamed from: c */
    public static final Object m46984c(long j, nl7 nl7Var, n64 n64Var) {
        if (j <= 0) {
            throw new omh("Timed out immediately");
        }
        Object objM46983b = m46983b(new pmh(j, n64Var), nl7Var);
        if (objM46983b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM46983b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m46985d(long j, nl7 nl7Var, n64 n64Var) {
        C16628a c16628a;
        gge ggeVar;
        if (n64Var instanceof C16628a) {
            c16628a = (C16628a) n64Var;
            int i = c16628a.f43826e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16628a.f43826e = i - Integer.MIN_VALUE;
            } else {
                c16628a = new C16628a(n64Var);
            }
        }
        Object obj = c16628a.f43825d;
        Object objM51918f = uq8.m51918f();
        int i2 = c16628a.f43826e;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (j <= 0) {
                return null;
            }
            gge ggeVar2 = new gge();
            try {
                c16628a.f43823b = nl7Var;
                c16628a.f43824c = ggeVar2;
                c16628a.f43822a = j;
                c16628a.f43826e = 1;
                pmh pmhVar = new pmh(j, c16628a);
                ggeVar2.f25106a = pmhVar;
                Object objM46983b = m46983b(pmhVar, nl7Var);
                if (objM46983b == uq8.m51918f()) {
                    n75.m40201c(c16628a);
                }
                return objM46983b == objM51918f ? objM51918f : objM46983b;
            } catch (omh e) {
                e = e;
                ggeVar = ggeVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) c16628a.f43824c;
            try {
                wre.m54934b(obj);
                return obj;
            } catch (omh e2) {
                e = e2;
            }
        }
        if (e.f38602a == ggeVar.f25106a) {
            return null;
        }
        throw e;
    }
}
