package i1;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f16904a;

    /* renamed from: b */
    public final /* synthetic */ m1 f16905b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(m1 m1Var, int i10) {
        super(0);
        this.f16904a = i10;
        this.f16905b = m1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f16904a) {
            case 0:
                return Float.valueOf(this.f16905b.f16928q.f16953a.m8526f());
            default:
                return Float.valueOf(this.f16905b.f16928q.f16956d.m8526f());
        }
    }
}
