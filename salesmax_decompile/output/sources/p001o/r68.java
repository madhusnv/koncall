package p001o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p001o.i68;

/* loaded from: classes2.dex */
public interface r68 extends IInterface {

    /* renamed from: o.r68$a */
    public static abstract class AbstractBinderC16545a extends Binder implements r68 {
        public AbstractBinderC16545a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 2) {
                parcel.enforceInterface("android.support.customtabs.IPostMessageService");
                F0(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("android.support.customtabs.IPostMessageService");
                return true;
            }
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            mo4496d(i68.AbstractBinderC14199a.L0(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void F0(i68 i68Var, Bundle bundle);

    /* renamed from: d */
    void mo4496d(i68 i68Var, String str, Bundle bundle);
}
