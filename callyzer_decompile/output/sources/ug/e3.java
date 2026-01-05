package ug;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC1309y;
import com.google.android.gms.internal.measurement.AbstractC1310z;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e3 extends AbstractBinderC1309y implements m0 {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f35378e;

    /* renamed from: f */
    public final /* synthetic */ k3 f35379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(k3 k3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f35378e = atomicReference;
        this.f35379f = k3Var;
    }

    @Override // ug.m0
    /* renamed from: L */
    public final void mo13873L(b4 b4Var) {
        AtomicReference atomicReference = this.f35378e;
        synchronized (atomicReference) {
            v0 v0Var = ((n1) this.f35379f.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35870p.m14141b(Integer.valueOf(b4Var.f35299a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(b4Var);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1309y
    /* renamed from: d */
    public final boolean mo3185d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        b4 b4Var = (b4) AbstractC1310z.m3795a(parcel, b4.CREATOR);
        AbstractC1310z.m3798d(parcel);
        mo13873L(b4Var);
        return true;
    }
}
