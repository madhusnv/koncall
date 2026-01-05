package tx;

import kotlin.jvm.internal.AbstractC4154l;
import uw.AbstractC7557a;
import uw.C7560d;
import uw.InterfaceC7561e;
import uw.InterfaceC7562f;
import uw.InterfaceC7563g;
import uw.InterfaceC7564h;
import yx.AbstractC8808b;
import yx.C8813g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tx.v */
/* loaded from: classes3.dex */
public abstract class AbstractC7262v extends AbstractC7557a implements InterfaceC7561e {

    /* renamed from: b */
    public static final C7261u f34684b = new C7261u(C7560d.f36439a, new rn.i0(29));

    public AbstractC7262v() {
        super(C7560d.f36439a);
    }

    public abstract void B0(InterfaceC7564h interfaceC7564h, Runnable runnable);

    public void C0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        AbstractC8808b.m16251k(this, interfaceC7564h, runnable);
    }

    public boolean D0(InterfaceC7564h interfaceC7564h) {
        return !(this instanceof b2);
    }

    public AbstractC7262v E0(int i10) {
        AbstractC8808b.m16243c(i10);
        return new C8813g(this, i10);
    }

    @Override // uw.AbstractC7557a, uw.InterfaceC7564h
    public final InterfaceC7562f o0(InterfaceC7563g key) {
        InterfaceC7562f interfaceC7562f;
        AbstractC4154l.m8923f(key, "key");
        if (key instanceof C7261u) {
            C7261u c7261u = (C7261u) key;
            InterfaceC7563g key2 = this.f36436a;
            AbstractC4154l.m8923f(key2, "key");
            if ((key2 == c7261u || c7261u.f34682b == key2) && (interfaceC7562f = (InterfaceC7562f) c7261u.f34681a.invoke(this)) != null) {
                return interfaceC7562f;
            }
        } else if (C7560d.f36439a == key) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + c0.m13494q(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (((uw.InterfaceC7562f) r3.f34681a.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (uw.C7560d.f36439a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        return uw.C7565i.f36440a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        return r2;
     */
    @Override // uw.AbstractC7557a, uw.InterfaceC7564h
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final uw.InterfaceC7564h mo1766z(uw.InterfaceC7563g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r3, r0)
            boolean r1 = r3 instanceof tx.C7261u
            if (r1 == 0) goto L23
            tx.u r3 = (tx.C7261u) r3
            uw.g r1 = r2.f36436a
            kotlin.jvm.internal.AbstractC4154l.m8923f(r1, r0)
            if (r1 == r3) goto L18
            uw.g r0 = r3.f34682b
            if (r0 != r1) goto L17
            goto L18
        L17:
            return r2
        L18:
            ex.c r3 = r3.f34681a
            java.lang.Object r3 = r3.invoke(r2)
            uw.f r3 = (uw.InterfaceC7562f) r3
            if (r3 == 0) goto L2a
            goto L27
        L23:
            uw.d r0 = uw.C7560d.f36439a
            if (r0 != r3) goto L2a
        L27:
            uw.i r3 = uw.C7565i.f36440a
            return r3
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.AbstractC7262v.mo1766z(uw.g):uw.h");
    }
}
