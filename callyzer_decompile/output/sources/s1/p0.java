package s1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f32118a;

    /* renamed from: b */
    public final /* synthetic */ r0 f32119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(r0 r0Var, int i10) {
        super(0);
        this.f32118a = i10;
        this.f32119b = r0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f32118a) {
            case 0:
                r0 r0Var = this.f32119b;
                return Float.valueOf(r0Var.f32124r.mo12083a() - r0Var.f32124r.mo12085c());
            case 1:
                return Float.valueOf(this.f32119b.f32124r.mo12084b());
            default:
                return Float.valueOf(this.f32119b.f32124r.mo12086d());
        }
    }
}
