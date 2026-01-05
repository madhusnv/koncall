package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import p001o.tla;

/* loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new C2252a();

    /* renamed from: a */
    public final long f8700a;

    /* renamed from: b */
    public final long f8701b;

    /* renamed from: c */
    public final long f8702c;

    /* renamed from: d */
    public final long f8703d;

    /* renamed from: e */
    public final long f8704e;

    /* renamed from: androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata$a */
    public class C2252a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    }

    public /* synthetic */ MotionPhotoMetadata(Parcel parcel, C2252a c2252a) {
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f8700a == motionPhotoMetadata.f8700a && this.f8701b == motionPhotoMetadata.f8701b && this.f8702c == motionPhotoMetadata.f8702c && this.f8703d == motionPhotoMetadata.f8703d && this.f8704e == motionPhotoMetadata.f8704e;
    }

    public int hashCode() {
        return ((((((((527 + tla.m50160b(this.f8700a)) * 31) + tla.m50160b(this.f8701b)) * 31) + tla.m50160b(this.f8702c)) * 31) + tla.m50160b(this.f8703d)) * 31) + tla.m50160b(this.f8704e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8700a + ", photoSize=" + this.f8701b + ", photoPresentationTimestampUs=" + this.f8702c + ", videoStartPosition=" + this.f8703d + ", videoSize=" + this.f8704e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8700a);
        parcel.writeLong(this.f8701b);
        parcel.writeLong(this.f8702c);
        parcel.writeLong(this.f8703d);
        parcel.writeLong(this.f8704e);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f8700a = j;
        this.f8701b = j2;
        this.f8702c = j3;
        this.f8703d = j4;
        this.f8704e = j5;
    }

    public MotionPhotoMetadata(Parcel parcel) {
        this.f8700a = parcel.readLong();
        this.f8701b = parcel.readLong();
        this.f8702c = parcel.readLong();
        this.f8703d = parcel.readLong();
        this.f8704e = parcel.readLong();
    }
}
