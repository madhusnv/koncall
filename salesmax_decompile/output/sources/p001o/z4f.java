package p001o;

/* loaded from: classes6.dex */
public final class z4f extends l7 implements Runnable {
    public z4f(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33336b = Thread.currentThread();
        try {
            this.f33335a.run();
            this.f33336b = null;
        } catch (Throwable th) {
            this.f33336b = null;
            dispose();
            fwe.m27599r(th);
            throw th;
        }
    }
}
