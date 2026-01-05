package bt;

import f9.C2222e;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.x */
/* loaded from: classes3.dex */
public final class C0779x implements InterfaceC8209j {

    /* renamed from: a */
    public final /* synthetic */ int f4949a;

    /* renamed from: b */
    public final /* synthetic */ C2222e f4950b;

    public /* synthetic */ C0779x(C2222e c2222e, int i10) {
        this.f4949a = i10;
        this.f4950b = c2222e;
    }

    @Override // wx.InterfaceC8209j
    public final Object collect(InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) throws Throwable {
        switch (this.f4949a) {
            case 0:
                Object objCollect = this.f4950b.collect(new C0778w(interfaceC8210k, 0), interfaceC7559c);
                if (objCollect != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = this.f4950b.collect(new C0778w(interfaceC8210k, 1), interfaceC7559c);
                if (objCollect2 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect3 = this.f4950b.collect(new C0778w(interfaceC8210k, 5), interfaceC7559c);
                if (objCollect3 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return qw.a0.f30746a;
    }
}
