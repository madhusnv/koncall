package xc;

import com.sun.mail.util.AbstractC1452a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xc.d */
/* loaded from: classes.dex */
public final class C8323d {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39890e = AtomicIntegerFieldUpdater.newUpdater(C8323d.class, "b");

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39891f = AtomicIntegerFieldUpdater.newUpdater(C8323d.class, "c");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f39892g = AtomicIntegerFieldUpdater.newUpdater(C8323d.class, "d");

    /* renamed from: a */
    public final int f39893a;

    /* renamed from: c */
    public volatile /* synthetic */ int f39895c;

    /* renamed from: b */
    public volatile /* synthetic */ int f39894b = 0;

    /* renamed from: d */
    public volatile /* synthetic */ int f39896d = 0;

    public C8323d(int i10) {
        this.f39893a = i10;
        this.f39895c = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BufferCapacity(availableForRead: ");
        sb2.append(this.f39894b);
        sb2.append(", availableForWrite: ");
        sb2.append(this.f39895c);
        sb2.append(", pendingFlush: ");
        sb2.append(this.f39896d);
        sb2.append(", capacity: ");
        return AbstractC1452a.m4563j(sb2, this.f39893a, ')');
    }
}
