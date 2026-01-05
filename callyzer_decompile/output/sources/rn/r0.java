package rn;

import al.C0182j;
import bu.C0782a;
import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.v0;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31644a;

    /* renamed from: b */
    public int f31645b;

    /* renamed from: c */
    public final /* synthetic */ C0182j f31646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(C0182j c0182j, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f31644a = i10;
        this.f31646c = c0182j;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f31644a) {
            case 0:
                return new r0(this.f31646c, interfaceC7559c, 0);
            default:
                return new r0(this.f31646c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f31644a) {
        }
        return ((r0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31644a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f31645b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C0182j c0182j = this.f31646c;
                    v0 v0Var = ((y5) c0182j.f557d).f41060l;
                    C0782a c0782a = new C0782a(c0182j, null, 20);
                    this.f31645b = 1;
                    if (c1.m15379j(v0Var, c0782a, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f31645b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    h0 h0Var = (h0) this.f31646c.f556c;
                    this.f31645b = 1;
                    if (h0Var.m12609J(this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
