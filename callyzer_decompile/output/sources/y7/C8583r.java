package y7;

import android.os.Parcel;
import android.os.Parcelable;
import wg.C8034g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.r */
/* loaded from: classes.dex */
public final class C8583r implements Parcelable {
    public static final Parcelable.Creator<C8583r> CREATOR = new C8034g(3);

    /* renamed from: a */
    public int f41765a;

    /* renamed from: b */
    public int f41766b;

    /* renamed from: c */
    public boolean f41767c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41765a);
        parcel.writeInt(this.f41766b);
        parcel.writeInt(this.f41767c ? 1 : 0);
    }
}
