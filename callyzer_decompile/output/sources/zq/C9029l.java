package zq;

import android.content.Context;
import bt.C0775t;
import dr.C1775y;
import ex.InterfaceC2141e;
import l7.a0;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8203d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zq.l */
/* loaded from: classes3.dex */
public final class C9029l extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f43478a;

    /* renamed from: b */
    public int f43479b;

    /* renamed from: c */
    public final /* synthetic */ C1775y f43480c;

    /* renamed from: d */
    public final /* synthetic */ a0 f43481d;

    /* renamed from: e */
    public final /* synthetic */ Context f43482e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9029l(C1775y c1775y, a0 a0Var, Context context, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f43478a = i10;
        this.f43480c = c1775y;
        this.f43481d = a0Var;
        this.f43482e = context;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f43478a) {
            case 0:
                return new C9029l(this.f43480c, this.f43481d, this.f43482e, interfaceC7559c, 0);
            default:
                return new C9029l(this.f43480c, this.f43481d, this.f43482e, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f43478a) {
        }
        return ((C9029l) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f43478a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f43479b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d = this.f43480c.f8641x;
                    C0775t c0775t = new C0775t(this.f43481d, this.f43482e, 3);
                    this.f43479b = 1;
                    if (c8203d.collect(c0775t, this) == enumC7794a) {
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
                int i11 = this.f43479b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d2 = this.f43480c.f8639v;
                    C0775t c0775t2 = new C0775t(this.f43481d, this.f43482e, 4);
                    this.f43479b = 1;
                    if (c8203d2.collect(c0775t2, this) == enumC7794a2) {
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
