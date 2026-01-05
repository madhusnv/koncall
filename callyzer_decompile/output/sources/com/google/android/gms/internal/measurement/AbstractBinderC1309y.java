package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.y */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1309y extends Binder implements IInterface {
    public AbstractBinderC1309y(String str) {
        attachInterface(this, str);
    }

    /* renamed from: d */
    public abstract boolean mo3185d(int i10, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return mo3185d(i10, parcel, parcel2);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
