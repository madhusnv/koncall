package g1;

import ex.InterfaceC2137a;
import h1.s1;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.t */
/* loaded from: classes.dex */
public final class C2440t extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f11071a;

    /* renamed from: b */
    public final /* synthetic */ s1 f11072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2440t(s1 s1Var, int i10) {
        super(0);
        this.f11071a = i10;
        this.f11072b = s1Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f11071a) {
            case 0:
                s1 s1Var = this.f11072b;
                Object objMo345y = s1Var.f15588a.mo345y();
                f0 f0Var = f0.PostExit;
                return Boolean.valueOf(objMo345y == f0Var && s1Var.f15591d.getValue() == f0Var);
            default:
                return Long.valueOf(this.f11072b.m6853b());
        }
    }
}
