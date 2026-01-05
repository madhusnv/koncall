package gn;

import ex.InterfaceC2142f;
import og.od;
import rw.C6668r;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0 extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public int f14743a;

    /* renamed from: b */
    public /* synthetic */ InterfaceC8210k f14744b;

    /* renamed from: c */
    public /* synthetic */ Throwable f14745c;

    /* renamed from: d */
    public final /* synthetic */ x2 f14746d;

    /* renamed from: e */
    public final /* synthetic */ String f14747e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(x2 x2Var, String str, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f14746d = x2Var;
        this.f14747e = str;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p0 p0Var = new p0(this.f14746d, this.f14747e, (InterfaceC7559c) obj3);
        p0Var.f14744b = (InterfaceC8210k) obj;
        p0Var.f14745c = (Throwable) obj2;
        return p0Var.invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8210k interfaceC8210k = this.f14744b;
        Throwable th2 = this.f14745c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f14743a;
        qw.a0 a0Var = qw.a0.f30746a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return a0Var;
        }
        od.m10798c(obj);
        C8805t c8805t = this.f14746d.f14957q;
        th2.printStackTrace();
        c8805t.m16231f("MessageTemplate local DB: Failed to fetch sub-templates for templateId \"" + this.f14747e + "\" - " + a0Var);
        this.f14744b = null;
        this.f14745c = null;
        this.f14743a = 1;
        return interfaceC8210k.emit(C6668r.f31943a, this) == enumC7794a ? enumC7794a : a0Var;
    }
}
