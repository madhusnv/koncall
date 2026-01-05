package fk;

import dr.C1772v;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import o6.InterfaceC5304f;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8219t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10355a;

    /* renamed from: b */
    public int f10356b;

    /* renamed from: c */
    public final /* synthetic */ h1 f10357c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(h1 h1Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f10355a = i10;
        this.f10357c = h1Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10355a) {
            case 0:
                return new c1(this.f10357c, interfaceC7559c, 0);
            default:
                return new c1(this.f10357c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f10355a) {
        }
        return ((c1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10355a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f10356b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    h1 h1Var = this.f10357c;
                    C8219t c8219t = new C8219t(h1Var.f10413e.getData(), new b1(h1Var, null, 0));
                    C1772v c1772v = new C1772v(3, h1Var);
                    this.f10356b = 1;
                    if (c8219t.collect(c1772v, this) == enumC7794a) {
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
                int i11 = this.f10356b;
                InterfaceC7559c interfaceC7559c = null;
                h1 h1Var2 = this.f10357c;
                try {
                    if (i11 == 0) {
                        od.m10798c(obj);
                        InterfaceC5304f interfaceC5304f = h1Var2.f10413e;
                        f1 f1Var = new f1(h1Var2, interfaceC7559c, 0);
                        this.f10356b = 1;
                        if (interfaceC5304f.mo10447a(f1Var, this) == enumC7794a2) {
                            return enumC7794a2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                    }
                } catch (Exception e2) {
                    e2.getMessage();
                    k0 k0Var = h1Var2.f10416h;
                    if (k0Var == null) {
                        AbstractC4154l.m8928k("localSessionData");
                        throw null;
                    }
                    h1Var2.f10416h = k0.m5975a(k0Var, null, h1Var2.f10412d.m5981a(), null, 5);
                }
                return qw.a0.f30746a;
        }
    }
}
