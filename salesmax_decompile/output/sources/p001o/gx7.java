package p001o;

/* loaded from: classes3.dex */
public final class gx7 implements y6f {

    /* renamed from: a */
    public final ax7 f25910a;

    /* renamed from: b */
    public final y6f f25911b;

    /* renamed from: o.gx7$a */
    public static final class C13832a extends o64 {

        /* renamed from: a */
        public Object f25912a;

        /* renamed from: b */
        public /* synthetic */ Object f25913b;

        /* renamed from: d */
        public int f25915d;

        public C13832a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f25913b = obj;
            this.f25915d |= Integer.MIN_VALUE;
            return gx7.this.read(null, 0L, this);
        }
    }

    public gx7(ax7 ax7Var, y6f y6fVar) {
        sq8.m48649h(ax7Var, "hash");
        sq8.m48649h(y6fVar, "chan");
        this.f25910a = ax7Var;
        this.f25911b = y6fVar;
    }

    /* renamed from: a */
    public final byte[] m29623a() {
        return this.f25910a.mo17932a();
    }

    @Override // p001o.y6f
    public boolean cancel(Throwable th) {
        return this.f25911b.cancel(th);
    }

    @Override // p001o.y6f
    public int getAvailableForRead() {
        return this.f25911b.getAvailableForRead();
    }

    @Override // p001o.y6f
    public Throwable getClosedCause() {
        return this.f25911b.getClosedCause();
    }

    @Override // p001o.y6f
    public boolean isClosedForRead() {
        return this.f25911b.isClosedForRead();
    }

    @Override // p001o.y6f
    public boolean isClosedForWrite() {
        return this.f25911b.isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.y6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object read(t6f t6fVar, long j, n64 n64Var) {
        C13832a c13832a;
        u6f u6fVarM38492a;
        if (n64Var instanceof C13832a) {
            c13832a = (C13832a) n64Var;
            int i = c13832a.f25915d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13832a.f25915d = i - Integer.MIN_VALUE;
            } else {
                c13832a = new C13832a(n64Var);
            }
        }
        Object obj = c13832a.f25913b;
        Object objM51918f = uq8.m51918f();
        int i2 = c13832a.f25915d;
        if (i2 == 0) {
            wre.m54934b(obj);
            u6fVarM38492a = m7f.m38492a(new hx7(this.f25910a, t6fVar));
            y6f y6fVar = this.f25911b;
            t6f buffer = u6fVarM38492a.getBuffer();
            c13832a.f25912a = u6fVarM38492a;
            c13832a.f25915d = 1;
            obj = y6fVar.read(buffer, j, c13832a);
            if (obj == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u6fVarM38492a = (u6f) c13832a.f25912a;
            wre.m54934b(obj);
        }
        ((Number) obj).longValue();
        u6fVarM38492a.mo49488b();
        return obj;
    }
}
