package dy;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l7.C4417q;
import tx.c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dy.c */
/* loaded from: classes3.dex */
public final class C1855c extends C1860h implements InterfaceC1853a {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8832h = AtomicReferenceFieldUpdater.newUpdater(C1855c.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C1855c(boolean z6) {
        super(1, z6 ? 1 : 0);
        this.owner$volatile = z6 ? null : AbstractC1856d.f8833a;
    }

    /* renamed from: d */
    public final boolean m5488d() {
        return Math.max(C1860h.f8840g.get(this), 0) == 0;
    }

    /* renamed from: e */
    public final boolean m5489e() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1860h.f8840g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f8841a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    f8832h.set(this, null);
                    return true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r0.mo5485f(r1, r4.f8842b);
     */
    @Override // dy.InterfaceC1853a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo1768h(uw.InterfaceC7559c r5) {
        /*
            r4 = this;
            boolean r0 = r4.m5489e()
            qw.a0 r1 = qw.a0.f30746a
            if (r0 == 0) goto L9
            goto L3b
        L9:
            uw.c r5 = pg.n6.m11797c(r5)
            tx.k r5 = tx.c0.m13496s(r5)
            dy.b r0 = new dy.b     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L3c
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = dy.C1860h.f8840g     // Catch: java.lang.Throwable -> L3c
            int r2 = r2.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3c
            int r3 = r4.f8841a     // Catch: java.lang.Throwable -> L3c
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L28
            bt.l0 r2 = r4.f8842b     // Catch: java.lang.Throwable -> L3c
            r0.mo5485f(r1, r2)     // Catch: java.lang.Throwable -> L3c
            goto L2e
        L28:
            boolean r2 = r4.m5492b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L16
        L2e:
            java.lang.Object r5 = r5.m13539o()
            vw.a r0 = vw.EnumC7794a.COROUTINE_SUSPENDED
            if (r5 != r0) goto L37
            goto L38
        L37:
            r5 = r1
        L38:
            if (r5 != r0) goto L3b
            return r5
        L3b:
            return r1
        L3c:
            r0 = move-exception
            r5.m13546z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dy.C1855c.mo1768h(uw.c):java.lang.Object");
    }

    @Override // dy.InterfaceC1853a
    /* renamed from: j */
    public final void mo1769j(Object obj) {
        while (m5488d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8832h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C4417q c4417q = AbstractC1856d.f8833a;
            if (obj2 != c4417q) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c4417q)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    m5493c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + c0.m13494q(this) + "[isLocked=" + m5488d() + ",owner=" + f8832h.get(this) + ']';
    }
}
