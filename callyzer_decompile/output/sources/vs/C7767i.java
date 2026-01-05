package vs;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import ws.C8176q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vs.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7767i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37418a;

    /* renamed from: b */
    public final /* synthetic */ String f37419b;

    /* renamed from: c */
    public final /* synthetic */ C8176q f37420c;

    /* renamed from: d */
    public final /* synthetic */ Integer f37421d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC2139c f37422e;

    public /* synthetic */ C7767i(String str, C8176q c8176q, Integer num, InterfaceC2139c interfaceC2139c, int i10, int i11) {
        this.f37418a = i11;
        this.f37419b = str;
        this.f37420c = c8176q;
        this.f37421d = num;
        this.f37422e = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37418a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM8496A = C3953b.m8496A(1);
                AbstractC7760b.m14734a(this.f37419b, this.f37420c, this.f37421d, this.f37422e, (InterfaceC3962k) obj, iM8496A);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM8496A2 = C3953b.m8496A(1);
                AbstractC7760b.m14735b(this.f37419b, this.f37420c, this.f37421d, this.f37422e, (InterfaceC3962k) obj, iM8496A2);
                break;
        }
        return a0.f30746a;
    }
}
