package hg;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hg.b */
/* loaded from: classes.dex */
public final class C2921b implements InterfaceC2923d, IInterface {

    /* renamed from: e */
    public final IBinder f15953e;

    public C2921b(IBinder iBinder) {
        this.f15953e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15953e;
    }

    /* renamed from: d */
    public final Parcel m7027d(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f15953e.transact(i10, parcel, parcelObtain, 0);
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
}
