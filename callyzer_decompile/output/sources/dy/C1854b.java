package dy;

import an.j2;
import bt.l0;
import ex.InterfaceC2142f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import l7.C4417q;
import qw.a0;
import tx.C7251k;
import tx.InterfaceC7250j;
import tx.e2;
import uw.InterfaceC7564h;
import yx.AbstractC8823q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dy.b */
/* loaded from: classes3.dex */
public final class C1854b implements InterfaceC7250j, e2 {

    /* renamed from: a */
    public final C7251k f8830a;

    /* renamed from: b */
    public final /* synthetic */ C1855c f8831b;

    public C1854b(C1855c c1855c, C7251k c7251k) {
        this.f8831b = c1855c;
        this.f8830a = c7251k;
    }

    @Override // tx.e2
    /* renamed from: a */
    public final void mo5076a(AbstractC8823q abstractC8823q, int i10) {
        this.f8830a.mo5076a(abstractC8823q, i10);
    }

    @Override // tx.InterfaceC7250j
    public final boolean cancel(Throwable th2) {
        return this.f8830a.cancel(th2);
    }

    @Override // tx.InterfaceC7250j
    /* renamed from: f */
    public final void mo5485f(Object obj, InterfaceC2142f interfaceC2142f) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1855c.f8832h;
        C1855c c1855c = this.f8831b;
        atomicReferenceFieldUpdater.set(c1855c, null);
        j2 j2Var = new j2(c1855c, this);
        C7251k c7251k = this.f8830a;
        c7251k.m13526A((a0) obj, c7251k.f34652c, new l0(23, j2Var));
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return this.f8830a.f34651e;
    }

    @Override // tx.InterfaceC7250j
    /* renamed from: r */
    public final C4417q mo5486r(Object obj, InterfaceC2142f interfaceC2142f) {
        C1855c c1855c = this.f8831b;
        l0 l0Var = new l0(c1855c, this);
        C4417q c4417qM13528D = this.f8830a.m13528D((a0) obj, l0Var);
        if (c4417qM13528D != null) {
            C1855c.f8832h.set(c1855c, null);
        }
        return c4417qM13528D;
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        this.f8830a.resumeWith(obj);
    }

    @Override // tx.InterfaceC7250j
    /* renamed from: s */
    public final void mo5487s(Object obj) throws DispatchException {
        this.f8830a.mo5487s(obj);
    }
}
