package ag;

import android.os.Process;
import android.util.Log;
import og.f1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ag.b */
/* loaded from: classes.dex */
public final class RunnableC0142b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f450a;

    /* renamed from: b */
    public final Runnable f451b;

    public /* synthetic */ RunnableC0142b(Runnable runnable, int i10) {
        this.f450a = i10;
        this.f451b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f450a) {
            case 0:
                Process.setThreadPriority(0);
                this.f451b.run();
                break;
            case 1:
                this.f451b.run();
                break;
            case 2:
                this.f451b.run();
                break;
            default:
                try {
                    this.f451b.run();
                    break;
                } catch (Exception unused) {
                    Log.isLoggable(f1.m10639c("Executor"), 6);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f450a) {
            case 2:
                return this.f451b.toString();
            default:
                return super.toString();
        }
    }
}
