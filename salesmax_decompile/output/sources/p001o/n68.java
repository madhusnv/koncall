package p001o;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public interface n68 extends IInterface {

    /* renamed from: c */
    public static final String f36438c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: o.n68$a */
    public static abstract class AbstractBinderC15509a extends Binder implements n68 {

        /* renamed from: o.n68$a$a */
        public static class a implements n68 {

            /* renamed from: a */
            public IBinder f36439a;

            public a(IBinder iBinder) {
                this.f36439a = iBinder;
            }

            @Override // p001o.n68
            public void I0(String str, int i, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(n68.f36438c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    C15510b.m40141b(parcelObtain, notification, 0);
                    this.f36439a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f36439a;
            }
        }

        public static n68 L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(n68.f36438c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof n68)) ? new a(iBinder) : (n68) iInterfaceQueryLocalInterface;
        }
    }

    /* renamed from: o.n68$b */
    public static class C15510b {
        /* renamed from: b */
        public static void m40141b(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    void I0(String str, int i, String str2, Notification notification);
}
