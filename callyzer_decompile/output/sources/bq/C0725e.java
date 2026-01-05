package bq;

import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import qp.C6274k;
import qw.a0;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bq.e */
/* loaded from: classes3.dex */
public final class C0725e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4558a;

    /* renamed from: b */
    public final /* synthetic */ C0737q f4559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0725e(C0737q c0737q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4558a = i10;
        this.f4559b = c0737q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4558a) {
            case 0:
                return new C0725e(this.f4559b, interfaceC7559c, 0);
            case 1:
                return new C0725e(this.f4559b, interfaceC7559c, 1);
            default:
                return new C0725e(this.f4559b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4558a) {
            case 0:
                C0725e c0725e = (C0725e) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c0725e.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                return ((C0725e) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                C0725e c0725e2 = (C0725e) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c0725e2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f4558a;
        a0 a0Var = a0.f30746a;
        C0737q c0737q = this.f4559b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c0737q.f4642g, null, null, new C0723c(c0737q, null, 2), 3);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C6274k) c0737q.f4650o.f39340a.getValue()).f30481p + 1);
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0737q.m14294g();
                return a0Var;
        }
    }
}
