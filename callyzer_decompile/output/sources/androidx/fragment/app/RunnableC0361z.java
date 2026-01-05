package androidx.fragment.app;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.z */
/* loaded from: classes.dex */
public final class RunnableC0361z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2759a;

    /* renamed from: b */
    public final /* synthetic */ j0 f2760b;

    public /* synthetic */ RunnableC0361z(j0 j0Var, int i10) {
        this.f2759a = i10;
        this.f2760b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2759a) {
            case 0:
                this.f2760b.startPostponedEnterTransition();
                break;
            default:
                this.f2760b.callStartTransitionListener(false);
                break;
        }
    }
}
