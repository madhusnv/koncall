package wc;

import ex.InterfaceC2137a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wc.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C7977k implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f38373a;

    /* renamed from: b */
    public final /* synthetic */ C7983q f38374b;

    /* renamed from: c */
    public final /* synthetic */ int f38375c;

    public /* synthetic */ C7977k(C7983q c7983q, int i10, int i11) {
        this.f38373a = i11;
        this.f38374b = c7983q;
        this.f38375c = i10;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f38373a) {
            case 0:
                C7983q c7983q = this.f38374b;
                return Boolean.valueOf(c7983q.f38406c.f39895c < this.f38375c && !c7983q.isClosedForWrite());
            default:
                C7983q c7983q2 = this.f38374b;
                return Boolean.valueOf(c7983q2.f38406c.f39894b < this.f38375c && !c7983q2.isClosedForRead());
        }
    }
}
