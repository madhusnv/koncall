package p001o;

/* loaded from: classes6.dex */
public final class qj1 extends mj1 {
    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        if (this.f35535a == null) {
            this.f35535a = obj;
            this.f35537c.dispose();
            countDown();
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        if (this.f35535a == null) {
            this.f35536b = th;
        }
        countDown();
    }
}
