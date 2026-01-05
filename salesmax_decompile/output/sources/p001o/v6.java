package p001o;

/* loaded from: classes3.dex */
public abstract class v6 implements v6f {

    /* renamed from: a */
    public final im1 f49909a;

    public v6(im1 im1Var) {
        sq8.m48649h(im1Var, "delegate");
        this.f49909a = im1Var;
    }

    /* renamed from: a */
    public final im1 m52350a() {
        return this.f49909a;
    }

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f49909a.close();
    }

    @Override // p001o.v6f
    /* renamed from: m */
    public byte[] mo49492m() {
        return this.f49909a.mo32310m();
    }

    @Override // p001o.v6f
    /* renamed from: n */
    public boolean mo49493n() {
        return this.f49909a.mo32311n();
    }

    @Override // p001o.v6f
    public int read(byte[] bArr, int i, int i2) {
        sq8.m48649h(bArr, "sink");
        return this.f49909a.read(bArr, i, i2);
    }

    @Override // p001o.h8f
    public long read(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "sink");
        return this.f49909a.N0(a74.m16536a(t6fVar), j);
    }
}
