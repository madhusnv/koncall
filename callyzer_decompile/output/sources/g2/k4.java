package g2;

import ex.InterfaceC2139c;
import h2.AbstractC2808m;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k4 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11907a;

    /* renamed from: b */
    public final /* synthetic */ v4 f11908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4(v4 v4Var, int i10) {
        super(1);
        this.f11907a = i10;
        this.f11908b = v4Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11907a) {
            case 0:
                int i10 = ((a5) obj).f11169a;
                v4 v4Var = this.f11908b;
                Long lM6331f = v4Var.m6331f();
                if (lM6331f != null) {
                    v4Var.m6140c(((AbstractC2808m) v4Var.f11536b).mo6902f(lM6331f.longValue()).f15751e);
                }
                v4Var.f12986g.setValue(new a5(i10));
                break;
            default:
                this.f11908b.m6140c(((Number) obj).longValue());
                break;
        }
        return qw.a0.f30746a;
    }
}
