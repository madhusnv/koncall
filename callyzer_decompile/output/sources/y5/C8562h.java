package y5;

import android.os.Process;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y5.h */
/* loaded from: classes.dex */
public final class C8562h extends Thread {

    /* renamed from: a */
    public final int f41559a;

    public C8562h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f41559a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f41559a);
        super.run();
    }
}
