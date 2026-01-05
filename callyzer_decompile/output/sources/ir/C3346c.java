package ir;

import ex.InterfaceC2141e;
import im.EnumC3318t;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.a0;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ir.c */
/* loaded from: classes3.dex */
public final class C3346c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17709a;

    /* renamed from: b */
    public /* synthetic */ Object f17710b;

    /* renamed from: c */
    public final /* synthetic */ a0 f17711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3346c(a0 a0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f17709a = i10;
        this.f17711c = a0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17709a) {
            case 0:
                C3346c c3346c = new C3346c(this.f17711c, interfaceC7559c, 0);
                c3346c.f17710b = obj;
                return c3346c;
            default:
                C3346c c3346c2 = new C3346c(this.f17711c, interfaceC7559c, 1);
                c3346c2.f17710b = obj;
                return c3346c2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        EnumC3318t enumC3318t = (EnumC3318t) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f17709a) {
            case 0:
                C3346c c3346c = (C3346c) create(enumC3318t, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c3346c.invokeSuspend(a0Var);
                return a0Var;
            default:
                C3346c c3346c2 = (C3346c) create(enumC3318t, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c3346c2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        AbstractC4422v abstractC4422v;
        int i10 = this.f17709a;
        qw.a0 a0Var = qw.a0.f30746a;
        a0 a0Var2 = this.f17711c;
        switch (i10) {
            case 0:
                EnumC3318t enumC3318t = (EnumC3318t) this.f17710b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC3345b.f17708a[enumC3318t.ordinal()] == 1) {
                    C4409i c4409iM9185c = a0Var2.m9185c();
                    if (((c4409iM9185c == null || (abstractC4422v = c4409iM9185c.f22046b) == null) ? null : abstractC4422v.f22135b.f29940f) != null) {
                        a0Var2.m9188g();
                        break;
                    } else {
                        a0.m9181f(a0Var2, "main_screen");
                        break;
                    }
                }
                break;
            default:
                EnumC3318t enumC3318t2 = (EnumC3318t) this.f17710b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (ps.a0.f29331a[enumC3318t2.ordinal()] == 1) {
                    a0.m9181f(a0Var2, "device_delete");
                    break;
                }
                break;
        }
        return a0Var;
    }
}
