package ss;

import im.t1;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wx.InterfaceC8210k;
import wx.m1;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class n0 implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ int f33464a;

    /* renamed from: b */
    public final /* synthetic */ z0 f33465b;

    public /* synthetic */ n0(z0 z0Var, int i10) {
        this.f33464a = i10;
        this.f33465b = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m13181c(im.t1 r12, uw.InterfaceC7559c r13) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.n0.m13181c(im.t1, uw.c):java.lang.Object");
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        Object value;
        Object objM13190m;
        switch (this.f33464a) {
            case 0:
                C8801p c8801p = (C8801p) obj;
                z0 z0Var = this.f33465b;
                m1 m1Var = z0Var.f33543L;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C6913b.m13179a((C6913b) value, false, !c8801p.f42464a, null, null, 0, null, false, 1021)));
                return (c8801p.f42464a && (objM13190m = z0.m13190m(z0Var, interfaceC7559c)) == EnumC7794a.COROUTINE_SUSPENDED) ? objM13190m : qw.a0.f30746a;
            default:
                return m13181c((t1) obj, interfaceC7559c);
        }
    }
}
