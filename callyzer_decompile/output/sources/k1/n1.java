package k1;

import en.C2073f;
import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import xm.q4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20192a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f20193b;

    /* renamed from: c */
    public /* synthetic */ Object f20194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(long j6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20193b = j6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20192a) {
            case 0:
                n1 n1Var = new n1(this.f20193b, interfaceC7559c);
                n1Var.f20194c = obj;
                return n1Var;
            default:
                return new n1((q4) this.f20194c, this.f20193b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20192a) {
            case 0:
                n1 n1Var = (n1) create((v1) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                n1Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                n1 n1Var2 = (n1) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                n1Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f20192a;
        qw.a0 a0Var = qw.a0.f30746a;
        long j6 = this.f20193b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                x1 x1Var = ((v1) this.f20194c).f20281a;
                x1.m8475a(x1Var, x1Var.f20318j, j6, 1);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                wx.m1 m1Var = ((q4) this.f20194c).f40744d;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C2073f.m5790a((C2073f) value, false, 0, null, new Long(j6), null, false, null, 239)));
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(q4 q4Var, long j6, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20194c = q4Var;
        this.f20193b = j6;
    }
}
