package p001o;

import java.io.EOFException;

/* loaded from: classes6.dex */
public final class ri1 implements dvf {
    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) throws EOFException {
        sq8.m48649h(rl1Var, "source");
        rl1Var.skip(j);
    }

    @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p001o.dvf, java.io.Flushable
    public void flush() {
    }

    @Override // p001o.dvf
    public nmh timeout() {
        return nmh.f37049e;
    }
}
