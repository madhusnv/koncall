package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import og.od;
import om.C5415q;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w2 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1494a;

    /* renamed from: b */
    public int f1495b;

    /* renamed from: c */
    public final /* synthetic */ h3 f1496c;

    /* renamed from: d */
    public final /* synthetic */ C5415q f1497d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f1498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w2(h3 h3Var, C5415q c5415q, LocalDateTime localDateTime, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f1494a = i10;
        this.f1496c = h3Var;
        this.f1497d = c5415q;
        this.f1498e = localDateTime;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f1494a) {
            case 0:
                return new w2(this.f1496c, this.f1497d, this.f1498e, interfaceC7559c, 0);
            default:
                return new w2(this.f1496c, this.f1497d, this.f1498e, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f1494a) {
        }
        return ((w2) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1494a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f1495b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1495b = 1;
                h3 h3Var = this.f1496c;
                h3Var.getClass();
                Object objM469q = h3.m469q(h3Var, this.f1497d, this);
                return objM469q == enumC7794a ? enumC7794a : objM469q;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f1495b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1495b = 1;
                h3 h3Var2 = this.f1496c;
                h3Var2.getClass();
                Object objM471s = h3.m471s(h3Var2, this.f1497d, this);
                return objM471s == enumC7794a2 ? enumC7794a2 : objM471s;
        }
    }
}
