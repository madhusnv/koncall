package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C2245a();

    /* renamed from: b */
    public final String f8677b;

    /* renamed from: c */
    public final String f8678c;

    /* renamed from: d */
    public final String f8679d;

    /* renamed from: androidx.media3.extractor.metadata.id3.CommentFrame$a */
    public class C2245a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f8677b = str;
        this.f8678c = str2;
        this.f8679d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return sqi.m48724c(this.f8678c, commentFrame.f8678c) && sqi.m48724c(this.f8677b, commentFrame.f8677b) && sqi.m48724c(this.f8679d, commentFrame.f8679d);
    }

    public int hashCode() {
        String str = this.f8677b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8678c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8679d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f8684a + ": language=" + this.f8677b + ", description=" + this.f8678c + ", text=" + this.f8679d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8684a);
        parcel.writeString(this.f8677b);
        parcel.writeString(this.f8679d);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f8677b = (String) sqi.m48729h(parcel.readString());
        this.f8678c = (String) sqi.m48729h(parcel.readString());
        this.f8679d = (String) sqi.m48729h(parcel.readString());
    }
}
