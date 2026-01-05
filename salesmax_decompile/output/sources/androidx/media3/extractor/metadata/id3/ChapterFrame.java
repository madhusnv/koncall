package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C2243a();

    /* renamed from: b */
    public final String f8666b;

    /* renamed from: c */
    public final int f8667c;

    /* renamed from: d */
    public final int f8668d;

    /* renamed from: e */
    public final long f8669e;

    /* renamed from: f */
    public final long f8670f;

    /* renamed from: g */
    public final Id3Frame[] f8671g;

    /* renamed from: androidx.media3.extractor.metadata.id3.ChapterFrame$a */
    public class C2243a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f8666b = str;
        this.f8667c = i;
        this.f8668d = i2;
        this.f8669e = j;
        this.f8670f = j2;
        this.f8671g = id3FrameArr;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f8667c == chapterFrame.f8667c && this.f8668d == chapterFrame.f8668d && this.f8669e == chapterFrame.f8669e && this.f8670f == chapterFrame.f8670f && sqi.m48724c(this.f8666b, chapterFrame.f8666b) && Arrays.equals(this.f8671g, chapterFrame.f8671g);
    }

    public int hashCode() {
        int i = (((((((527 + this.f8667c) * 31) + this.f8668d) * 31) + ((int) this.f8669e)) * 31) + ((int) this.f8670f)) * 31;
        String str = this.f8666b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8666b);
        parcel.writeInt(this.f8667c);
        parcel.writeInt(this.f8668d);
        parcel.writeLong(this.f8669e);
        parcel.writeLong(this.f8670f);
        parcel.writeInt(this.f8671g.length);
        for (Id3Frame id3Frame : this.f8671g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f8666b = (String) sqi.m48729h(parcel.readString());
        this.f8667c = parcel.readInt();
        this.f8668d = parcel.readInt();
        this.f8669e = parcel.readLong();
        this.f8670f = parcel.readLong();
        int i = parcel.readInt();
        this.f8671g = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f8671g[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
