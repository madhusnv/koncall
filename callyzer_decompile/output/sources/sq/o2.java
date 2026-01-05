package sq;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import g2.h4;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o2 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33110a;

    /* renamed from: b */
    public final /* synthetic */ k2.w0 f33111b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f33112c;

    /* renamed from: d */
    public final /* synthetic */ k2.w0 f33113d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(k2.w0 w0Var, k2.w0 w0Var2, k2.w0 w0Var3, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f33110a = i10;
        this.f33111b = w0Var;
        this.f33112c = w0Var2;
        this.f33113d = w0Var3;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f33110a) {
            case 0:
                return new o2(this.f33111b, this.f33112c, this.f33113d, interfaceC7559c, 0);
            default:
                return new o2(this.f33111b, this.f33112c, this.f33113d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f33110a) {
            case 0:
                o2 o2Var = (o2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                o2Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                o2 o2Var2 = (o2) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                o2Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f33110a;
        qw.a0 a0Var = qw.a0.f30746a;
        k2.w0 w0Var = this.f33113d;
        k2.w0 w0Var2 = this.f33112c;
        k2.w0 w0Var3 = this.f33111b;
        Integer num = null;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Long lM6170e = ((h4) w0Var2.getValue()).m6170e();
                if (lM6170e != null) {
                    long jLongValue = lM6170e.longValue();
                    Long lM6170e2 = ((h4) w0Var.getValue()).m6170e();
                    if (lM6170e2 != null && jLongValue > lM6170e2.longValue()) {
                        num = new Integer(R.string.from_date_should_be_less_than_to_date);
                    }
                }
                w0Var3.setValue(num);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Long lM6170e3 = ((h4) w0Var2.getValue()).m6170e();
                if (lM6170e3 != null) {
                    long jLongValue2 = lM6170e3.longValue();
                    Long lM6170e4 = ((h4) w0Var.getValue()).m6170e();
                    if (lM6170e4 != null && jLongValue2 > lM6170e4.longValue()) {
                        num = new Integer(R.string.from_date_should_be_less_than_to_date);
                    }
                }
                w0Var3.setValue(num);
                break;
        }
        return a0Var;
    }
}
