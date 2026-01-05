package p001o;

/* loaded from: classes3.dex */
public final class wac implements h8f {

    /* renamed from: a */
    public final lzf f51701a;

    public wac(lzf lzfVar) {
        sq8.m48649h(lzfVar, "delegate");
        this.f51701a = lzfVar;
    }

    /* renamed from: a */
    public final lzf m54149a() {
        return this.f51701a;
    }

    @Override // p001o.h8f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51701a.close();
    }

    @Override // p001o.h8f
    public long read(t6f t6fVar, long j) {
        sq8.m48649h(t6fVar, "sink");
        return this.f51701a.N0(a74.m16536a(t6fVar), j);
    }
}
