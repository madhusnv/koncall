package yp;

import ex.InterfaceC2142f;
import java.util.ArrayList;
import java.util.List;
import og.od;
import qp.C6273j;
import qw.a0;
import rw.AbstractC6663m;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yp.k */
/* loaded from: classes3.dex */
public final class C8731k extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public ArrayList f42243a;

    /* renamed from: b */
    public int f42244b;

    /* renamed from: c */
    public /* synthetic */ List f42245c;

    /* renamed from: d */
    public /* synthetic */ int f42246d;

    /* renamed from: e */
    public final /* synthetic */ C8735o f42247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8731k(C8735o c8735o, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f42247e = c8735o;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        C8731k c8731k = new C8731k(this.f42247e, (InterfaceC7559c) obj3);
        c8731k.f42245c = (List) obj;
        c8731k.f42246d = iIntValue;
        return c8731k.invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListD0;
        Object value;
        C8735o c8735o = this.f42247e;
        w0 w0Var = c8735o.f42277p;
        List list = this.f42245c;
        int i10 = this.f42246d;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i11 = this.f42244b;
        if (i11 == 0) {
            od.m10798c(obj);
            arrayListD0 = AbstractC6663m.d0(((C6273j) w0Var.f39340a.getValue()).f30444a);
            arrayListD0.addAll(list);
            if (!c8735o.f42281t) {
                c0.m13502y(c8735o.f42270i, null, null, new C8723c(c8735o, null, 3), 3);
            }
            this.f42245c = list;
            this.f42243a = arrayListD0;
            this.f42246d = i10;
            this.f42244b = 1;
            if (c0.m13489l(200L, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList = this.f42243a;
            od.m10798c(obj);
            arrayListD0 = arrayList;
        }
        m1 m1Var = c8735o.f42276o;
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C6273j.m12277a((C6273j) value, arrayListD0, false, list.isEmpty(), false, false, false, i10, null, null, false, null, null, null, null, false, AbstractC6663m.m12754R(((C6273j) w0Var.f39340a.getValue()).f30444a, list).isEmpty(), false, null, null, false, 4063162)));
        return a0.f30746a;
    }
}
