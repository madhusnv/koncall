package og;

import qj.InterfaceC6237b;
import ue.C7421c;
import xe.C8363o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class zg implements InterfaceC6237b {

    /* renamed from: a */
    public final /* synthetic */ int f27047a;

    /* renamed from: b */
    public final /* synthetic */ C8363o f27048b;

    public /* synthetic */ zg(C8363o c8363o, int i10) {
        this.f27047a = i10;
        this.f27048b = c8363o;
    }

    @Override // qj.InterfaceC6237b
    public final Object get() {
        switch (this.f27047a) {
            case 0:
                return this.f27048b.m15534a("FIREBASE_ML_SDK", new C7421c("json"), new ch(3));
            case 1:
                return this.f27048b.m15534a("FIREBASE_ML_SDK", new C7421c("proto"), new ch(2));
            case 2:
                return this.f27048b.m15534a("FIREBASE_ML_SDK", new C7421c("json"), pg.oa.f29015e);
            default:
                return this.f27048b.m15534a("FIREBASE_ML_SDK", new C7421c("proto"), pg.oa.f29014d);
        }
    }
}
