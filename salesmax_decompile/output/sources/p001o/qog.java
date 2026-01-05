package p001o;

/* loaded from: classes6.dex */
public final class qog extends xjg {

    /* renamed from: c */
    public final Runnable f42253c;

    public qog(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.f42253c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f42253c.run();
    }

    public String toString() {
        return "Task[" + o75.m41657a(this.f42253c) + '@' + o75.m41658b(this.f42253c) + ", " + this.f53853a + ", " + d2h.m22292c(this.f53854b) + ']';
    }
}
