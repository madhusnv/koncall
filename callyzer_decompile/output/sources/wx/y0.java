package wx;

import kotlin.jvm.internal.AbstractC4154l;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y0 implements tx.o0 {

    /* renamed from: a */
    public final b1 f39351a;

    /* renamed from: b */
    public final long f39352b;

    /* renamed from: c */
    public final Object f39353c;

    /* renamed from: d */
    public final C7251k f39354d;

    public y0(b1 b1Var, long j6, Object obj, C7251k c7251k) {
        this.f39351a = b1Var;
        this.f39352b = j6;
        this.f39353c = obj;
        this.f39354d = c7251k;
    }

    @Override // tx.o0
    public final void dispose() {
        b1 b1Var = this.f39351a;
        synchronized (b1Var) {
            if (this.f39352b < b1Var.m15361o()) {
                return;
            }
            Object[] objArr = b1Var.f39188h;
            AbstractC4154l.m8920c(objArr);
            long j6 = this.f39352b;
            if (objArr[((int) j6) & (objArr.length - 1)] != this) {
                return;
            }
            c1.m15375f(objArr, j6, c1.f39197a);
            b1Var.m15357j();
        }
    }
}
