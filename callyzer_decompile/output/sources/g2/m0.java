package g2;

import ex.InterfaceC2141e;
import m1.InterfaceC4629k;
import tx.InterfaceC7266z;
import u2.C7320q;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12039a;

    /* renamed from: b */
    public int f12040b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC4629k f12041c;

    /* renamed from: d */
    public final /* synthetic */ C7320q f12042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(InterfaceC4629k interfaceC4629k, C7320q c7320q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f12039a = i10;
        this.f12041c = interfaceC4629k;
        this.f12042d = c7320q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f12039a) {
            case 0:
                return new m0(this.f12041c, this.f12042d, interfaceC7559c, 0);
            case 1:
                return new m0(this.f12041c, this.f12042d, interfaceC7559c, 1);
            default:
                return new m0(this.f12041c, this.f12042d, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f12039a) {
        }
        return ((m0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f12039a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f12040b;
                if (i10 == 0) {
                    og.od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c = this.f12041c.mo6892c();
                    l0 l0Var = new l0(this.f12042d, 0);
                    this.f12040b = 1;
                    if (interfaceC8209jMo6892c.collect(l0Var, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f12040b;
                if (i11 == 0) {
                    og.od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c2 = this.f12041c.mo6892c();
                    l0 l0Var2 = new l0(this.f12042d, 1);
                    this.f12040b = 1;
                    if (interfaceC8209jMo6892c2.collect(l0Var2, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f12040b;
                if (i12 == 0) {
                    og.od.m10798c(obj);
                    InterfaceC8209j interfaceC8209jMo6892c3 = this.f12041c.mo6892c();
                    l0 l0Var3 = new l0(this.f12042d, 2);
                    this.f12040b = 1;
                    if (interfaceC8209jMo6892c3.collect(l0Var3, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    og.od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
