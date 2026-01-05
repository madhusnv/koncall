package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import p001o.op0;
import p001o.s37;

/* loaded from: classes2.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new C2184a();

    /* renamed from: a */
    public final float f8080a;

    /* renamed from: b */
    public final float f8081b;

    /* renamed from: androidx.media3.container.Mp4LocationData$a */
    public class C2184a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mp4LocationData createFromParcel(Parcel parcel) {
            return new Mp4LocationData(parcel, (C2184a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mp4LocationData[] newArray(int i) {
            return new Mp4LocationData[i];
        }
    }

    public /* synthetic */ Mp4LocationData(Parcel parcel, C2184a c2184a) {
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
        if (obj == null || Mp4LocationData.class != obj.getClass()) {
            return false;
        }
        Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
        return this.f8080a == mp4LocationData.f8080a && this.f8081b == mp4LocationData.f8081b;
    }

    public int hashCode() {
        return ((527 + s37.m47564a(this.f8080a)) * 31) + s37.m47564a(this.f8081b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f8080a + ", longitude=" + this.f8081b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f8080a);
        parcel.writeFloat(this.f8081b);
    }

    public Mp4LocationData(float f, float f2) {
        op0.m42512b(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.f8080a = f;
        this.f8081b = f2;
    }

    public Mp4LocationData(Parcel parcel) {
        this.f8080a = parcel.readFloat();
        this.f8081b = parcel.readFloat();
    }
}
