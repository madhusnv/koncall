package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends AbstractC1308x implements r0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    /* renamed from: c */
    public final int mo3313c() {
        Parcel parcelM3749P = m3749P(m3750Q(), 2);
        int i10 = parcelM3749P.readInt();
        parcelM3749P.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    /* renamed from: q */
    public final void mo3314q(long j6, Bundle bundle, String str, String str2) {
        Parcel parcelM3750Q = m3750Q();
        parcelM3750Q.writeString(str);
        parcelM3750Q.writeString(str2);
        AbstractC1310z.m3796b(parcelM3750Q, bundle);
        parcelM3750Q.writeLong(j6);
        m3752S(parcelM3750Q, 1);
    }
}
