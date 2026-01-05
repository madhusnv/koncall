package vr;

import cs.C1493l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import js.C3850f;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vr.k */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7743k implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f37330a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f37331b;

    /* renamed from: c */
    public final /* synthetic */ C3850f f37332c;

    public /* synthetic */ C7743k(InterfaceC2139c interfaceC2139c, C3850f c3850f, int i10) {
        this.f37330a = i10;
        this.f37331b = interfaceC2139c;
        this.f37332c = c3850f;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f37330a) {
            case 0:
                C3850f c3850f = this.f37332c;
                this.f37331b.invoke("lead_details_screen/lead/" + c3850f.f19813c + "/" + AbstractC6663m.m12742F(c3850f.f19819i) + "/" + c3850f.f19811a);
                break;
            default:
                this.f37331b.invoke(new C1493l(this.f37332c));
                break;
        }
        return qw.a0.f30746a;
    }
}
