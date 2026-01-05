package p001o;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class g47 {

    /* renamed from: o.g47$a */
    public static final class C13619a extends o64 {

        /* renamed from: a */
        public Object f24559a;

        /* renamed from: b */
        public Object f24560b;

        /* renamed from: c */
        public Object f24561c;

        /* renamed from: d */
        public boolean f24562d;

        /* renamed from: e */
        public /* synthetic */ Object f24563e;

        /* renamed from: f */
        public int f24564f;

        public C13619a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f24563e = obj;
            this.f24564f |= Integer.MIN_VALUE;
            return g47.m28037c(null, null, false, this);
        }
    }

    /* renamed from: b */
    public static final Object m28036b(z37 z37Var, eee eeeVar, n64 n64Var) {
        Object objM28037c = m28037c(z37Var, eeeVar, true, n64Var);
        return objM28037c == uq8.m51918f() ? objM28037c : y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:13:0x0036, B:22:0x0060, B:26:0x0075, B:28:0x007d, B:18:0x0052, B:21:0x005c), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008f -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m28037c(z37 z37Var, eee eeeVar, boolean z, n64 n64Var) {
        C13619a c13619a;
        sg2 it;
        sg2 sg2Var;
        z37 z37Var2;
        Object objMo23482a;
        if (n64Var instanceof C13619a) {
            c13619a = (C13619a) n64Var;
            int i = c13619a.f24564f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13619a.f24564f = i - Integer.MIN_VALUE;
            } else {
                c13619a = new C13619a(n64Var);
            }
        }
        Object obj = c13619a.f24563e;
        Object objM51918f = uq8.m51918f();
        int i2 = c13619a.f24564f;
        try {
            if (i2 == 0) {
                wre.m54934b(obj);
                e47.m24278l(z37Var);
                it = eeeVar.iterator();
                c13619a.f24559a = z37Var;
                c13619a.f24560b = eeeVar;
                c13619a.f24561c = it;
                c13619a.f24562d = z;
                c13619a.f24564f = 1;
                objMo23482a = it.mo23482a(c13619a);
                if (objMo23482a == objM51918f) {
                }
            } else if (i2 == 1) {
                z = c13619a.f24562d;
                sg2Var = (sg2) c13619a.f24561c;
                eeeVar = (eee) c13619a.f24560b;
                z37Var2 = (z37) c13619a.f24559a;
                wre.m54934b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c13619a.f24562d;
                sg2Var = (sg2) c13619a.f24561c;
                eeeVar = (eee) c13619a.f24560b;
                z37Var2 = (z37) c13619a.f24559a;
                wre.m54934b(obj);
                it = sg2Var;
                z37Var = z37Var2;
                c13619a.f24559a = z37Var;
                c13619a.f24560b = eeeVar;
                c13619a.f24561c = it;
                c13619a.f24562d = z;
                c13619a.f24564f = 1;
                objMo23482a = it.mo23482a(c13619a);
                if (objMo23482a == objM51918f) {
                    return objM51918f;
                }
                z37Var2 = z37Var;
                sg2Var = it;
                obj = objMo23482a;
                if (((Boolean) obj).booleanValue()) {
                    if (z) {
                        yg2.m57772a(eeeVar, null);
                    }
                    return y3i.f54824a;
                }
                Object next = sg2Var.next();
                c13619a.f24559a = z37Var2;
                c13619a.f24560b = eeeVar;
                c13619a.f24561c = sg2Var;
                c13619a.f24562d = z;
                c13619a.f24564f = 2;
                if (z37Var2.emit(next, c13619a) == objM51918f) {
                    return objM51918f;
                }
                it = sg2Var;
                z37Var = z37Var2;
                c13619a.f24559a = z37Var;
                c13619a.f24560b = eeeVar;
                c13619a.f24561c = it;
                c13619a.f24562d = z;
                c13619a.f24564f = 1;
                objMo23482a = it.mo23482a(c13619a);
                if (objMo23482a == objM51918f) {
                }
            }
        } finally {
        }
    }
}
