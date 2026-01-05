package p001o;

import java.util.concurrent.ThreadFactory;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class syb extends c5f {

    /* renamed from: c */
    public static final vwe f46117c = new vwe("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())));

    /* renamed from: b */
    public final ThreadFactory f46118b;

    public syb() {
        this(f46117c);
    }

    @Override // p001o.c5f
    /* renamed from: b */
    public c5f.AbstractC12571c mo20301b() {
        return new tyb(this.f46118b);
    }

    public syb(ThreadFactory threadFactory) {
        this.f46118b = threadFactory;
    }
}
