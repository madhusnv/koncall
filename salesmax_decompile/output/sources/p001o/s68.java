package p001o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public interface s68 extends IInterface {

    /* renamed from: o.s68$a */
    public static abstract class AbstractBinderC16758a extends Binder implements s68 {

        /* renamed from: o.s68$a$a */
        public static class a implements s68 {

            /* renamed from: a */
            public IBinder f44873a;

            public a(IBinder iBinder) {
                this.f44873a = iBinder;
            }

            @Override // p001o.s68
            /* renamed from: a */
            public int mo47905a(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    C16759b.m47907b(parcelObtain, bundle, 0);
                    this.f44873a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f44873a;
            }
        }

        public static s68 L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s68)) ? new a(iBinder) : (s68) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: o.s68$b */
    public static class C16759b {
        /* renamed from: b */
        public static void m47907b(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: a */
    int mo47905a(Bundle bundle);
}
