package p001o;

/* loaded from: classes6.dex */
public final class w4i extends cre implements lzf {

    /* renamed from: c */
    public final y9b f51490c;

    /* renamed from: d */
    public final long f51491d;

    public w4i(y9b y9bVar, long j) {
        this.f51490c = y9bVar;
        this.f51491d = j;
    }

    @Override // p001o.lzf
    public long N0(rl1 rl1Var, long j) {
        sq8.m48649h(rl1Var, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p001o.cre, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p001o.cre
    /* renamed from: g */
    public long mo21617g() {
        return this.f51491d;
    }

    @Override // p001o.cre
    /* renamed from: h */
    public y9b mo21618h() {
        return this.f51490c;
    }

    @Override // p001o.cre
    /* renamed from: o */
    public im1 mo21619o() {
        return uac.m51310c(this);
    }

    @Override // p001o.lzf
    public nmh timeout() {
        return nmh.f37049e;
    }
}
