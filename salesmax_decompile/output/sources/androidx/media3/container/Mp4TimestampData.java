package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import p001o.tla;

/* loaded from: classes2.dex */
public final class Mp4TimestampData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4TimestampData> CREATOR = new C2186a();

    /* renamed from: a */
    public final long f8083a;

    /* renamed from: b */
    public final long f8084b;

    /* renamed from: c */
    public final long f8085c;

    /* renamed from: androidx.media3.container.Mp4TimestampData$a */
    public class C2186a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mp4TimestampData createFromParcel(Parcel parcel) {
            return new Mp4TimestampData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mp4TimestampData[] newArray(int i) {
            return new Mp4TimestampData[i];
        }
    }

    public /* synthetic */ Mp4TimestampData(Parcel parcel, C2186a c2186a) {
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
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.f8083a == mp4TimestampData.f8083a && this.f8084b == mp4TimestampData.f8084b && this.f8085c == mp4TimestampData.f8085c;
    }

    public int hashCode() {
        return ((((527 + tla.m50160b(this.f8083a)) * 31) + tla.m50160b(this.f8084b)) * 31) + tla.m50160b(this.f8085c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f8083a + ", modification time=" + this.f8084b + ", timescale=" + this.f8085c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8083a);
        parcel.writeLong(this.f8084b);
        parcel.writeLong(this.f8085c);
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.f8083a = j;
        this.f8084b = j2;
        this.f8085c = j3;
    }

    public Mp4TimestampData(Parcel parcel) {
        this.f8083a = parcel.readLong();
        this.f8084b = parcel.readLong();
        this.f8085c = parcel.readLong();
    }
}
