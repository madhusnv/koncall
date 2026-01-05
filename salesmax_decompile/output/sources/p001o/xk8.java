package p001o;

import p001o.nlb;

/* loaded from: classes3.dex */
public final class xk8 implements lzf {

    /* renamed from: a */
    public final lzf f53864a;

    /* renamed from: b */
    public final nlb f53865b;

    /* renamed from: c */
    public final qx0 f53866c;

    public xk8(lzf lzfVar, nlb nlbVar, qx0 qx0Var) {
        sq8.m48649h(lzfVar, "delegate");
        sq8.m48649h(nlbVar, "counter");
        sq8.m48649h(qx0Var, "attributes");
        this.f53864a = lzfVar;
        this.f53865b = nlbVar;
        this.f53866c = qx0Var;
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "sink");
        long jN0 = this.f53864a.N0(rl1Var, j);
        if (jN0 > 0) {
            nlb.C15606b.m40755a(this.f53865b, jN0, this.f53866c, null, 4, null);
        }
        return jN0;
    }

    @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f53864a.close();
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return this.f53864a.timeout();
    }
}
