package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p001o.sqi;

/* loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C2248a();

    /* renamed from: b */
    public final int f8688b;

    /* renamed from: c */
    public final int f8689c;

    /* renamed from: d */
    public final int f8690d;

    /* renamed from: e */
    public final int[] f8691e;

    /* renamed from: f */
    public final int[] f8692f;

    /* renamed from: androidx.media3.extractor.metadata.id3.MlltFrame$a */
    public class C2248a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f8688b = i;
        this.f8689c = i2;
        this.f8690d = i3;
        this.f8691e = iArr;
        this.f8692f = iArr2;
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f8688b == mlltFrame.f8688b && this.f8689c == mlltFrame.f8689c && this.f8690d == mlltFrame.f8690d && Arrays.equals(this.f8691e, mlltFrame.f8691e) && Arrays.equals(this.f8692f, mlltFrame.f8692f);
    }

    public int hashCode() {
        return ((((((((527 + this.f8688b) * 31) + this.f8689c) * 31) + this.f8690d) * 31) + Arrays.hashCode(this.f8691e)) * 31) + Arrays.hashCode(this.f8692f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8688b);
        parcel.writeInt(this.f8689c);
        parcel.writeInt(this.f8690d);
        parcel.writeIntArray(this.f8691e);
        parcel.writeIntArray(this.f8692f);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f8688b = parcel.readInt();
        this.f8689c = parcel.readInt();
        this.f8690d = parcel.readInt();
        this.f8691e = (int[]) sqi.m48729h(parcel.createIntArray());
        this.f8692f = (int[]) sqi.m48729h(parcel.createIntArray());
    }
}
