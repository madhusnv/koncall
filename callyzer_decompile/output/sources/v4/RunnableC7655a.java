package v4;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7655a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f37081a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f37082b;

    public /* synthetic */ RunnableC7655a(int i10, InterfaceC2137a interfaceC2137a) {
        this.f37081a = i10;
        this.f37082b = interfaceC2137a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37081a) {
            case 0:
                this.f37082b.invoke();
                break;
            case 1:
                this.f37082b.invoke();
                break;
            case 2:
                this.f37082b.invoke();
                break;
            case 3:
                this.f37082b.invoke();
                break;
            default:
                this.f37082b.invoke();
                break;
        }
    }
}
