package ls;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import ns.C5136b;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ls.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4514e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22469a;

    /* renamed from: b */
    public final /* synthetic */ C5136b f22470b;

    /* renamed from: c */
    public final /* synthetic */ C4511b f22471c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f22472d;

    public /* synthetic */ C4514e(C5136b c5136b, C4511b c4511b, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f22469a = i11;
        this.f22470b = c5136b;
        this.f22471c = c4511b;
        this.f22472d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f22469a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC4510a.m9343b(this.f22470b, this.f22471c, this.f22472d, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC4510a.m9342a(this.f22470b, this.f22471c, this.f22472d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
