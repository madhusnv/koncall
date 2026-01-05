package p001o;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface i68 extends IInterface {

    /* renamed from: o.i68$a */
    public static abstract class AbstractBinderC14199a extends Binder implements i68 {

        /* renamed from: o.i68$a$a */
        public static class a implements i68 {

            /* renamed from: f */
            public static i68 f28156f;

            /* renamed from: a */
            public IBinder f28157a;

            public a(IBinder iBinder) {
                this.f28157a = iBinder;
            }

            @Override // p001o.i68
            public void C0(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f28157a.transact(2, parcelObtain, parcelObtain2, 0) || AbstractBinderC14199a.M0() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC14199a.M0().C0(i, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p001o.i68
            public void G0(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f28157a.transact(5, parcelObtain, parcelObtain2, 0) || AbstractBinderC14199a.M0() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC14199a.M0().G0(str, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p001o.i68
            public void H0(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f28157a.transact(4, parcelObtain, parcelObtain2, 0) || AbstractBinderC14199a.M0() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC14199a.M0().H0(bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p001o.i68
            public void J0(int i, Uri uri, boolean z, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeInt(i);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(z ? 1 : 0);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f28157a.transact(6, parcelObtain, parcelObtain2, 0) || AbstractBinderC14199a.M0() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC14199a.M0().J0(i, uri, z, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p001o.i68
            /* renamed from: M */
            public void mo26741M(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f28157a.transact(3, parcelObtain, parcelObtain2, 0) || AbstractBinderC14199a.M0() == null) {
                        parcelObtain2.readException();
                    } else {
                        AbstractBinderC14199a.M0().mo26741M(str, bundle);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f28157a;
            }

            @Override // p001o.i68
            /* renamed from: e */
            public Bundle mo26742e(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f28157a.transact(7, parcelObtain, parcelObtain2, 0) && AbstractBinderC14199a.M0() != null) {
                        return AbstractBinderC14199a.M0().mo26742e(str, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC14199a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        public static i68 L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i68)) ? new a(iBinder) : (i68) iInterfaceQueryLocalInterface;
        }

        public static i68 M0() {
            return a.f28156f;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    C0(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo26741M(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    H0(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    G0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    J0(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    Bundle bundleMo26742e = mo26742e(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo26742e != null) {
                        parcel2.writeInt(1);
                        bundleMo26742e.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void C0(int i, Bundle bundle);

    void G0(String str, Bundle bundle);

    void H0(Bundle bundle);

    void J0(int i, Uri uri, boolean z, Bundle bundle);

    /* renamed from: M */
    void mo26741M(String str, Bundle bundle);

    /* renamed from: e */
    Bundle mo26742e(String str, Bundle bundle);
}
