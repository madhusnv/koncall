package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C2251a();

    /* renamed from: b */
    public final String f8698b;

    /* renamed from: c */
    public final String f8699c;

    /* renamed from: androidx.media3.extractor.metadata.id3.UrlLinkFrame$a */
    public class C2251a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f8698b = str2;
        this.f8699c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f8684a.equals(urlLinkFrame.f8684a) && sqi.m48724c(this.f8698b, urlLinkFrame.f8698b) && sqi.m48724c(this.f8699c, urlLinkFrame.f8699c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f8684a.hashCode()) * 31;
        String str = this.f8698b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8699c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f8684a + ": url=" + this.f8699c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8684a);
        parcel.writeString(this.f8698b);
        parcel.writeString(this.f8699c);
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) sqi.m48729h(parcel.readString()));
        this.f8698b = parcel.readString();
        this.f8699c = (String) sqi.m48729h(parcel.readString());
    }
}
