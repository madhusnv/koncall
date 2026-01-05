package p001o;

/* loaded from: classes3.dex */
public final class yac implements lzf {

    /* renamed from: a */
    public final h8f f55158a;

    public yac(h8f h8fVar) {
        sq8.m48649h(h8fVar, "delegate");
        this.f55158a = h8fVar;
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "sink");
        return this.f55158a.read(new t6f(rl1Var), j);
    }

    /* renamed from: a */
    public final h8f m57426a() {
        return this.f55158a;
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f55158a.close();
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return nmh.f37049e;
    }
}
