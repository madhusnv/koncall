package m1;

import qw.a0;
import vw.EnumC7794a;
import vx.EnumC7799a;
import ww.AbstractC8193c;
import wx.InterfaceC8209j;
import wx.b1;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m1.m */
/* loaded from: classes.dex */
public final class C4631m implements InterfaceC4630l {

    /* renamed from: a */
    public final b1 f22873a = c1.m15371b(0, 16, EnumC7799a.DROP_OLDEST, 1);

    @Override // m1.InterfaceC4630l
    /* renamed from: a */
    public final Object mo9501a(InterfaceC4628j interfaceC4628j, AbstractC8193c abstractC8193c) throws Throwable {
        Object objEmit = this.f22873a.emit(interfaceC4628j, abstractC8193c);
        return objEmit == EnumC7794a.COROUTINE_SUSPENDED ? objEmit : a0.f30746a;
    }

    @Override // m1.InterfaceC4630l
    /* renamed from: b */
    public final boolean mo9502b(InterfaceC4628j interfaceC4628j) {
        return this.f22873a.mo15352b(interfaceC4628j);
    }

    @Override // m1.InterfaceC4629k
    /* renamed from: c */
    public final InterfaceC8209j mo6892c() {
        return this.f22873a;
    }
}
