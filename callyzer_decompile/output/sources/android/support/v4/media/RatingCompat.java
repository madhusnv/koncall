package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0220a(3);

    /* renamed from: a */
    public final int f1645a;

    /* renamed from: b */
    public final float f1646b;

    public RatingCompat(float f6, int i10) {
        this.f1645a = i10;
        this.f1646b = f6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f1645a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f1645a);
        sb2.append(" rating=");
        float f6 = this.f1646b;
        sb2.append(f6 < DefinitionKt.NO_Float_VALUE ? "unrated" : String.valueOf(f6));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1645a);
        parcel.writeFloat(this.f1646b);
    }
}
