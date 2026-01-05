package fg;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import mg.AbstractC4732k;
import mm.AbstractC4801l;
import og.de;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fg.b */
/* loaded from: classes.dex */
public final class BinderC2285b extends Binder implements IInterface {

    /* renamed from: e */
    public final /* synthetic */ C8650g f10316e;

    public BinderC2285b(C8650g c8650g) {
        this.f10316e = c8650g;
        attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i12 = AbstractC4732k.f23658a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC4801l.m9730d(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        de.m10609a(statusCreateFromParcel, pendingIntent, this.f10316e);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
