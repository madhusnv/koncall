package bt;

import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import og.pe;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.u */
/* loaded from: classes3.dex */
public final class C0776u extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4925a;

    /* renamed from: b */
    public /* synthetic */ Object f4926b;

    /* renamed from: c */
    public final /* synthetic */ List f4927c;

    /* renamed from: d */
    public final /* synthetic */ k2.w0 f4928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0776u(List list, k2.w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4925a = i10;
        this.f4927c = list;
        this.f4928d = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4925a) {
            case 0:
                C0776u c0776u = new C0776u(this.f4927c, this.f4928d, interfaceC7559c, 0);
                c0776u.f4926b = obj;
                return c0776u;
            default:
                C0776u c0776u2 = new C0776u(this.f4927c, this.f4928d, interfaceC7559c, 1);
                c0776u2.f4926b = obj;
                return c0776u2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f4925a) {
            case 0:
                C0776u c0776u = (C0776u) create(num, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c0776u.invokeSuspend(a0Var);
                return a0Var;
            default:
                C0776u c0776u2 = (C0776u) create(num, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c0776u2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f4925a;
        qw.a0 a0Var = qw.a0.f30746a;
        boolean z6 = false;
        List list = this.f4927c;
        k2.w0 w0Var = this.f4928d;
        switch (i10) {
            case 0:
                Integer num = (Integer) this.f4926b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int iM10832g = pe.m10832g(list) - 2;
                if (num != null && num.intValue() >= iM10832g) {
                    z6 = true;
                }
                if (((Boolean) w0Var.getValue()).booleanValue() != z6) {
                    w0Var.setValue(Boolean.valueOf(z6));
                    break;
                }
                break;
            default:
                Integer num2 = (Integer) this.f4926b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int iM10832g2 = pe.m10832g(list) - 2;
                if (num2 != null && num2.intValue() >= iM10832g2) {
                    z6 = true;
                }
                if (((Boolean) w0Var.getValue()).booleanValue() != z6) {
                    w0Var.setValue(Boolean.valueOf(z6));
                    break;
                }
                break;
        }
        return a0Var;
    }
}
