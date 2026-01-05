package p001o;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import p001o.i68;

/* loaded from: classes2.dex */
public interface j68 extends IInterface {

    /* renamed from: o.j68$a */
    public static abstract class AbstractBinderC14459a extends Binder implements j68 {

        /* renamed from: o.j68$a$a */
        public static class a implements j68 {

            /* renamed from: f */
            public static j68 f29856f;

            /* renamed from: a */
            public IBinder f29857a;

            public a(IBinder iBinder) {
                this.f29857a = iBinder;
            }

            @Override // p001o.j68
            /* renamed from: L */
            public boolean mo4491L(i68 i68Var) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(i68Var != null ? i68Var.asBinder() : null);
                    if (!this.f29857a.transact(3, parcelObtain, parcelObtain2, 0) && AbstractBinderC14459a.M0() != null) {
                        return AbstractBinderC14459a.M0().mo4491L(i68Var);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p001o.j68
            /* renamed from: U */
            public boolean mo4492U(i68 i68Var, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(i68Var != null ? i68Var.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeTypedList(list);
                    if (!this.f29857a.transact(4, parcelObtain, parcelObtain2, 0) && AbstractBinderC14459a.M0() != null) {
                        return AbstractBinderC14459a.M0().mo4492U(i68Var, uri, bundle, list);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f29857a;
            }

            @Override // p001o.j68
            public boolean k0(i68 i68Var, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(i68Var != null ? i68Var.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f29857a.transact(10, parcelObtain, parcelObtain2, 0) && AbstractBinderC14459a.M0() != null) {
                        return AbstractBinderC14459a.M0().k0(i68Var, bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p001o.j68
            public boolean q0(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j);
                    if (!this.f29857a.transact(2, parcelObtain, parcelObtain2, 0) && AbstractBinderC14459a.M0() != null) {
                        return AbstractBinderC14459a.M0().q0(j);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC14459a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        public static j68 L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j68)) ? new a(iBinder) : (j68) iInterfaceQueryLocalInterface;
        }

        public static j68 M0() {
            return a.f29856f;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsService");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zQ0 = q0(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ0 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo4491L = mo4491L(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo4491L ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo4492U = mo4492U(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo4492U ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    Bundle bundleMo4494s = mo4494s(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleMo4494s != null) {
                        parcel2.writeInt(1);
                        bundleMo4494s.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zL0 = l0(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zL0 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo4495y = mo4495y(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo4495y ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    int iMo4489C = mo4489C(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(iMo4489C);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zA0 = A0(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zA0 ? 1 : 0);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zK0 = k0(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zK0 ? 1 : 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo4490D = mo4490D(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo4490D ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                    boolean zMo4493V = mo4493V(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zMo4493V ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    boolean A0(i68 i68Var, int i, Uri uri, Bundle bundle);

    /* renamed from: C */
    int mo4489C(i68 i68Var, String str, Bundle bundle);

    /* renamed from: D */
    boolean mo4490D(i68 i68Var, Uri uri, Bundle bundle);

    /* renamed from: L */
    boolean mo4491L(i68 i68Var);

    /* renamed from: U */
    boolean mo4492U(i68 i68Var, Uri uri, Bundle bundle, List list);

    /* renamed from: V */
    boolean mo4493V(i68 i68Var, Uri uri, int i, Bundle bundle);

    boolean k0(i68 i68Var, Bundle bundle);

    boolean l0(i68 i68Var, Bundle bundle);

    boolean q0(long j);

    /* renamed from: s */
    Bundle mo4494s(String str, Bundle bundle);

    /* renamed from: y */
    boolean mo4495y(i68 i68Var, Uri uri);
}
