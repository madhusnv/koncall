package p001o;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class vpa extends p7f implements sb3 {

    /* renamed from: c */
    public final sb3 f50699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpa(sb3 sb3Var) {
        super(sb3Var);
        sq8.m48649h(sb3Var, "delegate");
        this.f50699c = sb3Var;
    }

    @Override // p001o.h84
    /* renamed from: D */
    public q74 mo6529D() {
        return this.f50699c.mo6529D();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f50699c.close();
    }

    @Override // p001o.t18
    public x18 getConfig() {
        return this.f50699c.getConfig();
    }

    @Override // p001o.t18
    /* renamed from: u */
    public Object mo35244u(jl6 jl6Var, y38 y38Var, n64 n64Var) {
        return this.f50699c.mo35244u(jl6Var, y38Var, n64Var);
    }
}
