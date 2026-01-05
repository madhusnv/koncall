package p001o;

/* loaded from: classes3.dex */
public abstract class u6 implements u6f {

    /* renamed from: a */
    public final gm1 f48376a;

    public u6(gm1 gm1Var) {
        sq8.m48649h(gm1Var, "delegate");
        this.f48376a = gm1Var;
    }

    @Override // p001o.u6f
    public long B0(h8f h8fVar) {
        sq8.m48649h(h8fVar, "source");
        return this.f48376a.p0(a74.m16538c(h8fVar));
    }

    @Override // p001o.f8f
    public void N1(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "source");
        this.f48376a.M0(a74.m16536a(t6fVar), j);
    }

    /* renamed from: a */
    public final gm1 m50961a() {
        return this.f48376a;
    }

    @Override // p001o.u6f
    /* renamed from: b */
    public void mo49488b() {
        this.f48376a.mo29024b();
    }

    @Override // p001o.f8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48376a.close();
    }

    @Override // p001o.f8f
    public void flush() {
        this.f48376a.flush();
    }

    @Override // p001o.u6f
    public t6f getBuffer() {
        return a74.m16539d(this.f48376a.getBuffer());
    }

    @Override // p001o.u6f
    /* renamed from: i */
    public void mo49491i(String str, int i, int i2) {
        sq8.m48649h(str, "string");
        this.f48376a.mo29025i(str, i, i2);
    }

    public String toString() {
        return this.f48376a.toString();
    }

    @Override // p001o.u6f
    public void write(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "source");
        this.f48376a.write(bArr, i, i2);
    }
}
