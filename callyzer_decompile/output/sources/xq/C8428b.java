package xq;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import yq.C8741f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xq.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8428b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41132a;

    /* renamed from: b */
    public final /* synthetic */ C8741f f41133b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f41134c;

    public /* synthetic */ C8428b(C8741f c8741f, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f41132a = i11;
        this.f41133b = c8741f;
        this.f41134c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f41132a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC8436j.m15732a(this.f41133b, this.f41134c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC8436j.m15736e(this.f41133b, this.f41134c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
