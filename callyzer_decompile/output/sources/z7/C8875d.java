package z7;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.d */
/* loaded from: classes.dex */
public final class C8875d implements InterfaceC8876e {

    /* renamed from: e */
    public IBinder f42720e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f42720e;
    }

    @Override // z7.InterfaceC8876e
    /* renamed from: m */
    public final void mo16375m(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC8876e.f42721c);
            parcelObtain.writeStringArray(strArr);
            this.f42720e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
