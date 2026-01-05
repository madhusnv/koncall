package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

/* loaded from: classes2.dex */
public final class Mp4OrientationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4OrientationData> CREATOR = new C2185a();

    /* renamed from: a */
    public final int f8082a;

    /* renamed from: androidx.media3.container.Mp4OrientationData$a */
    public class C2185a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mp4OrientationData createFromParcel(Parcel parcel) {
            return new Mp4OrientationData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mp4OrientationData[] newArray(int i) {
            return new Mp4OrientationData[i];
        }
    }

    public /* synthetic */ Mp4OrientationData(Parcel parcel, C2185a c2185a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mp4OrientationData) && this.f8082a == ((Mp4OrientationData) obj).f8082a;
    }

    public int hashCode() {
        return 527 + Integer.hashCode(this.f8082a);
    }

    public String toString() {
        return "Orientation= " + this.f8082a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8082a);
    }

    public Mp4OrientationData(Parcel parcel) {
        this.f8082a = parcel.readInt();
    }
}
