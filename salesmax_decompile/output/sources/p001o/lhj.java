package p001o;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class lhj implements IInterface {

    /* renamed from: a */
    public final IBinder f33870a;

    /* renamed from: f */
    public final String f33871f = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    public lhj(IBinder iBinder, String str) {
        this.f33870a = iBinder;
    }

    public final Parcel L0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f33871f);
        return parcelObtain;
    }

    public final void M0(int i, Parcel parcel) {
        try {
            this.f33870a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f33870a;
    }
}
