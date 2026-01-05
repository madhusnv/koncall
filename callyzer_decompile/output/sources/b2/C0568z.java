package b2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ex.InterfaceC2139c;
import gs.C2726l;
import k1.i2;
import k1.r1;
import nf.C5047i;
import p3.InterfaceC5822t;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import vw.EnumC7794a;
import x1.C8269s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b2.z */
/* loaded from: classes.dex */
public final class C0568z implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ int f3890a;

    /* renamed from: b */
    public final /* synthetic */ Object f3891b;

    /* renamed from: c */
    public final /* synthetic */ Object f3892c;

    public /* synthetic */ C0568z(int i10, Object obj, Object obj2) {
        this.f3890a = i10;
        this.f3891b = obj;
        this.f3892c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        switch (this.f3890a) {
            case 0:
                p3.h0 h0Var = (p3.h0) interfaceC5822t;
                h0Var.getClass();
                Object objM8472c = r1.m8472c(interfaceC5822t, new C0567y((C5047i) this.f3891b, new C0554l(AbstractC7634f.m14563x(h0Var).f36827E), (x1.d1) this.f3892c, null), interfaceC7559c);
                if (objM8472c != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objM8450d = i2.m8450d(interfaceC5822t, null, new C8269s(1, (InterfaceC2139c) this.f3892c, (k2.w0) this.f3891b), interfaceC7559c, 7);
                if (objM8450d != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objM13488k = tx.c0.m13488k(new C2726l(interfaceC5822t, (x1.d1) this.f3892c, (y0) this.f3891b, null, 3), interfaceC7559c);
                if (objM13488k != EnumC7794a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public C0568z(x1.d1 d1Var, y0 y0Var) {
        this.f3890a = 2;
        this.f3892c = d1Var;
        this.f3891b = y0Var;
    }
}
