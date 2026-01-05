package p001o;

/* loaded from: classes3.dex */
public final class w83 implements y6f {

    /* renamed from: a */
    public final String f51596a;

    /* renamed from: b */
    public final gx7 f51597b;

    /* renamed from: o.w83$a */
    public static final class C17796a extends o64 {

        /* renamed from: a */
        public Object f51598a;

        /* renamed from: b */
        public /* synthetic */ Object f51599b;

        /* renamed from: d */
        public int f51601d;

        public C17796a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f51599b = obj;
            this.f51601d |= Integer.MIN_VALUE;
            return w83.this.read(null, 0L, this);
        }
    }

    public w83(String str, gx7 gx7Var) {
        sq8.m48649h(str, "expectedChecksum");
        sq8.m48649h(gx7Var, "hashingChan");
        this.f51596a = str;
        this.f51597b = gx7Var;
    }

    @Override // p001o.y6f
    public boolean cancel(Throwable th) {
        return this.f51597b.cancel(th);
    }

    @Override // p001o.y6f
    public int getAvailableForRead() {
        return this.f51597b.getAvailableForRead();
    }

    @Override // p001o.y6f
    public Throwable getClosedCause() {
        return this.f51597b.getClosedCause();
    }

    @Override // p001o.y6f
    public boolean isClosedForRead() {
        return this.f51597b.isClosedForRead();
    }

    @Override // p001o.y6f
    public boolean isClosedForWrite() {
        return this.f51597b.isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.y6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object read(t6f t6fVar, long j, n64 n64Var) {
        C17796a c17796a;
        w83 w83Var;
        if (n64Var instanceof C17796a) {
            c17796a = (C17796a) n64Var;
            int i = c17796a.f51601d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17796a.f51601d = i - Integer.MIN_VALUE;
            } else {
                c17796a = new C17796a(n64Var);
            }
        }
        Object obj = c17796a.f51599b;
        Object objM51918f = uq8.m51918f();
        int i2 = c17796a.f51601d;
        if (i2 == 0) {
            wre.m54934b(obj);
            gx7 gx7Var = this.f51597b;
            c17796a.f51598a = this;
            c17796a.f51601d = 1;
            obj = gx7Var.read(t6fVar, j, c17796a);
            if (obj == objM51918f) {
                return objM51918f;
            }
            w83Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w83Var = (w83) c17796a.f51598a;
            wre.m54934b(obj);
        }
        if (((Number) obj).longValue() == -1) {
            w27.m53812e(w83Var.f51596a, cb1.m20635c(w83Var.f51597b.m29623a()));
        }
        return obj;
    }
}
