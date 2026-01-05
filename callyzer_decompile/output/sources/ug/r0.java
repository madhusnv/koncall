package ug;

import android.os.IBinder;
import android.os.IInterface;
import sf.AbstractC6819e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 extends AbstractC6819e {
    @Override // sf.AbstractC6819e, qf.InterfaceC6204c
    /* renamed from: i */
    public final int mo7588i() {
        return 12451000;
    }

    @Override // sf.AbstractC6819e
    /* renamed from: o */
    public final /* synthetic */ IInterface mo7589o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(iBinder);
    }

    @Override // sf.AbstractC6819e
    /* renamed from: u */
    public final String mo7592u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // sf.AbstractC6819e
    /* renamed from: v */
    public final String mo7593v() {
        return "com.google.android.gms.measurement.START";
    }
}
