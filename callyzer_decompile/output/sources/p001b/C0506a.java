package p001b;

import android.os.IBinder;
import android.os.Parcel;
import p017s.BinderC6692a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C0506a implements InterfaceC0508c {

    /* renamed from: e */
    public IBinder f3564e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3564e;
    }

    /* renamed from: d */
    public final boolean m1504d(BinderC6692a binderC6692a) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeStrongBinder(binderC6692a);
            if (!this.f3564e.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i10 = AbstractBinderC0507b.f3565e;
            }
            parcelObtain2.readException();
            boolean z6 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z6;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    /* renamed from: f */
    public final boolean m1505f() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            parcelObtain.writeLong(0L);
            if (!this.f3564e.transact(2, parcelObtain, parcelObtain2, 0)) {
                int i10 = AbstractBinderC0507b.f3565e;
            }
            parcelObtain2.readException();
            boolean z6 = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z6;
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }
}
