package pp;

import ex.InterfaceC2141e;
import lv.C4531c;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import ur.j0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import wx.v0;
import xm.x1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pp.d */
/* loaded from: classes3.dex */
public final class C5988d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29263a;

    /* renamed from: b */
    public int f29264b;

    /* renamed from: c */
    public final /* synthetic */ C5995k f29265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5988d(C5995k c5995k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29263a = i10;
        this.f29265c = c5995k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29263a) {
            case 0:
                return new C5988d(this.f29265c, interfaceC7559c, 0);
            case 1:
                return new C5988d(this.f29265c, interfaceC7559c, 1);
            case 2:
                return new C5988d(this.f29265c, interfaceC7559c, 2);
            default:
                return new C5988d(this.f29265c, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f29263a) {
        }
        return ((C5988d) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29263a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f29264b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f29265c.f36254d;
                    this.f29264b = 1;
                    if (c7806h.mo14775g(j0.f36232a, this) == enumC7794a) {
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
                int i11 = this.f29264b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C5995k c5995k = this.f29265c;
                    c5995k.f29302m.getClass();
                    v0 v0Var = x1.f40990o;
                    C5991g c5991g = new C5991g(c5995k, null, 0);
                    this.f29264b = 1;
                    if (c1.m15379j(v0Var, c5991g, this) == enumC7794a2) {
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
                int i12 = this.f29264b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c = this.f29265c.f29308s;
                    this.f29264b = 1;
                    if (c4531c.m9378b(this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f29264b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C4531c c4531c2 = this.f29265c.f29308s;
                    this.f29264b = 1;
                    if (c4531c2.m9378b(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
