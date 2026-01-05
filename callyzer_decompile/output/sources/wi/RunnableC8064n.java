package wi;

import yi.InterfaceC8675d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC8064n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f38619a;

    /* renamed from: b */
    public final /* synthetic */ C8066p f38620b;

    /* renamed from: c */
    public final /* synthetic */ long f38621c;

    /* renamed from: d */
    public final /* synthetic */ String f38622d;

    public /* synthetic */ RunnableC8064n(C8066p c8066p, long j6, String str, int i10) {
        this.f38619a = i10;
        this.f38620b = c8066p;
        this.f38621c = j6;
        this.f38622d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38619a) {
            case 0:
                C8066p c8066p = this.f38620b;
                c8066p.f38638o.f40064b.m15551a(new RunnableC8064n(c8066p, this.f38621c, this.f38622d, 1));
                break;
            default:
                C8062l c8062l = this.f38620b.f38630g;
                C8068r c8068r = c8062l.f38612n;
                if (c8068r == null || !c8068r.f38650e.get()) {
                    ((InterfaceC8675d) c8062l.f38607i.f42016b).mo13826e(this.f38622d, this.f38621c);
                    break;
                }
                break;
        }
    }
}
