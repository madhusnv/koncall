package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C2180a();

    /* renamed from: d */
    public static final String f7898d = sqi.B0(0);

    /* renamed from: e */
    public static final String f7899e = sqi.B0(1);

    /* renamed from: f */
    public static final String f7900f = sqi.B0(2);

    /* renamed from: a */
    public final int f7901a;

    /* renamed from: b */
    public final int f7902b;

    /* renamed from: c */
    public final int f7903c;

    /* renamed from: androidx.media3.common.StreamKey$a */
    public class C2180a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(int i, int i2, int i3) {
        this.f7901a = i;
        this.f7902b = i2;
        this.f7903c = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i = this.f7901a - streamKey.f7901a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f7902b - streamKey.f7902b;
        return i2 == 0 ? this.f7903c - streamKey.f7903c : i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f7901a == streamKey.f7901a && this.f7902b == streamKey.f7902b && this.f7903c == streamKey.f7903c;
    }

    public int hashCode() {
        return (((this.f7901a * 31) + this.f7902b) * 31) + this.f7903c;
    }

    public String toString() {
        return this.f7901a + "." + this.f7902b + "." + this.f7903c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7901a);
        parcel.writeInt(this.f7902b);
        parcel.writeInt(this.f7903c);
    }

    public StreamKey(Parcel parcel) {
        this.f7901a = parcel.readInt();
        this.f7902b = parcel.readInt();
        this.f7903c = parcel.readInt();
    }
}
