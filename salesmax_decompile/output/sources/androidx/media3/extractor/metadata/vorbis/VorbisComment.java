package androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C2264a();

    /* renamed from: androidx.media3.extractor.metadata.vorbis.VorbisComment$a */
    public class C2264a implements Parcelable.Creator {
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
        super(str, str2);
    }

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
