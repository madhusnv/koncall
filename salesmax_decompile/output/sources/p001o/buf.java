package p001o;

/* loaded from: classes6.dex */
public final class buf extends wtf {

    /* renamed from: a */
    public final idg f16839a;

    public buf(idg idgVar) {
        this.f16839a = idgVar;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        try {
            th = (Throwable) xk6.m56415c(this.f16839a.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            zk6.m59526b(th);
        }
        h66.error(th, lufVar);
    }
}
