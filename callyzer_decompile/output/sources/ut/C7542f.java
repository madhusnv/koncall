package ut;

import ex.InterfaceC2137a;
import k2.w0;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7542f implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f36302a;

    /* renamed from: b */
    public final /* synthetic */ C7546j f36303b;

    /* renamed from: c */
    public final /* synthetic */ w0 f36304c;

    public /* synthetic */ C7542f(C7546j c7546j, w0 w0Var, int i10) {
        this.f36302a = i10;
        this.f36303b = c7546j;
        this.f36304c = w0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f36302a) {
            case 0:
                this.f36303b.m14299e(C7538b.f36298a);
                this.f36304c.setValue(Boolean.FALSE);
                break;
            default:
                this.f36303b.m14299e(new C7541e(!((C7543g) this.f36304c.getValue()).f36310f));
                break;
        }
        return a0.f30746a;
    }
}
