package p001o;

import java.io.EOFException;

/* loaded from: classes3.dex */
public final class sba implements y6f {

    /* renamed from: a */
    public final y6f f45126a;

    /* renamed from: b */
    public final long f45127b;

    /* renamed from: c */
    public long f45128c;

    /* renamed from: o.sba$a */
    public static final class C16794a extends o64 {

        /* renamed from: a */
        public Object f45129a;

        /* renamed from: b */
        public /* synthetic */ Object f45130b;

        /* renamed from: d */
        public int f45132d;

        public C16794a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f45130b = obj;
            this.f45132d |= Integer.MIN_VALUE;
            return sba.this.read(null, 0L, this);
        }
    }

    public sba(y6f y6fVar, long j) {
        sq8.m48649h(y6fVar, "chan");
        this.f45126a = y6fVar;
        this.f45127b = j;
    }

    @Override // p001o.y6f
    public boolean cancel(Throwable th) {
        return this.f45126a.cancel(th);
    }

    @Override // p001o.y6f
    public int getAvailableForRead() {
        return this.f45126a.getAvailableForRead();
    }

    @Override // p001o.y6f
    public Throwable getClosedCause() {
        return this.f45126a.getClosedCause();
    }

    @Override // p001o.y6f
    public boolean isClosedForRead() {
        return this.f45126a.isClosedForRead();
    }

    @Override // p001o.y6f
    public boolean isClosedForWrite() {
        return this.f45126a.isClosedForWrite();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.y6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object read(t6f t6fVar, long j, n64 n64Var) throws EOFException {
        C16794a c16794a;
        sba sbaVar;
        if (n64Var instanceof C16794a) {
            c16794a = (C16794a) n64Var;
            int i = c16794a.f45132d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16794a.f45132d = i - Integer.MIN_VALUE;
            } else {
                c16794a = new C16794a(n64Var);
            }
        }
        Object obj = c16794a.f45130b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16794a.f45132d;
        if (i2 == 0) {
            wre.m54934b(obj);
            y6f y6fVar = this.f45126a;
            c16794a.f45129a = this;
            c16794a.f45132d = 1;
            obj = y6fVar.read(t6fVar, j, c16794a);
            if (obj == objM51918f) {
                return objM51918f;
            }
            sbaVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sbaVar = (sba) c16794a.f45129a;
            wre.m54934b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (!sbaVar.f45126a.isClosedForRead()) {
            long j2 = sbaVar.f45128c;
            if (j2 > sbaVar.f45127b) {
                if (jLongValue != -1) {
                    sbaVar.f45128c += jLongValue;
                }
                gre.m29408d(sbaVar.f45127b, ml1.m39305e(sbaVar.f45128c));
            } else {
                sbaVar.f45128c = j2 + jLongValue;
            }
        }
        return obj;
    }
}
