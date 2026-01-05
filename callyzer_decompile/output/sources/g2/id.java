package g2;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class id extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11824a;

    /* renamed from: b */
    public final /* synthetic */ rd f11825b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id(rd rdVar, int i10) {
        super(0);
        this.f11824a = i10;
        this.f11825b = rdVar;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f11824a) {
            case 0:
                this.f11825b.mo6207a(false);
                break;
            default:
                this.f11825b.mo6207a(true);
                break;
        }
        return qw.a0.f30746a;
    }
}
