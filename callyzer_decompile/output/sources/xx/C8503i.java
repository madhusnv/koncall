package xx;

import qw.a0;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vw.EnumC7794a;
import vx.EnumC7799a;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.i */
/* loaded from: classes3.dex */
public final class C8503i extends AbstractC8502h {
    public C8503i(InterfaceC8209j interfaceC8209j, InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a, int i11) {
        super(interfaceC8209j, (i11 & 2) != 0 ? C7565i.f36440a : interfaceC7564h, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? EnumC7799a.SUSPEND : enumC7799a);
    }

    @Override // xx.AbstractC8499e
    /* renamed from: f */
    public final AbstractC8499e mo15369f(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return new C8503i(this.f41413d, interfaceC7564h, i10, enumC7799a);
    }

    @Override // xx.AbstractC8499e
    /* renamed from: g */
    public final InterfaceC8209j mo15392g() {
        return this.f41413d;
    }

    @Override // xx.AbstractC8502h
    /* renamed from: i */
    public final Object mo15790i(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        Object objCollect = this.f41413d.collect(interfaceC8210k, interfaceC7559c);
        return objCollect == EnumC7794a.COROUTINE_SUSPENDED ? objCollect : a0.f30746a;
    }
}
