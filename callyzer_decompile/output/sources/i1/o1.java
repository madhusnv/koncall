package i1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16945a;

    /* renamed from: b */
    public final /* synthetic */ p1 f16946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(p1 p1Var, int i10) {
        super(0);
        this.f16945a = i10;
        this.f16946b = p1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16945a) {
            case 0:
                return Boolean.valueOf(this.f16946b.f16953a.m8526f() > 0);
            default:
                p1 p1Var = this.f16946b;
                return Boolean.valueOf(p1Var.f16953a.m8526f() < p1Var.f16956d.m8526f());
        }
    }
}
