package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2182b;
import androidx.media3.common.Metadata;
import p001o.kp0;
import p001o.sqi;

@Deprecated
/* loaded from: classes2.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C2238a();

    /* renamed from: a */
    public final String f8650a;

    /* renamed from: b */
    public final String f8651b;

    /* renamed from: androidx.media3.extractor.metadata.flac.VorbisComment$a */
    public class C2238a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.f8650a = kp0.m35996f(str);
        this.f8651b = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void Y1(C2182b.b bVar) {
        String str = this.f8650a;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.m6807O(this.f8651b);
                break;
            case "TITLE":
                bVar.n0(this.f8651b);
                break;
            case "DESCRIPTION":
                bVar.m6814V(this.f8651b);
                break;
            case "ALBUMARTIST":
                bVar.m6806N(this.f8651b);
                break;
            case "ARTIST":
                bVar.m6808P(this.f8651b);
                break;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f8650a.equals(vorbisComment.f8650a) && this.f8651b.equals(vorbisComment.f8651b);
    }

    public int hashCode() {
        return ((527 + this.f8650a.hashCode()) * 31) + this.f8651b.hashCode();
    }

    public String toString() {
        return "VC: " + this.f8650a + "=" + this.f8651b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8650a);
        parcel.writeString(this.f8651b);
    }

    public VorbisComment(Parcel parcel) {
        this.f8650a = (String) sqi.m48729h(parcel.readString());
        this.f8651b = (String) sqi.m48729h(parcel.readString());
    }
}
