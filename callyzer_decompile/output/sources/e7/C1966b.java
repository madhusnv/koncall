package e7;

import ex.InterfaceC2141e;
import k2.k1;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e7.b */
/* loaded from: classes.dex */
public final class C1966b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f9208a;

    /* renamed from: b */
    public int f9209b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8209j f9210c;

    /* renamed from: d */
    public final /* synthetic */ k1 f9211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1966b(InterfaceC8209j interfaceC8209j, k1 k1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f9208a = i10;
        this.f9210c = interfaceC8209j;
        this.f9211d = k1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f9208a) {
            case 0:
                return new C1966b(this.f9210c, this.f9211d, interfaceC7559c, 0);
            default:
                return new C1966b(this.f9210c, this.f9211d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f9208a) {
        }
        return ((C1966b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f9208a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f9209b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C1965a c1965a = new C1965a(this.f9211d, 1);
                    this.f9209b = 1;
                    if (this.f9210c.collect(c1965a, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f9209b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C1965a c1965a2 = new C1965a(this.f9211d, 3);
                    this.f9209b = 1;
                    if (this.f9210c.collect(c1965a2, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
