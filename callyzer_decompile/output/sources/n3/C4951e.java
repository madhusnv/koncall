package n3;

import android.view.KeyEvent;
import ex.InterfaceC2139c;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n3.e */
/* loaded from: classes.dex */
public final class C4951e extends AbstractC7878q implements InterfaceC4950d {

    /* renamed from: q */
    public InterfaceC2139c f24635q;

    /* renamed from: r */
    public InterfaceC2139c f24636r;

    @Override // n3.InterfaceC4950d
    /* renamed from: f */
    public final boolean mo7491f(KeyEvent keyEvent) {
        InterfaceC2139c interfaceC2139c = this.f24636r;
        if (interfaceC2139c != null) {
            return ((Boolean) interfaceC2139c.invoke(new C4948b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // n3.InterfaceC4950d
    /* renamed from: t */
    public final boolean mo7493t(KeyEvent keyEvent) {
        InterfaceC2139c interfaceC2139c = this.f24635q;
        if (interfaceC2139c != null) {
            return ((Boolean) interfaceC2139c.invoke(new C4948b(keyEvent))).booleanValue();
        }
        return false;
    }
}
