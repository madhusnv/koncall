package cv;

import ex.InterfaceC2137a;
import m1.C4634p;
import m1.InterfaceC4628j;
import qw.a0;
import uw.InterfaceC7559c;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.u */
/* loaded from: classes3.dex */
public final class C1525u implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f7686a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f7687b;

    public /* synthetic */ C1525u(int i10, InterfaceC2137a interfaceC2137a) {
        this.f7686a = i10;
        this.f7687b = interfaceC2137a;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f7686a) {
            case 0:
                if (((InterfaceC4628j) obj) instanceof C4634p) {
                    this.f7687b.invoke();
                }
                break;
            default:
                if (((InterfaceC4628j) obj) instanceof C4634p) {
                    this.f7687b.invoke();
                }
                break;
        }
        return a0.f30746a;
    }
}
