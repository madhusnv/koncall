package rf;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.h0;
import nf.C5045g;
import qf.AbstractC6206e;
import qf.AbstractC6209h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.r */
/* loaded from: classes.dex */
public final class C6513r extends AbstractC6209h {

    /* renamed from: b */
    public final AbstractC6206e f31270b;

    public C6513r(AbstractC6206e abstractC6206e) {
        this.f31270b = abstractC6206e;
    }

    /* renamed from: a */
    public final C5045g m12543a(C5045g c5045g) {
        boolean z6 = true;
        if (!c5045g.f6021j && !((Boolean) BasePendingResult.f6012k.get()).booleanValue()) {
            z6 = false;
        }
        c5045g.f6021j = z6;
        AbstractC6206e abstractC6206e = this.f31270b;
        C6500e c6500e = abstractC6206e.f30196j;
        c6500e.getClass();
        C6518w c6518w = new C6518w(new C6521z(c5045g), c6500e.f31231j.get(), abstractC6206e);
        h0 h0Var = c6500e.f31236p;
        h0Var.sendMessage(h0Var.obtainMessage(4, c6518w));
        return c5045g;
    }
}
