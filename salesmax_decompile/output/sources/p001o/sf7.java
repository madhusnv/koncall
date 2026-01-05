package p001o;

/* loaded from: classes6.dex */
public abstract class sf7 implements dvf {

    /* renamed from: a */
    public final dvf f45340a;

    public sf7(dvf dvfVar) {
        sq8.m48649h(dvfVar, "delegate");
        this.f45340a = dvfVar;
    }

    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "source");
        this.f45340a.M0(rl1Var, j);
    }

    @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45340a.close();
    }

    @Override // p001o.dvf, java.io.Flushable
    public void flush() {
        this.f45340a.flush();
    }

    @Override // p001o.dvf
    public nmh timeout() {
        return this.f45340a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f45340a + ')';
    }
}
