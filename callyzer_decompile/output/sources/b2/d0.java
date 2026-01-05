package b2;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import ex.InterfaceC2139c;
import k1.r1;
import p3.InterfaceC5822t;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 implements PointerInputEventHandler {

    /* renamed from: a */
    public final /* synthetic */ int f3716a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f3717b;

    public /* synthetic */ d0(int i10, InterfaceC2139c interfaceC2139c) {
        this.f3716a = i10;
        this.f3717b = interfaceC2139c;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        switch (this.f3716a) {
            case 0:
                Object objL0 = ((p3.h0) interfaceC5822t).L0(new c0(this.f3717b, null, 0), interfaceC7559c);
                return objL0 == EnumC7794a.COROUTINE_SUSPENDED ? objL0 : qw.a0.f30746a;
            case 1:
                Object objM8472c = r1.m8472c(interfaceC5822t, new c0(this.f3717b, null, 1), interfaceC7559c);
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                qw.a0 a0Var = qw.a0.f30746a;
                if (objM8472c != enumC7794a) {
                    objM8472c = a0Var;
                }
                return objM8472c == enumC7794a ? objM8472c : a0Var;
            default:
                Object objL02 = ((p3.h0) interfaceC5822t).L0(new k1.m0(interfaceC7559c.getContext(), this.f3717b, null, 3), interfaceC7559c);
                return objL02 == EnumC7794a.COROUTINE_SUSPENDED ? objL02 : qw.a0.f30746a;
        }
    }
}
