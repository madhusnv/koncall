package x1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f39603a;

    /* renamed from: b */
    public final /* synthetic */ p1 f39604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(p1 p1Var, int i10) {
        super(0);
        this.f39603a = i10;
        this.f39604b = p1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f39603a) {
            case 0:
                return Boolean.valueOf(this.f39604b.f39635a.m8490f() > DefinitionKt.NO_Float_VALUE);
            default:
                p1 p1Var = this.f39604b;
                return Boolean.valueOf(p1Var.f39635a.m8490f() < p1Var.f39636b.m8490f());
        }
    }
}
