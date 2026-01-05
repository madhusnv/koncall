package wx;

import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vx.EnumC7799a;
import xx.InterfaceC8510p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w0 implements k1, InterfaceC8209j, InterfaceC8510p {

    /* renamed from: a */
    public final /* synthetic */ k1 f39340a;

    public w0(m1 m1Var) {
        this.f39340a = m1Var;
    }

    @Override // xx.InterfaceC8510p
    /* renamed from: c */
    public final InterfaceC8209j mo15353c(InterfaceC7564h interfaceC7564h, int i10, EnumC7799a enumC7799a) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || enumC7799a != EnumC7799a.DROP_OLDEST) ? c1.m15388s(this, interfaceC7564h, i10, enumC7799a) : this;
    }

    @Override // wx.InterfaceC8209j
    public final Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        return this.f39340a.collect(interfaceC8210k, interfaceC7559c);
    }

    @Override // wx.k1
    public final Object getValue() {
        return this.f39340a.getValue();
    }
}
