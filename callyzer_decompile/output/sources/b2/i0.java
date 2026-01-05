package b2;

import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import h1.C2782m;
import k2.h2;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f3763a;

    /* renamed from: b */
    public final /* synthetic */ h2 f3764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(h2 h2Var, int i10) {
        super(0);
        this.f3763a = i10;
        this.f3764b = h2Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        int i10 = this.f3763a;
        h2 h2Var = this.f3764b;
        switch (i10) {
            case 0:
                return new C0847b(((C0847b) h2Var.getValue()).f5352a);
            case 1:
                C2782m c2782m = l0.f3781a;
                return new C0847b(((C0847b) h2Var.getValue()).f5352a);
            case 2:
                return (Float) h2Var.getValue();
            case 3:
                return Boolean.valueOf(((Number) h2Var.getValue()).floatValue() > DefinitionKt.NO_Float_VALUE);
            default:
                return Boolean.valueOf(((Number) h2Var.getValue()).floatValue() > DefinitionKt.NO_Float_VALUE);
        }
    }
}
