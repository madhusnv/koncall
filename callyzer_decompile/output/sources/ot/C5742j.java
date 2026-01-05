package ot;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import nt.C5138b;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ot.j */
/* loaded from: classes3.dex */
public final class C5742j implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f28292a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f28293b;

    /* renamed from: c */
    public final /* synthetic */ C5138b f28294c;

    public /* synthetic */ C5742j(InterfaceC2139c interfaceC2139c, C5138b c5138b, int i10) {
        this.f28292a = i10;
        this.f28293b = interfaceC2139c;
        this.f28294c = c5138b;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f28292a) {
            case 0:
                this.f28293b.invoke(this.f28294c);
                break;
            case 1:
                this.f28293b.invoke(this.f28294c.f25171c);
                break;
            case 2:
                this.f28293b.invoke(Integer.valueOf(this.f28294c.f25169a));
                break;
            default:
                this.f28293b.invoke(this.f28294c.f25171c);
                break;
        }
        return a0.f30746a;
    }
}
