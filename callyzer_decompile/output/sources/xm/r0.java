package xm;

import ad.C0101h;
import ex.InterfaceC2141e;
import fn.C2336i;
import im.C3302d;
import km.C4120o;
import og.od;
import og.pe;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40764a;

    /* renamed from: b */
    public int f40765b;

    /* renamed from: c */
    public final /* synthetic */ x1 f40766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x1 x1Var, int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f40764a = 8;
        this.f40766c = x1Var;
        this.f40765b = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40764a) {
            case 0:
                return new r0(this.f40766c, interfaceC7559c, 0);
            case 1:
                return new r0(this.f40766c, interfaceC7559c, 1);
            case 2:
                return new r0(this.f40766c, interfaceC7559c, 2);
            case 3:
                return new r0(this.f40766c, interfaceC7559c, 3);
            case 4:
                return new r0(this.f40766c, interfaceC7559c, 4);
            case 5:
                return new r0(this.f40766c, interfaceC7559c, 5);
            case 6:
                return new r0(this.f40766c, interfaceC7559c, 6);
            case 7:
                return new r0(this.f40766c, interfaceC7559c, 7);
            default:
                return new r0(this.f40766c, this.f40765b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40764a) {
            case 0:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            case 3:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            case 4:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            case 5:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            case 6:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            case 7:
                return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
            default:
                r0 r0Var = (r0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                r0Var.invokeSuspend(a0Var);
                return a0Var;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f40764a;
        qw.a0 a0Var = qw.a0.f30746a;
        x1 x1Var = this.f40766c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40765b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C2336i c2336i = x1Var.f40992b;
                this.f40765b = 1;
                Object objM8884f = ((C4120o) c2336i.f10585a).m8884f("corrupt_call_log_max_date", this);
                return objM8884f == enumC7794a ? enumC7794a : objM8884f;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40765b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var = x1Var.f40991a;
                this.f40765b = 1;
                Object objM10839n = pe.m10839n(this, x2Var.f14948h.f862a, true, false, new C0101h(19));
                return objM10839n == enumC7794a2 ? enumC7794a2 : objM10839n;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40765b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C2336i c2336i2 = x1Var.f40992b;
                this.f40765b = 1;
                Object objM8884f2 = ((C4120o) c2336i2.f10585a).m8884f("unsync_calllog_max_calllog_id", this);
                return objM8884f2 == enumC7794a3 ? enumC7794a3 : objM8884f2;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f40765b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var2 = x1Var.f40991a;
                this.f40765b = 1;
                Object objM10839n2 = pe.m10839n(this, x2Var2.f14941a.f899a, true, false, new C0101h(3));
                return objM10839n2 == enumC7794a4 ? enumC7794a4 : objM10839n2;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f40765b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var3 = x1Var.f40991a;
                this.f40765b = 1;
                Object objM10839n3 = pe.m10839n(this, x2Var3.f14948h.f862a, true, false, new C0101h(17));
                return objM10839n3 == enumC7794a5 ? enumC7794a5 : objM10839n3;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f40765b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var4 = x1Var.f40991a;
                this.f40765b = 1;
                Object objM10839n4 = pe.m10839n(this, x2Var4.f14941a.f899a, true, false, new C0101h(7));
                return objM10839n4 == enumC7794a6 ? enumC7794a6 : objM10839n4;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f40765b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                gn.x2 x2Var5 = x1Var.f40991a;
                this.f40765b = 1;
                Object objM10839n5 = pe.m10839n(this, x2Var5.f14941a.f899a, true, false, new C0101h(4));
                return objM10839n5 == enumC7794a7 ? enumC7794a7 : objM10839n5;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i18 = this.f40765b;
                if (i18 == 0) {
                    od.m10798c(obj);
                    C2336i c2336i3 = x1Var.f40992b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f40765b = 1;
                    Object objM8889k = ((C4120o) c2336i3.f10585a).m8889k("sync_request_success_time", jCurrentTimeMillis, this);
                    if (objM8889k != enumC7794a8) {
                        objM8889k = a0Var;
                    }
                    if (objM8889k == enumC7794a8) {
                        return enumC7794a8;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                x1Var.f40997g.m12019a(762);
                return a0Var;
            default:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                x1Var.m15651B(new C3302d(pe.m10833h(new Integer(this.f40765b))));
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(x1 x1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40764a = i10;
        this.f40766c = x1Var;
    }
}
