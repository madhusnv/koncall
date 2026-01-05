package vs;

import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vs.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7761c implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37403a;

    /* renamed from: b */
    public final /* synthetic */ LocalDateTime f37404b;

    public /* synthetic */ C7761c(LocalDateTime localDateTime, int i10, int i11) {
        this.f37403a = i11;
        this.f37404b = localDateTime;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f37403a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC7766h.m14744c(this.f37404b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC7760b.m14738e(this.f37404b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
