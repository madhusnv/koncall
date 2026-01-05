package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.os.a */
/* loaded from: classes2.dex */
public interface InterfaceC1738a extends IInterface {

    /* renamed from: b */
    public static final String f5245b = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: android.support.v4.os.a$a */
    public static abstract class a extends Binder implements InterfaceC1738a {

        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C19552a implements InterfaceC1738a {

            /* renamed from: a */
            public IBinder f5246a;

            public C19552a(IBinder iBinder) {
                this.f5246a = iBinder;
            }

            @Override // android.support.v4.os.InterfaceC1738a
            /* renamed from: Z */
            public void mo3706Z(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1738a.f5245b);
                    parcelObtain.writeInt(i);
                    b.m3710d(parcelObtain, bundle, 0);
                    this.f5246a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5246a;
            }
        }

        public a() {
            attachInterface(this, InterfaceC1738a.f5245b);
        }

        public static InterfaceC1738a L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1738a.f5245b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1738a)) ? new C19552a(iBinder) : (InterfaceC1738a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = InterfaceC1738a.f5245b;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo3706Z(parcel.readInt(), (Bundle) b.m3709c(parcel, Bundle.CREATOR));
            return true;
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    public static class b {
        /* renamed from: c */
        public static Object m3709c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* renamed from: d */
        public static void m3710d(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: Z */
    void mo3706Z(int i, Bundle bundle);
}
