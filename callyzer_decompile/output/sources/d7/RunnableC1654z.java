package d7;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.z */
/* loaded from: classes.dex */
public final class RunnableC1654z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ d0 f8162a;

    public RunnableC1654z(d0 d0Var) {
        this.f8162a = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f8162a.f8083a) {
            obj = this.f8162a.f8088f;
            this.f8162a.f8088f = d0.f8082k;
        }
        this.f8162a.m5321k(obj);
    }
}
