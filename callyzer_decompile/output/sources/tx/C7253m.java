package tx;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import l7.C4417q;
import yx.AbstractC8808b;
import yx.C8812f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.m */
/* loaded from: classes3.dex */
public final class C7253m extends g1 {

    /* renamed from: e */
    public final /* synthetic */ int f34657e;

    /* renamed from: f */
    public final C7251k f34658f;

    public /* synthetic */ C7253m(C7251k c7251k, int i10) {
        this.f34657e = i10;
        this.f34658f = c7251k;
    }

    @Override // tx.g1
    /* renamed from: j */
    public final boolean mo13463j() {
        switch (this.f34657e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // tx.g1
    /* renamed from: k */
    public final void mo13464k(Throwable th2) {
        switch (this.f34657e) {
            case 0:
                k1 k1VarM13516g = m13516g();
                C7251k c7251k = this.f34658f;
                Throwable thMo13518n = c7251k.mo13518n(k1VarM13516g);
                if (c7251k.m13545w()) {
                    C8812f c8812f = (C8812f) c7251k.f34650d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C8812f.f42490h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c8812f);
                        C4417q c4417q = AbstractC8808b.f42481c;
                        if (AbstractC4154l.m8918a(obj, c4417q)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c8812f, c4417q, thMo13518n)) {
                                if (atomicReferenceFieldUpdater.get(c8812f) != c4417q) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c8812f, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(c8812f) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                c7251k.cancel(thMo13518n);
                if (!c7251k.m13545w()) {
                    c7251k.m13537l();
                    break;
                }
                break;
            default:
                this.f34658f.resumeWith(qw.a0.f30746a);
                break;
        }
    }
}
