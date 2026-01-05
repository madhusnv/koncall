package kz;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kz.d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryC4298d implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f21705a;

    /* renamed from: b */
    public final /* synthetic */ boolean f21706b;

    public /* synthetic */ ThreadFactoryC4298d(String str, boolean z6) {
        this.f21705a = str;
        this.f21706b = z6;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f21705a);
        thread.setDaemon(this.f21706b);
        return thread;
    }
}
