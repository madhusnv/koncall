package yx;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import tx.q1;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.q */
/* loaded from: classes3.dex */
public abstract class AbstractC8823q extends AbstractC8809c implements q1 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42517d = AtomicIntegerFieldUpdater.newUpdater(AbstractC8823q.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f42518c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC8823q(long j6, AbstractC8823q abstractC8823q, int i10) {
        super(abstractC8823q);
        this.f42518c = j6;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // yx.AbstractC8809c
    /* renamed from: d */
    public final boolean mo16259d() {
        return f42517d.get(this) == mo5495g() && m16258c() != null;
    }

    /* renamed from: f */
    public final boolean m16276f() {
        return f42517d.addAndGet(this, -65536) == mo5495g() && m16258c() != null;
    }

    /* renamed from: g */
    public abstract int mo5495g();

    /* renamed from: h */
    public abstract void mo5496h(int i10, InterfaceC7564h interfaceC7564h);

    /* renamed from: i */
    public final void m16277i() {
        if (f42517d.incrementAndGet(this) == mo5495g()) {
            m16260e();
        }
    }

    /* renamed from: j */
    public final boolean m16278j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f42517d;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == mo5495g() && m16258c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
