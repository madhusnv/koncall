package s1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s1.e */
/* loaded from: classes.dex */
public final class C6710e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C6711f(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new C6711f[i10];
    }
}
