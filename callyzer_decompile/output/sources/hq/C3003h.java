package hq;

import ex.InterfaceC2137a;
import mq.C4842j;
import mq.C4843k;
import mq.C4845m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3003h implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16197a;

    /* renamed from: b */
    public final /* synthetic */ mq.h0 f16198b;

    public /* synthetic */ C3003h(mq.h0 h0Var, int i10) {
        this.f16197a = i10;
        this.f16198b = h0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16197a) {
            case 0:
                this.f16198b.m9801m(C4842j.f24292a);
                break;
            case 1:
                this.f16198b.m9801m(C4845m.f24302a);
                break;
            default:
                this.f16198b.m9801m(C4843k.f24297a);
                break;
        }
        return qw.a0.f30746a;
    }
}
