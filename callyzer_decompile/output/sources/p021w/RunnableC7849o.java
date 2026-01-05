package p021w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7849o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f37617a;

    /* renamed from: b */
    public final /* synthetic */ C7850p f37618b;

    /* renamed from: c */
    public final /* synthetic */ String f37619c;

    public /* synthetic */ RunnableC7849o(C7850p c7850p, String str, int i10) {
        this.f37617a = i10;
        this.f37618b = c7850p;
        this.f37619c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37617a) {
            case 0:
                this.f37618b.f37621b.onCameraAvailable(this.f37619c);
                break;
            default:
                this.f37618b.f37621b.onCameraUnavailable(this.f37619c);
                break;
        }
    }
}
