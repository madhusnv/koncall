package p020v;

import c9.C0917l;
import java.util.concurrent.atomic.AtomicBoolean;
import ug.C7439j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.s */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7609s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36688a;

    /* renamed from: b */
    public final /* synthetic */ C7439j f36689b;

    public /* synthetic */ RunnableC7609s(C7439j c7439j, int i10) {
        this.f36688a = i10;
        this.f36689b = c7439j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36688a) {
            case 0:
                C7439j c7439j = this.f36689b;
                if (!((AtomicBoolean) c7439j.f35538c).getAndSet(true)) {
                    ((C7612v) ((C0917l) c7439j.f35539d).f5595c).f36721c.execute(new RunnableC7609s(c7439j, 1));
                    break;
                }
                break;
            default:
                C7439j c7439j2 = this.f36689b;
                if (((C7612v) ((C0917l) c7439j2.f35539d).f5595c).f36723e == EnumC7610t.OPENING) {
                    ((C7612v) ((C0917l) c7439j2.f35539d).f5595c).m14455w("Camera onError timeout, reopen it.");
                    ((C7612v) ((C0917l) c7439j2.f35539d).f5595c).m14442G(EnumC7610t.REOPENING);
                    ((C7612v) ((C0917l) c7439j2.f35539d).f5595c).f36727j.m14431b();
                    break;
                } else {
                    ((C7612v) ((C0917l) c7439j2.f35539d).f5595c).m14455w("Camera skip reopen at state: " + ((C7612v) ((C0917l) c7439j2.f35539d).f5595c).f36723e);
                    break;
                }
        }
    }
}
