package zq;

import ar.C0421k;
import br.C0740c;
import dr.C1775y;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.w0;
import qw.a0;
import wt.C8183a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zq.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9024g implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f43462a = 0;

    /* renamed from: b */
    public final /* synthetic */ w0 f43463b;

    /* renamed from: c */
    public final /* synthetic */ Object f43464c;

    /* renamed from: d */
    public final /* synthetic */ Object f43465d;

    public /* synthetic */ C9024g(C1775y c1775y, C0740c c0740c, w0 w0Var) {
        this.f43464c = c1775y;
        this.f43465d = c0740c;
        this.f43463b = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f43462a) {
            case 0:
                C1775y c1775y = (C1775y) this.f43464c;
                C0740c c0740c = (C0740c) this.f43465d;
                c1775y.m5459s(new C0421k(c0740c.f4680n, c0740c.f4681o));
                this.f43463b.setValue(Boolean.FALSE);
                break;
            default:
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f43464c;
                C8183a c8183a = (C8183a) this.f43465d;
                this.f43463b.setValue(Boolean.FALSE);
                interfaceC2141e.invoke(Integer.valueOf(c8183a.f39139a), c8183a.f39140b);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C9024g(w0 w0Var, InterfaceC2141e interfaceC2141e, C8183a c8183a) {
        this.f43463b = w0Var;
        this.f43464c = interfaceC2141e;
        this.f43465d = c8183a;
    }
}
