package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C2247a();

    /* renamed from: b */
    public final String f8685b;

    /* renamed from: c */
    public final String f8686c;

    /* renamed from: d */
    public final String f8687d;

    /* renamed from: androidx.media3.extractor.metadata.id3.InternalFrame$a */
    public class C2247a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f8685b = str;
        this.f8686c = str2;
        this.f8687d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return sqi.m48724c(this.f8686c, internalFrame.f8686c) && sqi.m48724c(this.f8685b, internalFrame.f8685b) && sqi.m48724c(this.f8687d, internalFrame.f8687d);
    }

    public int hashCode() {
        String str = this.f8685b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8686c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8687d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f8684a + ": domain=" + this.f8685b + ", description=" + this.f8686c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8684a);
        parcel.writeString(this.f8685b);
        parcel.writeString(this.f8687d);
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f8685b = (String) sqi.m48729h(parcel.readString());
        this.f8686c = (String) sqi.m48729h(parcel.readString());
        this.f8687d = (String) sqi.m48729h(parcel.readString());
    }
}
