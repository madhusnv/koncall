package sf;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.v */
/* loaded from: classes.dex */
public final class C6836v implements IInterface {

    /* renamed from: e */
    public final IBinder f32498e;

    public C6836v(IBinder iBinder) {
        this.f32498e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32498e;
    }

    /* renamed from: d */
    public final void m13028d(b0 b0Var, C6821g c6821g) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(b0Var);
            parcelObtain.writeInt(1);
            g0.m13011a(c6821g, parcelObtain, 0);
            this.f32498e.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
