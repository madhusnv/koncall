package p001o;

/* loaded from: classes3.dex */
public final class xac implements dvf {

    /* renamed from: a */
    public final f8f f53434a;

    public xac(f8f f8fVar) {
        sq8.m48649h(f8fVar, "delegate");
        this.f53434a = f8fVar;
    }

    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "source");
        this.f53434a.N1(new t6f(rl1Var), j);
    }

    /* renamed from: a */
    public final f8f m55916a() {
        return this.f53434a;
    }

    @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f53434a.close();
    }

    @Override // p001o.dvf, java.io.Flushable
    public void flush() {
        this.f53434a.flush();
    }

    @Override // p001o.dvf
    public nmh timeout() {
        return nmh.f37049e;
    }
}
