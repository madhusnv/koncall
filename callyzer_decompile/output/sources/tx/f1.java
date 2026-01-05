package tx;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public class f1 extends k1 implements InterfaceC7258r {

    /* renamed from: c */
    public final boolean f34628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(e1 e1Var) {
        super(true);
        boolean z6 = true;
        m13554M(e1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f34654b;
        InterfaceC7254n interfaceC7254n = (InterfaceC7254n) atomicReferenceFieldUpdater.get(this);
        C7255o c7255o = interfaceC7254n instanceof C7255o ? (C7255o) interfaceC7254n : null;
        if (c7255o == null) {
            z6 = false;
            break;
        }
        k1 k1VarM13516g = c7255o.m13516g();
        while (!k1VarM13516g.mo13514E()) {
            InterfaceC7254n interfaceC7254n2 = (InterfaceC7254n) atomicReferenceFieldUpdater.get(k1VarM13516g);
            C7255o c7255o2 = interfaceC7254n2 instanceof C7255o ? (C7255o) interfaceC7254n2 : null;
            if (c7255o2 == null) {
                z6 = false;
                break;
            }
            k1VarM13516g = c7255o2.m13516g();
        }
        this.f34628c = z6;
    }

    @Override // tx.k1
    /* renamed from: E */
    public final boolean mo13514E() {
        return this.f34628c;
    }

    @Override // tx.k1
    /* renamed from: F */
    public final boolean mo13515F() {
        return true;
    }

    public final boolean i0() {
        return m13558R(qw.a0.f30746a);
    }
}
