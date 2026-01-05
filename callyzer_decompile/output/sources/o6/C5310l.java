package o6;

import dr.C1772v;
import ex.InterfaceC2141e;
import og.od;
import tx.C7257q;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8090p;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.l */
/* loaded from: classes.dex */
public final class C5310l extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f26079a;

    /* renamed from: b */
    public int f26080b;

    /* renamed from: c */
    public final /* synthetic */ C5321w f26081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5310l(C5321w c5321w, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f26079a = i10;
        this.f26081c = c5321w;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f26079a) {
            case 0:
                return new C5310l(this.f26081c, interfaceC7559c, 0);
            case 1:
                return new C5310l(this.f26081c, interfaceC7559c, 1);
            default:
                return new C5310l(this.f26081c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26079a) {
        }
        return ((C5310l) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f26079a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f26080b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f26080b = 1;
                    if (C5321w.m10459d(this.f26081c, this) == enumC7794a) {
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
                int i11 = this.f26080b;
                qw.a0 a0Var = qw.a0.f30746a;
                C5321w c5321w = this.f26081c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8090p c8090p = c5321w.f26189i;
                    this.f26080b = 1;
                    Object objM13563m = ((C7257q) c8090p.f38724b).m13563m(this);
                    if (objM13563m != enumC7794a2) {
                        objM13563m = a0Var;
                    }
                    if (objM13563m == enumC7794a2) {
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
                InterfaceC8209j interfaceC8209jM15376g = wx.c1.m15376g(c5321w.m10462g().mo10443d(), -1);
                C1772v c1772v = new C1772v(7, c5321w);
                this.f26080b = 2;
                if (interfaceC8209jM15376g.collect(c1772v, this) == enumC7794a2) {
                    return enumC7794a2;
                }
                return a0Var;
            default:
                C5321w c5321w2 = this.f26081c;
                C5322x c5322x = c5321w2.f26188h;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f26080b;
                try {
                    if (i12 == 0) {
                        od.m10798c(obj);
                        if (c5322x.m10467b() instanceof i0) {
                            return c5322x.m10467b();
                        }
                        this.f26080b = 1;
                        if (c5321w2.m10463h(this) == enumC7794a3) {
                            return enumC7794a3;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            od.m10798c(obj);
                            return (b1) obj;
                        }
                        od.m10798c(obj);
                    }
                    this.f26080b = 2;
                    obj = C5321w.m10460e(c5321w2, false, this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                    return (b1) obj;
                } catch (Throwable th2) {
                    return new u0(th2, -1);
                }
        }
    }
}
