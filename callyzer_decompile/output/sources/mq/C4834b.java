package mq;

import dr.C1772v;
import ex.InterfaceC2141e;
import f9.C2222e;
import j$.time.LocalDateTime;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC4154l;
import lq.C4507b;
import lv.C4531c;
import og.od;
import qw.C6361k;
import qw.C6364n;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8219t;
import wx.c1;
import xm.x1;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mq.b */
/* loaded from: classes3.dex */
public final class C4834b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24159a;

    /* renamed from: b */
    public int f24160b;

    /* renamed from: c */
    public final /* synthetic */ h0 f24161c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4834b(h0 h0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24159a = i10;
        this.f24161c = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24159a) {
            case 0:
                return new C4834b(this.f24161c, interfaceC7559c, 0);
            case 1:
                return new C4834b(this.f24161c, interfaceC7559c, 1);
            case 2:
                return new C4834b(this.f24161c, interfaceC7559c, 2);
            case 3:
                return new C4834b(this.f24161c, interfaceC7559c, 3);
            case 4:
                return new C4834b(this.f24161c, interfaceC7559c, 4);
            case 5:
                return new C4834b(this.f24161c, interfaceC7559c, 5);
            case 6:
                return new C4834b(this.f24161c, interfaceC7559c, 6);
            case 7:
                return new C4834b(this.f24161c, interfaceC7559c, 7);
            case 8:
                return new C4834b(this.f24161c, interfaceC7559c, 8);
            default:
                return new C4834b(this.f24161c, interfaceC7559c, 9);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24159a) {
            case 0:
                return ((C4834b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((C4834b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((C4834b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 3:
                return ((C4834b) create((String) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 4:
                return ((C4834b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 5:
                return ((C4834b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 6:
                return ((C4834b) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 7:
                return ((C4834b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 8:
                return ((C4834b) create((C6361k) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((C4834b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM9793e;
        switch (this.f24159a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f24160b;
                qw.a0 a0Var = qw.a0.f30746a;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f24160b = 1;
                    h0 h0Var = this.f24161c;
                    Object objM15379j = c1.m15379j(c1.m15381l(h0Var.f24254B, 500L), new C4834b(h0Var, null, 3), this);
                    if (objM15379j != enumC7794a) {
                        objM15379j = a0Var;
                    }
                    if (objM15379j == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f24160b;
                qw.a0 a0Var2 = qw.a0.f30746a;
                if (i11 == 0) {
                    od.m10798c(obj);
                    this.f24160b = 1;
                    h0 h0Var2 = this.f24161c;
                    Object objM15379j2 = c1.m15379j(((y5) h0Var2.f24269j.f36778a).f41060l, new C4834b(h0Var2, null, 6), this);
                    if (objM15379j2 != enumC7794a2) {
                        objM15379j2 = a0Var2;
                    }
                    if (objM15379j2 == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var2;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f24160b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                rn.h0 h0Var3 = this.f24161c.f24266g;
                this.f24160b = 1;
                Object objM15619b = h0Var3.f31523e.m15619b(this);
                return objM15619b == enumC7794a3 ? enumC7794a3 : objM15619b;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f24160b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    this.f24160b = 1;
                    if (h0.m9795g(this.f24161c, this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f24160b;
                h0 h0Var4 = this.f24161c;
                if (i14 == 0) {
                    od.m10798c(obj);
                    h0Var4.f24262c.getClass();
                    InterfaceC7559c interfaceC7559c = null;
                    C8219t c8219t = new C8219t(new C4857y(h0Var4, interfaceC7559c, 0), x1.f40990o);
                    C4858z c4858z = new C4858z(h0Var4, interfaceC7559c, 0);
                    this.f24160b = 1;
                    if (c1.m15379j(c8219t, c4858z, this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                h0Var4.f24260H = true;
                return qw.a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f24160b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    h0 h0Var5 = this.f24161c;
                    C2222e c2222eM10041d = h0Var5.f24264e.m10041d();
                    a0 a0Var3 = new a0(h0Var5, null, 0);
                    this.f24160b = 1;
                    if (c1.m15379j(c2222eM10041d, a0Var3, this) == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 6:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f24160b;
                if (i16 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f24161c.f24259G;
                    this.f24160b = 1;
                    if (c4531c.m9380d(this) == enumC7794a7) {
                        return enumC7794a7;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 7:
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f24160b;
                if (i17 == 0) {
                    od.m10798c(obj);
                    h0 h0Var6 = this.f24161c;
                    rn.h0 h0Var7 = h0Var6.f24266g;
                    int i18 = ((C4507b) h0Var6.f24285z.getValue()).f22425g.f21222b;
                    this.f24160b = 1;
                    if (h0Var7.m12623r(i18, this) == enumC7794a8) {
                        return enumC7794a8;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 8:
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                int i19 = this.f24160b;
                if (i19 == 0) {
                    od.m10798c(obj);
                    LocalDateTime localDateTimeNow = LocalDateTime.now();
                    AbstractC4154l.m8922e(localDateTimeNow, "now(...)");
                    h0 h0Var8 = this.f24161c;
                    int i20 = h0Var8.f24258F * h0Var8.f24256D;
                    this.f24160b = 1;
                    objM9793e = h0.m9793e(h0Var8, localDateTimeNow, Integer.MAX_VALUE, i20, this);
                    if (objM9793e == enumC7794a9) {
                        return enumC7794a9;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9793e = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM9793e);
            default:
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                int i21 = this.f24160b;
                if (i21 == 0) {
                    od.m10798c(obj);
                    h0 h0Var9 = this.f24161c;
                    wx.v0 v0Var = h0Var9.f24270k.f22368b;
                    C1772v c1772v = new C1772v(5, h0Var9);
                    this.f24160b = 1;
                    if (v0Var.f39335a.collect(c1772v, this) == enumC7794a10) {
                        return enumC7794a10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
