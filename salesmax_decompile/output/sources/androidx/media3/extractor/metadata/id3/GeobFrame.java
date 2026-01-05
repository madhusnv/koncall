package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C2246a();

    /* renamed from: b */
    public final String f8680b;

    /* renamed from: c */
    public final String f8681c;

    /* renamed from: d */
    public final String f8682d;

    /* renamed from: e */
    public final byte[] f8683e;

    /* renamed from: androidx.media3.extractor.metadata.id3.GeobFrame$a */
    public class C2246a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f8680b = str;
        this.f8681c = str2;
        this.f8682d = str3;
        this.f8683e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return sqi.m48724c(this.f8680b, geobFrame.f8680b) && sqi.m48724c(this.f8681c, geobFrame.f8681c) && sqi.m48724c(this.f8682d, geobFrame.f8682d) && Arrays.equals(this.f8683e, geobFrame.f8683e);
    }

    public int hashCode() {
        String str = this.f8680b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8681c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8682d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f8683e);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f8684a + ": mimeType=" + this.f8680b + ", filename=" + this.f8681c + ", description=" + this.f8682d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8680b);
        parcel.writeString(this.f8681c);
        parcel.writeString(this.f8682d);
        parcel.writeByteArray(this.f8683e);
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f8680b = (String) sqi.m48729h(parcel.readString());
        this.f8681c = (String) sqi.m48729h(parcel.readString());
        this.f8682d = (String) sqi.m48729h(parcel.readString());
        this.f8683e = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
