package xm;

import ex.InterfaceC2141e;
import fn.C2336i;
import km.C4120o;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m4 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40582a;

    /* renamed from: b */
    public int f40583b;

    /* renamed from: c */
    public final /* synthetic */ o4 f40584c;

    /* renamed from: d */
    public final /* synthetic */ String f40585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4(o4 o4Var, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40582a = i10;
        this.f40584c = o4Var;
        this.f40585d = str;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40582a) {
            case 0:
                return new m4(this.f40584c, this.f40585d, interfaceC7559c, 0);
            case 1:
                return new m4(this.f40584c, this.f40585d, interfaceC7559c, 1);
            case 2:
                return new m4(this.f40584c, this.f40585d, interfaceC7559c, 2);
            default:
                return new m4(this.f40584c, this.f40585d, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40582a) {
        }
        return ((m4) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f40582a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f40583b;
                qw.a0 a0Var = qw.a0.f30746a;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C2336i c2336i = this.f40584c.f40671a;
                    this.f40583b = 1;
                    Object objM8891m = ((C4120o) c2336i.f10585a).m8891m("qc_extension_link", this.f40585d, this);
                    if (objM8891m != enumC7794a) {
                        objM8891m = a0Var;
                    }
                    if (objM8891m == enumC7794a) {
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
                int i11 = this.f40583b;
                qw.a0 a0Var2 = qw.a0.f30746a;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C2336i c2336i2 = this.f40584c.f40671a;
                    this.f40583b = 1;
                    Object objM8891m2 = ((C4120o) c2336i2.f10585a).m8891m("contact_form_support_email", this.f40585d, this);
                    if (objM8891m2 != enumC7794a2) {
                        objM8891m2 = a0Var2;
                    }
                    if (objM8891m2 == enumC7794a2) {
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
                int i12 = this.f40583b;
                qw.a0 a0Var3 = qw.a0.f30746a;
                if (i12 == 0) {
                    od.m10798c(obj);
                    C2336i c2336i3 = this.f40584c.f40671a;
                    this.f40583b = 1;
                    Object objM8891m3 = ((C4120o) c2336i3.f10585a).m8891m("contact_form_sender_email", this.f40585d, this);
                    if (objM8891m3 != enumC7794a3) {
                        objM8891m3 = a0Var3;
                    }
                    if (objM8891m3 == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var3;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f40583b;
                qw.a0 a0Var4 = qw.a0.f30746a;
                if (i13 == 0) {
                    od.m10798c(obj);
                    C2336i c2336i4 = this.f40584c.f40671a;
                    this.f40583b = 1;
                    Object objM8891m4 = ((C4120o) c2336i4.f10585a).m8891m("contact_form_email_password", this.f40585d, this);
                    if (objM8891m4 != enumC7794a4) {
                        objM8891m4 = a0Var4;
                    }
                    if (objM8891m4 == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var4;
        }
    }
}
