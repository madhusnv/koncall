package ug;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC1309y;
import com.google.android.gms.internal.measurement.AbstractC1310z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d3 extends AbstractBinderC1309y implements k0 {

    /* renamed from: e */
    public final /* synthetic */ AtomicReference f35352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(k3 k3Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f35352e = atomicReference;
    }

    @Override // ug.k0
    /* renamed from: M */
    public final void mo13869M(List list) {
        AtomicReference atomicReference = this.f35352e;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1309y
    /* renamed from: d */
    public final boolean mo3185d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(w3.CREATOR);
        AbstractC1310z.m3798d(parcel);
        mo13869M(arrayListCreateTypedArrayList);
        return true;
    }
}
