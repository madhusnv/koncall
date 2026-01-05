package tx;

import qw.C6361k;
import uw.C7560d;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import yx.AbstractC8808b;
import yx.C8822p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c2 extends C8822p {

    /* renamed from: e */
    public final ThreadLocal f34616e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public c2(InterfaceC7559c interfaceC7559c, InterfaceC7564h interfaceC7564h) {
        d2 d2Var = d2.f34622a;
        super(interfaceC7559c, interfaceC7564h.o0(d2Var) == null ? interfaceC7564h.t0(d2Var) : interfaceC7564h);
        this.f34616e = new ThreadLocal();
        if (interfaceC7559c.getContext().o0(C7560d.f36439a) instanceof AbstractC7262v) {
            return;
        }
        Object objM16256p = AbstractC8808b.m16256p(interfaceC7564h, null);
        AbstractC8808b.m16249i(interfaceC7564h, objM16256p);
        n0(interfaceC7564h, objM16256p);
    }

    @Override // yx.C8822p
    public final void k0() {
        m0();
    }

    @Override // yx.C8822p, tx.k1
    /* renamed from: l */
    public final void mo13504l(Object obj) {
        m0();
        Object objM13466B = c0.m13466B(obj);
        InterfaceC7559c interfaceC7559c = this.f42516d;
        InterfaceC7564h context = interfaceC7559c.getContext();
        Object objM16256p = AbstractC8808b.m16256p(context, null);
        c2 c2VarM13474J = objM16256p != AbstractC8808b.f42482d ? c0.m13474J(interfaceC7559c, context, objM16256p) : null;
        try {
            interfaceC7559c.resumeWith(objM13466B);
            if (c2VarM13474J == null || c2VarM13474J.l0()) {
                AbstractC8808b.m16249i(context, objM16256p);
            }
        } catch (Throwable th2) {
            if (c2VarM13474J == null || c2VarM13474J.l0()) {
                AbstractC8808b.m16249i(context, objM16256p);
            }
            throw th2;
        }
    }

    public final boolean l0() {
        boolean z6 = this.threadLocalIsSet && this.f34616e.get() == null;
        this.f34616e.remove();
        return !z6;
    }

    public final void m0() {
        if (this.threadLocalIsSet) {
            C6361k c6361k = (C6361k) this.f34616e.get();
            if (c6361k != null) {
                AbstractC8808b.m16249i((InterfaceC7564h) c6361k.f30755a, c6361k.f30756b);
            }
            this.f34616e.remove();
        }
    }

    public final void n0(InterfaceC7564h interfaceC7564h, Object obj) {
        this.threadLocalIsSet = true;
        this.f34616e.set(new C6361k(interfaceC7564h, obj));
    }
}
