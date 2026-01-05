package xm;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import og.od;
import og.pe;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40657a;

    /* renamed from: b */
    public int f40658b;

    /* renamed from: c */
    public final /* synthetic */ x1 f40659c;

    /* renamed from: d */
    public final /* synthetic */ int f40660d;

    /* renamed from: e */
    public final /* synthetic */ String f40661e;

    /* renamed from: f */
    public final /* synthetic */ LocalDateTime f40662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(int i10, int i11, String str, LocalDateTime localDateTime, InterfaceC7559c interfaceC7559c, x1 x1Var) {
        super(2, interfaceC7559c);
        this.f40657a = i11;
        this.f40659c = x1Var;
        this.f40660d = i10;
        this.f40661e = str;
        this.f40662f = localDateTime;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40657a) {
            case 0:
                LocalDateTime localDateTime = this.f40662f;
                return new o1(this.f40660d, 0, this.f40661e, localDateTime, interfaceC7559c, this.f40659c);
            case 1:
                LocalDateTime localDateTime2 = this.f40662f;
                return new o1(this.f40660d, 1, this.f40661e, localDateTime2, interfaceC7559c, this.f40659c);
            default:
                LocalDateTime localDateTime3 = this.f40662f;
                return new o1(this.f40660d, 2, this.f40661e, localDateTime3, interfaceC7559c, this.f40659c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40657a) {
        }
        return ((o1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f40657a;
        String str = this.f40661e;
        x1 x1Var = this.f40659c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40658b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var = x1Var.f40991a;
                this.f40658b = 1;
                an.h3 h3Var = x2Var.f14941a;
                C8800o c8800o = C8800o.f42459a;
                Object objM10838m = pe.m10838m(h3Var.f899a, new an.x2(h3Var, this.f40660d, C8800o.m16203l(), str.length() == 0 ? null : str, this.f40662f, null, 0), this);
                return objM10838m == enumC7794a ? enumC7794a : objM10838m;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40658b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var2 = x1Var.f40991a;
                this.f40658b = 1;
                an.h3 h3Var2 = x2Var2.f14941a;
                C8800o c8800o2 = C8800o.f42459a;
                Object objM10838m2 = pe.m10838m(h3Var2.f899a, new an.x2(h3Var2, this.f40660d, C8800o.m16203l(), str.length() == 0 ? null : str, this.f40662f, null, 1), this);
                return objM10838m2 == enumC7794a2 ? enumC7794a2 : objM10838m2;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40658b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var3 = x1Var.f40991a;
                this.f40658b = 1;
                Object objN0 = x2Var3.N0(this.f40660d, str, this.f40662f, this);
                return objN0 == enumC7794a3 ? enumC7794a3 : objN0;
        }
    }
}
