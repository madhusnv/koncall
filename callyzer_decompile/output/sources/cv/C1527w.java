package cv;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b3.InterfaceC0579k;
import bm.C0706q;
import k1.i2;
import p3.InterfaceC5822t;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.w */
/* loaded from: classes3.dex */
public final class C1527w implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ int f7692a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0579k f7693b;

    public /* synthetic */ C1527w(InterfaceC0579k interfaceC0579k, int i10) {
        this.f7692a = i10;
        this.f7693b = interfaceC0579k;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        switch (this.f7692a) {
            case 0:
                Object objM8450d = i2.m8450d(interfaceC5822t, null, new C0706q(this.f7693b, 1), interfaceC7559c, 7);
                if (objM8450d != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objM8450d2 = i2.m8450d(interfaceC5822t, null, new C0706q(this.f7693b, 3), interfaceC7559c, 7);
                if (objM8450d2 != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return a0.f30746a;
    }
}
