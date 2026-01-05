package ks;

import ex.InterfaceC2139c;
import is.C3348b;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4212a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f21338a;

    /* renamed from: b */
    public final /* synthetic */ C4223l f21339b;

    public /* synthetic */ C4212a(C4223l c4223l, int i10) {
        this.f21338a = i10;
        this.f21339b = c4223l;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        m1 m1Var;
        boolean z6;
        Object value;
        boolean z10;
        Object value2;
        switch (this.f21338a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C4223l c4223l = this.f21339b;
                w0 w0Var = c4223l.f21457q;
                m1 m1Var2 = c4223l.f21456p;
                if (((C3348b) w0Var.f39340a.getValue()).f17723k) {
                    while (true) {
                        Object value3 = m1Var2.getValue();
                        z6 = zBooleanValue;
                        m1Var = m1Var2;
                        if (!m1Var.m15397i(value3, C3348b.m7669a((C3348b) value3, null, false, 0, null, 0, false, false, false, null, null, z6, null, null, null, null, null, false, null, 1047551))) {
                            m1Var2 = m1Var;
                            zBooleanValue = z6;
                        }
                    }
                } else {
                    m1Var = m1Var2;
                    z6 = zBooleanValue;
                }
                do {
                    value = m1Var.getValue();
                    z10 = z6;
                    z6 = z10;
                } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, z10, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                m1 m1Var3 = this.f21339b.f21456p;
                do {
                    value2 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value2, C3348b.m7669a((C3348b) value2, null, zBooleanValue2, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
            default:
                C4223l c4223l2 = this.f21339b;
                tx.c0.m13502y(c4223l2.f21446f, null, null, new C4218g(1, c4223l2, null), 3);
                break;
        }
        return qw.a0.f30746a;
    }
}
