package uh;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.k */
/* loaded from: classes.dex */
public final class C7466k extends AbstractRunnableC7464i {

    /* renamed from: b */
    public final /* synthetic */ int f36055b;

    /* renamed from: c */
    public final /* synthetic */ Object f36056c;

    public /* synthetic */ C7466k(int i10, Object obj) {
        this.f36055b = i10;
        this.f36056c = obj;
    }

    @Override // uh.AbstractRunnableC7464i
    /* renamed from: a */
    public final void mo13417a() {
        switch (this.f36055b) {
            case 0:
                synchronized (((C7469n) this.f36056c).f36066f) {
                    try {
                        if (((C7469n) this.f36056c).f36071k.get() > 0 && ((C7469n) this.f36056c).f36071k.decrementAndGet() > 0) {
                            ((C7469n) this.f36056c).f36062b.m5720e("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C7469n c7469n = (C7469n) this.f36056c;
                        if (c7469n.f36073m != null) {
                            c7469n.f36062b.m5720e("Unbind from service.", new Object[0]);
                            C7469n c7469n2 = (C7469n) this.f36056c;
                            c7469n2.f36061a.unbindService(c7469n2.f36072l);
                            C7469n c7469n3 = (C7469n) this.f36056c;
                            c7469n3.f36067g = false;
                            c7469n3.f36073m = null;
                            c7469n3.f36072l = null;
                        }
                        ((C7469n) this.f36056c).m14275d();
                        return;
                    } finally {
                    }
                }
            default:
                C7469n c7469n4 = ((ServiceConnectionC7468m) this.f36056c).f36059a;
                c7469n4.f36062b.m5720e("unlinkToDeath", new Object[0]);
                c7469n4.f36073m.asBinder().unlinkToDeath(c7469n4.f36070j, 0);
                c7469n4.f36073m = null;
                c7469n4.f36067g = false;
                return;
        }
    }
}
