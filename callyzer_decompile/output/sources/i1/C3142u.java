package i1;

import a3.C0045d;
import android.view.KeyEvent;
import k1.i2;
import p3.InterfaceC5822t;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i1.u */
/* loaded from: classes.dex */
public class C3142u extends AbstractC3126e {
    @Override // i1.AbstractC3126e
    public final Object P0(InterfaceC5822t interfaceC5822t, InterfaceC7559c interfaceC7559c) {
        C3141t c3141t = new C3141t(this, null, 0);
        C0045d c0045d = new C0045d(15, this);
        k1.g0 g0Var = i2.f20132a;
        Object objM13488k = tx.c0.m13488k(new aw.d0(interfaceC5822t, c3141t, c0045d, new k1.a1(interfaceC5822t), (InterfaceC7559c) null), interfaceC7559c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        qw.a0 a0Var = qw.a0.f30746a;
        if (objM13488k != enumC7794a) {
            objM13488k = a0Var;
        }
        return objM13488k == enumC7794a ? objM13488k : a0Var;
    }

    @Override // i1.AbstractC3126e
    public final boolean T0(KeyEvent keyEvent) {
        return false;
    }

    @Override // i1.AbstractC3126e
    public final void U0(KeyEvent keyEvent) {
        this.f16846y.invoke();
    }
}
