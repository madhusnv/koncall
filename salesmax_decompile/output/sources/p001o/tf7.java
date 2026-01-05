package p001o;

/* loaded from: classes6.dex */
public abstract class tf7 implements lzf {

    /* renamed from: a */
    public final lzf f46994a;

    public tf7(lzf lzfVar) {
        sq8.m48649h(lzfVar, "delegate");
        this.f46994a = lzfVar;
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "sink");
        return this.f46994a.N0(rl1Var, j);
    }

    /* renamed from: a */
    public final lzf m49807a() {
        return this.f46994a;
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46994a.close();
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f46994a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f46994a + ')';
    }
}
