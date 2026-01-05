package xx;

import ex.InterfaceC2142f;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.EnumC7799a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.l */
/* loaded from: classes3.dex */
public final class C8506l extends AbstractC8502h {

    /* renamed from: e */
    public final AbstractC8199i f41424e;

    /* JADX WARN: Multi-variable type inference failed */
    public C8506l(InterfaceC2142f interfaceC2142f, InterfaceC8209j interfaceC8209j, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        super(interfaceC8209j, interfaceC7564h, i10, enumC7799a);
        this.f41424e = (AbstractC8199i) interfaceC2142f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ex.f, ww.i] */
    @Override // xx.AbstractC8499e
    /* renamed from: f */
    public final AbstractC8499e mo15369f(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return new C8506l(this.f41424e, this.f41413d, interfaceC7564h, i10, enumC7799a);
    }

    @Override // xx.AbstractC8502h
    /* renamed from: i */
    public final Object mo15790i(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        Object objM13488k = c0.m13488k(new C8504j(this, interfaceC8210k, null), interfaceC7559c);
        return objM13488k == EnumC7794a.COROUTINE_SUSPENDED ? objM13488k : a0.f30746a;
    }
}
