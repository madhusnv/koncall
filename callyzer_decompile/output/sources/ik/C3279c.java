package ik;

import ex.InterfaceC2141e;
import java.util.List;
import k2.o1;
import o6.b1;
import o6.i0;
import og.od;
import om.C5401c;
import qw.C6361k;
import qw.a0;
import rw.AbstractC6663m;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.e1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.c */
/* loaded from: classes.dex */
public final class C3279c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f17480a;

    /* renamed from: b */
    public /* synthetic */ Object f17481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3279c(int i10, int i11, InterfaceC7559c interfaceC7559c) {
        super(i10, interfaceC7559c);
        this.f17480a = i11;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f17480a) {
            case 0:
                C3279c c3279c = new C3279c(2, 0, interfaceC7559c);
                c3279c.f17481b = obj;
                return c3279c;
            case 1:
                C3279c c3279c2 = new C3279c(2, 1, interfaceC7559c);
                c3279c2.f17481b = obj;
                return c3279c2;
            case 2:
                C3279c c3279c3 = new C3279c(2, 2, interfaceC7559c);
                c3279c3.f17481b = obj;
                return c3279c3;
            case 3:
                C3279c c3279c4 = new C3279c(2, 3, interfaceC7559c);
                c3279c4.f17481b = obj;
                return c3279c4;
            case 4:
                C3279c c3279c5 = new C3279c(2, 4, interfaceC7559c);
                c3279c5.f17481b = obj;
                return c3279c5;
            case 5:
                C3279c c3279c6 = new C3279c(2, 5, interfaceC7559c);
                c3279c6.f17481b = obj;
                return c3279c6;
            default:
                C3279c c3279c7 = new C3279c(2, 6, interfaceC7559c);
                c3279c7.f17481b = obj;
                return c3279c7;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17480a) {
            case 0:
                C3279c c3279c = (C3279c) create((String) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c3279c.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                return ((C3279c) create((o1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 2:
                return ((C3279c) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 3:
                return ((C3279c) create((b1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 4:
                C3279c c3279c2 = (C3279c) create((Throwable) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c3279c2.invokeSuspend(a0Var2);
                return a0Var2;
            case 5:
                return ((C3279c) create(obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C3279c) create((e1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f17480a;
        a0 a0Var = a0.f30746a;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return Boolean.valueOf(((o1) this.f17481b) == o1.ShutDown);
            case 2:
                List list = (List) this.f17481b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (list.isEmpty()) {
                    return null;
                }
                C5401c c5401c = (C5401c) AbstractC6663m.m12750N(list);
                return new C6361k(c5401c.f27096b.f23849f, new Integer(c5401c.f27095a));
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return Boolean.valueOf(!(((b1) this.f17481b) instanceof i0));
            case 4:
                Throwable th2 = (Throwable) this.f17481b;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                th2.getMessage();
                return a0Var;
            case 5:
                Object obj2 = this.f17481b;
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return obj2;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return Boolean.valueOf(((e1) this.f17481b) != e1.START);
        }
    }
}
