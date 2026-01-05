package xv;

import a9.C0073l;
import dr.C1772v;
import ex.InterfaceC2141e;
import no.C5122i;
import og.od;
import qw.C6364n;
import qw.a0;
import rn.h0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.c1;
import wx.v0;
import xm.y5;
import xp.C8426g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.c */
/* loaded from: classes3.dex */
public final class C8476c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41295a;

    /* renamed from: b */
    public int f41296b;

    /* renamed from: c */
    public final /* synthetic */ C8489p f41297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8476c(C8489p c8489p, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41295a = i10;
        this.f41297c = c8489p;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41295a) {
            case 0:
                return new C8476c(this.f41297c, interfaceC7559c, 0);
            case 1:
                return new C8476c(this.f41297c, interfaceC7559c, 1);
            case 2:
                return new C8476c(this.f41297c, interfaceC7559c, 2);
            case 3:
                return new C8476c(this.f41297c, interfaceC7559c, 3);
            case 4:
                return new C8476c(this.f41297c, interfaceC7559c, 4);
            case 5:
                return new C8476c(this.f41297c, interfaceC7559c, 5);
            default:
                return new C8476c(this.f41297c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41295a) {
        }
        return ((C8476c) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41295a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f41296b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f41296b = 1;
                    if (C8489p.m15779h(this.f41297c, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f41296b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8489p c8489p = this.f41297c;
                    C8203d c8203d = ((y5) c8489p.f41361i.f5574b).f41062n;
                    C1772v c1772v = new C1772v(15, c8489p);
                    this.f41296b = 1;
                    if (c8203d.collect(c1772v, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f41296b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    h0 h0Var = this.f41297c.f41367o;
                    this.f41296b = 1;
                    if (h0Var.m12621o(this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f41296b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C8489p c8489p2 = this.f41297c;
                    v0 v0Var = c8489p2.f41345A.f22368b;
                    C8426g c8426g = new C8426g(c8489p2, (InterfaceC7559c) null, 5);
                    this.f41296b = 1;
                    if (c1.m15379j(v0Var, c8426g, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f41296b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    C0073l c0073l = this.f41297c.f41374v;
                    this.f41296b = 1;
                    if (c0073l.m226s(this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    ((C6364n) obj).getClass();
                }
                return a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f41296b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    C0073l c0073l2 = this.f41297c.f41365m;
                    this.f41296b = 1;
                    if (c0073l2.m205O(this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f41296b;
                C8489p c8489p3 = this.f41297c;
                if (i16 == 0) {
                    od.m10798c(obj);
                    this.f41296b = 1;
                    if (C8489p.m15777f(c8489p3, this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0.f30746a;
                    }
                    od.m10798c(obj);
                }
                c0.m13502y(c8489p3.f41369q, null, null, new C8482i(c8489p3, null, 0), 3);
                C5122i c5122i = c8489p3.f41372t;
                this.f41296b = 2;
                if (c5122i.m10047c(this) == enumC7794a7) {
                    return enumC7794a7;
                }
                return a0.f30746a;
        }
    }
}
