package vx;

import dr.C1762l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobCancellationException;
import l7.C4417q;
import tb.C7105p;
import tx.AbstractC7241a;
import tx.c0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vx.t */
/* loaded from: classes3.dex */
public final class C7818t extends AbstractC7241a implements InterfaceC7819u, InterfaceC7810l {

    /* renamed from: d */
    public final C7806h f37529d;

    public C7818t(InterfaceC7564h interfaceC7564h, C7806h c7806h) {
        super(interfaceC7564h, true);
        this.f37529d = c7806h;
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: a */
    public final C7105p mo14771a() {
        return this.f37529d.mo14771a();
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: b */
    public final Object mo14772b() {
        return this.f37529d.mo14772b();
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: c */
    public final Object mo14773c(C1762l c1762l) {
        C7806h c7806h = this.f37529d;
        c7806h.getClass();
        Object objM14754F = C7806h.m14754F(c7806h, c1762l);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        return objM14754F;
    }

    @Override // vx.InterfaceC7821w
    /* renamed from: e */
    public final Object mo14774e(AbstractC8199i abstractC8199i) {
        return this.f37529d.mo14774e(abstractC8199i);
    }

    @Override // vx.InterfaceC7822x
    /* renamed from: g */
    public final Object mo14775g(Object obj, InterfaceC7559c interfaceC7559c) {
        return this.f37529d.mo14775g(obj, interfaceC7559c);
    }

    @Override // vx.InterfaceC7822x
    /* renamed from: i */
    public final Object mo14776i(Object obj) {
        return this.f37529d.mo14776i(obj);
    }

    @Override // tx.AbstractC7241a
    public final void i0(Throwable th2, boolean z6) {
        if (this.f37529d.m14782o(th2, false) || z6) {
            return;
        }
        c0.m13497t(th2, this.f34593c);
    }

    @Override // vx.InterfaceC7821w
    public final C7800b iterator() {
        C7806h c7806h = this.f37529d;
        c7806h.getClass();
        return new C7800b(c7806h);
    }

    @Override // tx.k1, tx.e1
    /* renamed from: j */
    public final void mo13510j(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo13460t(), null, this);
        }
        mo13566p(cancellationException);
    }

    @Override // tx.AbstractC7241a
    public final void j0(Object obj) {
        this.f37529d.m14781n(null);
    }

    public final boolean k0(Throwable th2) {
        return this.f37529d.m14782o(th2, false);
    }

    public final void l0(C7817s c7817s) {
        C7806h c7806h = this.f37529d;
        c7806h.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7806h.f37492m;
        while (!atomicReferenceFieldUpdater.compareAndSet(c7806h, null, c7817s)) {
            if (atomicReferenceFieldUpdater.get(c7806h) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c7806h);
                    C4417q c4417q = AbstractC7808j.f37513q;
                    if (obj != c4417q) {
                        if (obj == AbstractC7808j.f37514r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C4417q c4417q2 = AbstractC7808j.f37514r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(c7806h, c4417q, c4417q2)) {
                        if (atomicReferenceFieldUpdater.get(c7806h) != c4417q) {
                            break;
                        }
                    }
                    c7817s.invoke(c7806h.m14787t());
                    return;
                }
            }
        }
    }

    @Override // tx.k1
    /* renamed from: p */
    public final void mo13566p(CancellationException cancellationException) {
        this.f37529d.m14782o(cancellationException, true);
        m13565o(cancellationException);
    }
}
