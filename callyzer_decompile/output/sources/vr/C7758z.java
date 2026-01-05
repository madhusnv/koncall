package vr;

import dp.C1737d;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f8.C2206a;
import ks.q0;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vr.z */
/* loaded from: classes3.dex */
public final class C7758z extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37391a;

    /* renamed from: b */
    public int f37392b;

    /* renamed from: c */
    public final /* synthetic */ q0 f37393c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f37394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7758z(q0 q0Var, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f37391a = i10;
        this.f37393c = q0Var;
        this.f37394d = interfaceC2139c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f37391a) {
            case 0:
                return new C7758z(this.f37393c, this.f37394d, interfaceC7559c, 0);
            default:
                return new C7758z(this.f37393c, this.f37394d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f37391a) {
        }
        return ((C7758z) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37391a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f37392b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d = this.f37393c.f21508s;
                    C2206a c2206a = new C2206a(this.f37394d, (InterfaceC7559c) null, 7);
                    this.f37392b = 1;
                    if (c1.m15379j(c8203d, c2206a, this) == enumC7794a) {
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
                int i11 = this.f37392b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d2 = this.f37393c.f21493D;
                    C1737d c1737d = new C1737d(8, this.f37394d);
                    this.f37392b = 1;
                    if (c8203d2.collect(c1737d, this) == enumC7794a2) {
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
