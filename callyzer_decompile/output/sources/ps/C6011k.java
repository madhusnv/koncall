package ps;

import ex.InterfaceC2137a;
import k2.w0;
import ss.C6918g;
import ss.C6922k;
import ss.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6011k implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29388a;

    /* renamed from: b */
    public final /* synthetic */ z0 f29389b;

    /* renamed from: c */
    public final /* synthetic */ w0 f29390c;

    public /* synthetic */ C6011k(z0 z0Var, w0 w0Var, int i10) {
        this.f29388a = i10;
        this.f29389b = z0Var;
        this.f29390c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f29388a) {
            case 0:
                this.f29389b.m13196s(C6922k.f33451a);
                this.f29390c.setValue(Boolean.TRUE);
                break;
            default:
                this.f29389b.m13196s(C6918g.f33433a);
                this.f29390c.setValue(Boolean.FALSE);
                break;
        }
        return qw.a0.f30746a;
    }
}
