package mq;

import an.r1;
import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import og.pe;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.x */
/* loaded from: classes3.dex */
public final class C4856x extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24346a;

    /* renamed from: b */
    public int f24347b;

    /* renamed from: c */
    public final /* synthetic */ h0 f24348c;

    /* renamed from: d */
    public final /* synthetic */ int f24349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4856x(h0 h0Var, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f24346a = i11;
        this.f24348c = h0Var;
        this.f24349d = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24346a) {
            case 0:
                return new C4856x(this.f24348c, this.f24349d, interfaceC7559c, 0);
            default:
                return new C4856x(this.f24348c, this.f24349d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f24346a) {
        }
        return ((C4856x) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f24346a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f24347b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                rn.h0 h0Var = this.f24348c.f24266g;
                this.f24347b = 1;
                Object objM10839n = pe.m10839n(this, h0Var.f31523e.f40818c.f14941a.f899a, true, false, new r1(this.f24349d, 1));
                return objM10839n == enumC7794a ? enumC7794a : objM10839n;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f24347b;
                qw.a0 a0Var = qw.a0.f30746a;
                int i12 = this.f24349d;
                h0 h0Var2 = this.f24348c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    rn.h0 h0Var3 = h0Var2.f24266g;
                    this.f24347b = 1;
                    Object objM15634s = h0Var3.f31523e.m15634s(i12, "", this);
                    if (objM15634s != enumC7794a2) {
                        objM15634s = a0Var;
                    }
                    if (objM15634s == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    od.m10798c(obj);
                }
                List listM10833h = pe.m10833h(new Integer(i12));
                this.f24347b = 2;
                if (h0.m9797i(h0Var2, listM10833h, this) == enumC7794a2) {
                    return enumC7794a2;
                }
                return a0Var;
        }
    }
}
