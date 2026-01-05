package cv;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import m1.InterfaceC4630l;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.v */
/* loaded from: classes3.dex */
public final class C1526v extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7688a;

    /* renamed from: b */
    public int f7689b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC4630l f7690c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f7691d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1526v(InterfaceC4630l interfaceC4630l, InterfaceC2137a interfaceC2137a, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f7688a = i10;
        this.f7690c = interfaceC4630l;
        this.f7691d = interfaceC2137a;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f7688a) {
            case 0:
                return new C1526v(this.f7690c, this.f7691d, interfaceC7559c, 0);
            default:
                return new C1526v(this.f7690c, this.f7691d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f7688a) {
        }
        return ((C1526v) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f7688a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f7689b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c = this.f7690c.mo6892c();
                    C1525u c1525u = new C1525u(0, this.f7691d);
                    this.f7689b = 1;
                    if (interfaceC8209jMo6892c.collect(c1525u, this) == enumC7794a) {
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
                int i11 = this.f7689b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c2 = this.f7690c.mo6892c();
                    C1525u c1525u2 = new C1525u(1, this.f7691d);
                    this.f7689b = 1;
                    if (interfaceC8209jMo6892c2.collect(c1525u2, this) == enumC7794a2) {
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
