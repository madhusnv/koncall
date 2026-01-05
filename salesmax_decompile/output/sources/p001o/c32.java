package p001o;

/* loaded from: classes6.dex */
public final class c32 extends ng2 {

    /* renamed from: e */
    public final nl7 f17214e;

    /* renamed from: o.c32$a */
    public static final class C12542a extends o64 {

        /* renamed from: a */
        public Object f17215a;

        /* renamed from: b */
        public /* synthetic */ Object f17216b;

        /* renamed from: d */
        public int f17218d;

        public C12542a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f17216b = obj;
            this.f17218d |= Integer.MIN_VALUE;
            return c32.this.mo20154h(null, this);
        }
    }

    public /* synthetic */ c32(nl7 nl7Var, q74 q74Var, int i, wl1 wl1Var, int i2, id5 id5Var) {
        this(nl7Var, (i2 & 2) != 0 ? e66.f21035a : q74Var, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? wl1.SUSPEND : wl1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.ng2, p001o.mg2
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo20154h(ljd ljdVar, n64 n64Var) {
        C12542a c12542a;
        if (n64Var instanceof C12542a) {
            c12542a = (C12542a) n64Var;
            int i = c12542a.f17218d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12542a.f17218d = i - Integer.MIN_VALUE;
            } else {
                c12542a = new C12542a(n64Var);
            }
        }
        Object obj = c12542a.f17216b;
        Object objM51918f = uq8.m51918f();
        int i2 = c12542a.f17218d;
        if (i2 == 0) {
            wre.m54934b(obj);
            c12542a.f17215a = ljdVar;
            c12542a.f17218d = 1;
            if (super.mo20154h(ljdVar, c12542a) == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ljdVar = (ljd) c12542a.f17215a;
            wre.m54934b(obj);
        }
        if (ljdVar.mo23477n()) {
            return y3i.f54824a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // p001o.mg2
    /* renamed from: i */
    public mg2 mo20155i(q74 q74Var, int i, wl1 wl1Var) {
        return new c32(this.f17214e, q74Var, i, wl1Var);
    }

    public c32(nl7 nl7Var, q74 q74Var, int i, wl1 wl1Var) {
        super(nl7Var, q74Var, i, wl1Var);
        this.f17214e = nl7Var;
    }
}
