package p001o;

import p001o.t8c;

/* loaded from: classes6.dex */
public final class g8c extends x6c implements k4f {

    /* renamed from: a */
    public final Object f24734a;

    public g8c(Object obj) {
        this.f24734a = obj;
    }

    @Override // p001o.k4f, p001o.idg
    public Object get() {
        return this.f24734a;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        t8c.RunnableC17028a runnableC17028a = new t8c.RunnableC17028a(m9cVar, this.f24734a);
        m9cVar.mo16559a(runnableC17028a);
        runnableC17028a.run();
    }
}
