package t3;

import ex.InterfaceC2141e;
import java.util.List;
import s4.C6745a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends v3.d0 {

    /* renamed from: b */
    public final /* synthetic */ f0 f33968b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2141e f33969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, InterfaceC2141e interfaceC2141e, String str) {
        super(str);
        this.f33968b = f0Var;
        this.f33969c = interfaceC2141e;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final k0 mo16554measure3p2s80s(l0 l0Var, List list, long j6) {
        f0 f0Var = this.f33968b;
        a0 a0Var = f0Var.f33986h;
        a0Var.f33951a = l0Var.getLayoutDirection();
        a0Var.f33952b = l0Var.mo155a();
        a0Var.f33953c = l0Var.mo154O();
        boolean zMo12874R = l0Var.mo12874R();
        InterfaceC2141e interfaceC2141e = this.f33969c;
        if (zMo12874R || f0Var.f33979a.f36849h == null) {
            f0Var.f33982d = 0;
            k0 k0Var = (k0) interfaceC2141e.invoke(a0Var, new C6745a(j6));
            return new b0(k0Var, f0Var, f0Var.f33982d, k0Var, 1);
        }
        f0Var.f33983e = 0;
        k0 k0Var2 = (k0) interfaceC2141e.invoke(f0Var.f33987j, new C6745a(j6));
        return new b0(k0Var2, f0Var, f0Var.f33983e, k0Var2, 0);
    }
}
