package qv;

import ex.InterfaceC2137a;
import qw.a0;
import rv.v0;
import sv.C6956d;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.y */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6350y implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30743a;

    /* renamed from: b */
    public final /* synthetic */ v0 f30744b;

    public /* synthetic */ C6350y(v0 v0Var, int i10) {
        this.f30743a = i10;
        this.f30744b = v0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        Object value;
        Object value2;
        switch (this.f30743a) {
            case 0:
                v0 v0Var = this.f30744b;
                m1 m1Var = v0Var.f31924k;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6956d.m13208a((C6956d) value, 0, null, null, null, false, 47)));
                v0Var.m12688f();
                break;
            default:
                v0 v0Var2 = this.f30744b;
                m1 m1Var2 = v0Var2.f31924k;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, C6956d.m13208a((C6956d) value2, 0, null, null, null, false, 47)));
                v0Var2.m12688f();
                break;
        }
        return a0.f30746a;
    }
}
