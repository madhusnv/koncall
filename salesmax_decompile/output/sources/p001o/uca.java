package p001o;

import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.InterfaceC2146o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class uca implements qca, wca {

    /* renamed from: a */
    public final Set f48711a = new HashSet();

    /* renamed from: b */
    public final AbstractC2139h f48712b;

    public uca(AbstractC2139h abstractC2139h) {
        this.f48712b = abstractC2139h;
        abstractC2139h.mo6521a(this);
    }

    @Override // p001o.qca
    /* renamed from: a */
    public void mo43994a(vca vcaVar) {
        this.f48711a.add(vcaVar);
        if (this.f48712b.mo6522b() == AbstractC2139h.b.DESTROYED) {
            vcaVar.onDestroy();
        } else if (this.f48712b.mo6522b().isAtLeast(AbstractC2139h.b.STARTED)) {
            vcaVar.onStart();
        } else {
            vcaVar.onStop();
        }
    }

    @Override // p001o.qca
    /* renamed from: b */
    public void mo43995b(vca vcaVar) {
        this.f48711a.remove(vcaVar);
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_DESTROY)
    public void onDestroy(xca xcaVar) {
        Iterator it = uqi.m51928i(this.f48711a).iterator();
        while (it.hasNext()) {
            ((vca) it.next()).onDestroy();
        }
        xcaVar.getLifecycle().mo6524d(this);
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_START)
    public void onStart(xca xcaVar) {
        Iterator it = uqi.m51928i(this.f48711a).iterator();
        while (it.hasNext()) {
            ((vca) it.next()).onStart();
        }
    }

    @InterfaceC2146o(AbstractC2139h.a.ON_STOP)
    public void onStop(xca xcaVar) {
        Iterator it = uqi.m51928i(this.f48711a).iterator();
        while (it.hasNext()) {
            ((vca) it.next()).onStop();
        }
    }
}
