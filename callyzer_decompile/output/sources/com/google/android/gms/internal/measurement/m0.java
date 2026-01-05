package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 extends AbstractC1308x implements n0 {
    public m0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    @Override // com.google.android.gms.internal.measurement.n0
    /* renamed from: E */
    public final void mo3311E(Bundle bundle) {
        Parcel parcelM3750Q = m3750Q();
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        m3752S(parcelM3750Q, 1);
    }
}
