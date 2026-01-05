package q0;

import pg.t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6064e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f29577a;

    /* renamed from: b */
    public final /* synthetic */ C6069j f29578b;

    public /* synthetic */ RunnableC6064e(C6069j c6069j, int i10) {
        this.f29577a = i10;
        this.f29578b = c6069j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29577a) {
            case 0:
                t8.m11875d().execute(new RunnableC6064e(this.f29578b, 1));
                break;
            default:
                C6069j c6069j = this.f29578b;
                if (!c6069j.f29606n) {
                    c6069j.m12077d();
                    break;
                }
                break;
        }
    }
}
