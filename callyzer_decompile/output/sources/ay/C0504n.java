package ay;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ay.n */
/* loaded from: classes3.dex */
public final class C0504n {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3553b = AtomicReferenceFieldUpdater.newUpdater(C0504n.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3554c = AtomicIntegerFieldUpdater.newUpdater(C0504n.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3555d = AtomicIntegerFieldUpdater.newUpdater(C0504n.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3556e = AtomicIntegerFieldUpdater.newUpdater(C0504n.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f3557a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final AbstractRunnableC0500j m1498a(AbstractRunnableC0500j abstractRunnableC0500j) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3554c;
        if (atomicIntegerFieldUpdater.get(this) - f3555d.get(this) == 127) {
            return abstractRunnableC0500j;
        }
        if (abstractRunnableC0500j.f3544b) {
            f3556e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f3557a;
            if (atomicReferenceArray.get(i10) == null) {
                atomicReferenceArray.lazySet(i10, abstractRunnableC0500j);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    /* renamed from: b */
    public final AbstractRunnableC0500j m1499b() {
        AbstractRunnableC0500j abstractRunnableC0500j;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3555d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f3554c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (abstractRunnableC0500j = (AbstractRunnableC0500j) this.f3557a.getAndSet(i11, null)) != null) {
                if (abstractRunnableC0500j.f3544b) {
                    f3556e.decrementAndGet(this);
                }
                return abstractRunnableC0500j;
            }
        }
    }

    /* renamed from: c */
    public final AbstractRunnableC0500j m1500c(int i10, boolean z6) {
        int i11 = i10 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f3557a;
        AbstractRunnableC0500j abstractRunnableC0500j = (AbstractRunnableC0500j) atomicReferenceArray.get(i11);
        if (abstractRunnableC0500j != null && abstractRunnableC0500j.f3544b == z6) {
            while (!atomicReferenceArray.compareAndSet(i11, abstractRunnableC0500j, null)) {
                if (atomicReferenceArray.get(i11) != abstractRunnableC0500j) {
                }
            }
            if (z6) {
                f3556e.decrementAndGet(this);
            }
            return abstractRunnableC0500j;
        }
        return null;
    }
}
