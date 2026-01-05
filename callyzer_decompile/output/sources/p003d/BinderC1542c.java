package p003d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d.c */
/* loaded from: classes.dex */
public final class BinderC1542c extends Binder implements InterfaceC1541b {

    /* renamed from: f */
    public static final /* synthetic */ int f7728f = 0;

    /* renamed from: e */
    public final /* synthetic */ C1543d f7729e;

    public BinderC1542c(C1543d c1543d) {
        this.f7729e = c1543d;
        attachInterface(this, InterfaceC1541b.f7727b);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        String str = InterfaceC1541b.f7727b;
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i10 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        this.f7729e.mo547a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
