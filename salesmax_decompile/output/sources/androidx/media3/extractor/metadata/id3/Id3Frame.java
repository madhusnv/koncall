package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

/* loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: a */
    public final String f8684a;

    public Id3Frame(String str) {
        this.f8684a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f8684a;
    }
}
