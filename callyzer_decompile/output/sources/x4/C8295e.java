package x4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pg.h7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x4.e */
/* loaded from: classes.dex */
public final class C8295e extends h7 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f39829a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater f39830b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater f39831c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater f39832d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater f39833e;

    public C8295e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f39829a = atomicReferenceFieldUpdater;
        this.f39830b = atomicReferenceFieldUpdater2;
        this.f39831c = atomicReferenceFieldUpdater3;
        this.f39832d = atomicReferenceFieldUpdater4;
        this.f39833e = atomicReferenceFieldUpdater5;
    }

    @Override // pg.h7
    /* renamed from: a */
    public final boolean mo11677a(AbstractC8298h abstractC8298h, C8294d c8294d, C8294d c8294d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f39832d;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC8298h, c8294d, c8294d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC8298h) == c8294d);
        return false;
    }

    @Override // pg.h7
    /* renamed from: b */
    public final boolean mo11678b(AbstractC8298h abstractC8298h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f39833e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC8298h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC8298h) == obj);
        return false;
    }

    @Override // pg.h7
    /* renamed from: c */
    public final boolean mo11679c(AbstractC8298h abstractC8298h, C8297g c8297g, C8297g c8297g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f39831c;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC8298h, c8297g, c8297g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC8298h) == c8297g);
        return false;
    }

    @Override // pg.h7
    /* renamed from: e */
    public final void mo11680e(C8297g c8297g, C8297g c8297g2) {
        this.f39830b.lazySet(c8297g, c8297g2);
    }

    @Override // pg.h7
    /* renamed from: f */
    public final void mo11681f(C8297g c8297g, Thread thread) {
        this.f39829a.lazySet(c8297g, thread);
    }
}
