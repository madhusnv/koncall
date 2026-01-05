package zq;

import ar.C0423m;
import ar.C0426p;
import dr.C1775y;
import ex.InterfaceC2137a;
import k2.w0;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zq.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9026i implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f43468a = 1;

    /* renamed from: b */
    public final /* synthetic */ C1775y f43469b;

    /* renamed from: c */
    public final /* synthetic */ w0 f43470c;

    public /* synthetic */ C9026i(C1775y c1775y, w0 w0Var) {
        this.f43469b = c1775y;
        this.f43470c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f43468a) {
            case 0:
                this.f43470c.setValue(Boolean.FALSE);
                this.f43469b.m5459s(C0423m.f3143a);
                break;
            default:
                this.f43469b.m5459s(C0426p.f3146a);
                this.f43470c.setValue(Boolean.FALSE);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C9026i(w0 w0Var, C1775y c1775y) {
        this.f43470c = w0Var;
        this.f43469b = c1775y;
    }
}
