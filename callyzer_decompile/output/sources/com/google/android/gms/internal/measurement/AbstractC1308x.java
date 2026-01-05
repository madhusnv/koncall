package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes.dex */
public abstract class AbstractC1308x implements IInterface {

    /* renamed from: e */
    public final /* synthetic */ int f6439e;

    /* renamed from: f */
    public final IBinder f6440f;

    /* renamed from: g */
    public final String f6441g;

    public /* synthetic */ AbstractC1308x(IBinder iBinder, String str, int i10) {
        this.f6439e = i10;
        this.f6440f = iBinder;
        this.f6441g = str;
    }

    /* renamed from: O */
    public Parcel m3748O(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6440f.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: P */
    public Parcel m3749P(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6440f.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: Q */
    public Parcel m3750Q() {
        switch (this.f6439e) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f6441g);
                return parcelObtain;
            case 3:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f6441g);
                return parcelObtain2;
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f6441g);
                return parcelObtain3;
        }
    }

    /* renamed from: R */
    public Parcel m3751R(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f6440f.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: S */
    public void m3752S(Parcel parcel, int i10) {
        Parcel parcelObtain;
        switch (this.f6439e) {
            case 0:
                parcelObtain = Parcel.obtain();
                try {
                    this.f6440f.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
            default:
                parcelObtain = Parcel.obtain();
                try {
                    this.f6440f.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                }
        }
    }

    /* renamed from: T */
    public void m3753T(Parcel parcel) {
        try {
            this.f6440f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f6439e) {
        }
        return this.f6440f;
    }

    /* renamed from: d */
    public void m3754d(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f6440f.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* renamed from: f */
    public Parcel m3755f() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f6441g);
        return parcelObtain;
    }

    /* renamed from: g */
    public void m3756g(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f6440f.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
