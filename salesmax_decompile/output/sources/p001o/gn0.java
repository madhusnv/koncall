package p001o;

/* loaded from: classes.dex */
public interface gn0 {

    /* renamed from: o.gn0$a */
    public static final class C13793a {

        /* renamed from: o.gn0$a$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f25546a;

            /* renamed from: b */
            public Object f25547b;

            /* renamed from: c */
            public /* synthetic */ Object f25548c;

            /* renamed from: d */
            public int f25549d;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f25548c = obj;
                this.f25549d |= Integer.MIN_VALUE;
                return C13793a.m29144a(null, null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00ad A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[PHI: r1
          0x00ae: PHI (r1v11 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:28:0x00ab, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m29144a(gn0 gn0Var, fn0 fn0Var, n64 n64Var) {
            a aVar;
            fn0 fn0Var2;
            gn0 gn0Var2;
            fn0 fn0Var3;
            gn0 gn0Var3 = gn0Var;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f25549d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f25549d = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object objMo29143d = aVar.f25548c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f25549d;
            if (i2 == 0) {
                wre.m54934b(objMo29143d);
                int iM27113d = fn0Var.m27113d();
                aVar.f25546a = gn0Var3;
                fn0Var2 = fn0Var;
                aVar.f25547b = fn0Var2;
                aVar.f25549d = 1;
                objMo29143d = gn0Var3.mo29143d(iM27113d, aVar);
                if (objMo29143d == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            wre.m54934b(objMo29143d);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fn0Var3 = (fn0) aVar.f25547b;
                    gn0Var2 = (gn0) aVar.f25546a;
                    wre.m54934b(objMo29143d);
                    int iM27113d2 = fn0Var3.m27113d();
                    aVar.f25546a = null;
                    aVar.f25547b = null;
                    aVar.f25549d = 3;
                    objMo29143d = gn0Var2.mo29143d(iM27113d2, aVar);
                    return objMo29143d != objM51918f ? objM51918f : objMo29143d;
                }
                fn0 fn0Var4 = (fn0) aVar.f25547b;
                gn0 gn0Var4 = (gn0) aVar.f25546a;
                wre.m54934b(objMo29143d);
                fn0Var2 = fn0Var4;
                gn0Var3 = gn0Var4;
            }
            if (fn0Var2.equals((fn0) objMo29143d)) {
                return null;
            }
            fn0 fn0VarM27110b = fn0.m27110b(fn0Var2, 0, null, null, null, null, ml1.m39301a(false), 31, null);
            aVar.f25546a = gn0Var3;
            aVar.f25547b = fn0Var2;
            aVar.f25549d = 2;
            if (gn0Var3.mo29142c(fn0VarM27110b, aVar) == objM51918f) {
                return objM51918f;
            }
            fn0 fn0Var5 = fn0Var2;
            gn0Var2 = gn0Var3;
            fn0Var3 = fn0Var5;
            int iM27113d22 = fn0Var3.m27113d();
            aVar.f25546a = null;
            aVar.f25547b = null;
            aVar.f25549d = 3;
            objMo29143d = gn0Var2.mo29143d(iM27113d22, aVar);
            if (objMo29143d != objM51918f) {
            }
        }
    }

    /* renamed from: a */
    Object mo29140a(int i, boolean z, n64 n64Var);

    /* renamed from: b */
    Object mo29141b(fn0 fn0Var, n64 n64Var);

    /* renamed from: c */
    Object mo29142c(fn0 fn0Var, n64 n64Var);

    /* renamed from: d */
    Object mo29143d(int i, n64 n64Var);
}
