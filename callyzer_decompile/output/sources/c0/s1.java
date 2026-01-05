package c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5211a;

    /* renamed from: b */
    public final /* synthetic */ x1 f5212b;

    public /* synthetic */ s1(x1 x1Var, int i10) {
        this.f5211a = i10;
        this.f5212b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5211a) {
            case 0:
                this.f5212b.f5263f.cancel(true);
                break;
            default:
                this.f5212b.m2238c();
                break;
        }
    }
}
