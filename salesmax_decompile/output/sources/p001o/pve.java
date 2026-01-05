package p001o;

/* loaded from: classes6.dex */
public final class pve extends hge {
    public pve(Runnable runnable) {
        super(runnable);
    }

    @Override // p001o.hge
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo30424a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
