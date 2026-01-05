package androidx.fragment.app;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public final class RunnableC0353r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2686a;

    /* renamed from: b */
    public final /* synthetic */ Object f2687b;

    public /* synthetic */ RunnableC0353r(int i10, Object obj) {
        this.f2686a = i10;
        this.f2687b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2686a) {
            case 0:
                DialogInterfaceOnCancelListenerC0358w dialogInterfaceOnCancelListenerC0358w = (DialogInterfaceOnCancelListenerC0358w) this.f2687b;
                dialogInterfaceOnCancelListenerC0358w.f2729d.onDismiss(dialogInterfaceOnCancelListenerC0358w.f2737m);
                break;
            case 1:
                C0352q c0352q = (C0352q) this.f2687b;
                if (!c0352q.f2675b.isEmpty()) {
                    c0352q.m1238e();
                    break;
                }
                break;
            default:
                ((j1) this.f2687b).m1201z(true);
                break;
        }
    }
}
