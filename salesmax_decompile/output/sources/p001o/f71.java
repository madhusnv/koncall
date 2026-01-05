package p001o;

/* loaded from: classes3.dex */
public final class f71 implements y6f {

    /* renamed from: a */
    public final y6f f22836a;

    /* renamed from: b */
    public final v81 f22837b;

    /* renamed from: c */
    public final z81 f22838c;

    /* renamed from: d */
    public byte[] f22839d;

    /* renamed from: e */
    public final ek5 f22840e;

    /* renamed from: f */
    public final h71 f22841f;

    /* renamed from: o.f71$a */
    public static final class C13352a extends o64 {

        /* renamed from: a */
        public Object f22842a;

        /* renamed from: b */
        public Object f22843b;

        /* renamed from: c */
        public long f22844c;

        /* renamed from: d */
        public /* synthetic */ Object f22845d;

        /* renamed from: f */
        public int f22847f;

        public C13352a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f22845d = obj;
            this.f22847f |= Integer.MIN_VALUE;
            return f71.this.read(null, 0L, this);
        }
    }

    public f71(y6f y6fVar, v81 v81Var, z81 z81Var, byte[] bArr, ek5 ek5Var) {
        sq8.m48649h(y6fVar, "delegate");
        sq8.m48649h(v81Var, "signer");
        sq8.m48649h(z81Var, "signingConfig");
        sq8.m48649h(bArr, "previousSignature");
        sq8.m48649h(ek5Var, "trailingHeaders");
        this.f22836a = y6fVar;
        this.f22837b = v81Var;
        this.f22838c = z81Var;
        this.f22839d = bArr;
        this.f22840e = ek5Var;
        this.f22841f = new h71(g71.m28112b(y6fVar), v81Var, z81Var, this.f22839d, ek5Var);
    }

    @Override // p001o.y6f
    public boolean cancel(Throwable th) {
        return this.f22836a.cancel(th);
    }

    @Override // p001o.y6f
    public int getAvailableForRead() {
        return ((int) this.f22841f.m29854g().m49489c()) + this.f22836a.getAvailableForRead();
    }

    @Override // p001o.y6f
    public Throwable getClosedCause() {
        return this.f22836a.getClosedCause();
    }

    @Override // p001o.y6f
    public boolean isClosedForRead() {
        return this.f22841f.m29854g().m49489c() == 0 && this.f22841f.m29856i() && this.f22836a.isClosedForRead();
    }

    @Override // p001o.y6f
    public boolean isClosedForWrite() {
        return this.f22836a.isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.y6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object read(t6f t6fVar, long j, n64 n64Var) {
        C13352a c13352a;
        f71 f71Var;
        if (n64Var instanceof C13352a) {
            c13352a = (C13352a) n64Var;
            int i = c13352a.f22847f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13352a.f22847f = i - Integer.MIN_VALUE;
            } else {
                c13352a = new C13352a(n64Var);
            }
        }
        Object objM29853f = c13352a.f22845d;
        Object objM51918f = uq8.m51918f();
        int i2 = c13352a.f22847f;
        if (i2 == 0) {
            wre.m54934b(objM29853f);
            if (!(j >= 0)) {
                throw new IllegalArgumentException(("Invalid limit (" + j + ") must be >= 0L").toString());
            }
            h71 h71Var = this.f22841f;
            c13352a.f22842a = this;
            c13352a.f22843b = t6fVar;
            c13352a.f22844c = j;
            c13352a.f22847f = 1;
            objM29853f = h71Var.m29853f(c13352a);
            if (objM29853f == objM51918f) {
                return objM51918f;
            }
            f71Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c13352a.f22844c;
            t6fVar = (t6f) c13352a.f22843b;
            f71Var = (f71) c13352a.f22842a;
            wre.m54934b(objM29853f);
        }
        return !((Boolean) objM29853f).booleanValue() ? ml1.m39305e(-1L) : ml1.m39305e(f71Var.f22841f.m29854g().read(t6fVar, j));
    }
}
