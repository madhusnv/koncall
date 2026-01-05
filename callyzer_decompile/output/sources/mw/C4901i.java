package mw;

import aq.C0403f;
import ex.InterfaceC2141e;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import m1.C4626h;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mw.i */
/* loaded from: classes3.dex */
public final class C4901i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24432a;

    /* renamed from: b */
    public final /* synthetic */ C4903k f24433b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f24434c;

    /* renamed from: d */
    public final /* synthetic */ w0 f24435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4901i(C4903k c4903k, InterfaceC2141e interfaceC2141e, w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24432a = i10;
        this.f24433b = c4903k;
        this.f24434c = interfaceC2141e;
        this.f24435d = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24432a) {
            case 0:
                return new C4901i(this.f24433b, this.f24434c, this.f24435d, interfaceC7559c, 0);
            default:
                return new C4901i(this.f24433b, this.f24434c, this.f24435d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f24432a) {
            case 0:
                C4901i c4901i = (C4901i) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c4901i.invokeSuspend(a0Var);
                return a0Var;
            default:
                C4901i c4901i2 = (C4901i) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c4901i2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f24432a;
        a0 a0Var = a0.f30746a;
        w0 w0Var = this.f24435d;
        InterfaceC2141e composable = this.f24434c;
        C4903k c4903k = this.f24433b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (((C4626h) w0Var.getValue()) == null) {
                    C4626h c4626h = new C4626h();
                    C4327p c4327p = c4903k.f24439a;
                    AbstractC4154l.m8923f(composable, "composable");
                    ((C0403f) c4327p.f21788b).invoke(composable, Boolean.TRUE);
                    w0Var.setValue(c4626h);
                    break;
                }
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (((C4626h) w0Var.getValue()) != null) {
                    C4327p c4327p2 = c4903k.f24439a;
                    AbstractC4154l.m8923f(composable, "composable");
                    ((C0403f) c4327p2.f21788b).invoke(composable, Boolean.FALSE);
                    w0Var.setValue(null);
                    break;
                }
                break;
        }
        return a0Var;
    }
}
