package p001o;

/* loaded from: classes3.dex */
public final class ekj extends ujj {

    /* renamed from: b */
    public final /* synthetic */ rkj f21800b;

    public ekj(rkj rkjVar) {
        this.f21800b = rkjVar;
    }

    @Override // p001o.ujj
    /* renamed from: a */
    public final void mo19307a() {
        synchronized (this.f21800b.f43746f) {
            if (this.f21800b.f43751k.get() > 0 && this.f21800b.f43751k.decrementAndGet() > 0) {
                this.f21800b.f43742b.m48398c("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            rkj rkjVar = this.f21800b;
            if (rkjVar.f43753m != null) {
                rkjVar.f43742b.m48398c("Unbind from service.", new Object[0]);
                rkj rkjVar2 = this.f21800b;
                rkjVar2.f43741a.unbindService(rkjVar2.f43752l);
                this.f21800b.f43747g = false;
                this.f21800b.f43753m = null;
                this.f21800b.f43752l = null;
            }
            this.f21800b.m46898w();
        }
    }
}
