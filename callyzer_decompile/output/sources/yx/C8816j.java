package yx;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yx.j */
/* loaded from: classes3.dex */
public class C8816j {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42505a = AtomicReferenceFieldUpdater.newUpdater(C8816j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new C8818l(8, false);

    /* renamed from: a */
    public final boolean m16265a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42505a;
            C8818l c8818l = (C8818l) atomicReferenceFieldUpdater.get(this);
            int iM16269a = c8818l.m16269a(runnable);
            if (iM16269a == 0) {
                return true;
            }
            if (iM16269a == 1) {
                C8818l c8818lM16271c = c8818l.m16271c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c8818l, c8818lM16271c) && atomicReferenceFieldUpdater.get(this) == c8818l) {
                }
            } else if (iM16269a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m16266b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42505a;
            C8818l c8818l = (C8818l) atomicReferenceFieldUpdater.get(this);
            if (c8818l.m16270b()) {
                return;
            }
            C8818l c8818lM16271c = c8818l.m16271c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c8818l, c8818lM16271c) && atomicReferenceFieldUpdater.get(this) == c8818l) {
            }
        }
    }

    /* renamed from: c */
    public final int m16267c() {
        C8818l c8818l = (C8818l) f42505a.get(this);
        c8818l.getClass();
        long j6 = C8818l.f42508f.get(c8818l);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    /* renamed from: d */
    public final Object m16268d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42505a;
            C8818l c8818l = (C8818l) atomicReferenceFieldUpdater.get(this);
            Object objM16272d = c8818l.m16272d();
            if (objM16272d != C8818l.f42509g) {
                return objM16272d;
            }
            C8818l c8818lM16271c = c8818l.m16271c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c8818l, c8818lM16271c) && atomicReferenceFieldUpdater.get(this) == c8818l) {
            }
        }
    }
}
