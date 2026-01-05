package p017s;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s.a */
/* loaded from: classes.dex */
public final class BinderC6692a extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
            return true;
        }
        switch (i10) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel.readInt();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
