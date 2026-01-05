package p001o;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p001o.ha3;

/* loaded from: classes6.dex */
public final class kij extends PhantomReference implements ha3.InterfaceC13897a {

    /* renamed from: a */
    public final Set f32290a;

    /* renamed from: b */
    public final Runnable f32291b;

    public /* synthetic */ kij(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, fij fijVar) {
        super(obj, referenceQueue);
        this.f32290a = set;
        this.f32291b = runnable;
    }

    @Override // p001o.ha3.InterfaceC13897a
    /* renamed from: a */
    public final void mo30032a() {
        if (this.f32290a.remove(this)) {
            clear();
            this.f32291b.run();
        }
    }
}
