package p001o;

/* loaded from: classes2.dex */
public final class d84 extends z9b {

    /* renamed from: a */
    public bj1 f19378a;

    /* renamed from: o.d84$a */
    public static final class C12839a extends kf9 implements uk7 {
        public C12839a() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68988invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68988invoke() {
            d84.this.f19378a = null;
        }
    }

    /* renamed from: o.d84$b */
    public static final class C12840b extends o64 {

        /* renamed from: a */
        public Object f19380a;

        /* renamed from: b */
        public /* synthetic */ Object f19381b;

        /* renamed from: d */
        public int f19383d;

        public C12840b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f19381b = obj;
            this.f19383d |= Integer.MIN_VALUE;
            return d84.this.m22606d(this);
        }
    }

    public d84(q74 q74Var, long j, nl7 nl7Var) {
        sq8.m48649h(q74Var, "context");
        sq8.m48649h(nl7Var, "block");
        this.f19378a = new bj1(this, nl7Var, j, i84.m31707a(eu5.m25612c().v0().plus(q74Var).plus(gdg.m28504a((p69) q74Var.get(p69.f39399t)))), new C12839a());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m22606d(n64 n64Var) {
        C12840b c12840b;
        d84 d84Var;
        if (n64Var instanceof C12840b) {
            c12840b = (C12840b) n64Var;
            int i = c12840b.f19383d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c12840b.f19383d = i - Integer.MIN_VALUE;
            } else {
                c12840b = new C12840b(n64Var);
            }
        }
        Object obj = c12840b.f19381b;
        uq8.m51918f();
        int i2 = c12840b.f19383d;
        if (i2 == 0) {
            wre.m54934b(obj);
            d84Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d84Var = (d84) c12840b.f19380a;
            wre.m54934b(obj);
        }
        d84Var.getClass();
        return y3i.f54824a;
    }

    @Override // p001o.z9b, androidx.lifecycle.AbstractC2145n
    public void onActive() {
        super.onActive();
        bj1 bj1Var = this.f19378a;
        if (bj1Var != null) {
            bj1Var.m19227h();
        }
    }

    @Override // p001o.z9b, androidx.lifecycle.AbstractC2145n
    public void onInactive() {
        super.onInactive();
        bj1 bj1Var = this.f19378a;
        if (bj1Var != null) {
            bj1Var.m19226g();
        }
    }
}
