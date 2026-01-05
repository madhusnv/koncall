package p001o;

/* loaded from: classes6.dex */
public final class j0b extends g0b {

    /* renamed from: a */
    public final idg f29520a;

    public j0b(idg idgVar) {
        this.f29520a = idgVar;
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        q0bVar.mo34822a(su5.m48920j());
        try {
            th = (Throwable) xk6.m56415c(this.f29520a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            zk6.m59526b(th);
        }
        q0bVar.onError(th);
    }
}
