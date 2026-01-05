package gr;

import d7.q0;
import en.AbstractC2072e;
import en.C2068a;
import en.C2069b;
import en.C2070c;
import en.C2071d;
import ex.InterfaceC2141e;
import fr.C2369a;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gr.e */
/* loaded from: classes3.dex */
public final class C2709e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15115a;

    /* renamed from: b */
    public /* synthetic */ Object f15116b;

    /* renamed from: c */
    public final /* synthetic */ C2713i f15117c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2709e(C2713i c2713i, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15115a = i10;
        this.f15117c = c2713i;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15115a) {
            case 0:
                C2709e c2709e = new C2709e(this.f15117c, interfaceC7559c, 0);
                c2709e.f15116b = obj;
                return c2709e;
            case 1:
                C2709e c2709e2 = new C2709e(this.f15117c, interfaceC7559c, 1);
                c2709e2.f15116b = obj;
                return c2709e2;
            default:
                C2709e c2709e3 = new C2709e(this.f15117c, interfaceC7559c, 2);
                c2709e3.f15116b = obj;
                return c2709e3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15115a) {
            case 0:
                C2709e c2709e = (C2709e) create((AbstractC2072e) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2709e.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C2709e c2709e2 = (C2709e) create((Throwable) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c2709e2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C2709e c2709e3 = (C2709e) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c2709e3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        int i10 = this.f15115a;
        a0 a0Var = a0.f30746a;
        C2713i c2713i = this.f15117c;
        switch (i10) {
            case 0:
                m1 m1Var = c2713i.f15135j;
                AbstractC2072e abstractC2072e = (AbstractC2072e) this.f15116b;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC4154l.m8918a(abstractC2072e, C2070c.f9684a)) {
                    do {
                        value4 = m1Var.getValue();
                    } while (!m1Var.m15397i(value4, C2369a.m6056a((C2369a) value4, null, null, true, false, false, 0, 247)));
                } else {
                    int i11 = 1;
                    InterfaceC7559c interfaceC7559c = null;
                    if (AbstractC4154l.m8918a(abstractC2072e, C2068a.f9682a)) {
                        do {
                            value3 = m1Var.getValue();
                        } while (!m1Var.m15397i(value3, C2369a.m6056a((C2369a) value3, null, null, false, false, false, 0, 247)));
                        c0.m13502y(q0.m5340g(c2713i), null, null, new C2706b(c2713i, null, 1), 3);
                    } else if (AbstractC4154l.m8918a(abstractC2072e, C2071d.f9685a)) {
                        do {
                            value2 = m1Var.getValue();
                        } while (!m1Var.m15397i(value2, C2369a.m6056a((C2369a) value2, null, null, false, false, false, 0, 243)));
                        c0.m13502y(q0.m5340g(c2713i), null, null, new C2708d(c2713i, interfaceC7559c, i11), 3);
                    } else {
                        if (!AbstractC4154l.m8918a(abstractC2072e, C2069b.f9683a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        do {
                            value = m1Var.getValue();
                        } while (!m1Var.m15397i(value, C2369a.m6056a((C2369a) value, null, null, false, false, false, 0, 247)));
                    }
                }
                return a0Var;
            case 1:
                Throwable th2 = (Throwable) this.f15116b;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c2713i.f15132g.m16235j(th2);
                m1 m1Var2 = c2713i.f15135j;
                do {
                    value5 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value5, C2369a.m6056a((C2369a) value5, null, null, false, false, false, 0, 231)));
                return a0Var;
            default:
                List list = (List) this.f15116b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var3 = c2713i.f15135j;
                do {
                    value6 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value6, C2369a.m6056a((C2369a) value6, list, null, false, false, list.isEmpty(), 0, 190)));
                return a0Var;
        }
    }
}
