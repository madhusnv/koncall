package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class kg2 {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32162e = AtomicIntegerFieldUpdater.newUpdater(kg2.class, "b");

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32163f = AtomicIntegerFieldUpdater.newUpdater(kg2.class, "c");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32164g = AtomicIntegerFieldUpdater.newUpdater(kg2.class, "d");

    /* renamed from: a */
    public final int f32165a;

    /* renamed from: c */
    public volatile /* synthetic */ int f32167c;

    /* renamed from: b */
    public volatile /* synthetic */ int f32166b = 0;

    /* renamed from: d */
    public volatile /* synthetic */ int f32168d = 0;

    public kg2(int i) {
        this.f32165a = i;
        this.f32167c = i;
    }

    /* renamed from: a */
    public final void m35641a(int i) {
        f32162e.getAndAdd(this, -i);
        f32163f.getAndAdd(this, i);
    }

    /* renamed from: b */
    public final void m35642b(int i) {
        f32163f.getAndAdd(this, -i);
        f32164g.getAndAdd(this, i);
    }

    /* renamed from: c */
    public final boolean m35643c() {
        int andSet = f32164g.getAndSet(this, 0);
        return andSet == 0 ? this.f32166b > 0 : f32162e.addAndGet(this, andSet) > 0;
    }

    public String toString() {
        return "BufferCapacity(availableForRead: " + this.f32166b + ", availableForWrite: " + this.f32167c + ", pendingFlush: " + this.f32168d + ", capacity: " + this.f32165a + ')';
    }
}
