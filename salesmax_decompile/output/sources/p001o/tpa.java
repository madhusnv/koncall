package p001o;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class tpa extends p7f implements rb3 {

    /* renamed from: c */
    public final rb3 f47526c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpa(rb3 rb3Var) {
        super(rb3Var);
        sq8.m48649h(rb3Var, "delegate");
        this.f47526c = rb3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f47526c.close();
    }

    @Override // p001o.qc4, p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        return this.f47526c.resolve(qx0Var, n64Var);
    }
}
