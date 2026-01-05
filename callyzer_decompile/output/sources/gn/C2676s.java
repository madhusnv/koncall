package gn;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2142f;
import og.od;
import rw.C6668r;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gn.s */
/* loaded from: classes3.dex */
public final class C2676s extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f14802a;

    /* renamed from: b */
    public int f14803b;

    /* renamed from: c */
    public /* synthetic */ InterfaceC8210k f14804c;

    /* renamed from: d */
    public /* synthetic */ Throwable f14805d;

    /* renamed from: e */
    public final /* synthetic */ x2 f14806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2676s(x2 x2Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(3, interfaceC7559c);
        this.f14802a = i10;
        this.f14806e = x2Var;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC8210k interfaceC8210k = (InterfaceC8210k) obj;
        Throwable th2 = (Throwable) obj2;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj3;
        switch (this.f14802a) {
            case 0:
                C2676s c2676s = new C2676s(this.f14806e, interfaceC7559c, 0);
                c2676s.f14804c = interfaceC8210k;
                c2676s.f14805d = th2;
                return c2676s.invokeSuspend(qw.a0.f30746a);
            default:
                C2676s c2676s2 = new C2676s(this.f14806e, interfaceC7559c, 1);
                c2676s2.f14804c = interfaceC8210k;
                c2676s2.f14805d = th2;
                return c2676s2.invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f14802a) {
            case 0:
                InterfaceC8210k interfaceC8210k = this.f14804c;
                Throwable th2 = this.f14805d;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f14803b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    this.f14806e.f14957q.m16233h("Quick call", "Error fetching connected extension list", th2);
                    this.f14804c = null;
                    this.f14805d = null;
                    this.f14803b = 1;
                    if (interfaceC8210k.emit(C6668r.f31943a, this) == enumC7794a) {
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
                InterfaceC8210k interfaceC8210k2 = this.f14804c;
                Throwable th3 = this.f14805d;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f14803b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    AbstractC1452a.m4579z("MessageTemplate local DB: Failed to fetch message template tags - ", th3.getMessage(), this.f14806e.f14957q);
                    this.f14804c = null;
                    this.f14805d = null;
                    this.f14803b = 1;
                    if (interfaceC8210k2.emit(C6668r.f31943a, this) == enumC7794a2) {
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
