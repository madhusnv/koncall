package gs;

import ex.InterfaceC2141e;
import fs.C2370a;
import java.util.List;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.e */
/* loaded from: classes3.dex */
public final class C2719e extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15169a;

    /* renamed from: b */
    public final /* synthetic */ C2721g f15170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2719e(C2721g c2721g, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15169a = i10;
        this.f15170b = c2721g;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15169a) {
            case 0:
                return new C2719e(this.f15170b, interfaceC7559c, 0);
            default:
                return new C2719e(this.f15170b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15169a) {
            case 0:
                return ((C2719e) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                C2719e c2719e = (C2719e) create((Throwable) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2719e.invokeSuspend(a0Var);
                return a0Var;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i10 = this.f15169a;
        C2721g c2721g = this.f15170b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                return new Integer(((C2370a) c2721g.f15185m.f39340a.getValue()).f10784f + 1);
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c2721g.f15184l;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C2370a.m6057a((C2370a) value, false, null, null, 0, false, false, 1022)));
                return a0.f30746a;
        }
    }
}
