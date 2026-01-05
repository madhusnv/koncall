package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C2244a();

    /* renamed from: b */
    public final String f8672b;

    /* renamed from: c */
    public final boolean f8673c;

    /* renamed from: d */
    public final boolean f8674d;

    /* renamed from: e */
    public final String[] f8675e;

    /* renamed from: f */
    public final Id3Frame[] f8676f;

    /* renamed from: androidx.media3.extractor.metadata.id3.ChapterTocFrame$a */
    public class C2244a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f8672b = str;
        this.f8673c = z;
        this.f8674d = z2;
        this.f8675e = strArr;
        this.f8676f = id3FrameArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f8673c == chapterTocFrame.f8673c && this.f8674d == chapterTocFrame.f8674d && sqi.m48724c(this.f8672b, chapterTocFrame.f8672b) && Arrays.equals(this.f8675e, chapterTocFrame.f8675e) && Arrays.equals(this.f8676f, chapterTocFrame.f8676f);
    }

    public int hashCode() {
        int i = (((527 + (this.f8673c ? 1 : 0)) * 31) + (this.f8674d ? 1 : 0)) * 31;
        String str = this.f8672b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8672b);
        parcel.writeByte(this.f8673c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8674d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f8675e);
        parcel.writeInt(this.f8676f.length);
        for (Id3Frame id3Frame : this.f8676f) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f8672b = (String) sqi.m48729h(parcel.readString());
        this.f8673c = parcel.readByte() != 0;
        this.f8674d = parcel.readByte() != 0;
        this.f8675e = (String[]) sqi.m48729h(parcel.createStringArray());
        int i = parcel.readInt();
        this.f8676f = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f8676f[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
