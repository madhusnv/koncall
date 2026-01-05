package uh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import th.BinderC7157g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.e */
/* loaded from: classes.dex */
public final class C7460e implements InterfaceC7462g, IInterface {

    /* renamed from: e */
    public final IBinder f36050e;

    public C7460e(IBinder iBinder) {
        this.f36050e = iBinder;
    }

    @Override // uh.InterfaceC7462g
    /* renamed from: K */
    public final void mo14271K(String str, Bundle bundle, BinderC7157g binderC7157g) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        parcelObtain.writeString(str);
        int i10 = AbstractC7459d.f36049a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(binderC7157g);
        try {
            this.f36050e.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f36050e;
    }
}
