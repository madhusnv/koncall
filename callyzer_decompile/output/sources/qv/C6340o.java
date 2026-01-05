package qv;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import kn.C4130j;
import qw.a0;
import rv.C6643s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6340o implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30729a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f30730b;

    /* renamed from: c */
    public final /* synthetic */ C4130j f30731c;

    public /* synthetic */ C6340o(InterfaceC2139c interfaceC2139c, C4130j c4130j, int i10) {
        this.f30729a = i10;
        this.f30730b = interfaceC2139c;
        this.f30731c = c4130j;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f30729a) {
            case 0:
                this.f30730b.invoke(new C6643s(this.f30731c, !r1.f21083c));
                break;
            default:
                this.f30730b.invoke(new C6643s(this.f30731c, !r1.f21083c));
                break;
        }
        return a0.f30746a;
    }
}
