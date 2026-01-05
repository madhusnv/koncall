package p001o;

/* loaded from: classes3.dex */
public final class vac implements f8f {

    /* renamed from: a */
    public final dvf f50079a;

    public vac(dvf dvfVar) {
        sq8.m48649h(dvfVar, "delegate");
        this.f50079a = dvfVar;
    }

    @Override // p001o.f8f
    public void N1(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "source");
        this.f50079a.M0(a74.m16536a(t6fVar), j);
    }

    /* renamed from: a */
    public final dvf m52499a() {
        return this.f50079a;
    }

    @Override // p001o.f8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f50079a.close();
    }

    @Override // p001o.f8f
    public void flush() {
        this.f50079a.flush();
    }
}
