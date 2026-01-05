package g2;

import ex.InterfaceC2139c;
import h2.AbstractC2808m;
import h2.C2807l;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4266h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a3 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11159a;

    /* renamed from: b */
    public final /* synthetic */ h4 f11160b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(h4 h4Var, int i10) {
        super(1);
        this.f11159a = i10;
        this.f11160b = h4Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f11159a) {
            case 0:
                int i10 = ((a5) obj).f11169a;
                h4 h4Var = this.f11160b;
                Long lM6170e = h4Var.m6170e();
                if (lM6170e != null) {
                    h4Var.m6140c(((AbstractC2808m) h4Var.f11536b).mo6902f(lM6170e.longValue()).f15751e);
                }
                h4Var.f11719f.setValue(new a5(i10));
                return qw.a0.f30746a;
            case 1:
                Long l9 = (Long) obj;
                h4 h4Var2 = this.f11160b;
                k2.e1 e1Var = h4Var2.f11718e;
                C4266h c4266h = (C4266h) h4Var2.f11535a;
                if (l9 != null) {
                    C2807l c2807lMo6898b = ((AbstractC2808m) h4Var2.f11536b).mo6898b(l9.longValue());
                    int i11 = c2807lMo6898b.f15724a;
                    if (!c4266h.m8986h(i11)) {
                        throw new IllegalArgumentException(("The provided date's year (" + i11 + ") is out of the years range of " + c4266h + '.').toString());
                    }
                    e1Var.setValue(c2807lMo6898b);
                } else {
                    e1Var.setValue(null);
                }
                return qw.a0.f30746a;
            default:
                this.f11160b.m6140c(((Number) obj).longValue());
                return qw.a0.f30746a;
        }
    }
}
