package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class mvi {

    /* renamed from: a */
    public final Executor f36046a;

    /* renamed from: b */
    public final AtomicInteger f36047b;

    public mvi(Executor executor) {
        sq8.m48649h(executor, "executor");
        this.f36046a = executor;
        this.f36047b = new AtomicInteger(0);
    }

    /* renamed from: a */
    public final int m39730a() {
        return this.f36047b.get();
    }

    /* renamed from: b */
    public final void m39731b() {
        this.f36047b.set(0);
        wja.m54627a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
