package x1;

import b3.C0592x;
import c3.C0847b;
import c9.C0910e;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4381z;
import l4.InterfaceC4374s;
import og.yf;
import w3.p2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ v0 f39488a;

    /* renamed from: b */
    public final /* synthetic */ C0592x f39489b;

    /* renamed from: c */
    public final /* synthetic */ boolean f39490c;

    /* renamed from: d */
    public final /* synthetic */ boolean f39491d;

    /* renamed from: e */
    public final /* synthetic */ b2.y0 f39492e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC4374s f39493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(v0 v0Var, C0592x c0592x, boolean z6, boolean z10, b2.y0 y0Var, InterfaceC4374s interfaceC4374s) {
        super(1);
        this.f39488a = v0Var;
        this.f39489b = c0592x;
        this.f39490c = z6;
        this.f39491d = z10;
        this.f39492e = y0Var;
        this.f39493f = interfaceC4374s;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        p2 p2Var;
        long j6 = ((C0847b) obj).f5352a;
        v0 v0Var = this.f39488a;
        if (!v0Var.m15478b()) {
            C0592x.m1757b(this.f39489b);
        } else if (!this.f39490c && (p2Var = v0Var.f39705c) != null) {
            ((w3.l1) p2Var).m14976b();
        }
        if (v0Var.m15478b() && this.f39491d) {
            if (v0Var.m15477a() != k0.Selection) {
                r1 r1VarM15480d = v0Var.m15480d();
                if (r1VarM15480d != null) {
                    C0910e c0910e = v0Var.f39706d;
                    c0 c0Var = v0Var.f39724v;
                    int iMo2753w = this.f39493f.mo2753w(r1VarM15480d.m15466b(true, j6));
                    c0Var.invoke(C4381z.m9153a((C4381z) c0910e.f5579b, null, yf.m11072a(iMo2753w, iMo2753w), 5));
                    if (v0Var.f39703a.f39454a.f13620b.length() > 0) {
                        v0Var.f39713k.setValue(k0.Cursor);
                    }
                }
            } else {
                this.f39492e.m1695e(new C0847b(j6));
            }
        }
        return qw.a0.f30746a;
    }
}
