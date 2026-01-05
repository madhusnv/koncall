package k0;

import java.util.concurrent.ThreadFactory;
import y5.C8562h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.e */
/* loaded from: classes.dex */
public final class ThreadFactoryC3895e implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f19997a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f19997a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            default:
                return new C8562h(runnable);
        }
    }
}
