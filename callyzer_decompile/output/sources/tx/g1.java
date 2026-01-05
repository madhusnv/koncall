package tx;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC4154l;
import yx.C8815i;
import yx.C8820n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class g1 extends C8815i implements o0, b1 {

    /* renamed from: d */
    public k1 f34632d;

    @Override // tx.o0
    public final void dispose() {
        k1 k1VarM13516g = m13516g();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f34653a;
            Object obj = atomicReferenceFieldUpdater.get(k1VarM13516g);
            if (obj instanceof g1) {
                if (obj != this) {
                    return;
                }
                q0 q0Var = c0.f34614j;
                while (!atomicReferenceFieldUpdater.compareAndSet(k1VarM13516g, obj, q0Var)) {
                    if (atomicReferenceFieldUpdater.get(k1VarM13516g) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof b1) || ((b1) obj).mo13462i() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C8815i.f42502a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C8820n) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C8815i c8815i = (C8815i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C8815i.f42504c;
                C8820n c8820n = (C8820n) atomicReferenceFieldUpdater3.get(c8815i);
                if (c8820n == null) {
                    c8820n = new C8820n(c8815i);
                    atomicReferenceFieldUpdater3.set(c8815i, c8820n);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c8820n)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c8815i.m16262c();
                return;
            }
        }
    }

    /* renamed from: g */
    public final k1 m13516g() {
        k1 k1Var = this.f34632d;
        if (k1Var != null) {
            return k1Var;
        }
        AbstractC4154l.m8928k("job");
        throw null;
    }

    public e1 getParent() {
        return m13516g();
    }

    @Override // tx.b1
    /* renamed from: h */
    public final boolean mo13461h() {
        return true;
    }

    @Override // tx.b1
    /* renamed from: i */
    public final n1 mo13462i() {
        return null;
    }

    /* renamed from: j */
    public abstract boolean mo13463j();

    /* renamed from: k */
    public abstract void mo13464k(Throwable th2);

    @Override // yx.C8815i
    public final String toString() {
        return getClass().getSimpleName() + '@' + c0.m13494q(this) + "[job@" + c0.m13494q(m13516g()) + ']';
    }
}
