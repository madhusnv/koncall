package t8;

import com.sun.mail.util.AbstractC1452a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.c */
/* loaded from: classes.dex */
public final class ThreadFactoryC7057c implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f34122a = new AtomicInteger(0);

    /* renamed from: b */
    public final /* synthetic */ boolean f34123b;

    public ThreadFactoryC7057c(boolean z6) {
        this.f34123b = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC4154l.m8923f(runnable, "runnable");
        StringBuilder sbM4568o = AbstractC1452a.m4568o(this.f34123b ? "WM.task-" : "androidx.work-");
        sbM4568o.append(this.f34122a.incrementAndGet());
        return new Thread(runnable, sbM4568o.toString());
    }
}
