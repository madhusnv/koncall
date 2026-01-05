package p001o;

import p001o.nlb;

/* loaded from: classes3.dex */
public final class wk8 implements dvf {

    /* renamed from: a */
    public final gm1 f52258a;

    /* renamed from: b */
    public final nlb f52259b;

    /* renamed from: c */
    public final qx0 f52260c;

    public wk8(gm1 gm1Var, nlb nlbVar, qx0 qx0Var) {
        sq8.m48649h(gm1Var, "delegate");
        sq8.m48649h(nlbVar, "counter");
        sq8.m48649h(qx0Var, "attributes");
        this.f52258a = gm1Var;
        this.f52259b = nlbVar;
        this.f52260c = qx0Var;
    }

    @Override // p001o.dvf
    public void M0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "source");
        this.f52258a.M0(rl1Var, j);
        nlb.C15606b.m40755a(this.f52259b, j, this.f52260c, null, 4, null);
    }

    @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52258a.mo29024b();
        this.f52258a.close();
    }

    @Override // p001o.dvf, java.io.Flushable
    public void flush() {
        this.f52258a.flush();
    }

    @Override // p001o.dvf
    public nmh timeout() {
        return this.f52258a.timeout();
    }
}
