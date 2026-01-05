package p001o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ms0 {

    /* renamed from: a */
    public final AtomicInteger f35897a;

    public ms0(int i) {
        this.f35897a = new AtomicInteger(i);
    }

    /* renamed from: a */
    public final int m39596a(int i) {
        return this.f35897a.addAndGet(i);
    }
}
