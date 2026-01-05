package h1;

import ex.InterfaceC2139c;
import gx.AbstractC2747a;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4266h;
import pg.w9;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15550a;

    /* renamed from: b */
    public final /* synthetic */ x0 f15551b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(x0 x0Var, int i10) {
        super(1);
        this.f15550a = i10;
        this.f15551b = x0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f15550a) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                x0 x0Var = this.f15551b;
                long j6 = jLongValue - x0Var.f15655m;
                x0Var.f15655m = jLongValue;
                long jM6748l = AbstractC2747a.m6748l(j6 / x0Var.f15659r);
                e1.e0 e0Var = x0Var.f15656n;
                if (e0Var.m5550h()) {
                    Object[] objArr = e0Var.f8956a;
                    int i10 = e0Var.f8957b;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        p0 p0Var = (p0) objArr[i12];
                        x0.m6874O(x0Var, p0Var, jM6748l);
                        p0Var.f15529c = true;
                    }
                    s1 s1Var = x0Var.f15648e;
                    if (s1Var != null) {
                        s1Var.m6866o();
                    }
                    int i13 = e0Var.f8957b;
                    Object[] objArr2 = e0Var.f8956a;
                    C4266h c4266hM11919j = w9.m11919j(0, i13);
                    int i14 = c4266hM11919j.f21646a;
                    int i15 = c4266hM11919j.f21647b;
                    if (i14 <= i15) {
                        while (true) {
                            objArr2[i14 - i11] = objArr2[i14];
                            if (((p0) objArr2[i14]).f15529c) {
                                i11++;
                            }
                            if (i14 != i15) {
                                i14++;
                            }
                        }
                    }
                    AbstractC6662l.m12726p(objArr2, i13 - i11, i13, null);
                    e0Var.f8957b -= i11;
                }
                p0 p0Var2 = x0Var.f15657p;
                if (p0Var2 != null) {
                    p0Var2.f15533g = x0Var.f15649f;
                    x0.m6874O(x0Var, p0Var2, jM6748l);
                    x0Var.m6882W(p0Var2.f15530d);
                    if (p0Var2.f15530d == 1.0f) {
                        x0Var.f15657p = null;
                    }
                    x0Var.m6881V();
                }
                break;
            default:
                this.f15551b.f15655m = ((Number) obj).longValue();
                break;
        }
        return qw.a0.f30746a;
    }
}
