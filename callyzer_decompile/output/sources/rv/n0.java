package rv;

import ex.InterfaceC2141e;
import im.o1;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31853a;

    /* renamed from: b */
    public int f31854b;

    /* renamed from: c */
    public /* synthetic */ Object f31855c;

    /* renamed from: d */
    public final /* synthetic */ p0 f31856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(p0 p0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f31853a = i10;
        this.f31856d = p0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f31853a) {
            case 0:
                n0 n0Var = new n0(this.f31856d, interfaceC7559c, 0);
                n0Var.f31855c = obj;
                return n0Var;
            default:
                n0 n0Var2 = new n0(this.f31856d, interfaceC7559c, 1);
                n0Var2.f31855c = obj;
                return n0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f31853a) {
        }
        return ((n0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31853a) {
            case 0:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f31855c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f31854b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                p0 p0Var = this.f31856d;
                w0 w0Var = p0Var.f31881m.f36092e;
                o6.s0 s0Var = new o6.s0(6, (Object) p0Var, (Object) interfaceC7266z, (InterfaceC7559c) null, false);
                this.f31855c = null;
                this.f31854b = 1;
                Object objM15384o = c1.m15384o(w0Var, s0Var, this);
                return objM15384o == enumC7794a ? enumC7794a : objM15384o;
            default:
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f31855c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f31854b;
                InterfaceC7559c interfaceC7559c = null;
                p0 p0Var2 = this.f31856d;
                if (i11 == 0) {
                    od.m10798c(obj);
                    long jLongValue = ((Number) p0Var2.f31869G.getValue()).longValue();
                    n0 n0Var = new n0(p0Var2, interfaceC7559c, 0);
                    this.f31855c = interfaceC7266z2;
                    this.f31854b = 1;
                    obj = tx.c0.m13476L(jLongValue, n0Var, this);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                if (((o1) obj) == null) {
                    tx.c0.m13502y(interfaceC7266z2, null, null, new a0(p0Var2, interfaceC7559c, 6), 3);
                }
                return qw.a0.f30746a;
        }
    }
}
