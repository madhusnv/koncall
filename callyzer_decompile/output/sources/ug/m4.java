package ug;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m4 implements a2 {

    /* renamed from: a */
    public final com.google.android.gms.internal.measurement.r0 f35626a;

    /* renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f35627b;

    public m4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.r0 r0Var) {
        this.f35627b = appMeasurementDynamiteService;
        this.f35626a = r0Var;
    }

    @Override // ug.a2
    /* renamed from: a */
    public final void mo11106a(long j6, Bundle bundle, String str, String str2) {
        try {
            this.f35626a.mo3314q(j6, bundle, str, str2);
        } catch (RemoteException e2) {
            n1 n1Var = this.f35627b.f6714e;
            if (n1Var != null) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14141b(e2, "Event listener threw exception");
            }
        }
    }
}
