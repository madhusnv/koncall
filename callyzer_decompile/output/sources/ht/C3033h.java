package ht;

import ex.InterfaceC2141e;
import og.od;
import p3.EnumC5813k;
import p3.f0;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ht.h */
/* loaded from: classes3.dex */
public final class C3033h extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public int f16358b;

    /* renamed from: c */
    public /* synthetic */ Object f16359c;

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        C3033h c3033h = new C3033h(2, interfaceC7559c);
        c3033h.f16359c = obj;
        return c3033h;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C3033h) create((f0) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        f0 f0Var = (f0) this.f16359c;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f16358b;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        do {
            this.f16359c = f0Var;
            this.f16358b = 1;
        } while (f0Var.m11384b(EnumC5813k.Main, this) != enumC7794a);
        return enumC7794a;
    }
}
