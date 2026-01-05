package km;

import qw.a0;
import s6.C6765d;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: km.f */
/* loaded from: classes3.dex */
public final class C4111f implements InterfaceC8209j {

    /* renamed from: a */
    public final /* synthetic */ int f21017a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC8209j f21018b;

    /* renamed from: c */
    public final /* synthetic */ C6765d f21019c;

    public /* synthetic */ C4111f(InterfaceC8209j interfaceC8209j, C6765d c6765d, int i10) {
        this.f21017a = i10;
        this.f21018b = interfaceC8209j;
        this.f21019c = c6765d;
    }

    @Override // wx.InterfaceC8209j
    public final Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        switch (this.f21017a) {
            case 0:
                Object objCollect = this.f21018b.collect(new C4110e(interfaceC8210k, this.f21019c, 0), interfaceC7559c);
                if (objCollect != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect2 = this.f21018b.collect(new C4110e(interfaceC8210k, this.f21019c, 1), interfaceC7559c);
                if (objCollect2 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return a0.f30746a;
    }
}
