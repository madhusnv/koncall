package q0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6065f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f29579a;

    /* renamed from: b */
    public final /* synthetic */ C6068i f29580b;

    public /* synthetic */ RunnableC6065f(C6068i c6068i, int i10) {
        this.f29579a = i10;
        this.f29580b = c6068i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29579a) {
            case 0:
                this.f29580b.mo7416a();
                break;
            case 1:
                this.f29580b.m7417b();
                break;
            default:
                C6068i c6068i = this.f29580b;
                C6070k c6070k = c6068i.f29592r;
                if (c6070k != null) {
                    c6070k.m12081n();
                }
                if (c6068i.f29591q == null) {
                    c6068i.f29590p.m15508c();
                }
                c6068i.f29591q = null;
                break;
        }
    }
}
