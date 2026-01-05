package g2;

import android.window.OnBackInvokedCallback;
import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f11458a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f11459b;

    public /* synthetic */ e7(int i10, InterfaceC2137a interfaceC2137a) {
        this.f11458a = i10;
        this.f11459b = interfaceC2137a;
    }

    public final void onBackInvoked() {
        switch (this.f11458a) {
            case 0:
                this.f11459b.invoke();
                break;
            default:
                InterfaceC2137a interfaceC2137a = this.f11459b;
                if (interfaceC2137a != null) {
                    interfaceC2137a.invoke();
                    break;
                }
                break;
        }
    }
}
