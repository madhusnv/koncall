package p003d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0220a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d.d */
/* loaded from: classes.dex */
public class C1543d implements Parcelable {
    public static final Parcelable.Creator<C1543d> CREATOR = new C0220a(17);

    /* renamed from: a */
    public InterfaceC1541b f7730a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f7730a == null) {
                    this.f7730a = new BinderC1542c(this);
                }
                parcel.writeStrongBinder(this.f7730a.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public void mo547a(int i10, Bundle bundle) {
    }
}
