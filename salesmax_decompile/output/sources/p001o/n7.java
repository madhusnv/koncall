package p001o;

/* loaded from: classes6.dex */
public abstract class n7 implements v37 {

    /* renamed from: o.n7$a */
    public static final class C15519a extends o64 {

        /* renamed from: a */
        public Object f36462a;

        /* renamed from: b */
        public /* synthetic */ Object f36463b;

        /* renamed from: d */
        public int f36465d;

        public C15519a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f36463b = obj;
            this.f36465d |= Integer.MIN_VALUE;
            return n7.this.mo9775a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.v37
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9775a(z37 z37Var, n64 n64Var) throws Throwable {
        C15519a c15519a;
        Throwable th;
        wze wzeVar;
        if (n64Var instanceof C15519a) {
            c15519a = (C15519a) n64Var;
            int i = c15519a.f36465d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15519a.f36465d = i - Integer.MIN_VALUE;
            } else {
                c15519a = new C15519a(n64Var);
            }
        }
        Object obj = c15519a.f36463b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15519a.f36465d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wzeVar = (wze) c15519a.f36462a;
            try {
                wre.m54934b(obj);
                wzeVar.releaseIntercepted();
                return y3i.f54824a;
            } catch (Throwable th2) {
                th = th2;
                wzeVar.releaseIntercepted();
                throw th;
            }
        }
        wre.m54934b(obj);
        wze wzeVar2 = new wze(z37Var, c15519a.getContext());
        try {
            c15519a.f36462a = wzeVar2;
            c15519a.f36465d = 1;
            if (mo18085f(wzeVar2, c15519a) == objM51918f) {
                return objM51918f;
            }
            wzeVar = wzeVar2;
            wzeVar.releaseIntercepted();
            return y3i.f54824a;
        } catch (Throwable th3) {
            th = th3;
            wzeVar = wzeVar2;
            wzeVar.releaseIntercepted();
            throw th;
        }
    }

    /* renamed from: f */
    public abstract Object mo18085f(z37 z37Var, n64 n64Var);
}
