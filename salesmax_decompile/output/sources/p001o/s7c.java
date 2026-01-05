package p001o;

/* loaded from: classes6.dex */
public final class s7c extends x6c {

    /* renamed from: a */
    public final idg f44903a;

    public s7c(idg idgVar) {
        this.f44903a = idgVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        try {
            th = (Throwable) xk6.m56415c(this.f44903a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            zk6.m59526b(th);
        }
        h66.error(th, m9cVar);
    }
}
