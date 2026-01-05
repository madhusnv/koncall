package tx;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j1 implements b1 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34643b = AtomicIntegerFieldUpdater.newUpdater(j1.class, "_isCompleting$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34644c = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_rootCause$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34645d = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a */
    public final n1 f34646a;

    public j1(n1 n1Var, Throwable th2) {
        this.f34646a = n1Var;
        this._rootCause$volatile = th2;
    }

    /* renamed from: a */
    public final void m13520a(Throwable th2) {
        Throwable thM13521b = m13521b();
        if (thM13521b == null) {
            f34644c.set(this, th2);
            return;
        }
        if (th2 == thM13521b) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34645d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th2 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th2);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    /* renamed from: b */
    public final Throwable m13521b() {
        return (Throwable) f34644c.get(this);
    }

    /* renamed from: c */
    public final boolean m13522c() {
        return m13521b() != null;
    }

    /* renamed from: d */
    public final ArrayList m13523d(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34645d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM13521b = m13521b();
        if (thM13521b != null) {
            arrayList.add(0, thM13521b);
        }
        if (th2 != null && !th2.equals(thM13521b)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, c0.f34612h);
        return arrayList;
    }

    @Override // tx.b1
    /* renamed from: h */
    public final boolean mo13461h() {
        return m13521b() == null;
    }

    @Override // tx.b1
    /* renamed from: i */
    public final n1 mo13462i() {
        return this.f34646a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(m13522c());
        sb2.append(", completing=");
        sb2.append(f34643b.get(this) == 1);
        sb2.append(", rootCause=");
        sb2.append(m13521b());
        sb2.append(", exceptions=");
        sb2.append(f34645d.get(this));
        sb2.append(", list=");
        sb2.append(this.f34646a);
        sb2.append(']');
        return sb2.toString();
    }
}
