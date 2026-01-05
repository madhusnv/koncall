package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C2242a();

    /* renamed from: b */
    public final byte[] f8665b;

    /* renamed from: androidx.media3.extractor.metadata.id3.BinaryFrame$a */
    public class C2242a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f8665b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f8684a.equals(binaryFrame.f8684a) && Arrays.equals(this.f8665b, binaryFrame.f8665b);
    }

    public int hashCode() {
        return ((527 + this.f8684a.hashCode()) * 31) + Arrays.hashCode(this.f8665b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8684a);
        parcel.writeByteArray(this.f8665b);
    }

    public BinaryFrame(Parcel parcel) {
        super((String) sqi.m48729h(parcel.readString()));
        this.f8665b = (byte[]) sqi.m48729h(parcel.createByteArray());
    }
}
