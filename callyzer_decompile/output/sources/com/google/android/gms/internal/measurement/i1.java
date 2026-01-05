package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import oi.C5388b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i1 extends AbstractBinderC1309y implements r0 {

    /* renamed from: e */
    public final C5388b f6242e;

    public i1(C5388b c5388b) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f6242e = c5388b;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    /* renamed from: c */
    public final int mo3313c() {
        return System.identityHashCode(this.f6242e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1309y
    /* renamed from: d */
    public final boolean mo3185d(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f6242e);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC1310z.m3795a(parcel, Bundle.CREATOR);
        long j6 = parcel.readLong();
        AbstractC1310z.m3798d(parcel);
        mo3314q(j6, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    /* renamed from: q */
    public final void mo3314q(long j6, Bundle bundle, String str, String str2) {
        this.f6242e.mo11106a(j6, bundle, str, str2);
    }
}
