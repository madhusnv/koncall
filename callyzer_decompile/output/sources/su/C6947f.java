package su;

import du.AbstractC1839u;
import ex.InterfaceC2141e;
import iu.C3356h;
import o6.s0;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.c1;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: su.f */
/* loaded from: classes3.dex */
public final class C6947f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f33585a;

    /* renamed from: b */
    public final /* synthetic */ C6952k f33586b;

    /* renamed from: c */
    public final /* synthetic */ long f33587c;

    /* renamed from: d */
    public final /* synthetic */ long f33588d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC1839u f33589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6947f(C6952k c6952k, long j6, long j10, AbstractC1839u abstractC1839u, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f33586b = c6952k;
        this.f33587c = j6;
        this.f33588d = j10;
        this.f33589e = abstractC1839u;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C6947f(this.f33586b, this.f33587c, this.f33588d, this.f33589e, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6947f) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f33585a;
        if (i10 == 0) {
            od.m10798c(obj);
            C6952k c6952k = this.f33586b;
            m1 m1Var = c6952k.f33636n;
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C3356h.m7670a((C3356h) value, null, null, false, false, false, false, null, null, false, null, null, true, false, false, null, 258047)));
            InterfaceC8209j interfaceC8209jM1393h = c6952k.f33628f.m1393h(this.f33587c, this.f33588d, -1L, "SettingsViewModel");
            s0 s0Var = new s0(7, (Object) c6952k, (Object) this.f33589e, (InterfaceC7559c) null, false);
            this.f33585a = 1;
            if (c1.m15379j(interfaceC8209jM1393h, s0Var, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return a0.f30746a;
    }
}
