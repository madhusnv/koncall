package po;

import android.os.Build;
import ex.InterfaceC2137a;
import qi.C6218a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: po.d */
/* loaded from: classes3.dex */
public final class C5983d implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29245a;

    /* renamed from: b */
    public final /* synthetic */ C5984e f29246b;

    public /* synthetic */ C5983d(C5984e c5984e, int i10) {
        this.f29245a = i10;
        this.f29246b = c5984e;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f29245a) {
            case 0:
                if (Build.VERSION.SDK_INT < 26) {
                    return null;
                }
                C5984e c5984e = this.f29246b;
                c5984e.getClass();
                return new C6218a().m12229c(c5984e.f29247a).f43648b;
            case 1:
                if (Build.VERSION.SDK_INT < 26) {
                    return null;
                }
                C5984e c5984e2 = this.f29246b;
                c5984e2.getClass();
                C6218a c6218a = new C6218a();
                c6218a.f30209d = "silentChannelId";
                c6218a.f30206a = "silentChannel";
                c6218a.f30207b = 2;
                return c6218a.m12229c(c5984e2.f29247a).f43648b;
            case 2:
                if (Build.VERSION.SDK_INT < 26) {
                    return null;
                }
                C5984e c5984e3 = this.f29246b;
                c5984e3.getClass();
                C6218a c6218a2 = new C6218a();
                c6218a2.f30209d = "floatingChannelId";
                c6218a2.f30206a = "floatingChannel";
                c6218a2.f30207b = 4;
                return c6218a2.m12229c(c5984e3.f29247a).f43648b;
            case 3:
                if (Build.VERSION.SDK_INT < 26) {
                    return null;
                }
                C5984e c5984e4 = this.f29246b;
                c5984e4.getClass();
                C6218a c6218a3 = new C6218a();
                c6218a3.f30209d = "callRecordingChannelId";
                c6218a3.f30206a = "Call Recording Notifications";
                return c6218a3.m12229c(c5984e4.f29247a).f43648b;
            case 4:
                if (Build.VERSION.SDK_INT < 26) {
                    return null;
                }
                C5984e c5984e5 = this.f29246b;
                c5984e5.getClass();
                C6218a c6218a4 = new C6218a();
                c6218a4.f30209d = "quickCallSilentChannelId";
                c6218a4.f30206a = "quickCall";
                c6218a4.f30207b = 2;
                return c6218a4.m12229c(c5984e5.f29247a).f43648b;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    return null;
                }
                C5984e c5984e6 = this.f29246b;
                c5984e6.getClass();
                C6218a c6218a5 = new C6218a();
                c6218a5.f30209d = "callRecordingSilentChannelId";
                c6218a5.f30206a = "Call Recording Notifications";
                c6218a5.f30207b = 2;
                return c6218a5.m12229c(c5984e6.f29247a).f43648b;
        }
    }
}
