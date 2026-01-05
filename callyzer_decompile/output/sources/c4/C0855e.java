package c4;

import android.os.CancellationSignal;
import b2.y0;
import g4.n0;
import tx.s1;
import x1.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c4.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0855e implements CancellationSignal.OnCancelListener {

    /* renamed from: a */
    public final /* synthetic */ int f5389a;

    /* renamed from: b */
    public final /* synthetic */ Object f5390b;

    public /* synthetic */ C0855e(int i10, Object obj) {
        this.f5389a = i10;
        this.f5390b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        switch (this.f5389a) {
            case 0:
                ((s1) this.f5390b).mo13510j(null);
                break;
            default:
                y0 y0Var = (y0) this.f5390b;
                if (y0Var != null) {
                    v0 v0Var = y0Var.f3869d;
                    if (v0Var != null) {
                        v0Var.m15481e(n0.f13684b);
                    }
                    v0 v0Var2 = y0Var.f3869d;
                    if (v0Var2 != null) {
                        v0Var2.m15482f(n0.f13684b);
                        break;
                    }
                }
                break;
        }
    }
}
