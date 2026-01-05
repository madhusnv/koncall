package xv;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.c1;
import xp.C8426g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.r */
/* loaded from: classes3.dex */
public final class C8491r extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41380a;

    /* renamed from: b */
    public int f41381b;

    /* renamed from: c */
    public final /* synthetic */ C8492s f41382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8491r(C8492s c8492s, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41380a = i10;
        this.f41382c = c8492s;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41380a) {
            case 0:
                return new C8491r(this.f41382c, interfaceC7559c, 0);
            case 1:
                return new C8491r(this.f41382c, interfaceC7559c, 1);
            default:
                return new C8491r(this.f41382c, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41380a) {
        }
        return ((C8491r) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41380a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f41381b;
                a0 a0Var = a0.f30746a;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f41381b = 1;
                    C8492s c8492s = this.f41382c;
                    Object objM15379j = c1.m15379j(c8492s.f41384c.f22371e, new C8426g(c8492s, (InterfaceC7559c) null, 6), this);
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
                int i11 = this.f41381b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h = this.f41382c.f41387f;
                    this.f41381b = 1;
                    if (c7806h.mo14775g(C8490q.f41379a, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f41381b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C7806h c7806h2 = this.f41382c.f41387f;
                    this.f41381b = 1;
                    if (c7806h2.mo14775g(C8490q.f41379a, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
