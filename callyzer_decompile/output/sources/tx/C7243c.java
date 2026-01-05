package tx;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import l7.C4417q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.c */
/* loaded from: classes3.dex */
public final class C7243c extends g1 {

    /* renamed from: h */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34601h = AtomicReferenceFieldUpdater.newUpdater(C7243c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* renamed from: e */
    public final C7251k f34602e;

    /* renamed from: f */
    public o0 f34603f;

    /* renamed from: g */
    public final /* synthetic */ C7245e f34604g;

    public C7243c(C7245e c7245e, C7251k c7251k) {
        this.f34604g = c7245e;
        this.f34602e = c7251k;
    }

    @Override // tx.g1
    /* renamed from: j */
    public final boolean mo13463j() {
        return false;
    }

    @Override // tx.g1
    /* renamed from: k */
    public final void mo13464k(Throwable th2) throws DispatchException {
        C7251k c7251k = this.f34602e;
        if (th2 != null) {
            c7251k.getClass();
            C4417q c4417qM13528D = c7251k.m13528D(new C7260t(th2, false), null);
            if (c4417qM13528D != null) {
                c7251k.mo5487s(c4417qM13528D);
                C7244d c7244d = (C7244d) f34601h.get(this);
                if (c7244d != null) {
                    c7244d.m13505a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C7245e.f34623b;
        C7245e c7245e = this.f34604g;
        if (atomicIntegerFieldUpdater.decrementAndGet(c7245e) == 0) {
            f0[] f0VarArr = c7245e.f34624a;
            ArrayList arrayList = new ArrayList(f0VarArr.length);
            for (f0 f0Var : f0VarArr) {
                arrayList.add(f0Var.m13513n());
            }
            c7251k.resumeWith(arrayList);
        }
    }
}
