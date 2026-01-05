package y7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import wg.C8034g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 implements Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new C8034g(4);

    /* renamed from: a */
    public int f41835a;

    /* renamed from: b */
    public int f41836b;

    /* renamed from: c */
    public int[] f41837c;

    /* renamed from: d */
    public boolean f41838d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f41835a + ", mGapDir=" + this.f41836b + ", mHasUnwantedGapAfter=" + this.f41838d + ", mGapPerSpan=" + Arrays.toString(this.f41837c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f41835a);
        parcel.writeInt(this.f41836b);
        parcel.writeInt(this.f41838d ? 1 : 0);
        int[] iArr = this.f41837c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f41837c);
        }
    }
}
