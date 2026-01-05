package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C2249a();

    /* renamed from: b */
    public final String f8693b;

    /* renamed from: c */
    public final byte[] f8694c;

    /* renamed from: androidx.media3.extractor.metadata.id3.PrivFrame$a */
    public class C2249a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f8693b = str;
        this.f8694c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return sqi.m48724c(this.f8693b, privFrame.f8693b) && Arrays.equals(this.f8694c, privFrame.f8694c);
    }

    public int hashCode() {
        String str = this.f8693b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f8694c);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public String toString() {
        return this.f8684a + ": owner=" + this.f8693b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8693b);
        parcel.writeByteArray(this.f8694c);
    }

    public PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f8693b = (String) sqi.m48729h(parcel.readString());
        this.f8694c = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
