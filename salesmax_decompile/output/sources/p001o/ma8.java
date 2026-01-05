package p001o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface ma8 extends IInterface {

    /* renamed from: o.ma8$a */
    public static abstract class AbstractBinderC15260a extends Binder implements ma8 {
        public AbstractBinderC15260a() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 9) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                Bundle bundleMo4507B = mo4507B(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
                parcel2.writeNoException();
                if (bundleMo4507B != null) {
                    parcel2.writeInt(1);
                    bundleMo4507B.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityService");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo4509Q = mo4509Q(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo4509Q != null) {
                        parcel2.writeInt(1);
                        bundleMo4509Q.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    z0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    int iV0 = v0();
                    parcel2.writeNoException();
                    parcel2.writeInt(iV0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleH0 = h0();
                    parcel2.writeNoException();
                    if (bundleH0 != null) {
                        parcel2.writeInt(1);
                        bundleH0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleW0 = w0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleW0 != null) {
                        parcel2.writeInt(1);
                        bundleW0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
                    Bundle bundleMo4508H = mo4508H();
                    parcel2.writeNoException();
                    if (bundleMo4508H != null) {
                        parcel2.writeInt(1);
                        bundleMo4508H.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: B */
    Bundle mo4507B(String str, Bundle bundle, IBinder iBinder);

    /* renamed from: H */
    Bundle mo4508H();

    /* renamed from: Q */
    Bundle mo4509Q(Bundle bundle);

    Bundle h0();

    int v0();

    Bundle w0(Bundle bundle);

    void z0(Bundle bundle);
}
