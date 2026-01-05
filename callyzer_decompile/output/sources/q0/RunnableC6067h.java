package q0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q0.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6067h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C6069j f29586a;

    /* renamed from: b */
    public final /* synthetic */ int f29587b;

    /* renamed from: c */
    public final /* synthetic */ int f29588c;

    public /* synthetic */ RunnableC6067h(C6069j c6069j, int i10, int i11) {
        this.f29586a = c6069j;
        this.f29587b = i10;
        this.f29588c = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        C6069j c6069j = this.f29586a;
        int i10 = c6069j.f29601i;
        int i11 = this.f29587b;
        boolean z10 = true;
        if (i10 != i11) {
            c6069j.f29601i = i11;
            z6 = true;
        } else {
            z6 = false;
        }
        int i12 = c6069j.f29600h;
        int i13 = this.f29588c;
        if (i12 != i13) {
            c6069j.f29600h = i13;
        } else {
            z10 = z6;
        }
        if (z10) {
            c6069j.m12078e();
        }
    }
}
