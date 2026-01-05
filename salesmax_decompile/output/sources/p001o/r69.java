package p001o;

/* loaded from: classes3.dex */
public final class r69 implements w6f {

    /* renamed from: a */
    public final w6f f43052a;

    /* renamed from: b */
    public p69 f43053b;

    public r69(w6f w6fVar) {
        sq8.m48649h(w6fVar, "delegate");
        this.f43052a = w6fVar;
    }

    @Override // p001o.a7f
    public Object Y0(t6f t6fVar, long j, n64 n64Var) {
        return this.f43052a.Y0(t6fVar, j, n64Var);
    }

    /* renamed from: a */
    public final void m46253a(p69 p69Var) {
        sq8.m48649h(p69Var, "job");
        if (isClosedForRead()) {
            p69Var.mo22429f(al6.m17345a("channel was already closed", this.f43052a.getClosedCause()));
        } else {
            this.f43053b = p69Var;
        }
    }

    @Override // p001o.y6f
    public boolean cancel(Throwable th) {
        p69 p69Var = this.f43053b;
        if (p69Var != null) {
            p69Var.mo22429f(al6.m17345a("channel was cancelled", th));
        }
        return this.f43052a.cancel(th);
    }

    @Override // p001o.w6f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43052a.close();
    }

    @Override // p001o.y6f
    public int getAvailableForRead() {
        return this.f43052a.getAvailableForRead();
    }

    @Override // p001o.y6f
    public Throwable getClosedCause() {
        return this.f43052a.getClosedCause();
    }

    @Override // p001o.y6f
    public boolean isClosedForRead() {
        return this.f43052a.isClosedForRead();
    }

    @Override // p001o.y6f
    public boolean isClosedForWrite() {
        return this.f43052a.isClosedForWrite();
    }

    @Override // p001o.a7f
    /* renamed from: q */
    public boolean mo16561q(Throwable th) {
        p69 p69Var;
        if (th != null && (p69Var = this.f43053b) != null) {
            p69Var.mo22429f(al6.m17345a("channel was closed with cause", th));
        }
        return this.f43052a.mo16561q(th);
    }

    @Override // p001o.y6f
    public Object read(t6f t6fVar, long j, n64 n64Var) {
        return this.f43052a.read(t6fVar, j, n64Var);
    }

    public /* synthetic */ r69(w6f w6fVar, int i, id5 id5Var) {
        this((i & 1) != 0 ? x6f.m55744b(true, 0, 2, null) : w6fVar);
    }
}
