package p001o;

/* loaded from: classes6.dex */
public final class rj1 extends nj1 {
    @Override // p001o.qag
    /* renamed from: e */
    public void mo18166e(Object obj) {
        if (this.f36900a == null) {
            this.f36900a = obj;
            this.f36902c.cancel();
            countDown();
        }
    }

    @Override // p001o.qag
    public void onError(Throwable th) {
        if (this.f36900a == null) {
            this.f36901b = th;
        } else {
            fwe.m27599r(th);
        }
        countDown();
    }
}
