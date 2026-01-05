package k2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f20636a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f20636a) {
            case 0:
                return new a1(parcel.readFloat());
            case 1:
                return new b1(parcel.readInt());
            default:
                return new c1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f20636a) {
            case 0:
                return new a1[i10];
            case 1:
                return new b1[i10];
            default:
                return new c1[i10];
        }
    }
}
