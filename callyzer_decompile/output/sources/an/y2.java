package an;

import ex.InterfaceC2139c;
import nm.C5107b;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y2 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1572a;

    /* renamed from: b */
    public int f1573b;

    /* renamed from: c */
    public final /* synthetic */ h3 f1574c;

    /* renamed from: d */
    public final /* synthetic */ C5107b f1575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(h3 h3Var, C5107b c5107b, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f1572a = i10;
        this.f1574c = h3Var;
        this.f1575d = c5107b;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f1572a) {
            case 0:
                return new y2(this.f1574c, this.f1575d, interfaceC7559c, 0);
            case 1:
                return new y2(this.f1574c, this.f1575d, interfaceC7559c, 1);
            default:
                return new y2(this.f1574c, this.f1575d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f1572a) {
        }
        return ((y2) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1572a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f1573b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f1573b = 1;
                    h3 h3Var = this.f1574c;
                    h3Var.getClass();
                    if (h3.m474v(h3Var, this.f1575d, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f1573b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1573b = 1;
                h3 h3Var2 = this.f1574c;
                h3Var2.getClass();
                Object objM452B = h3.m452B(h3Var2, this.f1575d, this);
                return objM452B == enumC7794a2 ? enumC7794a2 : objM452B;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f1573b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1573b = 1;
                Object objM457G = h3.m457G(this.f1574c, this.f1575d, this);
                return objM457G == enumC7794a3 ? enumC7794a3 : objM457G;
        }
    }
}
