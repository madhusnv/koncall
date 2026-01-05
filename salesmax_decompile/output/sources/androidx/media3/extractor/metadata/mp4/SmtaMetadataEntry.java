package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import p001o.s37;

/* loaded from: classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C2255a();

    /* renamed from: a */
    public final float f8710a;

    /* renamed from: b */
    public final int f8711b;

    /* renamed from: androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry$a */
    public class C2255a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (C2255a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, C2255a c2255a) {
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
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f8710a == smtaMetadataEntry.f8710a && this.f8711b == smtaMetadataEntry.f8711b;
    }

    public int hashCode() {
        return ((527 + s37.m47564a(this.f8710a)) * 31) + this.f8711b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f8710a + ", svcTemporalLayerCount=" + this.f8711b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f8710a);
        parcel.writeInt(this.f8711b);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.f8710a = f;
        this.f8711b = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f8710a = parcel.readFloat();
        this.f8711b = parcel.readInt();
    }
}
