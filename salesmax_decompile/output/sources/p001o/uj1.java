package p001o;

/* loaded from: classes6.dex */
public final class uj1 extends mj1 {
    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        this.f35535a = obj;
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        this.f35535a = null;
        this.f35536b = th;
        countDown();
    }
}
