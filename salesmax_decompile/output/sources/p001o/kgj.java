package p001o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class kgj implements IInterface {

    /* renamed from: a */
    public final IBinder f32242a;

    /* renamed from: f */
    public final String f32243f = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public kgj(IBinder iBinder) {
        this.f32242a = iBinder;
    }

    public final Parcel L0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f32243f);
        return parcelObtain;
    }

    public final Parcel M0(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f32242a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32242a;
    }
}
