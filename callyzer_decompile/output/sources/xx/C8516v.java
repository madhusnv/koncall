package xx;

import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.InterfaceC7819u;
import vx.InterfaceC7822x;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.v */
/* loaded from: classes3.dex */
public final class C8516v implements InterfaceC8210k {

    /* renamed from: a */
    public final InterfaceC7822x f41441a;

    public C8516v(InterfaceC7819u interfaceC7819u) {
        this.f41441a = interfaceC7819u;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        Object objMo14775g = this.f41441a.mo14775g(obj, interfaceC7559c);
        return objMo14775g == EnumC7794a.COROUTINE_SUSPENDED ? objMo14775g : a0.f30746a;
    }
}
