package p001o;

/* loaded from: classes3.dex */
public final class i71 implements h8f {

    /* renamed from: a */
    public final h8f f28169a;

    /* renamed from: b */
    public final h71 f28170b;

    /* renamed from: o.i71$a */
    public static final class C14201a extends jgg implements nl7 {

        /* renamed from: a */
        public int f28171a;

        public C14201a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return i71.this.new C14201a(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f28171a;
            if (i == 0) {
                wre.m54934b(obj);
                h71 h71Var = i71.this.f28170b;
                this.f28171a = 1;
                obj = h71Var.m29853f(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14201a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public i71(h8f h8fVar, v81 v81Var, z81 z81Var, byte[] bArr, ek5 ek5Var) {
        sq8.m48649h(h8fVar, "delegate");
        sq8.m48649h(v81Var, "signer");
        sq8.m48649h(z81Var, "signingConfig");
        sq8.m48649h(bArr, "previousSignature");
        sq8.m48649h(ek5Var, "trailingHeaders");
        this.f28169a = h8fVar;
        this.f28170b = new h71(j71.m33321b(h8fVar), v81Var, z81Var, bArr, ek5Var);
    }

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28169a.close();
    }

    @Override // p001o.h8f
    public long read(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "sink");
        if (j >= 0) {
            if (((Boolean) qm1.m45641b(null, new C14201a(null), 1, null)).booleanValue()) {
                return this.f28170b.m29854g().read(t6fVar, j);
            }
            return -1L;
        }
        throw new IllegalArgumentException(("Invalid limit (" + j + ") must be >= 0L").toString());
    }
}
